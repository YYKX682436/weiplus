package r45;

/* loaded from: classes2.dex */
public class da5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453802d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453803e;

    /* renamed from: f, reason: collision with root package name */
    public int f453804f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453805g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453806h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.da5)) {
            return false;
        }
        r45.da5 da5Var = (r45.da5) fVar;
        return n51.f.a(this.f453802d, da5Var.f453802d) && n51.f.a(this.f453803e, da5Var.f453803e) && n51.f.a(java.lang.Integer.valueOf(this.f453804f), java.lang.Integer.valueOf(da5Var.f453804f)) && n51.f.a(this.f453805g, da5Var.f453805g) && n51.f.a(this.f453806h, da5Var.f453806h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453802d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f453803e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f453804f);
            java.lang.String str3 = this.f453805g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f453806h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f453802d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f453803e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f453804f);
            java.lang.String str7 = this.f453805g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f453806h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.da5 da5Var = (r45.da5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            da5Var.f453802d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            da5Var.f453803e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            da5Var.f453804f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            da5Var.f453805g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        da5Var.f453806h = aVar2.k(intValue);
        return 0;
    }
}
