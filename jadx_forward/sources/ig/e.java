package ig;

/* loaded from: classes16.dex */
public final class e extends com.p176xb6135e39.p283xc50a8b8b.l6 implements ig.f {

    /* renamed from: AI_TAGS_FIELD_NUMBER */
    public static final int f69965xfe0b005d = 4;

    /* renamed from: ASPECT_RATIO_FIELD_NUMBER */
    public static final int f69966xd019d169 = 3;

    /* renamed from: ASSET_FILE_PATH_FIELD_NUMBER */
    public static final int f69967xe23abe74 = 13;

    /* renamed from: ASSET_IDENTIFIER_FIELD_NUMBER */
    public static final int f69968x93f7cdb5 = 12;

    /* renamed from: DURATION_MS_FIELD_NUMBER */
    public static final int f69970x68bf039c = 2;

    /* renamed from: IMAGE_CLASS_EXCEEDS_FIELD_NUMBER */
    public static final int f69971xe55d5979 = 9;

    /* renamed from: IMAGE_CLASS_LABELS_FIELD_NUMBER */
    public static final int f69972xa53f6f23 = 8;

    /* renamed from: IS_OVER_THRESHOLD_FIELD_NUMBER */
    public static final int f69973xd9269ff8 = 6;

    /* renamed from: MEDIA_TYPE_FIELD_NUMBER */
    public static final int f69974xada0c378 = 1;

    /* renamed from: ORIGIN_ID_FIELD_NUMBER */
    public static final int f69975x4a538bd9 = 5;

    /* renamed from: VIDEO_CLASS_AUDIO_LABELS_FIELD_NUMBER */
    public static final int f69977xbd04107a = 7;

    /* renamed from: VIDEO_CLASS_VISUAL_EXCEEDS_FIELD_NUMBER */
    public static final int f69978x93503dc2 = 11;

    /* renamed from: VIDEO_CLASS_VISUAL_LABELS_FIELD_NUMBER */
    public static final int f69979xe4aa5dba = 10;

    /* renamed from: serialVersionUID */
    private static final long f69980x3a3ed56c = 0;

    /* renamed from: aiTags_ */
    private volatile java.lang.Object f69981xc336ac1e;

    /* renamed from: aspectRatio_ */
    private volatile java.lang.Object f69982xe20f102c;

    /* renamed from: assetFilePath_ */
    private volatile java.lang.Object f69983xc655cbae;

    /* renamed from: assetIdentifier_ */
    private volatile java.lang.Object f69984x979e6fc6;

    /* renamed from: bitField0_ */
    private int f69985x961a12dc;

    /* renamed from: durationMs_ */
    private long f69986xe3810945;

    /* renamed from: imageClassExceeds_ */
    private com.p176xb6135e39.p283xc50a8b8b.t6 f69987x9c21dcfd;

    /* renamed from: imageClassLabels_ */
    private com.p176xb6135e39.p283xc50a8b8b.t6 f69988x2eff44a3;

    /* renamed from: isOverThreshold_ */
    private boolean f69989x2c555112;

    /* renamed from: mediaType_ */
    private int f69990x730746e1;

    /* renamed from: originId_ */
    private volatile java.lang.Object f69991xf41e559e;

    /* renamed from: videoClassAudioLabels_ */
    private com.p176xb6135e39.p283xc50a8b8b.t6 f69992x9c2a99e7;

    /* renamed from: videoClassVisualExceeds_ */
    private com.p176xb6135e39.p283xc50a8b8b.t6 f69993x5af9577d;

    /* renamed from: videoClassVisualLabels_ */
    private com.p176xb6135e39.p283xc50a8b8b.t6 f69994xd20e7a23;

    /* renamed from: DEFAULT_INSTANCE */
    private static final ig.e f69969xb3e828f3 = new ig.e();

    /* renamed from: PARSER */
    @java.lang.Deprecated
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f69976x8c3e301f = new ig.c();

    public /* synthetic */ e(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, ig.b bVar) {
        this(q5Var);
    }

