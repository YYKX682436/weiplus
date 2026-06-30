package r45;

/* loaded from: classes2.dex */
public class l77 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460741d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460742e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460743f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460744g;

    /* renamed from: h, reason: collision with root package name */
    public int f460745h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460746i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460747m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f460748n;

    /* renamed from: o, reason: collision with root package name */
    public int f460749o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f460750p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l77)) {
            return false;
        }
        r45.l77 l77Var = (r45.l77) fVar;
        return n51.f.a(this.f460741d, l77Var.f460741d) && n51.f.a(this.f460742e, l77Var.f460742e) && n51.f.a(this.f460743f, l77Var.f460743f) && n51.f.a(this.f460744g, l77Var.f460744g) && n51.f.a(java.lang.Integer.valueOf(this.f460745h), java.lang.Integer.valueOf(l77Var.f460745h)) && n51.f.a(this.f460746i, l77Var.f460746i) && n51.f.a(this.f460747m, l77Var.f460747m) && n51.f.a(this.f460748n, l77Var.f460748n) && n51.f.a(java.lang.Integer.valueOf(this.f460749o), java.lang.Integer.valueOf(l77Var.f460749o)) && n51.f.a(this.f460750p, l77Var.f460750p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460741d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460742e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f460743f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f460744g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f460745h);
            java.lang.String str5 = this.f460746i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f460747m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f460748n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f460749o);
            java.lang.String str8 = this.f460750p;
            if (str8 != null) {
                fVar.j(19, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f460741d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f460742e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f460743f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f460744g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            int e17 = j17 + b36.f.e(5, this.f460745h);
            java.lang.String str13 = this.f460746i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f460747m;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f460748n;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            int e18 = e17 + b36.f.e(9, this.f460749o);
            java.lang.String str16 = this.f460750p;
            return str16 != null ? e18 + b36.f.j(19, str16) : e18;
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
        r45.l77 l77Var = (r45.l77) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 19) {
            l77Var.f460750p = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                l77Var.f460741d = aVar2.k(intValue);
                return 0;
            case 2:
                l77Var.f460742e = aVar2.k(intValue);
                return 0;
            case 3:
                l77Var.f460743f = aVar2.k(intValue);
                return 0;
            case 4:
                l77Var.f460744g = aVar2.k(intValue);
                return 0;
            case 5:
                l77Var.f460745h = aVar2.g(intValue);
                return 0;
            case 6:
                l77Var.f460746i = aVar2.k(intValue);
                return 0;
            case 7:
                l77Var.f460747m = aVar2.k(intValue);
                return 0;
            case 8:
                l77Var.f460748n = aVar2.k(intValue);
                return 0;
            case 9:
                l77Var.f460749o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
