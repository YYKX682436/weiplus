package ig;

/* loaded from: classes16.dex */
public final class j0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements ig.k0 {

    /* renamed from: DETAILS_FIELD_NUMBER */
    public static final int f70042xdd3ecd4b = 6;

    /* renamed from: ENTER_SCENE_FIELD_NUMBER */
    public static final int f70043x2c1a4028 = 7;

    /* renamed from: ENTRY_TYPE_FIELD_NUMBER */
    public static final int f70044x4d009486 = 3;

    /* renamed from: EVENT_NAME_FIELD_NUMBER */
    public static final int f70045xa2284fd = 5;

    /* renamed from: MAAS_VERSION_FIELD_NUMBER */
    public static final int f70046xcd4dfc4e = 4;

    /* renamed from: METRICS_TYPE_FIELD_NUMBER */
    public static final int f70047x7fe5be97 = 1;

    /* renamed from: POST_ID_FIELD_NUMBER */
    public static final int f70049x127e4553 = 8;

    /* renamed from: SESSION_ID_FIELD_NUMBER */
    public static final int f70050x66da5729 = 2;

    /* renamed from: serialVersionUID */
    private static final long f70051x3a3ed56c = 0;

    /* renamed from: bitField0_ */
    private int f70052x961a12dc;

    /* renamed from: details_ */
    private ig.f0 f70053x3e45565d;

    /* renamed from: enterScene_ */
    private int f70054x26d6a4b;

    /* renamed from: entryType_ */
    private volatile java.lang.Object f70055x8a42d713;

    /* renamed from: eventName_ */
    private volatile java.lang.Object f70056x39b404ba;

    /* renamed from: maasVersion_ */
    private volatile java.lang.Object f70057x6965c16d;

    /* renamed from: metricsType_ */
    private int f70058x9618a962;

    /* renamed from: postId_ */
    private volatile java.lang.Object f70059xe8ae41e4;

    /* renamed from: sessionId_ */
    private volatile java.lang.Object f70060x630d8c2e;

    /* renamed from: DEFAULT_INSTANCE */
    private static final ig.j0 f70041xb3e828f3 = new ig.j0();

    /* renamed from: PARSER */
    @java.lang.Deprecated
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f70048x8c3e301f = new ig.h0();

