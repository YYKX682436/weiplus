package com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b;

/* renamed from: com.tencent.wechat.zidl2.ZDirectBuffer */
/* loaded from: classes15.dex */
public class C27691xda696703 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703.Destructor f60629x5751f3f9;

    /* renamed from: implHandle */
    private long f60630x974ea468;

    /* renamed from: view */
    private java.nio.ByteBuffer f60631x373aa5;

    /* renamed from: com.tencent.wechat.zidl2.ZDirectBuffer$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: implHandle */
        private long f60632x974ea468;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            this.f60632x974ea468 = j17;
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703.m119541xa592470c(this.f60632x974ea468);
        }
    }

    public C27691xda696703(java.nio.ByteBuffer byteBuffer) {
        long m119540x6df6afe0 = m119540x6df6afe0(byteBuffer);
        this.f60630x974ea468 = m119540x6df6afe0;
        this.f60631x373aa5 = m119539x3317f928(m119540x6df6afe0);
        this.f60629x5751f3f9 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703.Destructor(this.f60631x373aa5, this.f60630x974ea468);
    }

    /* renamed from: addRef */
    public static native void m119536xab35f832(long j17);

    /* renamed from: fromByteBuffer */
    public static com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703 m119537x6783e2b2(java.nio.ByteBuffer byteBuffer) {
        return new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703(byteBuffer);
    }

    /* renamed from: fromImpl */
    public static com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703 m119538xb5cb08ea(long j17) {
        return new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703(j17);
    }

    /* renamed from: newByteBuffer */
    private static native java.nio.ByteBuffer m119539x3317f928(long j17);

    /* renamed from: newImpl */
    private static native long m119540x6df6afe0(java.nio.ByteBuffer byteBuffer);

    /* renamed from: releaseRef */
    public static native void m119541xa592470c(long j17);

    /* renamed from: getImpl */
    public long m119542xfb80ca96() {
        return this.f60630x974ea468;
    }

    /* renamed from: getView */
    public java.nio.ByteBuffer m119543xfb86a31b() {
        return this.f60631x373aa5;
    }

    /* renamed from: setView */
    public void m119544x76516a27(java.nio.ByteBuffer byteBuffer) {
        long m119540x6df6afe0 = m119540x6df6afe0(byteBuffer);
        this.f60630x974ea468 = m119540x6df6afe0;
        this.f60631x373aa5 = m119539x3317f928(m119540x6df6afe0);
        this.f60629x5751f3f9 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703.Destructor(this.f60631x373aa5, this.f60630x974ea468);
    }

    /* renamed from: toImpl */
    public long m119545xcc312f3b() {
        m119536xab35f832(this.f60630x974ea468);
        return this.f60630x974ea468;
    }

    public C27691xda696703(long j17) {
        this.f60630x974ea468 = j17;
        this.f60631x373aa5 = m119539x3317f928(j17);
        this.f60629x5751f3f9 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703.Destructor(this.f60631x373aa5, j17);
    }
}
