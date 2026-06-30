package r45;

/* loaded from: classes7.dex */
public class g24 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456367d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f456368e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f456369f;

    /* renamed from: g, reason: collision with root package name */
    public r45.nd7 f456370g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456371h;

    /* renamed from: i, reason: collision with root package name */
    public r45.me7 f456372i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f456373m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g24)) {
            return false;
        }
        r45.g24 g24Var = (r45.g24) fVar;
        return n51.f.a(this.f76494x2de60e5e, g24Var.f76494x2de60e5e) && n51.f.a(this.f456367d, g24Var.f456367d) && n51.f.a(this.f456368e, g24Var.f456368e) && n51.f.a(java.lang.Integer.valueOf(this.f456369f), java.lang.Integer.valueOf(g24Var.f456369f)) && n51.f.a(this.f456370g, g24Var.f456370g) && n51.f.a(this.f456371h, g24Var.f456371h) && n51.f.a(this.f456372i, g24Var.f456372i) && n51.f.a(java.lang.Boolean.valueOf(this.f456373m), java.lang.Boolean.valueOf(g24Var.f456373m));
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
            java.lang.String str = this.f456367d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f456368e);
            fVar.e(4, this.f456369f);
            r45.nd7 nd7Var = this.f456370g;
            if (nd7Var != null) {
                fVar.i(5, nd7Var.mo75928xcd1e8d8());
                this.f456370g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f456371h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.me7 me7Var = this.f456372i;
            if (me7Var != null) {
                fVar.i(7, me7Var.mo75928xcd1e8d8());
                this.f456372i.mo75956x3d5d1f78(fVar);
            }
            fVar.a(8, this.f456373m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f456367d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f456368e) + b36.f.e(4, this.f456369f);
            r45.nd7 nd7Var2 = this.f456370g;
            if (nd7Var2 != null) {
                g17 += b36.f.i(5, nd7Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f456371h;
            if (str4 != null) {
                g17 += b36.f.j(6, str4);
            }
            r45.me7 me7Var2 = this.f456372i;
            if (me7Var2 != null) {
                g17 += b36.f.i(7, me7Var2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.a(8, this.f456373m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f456368e.clear();
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
        r45.g24 g24Var = (r45.g24) objArr[1];
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
                    g24Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                g24Var.f456367d = aVar2.k(intValue);
                return 0;
            case 3:
                g24Var.f456368e.add(aVar2.k(intValue));
                return 0;
            case 4:
                g24Var.f456369f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.nd7 nd7Var3 = new r45.nd7();
                    if (bArr3 != null && bArr3.length > 0) {
                        nd7Var3.mo11468x92b714fd(bArr3);
                    }
                    g24Var.f456370g = nd7Var3;
                }
                return 0;
            case 6:
                g24Var.f456371h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.me7 me7Var3 = new r45.me7();
                    if (bArr4 != null && bArr4.length > 0) {
                        me7Var3.mo11468x92b714fd(bArr4);
                    }
                    g24Var.f456372i = me7Var3;
                }
                return 0;
            case 8:
                g24Var.f456373m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
