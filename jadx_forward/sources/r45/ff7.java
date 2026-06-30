package r45;

/* loaded from: classes4.dex */
public class ff7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cf7 f455824d;

    /* renamed from: e, reason: collision with root package name */
    public int f455825e;

    /* renamed from: f, reason: collision with root package name */
    public int f455826f;

    /* renamed from: g, reason: collision with root package name */
    public int f455827g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f455828h;

    /* renamed from: i, reason: collision with root package name */
    public int f455829i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f455830m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455831n;

    /* renamed from: o, reason: collision with root package name */
    public int f455832o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f455833p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f455834q;

    /* renamed from: r, reason: collision with root package name */
    public int f455835r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f455836s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ff7)) {
            return false;
        }
        r45.ff7 ff7Var = (r45.ff7) fVar;
        return n51.f.a(this.f455824d, ff7Var.f455824d) && n51.f.a(java.lang.Integer.valueOf(this.f455825e), java.lang.Integer.valueOf(ff7Var.f455825e)) && n51.f.a(java.lang.Integer.valueOf(this.f455826f), java.lang.Integer.valueOf(ff7Var.f455826f)) && n51.f.a(java.lang.Integer.valueOf(this.f455827g), java.lang.Integer.valueOf(ff7Var.f455827g)) && n51.f.a(java.lang.Boolean.valueOf(this.f455828h), java.lang.Boolean.valueOf(ff7Var.f455828h)) && n51.f.a(java.lang.Integer.valueOf(this.f455829i), java.lang.Integer.valueOf(ff7Var.f455829i)) && n51.f.a(this.f455830m, ff7Var.f455830m) && n51.f.a(this.f455831n, ff7Var.f455831n) && n51.f.a(java.lang.Integer.valueOf(this.f455832o), java.lang.Integer.valueOf(ff7Var.f455832o)) && n51.f.a(java.lang.Boolean.valueOf(this.f455833p), java.lang.Boolean.valueOf(ff7Var.f455833p)) && n51.f.a(this.f455834q, ff7Var.f455834q) && n51.f.a(java.lang.Integer.valueOf(this.f455835r), java.lang.Integer.valueOf(ff7Var.f455835r)) && n51.f.a(this.f455836s, ff7Var.f455836s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cf7 cf7Var = this.f455824d;
            if (cf7Var != null) {
                fVar.i(1, cf7Var.mo75928xcd1e8d8());
                this.f455824d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f455825e);
            fVar.e(3, this.f455826f);
            fVar.e(4, this.f455827g);
            fVar.a(5, this.f455828h);
            fVar.e(6, this.f455829i);
            java.lang.String str = this.f455830m;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f455831n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.e(9, this.f455832o);
            fVar.a(10, this.f455833p);
            java.lang.String str3 = this.f455834q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            fVar.e(12, this.f455835r);
            java.lang.String str4 = this.f455836s;
            if (str4 == null) {
                return 0;
            }
            fVar.j(13, str4);
            return 0;
        }
        if (i17 == 1) {
            r45.cf7 cf7Var2 = this.f455824d;
            int i18 = (cf7Var2 != null ? 0 + b36.f.i(1, cf7Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455825e) + b36.f.e(3, this.f455826f) + b36.f.e(4, this.f455827g) + b36.f.a(5, this.f455828h) + b36.f.e(6, this.f455829i);
            java.lang.String str5 = this.f455830m;
            if (str5 != null) {
                i18 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f455831n;
            if (str6 != null) {
                i18 += b36.f.j(8, str6);
            }
            int e17 = i18 + b36.f.e(9, this.f455832o) + b36.f.a(10, this.f455833p);
            java.lang.String str7 = this.f455834q;
            if (str7 != null) {
                e17 += b36.f.j(11, str7);
            }
            int e18 = e17 + b36.f.e(12, this.f455835r);
            java.lang.String str8 = this.f455836s;
            return str8 != null ? e18 + b36.f.j(13, str8) : e18;
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
        r45.ff7 ff7Var = (r45.ff7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.cf7 cf7Var3 = new r45.cf7();
                    if (bArr != null && bArr.length > 0) {
                        cf7Var3.mo11468x92b714fd(bArr);
                    }
                    ff7Var.f455824d = cf7Var3;
                }
                return 0;
            case 2:
                ff7Var.f455825e = aVar2.g(intValue);
                return 0;
            case 3:
                ff7Var.f455826f = aVar2.g(intValue);
                return 0;
            case 4:
                ff7Var.f455827g = aVar2.g(intValue);
                return 0;
            case 5:
                ff7Var.f455828h = aVar2.c(intValue);
                return 0;
            case 6:
                ff7Var.f455829i = aVar2.g(intValue);
                return 0;
            case 7:
                ff7Var.f455830m = aVar2.k(intValue);
                return 0;
            case 8:
                ff7Var.f455831n = aVar2.k(intValue);
                return 0;
            case 9:
                ff7Var.f455832o = aVar2.g(intValue);
                return 0;
            case 10:
                ff7Var.f455833p = aVar2.c(intValue);
                return 0;
            case 11:
                ff7Var.f455834q = aVar2.k(intValue);
                return 0;
            case 12:
                ff7Var.f455835r = aVar2.g(intValue);
                return 0;
            case 13:
                ff7Var.f455836s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
