package ig;

/* loaded from: classes16.dex */
public final class r0 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements ig.t0 {

    /* renamed from: beginTimeStamp_ */
    private long f70157x416b3bb2;

    /* renamed from: bitField0_ */
    private int f70158x961a12dc;

    /* renamed from: camSource_ */
    private java.lang.Object f70159xcbea1cd5;

    /* renamed from: detailsBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70160x9dfff886;

    /* renamed from: details_ */
    private ig.f0 f70161x3e45565d;

    /* renamed from: endReason_ */
    private java.lang.Object f70162x4dfc2940;

    /* renamed from: enterScene_ */
    private int f70163x26d6a4b;

    /* renamed from: entryType_ */
    private java.lang.Object f70164x8a42d713;

    /* renamed from: maasVersion_ */
    private java.lang.Object f70165x6965c16d;

    /* renamed from: metricsType_ */
    private int f70166x9618a962;

    /* renamed from: postId_ */
    private java.lang.Object f70167xe8ae41e4;

    /* renamed from: sessionId_ */
    private java.lang.Object f70168x630d8c2e;

    /* renamed from: taskId_ */
    private java.lang.Object f70169xa45f3edf;

    /* renamed from: taskName_ */
    private java.lang.Object f70170x9d05caf;

    /* renamed from: templateId_ */
    private java.lang.Object f70171x697a47ca;

    /* renamed from: templateIndex_ */
    private long f70172x8d78e6e7;

    /* renamed from: templateSelectReason_ */
    private java.lang.Object f70173x988dbfa5;

    /* renamed from: totalDurationMs_ */
    private long f70174x6a3ce361;

    private r0() {
        super(null);
        this.f70166x9618a962 = 0;
        this.f70168x630d8c2e = "";
        this.f70164x8a42d713 = "";
        this.f70165x6965c16d = "";
        this.f70169xa45f3edf = "";
        this.f70170x9d05caf = "";
        this.f70162x4dfc2940 = "";
        this.f70171x697a47ca = "";
        this.f70173x988dbfa5 = "";
        this.f70159xcbea1cd5 = "";
        this.f70167xe8ae41e4 = "";
        m136039x73fef578();
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m136037xc1a58b65() {
        return ig.y0.f372835q;
    }

    /* renamed from: getDetailsFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m136038xaa20896d() {
        if (this.f70160x9dfff886 == null) {
            this.f70160x9dfff886 = new com.p176xb6135e39.p283xc50a8b8b.t9(mo136070x9aa62e0c(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70161x3e45565d = null;
        }
        return this.f70160x9dfff886;
    }

    /* renamed from: maybeForceBuilderInitialization */
    private void m136039x73fef578() {
        boolean z17;
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            m136038xaa20896d();
        }
    }

