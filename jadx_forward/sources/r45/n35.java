package r45;

/* loaded from: classes8.dex */
public class n35 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462587d;

    /* renamed from: e, reason: collision with root package name */
    public int f462588e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462589f;

    /* renamed from: g, reason: collision with root package name */
    public int f462590g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f462591h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462592i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f462593m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f462594n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n35)) {
            return false;
        }
        r45.n35 n35Var = (r45.n35) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462587d), java.lang.Integer.valueOf(n35Var.f462587d)) && n51.f.a(java.lang.Integer.valueOf(this.f462588e), java.lang.Integer.valueOf(n35Var.f462588e)) && n51.f.a(this.f462589f, n35Var.f462589f) && n51.f.a(java.lang.Integer.valueOf(this.f462590g), java.lang.Integer.valueOf(n35Var.f462590g)) && n51.f.a(this.f462591h, n35Var.f462591h) && n51.f.a(this.f462592i, n35Var.f462592i) && n51.f.a(this.f462593m, n35Var.f462593m) && n51.f.a(this.f462594n, n35Var.f462594n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462587d);
            fVar.e(2, this.f462588e);
            java.lang.String str = this.f462589f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f462590g);
            r45.cu5 cu5Var = this.f462591h;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f462591h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f462592i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.cu5 cu5Var2 = this.f462593m;
            if (cu5Var2 != null) {
                fVar.i(7, cu5Var2.mo75928xcd1e8d8());
                this.f462593m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f462594n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462587d) + 0 + b36.f.e(2, this.f462588e);
            java.lang.String str4 = this.f462589f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int e18 = e17 + b36.f.e(4, this.f462590g);
            r45.cu5 cu5Var3 = this.f462591h;
            if (cu5Var3 != null) {
                e18 += b36.f.i(5, cu5Var3.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f462592i;
            if (str5 != null) {
                e18 += b36.f.j(6, str5);
            }
            r45.cu5 cu5Var4 = this.f462593m;
            if (cu5Var4 != null) {
                e18 += b36.f.i(7, cu5Var4.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f462594n;
            return str6 != null ? e18 + b36.f.j(8, str6) : e18;
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
        r45.n35 n35Var = (r45.n35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n35Var.f462587d = aVar2.g(intValue);
                return 0;
            case 2:
                n35Var.f462588e = aVar2.g(intValue);
                return 0;
            case 3:
                n35Var.f462589f = aVar2.k(intValue);
                return 0;
            case 4:
                n35Var.f462590g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var5.b(bArr);
                    }
                    n35Var.f462591h = cu5Var5;
                }
                return 0;
            case 6:
                n35Var.f462592i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var6.b(bArr2);
                    }
                    n35Var.f462593m = cu5Var6;
                }
                return 0;
            case 8:
                n35Var.f462594n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
