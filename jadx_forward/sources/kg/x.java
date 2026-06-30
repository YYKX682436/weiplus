package kg;

/* loaded from: classes16.dex */
public final class x extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: BGM_CLIP_FIELD_NUMBER */
    public static final int f72650x46091b06 = 3;

    /* renamed from: COORDINATING_DESC_FIELD_NUMBER */
    public static final int f72651xdd65e3b2 = 1;

    /* renamed from: LYRIC_OVERLAY_DESC_FIELD_NUMBER */
    public static final int f72653xbc0472ed = 4;

    /* renamed from: MAIN_CLIPS_FIELD_NUMBER */
    public static final int f72654xae66c650 = 2;

    /* renamed from: STICKER_OVERLAY_DESCS_FIELD_NUMBER */
    public static final int f72656x5668c85c = 5;

    /* renamed from: TEXT_OVERLAY_DESCS_FIELD_NUMBER */
    public static final int f72657xb689964c = 6;

    /* renamed from: serialVersionUID */
    private static final long f72658x3a3ed56c = 0;

    /* renamed from: bgmClip_ */
    private kg.j f72659xcab81727;

    /* renamed from: coordinatingDesc_ */
    private kg.h0 f72660xa0f728b9;

    /* renamed from: lyricOverlayDesc_ */
    private kg.b1 f72661xa347337d;

    /* renamed from: mainClips_ */
    private java.util.List<kg.p> f72662xfff420b5;

    /* renamed from: memoizedIsInitialized */
    private byte f72663xf54bb1a0;

    /* renamed from: stickerOverlayDescs_ */
    private java.util.List<kg.k1> f72664x71cc32d0;

    /* renamed from: textOverlayDescs_ */
    private java.util.List<kg.o1> f72665x13efdce0;

    /* renamed from: DEFAULT_INSTANCE */
    private static final kg.x f72652xb3e828f3 = new kg.x();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f72655x8c3e301f = new kg.v();

    public /* synthetic */ x(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, kg.b bVar) {
        this(d0Var, t4Var);
    }

    /* renamed from: access$26400 */
    public static /* synthetic */ boolean m143280x24037d30() {
        return com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
    }

    /* renamed from: access$26602 */
    public static /* synthetic */ kg.h0 m143281x240384b4(kg.x xVar, kg.h0 h0Var) {
        xVar.f72660xa0f728b9 = h0Var;
        return h0Var;
    }

    /* renamed from: access$26700 */
    public static /* synthetic */ java.util.List m143282x24038873(kg.x xVar) {
        return xVar.f72662xfff420b5;
    }

    /* renamed from: access$26702 */
    public static /* synthetic */ java.util.List m143283x24038875(kg.x xVar, java.util.List list) {
        xVar.f72662xfff420b5 = list;
        return list;
    }

    /* renamed from: access$26802 */
    public static /* synthetic */ kg.j m143284x24038c36(kg.x xVar, kg.j jVar) {
        xVar.f72659xcab81727 = jVar;
        return jVar;
    }

    /* renamed from: access$26902 */
    public static /* synthetic */ kg.b1 m143285x24038ff7(kg.x xVar, kg.b1 b1Var) {
        xVar.f72661xa347337d = b1Var;
        return b1Var;
    }

    /* renamed from: access$27000 */
    public static /* synthetic */ java.util.List m143286x2403e28b(kg.x xVar) {
        return xVar.f72664x71cc32d0;
    }

    /* renamed from: access$27002 */
    public static /* synthetic */ java.util.List m143287x2403e28d(kg.x xVar, java.util.List list) {
        xVar.f72664x71cc32d0 = list;
        return list;
    }

    /* renamed from: access$27100 */
    public static /* synthetic */ java.util.List m143288x2403e64c(kg.x xVar) {
        return xVar.f72665x13efdce0;
    }

    /* renamed from: access$27102 */
    public static /* synthetic */ java.util.List m143289x2403e64e(kg.x xVar, java.util.List list) {
        xVar.f72665x13efdce0 = list;
        return list;
    }

    /* renamed from: access$27200 */
    public static /* synthetic */ boolean m143290x2403ea0d() {
        return com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
    }

    /* renamed from: access$27300 */
    public static /* synthetic */ boolean m143291x2403edce() {
        return com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
    }

    /* renamed from: access$27400 */
    public static /* synthetic */ boolean m143292x2403f18f() {
        return com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
    }

    /* renamed from: access$27500 */
    public static /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.wa m143293x2403f550(kg.x xVar) {
        return xVar.f7874x4f0c37a3;
    }

    /* renamed from: access$27600 */
    public static /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e9 m143294x2403f911() {
        return f72655x8c3e301f;
    }

    /* renamed from: getDefaultInstance */
    public static kg.x m143295x7c90cfc0() {
        return f72652xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m143296xc1a58b65() {
        return kg.q2.O;
    }

    /* renamed from: newBuilder */
    public static kg.w m143297x3136c9db() {
        return f72652xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.x m143299x4a829d50(java.io.InputStream inputStream) {
        return (kg.x) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f72655x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.x m143307x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (kg.x) f72655x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m143311xc4ab3c1f() {
        return f72655x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.x)) {
            return super.mo20583xb2c87fbf(obj);
        }
        kg.x xVar = (kg.x) obj;
        if (m143335x2846c720() != xVar.m143335x2846c720()) {
            return false;
        }
        if ((m143335x2846c720() && !m143314xbd8dcbdc().mo20583xb2c87fbf(xVar.m143314xbd8dcbdc())) || !m143320x57c2d8f2().equals(xVar.m143320x57c2d8f2()) || m143334x6f29b43e() != xVar.m143334x6f29b43e()) {
            return false;
        }
        if ((!m143334x6f29b43e() || m143312x33d32c02().mo20583xb2c87fbf(xVar.m143312x33d32c02())) && m143336x622853dc() == xVar.m143336x622853dc()) {
            return (!m143336x622853dc() || m143316xf76f5898().mo20583xb2c87fbf(xVar.m143316xf76f5898())) && m143326x91c67877().equals(xVar.m143326x91c67877()) && m143331xc3dd2913().equals(xVar.m143331xc3dd2913()) && this.f7874x4f0c37a3.m20941xb2c87fbf(xVar.f7874x4f0c37a3);
        }
        return false;
    }

    /* renamed from: getBgmClip */
    public kg.j m143312x33d32c02() {
        kg.j jVar = this.f72659xcab81727;
        return jVar == null ? kg.j.m142827x7c90cfc0() : jVar;
    }

    /* renamed from: getBgmClipOrBuilder */
    public kg.k m143313x65f1fa56() {
        return m143312x33d32c02();
    }

    /* renamed from: getCoordinatingDesc */
    public kg.h0 m143314xbd8dcbdc() {
        kg.h0 h0Var = this.f72660xa0f728b9;
        return h0Var == null ? kg.h0.m142792x7c90cfc0() : h0Var;
    }

    /* renamed from: getCoordinatingDescOrBuilder */
    public kg.i0 m143315xd1448fbc() {
        return m143314xbd8dcbdc();
    }

    /* renamed from: getLyricOverlayDesc */
    public kg.b1 m143316xf76f5898() {
        kg.b1 b1Var = this.f72661xa347337d;
        return b1Var == null ? kg.b1.m142615x7c90cfc0() : b1Var;
    }

    /* renamed from: getLyricOverlayDescOrBuilder */
    public kg.c1 m143317xb44f9680() {
        return m143316xf76f5898();
    }

    /* renamed from: getMainClips */
    public kg.p m143318xeee8ee34(int i17) {
        return this.f72662xfff420b5.get(i17);
    }

    /* renamed from: getMainClipsCount */
    public int m143319xa01c333b() {
        return this.f72662xfff420b5.size();
    }

    /* renamed from: getMainClipsList */
    public java.util.List<kg.p> m143320x57c2d8f2() {
        return this.f72662xfff420b5;
    }

    /* renamed from: getMainClipsOrBuilder */
    public kg.q m143321xb08e9064(int i17) {
        return this.f72662xfff420b5.get(i17);
    }

    /* renamed from: getMainClipsOrBuilderList */
    public java.util.List<? extends kg.q> m143322xac6be322() {
        return this.f72662xfff420b5;
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m143323x7ea0ace() {
        return f72655x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f72660xa0f728b9 != null ? com.p176xb6135e39.p283xc50a8b8b.k0.n(1, m143314xbd8dcbdc()) + 0 : 0;
        for (int i18 = 0; i18 < this.f72662xfff420b5.size(); i18++) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, this.f72662xfff420b5.get(i18));
        }
        if (this.f72659xcab81727 != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, m143312x33d32c02());
        }
        if (this.f72661xa347337d != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, m143316xf76f5898());
        }
        for (int i19 = 0; i19 < this.f72664x71cc32d0.size(); i19++) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(5, this.f72664x71cc32d0.get(i19));
        }
        for (int i27 = 0; i27 < this.f72665x13efdce0.size(); i27++) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(6, this.f72665x13efdce0.get(i27));
        }
        int mo20593x9d9c349b = n17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getStickerOverlayDescs */
    public kg.k1 m143324x19cb1839(int i17) {
        return this.f72664x71cc32d0.get(i17);
    }

    /* renamed from: getStickerOverlayDescsCount */
    public int m143325xa68c8456() {
        return this.f72664x71cc32d0.size();
    }

    /* renamed from: getStickerOverlayDescsList */
    public java.util.List<kg.k1> m143326x91c67877() {
        return this.f72664x71cc32d0;
    }

    /* renamed from: getStickerOverlayDescsOrBuilder */
    public kg.l1 m143327x75eadbff(int i17) {
        return this.f72664x71cc32d0.get(i17);
    }

    /* renamed from: getStickerOverlayDescsOrBuilderList */
    public java.util.List<? extends kg.l1> m143328x8d32e93d() {
        return this.f72664x71cc32d0;
    }

    /* renamed from: getTextOverlayDescs */
    public kg.o1 m143329x5e2a76d5(int i17) {
        return this.f72665x13efdce0.get(i17);
    }

    /* renamed from: getTextOverlayDescsCount */
    public int m143330xb74be73a() {
        return this.f72665x13efdce0.size();
    }

    /* renamed from: getTextOverlayDescsList */
    public java.util.List<kg.o1> m143331xc3dd2913() {
        return this.f72665x13efdce0;
    }

    /* renamed from: getTextOverlayDescsOrBuilder */
    public kg.p1 m143332x80b62ce3(int i17) {
        return this.f72665x13efdce0.get(i17);
    }

    /* renamed from: getTextOverlayDescsOrBuilderList */
    public java.util.List<? extends kg.p1> m143333xae632821() {
        return this.f72665x13efdce0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    /* renamed from: hasBgmClip */
    public boolean m143334x6f29b43e() {
        return this.f72659xcab81727 != null;
    }

    /* renamed from: hasCoordinatingDesc */
    public boolean m143335x2846c720() {
        return this.f72660xa0f728b9 != null;
    }

    /* renamed from: hasLyricOverlayDesc */
    public boolean m143336x622853dc() {
        return this.f72661xa347337d != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m143296xc1a58b65().hashCode();
        if (m143335x2846c720()) {
            hashCode = (((hashCode * 37) + 1) * 53) + m143314xbd8dcbdc().mo20587x8cdac1b();
        }
        if (m143319xa01c333b() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + m143320x57c2d8f2().hashCode();
        }
        if (m143334x6f29b43e()) {
            hashCode = (((hashCode * 37) + 3) * 53) + m143312x33d32c02().mo20587x8cdac1b();
        }
        if (m143336x622853dc()) {
            hashCode = (((hashCode * 37) + 4) * 53) + m143316xf76f5898().mo20587x8cdac1b();
        }
        if (m143325xa68c8456() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + m143326x91c67877().hashCode();
        }
        if (m143330xb74be73a() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + m143331xc3dd2913().hashCode();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.P;
        j6Var.c(kg.x.class, kg.w.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f72663xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f72663xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new kg.x();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f72660xa0f728b9 != null) {
            k0Var.J(1, m143314xbd8dcbdc());
        }
        for (int i17 = 0; i17 < this.f72662xfff420b5.size(); i17++) {
            k0Var.J(2, this.f72662xfff420b5.get(i17));
        }
        if (this.f72659xcab81727 != null) {
            k0Var.J(3, m143312x33d32c02());
        }
        if (this.f72661xa347337d != null) {
            k0Var.J(4, m143316xf76f5898());
        }
        for (int i18 = 0; i18 < this.f72664x71cc32d0.size(); i18++) {
            k0Var.J(5, this.f72664x71cc32d0.get(i18));
        }
        for (int i19 = 0; i19 < this.f72665x13efdce0.size(); i19++) {
            k0Var.J(6, this.f72665x13efdce0.get(i19));
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    public /* synthetic */ x(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, kg.b bVar) {
        this(q5Var);
    }

    /* renamed from: newBuilder */
    public static kg.w m143298x3136c9db(kg.x xVar) {
        kg.w mo20599xaaa148a0 = f72652xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.h(xVar);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static kg.x m143308x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.x) f72655x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public x(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f72663xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static kg.x m143300x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.x) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f72655x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.x m143303x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (kg.x) f72655x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public kg.x mo20559x786693c3() {
        return f72652xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public kg.w mo20599xaaa148a0() {
        if (this == f72652xb3e828f3) {
            return new kg.w(null);
        }
        kg.w wVar = new kg.w(null);
        wVar.h(this);
        return wVar;
    }

    /* renamed from: parseFrom */
    public static kg.x m143304x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.x) f72655x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public kg.w mo20596xab31548() {
        return m143297x3136c9db();
    }

    private x() {
        this.f72663xf54bb1a0 = (byte) -1;
        this.f72662xfff420b5 = java.util.Collections.emptyList();
        this.f72664x71cc32d0 = java.util.Collections.emptyList();
        this.f72665x13efdce0 = java.util.Collections.emptyList();
    }

    /* renamed from: parseFrom */
    public static kg.x m143309x92b714fd(byte[] bArr) {
        return (kg.x) f72655x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public kg.w mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new kg.w(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static kg.x m143310x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.x) f72655x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static kg.x m143305x92b714fd(java.io.InputStream inputStream) {
        return (kg.x) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f72655x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static kg.x m143306x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.x) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f72655x8c3e301f, inputStream, t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public x(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        char c17 = 0;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 10) {
                                kg.h0 h0Var = this.f72660xa0f728b9;
                                kg.g0 mo20599xaaa148a0 = h0Var != null ? h0Var.mo20599xaaa148a0() : null;
                                kg.h0 h0Var2 = (kg.h0) d0Var.v(kg.h0.m142808xc4ab3c1f(), t4Var);
                                this.f72660xa0f728b9 = h0Var2;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.e(h0Var2);
                                    this.f72660xa0f728b9 = mo20599xaaa148a0.mo20557x85702333();
                                }
                            } else if (F == 18) {
                                int i17 = (c17 == true ? 1 : 0) & 1;
                                c17 = c17;
                                if (i17 == 0) {
                                    this.f72662xfff420b5 = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 1;
                                }
                                this.f72662xfff420b5.add((kg.p) d0Var.v(kg.p.m143078xc4ab3c1f(), t4Var));
                            } else if (F == 26) {
                                kg.j jVar = this.f72659xcab81727;
                                kg.i mo20599xaaa148a02 = jVar != null ? jVar.mo20599xaaa148a0() : null;
                                kg.j jVar2 = (kg.j) d0Var.v(kg.j.m142843xc4ab3c1f(), t4Var);
                                this.f72659xcab81727 = jVar2;
                                if (mo20599xaaa148a02 != null) {
                                    mo20599xaaa148a02.e(jVar2);
                                    this.f72659xcab81727 = mo20599xaaa148a02.mo20557x85702333();
                                }
                            } else if (F == 34) {
                                kg.b1 b1Var = this.f72661xa347337d;
                                kg.a1 mo20599xaaa148a03 = b1Var != null ? b1Var.mo20599xaaa148a0() : null;
                                kg.b1 b1Var2 = (kg.b1) d0Var.v(kg.b1.m142631xc4ab3c1f(), t4Var);
                                this.f72661xa347337d = b1Var2;
                                if (mo20599xaaa148a03 != null) {
                                    mo20599xaaa148a03.f(b1Var2);
                                    this.f72661xa347337d = mo20599xaaa148a03.mo20557x85702333();
                                }
                            } else if (F == 42) {
                                int i18 = (c17 == true ? 1 : 0) & 2;
                                c17 = c17;
                                if (i18 == 0) {
                                    this.f72664x71cc32d0 = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 2;
                                }
                                this.f72664x71cc32d0.add((kg.k1) d0Var.v(kg.k1.m142885xc4ab3c1f(), t4Var));
                            } else if (F != 50) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                int i19 = (c17 == true ? 1 : 0) & 4;
                                c17 = c17;
                                if (i19 == 0) {
                                    this.f72665x13efdce0 = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 4;
                                }
                                this.f72665x13efdce0.add((kg.o1) d0Var.v(kg.o1.m143003xc4ab3c1f(), t4Var));
                            }
                        }
                        z17 = true;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        e17.f127272d = this;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = this;
                    throw y6Var;
                }
            } finally {
                if (((c17 == true ? 1 : 0) & 1) != 0) {
                    this.f72662xfff420b5 = java.util.Collections.unmodifiableList(this.f72662xfff420b5);
                }
                if (((c17 == true ? 1 : 0) & 2) != 0) {
                    this.f72664x71cc32d0 = java.util.Collections.unmodifiableList(this.f72664x71cc32d0);
                }
                if (((c17 == true ? 1 : 0) & 4) != 0) {
                    this.f72665x13efdce0 = java.util.Collections.unmodifiableList(this.f72665x13efdce0);
                }
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }

    /* renamed from: parseFrom */
    public static kg.x m143301x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (kg.x) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f72655x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static kg.x m143302x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (kg.x) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f72655x8c3e301f, d0Var, t4Var);
    }
}
