package r45;

/* loaded from: classes4.dex */
public class mm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f462178d;

    /* renamed from: e, reason: collision with root package name */
    public int f462179e;

    /* renamed from: f, reason: collision with root package name */
    public int f462180f;

    /* renamed from: g, reason: collision with root package name */
    public int f462181g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f462182h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462183i;

    /* renamed from: m, reason: collision with root package name */
    public int f462184m;

    /* renamed from: n, reason: collision with root package name */
    public int f462185n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f462186o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462187p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f462188q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f462189r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f462190s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mm0)) {
            return false;
        }
        r45.mm0 mm0Var = (r45.mm0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f462178d), java.lang.Boolean.valueOf(mm0Var.f462178d)) && n51.f.a(java.lang.Integer.valueOf(this.f462179e), java.lang.Integer.valueOf(mm0Var.f462179e)) && n51.f.a(java.lang.Integer.valueOf(this.f462180f), java.lang.Integer.valueOf(mm0Var.f462180f)) && n51.f.a(java.lang.Integer.valueOf(this.f462181g), java.lang.Integer.valueOf(mm0Var.f462181g)) && n51.f.a(java.lang.Boolean.valueOf(this.f462182h), java.lang.Boolean.valueOf(mm0Var.f462182h)) && n51.f.a(this.f462183i, mm0Var.f462183i) && n51.f.a(java.lang.Integer.valueOf(this.f462184m), java.lang.Integer.valueOf(mm0Var.f462184m)) && n51.f.a(java.lang.Integer.valueOf(this.f462185n), java.lang.Integer.valueOf(mm0Var.f462185n)) && n51.f.a(this.f462186o, mm0Var.f462186o) && n51.f.a(this.f462187p, mm0Var.f462187p) && n51.f.a(this.f462188q, mm0Var.f462188q) && n51.f.a(this.f462189r, mm0Var.f462189r) && n51.f.a(this.f462190s, mm0Var.f462190s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f462178d);
            fVar.e(2, this.f462179e);
            fVar.e(3, this.f462180f);
            fVar.e(4, this.f462181g);
            fVar.a(5, this.f462182h);
            java.lang.String str = this.f462183i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f462184m);
            fVar.e(8, this.f462185n);
            java.lang.String str2 = this.f462186o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f462187p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f462188q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f462189r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f462190s;
            if (str6 == null) {
                return 0;
            }
            fVar.j(13, str6);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f462178d) + 0 + b36.f.e(2, this.f462179e) + b36.f.e(3, this.f462180f) + b36.f.e(4, this.f462181g) + b36.f.a(5, this.f462182h);
            java.lang.String str7 = this.f462183i;
            if (str7 != null) {
                a17 += b36.f.j(6, str7);
            }
            int e17 = a17 + b36.f.e(7, this.f462184m) + b36.f.e(8, this.f462185n);
            java.lang.String str8 = this.f462186o;
            if (str8 != null) {
                e17 += b36.f.j(9, str8);
            }
            java.lang.String str9 = this.f462187p;
            if (str9 != null) {
                e17 += b36.f.j(10, str9);
            }
            java.lang.String str10 = this.f462188q;
            if (str10 != null) {
                e17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f462189r;
            if (str11 != null) {
                e17 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f462190s;
            return str12 != null ? e17 + b36.f.j(13, str12) : e17;
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
        r45.mm0 mm0Var = (r45.mm0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mm0Var.f462178d = aVar2.c(intValue);
                return 0;
            case 2:
                mm0Var.f462179e = aVar2.g(intValue);
                return 0;
            case 3:
                mm0Var.f462180f = aVar2.g(intValue);
                return 0;
            case 4:
                mm0Var.f462181g = aVar2.g(intValue);
                return 0;
            case 5:
                mm0Var.f462182h = aVar2.c(intValue);
                return 0;
            case 6:
                mm0Var.f462183i = aVar2.k(intValue);
                return 0;
            case 7:
                mm0Var.f462184m = aVar2.g(intValue);
                return 0;
            case 8:
                mm0Var.f462185n = aVar2.g(intValue);
                return 0;
            case 9:
                mm0Var.f462186o = aVar2.k(intValue);
                return 0;
            case 10:
                mm0Var.f462187p = aVar2.k(intValue);
                return 0;
            case 11:
                mm0Var.f462188q = aVar2.k(intValue);
                return 0;
            case 12:
                mm0Var.f462189r = aVar2.k(intValue);
                return 0;
            case 13:
                mm0Var.f462190s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
