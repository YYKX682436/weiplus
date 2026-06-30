package ig;

/* loaded from: classes16.dex */
public final class z extends com.p176xb6135e39.p283xc50a8b8b.q5 implements ig.b0 {

    /* renamed from: attachmentsJson_ */
    private java.lang.Object f70345x4450c2a7;

    /* renamed from: bitField0_ */
    private int f70346x961a12dc;

    /* renamed from: creationId_ */
    private java.lang.Object f70347xea464f45;

    /* renamed from: projectClassification_ */
    private java.lang.Object f70348x8abe00e0;

    /* renamed from: requestId_ */
    private long f70349x235ed95;

    /* renamed from: sceneTag_ */
    private java.lang.Object f70350x67139ab1;

    private z() {
        super(null);
        this.f70347xea464f45 = "";
        this.f70350x67139ab1 = "";
        this.f70348x8abe00e0 = "";
        this.f70345x4450c2a7 = "";
        m136551x73fef578();
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m136550xc1a58b65() {
        return ig.y0.f372827i;
    }

    /* renamed from: maybeForceBuilderInitialization */
    private void m136551x73fef578() {
        ig.a0.m135242xbf1b89f9();
    }

    /* renamed from: clearAttachmentsJson */
    public ig.z m136555x85d3d2ab() {
        this.f70346x961a12dc &= -17;
        this.f70345x4450c2a7 = ig.a0.m135249x7c90cfc0().mo135266xbd4ba682();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearCreationId */
    public ig.z m136556x23f71287() {
        this.f70346x961a12dc &= -3;
        this.f70347xea464f45 = ig.a0.m135249x7c90cfc0().mo135268x4021f450();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearProjectClassification */
    public ig.z m136560x3471e712() {
        this.f70346x961a12dc &= -9;
        this.f70348x8abe00e0 = ig.a0.m135249x7c90cfc0().mo135271xe6db3da9();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearRequestId */
    public ig.z m136561xd54cc43d() {
        this.f70346x961a12dc &= -2;
        this.f70349x235ed95 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearSceneTag */
    public ig.z m136562xa5c650db() {
        this.f70346x961a12dc &= -5;
        this.f70350x67139ab1 = ig.a0.m135249x7c90cfc0().mo135274x4da110e4();
        m20881x7bb163d5();
        return this;
    }

    @Override // ig.b0
    /* renamed from: getAttachmentsJson */
    public java.lang.String mo135266xbd4ba682() {
        java.lang.Object obj = this.f70345x4450c2a7;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70345x4450c2a7 = r17;
        }
        return r17;
    }

    @Override // ig.b0
    /* renamed from: getAttachmentsJsonBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135267xffbceb09() {
        java.lang.Object obj = this.f70345x4450c2a7;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70345x4450c2a7 = h17;
        return h17;
    }

    @Override // ig.b0
    /* renamed from: getCreationId */
    public java.lang.String mo135268x4021f450() {
        java.lang.Object obj = this.f70347xea464f45;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70347xea464f45 = r17;
        }
        return r17;
    }

    @Override // ig.b0
    /* renamed from: getCreationIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135269x97550dfb() {
        java.lang.Object obj = this.f70347xea464f45;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70347xea464f45 = h17;
        return h17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return ig.y0.f372827i;
    }

    @Override // ig.b0
    /* renamed from: getProjectClassification */
    public java.lang.String mo135271xe6db3da9() {
        java.lang.Object obj = this.f70348x8abe00e0;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70348x8abe00e0 = r17;
        }
        return r17;
    }

    @Override // ig.b0
    /* renamed from: getProjectClassificationBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135272x65e0b442() {
        java.lang.Object obj = this.f70348x8abe00e0;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70348x8abe00e0 = h17;
        return h17;
    }

    @Override // ig.b0
    /* renamed from: getRequestId */
    public long mo135273x28ca0554() {
        return this.f70349x235ed95;
    }

    @Override // ig.b0
    /* renamed from: getSceneTag */
    public java.lang.String mo135274x4da110e4() {
        java.lang.Object obj = this.f70350x67139ab1;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70350x67139ab1 = r17;
        }
        return r17;
    }

    @Override // ig.b0
    /* renamed from: getSceneTagBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135275xe574ade7() {
        java.lang.Object obj = this.f70350x67139ab1;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70350x67139ab1 = h17;
        return h17;
    }

    @Override // ig.b0
    /* renamed from: hasAttachmentsJson */
    public boolean mo135276x5da432be() {
        return (this.f70346x961a12dc & 16) != 0;
    }

    @Override // ig.b0
    /* renamed from: hasCreationId */
    public boolean mo135277x7af9b294() {
        return (this.f70346x961a12dc & 2) != 0;
    }

    @Override // ig.b0
    /* renamed from: hasProjectClassification */
    public boolean mo135278x3390ace5() {
        return (this.f70346x961a12dc & 8) != 0;
    }

    @Override // ig.b0
    /* renamed from: hasRequestId */
    public boolean mo135279xe89f6e90() {
        return (this.f70346x961a12dc & 1) != 0;
    }

    @Override // ig.b0
    /* renamed from: hasSceneTag */
    public boolean mo135280x7d1b9028() {
        return (this.f70346x961a12dc & 4) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372828j;
        j6Var.c(ig.a0.class, ig.z.class);
        return j6Var;
    }

    /* renamed from: setAttachmentsJson */
    public ig.z m136569xf4223ff6(java.lang.String str) {
        str.getClass();
        this.f70346x961a12dc |= 16;
        this.f70345x4450c2a7 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setAttachmentsJsonBytes */
    public ig.z m136570x7a101a15(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70346x961a12dc |= 16;
        this.f70345x4450c2a7 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setCreationId */
    public ig.z m136571x6e46425c(java.lang.String str) {
        str.getClass();
        this.f70346x961a12dc |= 2;
        this.f70347xea464f45 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setCreationIdBytes */
    public ig.z m136572xce2ba76f(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70346x961a12dc |= 2;
        this.f70347xea464f45 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setProjectClassification */
    public ig.z m136573xb6edf01d(java.lang.String str) {
        str.getClass();
        this.f70346x961a12dc |= 8;
        this.f70348x8abe00e0 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setProjectClassificationBytes */
    public ig.z m136574x559f6a4e(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70346x961a12dc |= 8;
        this.f70348x8abe00e0 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setRequestId */
    public ig.z m136576x851dc5c8(long j17) {
        this.f70346x961a12dc |= 1;
        this.f70349x235ed95 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setSceneTag */
    public ig.z m136577x485971f0(java.lang.String str) {
        str.getClass();
        this.f70346x961a12dc |= 4;
        this.f70350x67139ab1 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setSceneTagBytes */
    public ig.z m136578x784b145b(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70346x961a12dc |= 4;
        this.f70350x67139ab1 = yVar;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public ig.z mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public ig.a0 mo20556x59bc66e() {
        ig.a0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public ig.a0 mo20557x85702333() {
        int i17;
        ig.a0 a0Var = new ig.a0(this);
        int i18 = this.f70346x961a12dc;
        if ((i18 & 1) != 0) {
            ig.a0.m135243xbf1b917d(a0Var, this.f70349x235ed95);
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            i17 |= 2;
        }
        ig.a0.m135244xbf1b953e(a0Var, this.f70347xea464f45);
        if ((i18 & 4) != 0) {
            i17 |= 4;
        }
        ig.a0.m135245xbf1b98ff(a0Var, this.f70350x67139ab1);
        if ((i18 & 8) != 0) {
            i17 |= 8;
        }
        ig.a0.m135246xbf1b9cc0(a0Var, this.f70348x8abe00e0);
        if ((i18 & 16) != 0) {
            i17 |= 16;
        }
        ig.a0.m135247xbf1ba081(a0Var, this.f70345x4450c2a7);
        ig.a0.m135248xbf1ba442(a0Var, i17);
        m20880xaf619bdf();
        return a0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearField, reason: merged with bridge method [inline-methods] */
    public ig.z m136557xd2ece2ad(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        super.m136557xd2ece2ad(b4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.a0 mo20559x786693c3() {
        return ig.a0.m135249x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public ig.z mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
    public ig.z m136575xe229305e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17, java.lang.Object obj) {
        super.m136575xe229305e(b4Var, i17, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public final ig.z mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.z m136559xd36dfc70(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        super.m136559xd36dfc70(g4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.z m136568xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (ig.z) super.m136568xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.z m136554x5a5b64d() {
        super.m136554x5a5b64d();
        this.f70349x235ed95 = 0L;
        int i17 = this.f70346x961a12dc & (-2);
        this.f70347xea464f45 = "";
        this.f70350x67139ab1 = "";
        this.f70348x8abe00e0 = "";
        this.f70345x4450c2a7 = "";
        this.f70346x961a12dc = i17 & (-3) & (-5) & (-9) & (-17);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.z m136567x5a5dd5d() {
        return (ig.z) super.m136567x5a5dd5d();
    }

    private z(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        super(r5Var);
        this.f70347xea464f45 = "";
        this.f70350x67139ab1 = "";
        this.f70348x8abe00e0 = "";
        this.f70345x4450c2a7 = "";
        m136551x73fef578();
    }
}
