package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraCpp */
/* loaded from: classes16.dex */
public class C27148x843b2f36 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27148x843b2f36 f59256x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27148x843b2f36();

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27148x843b2f36.Destructor f59257x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraCpp$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59258xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59259xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59260xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraCpp */
        public static native void m111155xe3152501(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111155xe3152501(this.f59258xf042a733, this.f59259xb1c7f9d5, this.f59260xc2e4ffd6);
        }
    }

    private C27148x843b2f36() {
        this.f60636x11bb50fe = "cara.CaraCpp@Get";
        m111152x7d2e2315("cara.CaraCpp@Get", this.f60638xc2e4ffd6);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27148x843b2f36 m111150xa74f78c3(java.lang.String str, java.lang.String str2) {
        return m111151x9cf0d20b();
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27148x843b2f36 m111151x9cf0d20b() {
        return f59256x21169495;
    }

    /* renamed from: jniCreateCaraCpp */
    private native void m111152x7d2e2315(java.lang.String str, java.lang.String str2);

    /* renamed from: jnilaunch */
    private native void m111153x775eaf98(long j17);

    /* renamed from: launch */
    public void m111154xbdd923b3() {
        m111153x775eaf98(this.f60634xf042a733);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27148x843b2f36.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27148x843b2f36.Destructor(this, this.f60634xf042a733);
        this.f59257x5751f3f9 = destructor;
        destructor.f59258xf042a733 = this.f60634xf042a733;
        destructor.f59259xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59260xc2e4ffd6 = this.f60638xc2e4ffd6;
    }
}
