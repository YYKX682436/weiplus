package r45;

/* loaded from: classes4.dex */
public class cf7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453062d;

    /* renamed from: e, reason: collision with root package name */
    public int f453063e;

    /* renamed from: f, reason: collision with root package name */
    public int f453064f;

    /* renamed from: g, reason: collision with root package name */
    public int f453065g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453066h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cf7)) {
            return false;
        }
        r45.cf7 cf7Var = (r45.cf7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453062d), java.lang.Integer.valueOf(cf7Var.f453062d)) && n51.f.a(java.lang.Integer.valueOf(this.f453063e), java.lang.Integer.valueOf(cf7Var.f453063e)) && n51.f.a(java.lang.Integer.valueOf(this.f453064f), java.lang.Integer.valueOf(cf7Var.f453064f)) && n51.f.a(java.lang.Integer.valueOf(this.f453065g), java.lang.Integer.valueOf(cf7Var.f453065g)) && n51.f.a(this.f453066h, cf7Var.f453066h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453062d);
            fVar.e(2, this.f453063e);
            fVar.e(3, this.f453064f);
            fVar.e(4, this.f453065g);
            java.lang.String str = this.f453066h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453062d) + 0 + b36.f.e(2, this.f453063e) + b36.f.e(3, this.f453064f) + b36.f.e(4, this.f453065g);
            java.lang.String str2 = this.f453066h;
            return str2 != null ? e17 + b36.f.j(5, str2) : e17;
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
        r45.cf7 cf7Var = (r45.cf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cf7Var.f453062d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            cf7Var.f453063e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            cf7Var.f453064f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            cf7Var.f453065g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        cf7Var.f453066h = aVar2.k(intValue);
        return 0;
    }
}
