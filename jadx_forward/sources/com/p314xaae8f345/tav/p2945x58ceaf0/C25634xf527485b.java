package com.p314xaae8f345.tav.p2945x58ceaf0;

/* renamed from: com.tencent.tav.asset.AssetTrack */
/* loaded from: classes16.dex */
public class C25634xf527485b<Segment extends com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258> {

    /* renamed from: PersistentTrackID_Invalid */
    public static final int f47070x1f8fa687 = -1;

    /* renamed from: asset */
    protected java.lang.ref.WeakReference<com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0> f47071x58ceaf0;

    /* renamed from: availableMetadataFormats */
    protected java.util.List<java.lang.String> f47072x5f442324;

    /* renamed from: availableTrackAssociationTypes */
    protected java.util.List<java.lang.String> f47073x5052009a;

    /* renamed from: commonMetadata */
    protected java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> f47074xf9dfee3a;

    /* renamed from: enabled */
    protected boolean f47075xa00f8b41;

    /* renamed from: estimatedDataRate */
    protected float f47076x2cdab406;

    /* renamed from: mediaType */
    protected int f47077x7f94e13e;

    /* renamed from: naturalSize */
    protected com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f47078x6d2a2fca;

    /* renamed from: naturalTimeScale */
    protected int f47079xb2e1a454;

    /* renamed from: nominalFrameRate */
    protected float f47080x41e47a71;

    /* renamed from: preferredRotation */
    protected int f47081x51026f1f;

    /* renamed from: preferredTransform */
    protected android.graphics.Matrix f47082x5880ffeb;

    /* renamed from: preferredVolume */
    protected float f47083xdb79bafb;

    /* renamed from: segments */
    protected java.util.List<Segment> f47084x3eef47a0;

    /* renamed from: sourcePath */
    protected java.lang.String f47085xbdbebae0;

    /* renamed from: timeRange */
    protected com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47086x16fae70;

    /* renamed from: totalSampleDataLength */
    protected long f47087x3f240bde;

    /* renamed from: trackID */
    protected int f47088xc060d3a6;

    public C25634xf527485b() {
        this.f47075xa00f8b41 = true;
        this.f47083xdb79bafb = 1.0f;
        this.f47081x51026f1f = 0;
        this.f47080x41e47a71 = 30.0f;
        this.f47084x3eef47a0 = new java.util.ArrayList();
    }

    /* renamed from: associatedTracksOfType */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> m96144xe2f7bc7f(java.lang.String str) {
        return null;
    }

