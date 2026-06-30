package ig;

/* loaded from: classes16.dex */
public final class d extends com.p176xb6135e39.p283xc50a8b8b.q5 implements ig.f {

    /* renamed from: aiTags_ */
    private java.lang.Object f69951xc336ac1e;

    /* renamed from: aspectRatio_ */
    private java.lang.Object f69952xe20f102c;

    /* renamed from: assetFilePath_ */
    private java.lang.Object f69953xc655cbae;

    /* renamed from: assetIdentifier_ */
    private java.lang.Object f69954x979e6fc6;

    /* renamed from: bitField0_ */
    private int f69955x961a12dc;

    /* renamed from: durationMs_ */
    private long f69956xe3810945;

    /* renamed from: imageClassExceeds_ */
    private com.p176xb6135e39.p283xc50a8b8b.t6 f69957x9c21dcfd;

    /* renamed from: imageClassLabels_ */
    private com.p176xb6135e39.p283xc50a8b8b.t6 f69958x2eff44a3;

    /* renamed from: isOverThreshold_ */
    private boolean f69959x2c555112;

    /* renamed from: mediaType_ */
    private int f69960x730746e1;

    /* renamed from: originId_ */
    private java.lang.Object f69961xf41e559e;

    /* renamed from: videoClassAudioLabels_ */
    private com.p176xb6135e39.p283xc50a8b8b.t6 f69962x9c2a99e7;

    /* renamed from: videoClassVisualExceeds_ */
    private com.p176xb6135e39.p283xc50a8b8b.t6 f69963x5af9577d;

    /* renamed from: videoClassVisualLabels_ */
    private com.p176xb6135e39.p283xc50a8b8b.t6 f69964xd20e7a23;

    private d() {
        super(null);
        this.f69960x730746e1 = 1;
        this.f69952xe20f102c = "";
        this.f69951xc336ac1e = "";
        this.f69961xf41e559e = "";
        this.f69962x9c2a99e7 = ig.e.m135408xbf196226();
        this.f69958x2eff44a3 = ig.e.m135411xbf19bc3e();
        this.f69957x9c21dcfd = ig.e.m135414xbf19c781();
        this.f69964xd20e7a23 = ig.e.m135417xbf19d2c4();
        this.f69963x5af9577d = ig.e.m135420xbf1a2cdc();
        this.f69954x979e6fc6 = "";
        this.f69953xc655cbae = "";
        m135296x73fef578();
    }

    /* renamed from: ensureImageClassExceedsIsMutable */
    private void m135290x6aee83f8() {
        if ((this.f69955x961a12dc & 256) == 0) {
            this.f69957x9c21dcfd = ig.e.m135415xbf19cb42(this.f69957x9c21dcfd);
            this.f69955x961a12dc |= 256;
        }
    }

    /* renamed from: ensureImageClassLabelsIsMutable */
    private void m135291xdc0d0422() {
        if ((this.f69955x961a12dc & 128) == 0) {
            this.f69958x2eff44a3 = ig.e.m135412xbf19bfff(this.f69958x2eff44a3);
            this.f69955x961a12dc |= 128;
        }
    }

    /* renamed from: ensureVideoClassAudioLabelsIsMutable */
    private void m135292xfcae17e2() {
        if ((this.f69955x961a12dc & 64) == 0) {
            this.f69962x9c2a99e7 = ig.e.m135409xbf19b4bc(this.f69962x9c2a99e7);
            this.f69955x961a12dc |= 64;
        }
    }

    /* renamed from: ensureVideoClassVisualExceedsIsMutable */
    private void m135293x863e5ff8() {
        if ((this.f69955x961a12dc & 1024) == 0) {
            this.f69963x5af9577d = ig.e.m135421xbf1a309d(this.f69963x5af9577d);
            this.f69955x961a12dc |= 1024;
        }
    }

