package r45;

/* loaded from: classes11.dex */
public class d4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453593d;

    /* renamed from: e, reason: collision with root package name */
    public int f453594e;

    /* renamed from: f, reason: collision with root package name */
    public int f453595f;

    /* renamed from: g, reason: collision with root package name */
    public int f453596g;

    /* renamed from: h, reason: collision with root package name */
    public int f453597h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d4)) {
            return false;
        }
        r45.d4 d4Var = (r45.d4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453593d), java.lang.Integer.valueOf(d4Var.f453593d)) && n51.f.a(java.lang.Integer.valueOf(this.f453594e), java.lang.Integer.valueOf(d4Var.f453594e)) && n51.f.a(java.lang.Integer.valueOf(this.f453595f), java.lang.Integer.valueOf(d4Var.f453595f)) && n51.f.a(java.lang.Integer.valueOf(this.f453596g), java.lang.Integer.valueOf(d4Var.f453596g)) && n51.f.a(java.lang.Integer.valueOf(this.f453597h), java.lang.Integer.valueOf(d4Var.f453597h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453593d);
            fVar.e(2, this.f453594e);
            fVar.e(3, this.f453595f);
            fVar.e(4, this.f453596g);
            fVar.e(5, this.f453597h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f453593d) + 0 + b36.f.e(2, this.f453594e) + b36.f.e(3, this.f453595f) + b36.f.e(4, this.f453596g) + b36.f.e(5, this.f453597h);
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
        r45.d4 d4Var = (r45.d4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d4Var.f453593d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            d4Var.f453594e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            d4Var.f453595f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            d4Var.f453596g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        d4Var.f453597h = aVar2.g(intValue);
        return 0;
    }
}
