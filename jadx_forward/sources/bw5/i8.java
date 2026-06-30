package bw5;

/* loaded from: classes9.dex */
public class i8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.k8 f110025d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110026e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110027f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f110028g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f110029h = new boolean[5];

    static {
        new bw5.i8();
    }

    public java.lang.String b() {
        return this.f110029h[3] ? this.f110027f : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i8)) {
            return false;
        }
        bw5.i8 i8Var = (bw5.i8) fVar;
        return n51.f.a(this.f110025d, i8Var.f110025d) && n51.f.a(this.f110026e, i8Var.f110026e) && n51.f.a(this.f110027f, i8Var.f110027f) && n51.f.a(this.f110028g, i8Var.f110028g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.i8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110029h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.k8 k8Var = this.f110025d;
            if (k8Var != null && zArr[1]) {
                fVar.e(1, k8Var.f110818d);
            }
            java.lang.String str = this.f110026e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f110027f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f110028g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.k8 k8Var2 = this.f110025d;
            if (k8Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, k8Var2.f110818d);
            }
            java.lang.String str3 = this.f110026e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f110027f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f110028g;
            return (gVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.b(4, gVar2);
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
        if (intValue == 1) {
            this.f110025d = bw5.k8.a(aVar2.g(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110026e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f110027f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f110028g = aVar2.d(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.i8) super.mo11468x92b714fd(bArr);
    }
}
