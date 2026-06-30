package r45;

/* loaded from: classes8.dex */
public class l67 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460719d;

    /* renamed from: e, reason: collision with root package name */
    public r45.s67 f460720e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l67)) {
            return false;
        }
        r45.l67 l67Var = (r45.l67) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460719d), java.lang.Integer.valueOf(l67Var.f460719d)) && n51.f.a(this.f460720e, l67Var.f460720e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460719d);
            r45.s67 s67Var = this.f460720e;
            if (s67Var != null) {
                fVar.i(2, s67Var.mo75928xcd1e8d8());
                this.f460720e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460719d) + 0;
            r45.s67 s67Var2 = this.f460720e;
            return s67Var2 != null ? e17 + b36.f.i(2, s67Var2.mo75928xcd1e8d8()) : e17;
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
        r45.l67 l67Var = (r45.l67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l67Var.f460719d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.s67 s67Var3 = new r45.s67();
            if (bArr != null && bArr.length > 0) {
                s67Var3.mo11468x92b714fd(bArr);
            }
            l67Var.f460720e = s67Var3;
        }
        return 0;
    }
}
