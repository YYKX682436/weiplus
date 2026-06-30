package com.p314xaae8f345.p542x3306d5.app;

/* renamed from: com.tencent.mars.app.Context */
/* loaded from: classes12.dex */
public class C4443x9befcd8f {
    protected static final java.lang.String TAG = "MicroMsg.MMContext";

    /* renamed from: nativeHandle */
    protected long f17602x7b5cfd1f = 0;

    /* renamed from: interfaceMap */
    protected com.p314xaae8f345.p542x3306d5.app.C4442xded810f3 f17601x53928963 = new com.p314xaae8f345.p542x3306d5.app.C4442xded810f3();

    public C4443x9befcd8f(java.lang.String str) {
        m37609xb4a9318d(str);
    }

    /* renamed from: OnJniAddManager */
    public native void m37608x345cf192(java.lang.String str, java.lang.Object obj);

    /* renamed from: OnJniCreateContext */
    public native void m37609xb4a9318d(java.lang.String str);

    /* renamed from: OnJniCreateContextFromHandle */
    public native void m37610x6135cbdf(long j17);

    /* renamed from: OnJniDestroyContext */
    public native void m37611xd3d1571b();

    /* renamed from: OnJniGetContextId */
    public native java.lang.String m37612x9c8930ba();

    /* renamed from: OnJniGetManager */
    public native long m37613x6cd53d(java.lang.String str);

    /* renamed from: OnJniInit */
    public native int m37614x700c3b56();

    /* renamed from: OnJniRemoveManager */
    public native void m37615x6f15ab03(java.lang.String str, java.lang.Object obj);

    /* renamed from: OnJniUnInit */
    public native int m37616xb256500f();

    /* renamed from: addManager */
    public <T> void m37617xa38667cc(java.lang.Class<T> cls, com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c abstractC4441x1e602b7c) {
        if (abstractC4441x1e602b7c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mars2 addManager fail. empty manager. clazz:%s", cls.getName());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "mars2 addManager clazz:%s", cls.getName());
        m37608x345cf192(cls.getName(), abstractC4441x1e602b7c);
        this.f17601x53928963.put(abstractC4441x1e602b7c.mo37556xdc4f8f95(), abstractC4441x1e602b7c);
    }

    /* renamed from: getContextId */
    public java.lang.String m37618xe72e0074() {
        return m37612x9c8930ba();
    }

    /* renamed from: getManager */
    public <T extends com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c> T m37619x6f964b77(java.lang.Class<T> cls) {
        cls.getName();
        java.lang.Object m37607x4c58b7eb = this.f17601x53928963.m37607x4c58b7eb(m37613x6cd53d(cls.getName()), cls.getName());
        if (m37607x4c58b7eb != null) {
            return (T) m37607x4c58b7eb;
        }
        return null;
    }

    /* renamed from: getNativeHandle */
    public long m37620xdc4f8f95() {
        return this.f17602x7b5cfd1f;
    }

    /* renamed from: init */
    public int m37621x316510() {
        return m37614x700c3b56();
    }

    /* renamed from: onDestroy */
    public void m37622xac79a11b() {
        m37611xd3d1571b();
        this.f17602x7b5cfd1f = -1L;
    }

    /* renamed from: removeManager */
    public <T> void m37623x790ad289(java.lang.Class<T> cls, com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c abstractC4441x1e602b7c) {
        if (abstractC4441x1e602b7c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mars2 removeManager fail. empty manager. clazz:%s", cls.getName());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "mars2 removeManager clazz:%s", cls.getName());
        m37615x6f15ab03(cls.getName(), abstractC4441x1e602b7c);
        this.f17601x53928963.m37606xb06685ab(abstractC4441x1e602b7c);
    }

    /* renamed from: unInit */
    public int m37624xcdd7f349() {
        return m37616xb256500f();
    }

    public C4443x9befcd8f(long j17) {
        m37610x6135cbdf(j17);
    }
}
