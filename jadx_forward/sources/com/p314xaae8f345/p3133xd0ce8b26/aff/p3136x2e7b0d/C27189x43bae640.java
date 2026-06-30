package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeJoinLiveQualityProphetContext */
/* loaded from: classes16.dex */
public class C27189x43bae640 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27189x43bae640.Destructor f59556x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeJoinLiveQualityProphetContext$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59557xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59558xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59559xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeJoinLiveQualityProphetContext */
        public static native void m111754x3f92f00b(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111754x3f92f00b(this.f59557xf042a733, this.f59558xb1c7f9d5, this.f59559xc2e4ffd6);
        }
    }

    public C27189x43bae640(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27190x837d4131 interfaceC27190x837d4131) {
        this.f60636x11bb50fe = "cara.CaraNativeJoinLiveQualityProphetContext@Attach";
        m111745x5b0e9e1f("cara.CaraNativeJoinLiveQualityProphetContext@Attach", this.f60638xc2e4ffd6, interfaceC27190x837d4131);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27189x43bae640 m111744xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27189x43bae640(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeJoinLiveQualityProphetContext */
    private native void m111745x5b0e9e1f(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jniliveID */
    private native java.lang.String m111746x77cfbaec(long j17);

    /* renamed from: jninetworkQuality */
    private native int m111747xef46a5d6(long j17);

    /* renamed from: jniscene */
    private native int m111748x77d9fc07(long j17);

    /* renamed from: jnivideoQuality */
    private native int m111749x33efa029(long j17);

    /* renamed from: liveID */
    public java.lang.String m111750xbe4a2f07() {
        return m111746x77cfbaec(this.f60634xf042a733);
    }

    /* renamed from: networkQuality */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraLiveNetworkQuality m111751xc144cef1() {
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraLiveNetworkQuality.m111378x382ad972(m111747xef46a5d6(this.f60634xf042a733));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27189x43bae640.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27189x43bae640.Destructor(this, this.f60634xf042a733);
        this.f59556x5751f3f9 = destructor;
        destructor.f59557xf042a733 = this.f60634xf042a733;
        destructor.f59558xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59559xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: scene */
    public int m111752x683188c() {
        return m111748x77d9fc07(this.f60634xf042a733);
    }

    /* renamed from: videoQuality */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraLiveVideoQuality m111753x1e0b5404() {
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraLiveVideoQuality.m111396x382ad972(m111749x33efa029(this.f60634xf042a733));
    }

    public C27189x43bae640(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111745x5b0e9e1f(str, str2, null);
    }
}
