package r45;

/* loaded from: classes2.dex */
public class bg4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452275d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452276e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452277f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452278g;

    /* renamed from: h, reason: collision with root package name */
    public long f452279h;

    /* renamed from: i, reason: collision with root package name */
    public int f452280i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f452281m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f452282n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bg4)) {
            return false;
        }
        r45.bg4 bg4Var = (r45.bg4) fVar;
        return n51.f.a(this.f452275d, bg4Var.f452275d) && n51.f.a(this.f452276e, bg4Var.f452276e) && n51.f.a(this.f452277f, bg4Var.f452277f) && n51.f.a(this.f452278g, bg4Var.f452278g) && n51.f.a(java.lang.Long.valueOf(this.f452279h), java.lang.Long.valueOf(bg4Var.f452279h)) && n51.f.a(java.lang.Integer.valueOf(this.f452280i), java.lang.Integer.valueOf(bg4Var.f452280i)) && n51.f.a(this.f452281m, bg4Var.f452281m) && n51.f.a(java.lang.Boolean.valueOf(this.f452282n), java.lang.Boolean.valueOf(bg4Var.f452282n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452275d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452276e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f452277f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f452278g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.h(5, this.f452279h);
            fVar.e(6, this.f452280i);
            java.lang.String str5 = this.f452281m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.a(8, this.f452282n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f452275d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f452276e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f452277f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f452278g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int h17 = j17 + b36.f.h(5, this.f452279h) + b36.f.e(6, this.f452280i);
            java.lang.String str10 = this.f452281m;
            if (str10 != null) {
                h17 += b36.f.j(7, str10);
            }
            return h17 + b36.f.a(8, this.f452282n);
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
        r45.bg4 bg4Var = (r45.bg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bg4Var.f452275d = aVar2.k(intValue);
                return 0;
            case 2:
                bg4Var.f452276e = aVar2.k(intValue);
                return 0;
            case 3:
                bg4Var.f452277f = aVar2.k(intValue);
                return 0;
            case 4:
                bg4Var.f452278g = aVar2.k(intValue);
                return 0;
            case 5:
                bg4Var.f452279h = aVar2.i(intValue);
                return 0;
            case 6:
                bg4Var.f452280i = aVar2.g(intValue);
                return 0;
            case 7:
                bg4Var.f452281m = aVar2.k(intValue);
                return 0;
            case 8:
                bg4Var.f452282n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
