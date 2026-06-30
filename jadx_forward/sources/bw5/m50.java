package bw5;

/* loaded from: classes2.dex */
public class m50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f111615d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111616e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111617f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f111618g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111619h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f111620i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.l50 f111621m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f111622n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f111623o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f111624p = new boolean[10];

    static {
        new bw5.m50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m50 mo11468x92b714fd(byte[] bArr) {
        return (bw5.m50) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m50)) {
            return false;
        }
        bw5.m50 m50Var = (bw5.m50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f111615d), java.lang.Integer.valueOf(m50Var.f111615d)) && n51.f.a(this.f111616e, m50Var.f111616e) && n51.f.a(this.f111617f, m50Var.f111617f) && n51.f.a(java.lang.Boolean.valueOf(this.f111618g), java.lang.Boolean.valueOf(m50Var.f111618g)) && n51.f.a(this.f111619h, m50Var.f111619h) && n51.f.a(this.f111620i, m50Var.f111620i) && n51.f.a(this.f111621m, m50Var.f111621m) && n51.f.a(java.lang.Boolean.valueOf(this.f111622n), java.lang.Boolean.valueOf(m50Var.f111622n)) && n51.f.a(this.f111623o, m50Var.f111623o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.m50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111624p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f111615d);
            }
            java.lang.String str = this.f111616e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f111617f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f111618g);
            }
            java.lang.String str3 = this.f111619h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f111620i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            bw5.l50 l50Var = this.f111621m;
            if (l50Var != null && zArr[7]) {
                fVar.i(7, l50Var.mo75928xcd1e8d8());
                this.f111621m.mo75956x3d5d1f78(fVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f111622n);
            }
            java.lang.String str5 = this.f111623o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f111615d) : 0;
            java.lang.String str6 = this.f111616e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f111617f;
            if (str7 != null && zArr[3]) {
                e17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                e17 += b36.f.a(4, this.f111618g);
            }
            java.lang.String str8 = this.f111619h;
            if (str8 != null && zArr[5]) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f111620i;
            if (str9 != null && zArr[6]) {
                e17 += b36.f.j(6, str9);
            }
            bw5.l50 l50Var2 = this.f111621m;
            if (l50Var2 != null && zArr[7]) {
                e17 += b36.f.i(7, l50Var2.mo75928xcd1e8d8());
            }
            if (zArr[8]) {
                e17 += b36.f.a(8, this.f111622n);
            }
            java.lang.String str10 = this.f111623o;
            return (str10 == null || !zArr[9]) ? e17 : e17 + b36.f.j(9, str10);
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
                this.f111615d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111616e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111617f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111618g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111619h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111620i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.l50 l50Var3 = new bw5.l50();
                    if (bArr != null && bArr.length > 0) {
                        l50Var3.mo11468x92b714fd(bArr);
                    }
                    this.f111621m = l50Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f111622n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111623o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
