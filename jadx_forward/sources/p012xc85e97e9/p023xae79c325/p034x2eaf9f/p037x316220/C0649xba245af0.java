package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy */
/* loaded from: classes14.dex */
final class C0649xba245af0 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.ImmutableEncoderProfilesProxy {

    /* renamed from: audioProfiles */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy> f1439x511475e0;

    /* renamed from: defaultDurationSeconds */
    private final int f1440x79305dca;

    /* renamed from: recommendedFileFormat */
    private final int f1441xd0c2914e;

    /* renamed from: videoProfiles */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy> f1442xb45a7985;

    public C0649xba245af0(int i17, int i18, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy> list, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy> list2) {
        this.f1440x79305dca = i17;
        this.f1441xd0c2914e = i18;
        if (list == null) {
            throw new java.lang.NullPointerException("Null audioProfiles");
        }
        this.f1439x511475e0 = list;
        if (list2 == null) {
            throw new java.lang.NullPointerException("Null videoProfiles");
        }
        this.f1442xb45a7985 = list2;
    }

    /* renamed from: equals */
    public boolean m5130xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.ImmutableEncoderProfilesProxy)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxy = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.ImmutableEncoderProfilesProxy) obj;
        return this.f1440x79305dca == immutableEncoderProfilesProxy.mo5132xe2fed4c0() && this.f1441xd0c2914e == immutableEncoderProfilesProxy.mo5133xdc6e6398() && this.f1439x511475e0.equals(immutableEncoderProfilesProxy.mo5131xe74322a()) && this.f1442xb45a7985.equals(immutableEncoderProfilesProxy.mo5134x71ba35cf());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08
    /* renamed from: getAudioProfiles */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy> mo5131xe74322a() {
        return this.f1439x511475e0;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08
    /* renamed from: getDefaultDurationSeconds */
    public int mo5132xe2fed4c0() {
        return this.f1440x79305dca;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08
    /* renamed from: getRecommendedFileFormat */
    public int mo5133xdc6e6398() {
        return this.f1441xd0c2914e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08
    /* renamed from: getVideoProfiles */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy> mo5134x71ba35cf() {
        return this.f1442xb45a7985;
    }

    /* renamed from: hashCode */
    public int m5135x8cdac1b() {
        return ((((((this.f1440x79305dca ^ 1000003) * 1000003) ^ this.f1441xd0c2914e) * 1000003) ^ this.f1439x511475e0.hashCode()) * 1000003) ^ this.f1442xb45a7985.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m5136x9616526c() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f1440x79305dca + ", recommendedFileFormat=" + this.f1441xd0c2914e + ", audioProfiles=" + this.f1439x511475e0 + ", videoProfiles=" + this.f1442xb45a7985 + "}";
    }
}
