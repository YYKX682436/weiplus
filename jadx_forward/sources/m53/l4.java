package m53;

/* loaded from: classes2.dex */
public class l4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.g6 f405415d;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof m53.l4) && n51.f.a(this.f405415d, ((m53.l4) fVar).f405415d);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.g6 g6Var = this.f405415d;
            if (g6Var != null) {
                fVar.i(1, g6Var.mo75928xcd1e8d8());
                this.f405415d.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.g6 g6Var2 = this.f405415d;
            if (g6Var2 != null) {
                return 0 + b36.f.i(1, g6Var2.mo75928xcd1e8d8());
            }
            return 0;
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
        m53.l4 l4Var = (m53.l4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.g6 g6Var3 = new m53.g6();
            if (bArr != null && bArr.length > 0) {
                g6Var3.mo11468x92b714fd(bArr);
            }
            l4Var.f405415d = g6Var3;
        }
        return 0;
    }
}
