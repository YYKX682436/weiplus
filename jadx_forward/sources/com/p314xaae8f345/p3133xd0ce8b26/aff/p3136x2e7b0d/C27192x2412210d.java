package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContext */
/* loaded from: classes16.dex */
public class C27192x2412210d extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27192x2412210d.Destructor f59561x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContext$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59562xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59563xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59564xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeLiveCellProphetContext */
        public static native void m111771x6f3ab5a2(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111771x6f3ab5a2(this.f59562xf042a733, this.f59563xb1c7f9d5, this.f59564xc2e4ffd6);
        }
    }

    public C27192x2412210d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27193x9cf04d7e interfaceC27193x9cf04d7e) {
        this.f60636x11bb50fe = "cara.CaraNativeLiveCellProphetContext@Attach";
        m111764xa595f60e("cara.CaraNativeLiveCellProphetContext@Attach", this.f60638xc2e4ffd6, interfaceC27193x9cf04d7e);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27192x2412210d m111763xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27192x2412210d(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeLiveCellProphetContext */
    private native void m111764xa595f60e(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jniisHomePageLoaded */
    private native boolean m111765x44a4d722(long j17);

    /* renamed from: jniisInHomePage */
    private native boolean m111766x65b40942(long j17);

    /* renamed from: jnipredictProbThreshold */
    private native float m111767x6f288b62(long j17);

    /* renamed from: isHomePageLoaded */
    public boolean m111768x8fbd257d() {
        return m111765x44a4d722(this.f60634xf042a733);
    }

    /* renamed from: isInHomePage */
    public boolean m111769x4fcfbd1d() {
        return m111766x65b40942(this.f60634xf042a733);
    }

    /* renamed from: predictProbThreshold */
    public float m111770xbe6c343d() {
        return m111767x6f288b62(this.f60634xf042a733);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27192x2412210d.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27192x2412210d.Destructor(this, this.f60634xf042a733);
        this.f59561x5751f3f9 = destructor;
        destructor.f59562xf042a733 = this.f60634xf042a733;
        destructor.f59563xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59564xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    public C27192x2412210d(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111764xa595f60e(str, str2, null);
    }
}
