package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraCppFinderPublishProphet */
/* loaded from: classes15.dex */
public class C27150x2d50c2e1 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27150x2d50c2e1.Destructor f59265x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraCppFinderPublishProphet$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59266xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59267xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59268xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraCppFinderPublishProphet */
        public static native void m111173x5e8e52c(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111173x5e8e52c(this.f59266xf042a733, this.f59267xb1c7f9d5, this.f59268xc2e4ffd6);
        }
    }

    public C27150x2d50c2e1(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111164x638a1140(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27150x2d50c2e1 m111163xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27150x2d50c2e1(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraCppFinderPublishProphet */
    private native void m111164x638a1140(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnipredict */
    private native void m111165x642ca594(long j17, java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2);

    /* renamed from: jnireportThatConsume */
    private native void m111166xb907397c(long j17, java.lang.String str, boolean[] zArr);

    /* renamed from: jnireportThatExpose */
    private native void m111167xf11b2644(long j17, java.lang.String str, java.lang.String[] strArr, boolean[] zArr);

    /* renamed from: jnireportThatPreload */
    private native void m111168x6d54ab89(long j17, java.lang.String str, boolean[] zArr);

    /* renamed from: predict */
    public void m111169xed00b4d9(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27186xd03d8060 c27186xd03d8060, com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27201x8054bfa7 c27201x8054bfa7) {
        m111165x642ca594(this.f60634xf042a733, str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27186xd03d8060), com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27201x8054bfa7));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27150x2d50c2e1.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27150x2d50c2e1.Destructor(this, this.f60634xf042a733);
        this.f59265x5751f3f9 = destructor;
        destructor.f59266xf042a733 = this.f60634xf042a733;
        destructor.f59267xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59268xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: reportThatConsume */
    public void m111170xd0f8b681(java.lang.String str, java.util.Optional<java.lang.Boolean> optional) {
        m111166xb907397c(this.f60634xf042a733, str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119561x43265a60(optional));
    }

    /* renamed from: reportThatExpose */
    public void m111171x3c33749f(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27186xd03d8060 c27186xd03d8060, java.util.Optional<java.lang.Boolean> optional) {
        m111167xf11b2644(this.f60634xf042a733, str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119593x6a52f0b5(c27186xd03d8060), com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119561x43265a60(optional));
    }

    /* renamed from: reportThatPreload */
    public void m111172x8546288e(java.lang.String str, java.util.Optional<java.lang.Boolean> optional) {
        m111168x6d54ab89(this.f60634xf042a733, str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119561x43265a60(optional));
    }

    public C27150x2d50c2e1() {
        this.f60636x11bb50fe = "cara.CaraCppFinderPublishProphet@Create";
        m111164x638a1140("cara.CaraCppFinderPublishProphet@Create", this.f60638xc2e4ffd6, null);
    }
}
