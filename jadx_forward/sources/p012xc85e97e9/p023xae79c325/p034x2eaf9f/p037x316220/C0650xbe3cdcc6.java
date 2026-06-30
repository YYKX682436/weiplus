package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy */
/* loaded from: classes16.dex */
public final class C0650xbe3cdcc6 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy {

    /* renamed from: bitDepth */
    private final int f1443x40817db6;

    /* renamed from: bitrate */
    private final int f1444xf9e77b6d;

    /* renamed from: chromaSubsampling */
    private final int f1445x63961dd1;

    /* renamed from: codec */
    private final int f1446x5a71016;

    /* renamed from: frameRate */
    private final int f1447x207cebed;

    /* renamed from: hdrFormat */
    private final int f1448xdc0de68d;

    /* renamed from: height */
    private final int f1449xb7389127;

    /* renamed from: mediaType */
    private final java.lang.String f1450x7f94e13e;

    /* renamed from: profile */
    private final int f1451xed8e89a9;

    /* renamed from: width */
    private final int f1452x6be2dc6;

    public C0650xbe3cdcc6(int i17, java.lang.String str, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
        this.f1446x5a71016 = i17;
        if (str == null) {
            throw new java.lang.NullPointerException("Null mediaType");
        }
        this.f1450x7f94e13e = str;
        this.f1444xf9e77b6d = i18;
        this.f1447x207cebed = i19;
        this.f1452x6be2dc6 = i27;
        this.f1449xb7389127 = i28;
        this.f1451xed8e89a9 = i29;
        this.f1443x40817db6 = i37;
        this.f1445x63961dd1 = i38;
        this.f1448xdc0de68d = i39;
    }

    /* renamed from: equals */
    public boolean m5137xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy videoProfileProxy = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy) obj;
        return this.f1446x5a71016 == videoProfileProxy.mo5141x7444b660() && this.f1450x7f94e13e.equals(videoProfileProxy.mo5145x7f025288()) && this.f1444xf9e77b6d == videoProfileProxy.mo5139x37b4b737() && this.f1447x207cebed == videoProfileProxy.mo5142x1fea5d37() && this.f1452x6be2dc6 == videoProfileProxy.mo5147x755bd410() && this.f1449xb7389127 == videoProfileProxy.mo5144x1c4fb41d() && this.f1451xed8e89a9 == videoProfileProxy.mo5146x2b5bc573() && this.f1443x40817db6 == videoProfileProxy.mo5138xbc5bbb2c() && this.f1445x63961dd1 == videoProfileProxy.mo5140xb6caa51b() && this.f1448xdc0de68d == videoProfileProxy.mo5143xdb7b57d7();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy
    /* renamed from: getBitDepth */
    public int mo5138xbc5bbb2c() {
        return this.f1443x40817db6;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy
    /* renamed from: getBitrate */
    public int mo5139x37b4b737() {
        return this.f1444xf9e77b6d;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy
    /* renamed from: getChromaSubsampling */
    public int mo5140xb6caa51b() {
        return this.f1445x63961dd1;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy
    /* renamed from: getCodec */
    public int mo5141x7444b660() {
        return this.f1446x5a71016;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy
    /* renamed from: getFrameRate */
    public int mo5142x1fea5d37() {
        return this.f1447x207cebed;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy
    /* renamed from: getHdrFormat */
    public int mo5143xdb7b57d7() {
        return this.f1448xdc0de68d;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy
    /* renamed from: getHeight */
    public int mo5144x1c4fb41d() {
        return this.f1449xb7389127;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy
    /* renamed from: getMediaType */
    public java.lang.String mo5145x7f025288() {
        return this.f1450x7f94e13e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy
    /* renamed from: getProfile */
    public int mo5146x2b5bc573() {
        return this.f1451xed8e89a9;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy
    /* renamed from: getWidth */
    public int mo5147x755bd410() {
        return this.f1452x6be2dc6;
    }

    /* renamed from: hashCode */
    public int m5148x8cdac1b() {
        return ((((((((((((((((((this.f1446x5a71016 ^ 1000003) * 1000003) ^ this.f1450x7f94e13e.hashCode()) * 1000003) ^ this.f1444xf9e77b6d) * 1000003) ^ this.f1447x207cebed) * 1000003) ^ this.f1452x6be2dc6) * 1000003) ^ this.f1449xb7389127) * 1000003) ^ this.f1451xed8e89a9) * 1000003) ^ this.f1443x40817db6) * 1000003) ^ this.f1445x63961dd1) * 1000003) ^ this.f1448xdc0de68d;
    }

    /* renamed from: toString */
    public java.lang.String m5149x9616526c() {
        return "VideoProfileProxy{codec=" + this.f1446x5a71016 + ", mediaType=" + this.f1450x7f94e13e + ", bitrate=" + this.f1444xf9e77b6d + ", frameRate=" + this.f1447x207cebed + ", width=" + this.f1452x6be2dc6 + ", height=" + this.f1449xb7389127 + ", profile=" + this.f1451xed8e89a9 + ", bitDepth=" + this.f1443x40817db6 + ", chromaSubsampling=" + this.f1445x63961dd1 + ", hdrFormat=" + this.f1448xdc0de68d + "}";
    }
}
