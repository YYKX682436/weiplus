package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.C2cUploadOptions */
/* loaded from: classes8.dex */
public class C4464x14fc77c9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 f18485xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9();

    /* renamed from: aeskey */
    private java.lang.String f18486xab4b3f30;

    /* renamed from: bigfile */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2 f18487xf92af27c;

    /* renamed from: enable_hitcheck */
    private boolean f18488xbadd2491;

    /* renamed from: filemd5 */
    private java.lang.String f18489xcd09ee82;

    /* renamed from: hasSetFields */
    private final boolean[] f18490xcb94b041 = new boolean[9];

    /* renamed from: only_hitcheck */
    private boolean f18491xb73a8888;

    /* renamed from: sendmsg_data */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f18492xc8cb5130;

    /* renamed from: sendmsg_via_cdn */
    private boolean f18493x6908a936;

    /* renamed from: touser */
    private java.lang.String f18494xcc4544c6;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38263xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38264x7c90cfc0() {
        return f18485xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38265x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38266x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 c4464x14fc77c9 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9) fVar;
        return n51.f.a(this.f18494xcc4544c6, c4464x14fc77c9.f18494xcc4544c6) && n51.f.a(java.lang.Boolean.valueOf(this.f18488xbadd2491), java.lang.Boolean.valueOf(c4464x14fc77c9.f18488xbadd2491)) && n51.f.a(this.f18487xf92af27c, c4464x14fc77c9.f18487xf92af27c) && n51.f.a(java.lang.Boolean.valueOf(this.f18491xb73a8888), java.lang.Boolean.valueOf(c4464x14fc77c9.f18491xb73a8888)) && n51.f.a(java.lang.Boolean.valueOf(this.f18493x6908a936), java.lang.Boolean.valueOf(c4464x14fc77c9.f18493x6908a936)) && n51.f.a(this.f18492xc8cb5130, c4464x14fc77c9.f18492xc8cb5130) && n51.f.a(this.f18489xcd09ee82, c4464x14fc77c9.f18489xcd09ee82) && n51.f.a(this.f18486xab4b3f30, c4464x14fc77c9.f18486xab4b3f30);
    }

    /* renamed from: getAeskey */
    public java.lang.String m38267x10626226() {
        return this.f18490xcb94b041[8] ? this.f18486xab4b3f30 : "";
    }

    /* renamed from: getBigfile */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2 m38268x36f82e46() {
        return this.f18490xcb94b041[3] ? this.f18487xf92af27c : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2.m38211xaf65a0fc();
    }

    /* renamed from: getEnableHitcheck */
    public boolean m38269xb495b8ee() {
        return this.f18488xbadd2491;
    }

    /* renamed from: getFilemd5 */
    public java.lang.String m38270xad72a4c() {
        return this.f18490xcb94b041[7] ? this.f18489xcd09ee82 : "";
    }

    /* renamed from: getOnlyHitcheck */
    public boolean m38271x89eb3f97() {
        return this.f18491xb73a8888;
    }

    /* renamed from: getSendmsgData */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m38272xb6f9d10d() {
        return this.f18490xcb94b041[6] ? this.f18492xc8cb5130 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getSendmsgViaCdn */
    public boolean m38273xfee8b1e2() {
        return this.f18493x6908a936;
    }

    /* renamed from: getTouser */
    public java.lang.String m38274x315c67bc() {
        return this.f18490xcb94b041[1] ? this.f18494xcc4544c6 : "";
    }

    /* renamed from: hasAeskey */
    public boolean m38275xd03be26a() {
        return m38278x6e095e9(8);
    }

    /* renamed from: hasBigfile */
    public boolean m38276x724eb682() {
        return m38278x6e095e9(3);
    }

    /* renamed from: hasEnableHitcheck */
    public boolean m38277x251cb532() {
        return m38278x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38278x6e095e9(int i17) {
        return this.f18490xcb94b041[i17];
    }

    /* renamed from: hasFilemd5 */
    public boolean m38279x462db288() {
        return m38278x6e095e9(7);
    }

    /* renamed from: hasOnlyHitcheck */
    public boolean m38280x6dcc7cdb() {
        return m38278x6e095e9(4);
    }

    /* renamed from: hasSendmsgData */
    public boolean m38281xd719db49() {
        return m38278x6e095e9(6);
    }

    /* renamed from: hasSendmsgViaCdn */
    public boolean m38282x972f1d1e() {
        return m38278x6e095e9(5);
    }

    /* renamed from: hasTouser */
    public boolean m38283xf135e800() {
        return m38278x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38284x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f18494xcc4544c6;
            if (str != null && this.f18490xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f18490xcb94b041[2]) {
                fVar.a(2, this.f18488xbadd2491);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2 c4460x4e1874a2 = this.f18487xf92af27c;
            if (c4460x4e1874a2 != null && this.f18490xcb94b041[3]) {
                fVar.i(3, c4460x4e1874a2.mo75928xcd1e8d8());
                this.f18487xf92af27c.mo75956x3d5d1f78(fVar);
            }
            if (this.f18490xcb94b041[4]) {
                fVar.a(4, this.f18491xb73a8888);
            }
            if (this.f18490xcb94b041[5]) {
                fVar.a(5, this.f18493x6908a936);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f18492xc8cb5130;
            if (gVar != null && this.f18490xcb94b041[6]) {
                fVar.b(6, gVar);
            }
            java.lang.String str2 = this.f18489xcd09ee82;
            if (str2 != null && this.f18490xcb94b041[7]) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f18486xab4b3f30;
            if (str3 != null && this.f18490xcb94b041[8]) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f18494xcc4544c6;
            if (str4 != null && this.f18490xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (this.f18490xcb94b041[2]) {
                i18 += b36.f.a(2, this.f18488xbadd2491);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2 c4460x4e1874a22 = this.f18487xf92af27c;
            if (c4460x4e1874a22 != null && this.f18490xcb94b041[3]) {
                i18 += b36.f.i(3, c4460x4e1874a22.mo75928xcd1e8d8());
            }
            if (this.f18490xcb94b041[4]) {
                i18 += b36.f.a(4, this.f18491xb73a8888);
            }
            if (this.f18490xcb94b041[5]) {
                i18 += b36.f.a(5, this.f18493x6908a936);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f18492xc8cb5130;
            if (gVar2 != null && this.f18490xcb94b041[6]) {
                i18 += b36.f.b(6, gVar2);
            }
            java.lang.String str5 = this.f18489xcd09ee82;
            if (str5 != null && this.f18490xcb94b041[7]) {
                i18 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f18486xab4b3f30;
            return (str6 == null || !this.f18490xcb94b041[8]) ? i18 : i18 + b36.f.j(8, str6);
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
                this.f18494xcc4544c6 = aVar2.k(intValue);
                this.f18490xcb94b041[1] = true;
                return 0;
            case 2:
                this.f18488xbadd2491 = aVar2.c(intValue);
                this.f18490xcb94b041[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2 c4460x4e1874a23 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2();
                    if (bArr != null && bArr.length > 0) {
                        c4460x4e1874a23.mo11468x92b714fd(bArr);
                    }
                    this.f18487xf92af27c = c4460x4e1874a23;
                }
                this.f18490xcb94b041[3] = true;
                return 0;
            case 4:
                this.f18491xb73a8888 = aVar2.c(intValue);
                this.f18490xcb94b041[4] = true;
                return 0;
            case 5:
                this.f18493x6908a936 = aVar2.c(intValue);
                this.f18490xcb94b041[5] = true;
                return 0;
            case 6:
                this.f18492xc8cb5130 = aVar2.d(intValue);
                this.f18490xcb94b041[6] = true;
                return 0;
            case 7:
                this.f18489xcd09ee82 = aVar2.k(intValue);
                this.f18490xcb94b041[7] = true;
                return 0;
            case 8:
                this.f18486xab4b3f30 = aVar2.k(intValue);
                this.f18490xcb94b041[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAeskey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38286x3979632(java.lang.String str) {
        this.f18486xab4b3f30 = str;
        this.f18490xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setBigfile */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38287xaa697bba(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2 c4460x4e1874a2) {
        this.f18487xf92af27c = c4460x4e1874a2;
        this.f18490xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setEnableHitcheck */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38288x7c8c20fa(boolean z17) {
        this.f18488xbadd2491 = z17;
        this.f18490xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setFilemd5 */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38289x7e4877c0(java.lang.String str) {
        this.f18489xcd09ee82 = str;
        this.f18490xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setOnlyHitcheck */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38290xc0343aa3(boolean z17) {
        this.f18491xb73a8888 = z17;
        this.f18490xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setSendmsgData */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38291x4d5f4481(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f18492xc8cb5130 = gVar;
        this.f18490xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setSendmsgViaCdn */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38292x91bf1856(boolean z17) {
        this.f18493x6908a936 = z17;
        this.f18490xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setTouser */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38293x24919bc8(java.lang.String str) {
        this.f18494xcc4544c6 = str;
        this.f18490xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m38285x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9) super.mo11468x92b714fd(bArr);
    }
}
