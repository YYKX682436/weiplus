package r45;

/* loaded from: classes14.dex */
public class d64 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f453707d;

    /* renamed from: e, reason: collision with root package name */
    public float f453708e;

    /* renamed from: f, reason: collision with root package name */
    public int f453709f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453710g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453711h;

    /* renamed from: i, reason: collision with root package name */
    public int f453712i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d64)) {
            return false;
        }
        r45.d64 d64Var = (r45.d64) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f453707d), java.lang.Float.valueOf(d64Var.f453707d)) && n51.f.a(java.lang.Float.valueOf(this.f453708e), java.lang.Float.valueOf(d64Var.f453708e)) && n51.f.a(java.lang.Integer.valueOf(this.f453709f), java.lang.Integer.valueOf(d64Var.f453709f)) && n51.f.a(this.f453710g, d64Var.f453710g) && n51.f.a(this.f453711h, d64Var.f453711h) && n51.f.a(java.lang.Integer.valueOf(this.f453712i), java.lang.Integer.valueOf(d64Var.f453712i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f453707d);
            fVar.d(2, this.f453708e);
            fVar.e(3, this.f453709f);
            java.lang.String str = this.f453710g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f453711h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f453712i);
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f453707d) + 0 + b36.f.d(2, this.f453708e) + b36.f.e(3, this.f453709f);
            java.lang.String str3 = this.f453710g;
            if (str3 != null) {
                d17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f453711h;
            if (str4 != null) {
                d17 += b36.f.j(5, str4);
            }
            return d17 + b36.f.e(6, this.f453712i);
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
        r45.d64 d64Var = (r45.d64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d64Var.f453707d = aVar2.f(intValue);
                return 0;
            case 2:
                d64Var.f453708e = aVar2.f(intValue);
                return 0;
            case 3:
                d64Var.f453709f = aVar2.g(intValue);
                return 0;
            case 4:
                d64Var.f453710g = aVar2.k(intValue);
                return 0;
            case 5:
                d64Var.f453711h = aVar2.k(intValue);
                return 0;
            case 6:
                d64Var.f453712i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
