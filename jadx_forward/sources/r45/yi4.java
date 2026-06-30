package r45;

/* loaded from: classes8.dex */
public class yi4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472659d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472660e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472661f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472662g;

    /* renamed from: i, reason: collision with root package name */
    public float f472664i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472665m;

    /* renamed from: n, reason: collision with root package name */
    public int f472666n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f472667o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f472668p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f472669q;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f472663h = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f472670r = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yi4)) {
            return false;
        }
        r45.yi4 yi4Var = (r45.yi4) fVar;
        return n51.f.a(this.f472659d, yi4Var.f472659d) && n51.f.a(this.f472660e, yi4Var.f472660e) && n51.f.a(this.f472661f, yi4Var.f472661f) && n51.f.a(this.f472662g, yi4Var.f472662g) && n51.f.a(this.f472663h, yi4Var.f472663h) && n51.f.a(java.lang.Float.valueOf(this.f472664i), java.lang.Float.valueOf(yi4Var.f472664i)) && n51.f.a(this.f472665m, yi4Var.f472665m) && n51.f.a(java.lang.Integer.valueOf(this.f472666n), java.lang.Integer.valueOf(yi4Var.f472666n)) && n51.f.a(this.f472667o, yi4Var.f472667o) && n51.f.a(java.lang.Boolean.valueOf(this.f472668p), java.lang.Boolean.valueOf(yi4Var.f472668p)) && n51.f.a(this.f472669q, yi4Var.f472669q) && n51.f.a(this.f472670r, yi4Var.f472670r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472670r;
        java.util.LinkedList linkedList2 = this.f472663h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472659d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472660e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f472661f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f472662g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.g(5, 1, linkedList2);
            fVar.d(6, this.f472664i);
            java.lang.String str5 = this.f472665m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f472666n);
            java.lang.String str6 = this.f472667o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.a(10, this.f472668p);
            java.lang.String str7 = this.f472669q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            fVar.g(12, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f472659d;
            int j17 = str8 != null ? b36.f.j(1, str8) + 0 : 0;
            java.lang.String str9 = this.f472660e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f472661f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f472662g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            int g17 = j17 + b36.f.g(5, 1, linkedList2) + b36.f.d(6, this.f472664i);
            java.lang.String str12 = this.f472665m;
            if (str12 != null) {
                g17 += b36.f.j(7, str12);
            }
            int e17 = g17 + b36.f.e(8, this.f472666n);
            java.lang.String str13 = this.f472667o;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            int a17 = e17 + b36.f.a(10, this.f472668p);
            java.lang.String str14 = this.f472669q;
            if (str14 != null) {
                a17 += b36.f.j(11, str14);
            }
            return a17 + b36.f.g(12, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.yi4 yi4Var = (r45.yi4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                yi4Var.f472659d = aVar2.k(intValue);
                return 0;
            case 2:
                yi4Var.f472660e = aVar2.k(intValue);
                return 0;
            case 3:
                yi4Var.f472661f = aVar2.k(intValue);
                return 0;
            case 4:
                yi4Var.f472662g = aVar2.k(intValue);
                return 0;
            case 5:
                yi4Var.f472663h.add(aVar2.k(intValue));
                return 0;
            case 6:
                yi4Var.f472664i = aVar2.f(intValue);
                return 0;
            case 7:
                yi4Var.f472665m = aVar2.k(intValue);
                return 0;
            case 8:
                yi4Var.f472666n = aVar2.g(intValue);
                return 0;
            case 9:
                yi4Var.f472667o = aVar2.k(intValue);
                return 0;
            case 10:
                yi4Var.f472668p = aVar2.c(intValue);
                return 0;
            case 11:
                yi4Var.f472669q = aVar2.k(intValue);
                return 0;
            case 12:
                yi4Var.f472670r.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
