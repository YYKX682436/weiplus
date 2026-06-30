package bw5;

/* loaded from: classes15.dex */
public class q4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113454d;

    /* renamed from: e, reason: collision with root package name */
    public int f113455e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113456f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113457g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f113458h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f113459i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f113460m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f113461n;

    /* renamed from: o, reason: collision with root package name */
    public long f113462o;

    /* renamed from: p, reason: collision with root package name */
    public long f113463p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f113464q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f113465r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f113466s;

    /* renamed from: t, reason: collision with root package name */
    public int f113467t;

    /* renamed from: u, reason: collision with root package name */
    public long f113468u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f113469v = new boolean[16];

    static {
        new bw5.q4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q4 mo11468x92b714fd(byte[] bArr) {
        return (bw5.q4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q4)) {
            return false;
        }
        bw5.q4 q4Var = (bw5.q4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113454d), java.lang.Integer.valueOf(q4Var.f113454d)) && n51.f.a(java.lang.Integer.valueOf(this.f113455e), java.lang.Integer.valueOf(q4Var.f113455e)) && n51.f.a(this.f113456f, q4Var.f113456f) && n51.f.a(this.f113457g, q4Var.f113457g) && n51.f.a(this.f113458h, q4Var.f113458h) && n51.f.a(this.f113459i, q4Var.f113459i) && n51.f.a(this.f113460m, q4Var.f113460m) && n51.f.a(this.f113461n, q4Var.f113461n) && n51.f.a(java.lang.Long.valueOf(this.f113462o), java.lang.Long.valueOf(q4Var.f113462o)) && n51.f.a(java.lang.Long.valueOf(this.f113463p), java.lang.Long.valueOf(q4Var.f113463p)) && n51.f.a(this.f113464q, q4Var.f113464q) && n51.f.a(java.lang.Boolean.valueOf(this.f113465r), java.lang.Boolean.valueOf(q4Var.f113465r)) && n51.f.a(this.f113466s, q4Var.f113466s) && n51.f.a(java.lang.Integer.valueOf(this.f113467t), java.lang.Integer.valueOf(q4Var.f113467t)) && n51.f.a(java.lang.Long.valueOf(this.f113468u), java.lang.Long.valueOf(q4Var.f113468u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113469v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113454d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f113455e);
            }
            java.lang.String str = this.f113456f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f113457g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f113458h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f113459i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f113460m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f113461n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.h(9, this.f113462o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f113463p);
            }
            java.lang.String str7 = this.f113464q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            if (zArr[12]) {
                fVar.a(12, this.f113465r);
            }
            java.lang.String str8 = this.f113466s;
            if (str8 != null && zArr[13]) {
                fVar.j(13, str8);
            }
            if (zArr[14]) {
                fVar.e(14, this.f113467t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f113468u);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f113454d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f113455e);
            }
            java.lang.String str9 = this.f113456f;
            if (str9 != null && zArr[3]) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f113457g;
            if (str10 != null && zArr[4]) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f113458h;
            if (str11 != null && zArr[5]) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f113459i;
            if (str12 != null && zArr[6]) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f113460m;
            if (str13 != null && zArr[7]) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f113461n;
            if (str14 != null && zArr[8]) {
                e17 += b36.f.j(8, str14);
            }
            if (zArr[9]) {
                e17 += b36.f.h(9, this.f113462o);
            }
            if (zArr[10]) {
                e17 += b36.f.h(10, this.f113463p);
            }
            java.lang.String str15 = this.f113464q;
            if (str15 != null && zArr[11]) {
                e17 += b36.f.j(11, str15);
            }
            if (zArr[12]) {
                e17 += b36.f.a(12, this.f113465r);
            }
            java.lang.String str16 = this.f113466s;
            if (str16 != null && zArr[13]) {
                e17 += b36.f.j(13, str16);
            }
            if (zArr[14]) {
                e17 += b36.f.e(14, this.f113467t);
            }
            return zArr[15] ? e17 + b36.f.h(15, this.f113468u) : e17;
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
                this.f113454d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113455e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113456f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113457g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113458h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113459i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113460m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f113461n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f113462o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f113463p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f113464q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f113465r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f113466s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f113467t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f113468u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
