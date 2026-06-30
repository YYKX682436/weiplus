package bw5;

/* loaded from: classes11.dex */
public class l20 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111143d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.f20 f111144e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111145f;

    /* renamed from: g, reason: collision with root package name */
    public int f111146g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.g20 f111147h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.m20 f111148i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f111149m = new boolean[7];

    static {
        new bw5.l20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l20)) {
            return false;
        }
        bw5.l20 l20Var = (bw5.l20) fVar;
        return n51.f.a(this.f111143d, l20Var.f111143d) && n51.f.a(this.f111144e, l20Var.f111144e) && n51.f.a(this.f111145f, l20Var.f111145f) && n51.f.a(java.lang.Integer.valueOf(this.f111146g), java.lang.Integer.valueOf(l20Var.f111146g)) && n51.f.a(this.f111147h, l20Var.f111147h) && n51.f.a(this.f111148i, l20Var.f111148i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.l20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111149m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111143d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.f20 f20Var = this.f111144e;
            if (f20Var != null && zArr[2]) {
                fVar.e(2, f20Var.f108661d);
            }
            java.lang.String str2 = this.f111145f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f111146g);
            }
            bw5.g20 g20Var = this.f111147h;
            if (g20Var != null && zArr[5]) {
                fVar.i(5, g20Var.mo75928xcd1e8d8());
                this.f111147h.mo75956x3d5d1f78(fVar);
            }
            bw5.m20 m20Var = this.f111148i;
            if (m20Var != null && zArr[6]) {
                fVar.e(6, m20Var.f111591d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f111143d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.f20 f20Var2 = this.f111144e;
            if (f20Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, f20Var2.f108661d);
            }
            java.lang.String str4 = this.f111145f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f111146g);
            }
            bw5.g20 g20Var2 = this.f111147h;
            if (g20Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, g20Var2.mo75928xcd1e8d8());
            }
            bw5.m20 m20Var2 = this.f111148i;
            return (m20Var2 == null || !zArr[6]) ? i18 : i18 + b36.f.e(6, m20Var2.f111591d);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f111143d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111144e = bw5.f20.a(aVar2.g(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                this.f111145f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111146g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.g20 g20Var3 = new bw5.g20();
                    if (bArr != null && bArr.length > 0) {
                        g20Var3.mo11468x92b714fd(bArr);
                    }
                    this.f111147h = g20Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                int g17 = aVar2.g(intValue);
                this.f111148i = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.m20.HybridRouterPageStatePageDisappear : bw5.m20.HybridRouterPageStatePageAppear : bw5.m20.HybridRouterPageStatePageExit : bw5.m20.HybridRouterPageStatePageEnter : bw5.m20.HybridRouterPageStateDefault;
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.l20) super.mo11468x92b714fd(bArr);
    }
}
