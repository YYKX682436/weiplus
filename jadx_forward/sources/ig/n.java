package ig;

/* loaded from: classes16.dex */
public final class n extends com.p176xb6135e39.p283xc50a8b8b.l6 implements ig.o {

    /* renamed from: ASSETS_FIELD_NUMBER */
    public static final int f70093x4f8be98a = 1;

    /* renamed from: EXPORT_DURATION_MS_FIELD_NUMBER */
    public static final int f70095x8583e1c7 = 4;

    /* renamed from: EXPORT_MUSIC_ID_FIELD_NUMBER */
    public static final int f70096x87c50a6d = 6;

    /* renamed from: EXPORT_MUSIC_SONG_NAME_FIELD_NUMBER */
    public static final int f70097x17df6afd = 8;

    /* renamed from: EXPORT_MUSIC_SOURCE_TYPE_FIELD_NUMBER */
    public static final int f70098xbd162ef4 = 9;

    /* renamed from: EXPORT_TEMPLATE_ID_FIELD_NUMBER */
    public static final int f70099x71ef5b58 = 5;

    /* renamed from: EXPORT_TEMPLATE_SOURCE_TYPE_FIELD_NUMBER */
    public static final int f70100xd4f0b669 = 10;

    /* renamed from: FIXED_TEMPLATE_IDS_FIELD_NUMBER */
    public static final int f70101xa618108f = 11;

    /* renamed from: TEMPLATE_ACTIONS_FIELD_NUMBER */
    public static final int f70103xd7204d15 = 2;

    /* renamed from: TEMPLATE_RECOMMENDATION_FIELD_NUMBER */
    public static final int f70104x944792cf = 7;

    /* renamed from: TOTAL_PREVIEW_DURATION_MS_FIELD_NUMBER */
    public static final int f70105xa12a6a0e = 3;

    /* renamed from: serialVersionUID */
    private static final long f70106x3a3ed56c = 0;

    /* renamed from: assets_ */
    private java.util.List<ig.e> f70107xd5fdfd3c;

    /* renamed from: bitField0_ */
    private int f70108x961a12dc;

    /* renamed from: exportDurationMs_ */
    private long f70109xc85004f1;

    /* renamed from: exportMusicId_ */
    private volatile java.lang.Object f70110x4aac613;

    /* renamed from: exportMusicSongName_ */
    private volatile java.lang.Object f70111x6b27774e;

    /* renamed from: exportMusicSourceType_ */
    private int f70112x20122979;

    /* renamed from: exportTemplateId_ */
    private volatile java.lang.Object f70113x4e494376;

    /* renamed from: exportTemplateSourceType_ */
    private int f70114xac5a93dc;

    /* renamed from: fixedTemplateIds_ */
    private com.p176xb6135e39.p283xc50a8b8b.g7 f70115xdea561d5;

    /* renamed from: templateActions_ */
    private java.util.List<ig.w> f70116xa96eed9c;

    /* renamed from: templateRecommendation_ */
    private ig.a0 f70117x87c1dfec;

    /* renamed from: totalPreviewDurationMs_ */
    private long f70118x8b0aeec1;

    /* renamed from: DEFAULT_INSTANCE */
    private static final ig.n f70094xb3e828f3 = new ig.n();

    /* renamed from: PARSER */
    @java.lang.Deprecated
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f70102x8c3e301f = new ig.l();

