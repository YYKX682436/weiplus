package r45;

/* loaded from: classes8.dex */
public class a85 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451351d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451352e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f451353f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f451354g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451355h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451356i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451357m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f451358n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a85)) {
            return false;
        }
        r45.a85 a85Var = (r45.a85) fVar;
        return n51.f.a(this.f451351d, a85Var.f451351d) && n51.f.a(this.f451352e, a85Var.f451352e) && n51.f.a(java.lang.Boolean.valueOf(this.f451353f), java.lang.Boolean.valueOf(a85Var.f451353f)) && n51.f.a(java.lang.Boolean.valueOf(this.f451354g), java.lang.Boolean.valueOf(a85Var.f451354g)) && n51.f.a(this.f451355h, a85Var.f451355h) && n51.f.a(this.f451356i, a85Var.f451356i) && n51.f.a(this.f451357m, a85Var.f451357m) && n51.f.a(this.f451358n, a85Var.f451358n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451351d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f451352e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f451353f);
            fVar.a(4, this.f451354g);
            java.lang.String str3 = this.f451355h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f451356i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f451357m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f451358n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f451351d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f451352e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int a17 = j17 + b36.f.a(3, this.f451353f) + b36.f.a(4, this.f451354g);
            java.lang.String str9 = this.f451355h;
            if (str9 != null) {
                a17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f451356i;
            if (str10 != null) {
                a17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f451357m;
            if (str11 != null) {
                a17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f451358n;
            return str12 != null ? a17 + b36.f.j(8, str12) : a17;
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
        r45.a85 a85Var = (r45.a85) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a85Var.f451351d = aVar2.k(intValue);
                return 0;
            case 2:
                a85Var.f451352e = aVar2.k(intValue);
                return 0;
            case 3:
                a85Var.f451353f = aVar2.c(intValue);
                return 0;
            case 4:
                a85Var.f451354g = aVar2.c(intValue);
                return 0;
            case 5:
                a85Var.f451355h = aVar2.k(intValue);
                return 0;
            case 6:
                a85Var.f451356i = aVar2.k(intValue);
                return 0;
            case 7:
                a85Var.f451357m = aVar2.k(intValue);
                return 0;
            case 8:
                a85Var.f451358n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
