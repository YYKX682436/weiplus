package r45;

/* loaded from: classes11.dex */
public class xv4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f472030d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f472031e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472032f;

    /* renamed from: g, reason: collision with root package name */
    public float f472033g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472034h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472035i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472036m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f472037n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472038o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472039p;

    /* renamed from: q, reason: collision with root package name */
    public int f472040q;

    /* renamed from: r, reason: collision with root package name */
    public float f472041r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472042s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472043t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472044u;

    /* renamed from: v, reason: collision with root package name */
    public int f472045v;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xv4)) {
            return false;
        }
        r45.xv4 xv4Var = (r45.xv4) fVar;
        return n51.f.a(this.f76492x92037252, xv4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f472030d), java.lang.Integer.valueOf(xv4Var.f472030d)) && n51.f.a(this.f472031e, xv4Var.f472031e) && n51.f.a(this.f472032f, xv4Var.f472032f) && n51.f.a(java.lang.Float.valueOf(this.f472033g), java.lang.Float.valueOf(xv4Var.f472033g)) && n51.f.a(this.f472034h, xv4Var.f472034h) && n51.f.a(this.f472035i, xv4Var.f472035i) && n51.f.a(this.f472036m, xv4Var.f472036m) && n51.f.a(java.lang.Boolean.valueOf(this.f472037n), java.lang.Boolean.valueOf(xv4Var.f472037n)) && n51.f.a(this.f472038o, xv4Var.f472038o) && n51.f.a(this.f472039p, xv4Var.f472039p) && n51.f.a(java.lang.Integer.valueOf(this.f472040q), java.lang.Integer.valueOf(xv4Var.f472040q)) && n51.f.a(java.lang.Float.valueOf(this.f472041r), java.lang.Float.valueOf(xv4Var.f472041r)) && n51.f.a(this.f472042s, xv4Var.f472042s) && n51.f.a(this.f472043t, xv4Var.f472043t) && n51.f.a(this.f472044u, xv4Var.f472044u) && n51.f.a(java.lang.Integer.valueOf(this.f472045v), java.lang.Integer.valueOf(xv4Var.f472045v));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472031e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f472030d);
            fVar.g(3, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472032f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.d(5, this.f472033g);
            java.lang.String str = this.f472034h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f472035i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f472036m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.a(9, this.f472037n);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f472038o;
            if (gVar2 != null) {
                fVar.b(10, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f472039p;
            if (gVar3 != null) {
                fVar.b(11, gVar3);
            }
            fVar.e(12, this.f472040q);
            fVar.d(13, this.f472041r);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f472042s;
            if (gVar4 != null) {
                fVar.b(14, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f472043t;
            if (gVar5 != null) {
                fVar.b(15, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f472044u;
            if (gVar6 != null) {
                fVar.b(16, gVar6);
            }
            fVar.e(17, this.f472045v);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f472030d) + b36.f.g(3, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f472032f;
            if (gVar7 != null) {
                i18 += b36.f.b(4, gVar7);
            }
            int d17 = i18 + b36.f.d(5, this.f472033g);
            java.lang.String str4 = this.f472034h;
            if (str4 != null) {
                d17 += b36.f.j(6, str4);
            }
            java.lang.String str5 = this.f472035i;
            if (str5 != null) {
                d17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f472036m;
            if (str6 != null) {
                d17 += b36.f.j(8, str6);
            }
            int a17 = d17 + b36.f.a(9, this.f472037n);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.f472038o;
            if (gVar8 != null) {
                a17 += b36.f.b(10, gVar8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar9 = this.f472039p;
            if (gVar9 != null) {
                a17 += b36.f.b(11, gVar9);
            }
            int e17 = a17 + b36.f.e(12, this.f472040q) + b36.f.d(13, this.f472041r);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar10 = this.f472042s;
            if (gVar10 != null) {
                e17 += b36.f.b(14, gVar10);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar11 = this.f472043t;
            if (gVar11 != null) {
                e17 += b36.f.b(15, gVar11);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar12 = this.f472044u;
            if (gVar12 != null) {
                e17 += b36.f.b(16, gVar12);
            }
            return e17 + b36.f.e(17, this.f472045v);
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
        r45.xv4 xv4Var = (r45.xv4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    xv4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                xv4Var.f472030d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.eq6 eq6Var = new r45.eq6();
                    if (bArr3 != null && bArr3.length > 0) {
                        eq6Var.mo11468x92b714fd(bArr3);
                    }
                    xv4Var.f472031e.add(eq6Var);
                }
                return 0;
            case 4:
                xv4Var.f472032f = aVar2.d(intValue);
                return 0;
            case 5:
                xv4Var.f472033g = aVar2.f(intValue);
                return 0;
            case 6:
                xv4Var.f472034h = aVar2.k(intValue);
                return 0;
            case 7:
                xv4Var.f472035i = aVar2.k(intValue);
                return 0;
            case 8:
                xv4Var.f472036m = aVar2.k(intValue);
                return 0;
            case 9:
                xv4Var.f472037n = aVar2.c(intValue);
                return 0;
            case 10:
                xv4Var.f472038o = aVar2.d(intValue);
                return 0;
            case 11:
                xv4Var.f472039p = aVar2.d(intValue);
                return 0;
            case 12:
                xv4Var.f472040q = aVar2.g(intValue);
                return 0;
            case 13:
                xv4Var.f472041r = aVar2.f(intValue);
                return 0;
            case 14:
                xv4Var.f472042s = aVar2.d(intValue);
                return 0;
            case 15:
                xv4Var.f472043t = aVar2.d(intValue);
                return 0;
            case 16:
                xv4Var.f472044u = aVar2.d(intValue);
                return 0;
            case 17:
                xv4Var.f472045v = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
