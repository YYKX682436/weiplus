package ig;

/* loaded from: classes16.dex */
public final class s0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements ig.t0 {

    /* renamed from: BEGIN_TIME_STAMP_FIELD_NUMBER */
    public static final int f70189xcd055a66 = 7;

    /* renamed from: CAM_SOURCE_FIELD_NUMBER */
    public static final int f70190xc9480f62 = 13;

    /* renamed from: DETAILS_FIELD_NUMBER */
    public static final int f70192xdd3ecd4b = 14;

    /* renamed from: END_REASON_FIELD_NUMBER */
    public static final int f70193x1197ae5 = 9;

    /* renamed from: ENTER_SCENE_FIELD_NUMBER */
    public static final int f70194x2c1a4028 = 15;

    /* renamed from: ENTRY_TYPE_FIELD_NUMBER */
    public static final int f70195x4d009486 = 3;

    /* renamed from: MAAS_VERSION_FIELD_NUMBER */
    public static final int f70196xcd4dfc4e = 4;

    /* renamed from: METRICS_TYPE_FIELD_NUMBER */
    public static final int f70197x7fe5be97 = 1;

    /* renamed from: POST_ID_FIELD_NUMBER */
    public static final int f70199x127e4553 = 16;

    /* renamed from: SESSION_ID_FIELD_NUMBER */
    public static final int f70200x66da5729 = 2;

    /* renamed from: TASK_ID_FIELD_NUMBER */
    public static final int f70201x9bbb7838 = 5;

    /* renamed from: TASK_NAME_FIELD_NUMBER */
    public static final int f70202x1680ab48 = 6;

    /* renamed from: TEMPLATE_ID_FIELD_NUMBER */
    public static final int f70203x552a7d2d = 10;

    /* renamed from: TEMPLATE_INDEX_FIELD_NUMBER */
    public static final int f70204xfd14f8a0 = 11;

    /* renamed from: TEMPLATE_SELECT_REASON_FIELD_NUMBER */
    public static final int f70205xcc176b8b = 12;

    /* renamed from: TOTAL_DURATION_MS_FIELD_NUMBER */
    public static final int f70206x8dabc457 = 8;

    /* renamed from: serialVersionUID */
    private static final long f70207x3a3ed56c = 0;

    /* renamed from: beginTimeStamp_ */
    private long f70208x416b3bb2;

    /* renamed from: bitField0_ */
    private int f70209x961a12dc;

    /* renamed from: camSource_ */
    private volatile java.lang.Object f70210xcbea1cd5;

    /* renamed from: details_ */
    private ig.f0 f70211x3e45565d;

    /* renamed from: endReason_ */
    private volatile java.lang.Object f70212x4dfc2940;

    /* renamed from: enterScene_ */
    private int f70213x26d6a4b;

    /* renamed from: entryType_ */
    private volatile java.lang.Object f70214x8a42d713;

    /* renamed from: maasVersion_ */
    private volatile java.lang.Object f70215x6965c16d;

    /* renamed from: metricsType_ */
    private int f70216x9618a962;

    /* renamed from: postId_ */
    private volatile java.lang.Object f70217xe8ae41e4;

    /* renamed from: sessionId_ */
    private volatile java.lang.Object f70218x630d8c2e;

    /* renamed from: taskId_ */
    private volatile java.lang.Object f70219xa45f3edf;

    /* renamed from: taskName_ */
    private volatile java.lang.Object f70220x9d05caf;

    /* renamed from: templateId_ */
    private volatile java.lang.Object f70221x697a47ca;

    /* renamed from: templateIndex_ */
    private long f70222x8d78e6e7;

    /* renamed from: templateSelectReason_ */
    private volatile java.lang.Object f70223x988dbfa5;

    /* renamed from: totalDurationMs_ */
    private long f70224x6a3ce361;

    /* renamed from: DEFAULT_INSTANCE */
    private static final ig.s0 f70191xb3e828f3 = new ig.s0();

    /* renamed from: PARSER */
    @java.lang.Deprecated
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f70198x8c3e301f = new ig.q0();

