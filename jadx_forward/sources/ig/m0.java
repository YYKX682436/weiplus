package ig;

/* loaded from: classes16.dex */
public final class m0 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements ig.o0 {

    /* renamed from: assetOriginType_ */
    private java.lang.Object f70076xac95c7cf;

    /* renamed from: beginTimeStamp_ */
    private long f70077x416b3bb2;

    /* renamed from: bitField0_ */
    private int f70078x961a12dc;

    /* renamed from: detailsBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70079x9dfff886;

    /* renamed from: details_ */
    private ig.f0 f70080x3e45565d;

    /* renamed from: endReason_ */
    private java.lang.Object f70081x4dfc2940;

    /* renamed from: enterScene_ */
    private int f70082x26d6a4b;

    /* renamed from: entryType_ */
    private java.lang.Object f70083x8a42d713;

    /* renamed from: extDetails0Builder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70084x1cc71cb3;

    /* renamed from: extDetails0_ */
    private ig.f0 f70085x8768dad0;

    /* renamed from: maasVersion_ */
    private java.lang.Object f70086x6965c16d;

    /* renamed from: metricsType_ */
    private int f70087x9618a962;

    /* renamed from: postId_ */
    private java.lang.Object f70088xe8ae41e4;

    /* renamed from: sessionId_ */
    private java.lang.Object f70089x630d8c2e;

    /* renamed from: taskId_ */
    private java.lang.Object f70090xa45f3edf;

    /* renamed from: taskName_ */
    private java.lang.Object f70091x9d05caf;

    /* renamed from: totalDurationMs_ */
    private long f70092x6a3ce361;

    private m0() {
        super(null);
        this.f70087x9618a962 = 0;
        this.f70089x630d8c2e = "";
        this.f70083x8a42d713 = "";
        this.f70086x6965c16d = "";
        this.f70090xa45f3edf = "";
        this.f70091x9d05caf = "";
        this.f70081x4dfc2940 = "";
        this.f70076xac95c7cf = "";
        this.f70088xe8ae41e4 = "";
        m135822x73fef578();
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135819xc1a58b65() {
        return ig.y0.f372837s;
    }

    /* renamed from: getDetailsFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m135820xaa20896d() {
        if (this.f70079x9dfff886 == null) {
            this.f70079x9dfff886 = new com.p176xb6135e39.p283xc50a8b8b.t9(mo135851x9aa62e0c(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70080x3e45565d = null;
        }
        return this.f70079x9dfff886;
    }

    /* renamed from: getExtDetails0FieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m135821xe3005a1a() {
        if (this.f70084x1cc71cb3 == null) {
            this.f70084x1cc71cb3 = new com.p176xb6135e39.p283xc50a8b8b.t9(mo135859x8b9fda39(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70085x8768dad0 = null;
        }
        return this.f70084x1cc71cb3;
    }

    /* renamed from: maybeForceBuilderInitialization */
    private void m135822x73fef578() {
        boolean z17;
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            m135820xaa20896d();
            m135821xe3005a1a();
        }
    }