    /* renamed from: getDefaultInstance */
    public static ig.e m135423x7c90cfc0() {
        return f69969xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135424xc1a58b65() {
        return ig.y0.f372821c;
    }

    /* renamed from: newBuilder */
    public static ig.d m135425x3136c9db() {
        return f69969xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.e m135427x4a829d50(java.io.InputStream inputStream) {
        return (ig.e) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f69976x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.e m135435x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (ig.e) f69976x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m135439xc4ab3c1f() {
        return f69976x8c3e301f;
    }

    @Override // ig.f
    /* renamed from: getAiTags */
    public java.lang.String mo135331x108c8357() {
        java.lang.Object obj = this.f69981xc336ac1e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69981xc336ac1e = r17;
        }
        return r17;
    }

    @Override // ig.f
    /* renamed from: getAiTagsBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135332x8a1dcb54() {
        java.lang.Object obj = this.f69981xc336ac1e;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69981xc336ac1e = h17;
        return h17;
    }

    @Override // ig.f
    /* renamed from: getAspectRatio */
    public java.lang.String mo135333x1aef895d() {
        java.lang.Object obj = this.f69982xe20f102c;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69982xe20f102c = r17;
        }
        return r17;
    }

    @Override // ig.f
    /* renamed from: getAspectRatioBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135334xcceb990e() {
        java.lang.Object obj = this.f69982xe20f102c;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69982xe20f102c = h17;
        return h17;
    }

    @Override // ig.f
    /* renamed from: getAssetFilePath */
    public java.lang.String mo135335xdc8bcb1b() {
        java.lang.Object obj = this.f69983xc655cbae;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69983xc655cbae = r17;
        }
        return r17;
    }

