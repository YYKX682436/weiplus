package r45;

/* loaded from: classes7.dex */
public class p83 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464353d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464354e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464355f;

    /* renamed from: g, reason: collision with root package name */
    public int f464356g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464357h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464358i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464359m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464360n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f464361o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f464362p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f464363q;

    /* renamed from: r, reason: collision with root package name */
    public int f464364r;

    /* renamed from: s, reason: collision with root package name */
    public int f464365s;

    /* renamed from: t, reason: collision with root package name */
    public int f464366t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f464367u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f464368v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f464369w;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p83)) {
            return false;
        }
        r45.p83 p83Var = (r45.p83) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464353d), java.lang.Integer.valueOf(p83Var.f464353d)) && n51.f.a(this.f464354e, p83Var.f464354e) && n51.f.a(this.f464355f, p83Var.f464355f) && n51.f.a(java.lang.Integer.valueOf(this.f464356g), java.lang.Integer.valueOf(p83Var.f464356g)) && n51.f.a(this.f464357h, p83Var.f464357h) && n51.f.a(this.f464358i, p83Var.f464358i) && n51.f.a(this.f464359m, p83Var.f464359m) && n51.f.a(this.f464360n, p83Var.f464360n) && n51.f.a(this.f464361o, p83Var.f464361o) && n51.f.a(this.f464362p, p83Var.f464362p) && n51.f.a(this.f464363q, p83Var.f464363q) && n51.f.a(java.lang.Integer.valueOf(this.f464364r), java.lang.Integer.valueOf(p83Var.f464364r)) && n51.f.a(java.lang.Integer.valueOf(this.f464365s), java.lang.Integer.valueOf(p83Var.f464365s)) && n51.f.a(java.lang.Integer.valueOf(this.f464366t), java.lang.Integer.valueOf(p83Var.f464366t)) && n51.f.a(this.f464367u, p83Var.f464367u) && n51.f.a(this.f464368v, p83Var.f464368v) && n51.f.a(this.f464369w, p83Var.f464369w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464368v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464353d);
            java.lang.String str = this.f464354e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f464355f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f464356g);
            java.lang.String str3 = this.f464357h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f464358i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f464359m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f464360n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f464361o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f464362p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f464363q;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            fVar.e(13, this.f464364r);
            fVar.e(14, this.f464365s);
            fVar.e(15, this.f464366t);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f464367u;
            if (gVar != null) {
                fVar.b(16, gVar);
            }
            fVar.g(17, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f464369w;
            if (gVar2 != null) {
                fVar.b(18, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464353d) + 0;
            java.lang.String str10 = this.f464354e;
            if (str10 != null) {
                e17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f464355f;
            if (str11 != null) {
                e17 += b36.f.j(3, str11);
            }
            int e18 = e17 + b36.f.e(4, this.f464356g);
            java.lang.String str12 = this.f464357h;
            if (str12 != null) {
                e18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f464358i;
            if (str13 != null) {
                e18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f464359m;
            if (str14 != null) {
                e18 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f464360n;
            if (str15 != null) {
                e18 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f464361o;
            if (str16 != null) {
                e18 += b36.f.j(10, str16);
            }
            java.lang.String str17 = this.f464362p;
            if (str17 != null) {
                e18 += b36.f.j(11, str17);
            }
            java.lang.String str18 = this.f464363q;
            if (str18 != null) {
                e18 += b36.f.j(12, str18);
            }
            int e19 = e18 + b36.f.e(13, this.f464364r) + b36.f.e(14, this.f464365s) + b36.f.e(15, this.f464366t);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f464367u;
            if (gVar3 != null) {
                e19 += b36.f.b(16, gVar3);
            }
            int g17 = e19 + b36.f.g(17, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f464369w;
            return gVar4 != null ? g17 + b36.f.b(18, gVar4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.p83 p83Var = (r45.p83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p83Var.f464353d = aVar2.g(intValue);
                return 0;
            case 2:
                p83Var.f464354e = aVar2.k(intValue);
                return 0;
            case 3:
                p83Var.f464355f = aVar2.k(intValue);
                return 0;
            case 4:
                p83Var.f464356g = aVar2.g(intValue);
                return 0;
            case 5:
                p83Var.f464357h = aVar2.k(intValue);
                return 0;
            case 6:
                p83Var.f464358i = aVar2.k(intValue);
                return 0;
            case 7:
                p83Var.f464359m = aVar2.k(intValue);
                return 0;
            case 8:
                p83Var.f464360n = aVar2.k(intValue);
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                p83Var.f464361o = aVar2.k(intValue);
                return 0;
            case 11:
                p83Var.f464362p = aVar2.k(intValue);
                return 0;
            case 12:
                p83Var.f464363q = aVar2.k(intValue);
                return 0;
            case 13:
                p83Var.f464364r = aVar2.g(intValue);
                return 0;
            case 14:
                p83Var.f464365s = aVar2.g(intValue);
                return 0;
            case 15:
                p83Var.f464366t = aVar2.g(intValue);
                return 0;
            case 16:
                p83Var.f464367u = aVar2.d(intValue);
                return 0;
            case 17:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.rx3 rx3Var = new r45.rx3();
                    if (bArr2 != null && bArr2.length > 0) {
                        rx3Var.mo11468x92b714fd(bArr2);
                    }
                    p83Var.f464368v.add(rx3Var);
                }
                return 0;
            case 18:
                p83Var.f464369w = aVar2.d(intValue);
                return 0;
        }
    }
}
