package ig;

/* loaded from: classes16.dex */
public final class s extends com.p176xb6135e39.p283xc50a8b8b.l6 implements ig.t {

    /* renamed from: DEFAULT_INSTANCE */
    private static final ig.s f70175xb3e828f3 = new ig.s();

    /* renamed from: PARSER */
    @java.lang.Deprecated
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f70176x8c3e301f = new ig.q();

    /* renamed from: PREVIEW_DURATION_MS_FIELD_NUMBER */
    public static final int f70177x87009453 = 4;

    /* renamed from: PREVIEW_MUSIC_ID_FIELD_NUMBER */
    public static final int f70178x6ecc4361 = 1;

    /* renamed from: PREVIEW_MUSIC_SONG_NAME_FIELD_NUMBER */
    public static final int f70179xcf67f789 = 3;

    /* renamed from: PREVIEW_MUSIC_SOURCE_TYPE_FIELD_NUMBER */
    public static final int f70180xb4adc880 = 2;

    /* renamed from: TIMELINE_DURATION_MS_FIELD_NUMBER */
    public static final int f70181xf55f6dda = 5;

    /* renamed from: serialVersionUID */
    private static final long f70182x3a3ed56c = 0;

    /* renamed from: bitField0_ */
    private int f70183x961a12dc;

    /* renamed from: previewDurationMs_ */
    private long f70184xed4f205d;

    /* renamed from: previewMusicId_ */
    private volatile java.lang.Object f70185x1f134227;

    /* renamed from: previewMusicSongName_ */
    private volatile java.lang.Object f70186xbe3f9462;

    /* renamed from: previewMusicSourceType_ */
    private int f70187xd97518d;

    /* renamed from: timelineDurationMs_ */
    private long f70188x80c05a44;

    /* renamed from: getDefaultInstance */
    public static ig.s m136149x7c90cfc0() {
        return f70175xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m136150xc1a58b65() {
        return ig.y0.f372823e;
    }

    /* renamed from: newBuilder */
    public static ig.r m136151x3136c9db() {
        return f70175xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.s m136153x4a829d50(java.io.InputStream inputStream) {
        return (ig.s) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f70176x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.s m136161x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (ig.s) f70176x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m136165xc4ab3c1f() {
        return f70176x8c3e301f;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m136166x7ea0ace() {
        return f70176x8c3e301f;
    }

    @Override // ig.t
    /* renamed from: getPreviewDurationMs */
    public long mo136016x73a26f8c() {
        return this.f70184xed4f205d;
    }

    @Override // ig.t
    /* renamed from: getPreviewMusicId */
    public java.lang.String mo136017x52b1322e() {
        java.lang.Object obj = this.f70185x1f134227;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70185x1f134227 = r17;
        }
        return r17;
    }

    @Override // ig.t
    /* renamed from: getPreviewMusicIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136018x5897cadd() {
        java.lang.Object obj = this.f70185x1f134227;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70185x1f134227 = h17;
        return h17;
    }

    @Override // ig.t
    /* renamed from: getPreviewMusicSongName */
    public java.lang.String mo136019x59181c13() {
        java.lang.Object obj = this.f70186xbe3f9462;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70186xbe3f9462 = r17;
        }
        return r17;
    }

    @Override // ig.t
    /* renamed from: getPreviewMusicSongNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136020x81e04818() {
        java.lang.Object obj = this.f70186xbe3f9462;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70186xbe3f9462 = h17;
        return h17;
    }

    @Override // ig.t
    /* renamed from: getPreviewMusicSourceType */
    public ig.p mo136021xb4914808() {
        ig.p a17 = ig.p.a(this.f70187xd97518d);
        return a17 == null ? ig.p.RECOMMEND : a17;
    }

    @Override // ig.t
    /* renamed from: getTimelineDurationMs */
    public long mo136022xa3e6b771() {
        return this.f70188x80c05a44;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // ig.t
    /* renamed from: hasPreviewDurationMs */
    public boolean mo136023x6008dcc8() {
        return (this.f70183x961a12dc & 8) != 0;
    }

    @Override // ig.t
    /* renamed from: hasPreviewMusicId */
    public boolean mo136024xc3382e72() {
        return (this.f70183x961a12dc & 1) != 0;
    }

    @Override // ig.t
    /* renamed from: hasPreviewMusicSongName */
    public boolean mo136025x7c99d557() {
        return (this.f70183x961a12dc & 4) != 0;
    }

    @Override // ig.t
    /* renamed from: hasPreviewMusicSourceType */
    public boolean mo136026xfe89c04c() {
        return (this.f70183x961a12dc & 2) != 0;
    }

    @Override // ig.t
    /* renamed from: hasTimelineDurationMs */
    public boolean mo136027x444df1b5() {
        return (this.f70183x961a12dc & 16) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372824f;
        j6Var.c(ig.s.class, ig.r.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new ig.s();
    }

    private s(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
    }

    /* renamed from: newBuilder */
    public static ig.r m136152x3136c9db(ig.s sVar) {
        return (ig.r) f70175xb3e828f3.mo20599xaaa148a0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) sVar);
    }

    /* renamed from: parseFrom */
    public static ig.s m136162x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.s) f70176x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private s() {
        this.f70185x1f134227 = "";
        this.f70187xd97518d = 1;
        this.f70186xbe3f9462 = "";
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.s m136154x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.s) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f70176x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.s m136157x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (ig.s) f70176x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.s mo20559x786693c3() {
        return f70175xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public ig.r mo20599xaaa148a0() {
        ig.b bVar = null;
        return this == f70175xb3e828f3 ? new ig.r() : (ig.r) new ig.r().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) this);
    }

    /* renamed from: parseFrom */
    public static ig.s m136158x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.s) f70176x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public ig.r mo20596xab31548() {
        return m136151x3136c9db();
    }

    /* renamed from: parseFrom */
    public static ig.s m136163x92b714fd(byte[] bArr) {
        return (ig.s) f70176x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public ig.r mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new ig.r(r5Var);
    }

    /* renamed from: parseFrom */
    public static ig.s m136164x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.s) f70176x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.s m136159x92b714fd(java.io.InputStream inputStream) {
        return (ig.s) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f70176x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.s m136160x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.s) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f70176x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.s m136155x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (ig.s) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f70176x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static ig.s m136156x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.s) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f70176x8c3e301f, d0Var, t4Var);
    }
}
