package ig;

/* loaded from: classes16.dex */
public final class v0 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements ig.x0 {

    /* renamed from: beginTimeStamp_ */
    private long f70231x416b3bb2;

    /* renamed from: bitField0_ */
    private int f70232x961a12dc;

    /* renamed from: endReason_ */
    private java.lang.Object f70233x4dfc2940;

    /* renamed from: enterScene_ */
    private int f70234x26d6a4b;

    /* renamed from: entryType_ */
    private java.lang.Object f70235x8a42d713;

    /* renamed from: firstImpressionTimeCostMs_ */
    private long f70236xd992f646;

    /* renamed from: lastStateId_ */
    private java.lang.Object f70237xe805c509;

    /* renamed from: lastViewId_ */
    private java.lang.Object f70238x8b60b649;

    /* renamed from: maasVersion_ */
    private java.lang.Object f70239x6965c16d;

    /* renamed from: mcMetricsBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70240xb3cc191;

    /* renamed from: mcMetrics_ */
    private ig.f0 f70241x43b5d3b2;

    /* renamed from: metricsType_ */
    private int f70242x9618a962;

    /* renamed from: metricsVersion_ */
    private long f70243x91e2306a;

    /* renamed from: parentEnterScene_ */
    private int f70244x416edb41;

    /* renamed from: postId_ */
    private java.lang.Object f70245xe8ae41e4;

    /* renamed from: resultInfoMcBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70246x5a09dca5;

    /* renamed from: resultInfoMcMaterialBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70247x38137dec;

    /* renamed from: resultInfoMcMaterial_ */
    private ig.f0 f70248x634477b7;

    /* renamed from: resultInfoMc_ */
    private ig.f0 f70249x3dd0471e;

    /* renamed from: resultInfoMediaBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70250x20ad1f7d;

    /* renamed from: resultInfoMedia_ */
    private ig.f0 f70251x50a40746;

    /* renamed from: resultInfoScBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70252x13c2835f;

    /* renamed from: resultInfoSc_ */
    private ig.f0 f70253x3dd05da4;

    /* renamed from: resultOriginType_ */
    private java.lang.Object f70254x67d2dc82;

    /* renamed from: scMetricsBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70255xef37f597;

    /* renamed from: scMetrics_ */
    private ig.f0 f70256xfd6e7a6c;

    /* renamed from: scPreloadBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70257x31fcfcdd;

    /* renamed from: scPreload_ */
    private ig.f0 f70258xcad875e6;

    /* renamed from: scPreviewPrefBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70259x8556fadf;

    /* renamed from: scPreviewPref_ */
    private ig.f0 f70260x6b0b5624;

    /* renamed from: scRecordPrefBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70261x2a01dcc8;

    /* renamed from: scRecordPref_ */
    private ig.f0 f70262xcfaad85b;

    /* renamed from: sessionId_ */
    private java.lang.Object f70263x630d8c2e;

    /* renamed from: startupOptionsBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70264xb425fca5;

    /* renamed from: startupOptions_ */
    private ig.f0 f70265x7d18271e;

    /* renamed from: totalDownloadBytes_ */
    private long f70266x283e1c60;

    /* renamed from: totalDurationMs_ */
    private long f70267x6a3ce361;

    /* renamed from: validationCode_ */
    private long f70268xfa443b19;

    /* renamed from: visitedStates_ */
    private long f70269x2cf45413;

    /* renamed from: visitedViews_ */
    private long f70270x9a9dcb7b;

    private v0() {
        super(null);
        this.f70242x9618a962 = 0;
        this.f70263x630d8c2e = "";
        this.f70235x8a42d713 = "";
        this.f70239x6965c16d = "";
        this.f70233x4dfc2940 = "";
        this.f70238x8b60b649 = "";
        this.f70237xe805c509 = "";
        this.f70254x67d2dc82 = "";
        this.f70245xe8ae41e4 = "";
        m136276x73fef578();
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m136265xc1a58b65() {
        return ig.y0.f372833o;
    }

    /* renamed from: getMcMetricsFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m136266xdde7ca78() {
        if (this.f70240xb3cc191 == null) {
            this.f70240xb3cc191 = new com.p176xb6135e39.p283xc50a8b8b.t9(mo136330xe8d66797(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70241x43b5d3b2 = null;
        }
        return this.f70240xb3cc191;
    }

    /* renamed from: getResultInfoMcFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m136267xa029fab8() {
        if (this.f70246x5a09dca5 == null) {
            this.f70246x5a09dca5 = new com.p176xb6135e39.p283xc50a8b8b.t9(mo136338x5aaef7d7(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70249x3dd0471e = null;
        }
        return this.f70246x5a09dca5;
    }

    /* renamed from: getResultInfoMcMaterialFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m136268x80cdca7f() {
        if (this.f70247x38137dec == null) {
            this.f70247x38137dec = new com.p176xb6135e39.p283xc50a8b8b.t9(mo136340x6eeefa1e(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70248x634477b7 = null;
        }
        return this.f70247x38137dec;
    }

    /* renamed from: getResultInfoMediaFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m136269x61c6f2e4() {
        if (this.f70250x20ad1f7d == null) {
            this.f70250x20ad1f7d = new com.p176xb6135e39.p283xc50a8b8b.t9(mo136344xef3dd203(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70251x50a40746 = null;
        }
        return this.f70250x20ad1f7d;
    }

    /* renamed from: getResultInfoScFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m136270xeb5cb472() {
        if (this.f70252x13c2835f == null) {
            this.f70252x13c2835f = new com.p176xb6135e39.p283xc50a8b8b.t9(mo136347x5aaef891(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70253x3dd05da4 = null;
        }
        return this.f70252x13c2835f;
    }

    /* renamed from: getScMetricsFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m136271x297d8b7e() {
        if (this.f70255xef37f597 == null) {
            this.f70255xef37f597 = new com.p176xb6135e39.p283xc50a8b8b.t9(mo136352x6271019d(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70256xfd6e7a6c = null;
        }
        return this.f70255xef37f597;
    }

    /* renamed from: getScPreloadFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m136272xe8417fc4() {
        if (this.f70257x31fcfcdd == null) {
            this.f70257x31fcfcdd = new com.p176xb6135e39.p283xc50a8b8b.t9(mo136355x167caee3(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70258xcad875e6 = null;
        }
        return this.f70257x31fcfcdd;
    }

    /* renamed from: getScPreviewPrefFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m136273xa86277c6() {
        if (this.f70259x8556fadf == null) {
            this.f70259x8556fadf = new com.p176xb6135e39.p283xc50a8b8b.t9(mo136358xf26019e5(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70260x6b0b5624 = null;
        }
        return this.f70259x8556fadf;
    }

    /* renamed from: getScRecordPrefFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m136274xb60f315b() {
        if (this.f70261x2a01dcc8 == null) {
            this.f70261x2a01dcc8 = new com.p176xb6135e39.p283xc50a8b8b.t9(mo136361xccecafa(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70262xcfaad85b = null;
        }
        return this.f70261x2a01dcc8;
    }

    /* renamed from: getStartupOptionsFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m136275x7e579538() {
        if (this.f70264xb425fca5 == null) {
            this.f70264xb425fca5 = new com.p176xb6135e39.p283xc50a8b8b.t9(mo136366xb0905257(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70265x7d18271e = null;
        }
        return this.f70264xb425fca5;
    }

    /* renamed from: maybeForceBuilderInitialization */
    private void m136276x73fef578() {
        boolean z17;
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            m136269x61c6f2e4();
            m136270xeb5cb472();
            m136267xa029fab8();
            m136271x297d8b7e();
            m136272xe8417fc4();
            m136273xa86277c6();
            m136274xb60f315b();
            m136266xdde7ca78();
            m136268x80cdca7f();
            m136275x7e579538();
        }
    }

