package r45;

/* loaded from: classes4.dex */
public class l76 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f460736d;

    /* renamed from: e, reason: collision with root package name */
    public long f460737e;

    /* renamed from: f, reason: collision with root package name */
    public r45.k76 f460738f;

    /* renamed from: g, reason: collision with root package name */
    public r45.k76 f460739g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460740h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l76)) {
            return false;
        }
        r45.l76 l76Var = (r45.l76) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f460736d), java.lang.Long.valueOf(l76Var.f460736d)) && n51.f.a(java.lang.Long.valueOf(this.f460737e), java.lang.Long.valueOf(l76Var.f460737e)) && n51.f.a(this.f460738f, l76Var.f460738f) && n51.f.a(this.f460739g, l76Var.f460739g) && n51.f.a(this.f460740h, l76Var.f460740h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f460736d);
            fVar.h(2, this.f460737e);
            r45.k76 k76Var = this.f460738f;
            if (k76Var != null) {
                fVar.i(3, k76Var.mo75928xcd1e8d8());
                this.f460738f.mo75956x3d5d1f78(fVar);
            }
            r45.k76 k76Var2 = this.f460739g;
            if (k76Var2 != null) {
                fVar.i(4, k76Var2.mo75928xcd1e8d8());
                this.f460739g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f460740h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f460736d) + 0 + b36.f.h(2, this.f460737e);
            r45.k76 k76Var3 = this.f460738f;
            if (k76Var3 != null) {
                h17 += b36.f.i(3, k76Var3.mo75928xcd1e8d8());
            }
            r45.k76 k76Var4 = this.f460739g;
            if (k76Var4 != null) {
                h17 += b36.f.i(4, k76Var4.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f460740h;
            return str2 != null ? h17 + b36.f.j(5, str2) : h17;
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
        r45.l76 l76Var = (r45.l76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l76Var.f460736d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            l76Var.f460737e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.k76 k76Var5 = new r45.k76();
                if (bArr != null && bArr.length > 0) {
                    k76Var5.mo11468x92b714fd(bArr);
                }
                l76Var.f460738f = k76Var5;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            l76Var.f460740h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.k76 k76Var6 = new r45.k76();
            if (bArr2 != null && bArr2.length > 0) {
                k76Var6.mo11468x92b714fd(bArr2);
            }
            l76Var.f460739g = k76Var6;
        }
        return 0;
    }
}
