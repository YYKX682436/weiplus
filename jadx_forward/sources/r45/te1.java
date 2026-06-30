package r45;

/* loaded from: classes2.dex */
public class te1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467877d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467878e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f467879f;

    /* renamed from: g, reason: collision with root package name */
    public int f467880g;

    /* renamed from: h, reason: collision with root package name */
    public int f467881h;

    /* renamed from: i, reason: collision with root package name */
    public long f467882i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.te1)) {
            return false;
        }
        r45.te1 te1Var = (r45.te1) fVar;
        return n51.f.a(this.f467877d, te1Var.f467877d) && n51.f.a(this.f467878e, te1Var.f467878e) && n51.f.a(this.f467879f, te1Var.f467879f) && n51.f.a(java.lang.Integer.valueOf(this.f467880g), java.lang.Integer.valueOf(te1Var.f467880g)) && n51.f.a(java.lang.Integer.valueOf(this.f467881h), java.lang.Integer.valueOf(te1Var.f467881h)) && n51.f.a(java.lang.Long.valueOf(this.f467882i), java.lang.Long.valueOf(te1Var.f467882i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467877d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467878e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f467879f;
            if (c19782x23db1cfa != null) {
                fVar.i(3, c19782x23db1cfa.mo75928xcd1e8d8());
                this.f467879f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f467880g);
            fVar.e(5, this.f467881h);
            fVar.h(6, this.f467882i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f467877d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f467878e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = this.f467879f;
            if (c19782x23db1cfa2 != null) {
                j17 += b36.f.i(3, c19782x23db1cfa2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.e(4, this.f467880g) + b36.f.e(5, this.f467881h) + b36.f.h(6, this.f467882i);
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
        r45.te1 te1Var = (r45.te1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                te1Var.f467877d = aVar2.k(intValue);
                return 0;
            case 2:
                te1Var.f467878e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
                    if (bArr != null && bArr.length > 0) {
                        c19782x23db1cfa3.mo11468x92b714fd(bArr);
                    }
                    te1Var.f467879f = c19782x23db1cfa3;
                }
                return 0;
            case 4:
                te1Var.f467880g = aVar2.g(intValue);
                return 0;
            case 5:
                te1Var.f467881h = aVar2.g(intValue);
                return 0;
            case 6:
                te1Var.f467882i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
