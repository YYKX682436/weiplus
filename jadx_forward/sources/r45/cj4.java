package r45;

/* loaded from: classes4.dex */
public class cj4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453128d;

    /* renamed from: e, reason: collision with root package name */
    public int f453129e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453130f;

    /* renamed from: g, reason: collision with root package name */
    public r45.lj4 f453131g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cj4)) {
            return false;
        }
        r45.cj4 cj4Var = (r45.cj4) fVar;
        return n51.f.a(this.f453128d, cj4Var.f453128d) && n51.f.a(java.lang.Integer.valueOf(this.f453129e), java.lang.Integer.valueOf(cj4Var.f453129e)) && n51.f.a(this.f453130f, cj4Var.f453130f) && n51.f.a(this.f453131g, cj4Var.f453131g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453128d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f453129e);
            java.lang.String str2 = this.f453130f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.lj4 lj4Var = this.f453131g;
            if (lj4Var != null) {
                fVar.i(4, lj4Var.mo75928xcd1e8d8());
                this.f453131g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f453128d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f453129e);
            java.lang.String str4 = this.f453130f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            r45.lj4 lj4Var2 = this.f453131g;
            return lj4Var2 != null ? j17 + b36.f.i(4, lj4Var2.mo75928xcd1e8d8()) : j17;
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
        r45.cj4 cj4Var = (r45.cj4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cj4Var.f453128d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            cj4Var.f453129e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            cj4Var.f453130f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.lj4 lj4Var3 = new r45.lj4();
            if (bArr != null && bArr.length > 0) {
                lj4Var3.mo11468x92b714fd(bArr);
            }
            cj4Var.f453131g = lj4Var3;
        }
        return 0;
    }
}
