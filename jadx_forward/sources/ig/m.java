package ig;

/* loaded from: classes16.dex */
public final class m extends com.p176xb6135e39.p283xc50a8b8b.q5 implements ig.o {

    /* renamed from: assetsBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.p9 f70061xe786a8c7;

    /* renamed from: assets_ */
    private java.util.List<ig.e> f70062xd5fdfd3c;

    /* renamed from: bitField0_ */
    private int f70063x961a12dc;

    /* renamed from: exportDurationMs_ */
    private long f70064xc85004f1;

    /* renamed from: exportMusicId_ */
    private java.lang.Object f70065x4aac613;

    /* renamed from: exportMusicSongName_ */
    private java.lang.Object f70066x6b27774e;

    /* renamed from: exportMusicSourceType_ */
    private int f70067x20122979;

    /* renamed from: exportTemplateId_ */
    private java.lang.Object f70068x4e494376;

    /* renamed from: exportTemplateSourceType_ */
    private int f70069xac5a93dc;

    /* renamed from: fixedTemplateIds_ */
    private com.p176xb6135e39.p283xc50a8b8b.g7 f70070xdea561d5;

    /* renamed from: templateActionsBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.p9 f70071x64988c67;

    /* renamed from: templateActions_ */
    private java.util.List<ig.w> f70072xa96eed9c;

    /* renamed from: templateRecommendationBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70073x78cf6017;

    /* renamed from: templateRecommendation_ */
    private ig.a0 f70074x87c1dfec;

    /* renamed from: totalPreviewDurationMs_ */
    private long f70075x8b0aeec1;

    private m() {
        super(null);
        this.f70062xd5fdfd3c = java.util.Collections.emptyList();
        this.f70072xa96eed9c = java.util.Collections.emptyList();
        this.f70068x4e494376 = "";
        this.f70065x4aac613 = "";
        this.f70066x6b27774e = "";
        this.f70067x20122979 = 1;
        this.f70069xac5a93dc = 0;
        this.f70070xdea561d5 = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        m135718x73fef578();
    }

    /* renamed from: ensureAssetsIsMutable */
    private void m135711xf755063b() {
        if ((this.f70063x961a12dc & 1) == 0) {
            this.f70062xd5fdfd3c = new java.util.ArrayList(this.f70062xd5fdfd3c);
            this.f70063x961a12dc |= 1;
        }
    }

    /* renamed from: ensureFixedTemplateIdsIsMutable */
    private void m135712x3ba3cf54() {
        if ((this.f70063x961a12dc & 1024) == 0) {
            this.f70070xdea561d5 = new com.p176xb6135e39.p283xc50a8b8b.f7(this.f70070xdea561d5);
            this.f70063x961a12dc |= 1024;
        }
    }

    /* renamed from: ensureTemplateActionsIsMutable */
    private void m135713x91aca517() {
        if ((this.f70063x961a12dc & 2) == 0) {
            this.f70072xa96eed9c = new java.util.ArrayList(this.f70072xa96eed9c);
            this.f70063x961a12dc |= 2;
        }
    }