    /* renamed from: clearBeginTimeStamp */
    public ig.r0 m136043xb51b85fa() {
        this.f70158x961a12dc &= -65;
        this.f70157x416b3bb2 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearCamSource */
    public ig.r0 m136044x78b5acfd() {
        this.f70158x961a12dc &= -4097;
        this.f70159xcbea1cd5 = ig.s0.m136186x7c90cfc0().mo136068xcc32ee14();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearDetails */
    public ig.r0 m136045x5b6d9335() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70160x9dfff886;
        if (t9Var == null) {
            this.f70161x3e45565d = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70158x961a12dc &= -8193;
        return this;
    }

    /* renamed from: clearEndReason */
    public ig.r0 m136046x94ae732() {
        this.f70158x961a12dc &= -257;
        this.f70162x4dfc2940 = ig.s0.m136186x7c90cfc0().mo136073x5cc82849();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearEnterScene */
    public ig.r0 m136047xa09d7ec1() {
        this.f70158x961a12dc &= -16385;
        this.f70163x26d6a4b = 0;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearEntryType */
    public ig.r0 m136048x8f5db2ff() {
        this.f70158x961a12dc &= -5;
        this.f70164x8a42d713 = ig.s0.m136186x7c90cfc0().mo136076xe2daf416();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearMaasVersion */
    public ig.r0 m136050xb61bd4a5() {
        this.f70158x961a12dc &= -9;
        this.f70165x6965c16d = ig.s0.m136186x7c90cfc0().mo136078x1f4d2bfc();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearMetricsType */
    public ig.r0 m136051xa219a10() {
        this.f70158x961a12dc &= -2;
        this.f70166x9618a962 = 0;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearPostId */
    public ig.r0 m136054x9c1aee88() {
        this.f70158x961a12dc &= -32769;
        this.f70167xe8ae41e4 = ig.s0.m136186x7c90cfc0().mo136081x2a881cd1();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearSessionId */
    public ig.r0 m136055xd02a6e84() {
        this.f70158x961a12dc &= -3;
        this.f70168x630d8c2e = ig.s0.m136186x7c90cfc0().mo136083x23a7af9b();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTaskId */
    public ig.r0 m136056xa228e62d() {
        this.f70158x961a12dc &= -17;
        this.f70169xa45f3edf = ig.s0.m136186x7c90cfc0().mo136085x30961476();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTaskName */
    public ig.r0 m136057xbb8a571d() {
        this.f70158x961a12dc &= -33;
        this.f70170x9d05caf = ig.s0.m136186x7c90cfc0().mo136087x63651726();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTemplateId */
    public ig.r0 m136058x1fcf7562() {
        this.f70158x961a12dc &= -513;
        this.f70171x697a47ca = ig.s0.m136186x7c90cfc0().mo136089x3bfa572b();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTemplateIndex */
    public ig.r0 m136059xcf33072b() {
        this.f70158x961a12dc &= -1025;
        this.f70172x8d78e6e7 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTemplateSelectReason */
    public ig.r0 m136060x943001e7() {
        this.f70158x961a12dc &= -2049;
        this.f70173x988dbfa5 = ig.s0.m136186x7c90cfc0().mo136092xec85fc70();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTotalDurationMs */
    public ig.r0 m136061xe1e3b2b1() {
        this.f70158x961a12dc &= -129;
        this.f70174x6a3ce361 = 0L;
        m20881x7bb163d5();
        return this;
    }

    @Override // ig.t0
    /* renamed from: getBeginTimeStamp */
    public long mo136067x19fe5b43() {
        return this.f70157x416b3bb2;
    }

    @Override // ig.t0
    /* renamed from: getCamSource */
    public java.lang.String mo136068xcc32ee14() {
        java.lang.Object obj = this.f70159xcbea1cd5;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70159xcbea1cd5 = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getCamSourceBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136069x4a6d8eb7() {
        java.lang.Object obj = this.f70159xcbea1cd5;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70159xcbea1cd5 = h17;
        return h17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return ig.y0.f372835q;
    }

    @Override // ig.t0
    /* renamed from: getDetails */
    public ig.f0 mo136070x9aa62e0c() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70160x9dfff886;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70161x3e45565d;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getDetailsBuilder */
    public ig.e0 m136071x434b3ef() {
        this.f70158x961a12dc |= 8192;
        m20881x7bb163d5();
        return (ig.e0) m136038xaa20896d().d();
    }

    @Override // ig.t0
    /* renamed from: getDetailsOrBuilder */
    public ig.g0 mo136072x1a3fa38c() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70160x9dfff886;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70161x3e45565d;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.t0
    /* renamed from: getEndReason */
    public java.lang.String mo136073x5cc82849() {
        java.lang.Object obj = this.f70162x4dfc2940;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70162x4dfc2940 = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getEndReasonBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136074x227d6da2() {
        java.lang.Object obj = this.f70162x4dfc2940;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70162x4dfc2940 = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getEnterScene */
    public int mo136075xbcc8608a() {
        return this.f70163x26d6a4b;
    }

    @Override // ig.t0
    /* renamed from: getEntryType */
    public java.lang.String mo136076xe2daf416() {
        java.lang.Object obj = this.f70164x8a42d713;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70164x8a42d713 = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getEntryTypeBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136077x5d42f9f5() {
        java.lang.Object obj = this.f70164x8a42d713;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70164x8a42d713 = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getMaasVersion */
    public java.lang.String mo136078x1f4d2bfc() {
        java.lang.Object obj = this.f70165x6965c16d;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70165x6965c16d = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getMaasVersionBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136079x7b15c1cf() {
        java.lang.Object obj = this.f70165x6965c16d;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70165x6965c16d = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getMetricsType */
    public com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 mo136080x7352f167() {
        com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 m32407xdce0328 = com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57.m32407xdce0328(this.f70166x9618a962);
        return m32407xdce0328 == null ? com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57.nPublisherMetricsTypeSession : m32407xdce0328;
    }

    @Override // ig.t0
    /* renamed from: getPostId */
    public java.lang.String mo136081x2a881cd1() {
        java.lang.Object obj = this.f70167xe8ae41e4;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70167xe8ae41e4 = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getPostIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136082x5aa90e1a() {
        java.lang.Object obj = this.f70167xe8ae41e4;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70167xe8ae41e4 = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getSessionId */
    public java.lang.String mo136083x23a7af9b() {
        java.lang.Object obj = this.f70168x630d8c2e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70168x630d8c2e = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getSessionIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136084xb927a990() {
        java.lang.Object obj = this.f70168x630d8c2e;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70168x630d8c2e = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getTaskId */
    public java.lang.String mo136085x30961476() {
        java.lang.Object obj = this.f70169xa45f3edf;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70169xa45f3edf = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getTaskIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136086xab4d1595() {
        java.lang.Object obj = this.f70169xa45f3edf;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70169xa45f3edf = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getTaskName */
    public java.lang.String mo136087x63651726() {
        java.lang.Object obj = this.f70170x9d05caf;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70170x9d05caf = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getTaskNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136088x77e440e5() {
        java.lang.Object obj = this.f70170x9d05caf;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70170x9d05caf = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getTemplateId */
    public java.lang.String mo136089x3bfa572b() {
        java.lang.Object obj = this.f70171x697a47ca;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70171x697a47ca = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getTemplateIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136090xf31f3c00() {
        java.lang.Object obj = this.f70171x697a47ca;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70171x697a47ca = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getTemplateIndex */
    public long mo136091xb16be4c2() {
        return this.f70172x8d78e6e7;
    }

    @Override // ig.t0
    /* renamed from: getTemplateSelectReason */
    public java.lang.String mo136092xec85fc70() {
        java.lang.Object obj = this.f70173x988dbfa5;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70173x988dbfa5 = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getTemplateSelectReasonBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136093xe6d119db() {
        java.lang.Object obj = this.f70173x988dbfa5;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70173x988dbfa5 = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getTotalDurationMs */
    public long mo136094x195b8688() {
        return this.f70174x6a3ce361;
    }

    @Override // ig.t0
    /* renamed from: hasBeginTimeStamp */
    public boolean mo136095x8a855787() {
        return (this.f70158x961a12dc & 64) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasCamSource */
    public boolean mo136096x8c085750() {
        return (this.f70158x961a12dc & 4096) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasDetails */
    public boolean mo136097xd5fcb648() {
        return (this.f70158x961a12dc & 8192) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasEndReason */
    public boolean mo136098x1c9d9185() {
        return (this.f70158x961a12dc & 256) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasEnterScene */
    public boolean mo136099xf7a01ece() {
        return (this.f70158x961a12dc & 16384) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasEntryType */
    public boolean mo136100xa2b05d52() {
        return (this.f70158x961a12dc & 4) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasMaasVersion */
    public boolean mo136101x3f6d3638() {
        return (this.f70158x961a12dc & 8) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasMetricsType */
    public boolean mo136102x9372fba3() {
        return (this.f70158x961a12dc & 1) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasPostId */
    public boolean mo136103xea619d15() {
        return (this.f70158x961a12dc & 32768) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasSessionId */
    public boolean mo136104xe37d18d7() {
        return (this.f70158x961a12dc & 2) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasTaskId */
    public boolean mo136105xf06f94ba() {
        return (this.f70158x961a12dc & 16) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasTaskName */
    public boolean mo136106x92df966a() {
        return (this.f70158x961a12dc & 32) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasTemplateId */
    public boolean mo136107x76d2156f() {
        return (this.f70158x961a12dc & 512) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasTemplateIndex */
    public boolean mo136108x49b24ffe() {
        return (this.f70158x961a12dc & 1024) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasTemplateSelectReason */
    public boolean mo136109x1007b5b4() {
        return (this.f70158x961a12dc & 2048) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasTotalDurationMs */
    public boolean mo136110xb9b412c4() {
        return (this.f70158x961a12dc & 128) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372836r;
        j6Var.c(ig.s0.class, ig.r0.class);
        return j6Var;
    }

    /* renamed from: mergeDetails */
    public ig.r0 m136111x310336ea(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70160x9dfff886;
        if (t9Var == null) {
            if ((this.f70158x961a12dc & 8192) == 0 || (f0Var2 = this.f70161x3e45565d) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70161x3e45565d = f0Var;
            } else {
                this.f70161x3e45565d = ((ig.e0) ig.f0.m135489x3136c9db(this.f70161x3e45565d).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70158x961a12dc |= 8192;
        return this;
    }

    /* renamed from: setBeginTimeStamp */
    public ig.r0 m136113xe1f4c34f(long j17) {
        this.f70158x961a12dc |= 64;
        this.f70157x416b3bb2 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setCamSource */
    public ig.r0 m136114x2886ae88(java.lang.String str) {
        str.getClass();
        this.f70158x961a12dc |= 4096;
        this.f70159xcbea1cd5 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setCamSourceBytes */
    public ig.r0 m136115x1263f6c3(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70158x961a12dc |= 4096;
        this.f70159xcbea1cd5 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setDetails */
    public ig.r0 m136117xe177b80(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70160x9dfff886;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70161x3e45565d = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70158x961a12dc |= 8192;
        return this;
    }

    /* renamed from: setEndReason */
    public ig.r0 m136118xb91be8bd(java.lang.String str) {
        str.getClass();
        this.f70158x961a12dc |= 256;
        this.f70162x4dfc2940 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEndReasonBytes */
    public ig.r0 m136119xea73d5ae(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70158x961a12dc |= 256;
        this.f70162x4dfc2940 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEnterScene */
    public ig.r0 m136120xeaecae96(int i17) {
        this.f70158x961a12dc |= 16384;
        this.f70163x26d6a4b = i17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEntryType */
    public ig.r0 m136121x3f2eb48a(java.lang.String str) {
        str.getClass();
        this.f70158x961a12dc |= 4;
        this.f70164x8a42d713 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEntryTypeBytes */
    public ig.r0 m136122x25396201(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70158x961a12dc |= 4;
        this.f70164x8a42d713 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMaasVersion */
    public ig.r0 m136123xb5b29f70(java.lang.String str) {
        str.getClass();
        this.f70158x961a12dc |= 8;
        this.f70165x6965c16d = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMaasVersionBytes */
    public ig.r0 m136124x1f1256db(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70158x961a12dc |= 8;
        this.f70165x6965c16d = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMetricsType */
    public ig.r0 m136125x9b864db(com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 enumC3969x8364de57) {
        enumC3969x8364de57.getClass();
        this.f70158x961a12dc |= 1;
        this.f70166x9618a962 = enumC3969x8364de57.mo20656x276ffe3f();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPostId */
    public ig.r0 m136126x1dbd50dd(java.lang.String str) {
        str.getClass();
        this.f70158x961a12dc |= 32768;
        this.f70167xe8ae41e4 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPostIdBytes */
    public ig.r0 m136127xf10e818e(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70158x961a12dc |= 32768;
        this.f70167xe8ae41e4 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setSessionId */
    public ig.r0 m136129x7ffb700f(java.lang.String str) {
        str.getClass();
        this.f70158x961a12dc |= 2;
        this.f70168x630d8c2e = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setSessionIdBytes */
    public ig.r0 m136130x811e119c(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70158x961a12dc |= 2;
        this.f70168x630d8c2e = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTaskId */
    public ig.r0 m136131x23cb4882(java.lang.String str) {
        str.getClass();
        this.f70158x961a12dc |= 16;
        this.f70169xa45f3edf = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTaskIdBytes */
    public ig.r0 m136132x41b28909(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70158x961a12dc |= 16;
        this.f70169xa45f3edf = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTaskName */
    public ig.r0 m136133x5e1d7832(java.lang.String str) {
        str.getClass();
        this.f70158x961a12dc |= 32;
        this.f70170x9d05caf = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTaskNameBytes */
    public ig.r0 m136134xabaa759(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70158x961a12dc |= 32;
        this.f70170x9d05caf = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTemplateId */
    public ig.r0 m136135x6a1ea537(java.lang.String str) {
        str.getClass();
        this.f70158x961a12dc |= 512;
        this.f70171x697a47ca = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTemplateIdBytes */
    public ig.r0 m136136x29f5d574(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70158x961a12dc |= 512;
        this.f70171x697a47ca = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTemplateIndex */
    public ig.r0 m136137x44424b36(long j17) {
        this.f70158x961a12dc |= 1024;
        this.f70172x8d78e6e7 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTemplateSelectReason */
    public ig.r0 m136138x66d92b7c(java.lang.String str) {
        str.getClass();
        this.f70158x961a12dc |= 2048;
        this.f70173x988dbfa5 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTemplateSelectReasonBytes */
    public ig.r0 m136139x309d724f(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70158x961a12dc |= 2048;
        this.f70173x988dbfa5 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTotalDurationMs */
    public ig.r0 m136140x50321ffc(long j17) {
        this.f70158x961a12dc |= 128;
        this.f70174x6a3ce361 = j17;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public ig.r0 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public ig.s0 mo20556x59bc66e() {
        ig.s0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public ig.s0 mo20557x85702333() {
        ig.s0 s0Var = new ig.s0(this);
        int i17 = this.f70158x961a12dc;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        s0Var.f70216x9618a962 = this.f70166x9618a962;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        s0Var.f70218x630d8c2e = this.f70168x630d8c2e;
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        s0Var.f70214x8a42d713 = this.f70164x8a42d713;
        if ((i17 & 8) != 0) {
            i18 |= 8;
        }
        s0Var.f70215x6965c16d = this.f70165x6965c16d;
        if ((i17 & 16) != 0) {
            i18 |= 16;
        }
        s0Var.f70219xa45f3edf = this.f70169xa45f3edf;
        if ((i17 & 32) != 0) {
            i18 |= 32;
        }
        s0Var.f70220x9d05caf = this.f70170x9d05caf;
        if ((i17 & 64) != 0) {
            s0Var.f70208x416b3bb2 = this.f70157x416b3bb2;
            i18 |= 64;
        }
        if ((i17 & 128) != 0) {
            s0Var.f70224x6a3ce361 = this.f70174x6a3ce361;
            i18 |= 128;
        }
        if ((i17 & 256) != 0) {
            i18 |= 256;
        }
        s0Var.f70212x4dfc2940 = this.f70162x4dfc2940;
        if ((i17 & 512) != 0) {
            i18 |= 512;
        }
        s0Var.f70221x697a47ca = this.f70171x697a47ca;
        if ((i17 & 1024) != 0) {
            s0Var.f70222x8d78e6e7 = this.f70172x8d78e6e7;
            i18 |= 1024;
        }
        if ((i17 & 2048) != 0) {
            i18 |= 2048;
        }
        s0Var.f70223x988dbfa5 = this.f70173x988dbfa5;
        if ((i17 & 4096) != 0) {
            i18 |= 4096;
        }
        s0Var.f70210xcbea1cd5 = this.f70159xcbea1cd5;
        if ((i17 & 8192) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70160x9dfff886;
            if (t9Var == null) {
                s0Var.f70211x3e45565d = this.f70161x3e45565d;
            } else {
                s0Var.f70211x3e45565d = (ig.f0) t9Var.b();
            }
            i18 |= 8192;
        }
        if ((i17 & 16384) != 0) {
            s0Var.f70213x26d6a4b = this.f70163x26d6a4b;
            i18 |= 16384;
        }
        if ((i17 & 32768) != 0) {
            i18 |= 32768;
        }
        s0Var.f70217xe8ae41e4 = this.f70167xe8ae41e4;
        s0Var.f70209x961a12dc = i18;
        m20880xaf619bdf();
        return s0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearField, reason: merged with bridge method [inline-methods] */
    public ig.r0 m135615xd2ece2ad(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        super.m135615xd2ece2ad(b4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.s0 mo20559x786693c3() {
        return ig.s0.m136186x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public ig.r0 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
    public ig.r0 m135664xe229305e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17, java.lang.Object obj) {
        super.m135664xe229305e(b4Var, i17, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public final ig.r0 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.r0 m135619xd36dfc70(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        super.m135619xd36dfc70(g4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.r0 m135651xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (ig.r0) super.m135651xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.r0 m135610x5a5b64d() {
        super.m135610x5a5b64d();
        this.f70166x9618a962 = 0;
        int i17 = this.f70158x961a12dc & (-2);
        this.f70168x630d8c2e = "";
        this.f70164x8a42d713 = "";
        this.f70165x6965c16d = "";
        this.f70169xa45f3edf = "";
        this.f70170x9d05caf = "";
        this.f70157x416b3bb2 = 0L;
        this.f70174x6a3ce361 = 0L;
        this.f70162x4dfc2940 = "";
        this.f70171x697a47ca = "";
        this.f70172x8d78e6e7 = 0L;
        this.f70173x988dbfa5 = "";
        this.f70159xcbea1cd5 = "";
        this.f70158x961a12dc = i17 & (-3) & (-5) & (-9) & (-17) & (-33) & (-65) & (-129) & (-257) & (-513) & (-1025) & (-2049) & (-4097);
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70160x9dfff886;
        if (t9Var == null) {
            this.f70161x3e45565d = null;
        } else {
            t9Var.c();
        }
        int i18 = this.f70158x961a12dc & (-8193);
        this.f70163x26d6a4b = 0;
        this.f70167xe8ae41e4 = "";
        this.f70158x961a12dc = i18 & (-16385) & (-32769);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.r0 m136066x5a5dd5d() {
        return (ig.r0) super.m135626x5a5dd5d();
    }

    /* renamed from: setDetails */
    public ig.r0 m136116xe177b80(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70160x9dfff886;
        if (t9Var == null) {
            this.f70161x3e45565d = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70158x961a12dc |= 8192;
        return this;
    }

    private r0(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        super(r5Var);
        this.f70166x9618a962 = 0;
        this.f70168x630d8c2e = "";
        this.f70164x8a42d713 = "";
        this.f70165x6965c16d = "";
        this.f70169xa45f3edf = "";
        this.f70170x9d05caf = "";
        this.f70162x4dfc2940 = "";
        this.f70171x697a47ca = "";
        this.f70173x988dbfa5 = "";
        this.f70159xcbea1cd5 = "";
        this.f70167xe8ae41e4 = "";
        m136039x73fef578();
    }
}
