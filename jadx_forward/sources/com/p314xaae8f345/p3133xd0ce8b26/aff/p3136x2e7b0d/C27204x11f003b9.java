package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeSessionFeatureCenter */
/* loaded from: classes16.dex */
public class C27204x11f003b9 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27204x11f003b9.Destructor f59581x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeSessionFeatureCenter$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59582xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59583xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59584xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeSessionFeatureCenter */
        public static native void m111824x61eeb98e(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111824x61eeb98e(this.f59582xf042a733, this.f59583xb1c7f9d5, this.f59584xc2e4ffd6);
        }
    }

    public C27204x11f003b9(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111823x28b724fa(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27204x11f003b9 m111822xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27204x11f003b9(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeSessionFeatureCenter */
    private native void m111823x28b724fa(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27204x11f003b9.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27204x11f003b9.Destructor(this, this.f60634xf042a733);
        this.f59581x5751f3f9 = destructor;
        destructor.f59582xf042a733 = this.f60634xf042a733;
        destructor.f59583xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59584xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    public C27204x11f003b9() {
        this.f60636x11bb50fe = "cara.CaraNativeSessionFeatureCenter@Create";
        m111823x28b724fa("cara.CaraNativeSessionFeatureCenter@Create", this.f60638xc2e4ffd6, null);
    }
}
