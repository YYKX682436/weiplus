package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraCppLiveFeatureCenter */
/* loaded from: classes15.dex */
public class C27153x10a6a4c9 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27153x10a6a4c9.Destructor f59277x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraCppLiveFeatureCenter$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59278xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59279xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59280xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraCppLiveFeatureCenter */
        public static native void m111210x9c039e5e(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111210x9c039e5e(this.f59278xf042a733, this.f59279xb1c7f9d5, this.f59280xc2e4ffd6);
        }
    }

    public C27153x10a6a4c9(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111199x8eac0aca(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27153x10a6a4c9 m111198xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27153x10a6a4c9(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraCppLiveFeatureCenter */
    private native void m111199x8eac0aca(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnireportThatCellConsume */
    private native void m111200x2c2d95ba(long j17);

    /* renamed from: jnireportThatCellExpose */
    private native void m111201x91b94a46(long j17);

    /* renamed from: jnireportThatReddotConsume */
    private native void m111202x20a54f44(long j17, java.lang.String str, java.lang.String str2, float[] fArr);

    /* renamed from: jnireportThatReddotExpose */
    private native void m111203x25ff377c(long j17, java.lang.String str, java.lang.String str2, float[] fArr);

    /* renamed from: jnisetUserActiveLevel */
    private native void m111204x675de6f6(long j17, int i17);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27153x10a6a4c9.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27153x10a6a4c9.Destructor(this, this.f60634xf042a733);
        this.f59277x5751f3f9 = destructor;
        destructor.f59278xf042a733 = this.f60634xf042a733;
        destructor.f59279xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59280xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: reportThatCellConsume */
    public void m111205xc55f083f() {
        m111200x2c2d95ba(this.f60634xf042a733);
    }

    /* renamed from: reportThatCellExpose */
    public void m111206xe0fcf321() {
        m111201x91b94a46(this.f60634xf042a733);
    }

    /* renamed from: reportThatReddotConsume */
    public void m111207x33443489(java.lang.String str, java.lang.String str2, java.util.Optional<java.lang.Float> optional) {
        m111202x20a54f44(this.f60634xf042a733, str, str2, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119586x8c1652ac(optional));
    }

    /* renamed from: reportThatReddotExpose */
    public void m111208xb2fc1597(java.lang.String str, java.lang.String str2, java.util.Optional<java.lang.Float> optional) {
        m111203x25ff377c(this.f60634xf042a733, str, str2, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119586x8c1652ac(optional));
    }

    /* renamed from: setUserActiveLevel */
    public void m111209x4d9c0a91(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraLiveUserActiveLevel caraLiveUserActiveLevel) {
        m111204x675de6f6(this.f60634xf042a733, caraLiveUserActiveLevel.mo20656x276ffe3f());
    }

    public C27153x10a6a4c9() {
        this.f60636x11bb50fe = "cara.CaraCppLiveFeatureCenter@Create";
        m111199x8eac0aca("cara.CaraCppLiveFeatureCenter@Create", this.f60638xc2e4ffd6, null);
    }
}