    /* renamed from: getDefaultInstance */
    public static ig.n m135930x7c90cfc0() {
        return f70094xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135931xc1a58b65() {
        return ig.y0.f372829k;
    }

    /* renamed from: newBuilder */
    public static ig.m m135932x3136c9db() {
        return f70094xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.n m135934x4a829d50(java.io.InputStream inputStream) {
        return (ig.n) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f70102x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.n m135942x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (ig.n) f70102x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m135946xc4ab3c1f() {
        return f70102x8c3e301f;
    }

    @Override // ig.o
    /* renamed from: getAssets */
    public ig.e mo135758x11279679(int i17) {
        return this.f70107xd5fdfd3c.get(i17);
    }

    @Override // ig.o
    /* renamed from: getAssetsCount */
    public int mo135761x5884ee16() {
        return this.f70107xd5fdfd3c.size();
    }

    @Override // ig.o
    /* renamed from: getAssetsList */
    public java.util.List<ig.e> mo135762x6e39d6b7() {
        return this.f70107xd5fdfd3c;
    }

    @Override // ig.o
    /* renamed from: getAssetsOrBuilder */
    public ig.f mo135763x3e1865bf(int i17) {
        return this.f70107xd5fdfd3c.get(i17);
    }

    @Override // ig.o
    /* renamed from: getAssetsOrBuilderList */
    public java.util.List<? extends ig.f> mo135764xc0592fd() {
        return this.f70107xd5fdfd3c;
    }

    @Override // ig.o
    /* renamed from: getExportDurationMs */
    public long mo135765xa60c88a4() {
        return this.f70109xc85004f1;
    }

    @Override // ig.o
    /* renamed from: getExportMusicId */
    public java.lang.String mo135766x522b7016() {
        java.lang.Object obj = this.f70110x4aac613;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70110x4aac613 = r17;
        }
        return r17;
    }

    @Override // ig.o
    /* renamed from: getExportMusicIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135767x98dffdf5() {
        java.lang.Object obj = this.f70110x4aac613;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70110x4aac613 = h17;
        return h17;
    }

    @Override // ig.o
    /* renamed from: getExportMusicSongName */
    public java.lang.String mo135768x21d64bfb() {
        java.lang.Object obj = this.f70111x6b27774e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70111x6b27774e = r17;
        }
        return r17;
    }

    @Override // ig.o
    /* renamed from: getExportMusicSongNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135769x3f8bc930() {
        java.lang.Object obj = this.f70111x6b27774e;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70111x6b27774e = h17;
        return h17;
    }

    @Override // ig.o
    /* renamed from: getExportMusicSourceType */
    public ig.p mo135770x46831df0() {
        ig.p a17 = ig.p.a(this.f70112x20122979);
        return a17 == null ? ig.p.RECOMMEND : a17;
    }

    @Override // ig.o
    /* renamed from: getExportTemplateId */
    public java.lang.String mo135771xaa5ee57f() {
        java.lang.Object obj = this.f70113x4e494376;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70113x4e494376 = r17;
        }
        return r17;
    }

    @Override // ig.o
    /* renamed from: getExportTemplateIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135772xc2ba822c() {
        java.lang.Object obj = this.f70113x4e494376;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70113x4e494376 = h17;
        return h17;
    }

    @Override // ig.o
    /* renamed from: getExportTemplateSourceType */
    public ig.c0 mo135773xd2831a59() {
        ig.c0 a17 = ig.c0.a(this.f70114xac5a93dc);
        return a17 == null ? ig.c0.UNKNOWN : a17;
    }

    @Override // ig.o
    /* renamed from: getFixedTemplateIds */
    public java.lang.String mo135774x2ae5ff40(int i17) {
        return (java.lang.String) this.f70115xdea561d5.get(i17);
    }

