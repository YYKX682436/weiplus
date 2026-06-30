package r45;

/* loaded from: classes2.dex */
public class yf2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f472567d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472568e;

    /* renamed from: f, reason: collision with root package name */
    public int f472569f;

    /* renamed from: g, reason: collision with root package name */
    public long f472570g;

    /* renamed from: h, reason: collision with root package name */
    public r45.fz2 f472571h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yf2)) {
            return false;
        }
        r45.yf2 yf2Var = (r45.yf2) fVar;
        return n51.f.a(this.f472567d, yf2Var.f472567d) && n51.f.a(this.f472568e, yf2Var.f472568e) && n51.f.a(java.lang.Integer.valueOf(this.f472569f), java.lang.Integer.valueOf(yf2Var.f472569f)) && n51.f.a(java.lang.Long.valueOf(this.f472570g), java.lang.Long.valueOf(yf2Var.f472570g)) && n51.f.a(this.f472571h, yf2Var.f472571h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f472567d;
            if (c19782x23db1cfa != null) {
                fVar.i(1, c19782x23db1cfa.mo75928xcd1e8d8());
                this.f472567d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f472568e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f472569f);
            fVar.h(4, this.f472570g);
            r45.fz2 fz2Var = this.f472571h;
            if (fz2Var != null) {
                fVar.i(5, fz2Var.mo75928xcd1e8d8());
                this.f472571h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = this.f472567d;
            int i18 = c19782x23db1cfa2 != null ? 0 + b36.f.i(1, c19782x23db1cfa2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f472568e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f472569f) + b36.f.h(4, this.f472570g);
            r45.fz2 fz2Var2 = this.f472571h;
            return fz2Var2 != null ? e17 + b36.f.i(5, fz2Var2.mo75928xcd1e8d8()) : e17;
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
        r45.yf2 yf2Var = (r45.yf2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
                if (bArr != null && bArr.length > 0) {
                    c19782x23db1cfa3.mo11468x92b714fd(bArr);
                }
                yf2Var.f472567d = c19782x23db1cfa3;
            }
            return 0;
        }
        if (intValue == 2) {
            yf2Var.f472568e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            yf2Var.f472569f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            yf2Var.f472570g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.fz2 fz2Var3 = new r45.fz2();
            if (bArr2 != null && bArr2.length > 0) {
                fz2Var3.mo11468x92b714fd(bArr2);
            }
            yf2Var.f472571h = fz2Var3;
        }
        return 0;
    }
}
