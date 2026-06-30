package r45;

/* loaded from: classes9.dex */
public class de4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453882d;

    /* renamed from: e, reason: collision with root package name */
    public int f453883e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453884f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453885g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453886h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.de4)) {
            return false;
        }
        r45.de4 de4Var = (r45.de4) fVar;
        return n51.f.a(this.f453882d, de4Var.f453882d) && n51.f.a(java.lang.Integer.valueOf(this.f453883e), java.lang.Integer.valueOf(de4Var.f453883e)) && n51.f.a(this.f453884f, de4Var.f453884f) && n51.f.a(this.f453885g, de4Var.f453885g) && n51.f.a(this.f453886h, de4Var.f453886h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453882d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f453883e);
            java.lang.String str2 = this.f453884f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f453885g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f453886h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f453882d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f453883e);
            java.lang.String str6 = this.f453884f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f453885g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f453886h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        r45.de4 de4Var = (r45.de4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            de4Var.f453882d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            de4Var.f453883e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            de4Var.f453884f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            de4Var.f453885g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        de4Var.f453886h = aVar2.k(intValue);
        return 0;
    }
}
