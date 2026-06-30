package r45;

/* loaded from: classes4.dex */
public class ib6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458443e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458444f;

    /* renamed from: g, reason: collision with root package name */
    public long f458445g;

    /* renamed from: h, reason: collision with root package name */
    public long f458446h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458447i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f458448m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f458449n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ib6)) {
            return false;
        }
        r45.ib6 ib6Var = (r45.ib6) fVar;
        return n51.f.a(this.f458442d, ib6Var.f458442d) && n51.f.a(this.f458443e, ib6Var.f458443e) && n51.f.a(this.f458444f, ib6Var.f458444f) && n51.f.a(java.lang.Long.valueOf(this.f458445g), java.lang.Long.valueOf(ib6Var.f458445g)) && n51.f.a(java.lang.Long.valueOf(this.f458446h), java.lang.Long.valueOf(ib6Var.f458446h)) && n51.f.a(this.f458447i, ib6Var.f458447i) && n51.f.a(this.f458448m, ib6Var.f458448m) && n51.f.a(java.lang.Boolean.valueOf(this.f458449n), java.lang.Boolean.valueOf(ib6Var.f458449n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458442d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458443e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f458444f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f458445g);
            fVar.h(5, this.f458446h);
            java.lang.String str4 = this.f458447i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f458448m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.a(8, this.f458449n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f458442d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f458443e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f458444f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int h17 = j17 + b36.f.h(4, this.f458445g) + b36.f.h(5, this.f458446h);
            java.lang.String str9 = this.f458447i;
            if (str9 != null) {
                h17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f458448m;
            if (str10 != null) {
                h17 += b36.f.j(7, str10);
            }
            return h17 + b36.f.a(8, this.f458449n);
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
        r45.ib6 ib6Var = (r45.ib6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ib6Var.f458442d = aVar2.k(intValue);
                return 0;
            case 2:
                ib6Var.f458443e = aVar2.k(intValue);
                return 0;
            case 3:
                ib6Var.f458444f = aVar2.k(intValue);
                return 0;
            case 4:
                ib6Var.f458445g = aVar2.i(intValue);
                return 0;
            case 5:
                ib6Var.f458446h = aVar2.i(intValue);
                return 0;
            case 6:
                ib6Var.f458447i = aVar2.k(intValue);
                return 0;
            case 7:
                ib6Var.f458448m = aVar2.k(intValue);
                return 0;
            case 8:
                ib6Var.f458449n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
