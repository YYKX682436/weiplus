package r45;

/* loaded from: classes4.dex */
public class a55 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451273d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ax6 f451274e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a55)) {
            return false;
        }
        r45.a55 a55Var = (r45.a55) fVar;
        return n51.f.a(this.f451273d, a55Var.f451273d) && n51.f.a(this.f451274e, a55Var.f451274e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451273d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.ax6 ax6Var = this.f451274e;
            if (ax6Var != null) {
                fVar.i(2, ax6Var.mo75928xcd1e8d8());
                this.f451274e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f451273d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.ax6 ax6Var2 = this.f451274e;
            return ax6Var2 != null ? j17 + b36.f.i(2, ax6Var2.mo75928xcd1e8d8()) : j17;
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
        r45.a55 a55Var = (r45.a55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a55Var.f451273d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.ax6 ax6Var3 = new r45.ax6();
            if (bArr != null && bArr.length > 0) {
                ax6Var3.mo11468x92b714fd(bArr);
            }
            a55Var.f451274e = ax6Var3;
        }
        return 0;
    }
}
