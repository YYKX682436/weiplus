package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenter */
/* loaded from: classes16.dex */
public class C27160x25a24982 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27160x25a24982.Destructor f59514x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenter$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59515xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59516xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59517xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeAccountFeatureCenter */
        public static native void m111482x75a0ff57(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111482x75a0ff57(this.f59515xf042a733, this.f59516xb1c7f9d5, this.f59517xc2e4ffd6);
        }
    }

    public C27160x25a24982(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111473x3c696ac3(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27160x25a24982 m111472xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27160x25a24982(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeAccountFeatureCenter */
    private native void m111473x3c696ac3(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnidiscoverTab */
    private native byte[] m111474xb3a7627(long j17);

    /* renamed from: jnigender */
    private native int m111475x6f0b7ea6(long j17);

    /* renamed from: jniisRegisteredInChina */
    private native boolean m111476x77958681(long j17);

    /* renamed from: jnimomentPrivacy */
    private native int m111477x68b931e3(long j17);

    /* renamed from: discoverTab */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraAccountDiscoverTab m111478xe13b5aec() {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraAccountDiscoverTab) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119640x815a2f5(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraAccountDiscoverTab.m111260x7c90cfc0(), m111474xb3a7627(this.f60634xf042a733));
    }

    /* renamed from: gender */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraGender m111479xb585f2c1() {
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraGender.m111369x382ad972(m111475x6f0b7ea6(this.f60634xf042a733));
    }

    /* renamed from: isRegisteredInChina */
    public boolean m111480x591bd646() {
        return m111476x77958681(this.f60634xf042a733);
    }

    /* renamed from: momentPrivacy */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraMomentPrivacy m111481xc213f968() {
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraMomentPrivacy.m111405x382ad972(m111477x68b931e3(this.f60634xf042a733));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27160x25a24982.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27160x25a24982.Destructor(this, this.f60634xf042a733);
        this.f59514x5751f3f9 = destructor;
        destructor.f59515xf042a733 = this.f60634xf042a733;
        destructor.f59516xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59517xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    public C27160x25a24982() {
        this.f60636x11bb50fe = "cara.CaraNativeAccountFeatureCenter@Create";
        m111473x3c696ac3("cara.CaraNativeAccountFeatureCenter@Create", this.f60638xc2e4ffd6, null);
    }
}
