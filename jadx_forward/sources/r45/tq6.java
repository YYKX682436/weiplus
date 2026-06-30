package r45;

/* loaded from: classes11.dex */
public class tq6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468238d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468239e;

    /* renamed from: f, reason: collision with root package name */
    public int f468240f;

    /* renamed from: g, reason: collision with root package name */
    public int f468241g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468242h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468243i;

    /* renamed from: m, reason: collision with root package name */
    public int f468244m;

    /* renamed from: n, reason: collision with root package name */
    public r45.oq6 f468245n;

    /* renamed from: o, reason: collision with root package name */
    public r45.xq6 f468246o;

    /* renamed from: p, reason: collision with root package name */
    public int f468247p;

    /* renamed from: q, reason: collision with root package name */
    public int f468248q;

    /* renamed from: r, reason: collision with root package name */
    public int f468249r;

    /* renamed from: s, reason: collision with root package name */
    public int f468250s;

    /* renamed from: t, reason: collision with root package name */
    public r45.qk0 f468251t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tq6)) {
            return false;
        }
        r45.tq6 tq6Var = (r45.tq6) fVar;
        return n51.f.a(this.f468238d, tq6Var.f468238d) && n51.f.a(this.f468239e, tq6Var.f468239e) && n51.f.a(java.lang.Integer.valueOf(this.f468240f), java.lang.Integer.valueOf(tq6Var.f468240f)) && n51.f.a(java.lang.Integer.valueOf(this.f468241g), java.lang.Integer.valueOf(tq6Var.f468241g)) && n51.f.a(this.f468242h, tq6Var.f468242h) && n51.f.a(this.f468243i, tq6Var.f468243i) && n51.f.a(java.lang.Integer.valueOf(this.f468244m), java.lang.Integer.valueOf(tq6Var.f468244m)) && n51.f.a(this.f468245n, tq6Var.f468245n) && n51.f.a(this.f468246o, tq6Var.f468246o) && n51.f.a(java.lang.Integer.valueOf(this.f468247p), java.lang.Integer.valueOf(tq6Var.f468247p)) && n51.f.a(java.lang.Integer.valueOf(this.f468248q), java.lang.Integer.valueOf(tq6Var.f468248q)) && n51.f.a(java.lang.Integer.valueOf(this.f468249r), java.lang.Integer.valueOf(tq6Var.f468249r)) && n51.f.a(java.lang.Integer.valueOf(this.f468250s), java.lang.Integer.valueOf(tq6Var.f468250s)) && n51.f.a(this.f468251t, tq6Var.f468251t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468238d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f468239e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f468240f);
            fVar.e(4, this.f468241g);
            java.lang.String str3 = this.f468242h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f468243i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f468244m);
            r45.oq6 oq6Var = this.f468245n;
            if (oq6Var != null) {
                fVar.i(8, oq6Var.mo75928xcd1e8d8());
                this.f468245n.mo75956x3d5d1f78(fVar);
            }
            r45.xq6 xq6Var = this.f468246o;
            if (xq6Var != null) {
                fVar.i(9, xq6Var.mo75928xcd1e8d8());
                this.f468246o.mo75956x3d5d1f78(fVar);
            }
            fVar.e(10, this.f468247p);
            fVar.e(11, this.f468248q);
            fVar.e(12, this.f468249r);
            fVar.e(13, this.f468250s);
            r45.qk0 qk0Var = this.f468251t;
            if (qk0Var != null) {
                fVar.i(14, qk0Var.mo75928xcd1e8d8());
                this.f468251t.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f468238d;
            int j17 = str5 != null ? b36.f.j(1, str5) + 0 : 0;
            java.lang.String str6 = this.f468239e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f468240f) + b36.f.e(4, this.f468241g);
            java.lang.String str7 = this.f468242h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f468243i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            int e18 = e17 + b36.f.e(7, this.f468244m);
            r45.oq6 oq6Var2 = this.f468245n;
            if (oq6Var2 != null) {
                e18 += b36.f.i(8, oq6Var2.mo75928xcd1e8d8());
            }
            r45.xq6 xq6Var2 = this.f468246o;
            if (xq6Var2 != null) {
                e18 += b36.f.i(9, xq6Var2.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(10, this.f468247p) + b36.f.e(11, this.f468248q) + b36.f.e(12, this.f468249r) + b36.f.e(13, this.f468250s);
            r45.qk0 qk0Var2 = this.f468251t;
            return qk0Var2 != null ? e19 + b36.f.i(14, qk0Var2.mo75928xcd1e8d8()) : e19;
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
        r45.tq6 tq6Var = (r45.tq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tq6Var.f468238d = aVar2.k(intValue);
                return 0;
            case 2:
                tq6Var.f468239e = aVar2.k(intValue);
                return 0;
            case 3:
                tq6Var.f468240f = aVar2.g(intValue);
                return 0;
            case 4:
                tq6Var.f468241g = aVar2.g(intValue);
                return 0;
            case 5:
                tq6Var.f468242h = aVar2.k(intValue);
                return 0;
            case 6:
                tq6Var.f468243i = aVar2.k(intValue);
                return 0;
            case 7:
                tq6Var.f468244m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.oq6 oq6Var3 = new r45.oq6();
                    if (bArr != null && bArr.length > 0) {
                        oq6Var3.mo11468x92b714fd(bArr);
                    }
                    tq6Var.f468245n = oq6Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.xq6 xq6Var3 = new r45.xq6();
                    if (bArr2 != null && bArr2.length > 0) {
                        xq6Var3.mo11468x92b714fd(bArr2);
                    }
                    tq6Var.f468246o = xq6Var3;
                }
                return 0;
            case 10:
                tq6Var.f468247p = aVar2.g(intValue);
                return 0;
            case 11:
                tq6Var.f468248q = aVar2.g(intValue);
                return 0;
            case 12:
                tq6Var.f468249r = aVar2.g(intValue);
                return 0;
            case 13:
                tq6Var.f468250s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.qk0 qk0Var3 = new r45.qk0();
                    if (bArr3 != null && bArr3.length > 0) {
                        qk0Var3.mo11468x92b714fd(bArr3);
                    }
                    tq6Var.f468251t = qk0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