    /* renamed from: getAssetsFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.p9 m135714x2f8fb65a() {
        if (this.f70061xe786a8c7 == null) {
            this.f70061xe786a8c7 = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f70062xd5fdfd3c, (this.f70063x961a12dc & 1) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70062xd5fdfd3c = null;
        }
        return this.f70061xe786a8c7;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135715xc1a58b65() {
        return ig.y0.f372829k;
    }

    /* renamed from: getTemplateActionsFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.p9 m135716xb6fddace() {
        if (this.f70071x64988c67 == null) {
            this.f70071x64988c67 = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f70072xa96eed9c, (this.f70063x961a12dc & 2) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70072xa96eed9c = null;
        }
        return this.f70071x64988c67;
    }

    /* renamed from: getTemplateRecommendationFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m135717x9c6599aa() {
        if (this.f70073x78cf6017 == null) {
            this.f70073x78cf6017 = new com.p176xb6135e39.p283xc50a8b8b.t9(mo135785x9fbbf1c9(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70074x87c1dfec = null;
        }
        return this.f70073x78cf6017;
    }

    /* renamed from: maybeForceBuilderInitialization */
    private void m135718x73fef578() {
        boolean z17;
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            m135714x2f8fb65a();
            m135716xb6fddace();
            m135717x9c6599aa();
        }
    }

    /* renamed from: addAllAssets */
    public ig.m m135719xbf4b28e3(java.lang.Iterable<? extends ig.e> iterable) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            m135711xf755063b();
            com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f70062xd5fdfd3c);
            m20881x7bb163d5();
        } else {
            p9Var.b(iterable);
        }
        return this;
    }

    /* renamed from: addAllFixedTemplateIds */
    public ig.m m135720xdded152a(java.lang.Iterable<java.lang.String> iterable) {
        m135712x3ba3cf54();
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f70070xdea561d5);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addAllTemplateActions */
    public ig.m m135721xdf1b4dc3(java.lang.Iterable<? extends ig.w> iterable) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        if (p9Var == null) {
            m135713x91aca517();
            com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f70072xa96eed9c);
            m20881x7bb163d5();
        } else {
            p9Var.b(iterable);
        }
        return this;
    }

    /* renamed from: addAssets */
    public ig.m m135725xe1481b84(ig.e eVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            eVar.getClass();
            m135711xf755063b();
            this.f70062xd5fdfd3c.add(eVar);
            m20881x7bb163d5();
        } else {
            p9Var.f(eVar);
        }
        return this;
    }

    /* renamed from: addAssetsBuilder */
    public ig.d m135726x5e8b2f77() {
        return (ig.d) m135714x2f8fb65a().d(ig.e.m135423x7c90cfc0());
    }

    /* renamed from: addFixedTemplateIds */
    public ig.m m135728x89b7f28b(java.lang.String str) {
        str.getClass();
        m135712x3ba3cf54();
        this.f70070xdea561d5.add(str);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addFixedTemplateIdsBytes */
    public ig.m m135729xd67bbca0(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        m135712x3ba3cf54();
        this.f70070xdea561d5.q(yVar);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addTemplateActions */
    public ig.m m135733x47bec042(ig.w wVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        if (p9Var == null) {
            wVar.getClass();
            m135713x91aca517();
            this.f70072xa96eed9c.add(wVar);
            m20881x7bb163d5();
        } else {
            p9Var.f(wVar);
        }
        return this;
    }

    /* renamed from: addTemplateActionsBuilder */
    public ig.v m135734x413358f9() {
        return (ig.v) m135716xb6fddace().d(ig.w.m136469x7c90cfc0());
    }

    /* renamed from: clearAssets */
    public ig.m m135739x82ba6830() {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            this.f70062xd5fdfd3c = java.util.Collections.emptyList();
            this.f70063x961a12dc &= -2;
            m20881x7bb163d5();
        } else {
            p9Var.h();
        }
        return this;
    }

    /* renamed from: clearExportDurationMs */
    public ig.m m135740xee89e19b() {
        this.f70063x961a12dc &= -9;
        this.f70064xc85004f1 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearExportMusicId */
    public ig.m m135741x6ff2927f() {
        this.f70063x961a12dc &= -33;
        this.f70065x4aac613 = ig.n.m135930x7c90cfc0().mo135766x522b7016();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearExportMusicSongName */
    public ig.m m135742xd4aa3ba4() {
        this.f70063x961a12dc &= -129;
        this.f70066x6b27774e = ig.n.m135930x7c90cfc0().mo135768x21d64bfb();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearExportMusicSourceType */
    public ig.m m135743x9419c759() {
        this.f70063x961a12dc &= -257;
        this.f70067x20122979 = 1;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearExportTemplateId */
    public ig.m m135744xf2dc3e76() {
        this.f70063x961a12dc &= -17;
        this.f70068x4e494376 = ig.n.m135930x7c90cfc0().mo135771xaa5ee57f();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearExportTemplateSourceType */
    public ig.m m135745xe22f8c50() {
        this.f70063x961a12dc &= -513;
        this.f70069xac5a93dc = 0;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearFixedTemplateIds */
    public ig.m m135747x73635837() {
        this.f70070xdea561d5 = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f70063x961a12dc &= -1025;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTemplateActions */
    public ig.m m135750x1579f516() {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        if (p9Var == null) {
            this.f70072xa96eed9c = java.util.Collections.emptyList();
            this.f70063x961a12dc &= -3;
            m20881x7bb163d5();
        } else {
            p9Var.h();
        }
        return this;
    }

    /* renamed from: clearTemplateRecommendation */
    public ig.m m135751x4fa7580() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70073x78cf6017;
        if (t9Var == null) {
            this.f70074x87c1dfec = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70063x961a12dc &= -65;
        return this;
    }

    /* renamed from: clearTotalPreviewDurationMs */
    public ig.m m135752x1599b80b() {
        this.f70063x961a12dc &= -5;
        this.f70075x8b0aeec1 = 0L;
        m20881x7bb163d5();
        return this;
    }

    @Override // ig.o
    /* renamed from: getAssets */
    public ig.e mo135758x11279679(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        return p9Var == null ? this.f70062xd5fdfd3c.get(i17) : (ig.e) p9Var.m(i17, false);
    }

    /* renamed from: getAssetsBuilder */
    public ig.d m135759x1fae66e2(int i17) {
        return (ig.d) m135714x2f8fb65a().k(i17);
    }

    /* renamed from: getAssetsBuilderList */
    public java.util.List<ig.d> m135760x42a04aa0() {
        com.p176xb6135e39.p283xc50a8b8b.p9 m135714x2f8fb65a = m135714x2f8fb65a();
        if (m135714x2f8fb65a.f126948g == null) {
            m135714x2f8fb65a.f126948g = new com.p176xb6135e39.p283xc50a8b8b.m9(m135714x2f8fb65a);
        }
        return m135714x2f8fb65a.f126948g;
    }

    @Override // ig.o
    /* renamed from: getAssetsCount */
    public int mo135761x5884ee16() {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        return p9Var == null ? this.f70062xd5fdfd3c.size() : p9Var.l();
    }

    @Override // ig.o
    /* renamed from: getAssetsList */
    public java.util.List<ig.e> mo135762x6e39d6b7() {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            return java.util.Collections.unmodifiableList(this.f70062xd5fdfd3c);
        }
        if (p9Var.f126947f == null) {
            p9Var.f126947f = new com.p176xb6135e39.p283xc50a8b8b.n9(p9Var);
        }
        return p9Var.f126947f;
    }

    @Override // ig.o
    /* renamed from: getAssetsOrBuilder */
    public ig.f mo135763x3e1865bf(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        return p9Var == null ? this.f70062xd5fdfd3c.get(i17) : (ig.f) p9Var.n(i17);
    }

    @Override // ig.o
    /* renamed from: getAssetsOrBuilderList */
    public java.util.List<? extends ig.f> mo135764xc0592fd() {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            return java.util.Collections.unmodifiableList(this.f70062xd5fdfd3c);
        }
        if (p9Var.f126949h == null) {
            p9Var.f126949h = new com.p176xb6135e39.p283xc50a8b8b.o9(p9Var);
        }
        return p9Var.f126949h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return ig.y0.f372829k;
    }

    @Override // ig.o
    /* renamed from: getExportDurationMs */
    public long mo135765xa60c88a4() {
        return this.f70064xc85004f1;
    }

    @Override // ig.o
    /* renamed from: getExportMusicId */
    public java.lang.String mo135766x522b7016() {
        java.lang.Object obj = this.f70065x4aac613;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70065x4aac613 = r17;
        }
        return r17;
    }

    @Override // ig.o
    /* renamed from: getExportMusicIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135767x98dffdf5() {
        java.lang.Object obj = this.f70065x4aac613;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70065x4aac613 = h17;
        return h17;
    }

    @Override // ig.o
    /* renamed from: getExportMusicSongName */
    public java.lang.String mo135768x21d64bfb() {
        java.lang.Object obj = this.f70066x6b27774e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70066x6b27774e = r17;
        }
        return r17;
    }

    @Override // ig.o
    /* renamed from: getExportMusicSongNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135769x3f8bc930() {
        java.lang.Object obj = this.f70066x6b27774e;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70066x6b27774e = h17;
        return h17;
    }

    @Override // ig.o
    /* renamed from: getExportMusicSourceType */
    public ig.p mo135770x46831df0() {
        ig.p a17 = ig.p.a(this.f70067x20122979);
        return a17 == null ? ig.p.RECOMMEND : a17;
    }

    @Override // ig.o
    /* renamed from: getExportTemplateId */
    public java.lang.String mo135771xaa5ee57f() {
        java.lang.Object obj = this.f70068x4e494376;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70068x4e494376 = r17;
        }
        return r17;
    }

    @Override // ig.o
    /* renamed from: getExportTemplateIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135772xc2ba822c() {
        java.lang.Object obj = this.f70068x4e494376;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70068x4e494376 = h17;
        return h17;
    }

    @Override // ig.o
    /* renamed from: getExportTemplateSourceType */
    public ig.c0 mo135773xd2831a59() {
        ig.c0 a17 = ig.c0.a(this.f70069xac5a93dc);
        return a17 == null ? ig.c0.UNKNOWN : a17;
    }

    @Override // ig.o
    /* renamed from: getFixedTemplateIds */
    public java.lang.String mo135774x2ae5ff40(int i17) {
        return (java.lang.String) this.f70070xdea561d5.get(i17);
    }

    @Override // ig.o
    /* renamed from: getFixedTemplateIdsBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135775x7112590b(int i17) {
        return this.f70070xdea561d5.f(i17);
    }

    @Override // ig.o
    /* renamed from: getFixedTemplateIdsCount */
    public int mo135776x711be9af() {
        return this.f70070xdea561d5.size();
    }

    @Override // ig.o
    /* renamed from: getTemplateActions */
    public ig.w mo135778x4cf1c8ed(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        return p9Var == null ? this.f70072xa96eed9c.get(i17) : (ig.w) p9Var.m(i17, false);
    }

    /* renamed from: getTemplateActionsBuilder */
    public ig.v m135779xf97049ee(int i17) {
        return (ig.v) m135716xb6fddace().k(i17);
    }

    /* renamed from: getTemplateActionsBuilderList */
    public java.util.List<ig.v> m135780xd361c7ac() {
        com.p176xb6135e39.p283xc50a8b8b.p9 m135716xb6fddace = m135716xb6fddace();
        if (m135716xb6fddace.f126948g == null) {
            m135716xb6fddace.f126948g = new com.p176xb6135e39.p283xc50a8b8b.m9(m135716xb6fddace);
        }
        return m135716xb6fddace.f126948g;
    }

    @Override // ig.o
    /* renamed from: getTemplateActionsCount */
    public int mo135781x33c2422() {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        return p9Var == null ? this.f70072xa96eed9c.size() : p9Var.l();
    }

    @Override // ig.o
    /* renamed from: getTemplateActionsList */
    public java.util.List<ig.w> mo135782x7bfdaf2b() {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        if (p9Var == null) {
            return java.util.Collections.unmodifiableList(this.f70072xa96eed9c);
        }
        if (p9Var.f126947f == null) {
            p9Var.f126947f = new com.p176xb6135e39.p283xc50a8b8b.n9(p9Var);
        }
        return p9Var.f126947f;
    }

    @Override // ig.o
    /* renamed from: getTemplateActionsOrBuilder */
    public ig.x mo135783xaeedb5cb(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        return p9Var == null ? this.f70072xa96eed9c.get(i17) : (ig.x) p9Var.n(i17);
    }

    @Override // ig.o
    /* renamed from: getTemplateActionsOrBuilderList */
    public java.util.List<? extends ig.x> mo135784x725bfd09() {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        if (p9Var == null) {
            return java.util.Collections.unmodifiableList(this.f70072xa96eed9c);
        }
        if (p9Var.f126949h == null) {
            p9Var.f126949h = new com.p176xb6135e39.p283xc50a8b8b.o9(p9Var);
        }
        return p9Var.f126949h;
    }

    @Override // ig.o
    /* renamed from: getTemplateRecommendation */
    public ig.a0 mo135785x9fbbf1c9() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70073x78cf6017;
        if (t9Var != null) {
            return (ig.a0) t9Var.e();
        }
        ig.a0 a0Var = this.f70074x87c1dfec;
        return a0Var == null ? ig.a0.m135249x7c90cfc0() : a0Var;
    }

    /* renamed from: getTemplateRecommendationBuilder */
    public ig.z m135786x43ebb192() {
        this.f70063x961a12dc |= 64;
        m20881x7bb163d5();
        return (ig.z) m135717x9c6599aa().d();
    }

    @Override // ig.o
    /* renamed from: getTemplateRecommendationOrBuilder */
    public ig.b0 mo135787x482dc46f() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70073x78cf6017;
        if (t9Var != null) {
            return (ig.b0) t9Var.f();
        }
        ig.a0 a0Var = this.f70074x87c1dfec;
        return a0Var == null ? ig.a0.m135249x7c90cfc0() : a0Var;
    }

    @Override // ig.o
    /* renamed from: getTotalPreviewDurationMs */
    public long mo135788xb05b3454() {
        return this.f70075x8b0aeec1;
    }

    @Override // ig.o
    /* renamed from: hasExportDurationMs */
    public boolean mo135789x10c583e8() {
        return (this.f70063x961a12dc & 8) != 0;
    }

    @Override // ig.o
    /* renamed from: hasExportMusicId */
    public boolean mo135790xea71db52() {
        return (this.f70063x961a12dc & 32) != 0;
    }

    @Override // ig.o
    /* renamed from: hasExportMusicSongName */
    public boolean mo135791x8e565a37() {
        return (this.f70063x961a12dc & 128) != 0;
    }

    @Override // ig.o
    /* renamed from: hasExportMusicSourceType */
    public boolean mo135792x93388d2c() {
        return (this.f70063x961a12dc & 256) != 0;
    }

    @Override // ig.o
    /* renamed from: hasExportTemplateId */
    public boolean mo135793x1517e0c3() {
        return (this.f70063x961a12dc & 16) != 0;
    }

    @Override // ig.o
    /* renamed from: hasExportTemplateSourceType */
    public boolean mo135794x803e919d() {
        return (this.f70063x961a12dc & 512) != 0;
    }

    @Override // ig.o
    /* renamed from: hasTemplateRecommendation */
    public boolean mo135795xe9b46a0d() {
        return (this.f70063x961a12dc & 64) != 0;
    }

    @Override // ig.o
    /* renamed from: hasTotalPreviewDurationMs */
    public boolean mo135796xfa53ac98() {
        return (this.f70063x961a12dc & 4) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372830l;
        j6Var.c(ig.n.class, ig.m.class);
        return j6Var;
    }

    /* renamed from: mergeTemplateRecommendation */
    public ig.m m135797xf2c512b(ig.a0 a0Var) {
        ig.a0 a0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70073x78cf6017;
        if (t9Var == null) {
            if ((this.f70063x961a12dc & 64) == 0 || (a0Var2 = this.f70074x87c1dfec) == null || a0Var2 == ig.a0.m135249x7c90cfc0()) {
                this.f70074x87c1dfec = a0Var;
            } else {
                this.f70074x87c1dfec = ((ig.z) ig.a0.m135252x3136c9db(this.f70074x87c1dfec).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) a0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(a0Var);
        }
        this.f70063x961a12dc |= 64;
        return this;
    }

    /* renamed from: removeAssets */
    public ig.m m135799xae5ce527(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            m135711xf755063b();
            this.f70062xd5fdfd3c.remove(i17);
            m20881x7bb163d5();
        } else {
            p9Var.r(i17);
        }
        return this;
    }

    /* renamed from: removeTemplateActions */
    public ig.m m135800x25bf1dff(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        if (p9Var == null) {
            m135713x91aca517();
            this.f70072xa96eed9c.remove(i17);
            m20881x7bb163d5();
        } else {
            p9Var.r(i17);
        }
        return this;
    }

    /* renamed from: setAssets */
    public ig.m m135802x45cca85(int i17, ig.e eVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            eVar.getClass();
            m135711xf755063b();
            this.f70062xd5fdfd3c.set(i17, eVar);
            m20881x7bb163d5();
        } else {
            p9Var.s(i17, eVar);
        }
        return this;
    }

    /* renamed from: setExportDurationMs */
    public ig.m m135803x4a091db0(long j17) {
        this.f70063x961a12dc |= 8;
        this.f70064xc85004f1 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setExportMusicId */
    public ig.m m135804xe501d68a(java.lang.String str) {
        str.getClass();
        this.f70063x961a12dc |= 32;
        this.f70065x4aac613 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setExportMusicIdBytes */
    public ig.m m135805x300b8001(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70063x961a12dc |= 32;
        this.f70065x4aac613 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setExportMusicSongName */
    public ig.m m135806x701b0b6f(java.lang.String str) {
        str.getClass();
        this.f70063x961a12dc |= 128;
        this.f70066x6b27774e = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setExportMusicSongNameBytes */
    public ig.m m135807xef58923c(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70063x961a12dc |= 128;
        this.f70066x6b27774e = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setExportMusicSourceType */
    public ig.m m135808x1695d064(ig.p pVar) {
        pVar.getClass();
        this.f70063x961a12dc |= 256;
        this.f70067x20122979 = pVar.f372818d;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setExportTemplateId */
    public ig.m m135809x4e5b7a8b(java.lang.String str) {
        str.getClass();
        this.f70063x961a12dc |= 16;
        this.f70068x4e494376 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setExportTemplateIdBytes */
    public ig.m m135810x92cd34a0(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70063x961a12dc |= 16;
        this.f70068x4e494376 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setExportTemplateSourceType */
    public ig.m m135811x824fe365(ig.c0 c0Var) {
        c0Var.getClass();
        this.f70063x961a12dc |= 512;
        this.f70069xac5a93dc = c0Var.f372807d;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setFixedTemplateIds */
    public ig.m m135812xcee2944c(int i17, java.lang.String str) {
        str.getClass();
        m135712x3ba3cf54();
        this.f70070xdea561d5.set(i17, str);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTemplateActions */
    public ig.m m135815x83c86261(int i17, ig.w wVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        if (p9Var == null) {
            wVar.getClass();
            m135713x91aca517();
            this.f70072xa96eed9c.set(i17, wVar);
            m20881x7bb163d5();
        } else {
            p9Var.s(i17, wVar);
        }
        return this;
    }

    /* renamed from: setTemplateRecommendation */
    public ig.m m135816xd1ff8dd5(ig.a0 a0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70073x78cf6017;
        if (t9Var == null) {
            a0Var.getClass();
            this.f70074x87c1dfec = a0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(a0Var);
        }
        this.f70063x961a12dc |= 64;
        return this;
    }

    /* renamed from: setTotalPreviewDurationMs */
    public ig.m m135818xe29ed060(long j17) {
        this.f70063x961a12dc |= 4;
        this.f70075x8b0aeec1 = j17;
        m20881x7bb163d5();
        return this;
    }

    @Override // ig.o
    /* renamed from: getFixedTemplateIdsList */
    public com.p176xb6135e39.p283xc50a8b8b.j9 mo135777x3d7883fe() {
        return this.f70070xdea561d5.b();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public ig.m mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public ig.n mo20556x59bc66e() {
        ig.n mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public ig.n mo20557x85702333() {
        int i17;
        ig.n nVar = new ig.n(this);
        int i18 = this.f70063x961a12dc;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            if ((i18 & 1) != 0) {
                this.f70062xd5fdfd3c = java.util.Collections.unmodifiableList(this.f70062xd5fdfd3c);
                this.f70063x961a12dc &= -2;
            }
            nVar.f70107xd5fdfd3c = this.f70062xd5fdfd3c;
        } else {
            nVar.f70107xd5fdfd3c = p9Var.g();
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f70071x64988c67;
        if (p9Var2 == null) {
            if ((this.f70063x961a12dc & 2) != 0) {
                this.f70072xa96eed9c = java.util.Collections.unmodifiableList(this.f70072xa96eed9c);
                this.f70063x961a12dc &= -3;
            }
            nVar.f70116xa96eed9c = this.f70072xa96eed9c;
        } else {
            nVar.f70116xa96eed9c = p9Var2.g();
        }
        if ((i18 & 4) != 0) {
            nVar.f70118x8b0aeec1 = this.f70075x8b0aeec1;
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            nVar.f70109xc85004f1 = this.f70064xc85004f1;
            i17 |= 2;
        }
        if ((i18 & 16) != 0) {
            i17 |= 4;
        }
        nVar.f70113x4e494376 = this.f70068x4e494376;
        if ((i18 & 32) != 0) {
            i17 |= 8;
        }
        nVar.f70110x4aac613 = this.f70065x4aac613;
        if ((i18 & 64) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70073x78cf6017;
            if (t9Var == null) {
                nVar.f70117x87c1dfec = this.f70074x87c1dfec;
            } else {
                nVar.f70117x87c1dfec = (ig.a0) t9Var.b();
            }
            i17 |= 16;
        }
        if ((i18 & 128) != 0) {
            i17 |= 32;
        }
        nVar.f70111x6b27774e = this.f70066x6b27774e;
        if ((i18 & 256) != 0) {
            i17 |= 64;
        }
        nVar.f70112x20122979 = this.f70067x20122979;
        if ((i18 & 512) != 0) {
            i17 |= 128;
        }
        nVar.f70114xac5a93dc = this.f70069xac5a93dc;
        if ((this.f70063x961a12dc & 1024) != 0) {
            this.f70070xdea561d5 = this.f70070xdea561d5.b();
            this.f70063x961a12dc &= -1025;
        }
        nVar.f70115xdea561d5 = this.f70070xdea561d5;
        nVar.f70108x961a12dc = i17;
        m20880xaf619bdf();
        return nVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearField, reason: merged with bridge method [inline-methods] */
    public ig.m m135746xd2ece2ad(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        super.m135746xd2ece2ad(b4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.n mo20559x786693c3() {
        return ig.n.m135930x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public ig.m mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
    public ig.m m135813xe229305e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17, java.lang.Object obj) {
        super.m135813xe229305e(b4Var, i17, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public final ig.m mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    /* renamed from: addAssetsBuilder */
    public ig.d m135727x5e8b2f77(int i17) {
        return (ig.d) m135714x2f8fb65a().c(i17, ig.e.m135423x7c90cfc0());
    }

    /* renamed from: addTemplateActionsBuilder */
    public ig.v m135735x413358f9(int i17) {
        return (ig.v) m135716xb6fddace().c(i17, ig.w.m136469x7c90cfc0());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.m m135749xd36dfc70(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        super.m135749xd36dfc70(g4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.m m135798xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (ig.m) super.m135798xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.m m135738x5a5b64d() {
        super.m135738x5a5b64d();
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            this.f70062xd5fdfd3c = java.util.Collections.emptyList();
            this.f70063x961a12dc &= -2;
        } else {
            p9Var.h();
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f70071x64988c67;
        if (p9Var2 == null) {
            this.f70072xa96eed9c = java.util.Collections.emptyList();
            this.f70063x961a12dc &= -3;
        } else {
            p9Var2.h();
        }
        this.f70075x8b0aeec1 = 0L;
        int i17 = this.f70063x961a12dc & (-5);
        this.f70064xc85004f1 = 0L;
        this.f70068x4e494376 = "";
        this.f70065x4aac613 = "";
        this.f70063x961a12dc = i17 & (-9) & (-17) & (-33);
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70073x78cf6017;
        if (t9Var == null) {
            this.f70074x87c1dfec = null;
        } else {
            t9Var.c();
        }
        int i18 = this.f70063x961a12dc & (-65);
        this.f70066x6b27774e = "";
        this.f70067x20122979 = 1;
        this.f70069xac5a93dc = 0;
        int i19 = i18 & (-129) & (-257) & (-513);
        this.f70063x961a12dc = i19;
        this.f70070xdea561d5 = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f70063x961a12dc = i19 & (-1025);
        return this;
    }

    /* renamed from: addAssets */
    public ig.m m135723xe1481b84(int i17, ig.e eVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            eVar.getClass();
            m135711xf755063b();
            this.f70062xd5fdfd3c.add(i17, eVar);
            m20881x7bb163d5();
        } else {
            p9Var.e(i17, eVar);
        }
        return this;
    }

    /* renamed from: addTemplateActions */
    public ig.m m135731x47bec042(int i17, ig.w wVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        if (p9Var == null) {
            wVar.getClass();
            m135713x91aca517();
            this.f70072xa96eed9c.add(i17, wVar);
            m20881x7bb163d5();
        } else {
            p9Var.e(i17, wVar);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.m m135757x5a5dd5d() {
        return (ig.m) super.m135757x5a5dd5d();
    }

    /* renamed from: setAssets */
    public ig.m m135801x45cca85(int i17, ig.d dVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            m135711xf755063b();
            this.f70062xd5fdfd3c.set(i17, dVar.mo20556x59bc66e());
            m20881x7bb163d5();
        } else {
            p9Var.s(i17, dVar.mo20556x59bc66e());
        }
        return this;
    }

    /* renamed from: setTemplateActions */
    public ig.m m135814x83c86261(int i17, ig.v vVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        if (p9Var == null) {
            m135713x91aca517();
            this.f70072xa96eed9c.set(i17, vVar.mo20556x59bc66e());
            m20881x7bb163d5();
        } else {
            p9Var.s(i17, vVar.mo20556x59bc66e());
        }
        return this;
    }

    /* renamed from: setTemplateRecommendation */
    public ig.m m135817xd1ff8dd5(ig.z zVar) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70073x78cf6017;
        if (t9Var == null) {
            this.f70074x87c1dfec = zVar.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(zVar.mo20556x59bc66e());
        }
        this.f70063x961a12dc |= 64;
        return this;
    }

    private m(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        super(r5Var);
        this.f70062xd5fdfd3c = java.util.Collections.emptyList();
        this.f70072xa96eed9c = java.util.Collections.emptyList();
        this.f70068x4e494376 = "";
        this.f70065x4aac613 = "";
        this.f70066x6b27774e = "";
        this.f70067x20122979 = 1;
        this.f70069xac5a93dc = 0;
        this.f70070xdea561d5 = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        m135718x73fef578();
    }

    /* renamed from: addAssets */
    public ig.m m135724xe1481b84(ig.d dVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            m135711xf755063b();
            this.f70062xd5fdfd3c.add(dVar.mo20556x59bc66e());
            m20881x7bb163d5();
        } else {
            p9Var.f(dVar.mo20556x59bc66e());
        }
        return this;
    }

    /* renamed from: addTemplateActions */
    public ig.m m135732x47bec042(ig.v vVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        if (p9Var == null) {
            m135713x91aca517();
            this.f70072xa96eed9c.add(vVar.mo20556x59bc66e());
            m20881x7bb163d5();
        } else {
            p9Var.f(vVar.mo20556x59bc66e());
        }
        return this;
    }

    /* renamed from: addAssets */
    public ig.m m135722xe1481b84(int i17, ig.d dVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70061xe786a8c7;
        if (p9Var == null) {
            m135711xf755063b();
            this.f70062xd5fdfd3c.add(i17, dVar.mo20556x59bc66e());
            m20881x7bb163d5();
        } else {
            p9Var.e(i17, dVar.mo20556x59bc66e());
        }
        return this;
    }

    /* renamed from: addTemplateActions */
    public ig.m m135730x47bec042(int i17, ig.v vVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70071x64988c67;
        if (p9Var == null) {
            m135713x91aca517();
            this.f70072xa96eed9c.add(i17, vVar.mo20556x59bc66e());
            m20881x7bb163d5();
        } else {
            p9Var.e(i17, vVar.mo20556x59bc66e());
        }
        return this;
    }
}
