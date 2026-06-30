package bw5;

/* loaded from: classes11.dex */
public class pl0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: x, reason: collision with root package name */
    public static final bw5.pl0 f113259x = new bw5.pl0();

    /* renamed from: d, reason: collision with root package name */
    public int f113260d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113261e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113262f;

    /* renamed from: g, reason: collision with root package name */
    public long f113263g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f113264h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f113265i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f113266m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f113267n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f113268o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f113269p;

    /* renamed from: q, reason: collision with root package name */
    public long f113270q;

    /* renamed from: r, reason: collision with root package name */
    public int f113271r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f113272s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f113273t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.ql0 f113274u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f113275v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f113276w = new boolean[17];

    public java.lang.String b() {
        return this.f113276w[2] ? this.f113261e : "";
    }

    public java.lang.String c() {
        return this.f113276w[5] ? this.f113264h : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pl0)) {
            return false;
        }
        bw5.pl0 pl0Var = (bw5.pl0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113260d), java.lang.Integer.valueOf(pl0Var.f113260d)) && n51.f.a(this.f113261e, pl0Var.f113261e) && n51.f.a(this.f113262f, pl0Var.f113262f) && n51.f.a(java.lang.Long.valueOf(this.f113263g), java.lang.Long.valueOf(pl0Var.f113263g)) && n51.f.a(this.f113264h, pl0Var.f113264h) && n51.f.a(this.f113265i, pl0Var.f113265i) && n51.f.a(this.f113266m, pl0Var.f113266m) && n51.f.a(this.f113267n, pl0Var.f113267n) && n51.f.a(java.lang.Boolean.valueOf(this.f113268o), java.lang.Boolean.valueOf(pl0Var.f113268o)) && n51.f.a(java.lang.Boolean.valueOf(this.f113269p), java.lang.Boolean.valueOf(pl0Var.f113269p)) && n51.f.a(java.lang.Long.valueOf(this.f113270q), java.lang.Long.valueOf(pl0Var.f113270q)) && n51.f.a(java.lang.Integer.valueOf(this.f113271r), java.lang.Integer.valueOf(pl0Var.f113271r)) && n51.f.a(this.f113272s, pl0Var.f113272s) && n51.f.a(this.f113273t, pl0Var.f113273t) && n51.f.a(this.f113274u, pl0Var.f113274u) && n51.f.a(java.lang.Boolean.valueOf(this.f113275v), java.lang.Boolean.valueOf(pl0Var.f113275v));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.pl0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.pl0) super.mo11468x92b714fd(bArr);
    }

    /* renamed from: getStatusId */
    public java.lang.String m12752xca73e223() {
        return this.f113276w[3] ? this.f113262f : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113276w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113260d);
            }
            java.lang.String str = this.f113261e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f113262f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f113263g);
            }
            java.lang.String str3 = this.f113264h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f113265i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f113266m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f113267n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.a(9, this.f113268o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f113269p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f113270q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f113271r);
            }
            java.lang.String str7 = this.f113272s;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f113273t;
            if (str8 != null && zArr[14]) {
                fVar.j(14, str8);
            }
            bw5.ql0 ql0Var = this.f113274u;
            if (ql0Var != null && zArr[15]) {
                fVar.i(15, ql0Var.mo75928xcd1e8d8());
                this.f113274u.mo75956x3d5d1f78(fVar);
            }
            if (zArr[16]) {
                fVar.a(16, this.f113275v);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f113260d) + 0 : 0;
            java.lang.String str9 = this.f113261e;
            if (str9 != null && zArr[2]) {
                e17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f113262f;
            if (str10 != null && zArr[3]) {
                e17 += b36.f.j(3, str10);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f113263g);
            }
            java.lang.String str11 = this.f113264h;
            if (str11 != null && zArr[5]) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f113265i;
            if (str12 != null && zArr[6]) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f113266m;
            if (str13 != null && zArr[7]) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f113267n;
            if (str14 != null && zArr[8]) {
                e17 += b36.f.j(8, str14);
            }
            if (zArr[9]) {
                e17 += b36.f.a(9, this.f113268o);
            }
            if (zArr[10]) {
                e17 += b36.f.a(10, this.f113269p);
            }
            if (zArr[11]) {
                e17 += b36.f.h(11, this.f113270q);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f113271r);
            }
            java.lang.String str15 = this.f113272s;
            if (str15 != null && zArr[13]) {
                e17 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f113273t;
            if (str16 != null && zArr[14]) {
                e17 += b36.f.j(14, str16);
            }
            bw5.ql0 ql0Var2 = this.f113274u;
            if (ql0Var2 != null && zArr[15]) {
                e17 += b36.f.i(15, ql0Var2.mo75928xcd1e8d8());
            }
            return zArr[16] ? e17 + b36.f.a(16, this.f113275v) : e17;
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
                this.f113260d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113261e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113262f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113263g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113264h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113265i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113266m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f113267n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f113268o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f113269p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f113270q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f113271r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f113272s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f113273t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ql0 ql0Var3 = new bw5.ql0();
                    if (bArr != null && bArr.length > 0) {
                        ql0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f113274u = ql0Var3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f113275v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            default:
                return -1;
        }
    }
}
