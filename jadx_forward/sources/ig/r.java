package ig;

/* loaded from: classes16.dex */
public final class r extends com.p176xb6135e39.p283xc50a8b8b.q5 implements ig.t {

    /* renamed from: bitField0_ */
    private int f70151x961a12dc;

    /* renamed from: previewDurationMs_ */
    private long f70152xed4f205d;

    /* renamed from: previewMusicId_ */
    private java.lang.Object f70153x1f134227;

    /* renamed from: previewMusicSongName_ */
    private java.lang.Object f70154xbe3f9462;

    /* renamed from: previewMusicSourceType_ */
    private int f70155xd97518d;

    /* renamed from: timelineDurationMs_ */
    private long f70156x80c05a44;

    private r() {
        super(null);
        this.f70153x1f134227 = "";
        this.f70155xd97518d = 1;
        this.f70154xbe3f9462 = "";
        m135999x73fef578();
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135998xc1a58b65() {
        return ig.y0.f372823e;
    }

    /* renamed from: maybeForceBuilderInitialization */
    private void m135999x73fef578() {
        boolean unused;
        unused = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
    }

    /* renamed from: clearPreviewDurationMs */
    public ig.r m136006x3ad03575() {
        this.f70151x961a12dc &= -9;
        this.f70152xed4f205d = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearPreviewMusicId */
    public ig.r m136007xedce5ce5() {
        this.f70151x961a12dc &= -2;
        this.f70153x1f134227 = ig.s.m136149x7c90cfc0().mo136017x52b1322e();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearPreviewMusicSongName */
    public ig.r m136008xc2218a() {
        this.f70151x961a12dc &= -5;
        this.f70154xbe3f9462 = ig.s.m136149x7c90cfc0().mo136019x59181c13();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearPreviewMusicSourceType */
    public ig.r m136009x19cfcbbf() {
        this.f70151x961a12dc &= -3;
        this.f70155xd97518d = 1;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTimelineDurationMs */
    public ig.r m136010xc271aea8() {
        this.f70151x961a12dc &= -17;
        this.f70156x80c05a44 = 0L;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return ig.y0.f372823e;
    }

    @Override // ig.t
    /* renamed from: getPreviewDurationMs */
    public long mo136016x73a26f8c() {
        return this.f70152xed4f205d;
    }

    @Override // ig.t
    /* renamed from: getPreviewMusicId */
    public java.lang.String mo136017x52b1322e() {
        java.lang.Object obj = this.f70153x1f134227;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70153x1f134227 = r17;
        }
        return r17;
    }

    @Override // ig.t
    /* renamed from: getPreviewMusicIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136018x5897cadd() {
        java.lang.Object obj = this.f70153x1f134227;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70153x1f134227 = h17;
        return h17;
    }

    @Override // ig.t
    /* renamed from: getPreviewMusicSongName */
    public java.lang.String mo136019x59181c13() {
        java.lang.Object obj = this.f70154xbe3f9462;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70154xbe3f9462 = r17;
        }
        return r17;
    }

    @Override // ig.t
    /* renamed from: getPreviewMusicSongNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136020x81e04818() {
        java.lang.Object obj = this.f70154xbe3f9462;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70154xbe3f9462 = h17;
        return h17;
    }

    @Override // ig.t
    /* renamed from: getPreviewMusicSourceType */
    public ig.p mo136021xb4914808() {
        ig.p a17 = ig.p.a(this.f70155xd97518d);
        return a17 == null ? ig.p.RECOMMEND : a17;
    }

    @Override // ig.t
    /* renamed from: getTimelineDurationMs */
    public long mo136022xa3e6b771() {
        return this.f70156x80c05a44;
    }

    @Override // ig.t
    /* renamed from: hasPreviewDurationMs */
    public boolean mo136023x6008dcc8() {
        return (this.f70151x961a12dc & 8) != 0;
    }

    @Override // ig.t
    /* renamed from: hasPreviewMusicId */
    public boolean mo136024xc3382e72() {
        return (this.f70151x961a12dc & 1) != 0;
    }

    @Override // ig.t
    /* renamed from: hasPreviewMusicSongName */
    public boolean mo136025x7c99d557() {
        return (this.f70151x961a12dc & 4) != 0;
    }

    @Override // ig.t
    /* renamed from: hasPreviewMusicSourceType */
    public boolean mo136026xfe89c04c() {
        return (this.f70151x961a12dc & 2) != 0;
    }

    @Override // ig.t
    /* renamed from: hasTimelineDurationMs */
    public boolean mo136027x444df1b5() {
        return (this.f70151x961a12dc & 16) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372824f;
        j6Var.c(ig.s.class, ig.r.class);
        return j6Var;
    }

    /* renamed from: setPreviewDurationMs */
    public ig.r m136029x4f387c00(long j17) {
        this.f70151x961a12dc |= 8;
        this.f70152xed4f205d = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPreviewMusicId */
    public ig.r m136030x1aa79a3a(java.lang.String str) {
        str.getClass();
        this.f70151x961a12dc |= 1;
        this.f70153x1f134227 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPreviewMusicIdBytes */
    public ig.r m136031xa6dc8a51(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70151x961a12dc |= 1;
        this.f70153x1f134227 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPreviewMusicSongName */
    public ig.r m136032xd36b4b1f(java.lang.String str) {
        str.getClass();
        this.f70151x961a12dc |= 4;
        this.f70154xbe3f9462 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPreviewMusicSongNameBytes */
    public ig.r m136033xcbaca08c(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70151x961a12dc |= 4;
        this.f70154xbe3f9462 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPreviewMusicSourceType */
    public ig.r m136034xe6d4e414(ig.p pVar) {
        pVar.getClass();
        this.f70151x961a12dc |= 2;
        this.f70155xd97518d = pVar.f372818d;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTimelineDurationMs */
    public ig.r m136036x3b12397d(long j17) {
        this.f70151x961a12dc |= 16;
        this.f70156x80c05a44 = j17;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public ig.r mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public ig.s mo20556x59bc66e() {
        ig.s mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public ig.s mo20557x85702333() {
        ig.s sVar = new ig.s(this);
        int i17 = this.f70151x961a12dc;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        sVar.f70185x1f134227 = this.f70153x1f134227;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        sVar.f70187xd97518d = this.f70155xd97518d;
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        sVar.f70186xbe3f9462 = this.f70154xbe3f9462;
        if ((i17 & 8) != 0) {
            sVar.f70184xed4f205d = this.f70152xed4f205d;
            i18 |= 8;
        }
        if ((i17 & 16) != 0) {
            sVar.f70188x80c05a44 = this.f70156x80c05a44;
            i18 |= 16;
        }
        sVar.f70183x961a12dc = i18;
        m20880xaf619bdf();
        return sVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearField, reason: merged with bridge method [inline-methods] */
    public ig.r m136003xd2ece2ad(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        super.m136003xd2ece2ad(b4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.s mo20559x786693c3() {
        return ig.s.m136149x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public ig.r mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
    public ig.r m136035xe229305e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17, java.lang.Object obj) {
        super.m136035xe229305e(b4Var, i17, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public final ig.r mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.r m136005xd36dfc70(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        super.m136005xd36dfc70(g4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.r m136028xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (ig.r) super.m136028xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.r m136002x5a5b64d() {
        super.m136002x5a5b64d();
        this.f70153x1f134227 = "";
        int i17 = this.f70151x961a12dc & (-2);
        this.f70155xd97518d = 1;
        this.f70154xbe3f9462 = "";
        this.f70152xed4f205d = 0L;
        this.f70156x80c05a44 = 0L;
        this.f70151x961a12dc = i17 & (-3) & (-5) & (-9) & (-17);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.r m136015x5a5dd5d() {
        return (ig.r) super.m136015x5a5dd5d();
    }

    private r(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        super(r5Var);
        this.f70153x1f134227 = "";
        this.f70155xd97518d = 1;
        this.f70154xbe3f9462 = "";
        m135999x73fef578();
    }
}
