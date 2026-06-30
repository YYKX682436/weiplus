package r45;

/* loaded from: classes9.dex */
public class oo5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463931d;

    /* renamed from: e, reason: collision with root package name */
    public r45.n34 f463932e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n34 f463933f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oo5)) {
            return false;
        }
        r45.oo5 oo5Var = (r45.oo5) fVar;
        return n51.f.a(this.f463931d, oo5Var.f463931d) && n51.f.a(this.f463932e, oo5Var.f463932e) && n51.f.a(this.f463933f, oo5Var.f463933f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463931d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.n34 n34Var = this.f463932e;
            if (n34Var != null) {
                fVar.i(2, n34Var.mo75928xcd1e8d8());
                this.f463932e.mo75956x3d5d1f78(fVar);
            }
            r45.n34 n34Var2 = this.f463933f;
            if (n34Var2 != null) {
                fVar.i(3, n34Var2.mo75928xcd1e8d8());
                this.f463933f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f463931d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.n34 n34Var3 = this.f463932e;
            if (n34Var3 != null) {
                j17 += b36.f.i(2, n34Var3.mo75928xcd1e8d8());
            }
            r45.n34 n34Var4 = this.f463933f;
            return n34Var4 != null ? j17 + b36.f.i(3, n34Var4.mo75928xcd1e8d8()) : j17;
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
        r45.oo5 oo5Var = (r45.oo5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            oo5Var.f463931d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.n34 n34Var5 = new r45.n34();
                if (bArr != null && bArr.length > 0) {
                    n34Var5.mo11468x92b714fd(bArr);
                }
                oo5Var.f463932e = n34Var5;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.n34 n34Var6 = new r45.n34();
            if (bArr2 != null && bArr2.length > 0) {
                n34Var6.mo11468x92b714fd(bArr2);
            }
            oo5Var.f463933f = n34Var6;
        }
        return 0;
    }
}
