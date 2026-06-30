package r45;

/* loaded from: classes9.dex */
public class gc7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456632d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f456633e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f456634f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456635g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f456636h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456637i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f456638m;

    /* renamed from: n, reason: collision with root package name */
    public int f456639n;

    /* renamed from: o, reason: collision with root package name */
    public r45.wc7 f456640o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f456641p;

    /* renamed from: q, reason: collision with root package name */
    public r45.bz f456642q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gc7)) {
            return false;
        }
        r45.gc7 gc7Var = (r45.gc7) fVar;
        return n51.f.a(this.f76494x2de60e5e, gc7Var.f76494x2de60e5e) && n51.f.a(this.f456632d, gc7Var.f456632d) && n51.f.a(this.f456633e, gc7Var.f456633e) && n51.f.a(java.lang.Boolean.valueOf(this.f456634f), java.lang.Boolean.valueOf(gc7Var.f456634f)) && n51.f.a(this.f456635g, gc7Var.f456635g) && n51.f.a(java.lang.Boolean.valueOf(this.f456636h), java.lang.Boolean.valueOf(gc7Var.f456636h)) && n51.f.a(this.f456637i, gc7Var.f456637i) && n51.f.a(java.lang.Boolean.valueOf(this.f456638m), java.lang.Boolean.valueOf(gc7Var.f456638m)) && n51.f.a(java.lang.Integer.valueOf(this.f456639n), java.lang.Integer.valueOf(gc7Var.f456639n)) && n51.f.a(this.f456640o, gc7Var.f456640o) && n51.f.a(java.lang.Boolean.valueOf(this.f456641p), java.lang.Boolean.valueOf(gc7Var.f456641p)) && n51.f.a(this.f456642q, gc7Var.f456642q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f456632d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f456633e);
            fVar.a(4, this.f456634f);
            java.lang.String str2 = this.f456635g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.a(6, this.f456636h);
            java.lang.String str3 = this.f456637i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.a(8, this.f456638m);
            fVar.e(9, this.f456639n);
            r45.wc7 wc7Var = this.f456640o;
            if (wc7Var != null) {
                fVar.i(10, wc7Var.mo75928xcd1e8d8());
                this.f456640o.mo75956x3d5d1f78(fVar);
            }
            fVar.a(11, this.f456641p);
            r45.bz bzVar = this.f456642q;
            if (bzVar != null) {
                fVar.i(12, bzVar.mo75928xcd1e8d8());
                this.f456642q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f456632d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f456633e) + b36.f.a(4, this.f456634f);
            java.lang.String str5 = this.f456635g;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            int a17 = g17 + b36.f.a(6, this.f456636h);
            java.lang.String str6 = this.f456637i;
            if (str6 != null) {
                a17 += b36.f.j(7, str6);
            }
            int a18 = a17 + b36.f.a(8, this.f456638m) + b36.f.e(9, this.f456639n);
            r45.wc7 wc7Var2 = this.f456640o;
            if (wc7Var2 != null) {
                a18 += b36.f.i(10, wc7Var2.mo75928xcd1e8d8());
            }
            int a19 = a18 + b36.f.a(11, this.f456641p);
            r45.bz bzVar2 = this.f456642q;
            return bzVar2 != null ? a19 + b36.f.i(12, bzVar2.mo75928xcd1e8d8()) : a19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f456633e.clear();
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
        r45.gc7 gc7Var = (r45.gc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    gc7Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                gc7Var.f456632d = aVar2.k(intValue);
                return 0;
            case 3:
                gc7Var.f456633e.add(aVar2.k(intValue));
                return 0;
            case 4:
                gc7Var.f456634f = aVar2.c(intValue);
                return 0;
            case 5:
                gc7Var.f456635g = aVar2.k(intValue);
                return 0;
            case 6:
                gc7Var.f456636h = aVar2.c(intValue);
                return 0;
            case 7:
                gc7Var.f456637i = aVar2.k(intValue);
                return 0;
            case 8:
                gc7Var.f456638m = aVar2.c(intValue);
                return 0;
            case 9:
                gc7Var.f456639n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.wc7 wc7Var3 = new r45.wc7();
                    if (bArr3 != null && bArr3.length > 0) {
                        wc7Var3.mo11468x92b714fd(bArr3);
                    }
                    gc7Var.f456640o = wc7Var3;
                }
                return 0;
            case 11:
                gc7Var.f456641p = aVar2.c(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.bz bzVar3 = new r45.bz();
                    if (bArr4 != null && bArr4.length > 0) {
                        bzVar3.mo11468x92b714fd(bArr4);
                    }
                    gc7Var.f456642q = bzVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
