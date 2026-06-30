package t45;

/* loaded from: classes2.dex */
public class i extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f497121d;

    /* renamed from: e, reason: collision with root package name */
    public t45.l0 f497122e;

    /* renamed from: f, reason: collision with root package name */
    public t45.n0 f497123f;

    /* renamed from: g, reason: collision with root package name */
    public long f497124g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.i)) {
            return false;
        }
        t45.i iVar = (t45.i) fVar;
        return n51.f.a(this.f497121d, iVar.f497121d) && n51.f.a(this.f497122e, iVar.f497122e) && n51.f.a(this.f497123f, iVar.f497123f) && n51.f.a(java.lang.Long.valueOf(this.f497124g), java.lang.Long.valueOf(iVar.f497124g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f497121d;
            if (str != null) {
                fVar.j(1, str);
            }
            t45.l0 l0Var = this.f497122e;
            if (l0Var != null) {
                fVar.i(2, l0Var.mo75928xcd1e8d8());
                this.f497122e.mo75956x3d5d1f78(fVar);
            }
            t45.n0 n0Var = this.f497123f;
            if (n0Var != null) {
                fVar.i(3, n0Var.mo75928xcd1e8d8());
                this.f497123f.mo75956x3d5d1f78(fVar);
            }
            fVar.h(4, this.f497124g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f497121d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            t45.l0 l0Var2 = this.f497122e;
            if (l0Var2 != null) {
                j17 += b36.f.i(2, l0Var2.mo75928xcd1e8d8());
            }
            t45.n0 n0Var2 = this.f497123f;
            if (n0Var2 != null) {
                j17 += b36.f.i(3, n0Var2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.h(4, this.f497124g);
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
        t45.i iVar = (t45.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iVar.f497121d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                t45.l0 l0Var3 = new t45.l0();
                if (bArr != null && bArr.length > 0) {
                    l0Var3.mo11468x92b714fd(bArr);
                }
                iVar.f497122e = l0Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            iVar.f497124g = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            t45.n0 n0Var3 = new t45.n0();
            if (bArr2 != null && bArr2.length > 0) {
                n0Var3.mo11468x92b714fd(bArr2);
            }
            iVar.f497123f = n0Var3;
        }
        return 0;
    }
}