    /* renamed from: clearBeginTimeStamp */
    public ig.v0 m136280xb51b85fa() {
        this.f70232x961a12dc &= -17;
        this.f70231x416b3bb2 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearEndReason */
    public ig.v0 m136281x94ae732() {
        this.f70232x961a12dc &= -65;
        this.f70233x4dfc2940 = ig.w0.m136519x7c90cfc0().mo136318x5cc82849();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearEnterScene */
    public ig.v0 m136282xa09d7ec1() {
        this.f70232x961a12dc &= -8388609;
        this.f70234x26d6a4b = 0;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearEntryType */
    public ig.v0 m136283x8f5db2ff() {
        this.f70232x961a12dc &= -5;
        this.f70235x8a42d713 = ig.w0.m136519x7c90cfc0().mo136321xe2daf416();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearFirstImpressionTimeCostMs */
    public ig.v0 m136285xf83a9b6c() {
        this.f70232x961a12dc &= -4097;
        this.f70236xd992f646 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearLastStateId */
    public ig.v0 m136286x6fdeed89() {
        this.f70232x961a12dc &= -257;
        this.f70237xe805c509 = ig.w0.m136519x7c90cfc0().mo136324xd91044e0();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearLastViewId */
    public ig.v0 m136287x4a31bb03() {
        this.f70232x961a12dc &= -129;
        this.f70238x8b60b649 = ig.w0.m136519x7c90cfc0().mo136326x665c9ccc();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearMaasVersion */
    public ig.v0 m136288xb61bd4a5() {
        this.f70232x961a12dc &= -9;
        this.f70239x6965c16d = ig.w0.m136519x7c90cfc0().mo136328x1f4d2bfc();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearMcMetrics */
    public ig.v0 m136289x95592680() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70240xb3cc191;
        if (t9Var == null) {
            this.f70241x43b5d3b2 = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70232x961a12dc &= -33554433;
        return this;
    }

    /* renamed from: clearMetricsType */
    public ig.v0 m136290xa219a10() {
        this.f70232x961a12dc &= -2;
        this.f70242x9618a962 = 0;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearMetricsVersion */
    public ig.v0 m136291x44171a42() {
        this.f70232x961a12dc &= -2049;
        this.f70243x91e2306a = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearParentEnterScene */
    public ig.v0 m136294x660f014b() {
        this.f70232x961a12dc &= -16777217;
        this.f70244x416edb41 = 0;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearPostId */
    public ig.v0 m136295x9c1aee88() {
        this.f70232x961a12dc &= -268435457;
        this.f70245xe8ae41e4 = ig.w0.m136519x7c90cfc0().mo136336x2a881cd1();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearResultInfoMc */
    public ig.v0 m136296x9db5644e() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70246x5a09dca5;
        if (t9Var == null) {
            this.f70249x3dd0471e = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70232x961a12dc &= -262145;
        return this;
    }

    /* renamed from: clearResultInfoMcMaterial */
    public ig.v0 m136297x1698ff95() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70247x38137dec;
        if (t9Var == null) {
            this.f70248x634477b7 = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70232x961a12dc &= -67108865;
        return this;
    }

    /* renamed from: clearResultInfoMedia */
    public ig.v0 m136298xb7c5fe2c() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70250x20ad1f7d;
        if (t9Var == null) {
            this.f70251x50a40746 = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70232x961a12dc &= -65537;
        return this;
    }

    /* renamed from: clearResultInfoSc */
    public ig.v0 m136299x9db56508() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70252x13c2835f;
        if (t9Var == null) {
            this.f70253x3dd05da4 = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70232x961a12dc &= -131073;
        return this;
    }

    /* renamed from: clearResultOriginType */
    public ig.v0 m136300xc7553ea() {
        this.f70232x961a12dc &= -32769;
        this.f70254x67d2dc82 = ig.w0.m136519x7c90cfc0().mo136350xc3f7faf3();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearScMetrics */
    public ig.v0 m136301xef3c086() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70255xef37f597;
        if (t9Var == null) {
            this.f70256xfd6e7a6c = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70232x961a12dc &= -524289;
        return this;
    }

    /* renamed from: clearScPreload */
    public ig.v0 m136302xc2ff6dcc() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70257x31fcfcdd;
        if (t9Var == null) {
            this.f70258xcad875e6 = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70232x961a12dc &= -1048577;
        return this;
    }

    /* renamed from: clearScPreviewPref */
    public ig.v0 m136303x10273c4e() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70259x8556fadf;
        if (t9Var == null) {
            this.f70260x6b0b5624 = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70232x961a12dc &= -2097153;
        return this;
    }

    /* renamed from: clearScRecordPref */
    public ig.v0 m136304x4fd53771() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70261x2a01dcc8;
        if (t9Var == null) {
            this.f70262xcfaad85b = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70232x961a12dc &= -4194305;
        return this;
    }

    /* renamed from: clearSessionId */
    public ig.v0 m136305xd02a6e84() {
        this.f70232x961a12dc &= -3;
        this.f70263x630d8c2e = ig.w0.m136519x7c90cfc0().mo136364x23a7af9b();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearStartupOptions */
    public ig.v0 m136306x4bad7d0e() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70264xb425fca5;
        if (t9Var == null) {
            this.f70265x7d18271e = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70232x961a12dc &= -134217729;
        return this;
    }

    /* renamed from: clearTotalDownloadBytes */
    public ig.v0 m136307xf965390c() {
        this.f70232x961a12dc &= -8193;
        this.f70266x283e1c60 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTotalDurationMs */
    public ig.v0 m136308xe1e3b2b1() {
        this.f70232x961a12dc &= -33;
        this.f70267x6a3ce361 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearValidationCode */
    public ig.v0 m136309x79017db3() {
        this.f70232x961a12dc &= -16385;
        this.f70268xfa443b19 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearVisitedStates */
    public ig.v0 m136310x713f447f() {
        this.f70232x961a12dc &= -1025;
        this.f70269x2cf45413 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearVisitedViews */
    public ig.v0 m136311x6f276051() {
        this.f70232x961a12dc &= -513;
        this.f70270x9a9dcb7b = 0L;
        m20881x7bb163d5();
        return this;
    }

    @Override // ig.x0
    /* renamed from: getBeginTimeStamp */
    public long mo136317x19fe5b43() {
        return this.f70231x416b3bb2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return ig.y0.f372833o;
    }

    @Override // ig.x0
    /* renamed from: getEndReason */
    public java.lang.String mo136318x5cc82849() {
        java.lang.Object obj = this.f70233x4dfc2940;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70233x4dfc2940 = r17;
        }
        return r17;
    }

    @Override // ig.x0
    /* renamed from: getEndReasonBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136319x227d6da2() {
        java.lang.Object obj = this.f70233x4dfc2940;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70233x4dfc2940 = h17;
        return h17;
    }

    @Override // ig.x0
    /* renamed from: getEnterScene */
    public int mo136320xbcc8608a() {
        return this.f70234x26d6a4b;
    }

    @Override // ig.x0
    /* renamed from: getEntryType */
    public java.lang.String mo136321xe2daf416() {
        java.lang.Object obj = this.f70235x8a42d713;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70235x8a42d713 = r17;
        }
        return r17;
    }

    @Override // ig.x0
    /* renamed from: getEntryTypeBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136322x5d42f9f5() {
        java.lang.Object obj = this.f70235x8a42d713;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70235x8a42d713 = h17;
        return h17;
    }

    @Override // ig.x0
    /* renamed from: getFirstImpressionTimeCostMs */
    public long mo136323x1258ce83() {
        return this.f70236xd992f646;
    }

    @Override // ig.x0
    /* renamed from: getLastStateId */
    public java.lang.String mo136324xd91044e0() {
        java.lang.Object obj = this.f70237xe805c509;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70237xe805c509 = r17;
        }
        return r17;
    }

    @Override // ig.x0
    /* renamed from: getLastStateIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136325xdc92976b() {
        java.lang.Object obj = this.f70237xe805c509;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70237xe805c509 = h17;
        return h17;
    }

    @Override // ig.x0
    /* renamed from: getLastViewId */
    public java.lang.String mo136326x665c9ccc() {
        java.lang.Object obj = this.f70238x8b60b649;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70238x8b60b649 = r17;
        }
        return r17;
    }

    @Override // ig.x0
    /* renamed from: getLastViewIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136327xc71c52ff() {
        java.lang.Object obj = this.f70238x8b60b649;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70238x8b60b649 = h17;
        return h17;
    }

    @Override // ig.x0
    /* renamed from: getMaasVersion */
    public java.lang.String mo136328x1f4d2bfc() {
        java.lang.Object obj = this.f70239x6965c16d;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70239x6965c16d = r17;
        }
        return r17;
    }

    @Override // ig.x0
    /* renamed from: getMaasVersionBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136329x7b15c1cf() {
        java.lang.Object obj = this.f70239x6965c16d;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70239x6965c16d = h17;
        return h17;
    }

    @Override // ig.x0
    /* renamed from: getMcMetrics */
    public ig.f0 mo136330xe8d66797() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70240xb3cc191;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70241x43b5d3b2;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getMcMetricsBuilder */
    public ig.e0 m136331xea45b804() {
        this.f70232x961a12dc |= com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432;
        m20881x7bb163d5();
        return (ig.e0) m136266xdde7ca78().d();
    }

    @Override // ig.x0
    /* renamed from: getMcMetricsOrBuilder */
    public ig.g0 mo136332xc01ff661() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70240xb3cc191;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70241x43b5d3b2;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.x0
    /* renamed from: getMetricsType */
    public com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 mo136333x7352f167() {
        com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 m32407xdce0328 = com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57.m32407xdce0328(this.f70242x9618a962);
        return m32407xdce0328 == null ? com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57.nPublisherMetricsTypeSession : m32407xdce0328;
    }

    @Override // ig.x0
    /* renamed from: getMetricsVersion */
    public long mo136334xa8f9ef8b() {
        return this.f70243x91e2306a;
    }

    @Override // ig.x0
    /* renamed from: getParentEnterScene */
    public int mo136335x1d91a854() {
        return this.f70244x416edb41;
    }

    @Override // ig.x0
    /* renamed from: getPostId */
    public java.lang.String mo136336x2a881cd1() {
        java.lang.Object obj = this.f70245xe8ae41e4;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70245xe8ae41e4 = r17;
        }
        return r17;
    }

    @Override // ig.x0
    /* renamed from: getPostIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136337x5aa90e1a() {
        java.lang.Object obj = this.f70245xe8ae41e4;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70245xe8ae41e4 = h17;
        return h17;
    }

    @Override // ig.x0
    /* renamed from: getResultInfoMc */
    public ig.f0 mo136338x5aaef7d7() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70246x5a09dca5;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70249x3dd0471e;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getResultInfoMcBuilder */
    public ig.e0 m136339xd6f65fc4() {
        this.f70232x961a12dc |= 262144;
        m20881x7bb163d5();
        return (ig.e0) m136267xa029fab8().d();
    }

    @Override // ig.x0
    /* renamed from: getResultInfoMcMaterial */
    public ig.f0 mo136340x6eeefa1e() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70247x38137dec;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70248x634477b7;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getResultInfoMcMaterialBuilder */
    public ig.e0 m136341xc838f9d() {
        this.f70232x961a12dc |= 67108864;
        m20881x7bb163d5();
        return (ig.e0) m136268x80cdca7f().d();
    }

    @Override // ig.x0
    /* renamed from: getResultInfoMcMaterialOrBuilder */
    public ig.g0 mo136342x4a464bba() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70247x38137dec;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70248x634477b7;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.x0
    /* renamed from: getResultInfoMcOrBuilder */
    public ig.g0 mo136343x4345ae21() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70246x5a09dca5;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70249x3dd0471e;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.x0
    /* renamed from: getResultInfoMedia */
    public ig.f0 mo136344xef3dd203() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70250x20ad1f7d;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70251x50a40746;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getResultInfoMediaBuilder */
    public ig.e0 m136345x4191fc18() {
        this.f70232x961a12dc |= 65536;
        m20881x7bb163d5();
        return (ig.e0) m136269x61c6f2e4().d();
    }

    @Override // ig.x0
    /* renamed from: getResultInfoMediaOrBuilder */
    public ig.g0 mo136346x756b8575() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70250x20ad1f7d;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70251x50a40746;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.x0
    /* renamed from: getResultInfoSc */
    public ig.f0 mo136347x5aaef891() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70252x13c2835f;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70253x3dd05da4;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getResultInfoScBuilder */
    public ig.e0 m136348x5090f9ca() {
        this.f70232x961a12dc |= 131072;
        m20881x7bb163d5();
        return (ig.e0) m136270xeb5cb472().d();
    }

    @Override // ig.x0
    /* renamed from: getResultInfoScOrBuilder */
    public ig.g0 mo136349xc0a1dea7() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70252x13c2835f;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70253x3dd05da4;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.x0
    /* renamed from: getResultOriginType */
    public java.lang.String mo136350xc3f7faf3() {
        java.lang.Object obj = this.f70254x67d2dc82;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70254x67d2dc82 = r17;
        }
        return r17;
    }

    @Override // ig.x0
    /* renamed from: getResultOriginTypeBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136351x5c78b538() {
        java.lang.Object obj = this.f70254x67d2dc82;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70254x67d2dc82 = h17;
        return h17;
    }

    @Override // ig.x0
    /* renamed from: getScMetrics */
    public ig.f0 mo136352x6271019d() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70255xef37f597;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70256xfd6e7a6c;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getScMetricsBuilder */
    public ig.e0 m136353x33b0eb3e() {
        this.f70232x961a12dc |= 524288;
        m20881x7bb163d5();
        return (ig.e0) m136271x297d8b7e().d();
    }

    @Override // ig.x0
    /* renamed from: getScMetricsOrBuilder */
    public ig.g0 mo136354x5b8b431b() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70255xef37f597;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70256xfd6e7a6c;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.x0
    /* renamed from: getScPreload */
    public ig.f0 mo136355x167caee3() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70257x31fcfcdd;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70258xcad875e6;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getScPreloadBuilder */
    public ig.e0 m136356x802ae338() {
        this.f70232x961a12dc |= 1048576;
        m20881x7bb163d5();
        return (ig.e0) m136272xe8417fc4().d();
    }

    @Override // ig.x0
    /* renamed from: getScPreloadOrBuilder */
    public ig.g0 mo136357x71672495() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70257x31fcfcdd;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70258xcad875e6;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.x0
    /* renamed from: getScPreviewPref */
    public ig.f0 mo136358xf26019e5() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70259x8556fadf;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70260x6b0b5624;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getScPreviewPrefBuilder */
    public ig.e0 m136359xfc6b71f6() {
        this.f70232x961a12dc |= 2097152;
        m20881x7bb163d5();
        return (ig.e0) m136273xa86277c6().d();
    }

    @Override // ig.x0
    /* renamed from: getScPreviewPrefOrBuilder */
    public ig.g0 mo136360xdfbefbd3() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70259x8556fadf;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70260x6b0b5624;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.x0
    /* renamed from: getScRecordPref */
    public ig.f0 mo136361xccecafa() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70261x2a01dcc8;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70262xcfaad85b;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getScRecordPrefBuilder */
    public ig.e0 m136362x1fbc4f41() {
        this.f70232x961a12dc |= 4194304;
        m20881x7bb163d5();
        return (ig.e0) m136274xb60f315b().d();
    }

    @Override // ig.x0
    /* renamed from: getScRecordPrefOrBuilder */
    public ig.g0 mo136363x724db25e() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70261x2a01dcc8;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70262xcfaad85b;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.x0
    /* renamed from: getSessionId */
    public java.lang.String mo136364x23a7af9b() {
        java.lang.Object obj = this.f70263x630d8c2e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70263x630d8c2e = r17;
        }
        return r17;
    }

    @Override // ig.x0
    /* renamed from: getSessionIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136365xb927a990() {
        java.lang.Object obj = this.f70263x630d8c2e;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70263x630d8c2e = h17;
        return h17;
    }

    @Override // ig.x0
    /* renamed from: getStartupOptions */
    public ig.f0 mo136366xb0905257() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70264xb425fca5;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70265x7d18271e;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getStartupOptionsBuilder */
    public ig.e0 m136367x6c523544() {
        this.f70232x961a12dc |= 134217728;
        m20881x7bb163d5();
        return (ig.e0) m136275x7e579538().d();
    }

    @Override // ig.x0
    /* renamed from: getStartupOptionsOrBuilder */
    public ig.g0 mo136368xf10223a1() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70264xb425fca5;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70265x7d18271e;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.x0
    /* renamed from: getTotalDownloadBytes */
    public long mo136369xdada41d5() {
        return this.f70266x283e1c60;
    }

    @Override // ig.x0
    /* renamed from: getTotalDurationMs */
    public long mo136370x195b8688() {
        return this.f70267x6a3ce361;
    }

    @Override // ig.x0
    /* renamed from: getValidationCode */
    public long mo136371xdde452fc() {
        return this.f70268xfa443b19;
    }

    @Override // ig.x0
    /* renamed from: getVisitedStates */
    public long mo136372x53782216() {
        return this.f70269x2cf45413;
    }

    @Override // ig.x0
    /* renamed from: getVisitedViews */
    public long mo136373x2c20f3da() {
        return this.f70270x9a9dcb7b;
    }

    @Override // ig.x0
    /* renamed from: hasBeginTimeStamp */
    public boolean mo136374x8a855787() {
        return (this.f70232x961a12dc & 16) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasEndReason */
    public boolean mo136375x1c9d9185() {
        return (this.f70232x961a12dc & 64) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasEnterScene */
    public boolean mo136376xf7a01ece() {
        return (this.f70232x961a12dc & 8388608) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasEntryType */
    public boolean mo136377xa2b05d52() {
        return (this.f70232x961a12dc & 4) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasFirstImpressionTimeCostMs */
    public boolean mo136378x1c0c3fbf() {
        return (this.f70232x961a12dc & 4096) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasLastStateId */
    public boolean mo136379xf9304f1c() {
        return (this.f70232x961a12dc & 256) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasLastViewId */
    public boolean mo136380xa1345b10() {
        return (this.f70232x961a12dc & 128) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasMaasVersion */
    public boolean mo136381x3f6d3638() {
        return (this.f70232x961a12dc & 8) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasMcMetrics */
    public boolean mo136382xa8abd0d3() {
        return (this.f70232x961a12dc & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasMetricsType */
    public boolean mo136383x9372fba3() {
        return (this.f70232x961a12dc & 1) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasMetricsVersion */
    public boolean mo136384x1980ebcf() {
        return (this.f70232x961a12dc & 2048) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasParentEnterScene */
    public boolean mo136385x884aa398() {
        return (this.f70232x961a12dc & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasPostId */
    public boolean mo136386xea619d15() {
        return (this.f70232x961a12dc & 268435456) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasResultInfoMc */
    public boolean mo136387x3e90351b() {
        return (this.f70232x961a12dc & 262144) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasResultInfoMcMaterial */
    public boolean mo136388x9270b362() {
        return (this.f70232x961a12dc & 67108864) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasResultInfoMedia */
    public boolean mo136389x8f965e3f() {
        return (this.f70232x961a12dc & 65536) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasResultInfoSc */
    public boolean mo136390x3e9035d5() {
        return (this.f70232x961a12dc & 131072) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasResultOriginType */
    public boolean mo136391x2eb0f637() {
        return (this.f70232x961a12dc & 32768) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasScMetrics */
    public boolean mo136392x22466ad9() {
        return (this.f70232x961a12dc & 524288) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasScPreload */
    public boolean mo136393xd652181f() {
        return (this.f70232x961a12dc & 1048576) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasScPreviewPref */
    public boolean mo136394x8aa68521() {
        return (this.f70232x961a12dc & 2097152) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasScRecordPref */
    public boolean mo136395xf0b0083e() {
        return (this.f70232x961a12dc & 4194304) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasSessionId */
    public boolean mo136396xe37d18d7() {
        return (this.f70232x961a12dc & 2) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasStartupOptions */
    public boolean mo136397x21174e9b() {
        return (this.f70232x961a12dc & 134217728) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasTotalDownloadBytes */
    public boolean mo136398x7b417c19() {
        return (this.f70232x961a12dc & 8192) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasTotalDurationMs */
    public boolean mo136399xb9b412c4() {
        return (this.f70232x961a12dc & 32) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasValidationCode */
    public boolean mo136400x4e6b4f40() {
        return (this.f70232x961a12dc & 16384) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasVisitedStates */
    public boolean mo136401xebbe8d52() {
        return (this.f70232x961a12dc & 1024) != 0;
    }

    @Override // ig.x0
    /* renamed from: hasVisitedViews */
    public boolean mo136402x1002311e() {
        return (this.f70232x961a12dc & 512) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372834p;
        j6Var.c(ig.w0.class, ig.v0.class);
        return j6Var;
    }

    /* renamed from: mergeMcMetrics */
    public ig.v0 m136403x5c14b0f5(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70240xb3cc191;
        if (t9Var == null) {
            if ((this.f70232x961a12dc & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) == 0 || (f0Var2 = this.f70241x43b5d3b2) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70241x43b5d3b2 = f0Var;
            } else {
                this.f70241x43b5d3b2 = ((ig.e0) ig.f0.m135489x3136c9db(this.f70241x43b5d3b2).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70232x961a12dc |= com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432;
        return this;
    }

    /* renamed from: mergeResultInfoMc */
    public ig.v0 m136404x580ac9b9(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70246x5a09dca5;
        if (t9Var == null) {
            if ((this.f70232x961a12dc & 262144) == 0 || (f0Var2 = this.f70249x3dd0471e) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70249x3dd0471e = f0Var;
            } else {
                this.f70249x3dd0471e = ((ig.e0) ig.f0.m135489x3136c9db(this.f70249x3dd0471e).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70232x961a12dc |= 262144;
        return this;
    }

    /* renamed from: mergeResultInfoMcMaterial */
    public ig.v0 m136405xa453ca00(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70247x38137dec;
        if (t9Var == null) {
            if ((this.f70232x961a12dc & 67108864) == 0 || (f0Var2 = this.f70248x634477b7) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70248x634477b7 = f0Var;
            } else {
                this.f70248x634477b7 = ((ig.e0) ig.f0.m135489x3136c9db(this.f70248x634477b7).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70232x961a12dc |= 67108864;
        return this;
    }

    /* renamed from: mergeResultInfoMedia */
    public ig.v0 m136406x8f6b1ce1(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70250x20ad1f7d;
        if (t9Var == null) {
            if ((this.f70232x961a12dc & 65536) == 0 || (f0Var2 = this.f70251x50a40746) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70251x50a40746 = f0Var;
            } else {
                this.f70251x50a40746 = ((ig.e0) ig.f0.m135489x3136c9db(this.f70251x50a40746).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70232x961a12dc |= 65536;
        return this;
    }

    /* renamed from: mergeResultInfoSc */
    public ig.v0 m136407x580aca73(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70252x13c2835f;
        if (t9Var == null) {
            if ((this.f70232x961a12dc & 131072) == 0 || (f0Var2 = this.f70253x3dd05da4) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70253x3dd05da4 = f0Var;
            } else {
                this.f70253x3dd05da4 = ((ig.e0) ig.f0.m135489x3136c9db(this.f70253x3dd05da4).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70232x961a12dc |= 131072;
        return this;
    }

    /* renamed from: mergeScMetrics */
    public ig.v0 m136408xd5af4afb(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70255xef37f597;
        if (t9Var == null) {
            if ((this.f70232x961a12dc & 524288) == 0 || (f0Var2 = this.f70256xfd6e7a6c) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70256xfd6e7a6c = f0Var;
            } else {
                this.f70256xfd6e7a6c = ((ig.e0) ig.f0.m135489x3136c9db(this.f70256xfd6e7a6c).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70232x961a12dc |= 524288;
        return this;
    }

    /* renamed from: mergeScPreload */
    public ig.v0 m136409x89baf841(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70257x31fcfcdd;
        if (t9Var == null) {
            if ((this.f70232x961a12dc & 1048576) == 0 || (f0Var2 = this.f70258xcad875e6) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70258xcad875e6 = f0Var;
            } else {
                this.f70258xcad875e6 = ((ig.e0) ig.f0.m135489x3136c9db(this.f70258xcad875e6).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70232x961a12dc |= 1048576;
        return this;
    }

    /* renamed from: mergeScPreviewPref */
    public ig.v0 m136410xa07e8443(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70259x8556fadf;
        if (t9Var == null) {
            if ((this.f70232x961a12dc & 2097152) == 0 || (f0Var2 = this.f70260x6b0b5624) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70260x6b0b5624 = f0Var;
            } else {
                this.f70260x6b0b5624 = ((ig.e0) ig.f0.m135489x3136c9db(this.f70260x6b0b5624).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70232x961a12dc |= 2097152;
        return this;
    }

    /* renamed from: mergeScRecordPref */
    public ig.v0 m136411xa2a9cdc(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70261x2a01dcc8;
        if (t9Var == null) {
            if ((this.f70232x961a12dc & 4194304) == 0 || (f0Var2 = this.f70262xcfaad85b) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70262xcfaad85b = f0Var;
            } else {
                this.f70262xcfaad85b = ((ig.e0) ig.f0.m135489x3136c9db(this.f70262xcfaad85b).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70232x961a12dc |= 4194304;
        return this;
    }

    /* renamed from: mergeStartupOptions */
    public ig.v0 m136412xc63f33b9(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70264xb425fca5;
        if (t9Var == null) {
            if ((this.f70232x961a12dc & 134217728) == 0 || (f0Var2 = this.f70265x7d18271e) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70265x7d18271e = f0Var;
            } else {
                this.f70265x7d18271e = ((ig.e0) ig.f0.m135489x3136c9db(this.f70265x7d18271e).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70232x961a12dc |= 134217728;
        return this;
    }

    /* renamed from: setBeginTimeStamp */
    public ig.v0 m136414xe1f4c34f(long j17) {
        this.f70232x961a12dc |= 16;
        this.f70231x416b3bb2 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEndReason */
    public ig.v0 m136415xb91be8bd(java.lang.String str) {
        str.getClass();
        this.f70232x961a12dc |= 64;
        this.f70233x4dfc2940 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEndReasonBytes */
    public ig.v0 m136416xea73d5ae(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70232x961a12dc |= 64;
        this.f70233x4dfc2940 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEnterScene */
    public ig.v0 m136417xeaecae96(int i17) {
        this.f70232x961a12dc |= 8388608;
        this.f70234x26d6a4b = i17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEntryType */
    public ig.v0 m136418x3f2eb48a(java.lang.String str) {
        str.getClass();
        this.f70232x961a12dc |= 4;
        this.f70235x8a42d713 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEntryTypeBytes */
    public ig.v0 m136419x25396201(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70232x961a12dc |= 4;
        this.f70235x8a42d713 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setFirstImpressionTimeCostMs */
    public ig.v0 m136420x5c2526f7(long j17) {
        this.f70232x961a12dc |= 4096;
        this.f70236xd992f646 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setLastStateId */
    public ig.v0 m136421x6f75b854(java.lang.String str) {
        str.getClass();
        this.f70232x961a12dc |= 256;
        this.f70237xe805c509 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setLastStateIdBytes */
    public ig.v0 m136422x808f2c77(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70232x961a12dc |= 256;
        this.f70237xe805c509 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setLastViewId */
    public ig.v0 m136423x9480ead8(java.lang.String str) {
        str.getClass();
        this.f70232x961a12dc |= 128;
        this.f70238x8b60b649 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setLastViewIdBytes */
    public ig.v0 m136424xfdf2ec73(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70232x961a12dc |= 128;
        this.f70238x8b60b649 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMaasVersion */
    public ig.v0 m136425xb5b29f70(java.lang.String str) {
        str.getClass();
        this.f70232x961a12dc |= 8;
        this.f70239x6965c16d = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMaasVersionBytes */
    public ig.v0 m136426x1f1256db(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70232x961a12dc |= 8;
        this.f70239x6965c16d = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMcMetrics */
    public ig.v0 m136428x452a280b(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70240xb3cc191;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70241x43b5d3b2 = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70232x961a12dc |= com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432;
        return this;
    }

    /* renamed from: setMetricsType */
    public ig.v0 m136429x9b864db(com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 enumC3969x8364de57) {
        enumC3969x8364de57.getClass();
        this.f70232x961a12dc |= 1;
        this.f70242x9618a962 = enumC3969x8364de57.mo20656x276ffe3f();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMetricsVersion */
    public ig.v0 m136430x70f05797(long j17) {
        this.f70232x961a12dc |= 2048;
        this.f70243x91e2306a = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setParentEnterScene */
    public ig.v0 m136431xc18e3d60(int i17) {
        this.f70232x961a12dc |= com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb;
        this.f70244x416edb41 = i17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPostId */
    public ig.v0 m136432x1dbd50dd(java.lang.String str) {
        str.getClass();
        this.f70232x961a12dc |= 268435456;
        this.f70245xe8ae41e4 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPostIdBytes */
    public ig.v0 m136433xf10e818e(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70232x961a12dc |= 268435456;
        this.f70245xe8ae41e4 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setResultInfoMc */
    public ig.v0 m136436x90f7f2e3(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70246x5a09dca5;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70249x3dd0471e = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70232x961a12dc |= 262144;
        return this;
    }

    /* renamed from: setResultInfoMcMaterial */
    public ig.v0 m136438xe942292a(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70247x38137dec;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70248x634477b7 = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70232x961a12dc |= 67108864;
        return this;
    }

    /* renamed from: setResultInfoMedia */
    public ig.v0 m136440x26146b77(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70250x20ad1f7d;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70251x50a40746 = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70232x961a12dc |= 65536;
        return this;
    }

    /* renamed from: setResultInfoSc */
    public ig.v0 m136442x90f7f39d(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70252x13c2835f;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70253x3dd05da4 = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70232x961a12dc |= 131072;
        return this;
    }

    /* renamed from: setResultOriginType */
    public ig.v0 m136443x67f48fff(java.lang.String str) {
        str.getClass();
        this.f70232x961a12dc |= 32768;
        this.f70254x67d2dc82 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setResultOriginTypeBytes */
    public ig.v0 m136444x2c8b67ac(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70232x961a12dc |= 32768;
        this.f70254x67d2dc82 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setScMetrics */
    public ig.v0 m136446xbec4c211(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70255xef37f597;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70256xfd6e7a6c = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70232x961a12dc |= 524288;
        return this;
    }

    /* renamed from: setScPreload */
    public ig.v0 m136448x72d06f57(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70257x31fcfcdd;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70258xcad875e6 = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70232x961a12dc |= 1048576;
        return this;
    }

    /* renamed from: setScPreviewPref */
    public ig.v0 m136450x85368059(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70259x8556fadf;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70260x6b0b5624 = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70232x961a12dc |= 2097152;
        return this;
    }

    /* renamed from: setScRecordPref */
    public ig.v0 m136452x4317c606(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70261x2a01dcc8;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70262xcfaad85b = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70232x961a12dc |= 4194304;
        return this;
    }

    /* renamed from: setSessionId */
    public ig.v0 m136453x7ffb700f(java.lang.String str) {
        str.getClass();
        this.f70232x961a12dc |= 2;
        this.f70263x630d8c2e = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setSessionIdBytes */
    public ig.v0 m136454x811e119c(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70232x961a12dc |= 2;
        this.f70263x630d8c2e = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setStartupOptions */
    public ig.v0 m136456x7886ba63(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70264xb425fca5;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70265x7d18271e = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70232x961a12dc |= 134217728;
        return this;
    }

    /* renamed from: setTotalDownloadBytes */
    public ig.v0 m136457x7205c3e1(long j17) {
        this.f70232x961a12dc |= 8192;
        this.f70266x283e1c60 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTotalDurationMs */
    public ig.v0 m136458x50321ffc(long j17) {
        this.f70232x961a12dc |= 32;
        this.f70267x6a3ce361 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setValidationCode */
    public ig.v0 m136459xa5dabb08(long j17) {
        this.f70232x961a12dc |= 16384;
        this.f70268xfa443b19 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setVisitedStates */
    public ig.v0 m136460xe64e888a(long j17) {
        this.f70232x961a12dc |= 1024;
        this.f70269x2cf45413 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setVisitedViews */
    public ig.v0 m136461x6269eee6(long j17) {
        this.f70232x961a12dc |= 512;
        this.f70270x9a9dcb7b = j17;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public ig.v0 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public ig.w0 mo20556x59bc66e() {
        ig.w0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public ig.w0 mo20557x85702333() {
        ig.w0 w0Var = new ig.w0(this);
        int i17 = this.f70232x961a12dc;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        w0Var.f70325x9618a962 = this.f70242x9618a962;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        w0Var.f70338x630d8c2e = this.f70263x630d8c2e;
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        w0Var.f70319x8a42d713 = this.f70235x8a42d713;
        if ((i17 & 8) != 0) {
            i18 |= 8;
        }
        w0Var.f70323x6965c16d = this.f70239x6965c16d;
        if ((i17 & 16) != 0) {
            w0Var.f70315x416b3bb2 = this.f70231x416b3bb2;
            i18 |= 16;
        }
        if ((i17 & 32) != 0) {
            w0Var.f70341x6a3ce361 = this.f70267x6a3ce361;
            i18 |= 32;
        }
        if ((i17 & 64) != 0) {
            i18 |= 64;
        }
        w0Var.f70317x4dfc2940 = this.f70233x4dfc2940;
        if ((i17 & 128) != 0) {
            i18 |= 128;
        }
        w0Var.f70322x8b60b649 = this.f70238x8b60b649;
        if ((i17 & 256) != 0) {
            i18 |= 256;
        }
        w0Var.f70321xe805c509 = this.f70237xe805c509;
        if ((i17 & 512) != 0) {
            w0Var.f70344x9a9dcb7b = this.f70270x9a9dcb7b;
            i18 |= 512;
        }
        if ((i17 & 1024) != 0) {
            w0Var.f70343x2cf45413 = this.f70269x2cf45413;
            i18 |= 1024;
        }
        if ((i17 & 2048) != 0) {
            w0Var.f70326x91e2306a = this.f70243x91e2306a;
            i18 |= 2048;
        }
        if ((i17 & 4096) != 0) {
            w0Var.f70320xd992f646 = this.f70236xd992f646;
            i18 |= 4096;
        }
        if ((i17 & 8192) != 0) {
            w0Var.f70340x283e1c60 = this.f70266x283e1c60;
            i18 |= 8192;
        }
        if ((i17 & 16384) != 0) {
            w0Var.f70342xfa443b19 = this.f70268xfa443b19;
            i18 |= 16384;
        }
        if ((i17 & 32768) != 0) {
            i18 |= 32768;
        }
        w0Var.f70333x67d2dc82 = this.f70254x67d2dc82;
        if ((i17 & 65536) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70250x20ad1f7d;
            if (t9Var == null) {
                w0Var.f70331x50a40746 = this.f70251x50a40746;
            } else {
                w0Var.f70331x50a40746 = (ig.f0) t9Var.b();
            }
            i18 |= 65536;
        }
        if ((i17 & 131072) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var2 = this.f70252x13c2835f;
            if (t9Var2 == null) {
                w0Var.f70332x3dd05da4 = this.f70253x3dd05da4;
            } else {
                w0Var.f70332x3dd05da4 = (ig.f0) t9Var2.b();
            }
            i18 |= 131072;
        }
        if ((i17 & 262144) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var3 = this.f70246x5a09dca5;
            if (t9Var3 == null) {
                w0Var.f70330x3dd0471e = this.f70249x3dd0471e;
            } else {
                w0Var.f70330x3dd0471e = (ig.f0) t9Var3.b();
            }
            i18 |= 262144;
        }
        if ((i17 & 524288) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var4 = this.f70255xef37f597;
            if (t9Var4 == null) {
                w0Var.f70334xfd6e7a6c = this.f70256xfd6e7a6c;
            } else {
                w0Var.f70334xfd6e7a6c = (ig.f0) t9Var4.b();
            }
            i18 |= 524288;
        }
        if ((i17 & 1048576) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var5 = this.f70257x31fcfcdd;
            if (t9Var5 == null) {
                w0Var.f70335xcad875e6 = this.f70258xcad875e6;
            } else {
                w0Var.f70335xcad875e6 = (ig.f0) t9Var5.b();
            }
            i18 |= 1048576;
        }
        if ((i17 & 2097152) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var6 = this.f70259x8556fadf;
            if (t9Var6 == null) {
                w0Var.f70336x6b0b5624 = this.f70260x6b0b5624;
            } else {
                w0Var.f70336x6b0b5624 = (ig.f0) t9Var6.b();
            }
            i18 |= 2097152;
        }
        if ((4194304 & i17) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var7 = this.f70261x2a01dcc8;
            if (t9Var7 == null) {
                w0Var.f70337xcfaad85b = this.f70262xcfaad85b;
            } else {
                w0Var.f70337xcfaad85b = (ig.f0) t9Var7.b();
            }
            i18 |= 4194304;
        }
        if ((8388608 & i17) != 0) {
            w0Var.f70318x26d6a4b = this.f70234x26d6a4b;
            i18 |= 8388608;
        }
        if ((16777216 & i17) != 0) {
            w0Var.f70327x416edb41 = this.f70244x416edb41;
            i18 |= com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb;
        }
        if ((33554432 & i17) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var8 = this.f70240xb3cc191;
            if (t9Var8 == null) {
                w0Var.f70324x43b5d3b2 = this.f70241x43b5d3b2;
            } else {
                w0Var.f70324x43b5d3b2 = (ig.f0) t9Var8.b();
            }
            i18 |= com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432;
        }
        if ((67108864 & i17) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var9 = this.f70247x38137dec;
            if (t9Var9 == null) {
                w0Var.f70329x634477b7 = this.f70248x634477b7;
            } else {
                w0Var.f70329x634477b7 = (ig.f0) t9Var9.b();
            }
            i18 |= 67108864;
        }
        if ((134217728 & i17) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var10 = this.f70264xb425fca5;
            if (t9Var10 == null) {
                w0Var.f70339x7d18271e = this.f70265x7d18271e;
            } else {
                w0Var.f70339x7d18271e = (ig.f0) t9Var10.b();
            }
            i18 |= 134217728;
        }
        if ((i17 & 268435456) != 0) {
            i18 |= 268435456;
        }
        w0Var.f70328xe8ae41e4 = this.f70245xe8ae41e4;
        w0Var.f70316x961a12dc = i18;
        m20880xaf619bdf();
        return w0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearField, reason: merged with bridge method [inline-methods] */
    public ig.v0 m136049xd2ece2ad(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        super.m136049xd2ece2ad(b4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.w0 mo20559x786693c3() {
        return ig.w0.m136519x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public ig.v0 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
    public ig.v0 m136128xe229305e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17, java.lang.Object obj) {
        super.m136128xe229305e(b4Var, i17, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public final ig.v0 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.v0 m136053xd36dfc70(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        super.m136053xd36dfc70(g4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.v0 m136112xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (ig.v0) super.m136112xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.v0 m136042x5a5b64d() {
        super.m136042x5a5b64d();
        this.f70242x9618a962 = 0;
        int i17 = this.f70232x961a12dc & (-2);
        this.f70263x630d8c2e = "";
        this.f70235x8a42d713 = "";
        this.f70239x6965c16d = "";
        this.f70231x416b3bb2 = 0L;
        this.f70267x6a3ce361 = 0L;
        this.f70233x4dfc2940 = "";
        this.f70238x8b60b649 = "";
        this.f70237xe805c509 = "";
        this.f70270x9a9dcb7b = 0L;
        this.f70269x2cf45413 = 0L;
        this.f70243x91e2306a = 0L;
        this.f70236xd992f646 = 0L;
        this.f70266x283e1c60 = 0L;
        this.f70268xfa443b19 = 0L;
        this.f70254x67d2dc82 = "";
        this.f70232x961a12dc = i17 & (-3) & (-5) & (-9) & (-17) & (-33) & (-65) & (-129) & (-257) & (-513) & (-1025) & (-2049) & (-4097) & (-8193) & (-16385) & (-32769);
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70250x20ad1f7d;
        if (t9Var == null) {
            this.f70251x50a40746 = null;
        } else {
            t9Var.c();
        }
        this.f70232x961a12dc &= -65537;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var2 = this.f70252x13c2835f;
        if (t9Var2 == null) {
            this.f70253x3dd05da4 = null;
        } else {
            t9Var2.c();
        }
        this.f70232x961a12dc &= -131073;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var3 = this.f70246x5a09dca5;
        if (t9Var3 == null) {
            this.f70249x3dd0471e = null;
        } else {
            t9Var3.c();
        }
        this.f70232x961a12dc &= -262145;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var4 = this.f70255xef37f597;
        if (t9Var4 == null) {
            this.f70256xfd6e7a6c = null;
        } else {
            t9Var4.c();
        }
        this.f70232x961a12dc &= -524289;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var5 = this.f70257x31fcfcdd;
        if (t9Var5 == null) {
            this.f70258xcad875e6 = null;
        } else {
            t9Var5.c();
        }
        this.f70232x961a12dc &= -1048577;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var6 = this.f70259x8556fadf;
        if (t9Var6 == null) {
            this.f70260x6b0b5624 = null;
        } else {
            t9Var6.c();
        }
        this.f70232x961a12dc &= -2097153;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var7 = this.f70261x2a01dcc8;
        if (t9Var7 == null) {
            this.f70262xcfaad85b = null;
        } else {
            t9Var7.c();
        }
        int i18 = this.f70232x961a12dc & (-4194305);
        this.f70234x26d6a4b = 0;
        this.f70244x416edb41 = 0;
        this.f70232x961a12dc = (-16777217) & i18 & (-8388609);
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var8 = this.f70240xb3cc191;
        if (t9Var8 == null) {
            this.f70241x43b5d3b2 = null;
        } else {
            t9Var8.c();
        }
        this.f70232x961a12dc &= -33554433;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var9 = this.f70247x38137dec;
        if (t9Var9 == null) {
            this.f70248x634477b7 = null;
        } else {
            t9Var9.c();
        }
        this.f70232x961a12dc &= -67108865;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var10 = this.f70264xb425fca5;
        if (t9Var10 == null) {
            this.f70265x7d18271e = null;
        } else {
            t9Var10.c();
        }
        int i19 = this.f70232x961a12dc & (-134217729);
        this.f70245xe8ae41e4 = "";
        this.f70232x961a12dc = i19 & (-268435457);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.v0 m136316x5a5dd5d() {
        return (ig.v0) super.m136066x5a5dd5d();
    }

    /* renamed from: setMcMetrics */
    public ig.v0 m136427x452a280b(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70240xb3cc191;
        if (t9Var == null) {
            this.f70241x43b5d3b2 = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70232x961a12dc |= com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432;
        return this;
    }

    /* renamed from: setResultInfoMc */
    public ig.v0 m136435x90f7f2e3(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70246x5a09dca5;
        if (t9Var == null) {
            this.f70249x3dd0471e = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70232x961a12dc |= 262144;
        return this;
    }

    /* renamed from: setResultInfoMcMaterial */
    public ig.v0 m136437xe942292a(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70247x38137dec;
        if (t9Var == null) {
            this.f70248x634477b7 = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70232x961a12dc |= 67108864;
        return this;
    }

    /* renamed from: setResultInfoMedia */
    public ig.v0 m136439x26146b77(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70250x20ad1f7d;
        if (t9Var == null) {
            this.f70251x50a40746 = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70232x961a12dc |= 65536;
        return this;
    }

    /* renamed from: setResultInfoSc */
    public ig.v0 m136441x90f7f39d(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70252x13c2835f;
        if (t9Var == null) {
            this.f70253x3dd05da4 = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70232x961a12dc |= 131072;
        return this;
    }

    /* renamed from: setScMetrics */
    public ig.v0 m136445xbec4c211(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70255xef37f597;
        if (t9Var == null) {
            this.f70256xfd6e7a6c = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70232x961a12dc |= 524288;
        return this;
    }

    /* renamed from: setScPreload */
    public ig.v0 m136447x72d06f57(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70257x31fcfcdd;
        if (t9Var == null) {
            this.f70258xcad875e6 = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70232x961a12dc |= 1048576;
        return this;
    }

    /* renamed from: setScPreviewPref */
    public ig.v0 m136449x85368059(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70259x8556fadf;
        if (t9Var == null) {
            this.f70260x6b0b5624 = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70232x961a12dc |= 2097152;
        return this;
    }

    /* renamed from: setScRecordPref */
    public ig.v0 m136451x4317c606(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70261x2a01dcc8;
        if (t9Var == null) {
            this.f70262xcfaad85b = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70232x961a12dc |= 4194304;
        return this;
    }

    /* renamed from: setStartupOptions */
    public ig.v0 m136455x7886ba63(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70264xb425fca5;
        if (t9Var == null) {
            this.f70265x7d18271e = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70232x961a12dc |= 134217728;
        return this;
    }

    private v0(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        super(r5Var);
        this.f70242x9618a962 = 0;
        this.f70263x630d8c2e = "";
        this.f70235x8a42d713 = "";
        this.f70239x6965c16d = "";
        this.f70233x4dfc2940 = "";
        this.f70238x8b60b649 = "";
        this.f70237xe805c509 = "";
        this.f70254x67d2dc82 = "";
        this.f70245xe8ae41e4 = "";
        m136276x73fef578();
    }
}
