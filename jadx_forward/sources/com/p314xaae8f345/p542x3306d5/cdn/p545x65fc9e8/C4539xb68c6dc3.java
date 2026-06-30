package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.VideoOptions */
/* loaded from: classes8.dex */
public class C4539xb68c6dc3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 f19176xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3();

    /* renamed from: blocksize */
    private int f19177x340e960e;

    /* renamed from: c2c_video_format */
    private int f19178x8d79e086;

    /* renamed from: hasSetFields */
    private final boolean[] f19179xcb94b041 = new boolean[8];

    /* renamed from: is_small */
    private boolean f19180x76bfdb2;

    /* renamed from: match_policy */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4538xb5f63c04 f19181x536130ec;

    /* renamed from: sns_coldrule */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f19182xb5f4ec7;

    /* renamed from: sns_video_flag */
    private java.lang.String f19183x482535d7;

    /* renamed from: wxdata */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f19184xd1daa60b;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39845xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39846x7c90cfc0() {
        return f19176xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39847x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39848x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 c4539xb68c6dc3 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3) fVar;
        return n51.f.a(this.f19183x482535d7, c4539xb68c6dc3.f19183x482535d7) && n51.f.a(java.lang.Integer.valueOf(this.f19178x8d79e086), java.lang.Integer.valueOf(c4539xb68c6dc3.f19178x8d79e086)) && n51.f.a(this.f19181x536130ec, c4539xb68c6dc3.f19181x536130ec) && n51.f.a(java.lang.Boolean.valueOf(this.f19180x76bfdb2), java.lang.Boolean.valueOf(c4539xb68c6dc3.f19180x76bfdb2)) && n51.f.a(this.f19182xb5f4ec7, c4539xb68c6dc3.f19182xb5f4ec7) && n51.f.a(this.f19184xd1daa60b, c4539xb68c6dc3.f19184xd1daa60b) && n51.f.a(java.lang.Integer.valueOf(this.f19177x340e960e), java.lang.Integer.valueOf(c4539xb68c6dc3.f19177x340e960e));
    }

    /* renamed from: getBlocksize */
    public int m39849x337c0758() {
        return this.f19177x340e960e;
    }

    /* renamed from: getC2cVideoFormat */
    public int m39850x61c51694() {
        return this.f19178x8d79e086;
    }

    /* renamed from: getIsSmall */
    public boolean m39851xb93d7dc7() {
        return this.f19180x76bfdb2;
    }

    /* renamed from: getMatchPolicy */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4538xb5f63c04 m39852x367b8a21() {
        return this.f19179xcb94b041[3] ? this.f19181x536130ec : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4538xb5f63c04.VIDEO_FORMAT_POLICY_AUTO;
    }

    /* renamed from: getSnsColdrule */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m39853x2ca3a442() {
        return this.f19179xcb94b041[5] ? this.f19182xb5f4ec7 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getSnsVideoFlag */
    public java.lang.String m39854x53e16e65() {
        return this.f19179xcb94b041[1] ? this.f19183x482535d7 : "";
    }

    /* renamed from: getWxdata */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m39855x36f1c901() {
        return this.f19179xcb94b041[6] ? this.f19184xd1daa60b : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasBlocksize */
    public boolean m39856xf3517094() {
        return m39858x6e095e9(7);
    }

    /* renamed from: hasC2cVideoFormat */
    public boolean m39857xd24c12d8() {
        return m39858x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39858x6e095e9(int i17) {
        return this.f19179xcb94b041[i17];
    }

    /* renamed from: hasIsSmall */
    public boolean m39859xf4940603() {
        return m39858x6e095e9(4);
    }

    /* renamed from: hasMatchPolicy */
    public boolean m39860x569b945d() {
        return m39858x6e095e9(3);
    }

    /* renamed from: hasSnsColdrule */
    public boolean m39861x4cc3ae7e() {
        return m39858x6e095e9(5);
    }

    /* renamed from: hasSnsVideoFlag */
    public boolean m39862x37c2aba9() {
        return m39858x6e095e9(1);
    }

    /* renamed from: hasWxdata */
    public boolean m39863xf6cb4945() {
        return m39858x6e095e9(6);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39864x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f19183x482535d7;
            if (str != null && this.f19179xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f19179xcb94b041[2]) {
                fVar.e(2, this.f19178x8d79e086);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4538xb5f63c04 enumC4538xb5f63c04 = this.f19181x536130ec;
            if (enumC4538xb5f63c04 != null && this.f19179xcb94b041[3]) {
                fVar.e(3, enumC4538xb5f63c04.f19175x6ac9171);
            }
            if (this.f19179xcb94b041[4]) {
                fVar.a(4, this.f19180x76bfdb2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f19182xb5f4ec7;
            if (gVar != null && this.f19179xcb94b041[5]) {
                fVar.b(5, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f19184xd1daa60b;
            if (gVar2 != null && this.f19179xcb94b041[6]) {
                fVar.b(6, gVar2);
            }
            if (this.f19179xcb94b041[7]) {
                fVar.e(7, this.f19177x340e960e);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f19183x482535d7;
            if (str2 != null && this.f19179xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (this.f19179xcb94b041[2]) {
                i18 += b36.f.e(2, this.f19178x8d79e086);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4538xb5f63c04 enumC4538xb5f63c042 = this.f19181x536130ec;
            if (enumC4538xb5f63c042 != null && this.f19179xcb94b041[3]) {
                i18 += b36.f.e(3, enumC4538xb5f63c042.f19175x6ac9171);
            }
            if (this.f19179xcb94b041[4]) {
                i18 += b36.f.a(4, this.f19180x76bfdb2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f19182xb5f4ec7;
            if (gVar3 != null && this.f19179xcb94b041[5]) {
                i18 += b36.f.b(5, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f19184xd1daa60b;
            if (gVar4 != null && this.f19179xcb94b041[6]) {
                i18 += b36.f.b(6, gVar4);
            }
            return this.f19179xcb94b041[7] ? i18 + b36.f.e(7, this.f19177x340e960e) : i18;
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
                this.f19183x482535d7 = aVar2.k(intValue);
                this.f19179xcb94b041[1] = true;
                return 0;
            case 2:
                this.f19178x8d79e086 = aVar2.g(intValue);
                this.f19179xcb94b041[2] = true;
                return 0;
            case 3:
                this.f19181x536130ec = com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4538xb5f63c04.m39840x382ad972(aVar2.g(intValue));
                this.f19179xcb94b041[3] = true;
                return 0;
            case 4:
                this.f19180x76bfdb2 = aVar2.c(intValue);
                this.f19179xcb94b041[4] = true;
                return 0;
            case 5:
                this.f19182xb5f4ec7 = aVar2.d(intValue);
                this.f19179xcb94b041[5] = true;
                return 0;
            case 6:
                this.f19184xd1daa60b = aVar2.d(intValue);
                this.f19179xcb94b041[6] = true;
                return 0;
            case 7:
                this.f19177x340e960e = aVar2.g(intValue);
                this.f19179xcb94b041[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBlocksize */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39866x8fcfc7cc(int i17) {
        this.f19177x340e960e = i17;
        this.f19179xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setC2cVideoFormat */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39867x29bb7ea0(int i17) {
        this.f19178x8d79e086 = i17;
        this.f19179xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setIsSmall */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39868x2caecb3b(boolean z17) {
        this.f19180x76bfdb2 = z17;
        this.f19179xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setMatchPolicy */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39869xcce0fd95(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4538xb5f63c04 enumC4538xb5f63c04) {
        this.f19181x536130ec = enumC4538xb5f63c04;
        this.f19179xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setSnsColdrule */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39870xc30917b6(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f19182xb5f4ec7 = gVar;
        this.f19179xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setSnsVideoFlag */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39871x8a2a6971(java.lang.String str) {
        this.f19183x482535d7 = str;
        this.f19179xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setWxdata */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39872x2a26fd0d(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f19184xd1daa60b = gVar;
        this.f19179xcb94b041[6] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m39865x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3) super.mo11468x92b714fd(bArr);
    }
}
