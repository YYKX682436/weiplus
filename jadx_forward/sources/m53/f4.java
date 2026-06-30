package m53;

/* loaded from: classes8.dex */
public class f4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405212d;

    /* renamed from: e, reason: collision with root package name */
    public m53.p3 f405213e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.f4)) {
            return false;
        }
        m53.f4 f4Var = (m53.f4) fVar;
        return n51.f.a(this.f405212d, f4Var.f405212d) && n51.f.a(this.f405213e, f4Var.f405213e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405212d;
            if (str != null) {
                fVar.j(1, str);
            }
            m53.p3 p3Var = this.f405213e;
            if (p3Var != null) {
                fVar.i(2, p3Var.mo75928xcd1e8d8());
                this.f405213e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f405212d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            m53.p3 p3Var2 = this.f405213e;
            return p3Var2 != null ? j17 + b36.f.i(2, p3Var2.mo75928xcd1e8d8()) : j17;
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
        m53.f4 f4Var = (m53.f4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f4Var.f405212d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            m53.p3 p3Var3 = new m53.p3();
            if (bArr != null && bArr.length > 0) {
                p3Var3.mo11468x92b714fd(bArr);
            }
            f4Var.f405213e = p3Var3;
        }
        return 0;
    }
}
