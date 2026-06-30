package r45;

/* loaded from: classes2.dex */
public class d90 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453777d;

    /* renamed from: e, reason: collision with root package name */
    public int f453778e;

    /* renamed from: f, reason: collision with root package name */
    public int f453779f;

    /* renamed from: g, reason: collision with root package name */
    public int f453780g;

    /* renamed from: h, reason: collision with root package name */
    public int f453781h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d90)) {
            return false;
        }
        r45.d90 d90Var = (r45.d90) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453777d), java.lang.Integer.valueOf(d90Var.f453777d)) && n51.f.a(java.lang.Integer.valueOf(this.f453778e), java.lang.Integer.valueOf(d90Var.f453778e)) && n51.f.a(java.lang.Integer.valueOf(this.f453779f), java.lang.Integer.valueOf(d90Var.f453779f)) && n51.f.a(java.lang.Integer.valueOf(this.f453780g), java.lang.Integer.valueOf(d90Var.f453780g)) && n51.f.a(java.lang.Integer.valueOf(this.f453781h), java.lang.Integer.valueOf(d90Var.f453781h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453777d);
            fVar.e(2, this.f453778e);
            fVar.e(3, this.f453779f);
            fVar.e(4, this.f453780g);
            fVar.e(5, this.f453781h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f453777d) + 0 + b36.f.e(2, this.f453778e) + b36.f.e(3, this.f453779f) + b36.f.e(4, this.f453780g) + b36.f.e(5, this.f453781h);
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
        r45.d90 d90Var = (r45.d90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d90Var.f453777d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            d90Var.f453778e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            d90Var.f453779f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            d90Var.f453780g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        d90Var.f453781h = aVar2.g(intValue);
        return 0;
    }
}
