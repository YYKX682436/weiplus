package r45;

/* loaded from: classes9.dex */
public class b20 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451975d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451976e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n34 f451977f;

    /* renamed from: g, reason: collision with root package name */
    public r45.n34 f451978g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451979h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451980i;

    /* renamed from: m, reason: collision with root package name */
    public int f451981m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b20)) {
            return false;
        }
        r45.b20 b20Var = (r45.b20) fVar;
        return n51.f.a(this.f451975d, b20Var.f451975d) && n51.f.a(this.f451976e, b20Var.f451976e) && n51.f.a(this.f451977f, b20Var.f451977f) && n51.f.a(this.f451978g, b20Var.f451978g) && n51.f.a(this.f451979h, b20Var.f451979h) && n51.f.a(this.f451980i, b20Var.f451980i) && n51.f.a(java.lang.Integer.valueOf(this.f451981m), java.lang.Integer.valueOf(b20Var.f451981m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451975d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f451976e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.n34 n34Var = this.f451977f;
            if (n34Var != null) {
                fVar.i(3, n34Var.mo75928xcd1e8d8());
                this.f451977f.mo75956x3d5d1f78(fVar);
            }
            r45.n34 n34Var2 = this.f451978g;
            if (n34Var2 != null) {
                fVar.i(4, n34Var2.mo75928xcd1e8d8());
                this.f451978g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f451979h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f451980i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f451981m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f451975d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f451976e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            r45.n34 n34Var3 = this.f451977f;
            if (n34Var3 != null) {
                j17 += b36.f.i(3, n34Var3.mo75928xcd1e8d8());
            }
            r45.n34 n34Var4 = this.f451978g;
            if (n34Var4 != null) {
                j17 += b36.f.i(4, n34Var4.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f451979h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f451980i;
            if (str8 != null) {
                j17 += b36.f.j(6, str8);
            }
            return j17 + b36.f.e(7, this.f451981m);
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
        r45.b20 b20Var = (r45.b20) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b20Var.f451975d = aVar2.k(intValue);
                return 0;
            case 2:
                b20Var.f451976e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.n34 n34Var5 = new r45.n34();
                    if (bArr != null && bArr.length > 0) {
                        n34Var5.mo11468x92b714fd(bArr);
                    }
                    b20Var.f451977f = n34Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.n34 n34Var6 = new r45.n34();
                    if (bArr2 != null && bArr2.length > 0) {
                        n34Var6.mo11468x92b714fd(bArr2);
                    }
                    b20Var.f451978g = n34Var6;
                }
                return 0;
            case 5:
                b20Var.f451979h = aVar2.k(intValue);
                return 0;
            case 6:
                b20Var.f451980i = aVar2.k(intValue);
                return 0;
            case 7:
                b20Var.f451981m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
