package r45;

/* loaded from: classes2.dex */
public class zi6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f473654d;

    /* renamed from: e, reason: collision with root package name */
    public int f473655e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473656f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ne0 f473657g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ne0 f473658h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zi6)) {
            return false;
        }
        r45.zi6 zi6Var = (r45.zi6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473654d), java.lang.Integer.valueOf(zi6Var.f473654d)) && n51.f.a(java.lang.Integer.valueOf(this.f473655e), java.lang.Integer.valueOf(zi6Var.f473655e)) && n51.f.a(this.f473656f, zi6Var.f473656f) && n51.f.a(this.f473657g, zi6Var.f473657g) && n51.f.a(this.f473658h, zi6Var.f473658h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473654d);
            fVar.e(2, this.f473655e);
            java.lang.String str = this.f473656f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.ne0 ne0Var = this.f473657g;
            if (ne0Var != null) {
                fVar.i(4, ne0Var.mo75928xcd1e8d8());
                this.f473657g.mo75956x3d5d1f78(fVar);
            }
            r45.ne0 ne0Var2 = this.f473658h;
            if (ne0Var2 != null) {
                fVar.i(5, ne0Var2.mo75928xcd1e8d8());
                this.f473658h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f473654d) + 0 + b36.f.e(2, this.f473655e);
            java.lang.String str2 = this.f473656f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            r45.ne0 ne0Var3 = this.f473657g;
            if (ne0Var3 != null) {
                e17 += b36.f.i(4, ne0Var3.mo75928xcd1e8d8());
            }
            r45.ne0 ne0Var4 = this.f473658h;
            return ne0Var4 != null ? e17 + b36.f.i(5, ne0Var4.mo75928xcd1e8d8()) : e17;
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
        r45.zi6 zi6Var = (r45.zi6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zi6Var.f473654d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            zi6Var.f473655e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            zi6Var.f473656f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ne0 ne0Var5 = new r45.ne0();
                if (bArr != null && bArr.length > 0) {
                    ne0Var5.mo11468x92b714fd(bArr);
                }
                zi6Var.f473657g = ne0Var5;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.ne0 ne0Var6 = new r45.ne0();
            if (bArr2 != null && bArr2.length > 0) {
                ne0Var6.mo11468x92b714fd(bArr2);
            }
            zi6Var.f473658h = ne0Var6;
        }
        return 0;
    }
}
