package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.TaskControlOptions */
/* loaded from: classes8.dex */
public class C4527x3f679786 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 f19039xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786();

    /* renamed from: bind_cellular */
    private boolean f19040xabbd5b2c;

    /* renamed from: disable_safecdn */
    private boolean f19041x55afdb29;

    /* renamed from: hasSetFields */
    private final boolean[] f19042xcb94b041 = new boolean[8];

    /* renamed from: max_cellular_transfer_mb */
    private int f19043xb9130f;

    /* renamed from: max_cellular_transfer_multiplier */
    private int f19044x81e8693b;

    /* renamed from: parallel_count */
    private int f19045x990700d7;

    /* renamed from: retry_count */
    private int f19046xc8af38b8;

    /* renamed from: timeout_seconds */
    private int f19047x57fd4da1;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39554xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39555x7c90cfc0() {
        return f19039xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39556x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39557x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 c4527x3f679786 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f19047x57fd4da1), java.lang.Integer.valueOf(c4527x3f679786.f19047x57fd4da1)) && n51.f.a(java.lang.Integer.valueOf(this.f19046xc8af38b8), java.lang.Integer.valueOf(c4527x3f679786.f19046xc8af38b8)) && n51.f.a(java.lang.Integer.valueOf(this.f19045x990700d7), java.lang.Integer.valueOf(c4527x3f679786.f19045x990700d7)) && n51.f.a(java.lang.Boolean.valueOf(this.f19040xabbd5b2c), java.lang.Boolean.valueOf(c4527x3f679786.f19040xabbd5b2c)) && n51.f.a(java.lang.Boolean.valueOf(this.f19041x55afdb29), java.lang.Boolean.valueOf(c4527x3f679786.f19041x55afdb29)) && n51.f.a(java.lang.Integer.valueOf(this.f19044x81e8693b), java.lang.Integer.valueOf(c4527x3f679786.f19044x81e8693b)) && n51.f.a(java.lang.Integer.valueOf(this.f19043xb9130f), java.lang.Integer.valueOf(c4527x3f679786.f19043xb9130f));
    }

    /* renamed from: getBindCellular */
    public boolean m39558x1443673d() {
        return this.f19040xabbd5b2c;
    }

    /* renamed from: getDisableSafecdn */
    public boolean m39559xbb38266e() {
        return this.f19041x55afdb29;
    }

    /* renamed from: getMaxCellularTransferMb */
    public int m39560xdf10eb8() {
        return this.f19043xb9130f;
    }

    /* renamed from: getMaxCellularTransferMultiplier */
    public int m39561x6222abe4() {
        return this.f19044x81e8693b;
    }

    /* renamed from: getParallelCount */
    public int m39562xd9909b92() {
        return this.f19045x990700d7;
    }

    /* renamed from: getRetryCount */
    public int m39563xa8e25f3d() {
        return this.f19046xc8af38b8;
    }

    /* renamed from: getTimeoutSeconds */
    public int m39564xb97fc2d4() {
        return this.f19047x57fd4da1;
    }

    /* renamed from: hasBindCellular */
    public boolean m39565xf824a481() {
        return m39567x6e095e9(4);
    }

    /* renamed from: hasDisableSafecdn */
    public boolean m39566x2bbf22b2() {
        return m39567x6e095e9(5);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39567x6e095e9(int i17) {
        return this.f19042xcb94b041[i17];
    }

    /* renamed from: hasMaxCellularTransferMb */
    public boolean m39568x5aa67df4() {
        return m39567x6e095e9(7);
    }

    /* renamed from: hasMaxCellularTransferMultiplier */
    public boolean m39569x96031f20() {
        return m39567x6e095e9(6);
    }

    /* renamed from: hasParallelCount */
    public boolean m39570x71d706ce() {
        return m39567x6e095e9(3);
    }

    /* renamed from: hasRetryCount */
    public boolean m39571xe3ba1d81() {
        return m39567x6e095e9(2);
    }

    /* renamed from: hasTimeoutSeconds */
    public boolean m39572x2a06bf18() {
        return m39567x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39573x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f19042xcb94b041[1]) {
                fVar.e(1, this.f19047x57fd4da1);
            }
            if (this.f19042xcb94b041[2]) {
                fVar.e(2, this.f19046xc8af38b8);
            }
            if (this.f19042xcb94b041[3]) {
                fVar.e(3, this.f19045x990700d7);
            }
            if (this.f19042xcb94b041[4]) {
                fVar.a(4, this.f19040xabbd5b2c);
            }
            if (this.f19042xcb94b041[5]) {
                fVar.a(5, this.f19041x55afdb29);
            }
            if (this.f19042xcb94b041[6]) {
                fVar.e(6, this.f19044x81e8693b);
            }
            if (this.f19042xcb94b041[7]) {
                fVar.e(7, this.f19043xb9130f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f19042xcb94b041[1] ? 0 + b36.f.e(1, this.f19047x57fd4da1) : 0;
            if (this.f19042xcb94b041[2]) {
                e17 += b36.f.e(2, this.f19046xc8af38b8);
            }
            if (this.f19042xcb94b041[3]) {
                e17 += b36.f.e(3, this.f19045x990700d7);
            }
            if (this.f19042xcb94b041[4]) {
                e17 += b36.f.a(4, this.f19040xabbd5b2c);
            }
            if (this.f19042xcb94b041[5]) {
                e17 += b36.f.a(5, this.f19041x55afdb29);
            }
            if (this.f19042xcb94b041[6]) {
                e17 += b36.f.e(6, this.f19044x81e8693b);
            }
            return this.f19042xcb94b041[7] ? e17 + b36.f.e(7, this.f19043xb9130f) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f19047x57fd4da1 = aVar2.g(intValue);
                this.f19042xcb94b041[1] = true;
                return 0;
            case 2:
                this.f19046xc8af38b8 = aVar2.g(intValue);
                this.f19042xcb94b041[2] = true;
                return 0;
            case 3:
                this.f19045x990700d7 = aVar2.g(intValue);
                this.f19042xcb94b041[3] = true;
                return 0;
            case 4:
                this.f19040xabbd5b2c = aVar2.c(intValue);
                this.f19042xcb94b041[4] = true;
                return 0;
            case 5:
                this.f19041x55afdb29 = aVar2.c(intValue);
                this.f19042xcb94b041[5] = true;
                return 0;
            case 6:
                this.f19044x81e8693b = aVar2.g(intValue);
                this.f19042xcb94b041[6] = true;
                return 0;
            case 7:
                this.f19043xb9130f = aVar2.g(intValue);
                this.f19042xcb94b041[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBindCellular */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39575x4a8c6249(boolean z17) {
        this.f19040xabbd5b2c = z17;
        this.f19042xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setDisableSafecdn */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39576x832e8e7a(boolean z17) {
        this.f19041x55afdb29 = z17;
        this.f19042xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setMaxCellularTransferMb */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39577xde03c12c(int i17) {
        this.f19043xb9130f = i17;
        this.f19042xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setMaxCellularTransferMultiplier */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39578xc465aa58(int i17) {
        this.f19044x81e8693b = i17;
        this.f19042xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setParallelCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39579x6c670206(int i17) {
        this.f19045x990700d7 = i17;
        this.f19042xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setRetryCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39580xd706ad49(int i17) {
        this.f19046xc8af38b8 = i17;
        this.f19042xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setTimeoutSeconds */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39581x81762ae0(int i17) {
        this.f19047x57fd4da1 = i17;
        this.f19042xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m39574x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786) super.mo11468x92b714fd(bArr);
    }
}
