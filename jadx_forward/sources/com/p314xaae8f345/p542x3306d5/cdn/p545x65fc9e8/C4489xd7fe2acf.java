package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.FileItem */
/* loaded from: classes8.dex */
public class C4489xd7fe2acf extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf f18685xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf();

    /* renamed from: buffer */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f18686xaddb9440;

    /* renamed from: compress */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4508x3004cb46 f18687xdc47eb62;

    /* renamed from: filepath */
    private java.lang.String f18688xd4353ba1;

    /* renamed from: filetype */
    private int f18689xd43766b6;

    /* renamed from: format */
    private int f18690xb45ff7f7;

    /* renamed from: hasSetFields */
    private final boolean[] f18691xcb94b041 = new boolean[7];

    /* renamed from: md5, reason: collision with root package name */
    private java.lang.String f134061md5;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m38881xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m38882x7c90cfc0() {
        return f18685xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m38883x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m38884x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18689xd43766b6), java.lang.Integer.valueOf(c4489xd7fe2acf.f18689xd43766b6)) && n51.f.a(this.f18688xd4353ba1, c4489xd7fe2acf.f18688xd4353ba1) && n51.f.a(this.f18686xaddb9440, c4489xd7fe2acf.f18686xaddb9440) && n51.f.a(this.f134061md5, c4489xd7fe2acf.f134061md5) && n51.f.a(java.lang.Integer.valueOf(this.f18690xb45ff7f7), java.lang.Integer.valueOf(c4489xd7fe2acf.f18690xb45ff7f7)) && n51.f.a(this.f18687xdc47eb62, c4489xd7fe2acf.f18687xdc47eb62);
    }

    /* renamed from: getBuffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m38885x12f2b736() {
        return this.f18691xcb94b041[3] ? this.f18686xaddb9440 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getCompress */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4508x3004cb46 m38886x582228d8() {
        return this.f18691xcb94b041[6] ? this.f18687xdc47eb62 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4508x3004cb46.MEDIA_COMPRESS_UNKNOWN;
    }

    /* renamed from: getFilepath */
    public java.lang.String m38887x500f7917() {
        return this.f18691xcb94b041[2] ? this.f18688xd4353ba1 : "";
    }

    /* renamed from: getFiletype */
    public int m38888x5011a42c() {
        return this.f18689xd43766b6;
    }

    /* renamed from: getFormat */
    public int m38889x19771aed() {
        return this.f18690xb45ff7f7;
    }

    /* renamed from: getMd5 */
    public java.lang.String m38890xb5885648() {
        return this.f18691xcb94b041[4] ? this.f134061md5 : "";
    }

    /* renamed from: hasBuffer */
    public boolean m38891xd2cc377a() {
        return m38893x6e095e9(3);
    }

    /* renamed from: hasCompress */
    public boolean m38892x879ca81c() {
        return m38893x6e095e9(6);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38893x6e095e9(int i17) {
        return this.f18691xcb94b041[i17];
    }

    /* renamed from: hasFilepath */
    public boolean m38894x7f89f85b() {
        return m38893x6e095e9(2);
    }

    /* renamed from: hasFiletype */
    public boolean m38895x7f8c2370() {
        return m38893x6e095e9(1);
    }

    /* renamed from: hasFormat */
    public boolean m38896xd9509b31() {
        return m38893x6e095e9(5);
    }

    /* renamed from: hasMd5 */
    public boolean m38897xb7045c84() {
        return m38893x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m38898x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18691xcb94b041[1]) {
                fVar.e(1, this.f18689xd43766b6);
            }
            java.lang.String str = this.f18688xd4353ba1;
            if (str != null && this.f18691xcb94b041[2]) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f18686xaddb9440;
            if (gVar != null && this.f18691xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f134061md5;
            if (str2 != null && this.f18691xcb94b041[4]) {
                fVar.j(4, str2);
            }
            if (this.f18691xcb94b041[5]) {
                fVar.e(5, this.f18690xb45ff7f7);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4508x3004cb46 enumC4508x3004cb46 = this.f18687xdc47eb62;
            if (enumC4508x3004cb46 != null && this.f18691xcb94b041[6]) {
                fVar.e(6, enumC4508x3004cb46.f18897x6ac9171);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18691xcb94b041[1] ? 0 + b36.f.e(1, this.f18689xd43766b6) : 0;
            java.lang.String str3 = this.f18688xd4353ba1;
            if (str3 != null && this.f18691xcb94b041[2]) {
                e17 += b36.f.j(2, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f18686xaddb9440;
            if (gVar2 != null && this.f18691xcb94b041[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            java.lang.String str4 = this.f134061md5;
            if (str4 != null && this.f18691xcb94b041[4]) {
                e17 += b36.f.j(4, str4);
            }
            if (this.f18691xcb94b041[5]) {
                e17 += b36.f.e(5, this.f18690xb45ff7f7);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4508x3004cb46 enumC4508x3004cb462 = this.f18687xdc47eb62;
            return (enumC4508x3004cb462 == null || !this.f18691xcb94b041[6]) ? e17 : e17 + b36.f.e(6, enumC4508x3004cb462.f18897x6ac9171);
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
                this.f18689xd43766b6 = aVar2.g(intValue);
                this.f18691xcb94b041[1] = true;
                return 0;
            case 2:
                this.f18688xd4353ba1 = aVar2.k(intValue);
                this.f18691xcb94b041[2] = true;
                return 0;
            case 3:
                this.f18686xaddb9440 = aVar2.d(intValue);
                this.f18691xcb94b041[3] = true;
                return 0;
            case 4:
                this.f134061md5 = aVar2.k(intValue);
                this.f18691xcb94b041[4] = true;
                return 0;
            case 5:
                this.f18690xb45ff7f7 = aVar2.g(intValue);
                this.f18691xcb94b041[5] = true;
                return 0;
            case 6:
                this.f18687xdc47eb62 = com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4508x3004cb46.m39223x382ad972(aVar2.g(intValue));
                this.f18691xcb94b041[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBuffer */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m38900x627eb42(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f18686xaddb9440 = gVar;
        this.f18691xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setCompress */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m38901x52da89e4(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4508x3004cb46 enumC4508x3004cb46) {
        this.f18687xdc47eb62 = enumC4508x3004cb46;
        this.f18691xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setFilepath */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m38902x4ac7da23(java.lang.String str) {
        this.f18688xd4353ba1 = str;
        this.f18691xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setFiletype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m38903x4aca0538(int i17) {
        this.f18689xd43766b6 = i17;
        this.f18691xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setFormat */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m38904xcac4ef9(int i17) {
        this.f18690xb45ff7f7 = i17;
        this.f18691xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setMd5 */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m38905xca027dbc(java.lang.String str) {
        this.f134061md5 = str;
        this.f18691xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m38899x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf) super.mo11468x92b714fd(bArr);
    }
}
