package r45;

/* loaded from: classes8.dex */
public class d80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f453749d;

    /* renamed from: e, reason: collision with root package name */
    public long f453750e;

    /* renamed from: f, reason: collision with root package name */
    public int f453751f;

    /* renamed from: g, reason: collision with root package name */
    public int f453752g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453753h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d80)) {
            return false;
        }
        r45.d80 d80Var = (r45.d80) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f453749d), java.lang.Long.valueOf(d80Var.f453749d)) && n51.f.a(java.lang.Long.valueOf(this.f453750e), java.lang.Long.valueOf(d80Var.f453750e)) && n51.f.a(java.lang.Integer.valueOf(this.f453751f), java.lang.Integer.valueOf(d80Var.f453751f)) && n51.f.a(java.lang.Integer.valueOf(this.f453752g), java.lang.Integer.valueOf(d80Var.f453752g)) && n51.f.a(this.f453753h, d80Var.f453753h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f453749d);
            fVar.h(2, this.f453750e);
            fVar.e(3, this.f453751f);
            fVar.e(4, this.f453752g);
            java.lang.String str = this.f453753h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f453749d) + 0 + b36.f.h(2, this.f453750e) + b36.f.e(3, this.f453751f) + b36.f.e(4, this.f453752g);
            java.lang.String str2 = this.f453753h;
            return str2 != null ? h17 + b36.f.j(5, str2) : h17;
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
        r45.d80 d80Var = (r45.d80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d80Var.f453749d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            d80Var.f453750e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            d80Var.f453751f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            d80Var.f453752g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        d80Var.f453753h = aVar2.k(intValue);
        return 0;
    }
}