    @Override // ig.f
    /* renamed from: getAssetFilePathBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135336xdc08be10() {
        java.lang.Object obj = this.f69983xc655cbae;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69983xc655cbae = h17;
        return h17;
    }

    @Override // ig.f
    /* renamed from: getAssetIdentifier */
    public java.lang.String mo135337x23145983() {
        java.lang.Object obj = this.f69984x979e6fc6;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69984x979e6fc6 = r17;
        }
        return r17;
    }

    @Override // ig.f
    /* renamed from: getAssetIdentifierBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135338x6c20f0a8() {
        java.lang.Object obj = this.f69984x979e6fc6;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69984x979e6fc6 = h17;
        return h17;
    }

    @Override // ig.f
    /* renamed from: getDurationMs */
    public long mo135339x37a7fa50() {
        return this.f69986xe3810945;
    }

    @Override // ig.f
    /* renamed from: getImageClassExceeds */
    public int mo135340x37359eec(int i17) {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69987x9c21dcfd).h(i17);
    }

    @Override // ig.f
    /* renamed from: getImageClassExceedsCount */
    public int mo135341x36393583() {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69987x9c21dcfd).f126862f;
    }

    @Override // ig.f
    /* renamed from: getImageClassExceedsList */
    public java.util.List<java.lang.Integer> mo135342x54586daa() {
        return this.f69987x9c21dcfd;
    }

    @Override // ig.f
    /* renamed from: getImageClassLabels */
    public int mo135343x2d7d8ab2(int i17) {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69988x2eff44a3).h(i17);
    }

    @Override // ig.f
    /* renamed from: getImageClassLabelsCount */
    public int mo135344x690bb57d() {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69988x2eff44a3).f126862f;
    }

    @Override // ig.f
    /* renamed from: getImageClassLabelsList */
    public java.util.List<java.lang.Integer> mo135345xc9990670() {
        return this.f69988x2eff44a3;
    }

    @Override // ig.f
    /* renamed from: getIsOverThreshold */
    public boolean mo135346xfe961eb7() {
        return this.f69989x2c555112;
    }

    @Override // ig.f
    /* renamed from: getMediaType */
    public ig.k mo135347x7f025288() {
        ig.k a17 = ig.k.a(this.f69990x730746e1);
        return a17 == null ? ig.k.IMAGE : a17;
    }

    @Override // ig.f
    /* renamed from: getOriginId */
    public java.lang.String mo135348xce0cc457() {
        java.lang.Object obj = this.f69991xf41e559e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f69991xf41e559e = r17;
        }
        return r17;
    }

    @Override // ig.f
    /* renamed from: getOriginIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135349x279e2a54() {
        java.lang.Object obj = this.f69991xf41e559e;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f69991xf41e559e = h17;
        return h17;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m135440x7ea0ace() {
        return f69976x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // ig.f
    /* renamed from: getVideoClassAudioLabels */
    public int mo135350x4a83e7c2(int i17) {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69992x9c2a99e7).h(i17);
    }

    @Override // ig.f
    /* renamed from: getVideoClassAudioLabelsCount */
    public int mo135351x4dc5026d() {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69992x9c2a99e7).f126862f;
    }

    @Override // ig.f
    /* renamed from: getVideoClassAudioLabelsList */
    public java.util.List<java.lang.Integer> mo135352x130a5b80() {
        return this.f69992x9c2a99e7;
    }

    @Override // ig.f
    /* renamed from: getVideoClassVisualExceeds */
    public int mo135353x5710b4ec(int i17) {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69993x5af9577d).h(i17);
    }

    @Override // ig.f
    /* renamed from: getVideoClassVisualExceedsCount */
    public int mo135354x51dbdf83() {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69993x5af9577d).f126862f;
    }

    @Override // ig.f
    /* renamed from: getVideoClassVisualExceedsList */
    public java.util.List<java.lang.Integer> mo135355x44b883aa() {
        return this.f69993x5af9577d;
    }

    @Override // ig.f
    /* renamed from: getVideoClassVisualLabels */
    public int mo135356xbae7b4b2(int i17) {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69994xd20e7a23).h(i17);
    }

    @Override // ig.f
    /* renamed from: getVideoClassVisualLabelsCount */
    public int mo135357x596bcb7d() {
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f69994xd20e7a23).f126862f;
    }

    @Override // ig.f
    /* renamed from: getVideoClassVisualLabelsList */
    public java.util.List<java.lang.Integer> mo135358xe1de3070() {
        return this.f69994xd20e7a23;
    }

    @Override // ig.f
    /* renamed from: hasAiTags */
    public boolean mo135359xd066039b() {
        return (this.f69985x961a12dc & 8) != 0;
    }

    @Override // ig.f
    /* renamed from: hasAspectRatio */
    public boolean mo135360x3b0f9399() {
        return (this.f69985x961a12dc & 4) != 0;
    }

    @Override // ig.f
    /* renamed from: hasAssetFilePath */
    public boolean mo135361x74d23657() {
        return (this.f69985x961a12dc & 128) != 0;
    }

    @Override // ig.f
    /* renamed from: hasAssetIdentifier */
    public boolean mo135362xc36ce5bf() {
        return (this.f69985x961a12dc & 64) != 0;
    }

    @Override // ig.f
    /* renamed from: hasDurationMs */
    public boolean mo135363x727fb894() {
        return (this.f69985x961a12dc & 2) != 0;
    }

    @Override // ig.f
    /* renamed from: hasIsOverThreshold */
    public boolean mo135364x9eeeaaf3() {
        return (this.f69985x961a12dc & 32) != 0;
    }

    @Override // ig.f
    /* renamed from: hasMediaType */
    public boolean mo135365x3ed7bbc4() {
        return (this.f69985x961a12dc & 1) != 0;
    }

    @Override // ig.f
    /* renamed from: hasOriginId */
    public boolean mo135366xfd87439b() {
        return (this.f69985x961a12dc & 16) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372822d;
        j6Var.c(ig.e.class, ig.d.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new ig.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
    }

    /* renamed from: newBuilder */
    public static ig.d m135426x3136c9db(ig.e eVar) {
        return (ig.d) f69969xb3e828f3.mo20599xaaa148a0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) eVar);
    }

    /* renamed from: parseFrom */
    public static ig.e m135436x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.e) f69976x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private e() {
        this.f69990x730746e1 = 1;
        this.f69982xe20f102c = "";
        this.f69981xc336ac1e = "";
        this.f69991xf41e559e = "";
        this.f69992x9c2a99e7 = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f69988x2eff44a3 = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f69987x9c21dcfd = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f69994xd20e7a23 = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f69993x5af9577d = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f69984x979e6fc6 = "";
        this.f69983xc655cbae = "";
    }

    /* renamed from: parseDelimitedFrom */
    public static ig.e m135428x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.e) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f69976x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.e m135431x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (ig.e) f69976x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.e mo20559x786693c3() {
        return f69969xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public ig.d mo20599xaaa148a0() {
        return this == f69969xb3e828f3 ? new ig.d() : (ig.d) new ig.d().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) this);
    }

    /* renamed from: parseFrom */
    public static ig.e m135432x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.e) f69976x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public ig.d mo20596xab31548() {
        return m135425x3136c9db();
    }

    /* renamed from: parseFrom */
    public static ig.e m135437x92b714fd(byte[] bArr) {
        return (ig.e) f69976x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public ig.d mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new ig.d(r5Var);
    }

    /* renamed from: parseFrom */
    public static ig.e m135438x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.e) f69976x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.e m135433x92b714fd(java.io.InputStream inputStream) {
        return (ig.e) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f69976x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static ig.e m135434x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.e) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f69976x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static ig.e m135429x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (ig.e) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f69976x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static ig.e m135430x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (ig.e) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f69976x8c3e301f, d0Var, t4Var);
    }
}
