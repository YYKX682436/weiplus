package bw5;

/* loaded from: classes9.dex */
public class n8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.k8 f112070d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112071e;

    /* renamed from: f, reason: collision with root package name */
    public int f112072f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112073g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112074h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f112075i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f112076m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f112077n = new boolean[8];

    static {
        new bw5.n8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n8)) {
            return false;
        }
        bw5.n8 n8Var = (bw5.n8) fVar;
        return n51.f.a(this.f112070d, n8Var.f112070d) && n51.f.a(this.f112071e, n8Var.f112071e) && n51.f.a(java.lang.Integer.valueOf(this.f112072f), java.lang.Integer.valueOf(n8Var.f112072f)) && n51.f.a(this.f112073g, n8Var.f112073g) && n51.f.a(this.f112074h, n8Var.f112074h) && n51.f.a(this.f112075i, n8Var.f112075i) && n51.f.a(java.lang.Boolean.valueOf(this.f112076m), java.lang.Boolean.valueOf(n8Var.f112076m));
    }

    /* renamed from: getErrMsg */
    public java.lang.String m12558x17ec12d2() {
        return this.f112077n[4] ? this.f112073g : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.n8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112077n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.k8 k8Var = this.f112070d;
            if (k8Var != null && zArr[1]) {
                fVar.e(1, k8Var.f110818d);
            }
            java.lang.String str = this.f112071e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f112072f);
            }
            java.lang.String str2 = this.f112073g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f112074h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f112075i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            if (zArr[7]) {
                fVar.a(7, this.f112076m);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.k8 k8Var2 = this.f112070d;
            if (k8Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, k8Var2.f110818d);
            }
            java.lang.String str4 = this.f112071e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f112072f);
            }
            java.lang.String str5 = this.f112073g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f112074h;
            if (str6 != null && zArr[5]) {
                i18 += b36.f.j(5, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f112075i;
            if (gVar2 != null && zArr[6]) {
                i18 += b36.f.b(6, gVar2);
            }
            return zArr[7] ? i18 + b36.f.a(7, this.f112076m) : i18;
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
                this.f112070d = bw5.k8.a(aVar2.g(intValue));
                zArr[1] = true;
                return 0;
            case 2:
                this.f112071e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112072f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112073g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112074h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112075i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112076m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.n8) super.mo11468x92b714fd(bArr);
    }
}
