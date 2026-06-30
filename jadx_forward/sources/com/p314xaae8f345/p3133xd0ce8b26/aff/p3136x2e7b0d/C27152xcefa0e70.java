package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraCppLiveCellProphet */
/* loaded from: classes15.dex */
public class C27152xcefa0e70 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27152xcefa0e70.Destructor f59273x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraCppLiveCellProphet$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59274xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59275xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59276xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraCppLiveCellProphet */
        public static native void m111197x3b026945(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111197x3b026945(this.f59274xf042a733, this.f59275xb1c7f9d5, this.f59276xc2e4ffd6);
        }
    }

    public C27152xcefa0e70(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111188x877300b1(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27152xcefa0e70 m111187xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27152xcefa0e70(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraCppLiveCellProphet */
    private native void m111188x877300b1(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnipredict */
    private native void m111189x642ca594(long j17, java.lang.String[] strArr, java.lang.String[] strArr2);

    /* renamed from: jnireportThatCellConsume */
    private native void m111190x2c2d95ba(long j17, boolean[] zArr);

    /* renamed from: jnireportThatCellExpose */
    private native void m111191x91b94a46(long j17, boolean[] zArr, java.lang.String[] strArr);

    /* renamed from: jnireportThatPreload */
    private native void m111192x6d54ab89(long j17, boolean[] zArr);

    /* renamed from: predict */
    public void m111193xed00b4d9(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27192x2412210d c27192x2412210d, com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27201x8054bfa7 c27201x8054bfa7) {
        m111189x642ca594(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27192x2412210d), com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27201x8054bfa7));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27152xcefa0e70.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27152xcefa0e70.Destructor(this, this.f60634xf042a733);
        this.f59273x5751f3f9 = destructor;
        destructor.f59274xf042a733 = this.f60634xf042a733;
        destructor.f59275xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59276xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: reportThatCellConsume */
    public void m111194xc55f083f(java.util.Optional<java.lang.Boolean> optional) {
        m111190x2c2d95ba(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119561x43265a60(optional));
    }

    /* renamed from: reportThatCellExpose */
    public void m111195xe0fcf321(java.util.Optional<java.lang.Boolean> optional, com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27192x2412210d c27192x2412210d) {
        m111191x91b94a46(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119561x43265a60(optional), com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27192x2412210d));
    }

    /* renamed from: reportThatPreload */
    public void m111196x8546288e(java.util.Optional<java.lang.Boolean> optional) {
        m111192x6d54ab89(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119561x43265a60(optional));
    }

    public C27152xcefa0e70() {
        this.f60636x11bb50fe = "cara.CaraCppLiveCellProphet@Create";
        m111188x877300b1("cara.CaraCppLiveCellProphet@Create", this.f60638xc2e4ffd6, null);
    }
}