    /* renamed from: ensureVideoClassVisualLabelsIsMutable */
    private void m135294x6951a822() {
        if ((this.f69955x961a12dc & 512) == 0) {
            this.f69964xd20e7a23 = ig.e.m135418xbf19d685(this.f69964xd20e7a23);
            this.f69955x961a12dc |= 512;
        }
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135295xc1a58b65() {
        return ig.y0.f372821c;
    }

    /* renamed from: maybeForceBuilderInitialization */
    private void m135296x73fef578() {
        ig.e.m135388xbf1875a7();
    }

    /* renamed from: addAllImageClassExceeds */
    public ig.d m135297xe5114642(java.lang.Iterable<? extends java.lang.Integer> iterable) {
        m135290x6aee83f8();
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f69957x9c21dcfd);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addAllImageClassLabels */
    public ig.d m135298xe084a09c(java.lang.Iterable<? extends java.lang.Integer> iterable) {
        m135291xdc0d0422();
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f69958x2eff44a3);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addAllVideoClassAudioLabels */
    public ig.d m135299xc8eff418(java.lang.Iterable<? extends java.lang.Integer> iterable) {
        m135292xfcae17e2();
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f69962x9c2a99e7);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addAllVideoClassVisualExceeds */
    public ig.d m135300xeaab03c2(java.lang.Iterable<? extends java.lang.Integer> iterable) {
        m135293x863e5ff8();
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f69963x5af9577d);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addAllVideoClassVisualLabels */
    public ig.d m135301x9fd331c(java.lang.Iterable<? extends java.lang.Integer> iterable) {
        m135294x6951a822();
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f69964xd20e7a23);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addImageClassExceeds */
    public ig.d m135302xb2a21501(int i17) {
        m135290x6aee83f8();
        ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69957x9c21dcfd).e(i17);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addImageClassLabels */
    public ig.d m135303x8c4f7dfd(int i17) {
        m135291xdc0d0422();
        ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69958x2eff44a3).e(i17);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addVideoClassAudioLabels */
    public ig.d m135304xafed4b57(int i17) {
        m135292xfcae17e2();
        ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69962x9c2a99e7).e(i17);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addVideoClassVisualExceeds */
    public ig.d m135305x7af8741(int i17) {
        m135293x863e5ff8();
        ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69963x5af9577d).e(i17);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addVideoClassVisualLabels */
    public ig.d m135306x2aac3bd(int i17) {
        m135294x6951a822();
        ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69964xd20e7a23).e(i17);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearAiTags */
    public ig.d m135310x821f550e() {
        this.f69955x961a12dc &= -9;
        this.f69951xc336ac1e = ig.e.m135423x7c90cfc0().mo135331x108c8357();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearAspectRatio */
    public ig.d m135311xb1be3206() {
        this.f69955x961a12dc &= -5;
        this.f69952xe20f102c = ig.e.m135423x7c90cfc0().mo135333x1aef895d();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearAssetFilePath */
    public ig.d m135312xfa52ed84() {
        this.f69955x961a12dc &= -4097;
        this.f69953xc655cbae = ig.e.m135423x7c90cfc0().mo135335xdc8bcb1b();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearAssetIdentifier */
    public ig.d m135313xeb9c85ac() {
        this.f69955x961a12dc &= -2049;
        this.f69954x979e6fc6 = ig.e.m135423x7c90cfc0().mo135337x23145983();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearDurationMs */
    public ig.d m135314x1b7d1887() {
        this.f69955x961a12dc &= -3;
        this.f69956xe3810945 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearImageClassExceeds */
    public ig.d m135316xfe6364d5() {
        this.f69957x9c21dcfd = ig.e.m135416xbf19cf03();
        this.f69955x961a12dc &= -257;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearImageClassLabels */
    public ig.d m135317x75fae3a9() {
        this.f69958x2eff44a3 = ig.e.m135413xbf19c3c0();
        this.f69955x961a12dc &= -129;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearIsOverThreshold */
    public ig.d m135318xc71e4ae0() {
        this.f69955x961a12dc &= -33;
        this.f69959x2c555112 = false;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearMediaType */
    public ig.d m135319x2b851171() {
        this.f69955x961a12dc &= -2;
        this.f69960x730746e1 = 1;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearOriginId */
    public ig.d m135322x2632044e() {
        this.f69955x961a12dc &= -17;
        this.f69961xf41e559e = ig.e.m135423x7c90cfc0().mo135348xce0cc457();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearVideoClassAudioLabels */
    public ig.d m135323x981a912b() {
        this.f69962x9c2a99e7 = ig.e.m135410xbf19b87d();
        this.f69955x961a12dc &= -65;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearVideoClassVisualExceeds */
    public ig.d m135324x99a2a815() {
        this.f69963x5af9577d = ig.e.m135422xbf1a345e();
        this.f69955x961a12dc &= -1025;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearVideoClassVisualLabels */
    public ig.d m135325x20263869() {
        this.f69964xd20e7a23 = ig.e.m135419xbf1a291b();
        this.f69955x961a12dc &= -513;
        m20881x7bb163d5();
        return this;
    }

    @Override // ig.f
    /* renamed from: getAiTags */
    public java.lang.String mo135331x108c8357() {
        java.lang.Object obj = this.f69951xc336ac1e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69951xc336ac1e = r17;
        }
        return r17;
    }

    @Override // ig.f
    /* renamed from: getAiTagsBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135332x8a1dcb54() {
        java.lang.Object obj = this.f69951xc336ac1e;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69951xc336ac1e = h17;
        return h17;
    }

    @Override // ig.f
    /* renamed from: getAspectRatio */
    public java.lang.String mo135333x1aef895d() {
        java.lang.Object obj = this.f69952xe20f102c;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69952xe20f102c = r17;
        }
        return r17;
    }

    @Override // ig.f
    /* renamed from: getAspectRatioBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135334xcceb990e() {
        java.lang.Object obj = this.f69952xe20f102c;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69952xe20f102c = h17;
        return h17;
    }

    @Override // ig.f
    /* renamed from: getAssetFilePath */
    public java.lang.String mo135335xdc8bcb1b() {
        java.lang.Object obj = this.f69953xc655cbae;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69953xc655cbae = r17;
        }
        return r17;
    }

    @Override // ig.f
    /* renamed from: getAssetFilePathBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135336xdc08be10() {
        java.lang.Object obj = this.f69953xc655cbae;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69953xc655cbae = h17;
        return h17;
    }

    @Override // ig.f
    /* renamed from: getAssetIdentifier */
    public java.lang.String mo135337x23145983() {
        java.lang.Object obj = this.f69954x979e6fc6;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69954x979e6fc6 = r17;
        }
        return r17;
    }

    @Override // ig.f
    /* renamed from: getAssetIdentifierBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135338x6c20f0a8() {
        java.lang.Object obj = this.f69954x979e6fc6;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69954x979e6fc6 = h17;
        return h17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return ig.y0.f372821c;
    }

    @Override // ig.f
    /* renamed from: getDurationMs */
    public long mo135339x37a7fa50() {
        return this.f69956xe3810945;
    }

    @Override // ig.f
    /* renamed from: getImageClassExceeds */
    public int mo135340x37359eec(int i17) {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69957x9c21dcfd).h(i17);
    }

    @Override // ig.f
    /* renamed from: getImageClassExceedsCount */
    public int mo135341x36393583() {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69957x9c21dcfd).f126862f;
    }

    @Override // ig.f
    /* renamed from: getImageClassExceedsList */
    public java.util.List<java.lang.Integer> mo135342x54586daa() {
        return (this.f69955x961a12dc & 256) != 0 ? java.util.Collections.unmodifiableList(this.f69957x9c21dcfd) : this.f69957x9c21dcfd;
    }

    @Override // ig.f
    /* renamed from: getImageClassLabels */
    public int mo135343x2d7d8ab2(int i17) {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69958x2eff44a3).h(i17);
    }

    @Override // ig.f
    /* renamed from: getImageClassLabelsCount */
    public int mo135344x690bb57d() {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69958x2eff44a3).f126862f;
    }

    @Override // ig.f
    /* renamed from: getImageClassLabelsList */
    public java.util.List<java.lang.Integer> mo135345xc9990670() {
        return (this.f69955x961a12dc & 128) != 0 ? java.util.Collections.unmodifiableList(this.f69958x2eff44a3) : this.f69958x2eff44a3;
    }

    @Override // ig.f
    /* renamed from: getIsOverThreshold */
    public boolean mo135346xfe961eb7() {
        return this.f69959x2c555112;
    }

    @Override // ig.f
    /* renamed from: getMediaType */
    public ig.k mo135347x7f025288() {
        ig.k a17 = ig.k.a(this.f69960x730746e1);
        return a17 == null ? ig.k.IMAGE : a17;
    }

    @Override // ig.f
    /* renamed from: getOriginId */
    public java.lang.String mo135348xce0cc457() {
        java.lang.Object obj = this.f69961xf41e559e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69961xf41e559e = r17;
        }
        return r17;
    }

    @Override // ig.f
    /* renamed from: getOriginIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135349x279e2a54() {
        java.lang.Object obj = this.f69961xf41e559e;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69961xf41e559e = h17;
        return h17;
    }

    @Override // ig.f
    /* renamed from: getVideoClassAudioLabels */
    public int mo135350x4a83e7c2(int i17) {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69962x9c2a99e7).h(i17);
    }

    @Override // ig.f
    /* renamed from: getVideoClassAudioLabelsCount */
    public int mo135351x4dc5026d() {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69962x9c2a99e7).f126862f;
    }

    @Override // ig.f
    /* renamed from: getVideoClassAudioLabelsList */
    public java.util.List<java.lang.Integer> mo135352x130a5b80() {
        return (this.f69955x961a12dc & 64) != 0 ? java.util.Collections.unmodifiableList(this.f69962x9c2a99e7) : this.f69962x9c2a99e7;
    }

    @Override // ig.f
    /* renamed from: getVideoClassVisualExceeds */
    public int mo135353x5710b4ec(int i17) {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69963x5af9577d).h(i17);
    }

    @Override // ig.f
    /* renamed from: getVideoClassVisualExceedsCount */
    public int mo135354x51dbdf83() {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69963x5af9577d).f126862f;
    }

