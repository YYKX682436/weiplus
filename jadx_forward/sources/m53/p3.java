package m53;

/* loaded from: classes8.dex */
public class p3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f405495d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405496e;

    /* renamed from: f, reason: collision with root package name */
    public m53.c6 f405497f;

    /* renamed from: g, reason: collision with root package name */
    public m53.f3 f405498g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.p3)) {
            return false;
        }
        m53.p3 p3Var = (m53.p3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f405495d), java.lang.Integer.valueOf(p3Var.f405495d)) && n51.f.a(this.f405496e, p3Var.f405496e) && n51.f.a(this.f405497f, p3Var.f405497f) && n51.f.a(this.f405498g, p3Var.f405498g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f405495d);
            java.lang.String str = this.f405496e;
            if (str != null) {
                fVar.j(2, str);
            }
            m53.c6 c6Var = this.f405497f;
            if (c6Var != null) {
                fVar.i(3, c6Var.mo75928xcd1e8d8());
                this.f405497f.mo75956x3d5d1f78(fVar);
            }
            m53.f3 f3Var = this.f405498g;
            if (f3Var != null) {
                fVar.i(4, f3Var.mo75928xcd1e8d8());
                this.f405498g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f405495d) + 0;
            java.lang.String str2 = this.f405496e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            m53.c6 c6Var2 = this.f405497f;
            if (c6Var2 != null) {
                e17 += b36.f.i(3, c6Var2.mo75928xcd1e8d8());
            }
            m53.f3 f3Var2 = this.f405498g;
            return f3Var2 != null ? e17 + b36.f.i(4, f3Var2.mo75928xcd1e8d8()) : e17;
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
        m53.p3 p3Var = (m53.p3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p3Var.f405495d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            p3Var.f405496e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                m53.c6 c6Var3 = new m53.c6();
                if (bArr != null && bArr.length > 0) {
                    c6Var3.mo11468x92b714fd(bArr);
                }
                p3Var.f405497f = c6Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            m53.f3 f3Var3 = new m53.f3();
            if (bArr2 != null && bArr2.length > 0) {
                f3Var3.mo11468x92b714fd(bArr2);
            }
            p3Var.f405498g = f3Var3;
        }
        return 0;
    }
}
