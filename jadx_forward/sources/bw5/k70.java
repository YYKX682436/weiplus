package bw5;

/* loaded from: classes8.dex */
public class k70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110805d;

    /* renamed from: e, reason: collision with root package name */
    public int f110806e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110807f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f110808g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f110809h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f110810i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.xa0 f110811m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f110812n = new boolean[14];

    static {
        new bw5.k70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k70 mo11468x92b714fd(byte[] bArr) {
        return (bw5.k70) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k70)) {
            return false;
        }
        bw5.k70 k70Var = (bw5.k70) fVar;
        return n51.f.a(this.f110805d, k70Var.f110805d) && n51.f.a(java.lang.Integer.valueOf(this.f110806e), java.lang.Integer.valueOf(k70Var.f110806e)) && n51.f.a(this.f110807f, k70Var.f110807f) && n51.f.a(java.lang.Boolean.valueOf(this.f110808g), java.lang.Boolean.valueOf(k70Var.f110808g)) && n51.f.a(java.lang.Boolean.valueOf(this.f110809h), java.lang.Boolean.valueOf(k70Var.f110809h)) && n51.f.a(java.lang.Boolean.valueOf(this.f110810i), java.lang.Boolean.valueOf(k70Var.f110810i)) && n51.f.a(this.f110811m, k70Var.f110811m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.k70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110812n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110805d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f110806e);
            }
            java.lang.String str2 = this.f110807f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[5]) {
                fVar.a(5, this.f110808g);
            }
            if (zArr[11]) {
                fVar.a(11, this.f110809h);
            }
            if (zArr[12]) {
                fVar.a(12, this.f110810i);
            }
            bw5.xa0 xa0Var = this.f110811m;
            if (xa0Var != null && zArr[13]) {
                fVar.i(13, xa0Var.mo75928xcd1e8d8());
                this.f110811m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f110805d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f110806e);
            }
            java.lang.String str4 = this.f110807f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f110808g);
            }
            if (zArr[11]) {
                i18 += b36.f.a(11, this.f110809h);
            }
            if (zArr[12]) {
                i18 += b36.f.a(12, this.f110810i);
            }
            bw5.xa0 xa0Var2 = this.f110811m;
            return (xa0Var2 == null || !zArr[13]) ? i18 : i18 + b36.f.i(13, xa0Var2.mo75928xcd1e8d8());
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
            this.f110805d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110806e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f110807f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 5) {
            this.f110808g = aVar2.c(intValue);
            zArr[5] = true;
            return 0;
        }
        switch (intValue) {
            case 11:
                this.f110809h = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f110810i = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr != null && bArr.length > 0) {
                        xa0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f110811m = xa0Var3;
                }
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
