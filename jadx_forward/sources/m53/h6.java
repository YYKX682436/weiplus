package m53;

/* loaded from: classes8.dex */
public class h6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405289d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405290e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405291f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405292g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405293h;

    /* renamed from: i, reason: collision with root package name */
    public int f405294i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f405295m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.h6)) {
            return false;
        }
        m53.h6 h6Var = (m53.h6) fVar;
        return n51.f.a(this.f405289d, h6Var.f405289d) && n51.f.a(this.f405290e, h6Var.f405290e) && n51.f.a(this.f405291f, h6Var.f405291f) && n51.f.a(this.f405292g, h6Var.f405292g) && n51.f.a(this.f405293h, h6Var.f405293h) && n51.f.a(java.lang.Integer.valueOf(this.f405294i), java.lang.Integer.valueOf(h6Var.f405294i)) && n51.f.a(this.f405295m, h6Var.f405295m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405289d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405290e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405291f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f405292g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f405293h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f405294i);
            java.lang.String str6 = this.f405295m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f405289d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f405290e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f405291f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f405292g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f405293h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int e17 = j17 + b36.f.e(6, this.f405294i);
            java.lang.String str12 = this.f405295m;
            return str12 != null ? e17 + b36.f.j(7, str12) : e17;
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
        m53.h6 h6Var = (m53.h6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                h6Var.f405289d = aVar2.k(intValue);
                return 0;
            case 2:
                h6Var.f405290e = aVar2.k(intValue);
                return 0;
            case 3:
                h6Var.f405291f = aVar2.k(intValue);
                return 0;
            case 4:
                h6Var.f405292g = aVar2.k(intValue);
                return 0;
            case 5:
                h6Var.f405293h = aVar2.k(intValue);
                return 0;
            case 6:
                h6Var.f405294i = aVar2.g(intValue);
                return 0;
            case 7:
                h6Var.f405295m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
