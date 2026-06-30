package com.p314xaae8f345.p2841xd11c237d.app;

/* renamed from: com.tencent.paymars.app.Context */
/* loaded from: classes12.dex */
public class C23011x9befcd8f {
    protected static final java.lang.String TAG = "MicroMsg.MMContext";

    /* renamed from: nativeHandle */
    protected long f40083x7b5cfd1f = 0;

    /* renamed from: interfaceMap */
    protected com.p314xaae8f345.p2841xd11c237d.app.C23010xded810f3 f40082x53928963 = new com.p314xaae8f345.p2841xd11c237d.app.C23010xded810f3();

    public C23011x9befcd8f(java.lang.String str) {
        m84266xb4a9318d(str);
    }

    /* renamed from: OnJniAddManager */
    public native void m84265x345cf192(java.lang.String str, java.lang.Object obj);

    /* renamed from: OnJniCreateContext */
    public native void m84266xb4a9318d(java.lang.String str);

    /* renamed from: OnJniCreateContextFromHandle */
    public native void m84267x6135cbdf(long j17);

    /* renamed from: OnJniDestroyContext */
    public native void m84268xd3d1571b();

    /* renamed from: OnJniGetContextId */
    public native java.lang.String m84269x9c8930ba();

    /* renamed from: OnJniGetManager */
    public native long m84270x6cd53d(java.lang.String str);

    /* renamed from: OnJniInit */
    public native int m84271x700c3b56();

    /* renamed from: OnJniRemoveManager */
    public native void m84272x6f15ab03(java.lang.String str, java.lang.Object obj);

    /* renamed from: OnJniUnInit */
    public native int m84273xb256500f();

    /* renamed from: addManager */
    public <T> void m84274xa38667cc(java.lang.Class<T> cls, com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c abstractC23009x1e602b7c) {
        if (abstractC23009x1e602b7c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mars2 addManager fail. empty manager. clazz:%s", cls.getName());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "mars2 addManager clazz:%s", cls.getName());
        m84265x345cf192(cls.getName(), abstractC23009x1e602b7c);
        this.f40082x53928963.put(abstractC23009x1e602b7c.mo84241xdc4f8f95(), abstractC23009x1e602b7c);
    }

    /* renamed from: getContextId */
    public java.lang.String m84275xe72e0074() {
        return m84269x9c8930ba();
    }

    /* renamed from: getManager */
    public <T extends com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c> T m84276x6f964b77(java.lang.Class<T> cls) {
        cls.getName();
        java.lang.Object m84264x4c58b7eb = this.f40082x53928963.m84264x4c58b7eb(m84270x6cd53d(cls.getName()), cls.getName());
        if (m84264x4c58b7eb != null) {
            return (T) m84264x4c58b7eb;
        }
        return null;
    }

    /* renamed from: getNativeHandle */
    public long m84277xdc4f8f95() {
        return this.f40083x7b5cfd1f;
    }

    /* renamed from: init */
    public int m84278x316510() {
        return m84271x700c3b56();
    }

    /* renamed from: onDestroy */
    public void m84279xac79a11b() {
        m84268xd3d1571b();
        this.f40083x7b5cfd1f = -1L;
    }

    /* renamed from: removeManager */
    public <T> void m84280x790ad289(java.lang.Class<T> cls, com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c abstractC23009x1e602b7c) {
        if (abstractC23009x1e602b7c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mars2 removeManager fail. empty manager. clazz:%s", cls.getName());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "mars2 removeManager clazz:%s", cls.getName());
        m84272x6f15ab03(cls.getName(), abstractC23009x1e602b7c);
        this.f40082x53928963.m84263xb06685ab(abstractC23009x1e602b7c);
    }

    /* renamed from: unInit */
    public int m84281xcdd7f349() {
        return m84273xb256500f();
    }

    public C23011x9befcd8f(long j17) {
        m84267x6135cbdf(j17);
    }
}
