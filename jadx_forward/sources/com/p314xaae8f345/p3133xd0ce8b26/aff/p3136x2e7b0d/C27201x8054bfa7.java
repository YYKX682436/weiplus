package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallback */
/* loaded from: classes15.dex */
public class C27201x8054bfa7 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27201x8054bfa7.Destructor f59576x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallback$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59577xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59578xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59579xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeProphetPredictPositiveCallback */
        public static native void m111819xff7def3c(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111819xff7def3c(this.f59577xf042a733, this.f59578xb1c7f9d5, this.f59579xc2e4ffd6);
        }
    }

    public C27201x8054bfa7(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27202xc32e0f18 interfaceC27202xc32e0f18) {
        this.f60636x11bb50fe = "cara.CaraNativeProphetPredictPositiveCallback@Attach";
        m111816x537803a8("cara.CaraNativeProphetPredictPositiveCallback@Attach", this.f60638xc2e4ffd6, interfaceC27202xc32e0f18);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27201x8054bfa7 m111815xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27201x8054bfa7(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeProphetPredictPositiveCallback */
    private native void m111816x537803a8(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jniinvoke */
    private native void m111817x72f7d05d(long j17, byte[] bArr);

    /* renamed from: invoke */
    public void m111818xb9724478(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27210x65bc1541.CaraPredictionPositive caraPredictionPositive) {
        m111817x72f7d05d(this.f60634xf042a733, caraPredictionPositive.mo20648x5f01b1f6());
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27201x8054bfa7.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27201x8054bfa7.Destructor(this, this.f60634xf042a733);
        this.f59576x5751f3f9 = destructor;
        destructor.f59577xf042a733 = this.f60634xf042a733;
        destructor.f59578xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59579xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    public C27201x8054bfa7(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111816x537803a8(str, str2, null);
    }
}
