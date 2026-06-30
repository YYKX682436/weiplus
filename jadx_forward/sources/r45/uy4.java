package r45;

/* loaded from: classes9.dex */
public class uy4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bn6 f469269d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f469270e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f469271f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469272g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uy4)) {
            return false;
        }
        r45.uy4 uy4Var = (r45.uy4) fVar;
        return n51.f.a(this.f469269d, uy4Var.f469269d) && n51.f.a(java.lang.Boolean.valueOf(this.f469270e), java.lang.Boolean.valueOf(uy4Var.f469270e)) && n51.f.a(java.lang.Boolean.valueOf(this.f469271f), java.lang.Boolean.valueOf(uy4Var.f469271f)) && n51.f.a(this.f469272g, uy4Var.f469272g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bn6 bn6Var = this.f469269d;
            if (bn6Var != null) {
                fVar.i(1, bn6Var.mo75928xcd1e8d8());
                this.f469269d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(2, this.f469270e);
            fVar.a(3, this.f469271f);
            java.lang.String str = this.f469272g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.bn6 bn6Var2 = this.f469269d;
            int i18 = (bn6Var2 != null ? 0 + b36.f.i(1, bn6Var2.mo75928xcd1e8d8()) : 0) + b36.f.a(2, this.f469270e) + b36.f.a(3, this.f469271f);
            java.lang.String str2 = this.f469272g;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.uy4 uy4Var = (r45.uy4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                uy4Var.f469270e = aVar2.c(intValue);
                return 0;
            }
            if (intValue == 3) {
                uy4Var.f469271f = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            uy4Var.f469272g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.bn6 bn6Var3 = new r45.bn6();
            if (bArr != null && bArr.length > 0) {
                bn6Var3.mo11468x92b714fd(bArr);
            }
            uy4Var.f469269d = bn6Var3;
        }
        return 0;
    }
}
