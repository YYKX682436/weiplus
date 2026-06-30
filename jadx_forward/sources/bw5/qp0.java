package bw5;

/* loaded from: classes2.dex */
public class qp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113748d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.mb0 f113749e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113750f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f113751g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f113752h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f113753i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f113754m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f113755n = new boolean[8];

    static {
        new bw5.qp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qp0)) {
            return false;
        }
        bw5.qp0 qp0Var = (bw5.qp0) fVar;
        return n51.f.a(this.f113748d, qp0Var.f113748d) && n51.f.a(this.f113749e, qp0Var.f113749e) && n51.f.a(this.f113750f, qp0Var.f113750f) && n51.f.a(java.lang.Boolean.valueOf(this.f113751g), java.lang.Boolean.valueOf(qp0Var.f113751g)) && n51.f.a(java.lang.Boolean.valueOf(this.f113752h), java.lang.Boolean.valueOf(qp0Var.f113752h)) && n51.f.a(java.lang.Boolean.valueOf(this.f113753i), java.lang.Boolean.valueOf(qp0Var.f113753i)) && n51.f.a(java.lang.Boolean.valueOf(this.f113754m), java.lang.Boolean.valueOf(qp0Var.f113754m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f113755n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113748d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.mb0 mb0Var = this.f113749e;
            if (mb0Var != null && zArr[2]) {
                fVar.i(2, mb0Var.mo75928xcd1e8d8());
                this.f113749e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f113750f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f113751g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f113752h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f113753i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f113754m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f113748d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.mb0 mb0Var2 = this.f113749e;
            if (mb0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, mb0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f113750f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f113751g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f113752h);
            }
            if (zArr[6]) {
                i18 += b36.f.a(6, this.f113753i);
            }
            return zArr[7] ? i18 + b36.f.a(7, this.f113754m) : i18;
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
                this.f113748d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mb0 mb0Var3 = new bw5.mb0();
                    if (bArr != null && bArr.length > 0) {
                        mb0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f113749e = mb0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f113750f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113751g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113752h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113753i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113754m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.qp0) super.mo11468x92b714fd(bArr);
    }
}
