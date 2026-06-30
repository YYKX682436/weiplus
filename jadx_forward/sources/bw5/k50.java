package bw5;

/* loaded from: classes2.dex */
public class k50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110786d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f110787e;

    /* renamed from: f, reason: collision with root package name */
    public int f110788f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110789g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f110790h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f110791i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f110792m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f110793n = new boolean[8];

    static {
        new bw5.k50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k50 mo11468x92b714fd(byte[] bArr) {
        return (bw5.k50) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k50)) {
            return false;
        }
        bw5.k50 k50Var = (bw5.k50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110786d), java.lang.Integer.valueOf(k50Var.f110786d)) && n51.f.a(java.lang.Boolean.valueOf(this.f110787e), java.lang.Boolean.valueOf(k50Var.f110787e)) && n51.f.a(java.lang.Integer.valueOf(this.f110788f), java.lang.Integer.valueOf(k50Var.f110788f)) && n51.f.a(this.f110789g, k50Var.f110789g) && n51.f.a(java.lang.Boolean.valueOf(this.f110790h), java.lang.Boolean.valueOf(k50Var.f110790h)) && n51.f.a(java.lang.Boolean.valueOf(this.f110791i), java.lang.Boolean.valueOf(k50Var.f110791i)) && n51.f.a(this.f110792m, k50Var.f110792m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.k50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110793n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110786d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f110787e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f110788f);
            }
            java.lang.String str = this.f110789g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.a(5, this.f110790h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f110791i);
            }
            java.lang.String str2 = this.f110792m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f110786d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f110787e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f110788f);
            }
            java.lang.String str3 = this.f110789g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            if (zArr[5]) {
                e17 += b36.f.a(5, this.f110790h);
            }
            if (zArr[6]) {
                e17 += b36.f.a(6, this.f110791i);
            }
            java.lang.String str4 = this.f110792m;
            return (str4 == null || !zArr[7]) ? e17 : e17 + b36.f.j(7, str4);
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
                this.f110786d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110787e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110788f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110789g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110790h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110791i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f110792m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
