package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeLiveReddotProphetContext */
/* loaded from: classes16.dex */
public class C27198xce3a2443 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27198xce3a2443.Destructor f59571x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeLiveReddotProphetContext$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59572xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59573xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59574xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeLiveReddotProphetContext */
        public static native void m111800xf18fe798(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111800xf18fe798(this.f59572xf042a733, this.f59573xb1c7f9d5, this.f59574xc2e4ffd6);
        }
    }

    public C27198xce3a2443(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27199x2057c5b4 interfaceC27199x2057c5b4) {
        this.f60636x11bb50fe = "cara.CaraNativeLiveReddotProphetContext@Attach";
        m111785xfe1cbd04("cara.CaraNativeLiveReddotProphetContext@Attach", this.f60638xc2e4ffd6, interfaceC27199x2057c5b4);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27198xce3a2443 m111784xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27198xce3a2443(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeLiveReddotProphetContext */
    private native void m111785xfe1cbd04(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnianchor */
    private native java.lang.String m111786x65484e9a(long j17);

    /* renamed from: jnienterAction */
    private native int m111787xdbc0a69(long j17);

    /* renamed from: jniisHomePageLoaded */
    private native boolean m111788x44a4d722(long j17);

    /* renamed from: jniisReddotScoreValid */
    private native boolean m111789xb25bdb71(long j17);

    /* renamed from: jnipredictProbThreshold */
    private native float m111790x6f288b62(long j17);

    /* renamed from: jnipreloadControlFlag */
    private native int m111791x39b20905(long j17);

    /* renamed from: jnireddotScore */
    private native float m111792x12076195(long j17);

    /* renamed from: anchor */
    public java.lang.String m111793xabc2c2b5() {
        return m111786x65484e9a(this.f60634xf042a733);
    }

    /* renamed from: enterAction */
    public int m111794xe3bcef2e() {
        return m111787xdbc0a69(this.f60634xf042a733);
    }

    /* renamed from: isHomePageLoaded */
    public boolean m111795x8fbd257d() {
        return m111788x44a4d722(this.f60634xf042a733);
    }

    /* renamed from: isReddotScoreValid */
    public boolean m111796x9899ff0c() {
        return m111789xb25bdb71(this.f60634xf042a733);
    }

    /* renamed from: predictProbThreshold */
    public float m111797xbe6c343d() {
        return m111790x6f288b62(this.f60634xf042a733);
    }

    /* renamed from: preloadControlFlag */
    public int m111798x1ff02ca0() {
        return m111791x39b20905(this.f60634xf042a733);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27198xce3a2443.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27198xce3a2443.Destructor(this, this.f60634xf042a733);
        this.f59571x5751f3f9 = destructor;
        destructor.f59572xf042a733 = this.f60634xf042a733;
        destructor.f59573xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59574xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: reddotScore */
    public float m111799xe808465a() {
        return m111792x12076195(this.f60634xf042a733);
    }

    public C27198xce3a2443(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111785xfe1cbd04(str, str2, null);
    }
}
