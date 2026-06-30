package r45;

/* loaded from: classes11.dex */
public class zz4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f474017d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f474018e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f474019f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f474020g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f474021h;

    /* renamed from: i, reason: collision with root package name */
    public int f474022i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f474023m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f474024n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f474025o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zz4)) {
            return false;
        }
        r45.zz4 zz4Var = (r45.zz4) fVar;
        return n51.f.a(this.f474017d, zz4Var.f474017d) && n51.f.a(this.f474018e, zz4Var.f474018e) && n51.f.a(this.f474019f, zz4Var.f474019f) && n51.f.a(this.f474020g, zz4Var.f474020g) && n51.f.a(this.f474021h, zz4Var.f474021h) && n51.f.a(java.lang.Integer.valueOf(this.f474022i), java.lang.Integer.valueOf(zz4Var.f474022i)) && n51.f.a(this.f474023m, zz4Var.f474023m) && n51.f.a(this.f474024n, zz4Var.f474024n) && n51.f.a(this.f474025o, zz4Var.f474025o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f474017d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f474018e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f474019f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f474020g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f474021h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f474022i);
            java.lang.String str6 = this.f474023m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f474024n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f474025o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f474017d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f474018e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f474019f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f474020g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f474021h;
            if (str13 != null) {
                j17 += b36.f.j(5, str13);
            }
            int e17 = j17 + b36.f.e(6, this.f474022i);
            java.lang.String str14 = this.f474023m;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f474024n;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f474025o;
            return str16 != null ? e17 + b36.f.j(9, str16) : e17;
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
        r45.zz4 zz4Var = (r45.zz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zz4Var.f474017d = aVar2.k(intValue);
                return 0;
            case 2:
                zz4Var.f474018e = aVar2.k(intValue);
                return 0;
            case 3:
                zz4Var.f474019f = aVar2.k(intValue);
                return 0;
            case 4:
                zz4Var.f474020g = aVar2.k(intValue);
                return 0;
            case 5:
                zz4Var.f474021h = aVar2.k(intValue);
                return 0;
            case 6:
                zz4Var.f474022i = aVar2.g(intValue);
                return 0;
            case 7:
                zz4Var.f474023m = aVar2.k(intValue);
                return 0;
            case 8:
                zz4Var.f474024n = aVar2.k(intValue);
                return 0;
            case 9:
                zz4Var.f474025o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
