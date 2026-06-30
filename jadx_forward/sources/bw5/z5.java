package bw5;

/* loaded from: classes9.dex */
public class z5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117351d;

    /* renamed from: e, reason: collision with root package name */
    public int f117352e;

    /* renamed from: f, reason: collision with root package name */
    public int f117353f;

    /* renamed from: g, reason: collision with root package name */
    public int f117354g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117355h;

    /* renamed from: i, reason: collision with root package name */
    public int f117356i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f117357m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f117358n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f117359o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f117360p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f117361q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f117362r = new boolean[12];

    static {
        new bw5.z5();
    }

    public java.lang.String b() {
        return this.f117362r[7] ? this.f117357m : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.z5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.z5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z5)) {
            return false;
        }
        bw5.z5 z5Var = (bw5.z5) fVar;
        return n51.f.a(this.f117351d, z5Var.f117351d) && n51.f.a(java.lang.Integer.valueOf(this.f117352e), java.lang.Integer.valueOf(z5Var.f117352e)) && n51.f.a(java.lang.Integer.valueOf(this.f117353f), java.lang.Integer.valueOf(z5Var.f117353f)) && n51.f.a(java.lang.Integer.valueOf(this.f117354g), java.lang.Integer.valueOf(z5Var.f117354g)) && n51.f.a(this.f117355h, z5Var.f117355h) && n51.f.a(java.lang.Integer.valueOf(this.f117356i), java.lang.Integer.valueOf(z5Var.f117356i)) && n51.f.a(this.f117357m, z5Var.f117357m) && n51.f.a(this.f117358n, z5Var.f117358n) && n51.f.a(this.f117359o, z5Var.f117359o) && n51.f.a(this.f117360p, z5Var.f117360p) && n51.f.a(java.lang.Boolean.valueOf(this.f117361q), java.lang.Boolean.valueOf(z5Var.f117361q));
    }

    /* renamed from: getMsgId */
    public java.lang.String m13461x74d37ac6() {
        return this.f117362r[1] ? this.f117351d : "";
    }

    /* renamed from: getUrl */
    public java.lang.String m13462xb5887639() {
        return this.f117362r[5] ? this.f117355h : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.z5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f117362r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117351d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f117352e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f117353f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f117354g);
            }
            java.lang.String str2 = this.f117355h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f117356i);
            }
            java.lang.String str3 = this.f117357m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f117358n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f117359o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f117360p;
            if (str6 != null && zArr[10]) {
                fVar.j(10, str6);
            }
            if (zArr[11]) {
                fVar.a(11, this.f117361q);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f117351d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f117352e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f117353f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f117354g);
            }
            java.lang.String str8 = this.f117355h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f117356i);
            }
            java.lang.String str9 = this.f117357m;
            if (str9 != null && zArr[7]) {
                i18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f117358n;
            if (str10 != null && zArr[8]) {
                i18 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f117359o;
            if (str11 != null && zArr[9]) {
                i18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f117360p;
            if (str12 != null && zArr[10]) {
                i18 += b36.f.j(10, str12);
            }
            return zArr[11] ? i18 + b36.f.a(11, this.f117361q) : i18;
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
                this.f117351d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117352e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117353f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117354g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117355h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117356i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f117357m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f117358n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f117359o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f117360p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f117361q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
