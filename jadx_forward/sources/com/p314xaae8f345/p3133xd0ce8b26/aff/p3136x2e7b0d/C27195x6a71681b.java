package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeLiveFeatureCenter */
/* loaded from: classes16.dex */
public class C27195x6a71681b extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27195x6a71681b.Destructor f59566x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeLiveFeatureCenter$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59567xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59568xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59569xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeLiveFeatureCenter */
        public static native void m111782x43098a66(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111782x43098a66(this.f59567xf042a733, this.f59568xb1c7f9d5, this.f59569xc2e4ffd6);
        }
    }

    public C27195x6a71681b(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111779xa0aab67a(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27195x6a71681b m111778xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27195x6a71681b(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeLiveFeatureCenter */
    private native void m111779xa0aab67a(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnicurrentNetworkQuality */
    private native int m111780x3e6c5e45(long j17);

    /* renamed from: currentNetworkQuality */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraLiveNetworkQuality m111781xd79dd0ca() {
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraLiveNetworkQuality.m111378x382ad972(m111780x3e6c5e45(this.f60634xf042a733));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27195x6a71681b.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27195x6a71681b.Destructor(this, this.f60634xf042a733);
        this.f59566x5751f3f9 = destructor;
        destructor.f59567xf042a733 = this.f60634xf042a733;
        destructor.f59568xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59569xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    public C27195x6a71681b() {
        this.f60636x11bb50fe = "cara.CaraNativeLiveFeatureCenter@Create";
        m111779xa0aab67a("cara.CaraNativeLiveFeatureCenter@Create", this.f60638xc2e4ffd6, null);
    }
}