    /* renamed from: getDefaultInstance */
    public static ig.s0 m136186x7c90cfc0() {
        return f70191xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m136187xc1a58b65() {
        return ig.y0.f372835q;
    }

    /* renamed from: newBuilder */
    public static ig.r0 m136188x3136c9db() {
        return f70191xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.s0 m136190x4a829d50(java.io.InputStream inputStream) {
        return (ig.s0) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f70198x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.s0 m136198x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (ig.s0) f70198x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m136202xc4ab3c1f() {
        return f70198x8c3e301f;
    }

    @Override // ig.t0
    /* renamed from: getBeginTimeStamp */
    public long mo136067x19fe5b43() {
        return this.f70208x416b3bb2;
    }

    @Override // ig.t0
    /* renamed from: getCamSource */
    public java.lang.String mo136068xcc32ee14() {
        java.lang.Object obj = this.f70210xcbea1cd5;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70210xcbea1cd5 = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getCamSourceBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136069x4a6d8eb7() {
        java.lang.Object obj = this.f70210xcbea1cd5;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70210xcbea1cd5 = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getDetails */
    public ig.f0 mo136070x9aa62e0c() {
        ig.f0 f0Var = this.f70211x3e45565d;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.t0
    /* renamed from: getDetailsOrBuilder */
    public ig.g0 mo136072x1a3fa38c() {
        ig.f0 f0Var = this.f70211x3e45565d;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.t0
    /* renamed from: getEndReason */
    public java.lang.String mo136073x5cc82849() {
        java.lang.Object obj = this.f70212x4dfc2940;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70212x4dfc2940 = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getEndReasonBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136074x227d6da2() {
        java.lang.Object obj = this.f70212x4dfc2940;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70212x4dfc2940 = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getEnterScene */
    public int mo136075xbcc8608a() {
        return this.f70213x26d6a4b;
    }

    @Override // ig.t0
    /* renamed from: getEntryType */
    public java.lang.String mo136076xe2daf416() {
        java.lang.Object obj = this.f70214x8a42d713;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70214x8a42d713 = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getEntryTypeBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136077x5d42f9f5() {
        java.lang.Object obj = this.f70214x8a42d713;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70214x8a42d713 = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getMaasVersion */
    public java.lang.String mo136078x1f4d2bfc() {
        java.lang.Object obj = this.f70215x6965c16d;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70215x6965c16d = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getMaasVersionBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136079x7b15c1cf() {
        java.lang.Object obj = this.f70215x6965c16d;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70215x6965c16d = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getMetricsType */
    public com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 mo136080x7352f167() {
        com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 m32407xdce0328 = com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57.m32407xdce0328(this.f70216x9618a962);
        return m32407xdce0328 == null ? com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57.nPublisherMetricsTypeSession : m32407xdce0328;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m136203x7ea0ace() {
        return f70198x8c3e301f;
    }

    @Override // ig.t0
    /* renamed from: getPostId */
    public java.lang.String mo136081x2a881cd1() {
        java.lang.Object obj = this.f70217xe8ae41e4;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70217xe8ae41e4 = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getPostIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136082x5aa90e1a() {
        java.lang.Object obj = this.f70217xe8ae41e4;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70217xe8ae41e4 = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getSessionId */
    public java.lang.String mo136083x23a7af9b() {
        java.lang.Object obj = this.f70218x630d8c2e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70218x630d8c2e = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getSessionIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136084xb927a990() {
        java.lang.Object obj = this.f70218x630d8c2e;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70218x630d8c2e = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getTaskId */
    public java.lang.String mo136085x30961476() {
        java.lang.Object obj = this.f70219xa45f3edf;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70219xa45f3edf = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getTaskIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136086xab4d1595() {
        java.lang.Object obj = this.f70219xa45f3edf;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70219xa45f3edf = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getTaskName */
    public java.lang.String mo136087x63651726() {
        java.lang.Object obj = this.f70220x9d05caf;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70220x9d05caf = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getTaskNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136088x77e440e5() {
        java.lang.Object obj = this.f70220x9d05caf;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70220x9d05caf = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getTemplateId */
    public java.lang.String mo136089x3bfa572b() {
        java.lang.Object obj = this.f70221x697a47ca;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70221x697a47ca = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getTemplateIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136090xf31f3c00() {
        java.lang.Object obj = this.f70221x697a47ca;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70221x697a47ca = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getTemplateIndex */
    public long mo136091xb16be4c2() {
        return this.f70222x8d78e6e7;
    }

    @Override // ig.t0
    /* renamed from: getTemplateSelectReason */
    public java.lang.String mo136092xec85fc70() {
        java.lang.Object obj = this.f70223x988dbfa5;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70223x988dbfa5 = r17;
        }
        return r17;
    }

    @Override // ig.t0
    /* renamed from: getTemplateSelectReasonBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136093xe6d119db() {
        java.lang.Object obj = this.f70223x988dbfa5;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70223x988dbfa5 = h17;
        return h17;
    }

    @Override // ig.t0
    /* renamed from: getTotalDurationMs */
    public long mo136094x195b8688() {
        return this.f70224x6a3ce361;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // ig.t0
    /* renamed from: hasBeginTimeStamp */
    public boolean mo136095x8a855787() {
        return (this.f70209x961a12dc & 64) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasCamSource */
    public boolean mo136096x8c085750() {
        return (this.f70209x961a12dc & 4096) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasDetails */
    public boolean mo136097xd5fcb648() {
        return (this.f70209x961a12dc & 8192) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasEndReason */
    public boolean mo136098x1c9d9185() {
        return (this.f70209x961a12dc & 256) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasEnterScene */
    public boolean mo136099xf7a01ece() {
        return (this.f70209x961a12dc & 16384) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasEntryType */
    public boolean mo136100xa2b05d52() {
        return (this.f70209x961a12dc & 4) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasMaasVersion */
    public boolean mo136101x3f6d3638() {
        return (this.f70209x961a12dc & 8) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasMetricsType */
    public boolean mo136102x9372fba3() {
        return (this.f70209x961a12dc & 1) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasPostId */
    public boolean mo136103xea619d15() {
        return (this.f70209x961a12dc & 32768) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasSessionId */
    public boolean mo136104xe37d18d7() {
        return (this.f70209x961a12dc & 2) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasTaskId */
    public boolean mo136105xf06f94ba() {
        return (this.f70209x961a12dc & 16) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasTaskName */
    public boolean mo136106x92df966a() {
        return (this.f70209x961a12dc & 32) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasTemplateId */
    public boolean mo136107x76d2156f() {
        return (this.f70209x961a12dc & 512) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasTemplateIndex */
    public boolean mo136108x49b24ffe() {
        return (this.f70209x961a12dc & 1024) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasTemplateSelectReason */
    public boolean mo136109x1007b5b4() {
        return (this.f70209x961a12dc & 2048) != 0;
    }

    @Override // ig.t0
    /* renamed from: hasTotalDurationMs */
    public boolean mo136110xb9b412c4() {
        return (this.f70209x961a12dc & 128) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372836r;
        j6Var.c(ig.s0.class, ig.r0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new ig.s0();
    }

    private s0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
    }

    /* renamed from: newBuilder */
    public static ig.r0 m136189x3136c9db(ig.s0 s0Var) {
        return (ig.r0) f70191xb3e828f3.mo20599xaaa148a0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) s0Var);
    }

    /* renamed from: parseFrom */
    public static ig.s0 m136199x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.s0) f70198x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private s0() {
        this.f70216x9618a962 = 0;
        this.f70218x630d8c2e = "";
        this.f70214x8a42d713 = "";
        this.f70215x6965c16d = "";
        this.f70219xa45f3edf = "";
        this.f70220x9d05caf = "";
        this.f70212x4dfc2940 = "";
        this.f70221x697a47ca = "";
        this.f70223x988dbfa5 = "";
        this.f70210xcbea1cd5 = "";
        this.f70217xe8ae41e4 = "";
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.s0 m136191x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.s0) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f70198x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.s0 m136194x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (ig.s0) f70198x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.s0 mo20559x786693c3() {
        return f70191xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public ig.r0 mo20599xaaa148a0() {
        ig.b bVar = null;
        return this == f70191xb3e828f3 ? new ig.r0() : (ig.r0) new ig.r0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) this);
    }

    /* renamed from: parseFrom */
    public static ig.s0 m136195x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.s0) f70198x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public ig.r0 mo20596xab31548() {
        return m136188x3136c9db();
    }

    /* renamed from: parseFrom */
    public static ig.s0 m136200x92b714fd(byte[] bArr) {
        return (ig.s0) f70198x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public ig.r0 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new ig.r0(r5Var);
    }

    /* renamed from: parseFrom */
    public static ig.s0 m136201x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.s0) f70198x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.s0 m136196x92b714fd(java.io.InputStream inputStream) {
        return (ig.s0) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f70198x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.s0 m136197x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.s0) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f70198x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.s0 m136192x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (ig.s0) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f70198x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static ig.s0 m136193x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.s0) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f70198x8c3e301f, d0Var, t4Var);
    }
}