    @Override // ig.o
    /* renamed from: getFixedTemplateIdsBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135775x7112590b(int i17) {
        return this.f70115xdea561d5.f(i17);
    }

    @Override // ig.o
    /* renamed from: getFixedTemplateIdsCount */
    public int mo135776x711be9af() {
        return this.f70115xdea561d5.size();
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m135947x7ea0ace() {
        return f70102x8c3e301f;
    }

    @Override // ig.o
    /* renamed from: getTemplateActions */
    public ig.w mo135778x4cf1c8ed(int i17) {
        return this.f70116xa96eed9c.get(i17);
    }

    @Override // ig.o
    /* renamed from: getTemplateActionsCount */
    public int mo135781x33c2422() {
        return this.f70116xa96eed9c.size();
    }

    @Override // ig.o
    /* renamed from: getTemplateActionsList */
    public java.util.List<ig.w> mo135782x7bfdaf2b() {
        return this.f70116xa96eed9c;
    }

    @Override // ig.o
    /* renamed from: getTemplateActionsOrBuilder */
    public ig.x mo135783xaeedb5cb(int i17) {
        return this.f70116xa96eed9c.get(i17);
    }

    @Override // ig.o
    /* renamed from: getTemplateActionsOrBuilderList */
    public java.util.List<? extends ig.x> mo135784x725bfd09() {
        return this.f70116xa96eed9c;
    }

    @Override // ig.o
    /* renamed from: getTemplateRecommendation */
    public ig.a0 mo135785x9fbbf1c9() {
        ig.a0 a0Var = this.f70117x87c1dfec;
        return a0Var == null ? ig.a0.m135249x7c90cfc0() : a0Var;
    }

    @Override // ig.o
    /* renamed from: getTemplateRecommendationOrBuilder */
    public ig.b0 mo135787x482dc46f() {
        ig.a0 a0Var = this.f70117x87c1dfec;
        return a0Var == null ? ig.a0.m135249x7c90cfc0() : a0Var;
    }

    @Override // ig.o
    /* renamed from: getTotalPreviewDurationMs */
    public long mo135788xb05b3454() {
        return this.f70118x8b0aeec1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // ig.o
    /* renamed from: hasExportDurationMs */
    public boolean mo135789x10c583e8() {
        return (this.f70108x961a12dc & 2) != 0;
    }

    @Override // ig.o
    /* renamed from: hasExportMusicId */
    public boolean mo135790xea71db52() {
        return (this.f70108x961a12dc & 8) != 0;
    }

    @Override // ig.o
    /* renamed from: hasExportMusicSongName */
    public boolean mo135791x8e565a37() {
        return (this.f70108x961a12dc & 32) != 0;
    }

    @Override // ig.o
    /* renamed from: hasExportMusicSourceType */
    public boolean mo135792x93388d2c() {
        return (this.f70108x961a12dc & 64) != 0;
    }

    @Override // ig.o
    /* renamed from: hasExportTemplateId */
    public boolean mo135793x1517e0c3() {
        return (this.f70108x961a12dc & 4) != 0;
    }

    @Override // ig.o
    /* renamed from: hasExportTemplateSourceType */
    public boolean mo135794x803e919d() {
        return (this.f70108x961a12dc & 128) != 0;
    }

    @Override // ig.o
    /* renamed from: hasTemplateRecommendation */
    public boolean mo135795xe9b46a0d() {
        return (this.f70108x961a12dc & 16) != 0;
    }

    @Override // ig.o
    /* renamed from: hasTotalPreviewDurationMs */
    public boolean mo135796xfa53ac98() {
        return (this.f70108x961a12dc & 1) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372830l;
        j6Var.c(ig.n.class, ig.m.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new ig.n();
    }

    private n(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
    }

    /* renamed from: newBuilder */
    public static ig.m m135933x3136c9db(ig.n nVar) {
        return (ig.m) f70094xb3e828f3.mo20599xaaa148a0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) nVar);
    }

    /* renamed from: parseFrom */
    public static ig.n m135943x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.n) f70102x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    @Override // ig.o
    /* renamed from: getFixedTemplateIdsList */
    public com.p176xb6135e39.p283xc50a8b8b.j9 mo135777x3d7883fe() {
        return this.f70115xdea561d5;
    }

    private n() {
        this.f70107xd5fdfd3c = java.util.Collections.emptyList();
        this.f70116xa96eed9c = java.util.Collections.emptyList();
        this.f70113x4e494376 = "";
        this.f70110x4aac613 = "";
        this.f70111x6b27774e = "";
        this.f70112x20122979 = 1;
        this.f70114xac5a93dc = 0;
        this.f70115xdea561d5 = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.n m135935x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.n) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f70102x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.n m135938x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (ig.n) f70102x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.n mo20559x786693c3() {
        return f70094xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public ig.m mo20599xaaa148a0() {
        ig.b bVar = null;
        return this == f70094xb3e828f3 ? new ig.m() : (ig.m) new ig.m().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) this);
    }

    /* renamed from: parseFrom */
    public static ig.n m135939x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.n) f70102x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public ig.m mo20596xab31548() {
        return m135932x3136c9db();
    }

    /* renamed from: parseFrom */
    public static ig.n m135944x92b714fd(byte[] bArr) {
        return (ig.n) f70102x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public ig.m mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new ig.m(r5Var);
    }

    /* renamed from: parseFrom */
    public static ig.n m135945x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.n) f70102x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.n m135940x92b714fd(java.io.InputStream inputStream) {
        return (ig.n) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f70102x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.n m135941x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.n) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f70102x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.n m135936x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (ig.n) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f70102x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static ig.n m135937x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.n) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f70102x8c3e301f, d0Var, t4Var);
    }
}
