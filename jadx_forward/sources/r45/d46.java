package r45;

/* loaded from: classes9.dex */
public class d46 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453642d;

    /* renamed from: e, reason: collision with root package name */
    public int f453643e;

    /* renamed from: f, reason: collision with root package name */
    public int f453644f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453645g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453646h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d46)) {
            return false;
        }
        r45.d46 d46Var = (r45.d46) fVar;
        return n51.f.a(this.f453642d, d46Var.f453642d) && n51.f.a(java.lang.Integer.valueOf(this.f453643e), java.lang.Integer.valueOf(d46Var.f453643e)) && n51.f.a(java.lang.Integer.valueOf(this.f453644f), java.lang.Integer.valueOf(d46Var.f453644f)) && n51.f.a(this.f453645g, d46Var.f453645g) && n51.f.a(this.f453646h, d46Var.f453646h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453642d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f453643e);
            fVar.e(3, this.f453644f);
            java.lang.String str2 = this.f453645g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f453646h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f453642d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f453643e) + b36.f.e(3, this.f453644f);
            java.lang.String str5 = this.f453645g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f453646h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
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
        r45.d46 d46Var = (r45.d46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d46Var.f453642d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            d46Var.f453643e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            d46Var.f453644f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            d46Var.f453645g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        d46Var.f453646h = aVar2.k(intValue);
        return 0;
    }
}
