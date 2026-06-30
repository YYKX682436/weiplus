package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraCppLiveReddotProphet */
/* loaded from: classes15.dex */
public class C27154x8e8487a extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27154x8e8487a.Destructor f59281x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraCppLiveReddotProphet$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59282xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59283xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59284xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraCppLiveReddotProphet */
        public static native void m111221x9445420f(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111221x9445420f(this.f59282xf042a733, this.f59283xb1c7f9d5, this.f59284xc2e4ffd6);
        }
    }

    public C27154x8e8487a(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111212x86edae7b(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27154x8e8487a m111211xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27154x8e8487a(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraCppLiveReddotProphet */
    private native void m111212x86edae7b(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnipredict */
    private native void m111213x642ca594(long j17, java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2);

    /* renamed from: jnireportThatPreload */
    private native void m111214x6d54ab89(long j17, java.lang.String str, boolean[] zArr);

    /* renamed from: jnireportThatReddotConsume */
    private native void m111215x20a54f44(long j17, java.lang.String str, boolean[] zArr);

    /* renamed from: jnireportThatReddotExpose */
    private native void m111216x25ff377c(long j17, java.lang.String str, boolean[] zArr, java.lang.String[] strArr);

    /* renamed from: predict */
    public void m111217xed00b4d9(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27198xce3a2443 c27198xce3a2443, com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27201x8054bfa7 c27201x8054bfa7) {
        m111213x642ca594(this.f60634xf042a733, str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27198xce3a2443), com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27201x8054bfa7));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27154x8e8487a.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27154x8e8487a.Destructor(this, this.f60634xf042a733);
        this.f59281x5751f3f9 = destructor;
        destructor.f59282xf042a733 = this.f60634xf042a733;
        destructor.f59283xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59284xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: reportThatPreload */
    public void m111218x8546288e(java.lang.String str, java.util.Optional<java.lang.Boolean> optional) {
        m111214x6d54ab89(this.f60634xf042a733, str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119561x43265a60(optional));
    }

    /* renamed from: reportThatReddotConsume */
    public void m111219x33443489(java.lang.String str, java.util.Optional<java.lang.Boolean> optional) {
        m111215x20a54f44(this.f60634xf042a733, str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119561x43265a60(optional));
    }

    /* renamed from: reportThatReddotExpose */
    public void m111220xb2fc1597(java.lang.String str, java.util.Optional<java.lang.Boolean> optional, com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27198xce3a2443 c27198xce3a2443) {
        m111216x25ff377c(this.f60634xf042a733, str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119561x43265a60(optional), com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27198xce3a2443));
    }

    public C27154x8e8487a() {
        this.f60636x11bb50fe = "cara.CaraCppLiveReddotProphet@Create";
        m111212x86edae7b("cara.CaraCppLiveReddotProphet@Create", this.f60638xc2e4ffd6, null);
    }
}
