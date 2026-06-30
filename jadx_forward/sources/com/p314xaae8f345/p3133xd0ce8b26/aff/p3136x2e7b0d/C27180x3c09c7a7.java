package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeFeatureCenter */
/* loaded from: classes16.dex */
public class C27180x3c09c7a7 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27180x3c09c7a7.Destructor f59541x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeFeatureCenter$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59542xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59543xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59544xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeFeatureCenter */
        public static native void m111589x510cc772(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111589x510cc772(this.f59542xf042a733, this.f59543xb1c7f9d5, this.f59544xc2e4ffd6);
        }
    }

    public C27180x3c09c7a7(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111588x92af1d86(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27180x3c09c7a7 m111587xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27180x3c09c7a7(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeFeatureCenter */
    private native void m111588x92af1d86(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27180x3c09c7a7.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27180x3c09c7a7.Destructor(this, this.f60634xf042a733);
        this.f59541x5751f3f9 = destructor;
        destructor.f59542xf042a733 = this.f60634xf042a733;
        destructor.f59543xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59544xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    public C27180x3c09c7a7() {
        this.f60636x11bb50fe = "cara.CaraNativeFeatureCenter@Create";
        m111588x92af1d86("cara.CaraNativeFeatureCenter@Create", this.f60638xc2e4ffd6, null);
    }
}