    /* renamed from: getDefaultInstance */
    public static ig.j0 m135684x7c90cfc0() {
        return f70041xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135685xc1a58b65() {
        return ig.y0.f372839u;
    }

    /* renamed from: newBuilder */
    public static ig.i0 m135686x3136c9db() {
        return f70041xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.j0 m135688x4a829d50(java.io.InputStream inputStream) {
        return (ig.j0) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f70048x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.j0 m135696x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (ig.j0) f70048x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m135700xc4ab3c1f() {
        return f70048x8c3e301f;
    }

    @Override // ig.k0
    /* renamed from: getDetails */
    public ig.f0 mo135627x9aa62e0c() {
        ig.f0 f0Var = this.f70053x3e45565d;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.k0
    /* renamed from: getDetailsOrBuilder */
    public ig.g0 mo135629x1a3fa38c() {
        ig.f0 f0Var = this.f70053x3e45565d;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.k0
    /* renamed from: getEnterScene */
    public int mo135630xbcc8608a() {
        return this.f70054x26d6a4b;
    }

    @Override // ig.k0
    /* renamed from: getEntryType */
    public java.lang.String mo135631xe2daf416() {
        java.lang.Object obj = this.f70055x8a42d713;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70055x8a42d713 = r17;
        }
        return r17;
    }

    @Override // ig.k0
    /* renamed from: getEntryTypeBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135632x5d42f9f5() {
        java.lang.Object obj = this.f70055x8a42d713;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70055x8a42d713 = h17;
        return h17;
    }

    @Override // ig.k0
    /* renamed from: getEventName */
    public java.lang.String mo135633x149f58f() {
        java.lang.Object obj = this.f70056x39b404ba;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70056x39b404ba = r17;
        }
        return r17;
    }

    @Override // ig.k0
    /* renamed from: getEventNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135634x6f86fc1c() {
        java.lang.Object obj = this.f70056x39b404ba;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70056x39b404ba = h17;
        return h17;
    }

    @Override // ig.k0
    /* renamed from: getMaasVersion */
    public java.lang.String mo135635x1f4d2bfc() {
        java.lang.Object obj = this.f70057x6965c16d;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70057x6965c16d = r17;
        }
        return r17;
    }

    @Override // ig.k0
    /* renamed from: getMaasVersionBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135636x7b15c1cf() {
        java.lang.Object obj = this.f70057x6965c16d;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70057x6965c16d = h17;
        return h17;
    }

    @Override // ig.k0
    /* renamed from: getMetricsType */
    public com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 mo135637x7352f167() {
        com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 m32407xdce0328 = com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57.m32407xdce0328(this.f70058x9618a962);
        return m32407xdce0328 == null ? com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57.nPublisherMetricsTypeSession : m32407xdce0328;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m135701x7ea0ace() {
        return f70048x8c3e301f;
    }

    @Override // ig.k0
    /* renamed from: getPostId */
    public java.lang.String mo135638x2a881cd1() {
        java.lang.Object obj = this.f70059xe8ae41e4;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70059xe8ae41e4 = r17;
        }
        return r17;
    }

    @Override // ig.k0
    /* renamed from: getPostIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135639x5aa90e1a() {
        java.lang.Object obj = this.f70059xe8ae41e4;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70059xe8ae41e4 = h17;
        return h17;
    }

    @Override // ig.k0
    /* renamed from: getSessionId */
    public java.lang.String mo135640x23a7af9b() {
        java.lang.Object obj = this.f70060x630d8c2e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70060x630d8c2e = r17;
        }
        return r17;
    }

    @Override // ig.k0
    /* renamed from: getSessionIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135641xb927a990() {
        java.lang.Object obj = this.f70060x630d8c2e;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70060x630d8c2e = h17;
        return h17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // ig.k0
    /* renamed from: hasDetails */
    public boolean mo135642xd5fcb648() {
        return (this.f70052x961a12dc & 32) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasEnterScene */
    public boolean mo135643xf7a01ece() {
        return (this.f70052x961a12dc & 64) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasEntryType */
    public boolean mo135644xa2b05d52() {
        return (this.f70052x961a12dc & 4) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasEventName */
    public boolean mo135645xc11f5ecb() {
        return (this.f70052x961a12dc & 16) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasMaasVersion */
    public boolean mo135646x3f6d3638() {
        return (this.f70052x961a12dc & 8) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasMetricsType */
    public boolean mo135647x9372fba3() {
        return (this.f70052x961a12dc & 1) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasPostId */
    public boolean mo135648xea619d15() {
        return (this.f70052x961a12dc & 128) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasSessionId */
    public boolean mo135649xe37d18d7() {
        return (this.f70052x961a12dc & 2) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372840v;
        j6Var.c(ig.j0.class, ig.i0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new ig.j0();
    }

    private j0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
    }

    /* renamed from: newBuilder */
    public static ig.i0 m135687x3136c9db(ig.j0 j0Var) {
        return (ig.i0) f70041xb3e828f3.mo20599xaaa148a0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) j0Var);
    }

    /* renamed from: parseFrom */
    public static ig.j0 m135697x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.j0) f70048x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private j0() {
        this.f70058x9618a962 = 0;
        this.f70060x630d8c2e = "";
        this.f70055x8a42d713 = "";
        this.f70057x6965c16d = "";
        this.f70056x39b404ba = "";
        this.f70059xe8ae41e4 = "";
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.j0 m135689x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.j0) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f70048x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.j0 m135692x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (ig.j0) f70048x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.j0 mo20559x786693c3() {
        return f70041xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public ig.i0 mo20599xaaa148a0() {
        ig.b bVar = null;
        return this == f70041xb3e828f3 ? new ig.i0() : (ig.i0) new ig.i0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) this);
    }

    /* renamed from: parseFrom */
    public static ig.j0 m135693x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.j0) f70048x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public ig.i0 mo20596xab31548() {
        return m135686x3136c9db();
    }

    /* renamed from: parseFrom */
    public static ig.j0 m135698x92b714fd(byte[] bArr) {
        return (ig.j0) f70048x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public ig.i0 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new ig.i0(r5Var);
    }

    /* renamed from: parseFrom */
    public static ig.j0 m135699x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.j0) f70048x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.j0 m135694x92b714fd(java.io.InputStream inputStream) {
        return (ig.j0) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f70048x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.j0 m135695x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.j0) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f70048x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.j0 m135690x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (ig.j0) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f70048x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static ig.j0 m135691x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.j0) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f70048x8c3e301f, d0Var, t4Var);
    }
}
