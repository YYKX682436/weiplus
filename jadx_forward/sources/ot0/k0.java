package ot0;

/* loaded from: classes2.dex */
public class k0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f430092d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f430093e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f430094f;

    /* renamed from: g, reason: collision with root package name */
    public ot0.j0 f430095g;

    /* renamed from: h, reason: collision with root package name */
    public ot0.i0 f430096h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f430097i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ot0.k0)) {
            return false;
        }
        ot0.k0 k0Var = (ot0.k0) fVar;
        return n51.f.a(this.f430092d, k0Var.f430092d) && n51.f.a(this.f430093e, k0Var.f430093e) && n51.f.a(this.f430094f, k0Var.f430094f) && n51.f.a(this.f430095g, k0Var.f430095g) && n51.f.a(this.f430096h, k0Var.f430096h) && n51.f.a(this.f430097i, k0Var.f430097i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f430092d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f430093e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f430094f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            ot0.j0 j0Var = this.f430095g;
            if (j0Var != null) {
                fVar.i(4, j0Var.mo75928xcd1e8d8());
                this.f430095g.mo75956x3d5d1f78(fVar);
            }
            ot0.i0 i0Var = this.f430096h;
            if (i0Var != null) {
                fVar.i(5, i0Var.mo75928xcd1e8d8());
                this.f430096h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f430097i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f430092d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f430093e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f430094f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            ot0.j0 j0Var2 = this.f430095g;
            if (j0Var2 != null) {
                j17 += b36.f.i(4, j0Var2.mo75928xcd1e8d8());
            }
            ot0.i0 i0Var2 = this.f430096h;
            if (i0Var2 != null) {
                j17 += b36.f.i(5, i0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f430097i;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        ot0.k0 k0Var = (ot0.k0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k0Var.f430092d = aVar2.k(intValue);
                return 0;
            case 2:
                k0Var.f430093e = aVar2.k(intValue);
                return 0;
            case 3:
                k0Var.f430094f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    ot0.j0 j0Var3 = new ot0.j0();
                    if (bArr != null && bArr.length > 0) {
                        j0Var3.mo11468x92b714fd(bArr);
                    }
                    k0Var.f430095g = j0Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    ot0.i0 i0Var3 = new ot0.i0();
                    if (bArr2 != null && bArr2.length > 0) {
                        i0Var3.mo11468x92b714fd(bArr2);
                    }
                    k0Var.f430096h = i0Var3;
                }
                return 0;
            case 6:
                k0Var.f430097i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
