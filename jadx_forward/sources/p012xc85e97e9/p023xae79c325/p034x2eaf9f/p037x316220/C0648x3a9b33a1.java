package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy */
/* loaded from: classes16.dex */
final class C0648x3a9b33a1 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy {

    /* renamed from: bitrate */
    private final int f1433xf9e77b6d;

    /* renamed from: channels */
    private final int f1434x556423d0;

    /* renamed from: codec */
    private final int f1435x5a71016;

    /* renamed from: mediaType */
    private final java.lang.String f1436x7f94e13e;

    /* renamed from: profile */
    private final int f1437xed8e89a9;

    /* renamed from: sampleRate */
    private final int f1438x88751aa;

    public C0648x3a9b33a1(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        this.f1435x5a71016 = i17;
        if (str == null) {
            throw new java.lang.NullPointerException("Null mediaType");
        }
        this.f1436x7f94e13e = str;
        this.f1433xf9e77b6d = i18;
        this.f1438x88751aa = i19;
        this.f1434x556423d0 = i27;
        this.f1437xed8e89a9 = i28;
    }

    /* renamed from: equals */
    public boolean m5121xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy audioProfileProxy = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy) obj;
        return this.f1435x5a71016 == audioProfileProxy.mo5124x7444b660() && this.f1436x7f94e13e.equals(audioProfileProxy.mo5125x7f025288()) && this.f1433xf9e77b6d == audioProfileProxy.mo5122x37b4b737() && this.f1438x88751aa == audioProfileProxy.mo5127xf6c809a0() && this.f1434x556423d0 == audioProfileProxy.mo5123xd13e6146() && this.f1437xed8e89a9 == audioProfileProxy.mo5126x2b5bc573();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy
    /* renamed from: getBitrate */
    public int mo5122x37b4b737() {
        return this.f1433xf9e77b6d;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy
    /* renamed from: getChannels */
    public int mo5123xd13e6146() {
        return this.f1434x556423d0;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy
    /* renamed from: getCodec */
    public int mo5124x7444b660() {
        return this.f1435x5a71016;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy
    /* renamed from: getMediaType */
    public java.lang.String mo5125x7f025288() {
        return this.f1436x7f94e13e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy
    /* renamed from: getProfile */
    public int mo5126x2b5bc573() {
        return this.f1437xed8e89a9;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy
    /* renamed from: getSampleRate */
    public int mo5127xf6c809a0() {
        return this.f1438x88751aa;
    }

    /* renamed from: hashCode */
    public int m5128x8cdac1b() {
        return ((((((((((this.f1435x5a71016 ^ 1000003) * 1000003) ^ this.f1436x7f94e13e.hashCode()) * 1000003) ^ this.f1433xf9e77b6d) * 1000003) ^ this.f1438x88751aa) * 1000003) ^ this.f1434x556423d0) * 1000003) ^ this.f1437xed8e89a9;
    }

    /* renamed from: toString */
    public java.lang.String m5129x9616526c() {
        return "AudioProfileProxy{codec=" + this.f1435x5a71016 + ", mediaType=" + this.f1436x7f94e13e + ", bitrate=" + this.f1433xf9e77b6d + ", sampleRate=" + this.f1438x88751aa + ", channels=" + this.f1434x556423d0 + ", profile=" + this.f1437xed8e89a9 + "}";
    }
}