    @Override // ig.f
    /* renamed from: getVideoClassVisualExceedsList */
    public java.util.List<java.lang.Integer> mo135355x44b883aa() {
        return (this.f69955x961a12dc & 1024) != 0 ? java.util.Collections.unmodifiableList(this.f69963x5af9577d) : this.f69963x5af9577d;
    }

    @Override // ig.f
    /* renamed from: getVideoClassVisualLabels */
    public int mo135356xbae7b4b2(int i17) {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69964xd20e7a23).h(i17);
    }

    @Override // ig.f
    /* renamed from: getVideoClassVisualLabelsCount */
    public int mo135357x596bcb7d() {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69964xd20e7a23).f126862f;
    }

    @Override // ig.f
    /* renamed from: getVideoClassVisualLabelsList */
    public java.util.List<java.lang.Integer> mo135358xe1de3070() {
        return (this.f69955x961a12dc & 512) != 0 ? java.util.Collections.unmodifiableList(this.f69964xd20e7a23) : this.f69964xd20e7a23;
    }

    @Override // ig.f
    /* renamed from: hasAiTags */
    public boolean mo135359xd066039b() {
        return (this.f69955x961a12dc & 8) != 0;
    }

    @Override // ig.f
    /* renamed from: hasAspectRatio */
    public boolean mo135360x3b0f9399() {
        return (this.f69955x961a12dc & 4) != 0;
    }

    @Override // ig.f
    /* renamed from: hasAssetFilePath */
    public boolean mo135361x74d23657() {
        return (this.f69955x961a12dc & 4096) != 0;
    }

    @Override // ig.f
    /* renamed from: hasAssetIdentifier */
    public boolean mo135362xc36ce5bf() {
        return (this.f69955x961a12dc & 2048) != 0;
    }

    @Override // ig.f
    /* renamed from: hasDurationMs */
    public boolean mo135363x727fb894() {
        return (this.f69955x961a12dc & 2) != 0;
    }

    @Override // ig.f
    /* renamed from: hasIsOverThreshold */
    public boolean mo135364x9eeeaaf3() {
        return (this.f69955x961a12dc & 32) != 0;
    }

    @Override // ig.f
    /* renamed from: hasMediaType */
    public boolean mo135365x3ed7bbc4() {
        return (this.f69955x961a12dc & 1) != 0;
    }

    @Override // ig.f
    /* renamed from: hasOriginId */
    public boolean mo135366xfd87439b() {
        return (this.f69955x961a12dc & 16) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372822d;
        j6Var.c(ig.e.class, ig.d.class);
        return j6Var;
    }

    /* renamed from: setAiTags */
    public ig.d m135368x3c1b763(java.lang.String str) {
        str.getClass();
        this.f69955x961a12dc |= 8;
        this.f69951xc336ac1e = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setAiTagsBytes */
    public ig.d m135369x20833ec8(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f69955x961a12dc |= 8;
        this.f69951xc336ac1e = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setAspectRatio */
    public ig.d m135370xb154fcd1(java.lang.String str) {
        str.getClass();
        this.f69955x961a12dc |= 4;
        this.f69952xe20f102c = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setAspectRatioBytes */
    public ig.d m135371x70e82e1a(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f69955x961a12dc |= 4;
        this.f69952xe20f102c = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setAssetFilePath */
    public ig.d m135372x6f62318f(java.lang.String str) {
        str.getClass();
        this.f69955x961a12dc |= 4096;
        this.f69953xc655cbae = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setAssetFilePathBytes */
    public ig.d m135373x7334401c(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f69955x961a12dc |= 4096;
        this.f69953xc655cbae = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setAssetIdentifier */
    public ig.d m135374x59eaf2f7(java.lang.String str) {
        str.getClass();
        this.f69955x961a12dc |= 2048;
        this.f69954x979e6fc6 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setAssetIdentifierBytes */
    public ig.d m135375xe6741fb4(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f69955x961a12dc |= 2048;
        this.f69954x979e6fc6 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setDurationMs */
    public ig.d m135376x65cc485c(long j17) {
        this.f69955x961a12dc |= 2;
        this.f69956xe3810945 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setImageClassExceeds */
    public ig.d m135377x12cbab60(int i17, int i18) {
        m135290x6aee83f8();
        ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69957x9c21dcfd).l(i17, i18);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setImageClassLabels */
    public ig.d m135378xd17a1fbe(int i17, int i18) {
        m135291xdc0d0422();
        ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69958x2eff44a3).l(i17, i18);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setIsOverThreshold */
    public ig.d m135379x356cb82b(boolean z17) {
        this.f69955x961a12dc |= 32;
        this.f69959x2c555112 = z17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMediaType */
    public ig.d m135380xdb5612fc(ig.k kVar) {
        kVar.getClass();
        this.f69955x961a12dc |= 1;
        this.f69960x730746e1 = kVar.f372812d;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setOriginId */
    public ig.d m135381xc8c52563(java.lang.String str) {
        str.getClass();
        this.f69955x961a12dc |= 16;
        this.f69961xf41e559e = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setOriginIdBytes */
    public ig.d m135382xba7490c8(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f69955x961a12dc |= 16;
        this.f69961xf41e559e = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setVideoClassAudioLabels */
    public ig.d m135384x1a969a36(int i17, int i18) {
        m135292xfcae17e2();
        ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69962x9c2a99e7).l(i17, i18);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setVideoClassVisualExceeds */
    public ig.d m135385x6d409a60(int i17, int i18) {
        m135293x863e5ff8();
        ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69963x5af9577d).l(i17, i18);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setVideoClassVisualLabels */
    public ig.d m135386xed2b50be(int i17, int i18) {
        m135294x6951a822();
        ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69964xd20e7a23).l(i17, i18);
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public ig.d mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public ig.e mo20556x59bc66e() {
        ig.e mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public ig.e mo20557x85702333() {
        ig.e eVar = new ig.e(this);
        int i17 = this.f69955x961a12dc;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        ig.e.m135394xbf18dec5(eVar, this.f69960x730746e1);
        if ((i17 & 2) != 0) {
            ig.e.m135395xbf18e286(eVar, this.f69956xe3810945);
            i18 |= 2;
        }
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        ig.e.m135396xbf18e647(eVar, this.f69952xe20f102c);
        if ((i17 & 8) != 0) {
            i18 |= 8;
        }
        ig.e.m135397xbf18ea08(eVar, this.f69951xc336ac1e);
        if ((i17 & 16) != 0) {
            i18 |= 16;
        }
        ig.e.m135398xbf18edc9(eVar, this.f69961xf41e559e);
        if ((i17 & 32) != 0) {
            ig.e.m135399xbf19405f(eVar, this.f69959x2c555112);
            i18 |= 32;
        }
        int i19 = this.f69955x961a12dc;
        if ((i19 & 64) != 0) {
            ((com.p176xb6135e39.p283xc50a8b8b.h) this.f69962x9c2a99e7).f126678d = false;
            this.f69955x961a12dc = i19 & (-65);
        }
        ig.e.m135400xbf194420(eVar, this.f69962x9c2a99e7);
        int i27 = this.f69955x961a12dc;
        if ((i27 & 128) != 0) {
            ((com.p176xb6135e39.p283xc50a8b8b.h) this.f69958x2eff44a3).f126678d = false;
            this.f69955x961a12dc = i27 & (-129);
        }
        ig.e.m135401xbf1947e1(eVar, this.f69958x2eff44a3);
        int i28 = this.f69955x961a12dc;
        if ((i28 & 256) != 0) {
            ((com.p176xb6135e39.p283xc50a8b8b.h) this.f69957x9c21dcfd).f126678d = false;
            this.f69955x961a12dc = i28 & (-257);
        }
        ig.e.m135402xbf194ba2(eVar, this.f69957x9c21dcfd);
        int i29 = this.f69955x961a12dc;
        if ((i29 & 512) != 0) {
            ((com.p176xb6135e39.p283xc50a8b8b.h) this.f69964xd20e7a23).f126678d = false;
            this.f69955x961a12dc = i29 & (-513);
        }
        ig.e.m135403xbf194f63(eVar, this.f69964xd20e7a23);
        int i37 = this.f69955x961a12dc;
        if ((i37 & 1024) != 0) {
            ((com.p176xb6135e39.p283xc50a8b8b.h) this.f69963x5af9577d).f126678d = false;
            this.f69955x961a12dc = i37 & (-1025);
        }
        ig.e.m135404xbf195324(eVar, this.f69963x5af9577d);
        if ((i17 & 2048) != 0) {
            i18 |= 64;
        }
        ig.e.m135405xbf1956e5(eVar, this.f69954x979e6fc6);
        if ((i17 & 4096) != 0) {
            i18 |= 128;
        }
        ig.e.m135406xbf195aa6(eVar, this.f69953xc655cbae);
        ig.e.m135407xbf195e67(eVar, i18);
        m20880xaf619bdf();
        return eVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearField, reason: merged with bridge method [inline-methods] */
    public ig.d m135315xd2ece2ad(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        super.m135315xd2ece2ad(b4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.e mo20559x786693c3() {
        return ig.e.m135423x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public ig.d mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
    public ig.d m135383xe229305e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17, java.lang.Object obj) {
        super.m135383xe229305e(b4Var, i17, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public final ig.d mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.d m135321xd36dfc70(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        super.m135321xd36dfc70(g4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.d m135367xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (ig.d) super.m135367xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.d m135309x5a5b64d() {
        super.m135309x5a5b64d();
        this.f69960x730746e1 = 1;
        int i17 = this.f69955x961a12dc & (-2);
        this.f69956xe3810945 = 0L;
        this.f69952xe20f102c = "";
        this.f69951xc336ac1e = "";
        this.f69961xf41e559e = "";
        this.f69959x2c555112 = false;
        this.f69955x961a12dc = i17 & (-3) & (-5) & (-9) & (-17) & (-33);
        this.f69962x9c2a99e7 = ig.e.m135389xbf187968();
        this.f69955x961a12dc &= -65;
        this.f69958x2eff44a3 = ig.e.m135390xbf18cbfe();
        this.f69955x961a12dc &= -129;
        this.f69957x9c21dcfd = ig.e.m135391xbf18cfbf();
        this.f69955x961a12dc &= -257;
        this.f69964xd20e7a23 = ig.e.m135392xbf18d380();
        this.f69955x961a12dc &= -513;
        this.f69963x5af9577d = ig.e.m135393xbf18d741();
        int i18 = this.f69955x961a12dc & (-1025);
        this.f69954x979e6fc6 = "";
        this.f69953xc655cbae = "";
        this.f69955x961a12dc = i18 & (-2049) & (-4097);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.d m135330x5a5dd5d() {
        return (ig.d) super.m135330x5a5dd5d();
    }

    private d(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        super(r5Var);
        this.f69960x730746e1 = 1;
        this.f69952xe20f102c = "";
        this.f69951xc336ac1e = "";
        this.f69961xf41e559e = "";
        this.f69962x9c2a99e7 = ig.e.m135408xbf196226();
        this.f69958x2eff44a3 = ig.e.m135411xbf19bc3e();
        this.f69957x9c21dcfd = ig.e.m135414xbf19c781();
        this.f69964xd20e7a23 = ig.e.m135417xbf19d2c4();
        this.f69963x5af9577d = ig.e.m135420xbf1a2cdc();
        this.f69954x979e6fc6 = "";
        this.f69953xc655cbae = "";
        m135296x73fef578();
    }
}
