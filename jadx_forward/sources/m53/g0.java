package m53;

/* loaded from: classes4.dex */
public class g0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.f6 f405222d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f405223e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f405224f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.g0)) {
            return false;
        }
        m53.g0 g0Var = (m53.g0) fVar;
        return n51.f.a(this.f405222d, g0Var.f405222d) && n51.f.a(java.lang.Boolean.valueOf(this.f405223e), java.lang.Boolean.valueOf(g0Var.f405223e)) && n51.f.a(java.lang.Boolean.valueOf(this.f405224f), java.lang.Boolean.valueOf(g0Var.f405224f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.f6 f6Var = this.f405222d;
            if (f6Var != null) {
                fVar.i(1, f6Var.mo75928xcd1e8d8());
                this.f405222d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(2, this.f405223e);
            fVar.a(4, this.f405224f);
            return 0;
        }
        if (i17 == 1) {
            m53.f6 f6Var2 = this.f405222d;
            return (f6Var2 != null ? 0 + b36.f.i(1, f6Var2.mo75928xcd1e8d8()) : 0) + b36.f.a(2, this.f405223e) + b36.f.a(4, this.f405224f);
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
        m53.g0 g0Var = (m53.g0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                g0Var.f405223e = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            g0Var.f405224f = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.f6 f6Var3 = new m53.f6();
            if (bArr != null && bArr.length > 0) {
                f6Var3.mo11468x92b714fd(bArr);
            }
            g0Var.f405222d = f6Var3;
        }
        return 0;
    }
}
