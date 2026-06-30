package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenter */
/* loaded from: classes16.dex */
public class C27177x80f52e19 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27177x80f52e19.Destructor f59536x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenter$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59537xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59538xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59539xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeDiscoverViewFeatureCenter */
        public static native void m111574xc857d564(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111574xc857d564(this.f59537xf042a733, this.f59538xb1c7f9d5, this.f59539xc2e4ffd6);
        }
    }

    public C27177x80f52e19(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111549x4d65ad78(str, str2, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27177x80f52e19 m111548xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27177x80f52e19(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeDiscoverViewFeatureCenter */
    private native void m111549x4d65ad78(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnianchorOfBadgeAtLiveCell */
    private native java.lang.String m111550x9a618773(long j17);

    /* renamed from: jnibadgeAtChannelsCell */
    private native boolean m111551x7f3de3e3(long j17);

    /* renamed from: jnibadgeAtDiscover */
    private native boolean m111552xd8ee92fa(long j17);

    /* renamed from: jnibadgeAtLiveCell */
    private native boolean m111553x1d1e737f(long j17);

    /* renamed from: jnibadgeAtMomentsCell */
    private native boolean m111554xaf6e09c4(long j17);

    /* renamed from: jnibadgeAtTopStoriesCell */
    private native boolean m111555x952f611(long j17);

    /* renamed from: jnititleOfBadgeAtLiveCell */
    private native java.lang.String m111556xed1f095a(long j17);

    /* renamed from: jniunreadAtChannelsCell */
    private native int m111557x4d875dd9(long j17);

    /* renamed from: jniunreadAtDiscover */
    private native int m111558x74bf77f0(long j17);

    /* renamed from: jniunreadAtLiveCell */
    private native int m111559xb8ef5875(long j17);

    /* renamed from: jniunreadAtMomentsCell */
    private native int m111560x29b2790e(long j17);

    /* renamed from: jniunreadAtTopStoriesCell */
    private native int m111561x6b25ca87(long j17);

    /* renamed from: anchorOfBadgeAtLiveCell */
    public java.lang.String m111562xad006cb8() {
        return m111550x9a618773(this.f60634xf042a733);
    }

    /* renamed from: badgeAtChannelsCell */
    public boolean m111563x60c433a8() {
        return m111551x7f3de3e3(this.f60634xf042a733);
    }

    /* renamed from: badgeAtDiscover */
    public boolean m111564x46b58d3f() {
        return m111552xd8ee92fa(this.f60634xf042a733);
    }

    /* renamed from: badgeAtLiveCell */
    public boolean m111565x8ae56dc4() {
        return m111553x1d1e737f(this.f60634xf042a733);
    }

    /* renamed from: badgeAtMomentsCell */
    public boolean m111566x95ac2d5f() {
        return m111554xaf6e09c4(this.f60634xf042a733);
    }

    /* renamed from: badgeAtTopStoriesCell */
    public boolean m111567xa2846896() {
        return m111555x952f611(this.f60634xf042a733);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27177x80f52e19.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27177x80f52e19.Destructor(this, this.f60634xf042a733);
        this.f59536x5751f3f9 = destructor;
        destructor.f59537xf042a733 = this.f60634xf042a733;
        destructor.f59538xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59539xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: titleOfBadgeAtLiveCell */
    public java.lang.String m111568x7a1be775() {
        return m111556xed1f095a(this.f60634xf042a733);
    }

    /* renamed from: unreadAtChannelsCell */
    public int m111569x9ccb06b4() {
        return m111557x4d875dd9(this.f60634xf042a733);
    }

    /* renamed from: unreadAtDiscover */
    public int m111570xbfd7c64b() {
        return m111558x74bf77f0(this.f60634xf042a733);
    }

    /* renamed from: unreadAtLiveCell */
    public int m111571x407a6d0() {
        return m111559xb8ef5875(this.f60634xf042a733);
    }

    /* renamed from: unreadAtMomentsCell */
    public int m111572xb38c8d3() {
        return m111560x29b2790e(this.f60634xf042a733);
    }

    /* renamed from: unreadAtTopStoriesCell */
    public int m111573xf822a8a2() {
        return m111561x6b25ca87(this.f60634xf042a733);
    }

    public C27177x80f52e19() {
        this.f60636x11bb50fe = "cara.CaraNativeDiscoverViewFeatureCenter@Create";
        m111549x4d65ad78("cara.CaraNativeDiscoverViewFeatureCenter@Create", this.f60638xc2e4ffd6, null);
    }
}
