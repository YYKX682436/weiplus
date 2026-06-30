package r45;

/* loaded from: classes7.dex */
public class m55 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f461688d;

    /* renamed from: e, reason: collision with root package name */
    public r45.l55 f461689e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m55)) {
            return false;
        }
        r45.m55 m55Var = (r45.m55) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f461688d), java.lang.Long.valueOf(m55Var.f461688d)) && n51.f.a(this.f461689e, m55Var.f461689e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f461688d);
            r45.l55 l55Var = this.f461689e;
            if (l55Var != null) {
                fVar.i(2, l55Var.mo75928xcd1e8d8());
                this.f461689e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f461688d) + 0;
            r45.l55 l55Var2 = this.f461689e;
            return l55Var2 != null ? h17 + b36.f.i(2, l55Var2.mo75928xcd1e8d8()) : h17;
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
        r45.m55 m55Var = (r45.m55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m55Var.f461688d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.l55 l55Var3 = new r45.l55();
            if (bArr != null && bArr.length > 0) {
                l55Var3.mo11468x92b714fd(bArr);
            }
            m55Var.f461689e = l55Var3;
        }
        return 0;
    }
}