    /* renamed from: clearAssetOriginType */
    public ig.m0 m135826xdbc58883() {
        this.f70078x961a12dc &= -513;
        this.f70076xac95c7cf = ig.n0.m135965x7c90cfc0().mo135848x133d5c5a();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearBeginTimeStamp */
    public ig.m0 m135827xb51b85fa() {
        this.f70078x961a12dc &= -65;
        this.f70077x416b3bb2 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearDetails */
    public ig.m0 m135828x5b6d9335() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70079x9dfff886;
        if (t9Var == null) {
            this.f70080x3e45565d = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70078x961a12dc &= -1025;
        return this;
    }

    /* renamed from: clearEndReason */
    public ig.m0 m135829x94ae732() {
        this.f70078x961a12dc &= -257;
        this.f70081x4dfc2940 = ig.n0.m135965x7c90cfc0().mo135854x5cc82849();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearEnterScene */
    public ig.m0 m135830xa09d7ec1() {
        this.f70078x961a12dc &= -4097;
        this.f70082x26d6a4b = 0;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearEntryType */
    public ig.m0 m135831x8f5db2ff() {
        this.f70078x961a12dc &= -5;
        this.f70083x8a42d713 = ig.n0.m135965x7c90cfc0().mo135857xe2daf416();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearExtDetails0 */
    public ig.m0 m135832x226e82e2() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70084x1cc71cb3;
        if (t9Var == null) {
            this.f70085x8768dad0 = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70078x961a12dc &= -2049;
        return this;
    }

    /* renamed from: clearMaasVersion */
    public ig.m0 m135834xb61bd4a5() {
        this.f70078x961a12dc &= -9;
        this.f70086x6965c16d = ig.n0.m135965x7c90cfc0().mo135862x1f4d2bfc();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearMetricsType */
    public ig.m0 m135835xa219a10() {
        this.f70078x961a12dc &= -2;
        this.f70087x9618a962 = 0;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearPostId */
    public ig.m0 m135838x9c1aee88() {
        this.f70078x961a12dc &= -8193;
        this.f70088xe8ae41e4 = ig.n0.m135965x7c90cfc0().mo135865x2a881cd1();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearSessionId */
    public ig.m0 m135839xd02a6e84() {
        this.f70078x961a12dc &= -3;
        this.f70089x630d8c2e = ig.n0.m135965x7c90cfc0().mo135867x23a7af9b();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTaskId */
    public ig.m0 m135840xa228e62d() {
        this.f70078x961a12dc &= -17;
        this.f70090xa45f3edf = ig.n0.m135965x7c90cfc0().mo135869x30961476();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTaskName */
    public ig.m0 m135841xbb8a571d() {
        this.f70078x961a12dc &= -33;
        this.f70091x9d05caf = ig.n0.m135965x7c90cfc0().mo135871x63651726();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTotalDurationMs */
    public ig.m0 m135842xe1e3b2b1() {
        this.f70078x961a12dc &= -129;
        this.f70092x6a3ce361 = 0L;
        m20881x7bb163d5();
        return this;
    }

    @Override // ig.o0
    /* renamed from: getAssetOriginType */
    public java.lang.String mo135848x133d5c5a() {
        java.lang.Object obj = this.f70076xac95c7cf;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70076xac95c7cf = r17;
        }
        return r17;
    }

    @Override // ig.o0
    /* renamed from: getAssetOriginTypeBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135849x62b1c31() {
        java.lang.Object obj = this.f70076xac95c7cf;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70076xac95c7cf = h17;
        return h17;
    }

    @Override // ig.o0
    /* renamed from: getBeginTimeStamp */
    public long mo135850x19fe5b43() {
        return this.f70077x416b3bb2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return ig.y0.f372837s;
    }

    @Override // ig.o0
    /* renamed from: getDetails */
    public ig.f0 mo135851x9aa62e0c() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70079x9dfff886;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70080x3e45565d;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getDetailsBuilder */
    public ig.e0 m135852x434b3ef() {
        this.f70078x961a12dc |= 1024;
        m20881x7bb163d5();
        return (ig.e0) m135820xaa20896d().d();
    }

    @Override // ig.o0
    /* renamed from: getDetailsOrBuilder */
    public ig.g0 mo135853x1a3fa38c() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70079x9dfff886;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70080x3e45565d;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.o0
    /* renamed from: getEndReason */
    public java.lang.String mo135854x5cc82849() {
        java.lang.Object obj = this.f70081x4dfc2940;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70081x4dfc2940 = r17;
        }
        return r17;
    }

    @Override // ig.o0
    /* renamed from: getEndReasonBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135855x227d6da2() {
        java.lang.Object obj = this.f70081x4dfc2940;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70081x4dfc2940 = h17;
        return h17;
    }

    @Override // ig.o0
    /* renamed from: getEnterScene */
    public int mo135856xbcc8608a() {
        return this.f70082x26d6a4b;
    }

    @Override // ig.o0
    /* renamed from: getEntryType */
    public java.lang.String mo135857xe2daf416() {
        java.lang.Object obj = this.f70083x8a42d713;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70083x8a42d713 = r17;
        }
        return r17;
    }

    @Override // ig.o0
    /* renamed from: getEntryTypeBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135858x5d42f9f5() {
        java.lang.Object obj = this.f70083x8a42d713;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70083x8a42d713 = h17;
        return h17;
    }

    @Override // ig.o0
    /* renamed from: getExtDetails0 */
    public ig.f0 mo135859x8b9fda39() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70084x1cc71cb3;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70085x8768dad0;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getExtDetails0Builder */
    public ig.e0 m135860x45d66b22() {
        this.f70078x961a12dc |= 2048;
        m20881x7bb163d5();
        return (ig.e0) m135821xe3005a1a().d();
    }

    @Override // ig.o0
    /* renamed from: getExtDetails0OrBuilder */
    public ig.g0 mo135861x7a5059ff() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70084x1cc71cb3;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70085x8768dad0;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.o0
    /* renamed from: getMaasVersion */
    public java.lang.String mo135862x1f4d2bfc() {
        java.lang.Object obj = this.f70086x6965c16d;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70086x6965c16d = r17;
        }
        return r17;
    }

    @Override // ig.o0
    /* renamed from: getMaasVersionBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135863x7b15c1cf() {
        java.lang.Object obj = this.f70086x6965c16d;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70086x6965c16d = h17;
        return h17;
    }

    @Override // ig.o0
    /* renamed from: getMetricsType */
    public com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 mo135864x7352f167() {
        com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 m32407xdce0328 = com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57.m32407xdce0328(this.f70087x9618a962);
        return m32407xdce0328 == null ? com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57.nPublisherMetricsTypeSession : m32407xdce0328;
    }

    @Override // ig.o0
    /* renamed from: getPostId */
    public java.lang.String mo135865x2a881cd1() {
        java.lang.Object obj = this.f70088xe8ae41e4;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70088xe8ae41e4 = r17;
        }
        return r17;
    }

    @Override // ig.o0
    /* renamed from: getPostIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135866x5aa90e1a() {
        java.lang.Object obj = this.f70088xe8ae41e4;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70088xe8ae41e4 = h17;
        return h17;
    }

    @Override // ig.o0
    /* renamed from: getSessionId */
    public java.lang.String mo135867x23a7af9b() {
        java.lang.Object obj = this.f70089x630d8c2e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70089x630d8c2e = r17;
        }
        return r17;
    }

    @Override // ig.o0
    /* renamed from: getSessionIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135868xb927a990() {
        java.lang.Object obj = this.f70089x630d8c2e;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70089x630d8c2e = h17;
        return h17;
    }

    @Override // ig.o0
    /* renamed from: getTaskId */
    public java.lang.String mo135869x30961476() {
        java.lang.Object obj = this.f70090xa45f3edf;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70090xa45f3edf = r17;
        }
        return r17;
    }

    @Override // ig.o0
    /* renamed from: getTaskIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135870xab4d1595() {
        java.lang.Object obj = this.f70090xa45f3edf;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70090xa45f3edf = h17;
        return h17;
    }

    @Override // ig.o0
    /* renamed from: getTaskName */
    public java.lang.String mo135871x63651726() {
        java.lang.Object obj = this.f70091x9d05caf;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70091x9d05caf = r17;
        }
        return r17;
    }

    @Override // ig.o0
    /* renamed from: getTaskNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135872x77e440e5() {
        java.lang.Object obj = this.f70091x9d05caf;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70091x9d05caf = h17;
        return h17;
    }

    @Override // ig.o0
    /* renamed from: getTotalDurationMs */
    public long mo135873x195b8688() {
        return this.f70092x6a3ce361;
    }

    @Override // ig.o0
    /* renamed from: hasAssetOriginType */
    public boolean mo135874xb395e896() {
        return (this.f70078x961a12dc & 512) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasBeginTimeStamp */
    public boolean mo135875x8a855787() {
        return (this.f70078x961a12dc & 64) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasDetails */
    public boolean mo135876xd5fcb648() {
        return (this.f70078x961a12dc & 1024) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasEndReason */
    public boolean mo135877x1c9d9185() {
        return (this.f70078x961a12dc & 256) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasEnterScene */
    public boolean mo135878xf7a01ece() {
        return (this.f70078x961a12dc & 4096) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasEntryType */
    public boolean mo135879xa2b05d52() {
        return (this.f70078x961a12dc & 4) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasExtDetails0 */
    public boolean mo135880xabbfe475() {
        return (this.f70078x961a12dc & 2048) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasMaasVersion */
    public boolean mo135881x3f6d3638() {
        return (this.f70078x961a12dc & 8) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasMetricsType */
    public boolean mo135882x9372fba3() {
        return (this.f70078x961a12dc & 1) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasPostId */
    public boolean mo135883xea619d15() {
        return (this.f70078x961a12dc & 8192) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasSessionId */
    public boolean mo135884xe37d18d7() {
        return (this.f70078x961a12dc & 2) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasTaskId */
    public boolean mo135885xf06f94ba() {
        return (this.f70078x961a12dc & 16) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasTaskName */
    public boolean mo135886x92df966a() {
        return (this.f70078x961a12dc & 32) != 0;
    }

    @Override // ig.o0
    /* renamed from: hasTotalDurationMs */
    public boolean mo135887xb9b412c4() {
        return (this.f70078x961a12dc & 128) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372838t;
        j6Var.c(ig.n0.class, ig.m0.class);
        return j6Var;
    }

    /* renamed from: mergeDetails */
    public ig.m0 m135888x310336ea(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70079x9dfff886;
        if (t9Var == null) {
            if ((this.f70078x961a12dc & 1024) == 0 || (f0Var2 = this.f70080x3e45565d) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70080x3e45565d = f0Var;
            } else {
                this.f70080x3e45565d = ((ig.e0) ig.f0.m135489x3136c9db(this.f70080x3e45565d).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70078x961a12dc |= 1024;
        return this;
    }

    /* renamed from: mergeExtDetails0 */
    public ig.m0 m135889x28714417(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70084x1cc71cb3;
        if (t9Var == null) {
            if ((this.f70078x961a12dc & 2048) == 0 || (f0Var2 = this.f70085x8768dad0) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70085x8768dad0 = f0Var;
            } else {
                this.f70085x8768dad0 = ((ig.e0) ig.f0.m135489x3136c9db(this.f70085x8768dad0).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70078x961a12dc |= 2048;
        return this;
    }

    /* renamed from: setAssetOriginType */
    public ig.m0 m135891x4a13f5ce(java.lang.String str) {
        str.getClass();
        this.f70078x961a12dc |= 512;
        this.f70076xac95c7cf = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setAssetOriginTypeBytes */
    public ig.m0 m135892x807e4b3d(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70078x961a12dc |= 512;
        this.f70076xac95c7cf = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setBeginTimeStamp */
    public ig.m0 m135893xe1f4c34f(long j17) {
        this.f70078x961a12dc |= 64;
        this.f70077x416b3bb2 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setDetails */
    public ig.m0 m135895xe177b80(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70079x9dfff886;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70080x3e45565d = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70078x961a12dc |= 1024;
        return this;
    }

    /* renamed from: setEndReason */
    public ig.m0 m135896xb91be8bd(java.lang.String str) {
        str.getClass();
        this.f70078x961a12dc |= 256;
        this.f70081x4dfc2940 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEndReasonBytes */
    public ig.m0 m135897xea73d5ae(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70078x961a12dc |= 256;
        this.f70081x4dfc2940 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEnterScene */
    public ig.m0 m135898xeaecae96(int i17) {
        this.f70078x961a12dc |= 4096;
        this.f70082x26d6a4b = i17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEntryType */
    public ig.m0 m135899x3f2eb48a(java.lang.String str) {
        str.getClass();
        this.f70078x961a12dc |= 4;
        this.f70083x8a42d713 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEntryTypeBytes */
    public ig.m0 m135900x25396201(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70078x961a12dc |= 4;
        this.f70083x8a42d713 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setExtDetails0 */
    public ig.m0 m135902x22054dad(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70084x1cc71cb3;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70085x8768dad0 = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70078x961a12dc |= 2048;
        return this;
    }

    /* renamed from: setMaasVersion */
    public ig.m0 m135903xb5b29f70(java.lang.String str) {
        str.getClass();
        this.f70078x961a12dc |= 8;
        this.f70086x6965c16d = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMaasVersionBytes */
    public ig.m0 m135904x1f1256db(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70078x961a12dc |= 8;
        this.f70086x6965c16d = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMetricsType */
    public ig.m0 m135905x9b864db(com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 enumC3969x8364de57) {
        enumC3969x8364de57.getClass();
        this.f70078x961a12dc |= 1;
        this.f70087x9618a962 = enumC3969x8364de57.mo20656x276ffe3f();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPostId */
    public ig.m0 m135906x1dbd50dd(java.lang.String str) {
        str.getClass();
        this.f70078x961a12dc |= 8192;
        this.f70088xe8ae41e4 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPostIdBytes */
    public ig.m0 m135907xf10e818e(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70078x961a12dc |= 8192;
        this.f70088xe8ae41e4 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setSessionId */
    public ig.m0 m135909x7ffb700f(java.lang.String str) {
        str.getClass();
        this.f70078x961a12dc |= 2;
        this.f70089x630d8c2e = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setSessionIdBytes */
    public ig.m0 m135910x811e119c(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70078x961a12dc |= 2;
        this.f70089x630d8c2e = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTaskId */
    public ig.m0 m135911x23cb4882(java.lang.String str) {
        str.getClass();
        this.f70078x961a12dc |= 16;
        this.f70090xa45f3edf = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTaskIdBytes */
    public ig.m0 m135912x41b28909(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70078x961a12dc |= 16;
        this.f70090xa45f3edf = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTaskName */
    public ig.m0 m135913x5e1d7832(java.lang.String str) {
        str.getClass();
        this.f70078x961a12dc |= 32;
        this.f70091x9d05caf = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTaskNameBytes */
    public ig.m0 m135914xabaa759(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70078x961a12dc |= 32;
        this.f70091x9d05caf = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTotalDurationMs */
    public ig.m0 m135915x50321ffc(long j17) {
        this.f70078x961a12dc |= 128;
        this.f70092x6a3ce361 = j17;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public ig.m0 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public ig.n0 mo20556x59bc66e() {
        ig.n0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public ig.n0 mo20557x85702333() {
        ig.n0 n0Var = new ig.n0(this);
        int i17 = this.f70078x961a12dc;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        n0Var.f70145x9618a962 = this.f70087x9618a962;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        n0Var.f70147x630d8c2e = this.f70089x630d8c2e;
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        n0Var.f70142x8a42d713 = this.f70083x8a42d713;
        if ((i17 & 8) != 0) {
            i18 |= 8;
        }
        n0Var.f70144x6965c16d = this.f70086x6965c16d;
        if ((i17 & 16) != 0) {
            i18 |= 16;
        }
        n0Var.f70148xa45f3edf = this.f70090xa45f3edf;
        if ((i17 & 32) != 0) {
            i18 |= 32;
        }
        n0Var.f70149x9d05caf = this.f70091x9d05caf;
        if ((i17 & 64) != 0) {
            n0Var.f70137x416b3bb2 = this.f70077x416b3bb2;
            i18 |= 64;
        }
        if ((i17 & 128) != 0) {
            n0Var.f70150x6a3ce361 = this.f70092x6a3ce361;
            i18 |= 128;
        }
        if ((i17 & 256) != 0) {
            i18 |= 256;
        }
        n0Var.f70140x4dfc2940 = this.f70081x4dfc2940;
        if ((i17 & 512) != 0) {
            i18 |= 512;
        }
        n0Var.f70136xac95c7cf = this.f70076xac95c7cf;
        if ((i17 & 1024) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70079x9dfff886;
            if (t9Var == null) {
                n0Var.f70139x3e45565d = this.f70080x3e45565d;
            } else {
                n0Var.f70139x3e45565d = (ig.f0) t9Var.b();
            }
            i18 |= 1024;
        }
        if ((i17 & 2048) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var2 = this.f70084x1cc71cb3;
            if (t9Var2 == null) {
                n0Var.f70143x8768dad0 = this.f70085x8768dad0;
            } else {
                n0Var.f70143x8768dad0 = (ig.f0) t9Var2.b();
            }
            i18 |= 2048;
        }
        if ((i17 & 4096) != 0) {
            n0Var.f70141x26d6a4b = this.f70082x26d6a4b;
            i18 |= 4096;
        }
        if ((i17 & 8192) != 0) {
            i18 |= 8192;
        }
        n0Var.f70146xe8ae41e4 = this.f70088xe8ae41e4;
        n0Var.f70138x961a12dc = i18;
        m20880xaf619bdf();
        return n0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearField, reason: merged with bridge method [inline-methods] */
    public ig.m0 m135615xd2ece2ad(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        super.m135615xd2ece2ad(b4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.n0 mo20559x786693c3() {
        return ig.n0.m135965x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public ig.m0 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
    public ig.m0 m135664xe229305e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17, java.lang.Object obj) {
        super.m135664xe229305e(b4Var, i17, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public final ig.m0 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.m0 m135619xd36dfc70(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        super.m135619xd36dfc70(g4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.m0 m135651xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (ig.m0) super.m135651xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.m0 m135610x5a5b64d() {
        super.m135610x5a5b64d();
        this.f70087x9618a962 = 0;
        int i17 = this.f70078x961a12dc & (-2);
        this.f70089x630d8c2e = "";
        this.f70083x8a42d713 = "";
        this.f70086x6965c16d = "";
        this.f70090xa45f3edf = "";
        this.f70091x9d05caf = "";
        this.f70077x416b3bb2 = 0L;
        this.f70092x6a3ce361 = 0L;
        this.f70081x4dfc2940 = "";
        this.f70076xac95c7cf = "";
        this.f70078x961a12dc = i17 & (-3) & (-5) & (-9) & (-17) & (-33) & (-65) & (-129) & (-257) & (-513);
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70079x9dfff886;
        if (t9Var == null) {
            this.f70080x3e45565d = null;
        } else {
            t9Var.c();
        }
        this.f70078x961a12dc &= -1025;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var2 = this.f70084x1cc71cb3;
        if (t9Var2 == null) {
            this.f70085x8768dad0 = null;
        } else {
            t9Var2.c();
        }
        int i18 = this.f70078x961a12dc & (-2049);
        this.f70082x26d6a4b = 0;
        this.f70088xe8ae41e4 = "";
        this.f70078x961a12dc = i18 & (-4097) & (-8193);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.m0 m135847x5a5dd5d() {
        return (ig.m0) super.m135626x5a5dd5d();
    }

    /* renamed from: setDetails */
    public ig.m0 m135894xe177b80(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70079x9dfff886;
        if (t9Var == null) {
            this.f70080x3e45565d = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70078x961a12dc |= 1024;
        return this;
    }

    /* renamed from: setExtDetails0 */
    public ig.m0 m135901x22054dad(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70084x1cc71cb3;
        if (t9Var == null) {
            this.f70085x8768dad0 = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70078x961a12dc |= 2048;
        return this;
    }

    private m0(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        super(r5Var);
        this.f70087x9618a962 = 0;
        this.f70089x630d8c2e = "";
        this.f70083x8a42d713 = "";
        this.f70086x6965c16d = "";
        this.f70090xa45f3edf = "";
        this.f70091x9d05caf = "";
        this.f70081x4dfc2940 = "";
        this.f70076xac95c7cf = "";
        this.f70088xe8ae41e4 = "";
        m135822x73fef578();
    }
}
