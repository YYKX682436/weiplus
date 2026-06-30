package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraCppJoinLiveQualityProphet */
/* loaded from: classes15.dex */
public class C27151x2e235c81 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27151x2e235c81.Destructor f59269x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraCppJoinLiveQualityProphet$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59270xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59271xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59272xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraCppJoinLiveQualityProphet */
        public static native void m111186x413c180c(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111186x413c180c(this.f59270xf042a733, this.f59271xb1c7f9d5, this.f59272xc2e4ffd6);
        }
    }

    public C27151x2e235c81(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111175xbb428f20(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27151x2e235c81 m111174xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27151x2e235c81(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraCppJoinLiveQualityProphet */
    private native void m111175xbb428f20(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnigetPrediction */
    private native byte[] m111176xda1cf900(long j17);

    /* renamed from: jnireportThatJoinLive */
    private native void m111177x3626cfb6(long j17, boolean[] zArr, java.lang.String[] strArr);

    /* renamed from: jnireportThatLiveRoomLag */
    private native void m111178x4669f9ab(long j17, boolean[] zArr, java.lang.String[] strArr);

    /* renamed from: jnistartPredict */
    private native void m111179xfae1823c(long j17);

    /* renamed from: jnistopPredict */
    private native void m111180xca6bb9b2(long j17);

    /* renamed from: getPrediction */
    public java.util.Optional<com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27210x65bc1541.CaraPredictionPositive> m111181x3377c085() {
        return com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119621xc5bcab7b(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27210x65bc1541.CaraPredictionPositive.m111840x7c90cfc0(), m111176xda1cf900(this.f60634xf042a733));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27151x2e235c81.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27151x2e235c81.Destructor(this, this.f60634xf042a733);
        this.f59269x5751f3f9 = destructor;
        destructor.f59270xf042a733 = this.f60634xf042a733;
        destructor.f59271xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59272xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: reportThatJoinLive */
    public void m111182x1c64f351(java.util.Optional<java.lang.Boolean> optional, com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27189x43bae640 c27189x43bae640) {
        m111177x3626cfb6(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119561x43265a60(optional), com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27189x43bae640));
    }

    /* renamed from: reportThatLiveRoomLag */
    public void m111183xdf9b6c30(java.util.Optional<java.lang.Boolean> optional, com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27189x43bae640 c27189x43bae640) {
        m111178x4669f9ab(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119561x43265a60(optional), com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27189x43bae640));
    }

    /* renamed from: startPredict */
    public void m111184xe4fd3617() {
        m111179xfae1823c(this.f60634xf042a733);
    }

    /* renamed from: stopPredict */
    public void m111185xa06c9e77() {
        m111180xca6bb9b2(this.f60634xf042a733);
    }

    public C27151x2e235c81() {
        this.f60636x11bb50fe = "cara.CaraCppJoinLiveQualityProphet@Create";
        m111175xbb428f20("cara.CaraCppJoinLiveQualityProphet@Create", this.f60638xc2e4ffd6, null);
    }
}
