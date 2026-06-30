package r45;

/* loaded from: classes7.dex */
public class wm6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470825d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f470826e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470827f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470828g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470829h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470830i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470831m;

    /* renamed from: n, reason: collision with root package name */
    public long f470832n;

    /* renamed from: o, reason: collision with root package name */
    public int f470833o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f470834p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wm6)) {
            return false;
        }
        r45.wm6 wm6Var = (r45.wm6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470825d), java.lang.Integer.valueOf(wm6Var.f470825d)) && n51.f.a(java.lang.Integer.valueOf(this.f470826e), java.lang.Integer.valueOf(wm6Var.f470826e)) && n51.f.a(this.f470827f, wm6Var.f470827f) && n51.f.a(this.f470828g, wm6Var.f470828g) && n51.f.a(this.f470829h, wm6Var.f470829h) && n51.f.a(this.f470830i, wm6Var.f470830i) && n51.f.a(this.f470831m, wm6Var.f470831m) && n51.f.a(java.lang.Long.valueOf(this.f470832n), java.lang.Long.valueOf(wm6Var.f470832n)) && n51.f.a(java.lang.Integer.valueOf(this.f470833o), java.lang.Integer.valueOf(wm6Var.f470833o)) && n51.f.a(this.f470834p, wm6Var.f470834p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470825d);
            fVar.e(2, this.f470826e);
            java.lang.String str = this.f470827f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f470828g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f470829h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f470830i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f470831m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f470832n);
            fVar.e(9, this.f470833o);
            java.lang.String str6 = this.f470834p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f470825d) + 0 + b36.f.e(2, this.f470826e);
            java.lang.String str7 = this.f470827f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f470828g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f470829h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f470830i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f470831m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            int h17 = e17 + b36.f.h(8, this.f470832n) + b36.f.e(9, this.f470833o);
            java.lang.String str12 = this.f470834p;
            return str12 != null ? h17 + b36.f.j(10, str12) : h17;
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
        r45.wm6 wm6Var = (r45.wm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wm6Var.f470825d = aVar2.g(intValue);
                return 0;
            case 2:
                wm6Var.f470826e = aVar2.g(intValue);
                return 0;
            case 3:
                wm6Var.f470827f = aVar2.k(intValue);
                return 0;
            case 4:
                wm6Var.f470828g = aVar2.k(intValue);
                return 0;
            case 5:
                wm6Var.f470829h = aVar2.k(intValue);
                return 0;
            case 6:
                wm6Var.f470830i = aVar2.k(intValue);
                return 0;
            case 7:
                wm6Var.f470831m = aVar2.k(intValue);
                return 0;
            case 8:
                wm6Var.f470832n = aVar2.i(intValue);
                return 0;
            case 9:
                wm6Var.f470833o = aVar2.g(intValue);
                return 0;
            case 10:
                wm6Var.f470834p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
