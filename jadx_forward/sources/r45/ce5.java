package r45;

/* loaded from: classes2.dex */
public class ce5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453038d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453039e;

    /* renamed from: f, reason: collision with root package name */
    public int f453040f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453041g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453042h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ce5)) {
            return false;
        }
        r45.ce5 ce5Var = (r45.ce5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453038d), java.lang.Integer.valueOf(ce5Var.f453038d)) && n51.f.a(this.f453039e, ce5Var.f453039e) && n51.f.a(java.lang.Integer.valueOf(this.f453040f), java.lang.Integer.valueOf(ce5Var.f453040f)) && n51.f.a(this.f453041g, ce5Var.f453041g) && n51.f.a(this.f453042h, ce5Var.f453042h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453038d);
            java.lang.String str = this.f453039e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f453040f);
            java.lang.String str2 = this.f453041g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f453042h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453038d) + 0;
            java.lang.String str4 = this.f453039e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int e18 = e17 + b36.f.e(3, this.f453040f);
            java.lang.String str5 = this.f453041g;
            if (str5 != null) {
                e18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f453042h;
            return str6 != null ? e18 + b36.f.j(5, str6) : e18;
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
        r45.ce5 ce5Var = (r45.ce5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ce5Var.f453038d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ce5Var.f453039e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ce5Var.f453040f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ce5Var.f453041g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ce5Var.f453042h = aVar2.k(intValue);
        return 0;
    }
}
