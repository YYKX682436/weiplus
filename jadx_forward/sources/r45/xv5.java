package r45;

/* loaded from: classes15.dex */
public class xv5 extends r45.js5 {
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g A;
    public boolean B;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g C;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472047e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472048f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472049g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f472050h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f472051i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f472052m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f472054o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f472055p;

    /* renamed from: q, reason: collision with root package name */
    public int f472056q;

    /* renamed from: r, reason: collision with root package name */
    public int f472057r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f472058s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f472059t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f472060u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f472061v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472062w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472063x;

    /* renamed from: y, reason: collision with root package name */
    public r45.qx4 f472064y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f472065z;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f472046d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f472053n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xv5)) {
            return false;
        }
        r45.xv5 xv5Var = (r45.xv5) fVar;
        return n51.f.a(this.f76492x92037252, xv5Var.f76492x92037252) && n51.f.a(this.f472046d, xv5Var.f472046d) && n51.f.a(this.f472047e, xv5Var.f472047e) && n51.f.a(this.f472048f, xv5Var.f472048f) && n51.f.a(this.f472049g, xv5Var.f472049g) && n51.f.a(java.lang.Boolean.valueOf(this.f472050h), java.lang.Boolean.valueOf(xv5Var.f472050h)) && n51.f.a(java.lang.Boolean.valueOf(this.f472051i), java.lang.Boolean.valueOf(xv5Var.f472051i)) && n51.f.a(java.lang.Boolean.valueOf(this.f472052m), java.lang.Boolean.valueOf(xv5Var.f472052m)) && n51.f.a(this.f472053n, xv5Var.f472053n) && n51.f.a(java.lang.Boolean.valueOf(this.f472054o), java.lang.Boolean.valueOf(xv5Var.f472054o)) && n51.f.a(java.lang.Boolean.valueOf(this.f472055p), java.lang.Boolean.valueOf(xv5Var.f472055p)) && n51.f.a(java.lang.Integer.valueOf(this.f472056q), java.lang.Integer.valueOf(xv5Var.f472056q)) && n51.f.a(java.lang.Integer.valueOf(this.f472057r), java.lang.Integer.valueOf(xv5Var.f472057r)) && n51.f.a(this.f472058s, xv5Var.f472058s) && n51.f.a(this.f472059t, xv5Var.f472059t) && n51.f.a(this.f472060u, xv5Var.f472060u) && n51.f.a(this.f472061v, xv5Var.f472061v) && n51.f.a(this.f472062w, xv5Var.f472062w) && n51.f.a(this.f472063x, xv5Var.f472063x) && n51.f.a(this.f472064y, xv5Var.f472064y) && n51.f.a(java.lang.Boolean.valueOf(this.f472065z), java.lang.Boolean.valueOf(xv5Var.f472065z)) && n51.f.a(this.A, xv5Var.A) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(xv5Var.B)) && n51.f.a(this.C, xv5Var.C);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, this.f472046d);
            java.lang.String str = this.f472047e;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f472048f;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f472049g;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.a(8, this.f472050h);
            fVar.a(9, this.f472051i);
            fVar.a(10, this.f472052m);
            fVar.g(11, 8, this.f472053n);
            fVar.a(12, this.f472054o);
            fVar.a(13, this.f472055p);
            fVar.e(14, this.f472056q);
            fVar.e(15, this.f472057r);
            java.lang.String str4 = this.f472058s;
            if (str4 != null) {
                fVar.j(16, str4);
            }
            java.lang.String str5 = this.f472059t;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            java.lang.String str6 = this.f472060u;
            if (str6 != null) {
                fVar.j(20, str6);
            }
            java.lang.String str7 = this.f472061v;
            if (str7 != null) {
                fVar.j(21, str7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472062w;
            if (gVar != null) {
                fVar.b(22, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f472063x;
            if (gVar2 != null) {
                fVar.b(24, gVar2);
            }
            r45.qx4 qx4Var = this.f472064y;
            if (qx4Var != null) {
                fVar.i(25, qx4Var.mo75928xcd1e8d8());
                this.f472064y.mo75956x3d5d1f78(fVar);
            }
            fVar.a(26, this.f472065z);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.A;
            if (gVar3 != null) {
                fVar.b(27, gVar3);
            }
            fVar.a(28, this.B);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.C;
            if (gVar4 != null) {
                fVar.b(29, gVar4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.g(3, 8, this.f472046d);
            java.lang.String str8 = this.f472047e;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f472048f;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f472049g;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            int a17 = i18 + b36.f.a(8, this.f472050h) + b36.f.a(9, this.f472051i) + b36.f.a(10, this.f472052m) + b36.f.g(11, 8, this.f472053n) + b36.f.a(12, this.f472054o) + b36.f.a(13, this.f472055p) + b36.f.e(14, this.f472056q) + b36.f.e(15, this.f472057r);
            java.lang.String str11 = this.f472058s;
            if (str11 != null) {
                a17 += b36.f.j(16, str11);
            }
            java.lang.String str12 = this.f472059t;
            if (str12 != null) {
                a17 += b36.f.j(17, str12);
            }
            java.lang.String str13 = this.f472060u;
            if (str13 != null) {
                a17 += b36.f.j(20, str13);
            }
            java.lang.String str14 = this.f472061v;
            if (str14 != null) {
                a17 += b36.f.j(21, str14);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f472062w;
            if (gVar5 != null) {
                a17 += b36.f.b(22, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f472063x;
            if (gVar6 != null) {
                a17 += b36.f.b(24, gVar6);
            }
            r45.qx4 qx4Var2 = this.f472064y;
            if (qx4Var2 != null) {
                a17 += b36.f.i(25, qx4Var2.mo75928xcd1e8d8());
            }
            int a18 = a17 + b36.f.a(26, this.f472065z);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.A;
            if (gVar7 != null) {
                a18 += b36.f.b(27, gVar7);
            }
            int a19 = a18 + b36.f.a(28, this.B);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.C;
            return gVar8 != null ? a19 + b36.f.b(29, gVar8) : a19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f472046d.clear();
            this.f472053n.clear();
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
        r45.xv5 xv5Var = (r45.xv5) objArr[1];
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
                    xv5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
            case 7:
            case 18:
            case 19:
            case 23:
            default:
                return -1;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.px4 px4Var = new r45.px4();
                    if (bArr3 != null && bArr3.length > 0) {
                        px4Var.mo11468x92b714fd(bArr3);
                    }
                    xv5Var.f472046d.add(px4Var);
                }
                return 0;
            case 4:
                xv5Var.f472047e = aVar2.k(intValue);
                return 0;
            case 5:
                xv5Var.f472048f = aVar2.k(intValue);
                return 0;
            case 6:
                xv5Var.f472049g = aVar2.k(intValue);
                return 0;
            case 8:
                xv5Var.f472050h = aVar2.c(intValue);
                return 0;
            case 9:
                xv5Var.f472051i = aVar2.c(intValue);
                return 0;
            case 10:
                xv5Var.f472052m = aVar2.c(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.mx4 mx4Var = new r45.mx4();
                    if (bArr4 != null && bArr4.length > 0) {
                        mx4Var.mo11468x92b714fd(bArr4);
                    }
                    xv5Var.f472053n.add(mx4Var);
                }
                return 0;
            case 12:
                xv5Var.f472054o = aVar2.c(intValue);
                return 0;
            case 13:
                xv5Var.f472055p = aVar2.c(intValue);
                return 0;
            case 14:
                xv5Var.f472056q = aVar2.g(intValue);
                return 0;
            case 15:
                xv5Var.f472057r = aVar2.g(intValue);
                return 0;
            case 16:
                xv5Var.f472058s = aVar2.k(intValue);
                return 0;
            case 17:
                xv5Var.f472059t = aVar2.k(intValue);
                return 0;
            case 20:
                xv5Var.f472060u = aVar2.k(intValue);
                return 0;
            case 21:
                xv5Var.f472061v = aVar2.k(intValue);
                return 0;
            case 22:
                xv5Var.f472062w = aVar2.d(intValue);
                return 0;
            case 24:
                xv5Var.f472063x = aVar2.d(intValue);
                return 0;
            case 25:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.qx4 qx4Var3 = new r45.qx4();
                    if (bArr5 != null && bArr5.length > 0) {
                        qx4Var3.mo11468x92b714fd(bArr5);
                    }
                    xv5Var.f472064y = qx4Var3;
                }
                return 0;
            case 26:
                xv5Var.f472065z = aVar2.c(intValue);
                return 0;
            case 27:
                xv5Var.A = aVar2.d(intValue);
                return 0;
            case 28:
                xv5Var.B = aVar2.c(intValue);
                return 0;
            case 29:
                xv5Var.C = aVar2.d(intValue);
                return 0;
        }
    }
}
