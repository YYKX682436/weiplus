package r45;

/* loaded from: classes4.dex */
public class ax6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f451873d;

    /* renamed from: e, reason: collision with root package name */
    public double f451874e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451875f;

    /* renamed from: g, reason: collision with root package name */
    public r45.h74 f451876g;

    /* renamed from: h, reason: collision with root package name */
    public long f451877h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ax6)) {
            return false;
        }
        r45.ax6 ax6Var = (r45.ax6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f451873d), java.lang.Long.valueOf(ax6Var.f451873d)) && n51.f.a(java.lang.Double.valueOf(this.f451874e), java.lang.Double.valueOf(ax6Var.f451874e)) && n51.f.a(this.f451875f, ax6Var.f451875f) && n51.f.a(this.f451876g, ax6Var.f451876g) && n51.f.a(java.lang.Long.valueOf(this.f451877h), java.lang.Long.valueOf(ax6Var.f451877h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f451873d);
            fVar.c(2, this.f451874e);
            java.lang.String str = this.f451875f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.h74 h74Var = this.f451876g;
            if (h74Var != null) {
                fVar.i(4, h74Var.mo75928xcd1e8d8());
                this.f451876g.mo75956x3d5d1f78(fVar);
            }
            fVar.h(5, this.f451877h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f451873d) + 0 + b36.f.c(2, this.f451874e);
            java.lang.String str2 = this.f451875f;
            if (str2 != null) {
                h17 += b36.f.j(3, str2);
            }
            r45.h74 h74Var2 = this.f451876g;
            if (h74Var2 != null) {
                h17 += b36.f.i(4, h74Var2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.h(5, this.f451877h);
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
        r45.ax6 ax6Var = (r45.ax6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ax6Var.f451873d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            ax6Var.f451874e = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 3) {
            ax6Var.f451875f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            ax6Var.f451877h = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.h74 h74Var3 = new r45.h74();
            if (bArr != null && bArr.length > 0) {
                h74Var3.mo11468x92b714fd(bArr);
            }
            ax6Var.f451876g = h74Var3;
        }
        return 0;
    }
}