    /* renamed from: createAssetTrackSegments */
    public void m96145x85724317(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0) {
        if (this.f47084x3eef47a0 == null) {
            this.f47084x3eef47a0 = new java.util.ArrayList();
        }
        if (abstractC25633x3c9fad0 == null || abstractC25633x3c9fad0.m96127x31d73e7a() <= this.f47088xc060d3a6) {
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = this.f47086x16fae70;
        this.f47084x3eef47a0.add(new com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258(c25738xead39d26, c25738xead39d26));
    }

    /* renamed from: getAsset */
    public com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 m96146x742a913a() {
        java.lang.ref.WeakReference<com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0> weakReference = this.f47071x58ceaf0;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: getAvailableMetadataFormats */
    public java.util.List<java.lang.String> m96147x8f50b49a() {
        return this.f47072x5f442324;
    }

    /* renamed from: getAvailableTrackAssociationTypes */
    public java.util.List<java.lang.String> m96148x110d2190() {
        return this.f47073x5052009a;
    }

    /* renamed from: getCommonMetadata */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> m96149xe877bb30() {
        return this.f47074xf9dfee3a;
    }

    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96150x51e8b0a() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = this.f47086x16fae70;
        return c25738xead39d26 != null ? c25738xead39d26.m97256x51e8b0a() : com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
    }

    /* renamed from: getEstimatedDataRate */
    public float m96151x800f3b50() {
        return this.f47076x2cdab406;
    }

    /* renamed from: getMediaType */
    public int m96152x7f025288() {
        return this.f47077x7f94e13e;
    }

    /* renamed from: getNaturalSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m96153x47007694() {
        return this.f47078x6d2a2fca;
    }

    /* renamed from: getNaturalTimeScale */
    public int m96154x5aba0bca() {
        return this.f47079xb2e1a454;
    }

    /* renamed from: getNominalFrameRate */
    public float m96155xe9bce1e7() {
        return this.f47080x41e47a71;
    }

    /* renamed from: getPreferredRotation */
    public int m96156xa436f669() {
        return this.f47081x51026f1f;
    }

    /* renamed from: getPreferredTransform */
    public android.graphics.Matrix m96157x6bdd61e1() {
        return this.f47082x5880ffeb;
    }

    /* renamed from: getPreferredVolume */
    public float m96158xbfdb8cc5() {
        return this.f47083xdb79bafb;
    }

    /* renamed from: getSegments */
    public java.util.List<Segment> mo96159xbac98516() {
        return this.f47084x3eef47a0;
    }

    /* renamed from: getSourcePath */
    public java.lang.String m96160xabff72d6() {
        return this.f47085xbdbebae0;
    }

    /* renamed from: getTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m96161xdd1fba() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = this.f47086x16fae70;
        if (c25738xead39d26 == null || c25738xead39d26 == com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26.f47873x2dc6f5f1) {
            this.f47086x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, mo96150x51e8b0a());
        }
        return this.f47086x16fae70;
    }

    /* renamed from: getTotalSampleDataLength */
    public long m96162x4acfde28() {
        return this.f47087x3f240bde;
    }

    /* renamed from: getTrackID */
    public int m96163xfe2e0f70() {
        return this.f47088xc060d3a6;
    }

    /* renamed from: hasMediaCharacteristic */
    public boolean m96164xd13809a5(java.lang.String str) {
        return false;
    }

    /* renamed from: isEnabled */
    public boolean m96165x7d80d2b7() {
        return this.f47075xa00f8b41;
    }

    /* renamed from: metadataForFormat */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> m96166x61ecbfb1(java.lang.String str) {
        return null;
    }

    /* renamed from: samplePresentationTimeForTrackTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96167x35ef7160(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 m96117xf05b3f6e;
        java.lang.ref.WeakReference<com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0> weakReference = this.f47071x58ceaf0;
        if (weakReference == null || weakReference.get() == null || (m96117xf05b3f6e = this.f47071x58ceaf0.get().m96117xf05b3f6e()) == null) {
            return null;
        }
        m96117xf05b3f6e.m97974xc9fc1b13(c25736x76b98a57.m97232x31040141(), 2);
        if (m96117xf05b3f6e.m97964xf6c90f8d() > c25736x76b98a57.m97232x31040141()) {
            m96117xf05b3f6e.m97974xc9fc1b13(c25736x76b98a57.m97232x31040141(), 0);
        }
        return com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.m97303x391f00ab(m96117xf05b3f6e.m97964xf6c90f8d());
    }

    /* renamed from: segmentForTrackTime */
    public com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258 mo96168x1a2bbec2(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97241x30959487;
        java.util.List<Segment> list = this.f47084x3eef47a0;
        if (list == null) {
            return null;
        }
        for (Segment segment : list) {
            if (segment != null && (m97241x30959487 = segment.m96173x35b5540b().m97241x30959487()) != null && m97241x30959487.m97253x805f158c(c25736x76b98a57)) {
                return segment;
            }
        }
        return null;
    }

    /* renamed from: setPreferredRotation */
    public void m96169x7fcd02dd(int i17) {
        this.f47081x51026f1f = i17;
    }

    /* renamed from: setPreferredTransform */
    public void mo96170x308e3ed(android.graphics.Matrix matrix) {
        this.f47082x5880ffeb = matrix;
    }

    /* renamed from: setPreferredVolume */
    public void mo96171xf6b22639(float f17) {
        this.f47083xdb79bafb = f17;
    }

    public C25634xf527485b(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0, int i17, int i18, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47075xa00f8b41 = true;
        this.f47083xdb79bafb = 1.0f;
        this.f47081x51026f1f = 0;
        this.f47080x41e47a71 = 30.0f;
        this.f47084x3eef47a0 = new java.util.ArrayList();
        this.f47088xc060d3a6 = i17;
        this.f47077x7f94e13e = i18;
        this.f47086x16fae70 = c25738xead39d26;
        if (abstractC25633x3c9fad0 != null && i17 < abstractC25633x3c9fad0.m96127x31d73e7a()) {
            this.f47071x58ceaf0 = new java.lang.ref.WeakReference<>(abstractC25633x3c9fad0);
            this.f47080x41e47a71 = com.p314xaae8f345.tav.p2965xf0edce24.C25823x281c550d.m97987x1fea5d37(abstractC25633x3c9fad0.m96128xe2db7ec(i17));
            this.f47078x6d2a2fca = abstractC25633x3c9fad0.mo96120x47007694();
            this.f47085xbdbebae0 = abstractC25633x3c9fad0.m96126xabff72d6();
        }
        m96145x85724317(abstractC25633x3c9fad0);
    }
}
