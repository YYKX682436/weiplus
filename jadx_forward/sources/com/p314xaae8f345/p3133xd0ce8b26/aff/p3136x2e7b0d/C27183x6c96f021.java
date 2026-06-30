package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeFinderFeatureCenter */
/* loaded from: classes16.dex */
public class C27183x6c96f021 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27183x6c96f021.Destructor f59546x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeFinderFeatureCenter$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59547xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59548xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59549xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeFinderFeatureCenter */
        public static native void m111604x7fafabac(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111604x7fafabac(this.f59547xf042a733, this.f59548xb1c7f9d5, this.f59549xc2e4ffd6);
        }
    }

    public C27183x6c96f021(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111591xf9b622c0(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27183x6c96f021 m111590xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27183x6c96f021(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeFinderFeatureCenter */
    private native void m111591xf9b622c0(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jniauthIconType */
    private native int m111592xd1acc140(long j17);

    /* renamed from: jnifansCount */
    private native int m111593x4e980f2a(long j17);

    /* renamed from: jnihasFinderAccount */
    private native boolean m111594x7fe62c52(long j17);

    /* renamed from: jniisRealName */
    private native boolean m111595xbfd301f8(long j17);

    /* renamed from: jnipostFeedCount */
    private native int m111596xfdedc1cc(long j17);

    /* renamed from: jniwxPayAuthorization */
    private native boolean m111597x71c7fe17(long j17);

    /* renamed from: authIconType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraFinderContactAuthType m111598xbbc8751b() {
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraFinderContactAuthType.m111333x382ad972(m111592xd1acc140(this.f60634xf042a733));
    }

    /* renamed from: fansCount */
    public int m111599xf2a5612f() {
        return m111593x4e980f2a(this.f60634xf042a733);
    }

    /* renamed from: hasFinderAccount */
    public boolean m111600xcafe7aad() {
        return m111594x7fe62c52(this.f60634xf042a733);
    }

    /* renamed from: isRealName */
    public boolean m111601x9d6ff093() {
        return m111595xbfd301f8(this.f60634xf042a733);
    }

    /* renamed from: postFeedCount */
    public int m111602x57488951() {
        return m111596xfdedc1cc(this.f60634xf042a733);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27183x6c96f021.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27183x6c96f021.Destructor(this, this.f60634xf042a733);
        this.f59546x5751f3f9 = destructor;
        destructor.f59547xf042a733 = this.f60634xf042a733;
        destructor.f59548xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59549xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: wxPayAuthorization */
    public boolean m111603x580621b2() {
        return m111597x71c7fe17(this.f60634xf042a733);
    }

    public C27183x6c96f021() {
        this.f60636x11bb50fe = "cara.CaraNativeFinderFeatureCenter@Create";
        m111591xf9b622c0("cara.CaraNativeFinderFeatureCenter@Create", this.f60638xc2e4ffd6, null);
    }
}
