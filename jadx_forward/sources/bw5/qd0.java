package bw5;

/* loaded from: classes2.dex */
public class qd0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f113581d;

    /* renamed from: e, reason: collision with root package name */
    public long f113582e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113583f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.pd0 f113584g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f113585h;

    /* renamed from: i, reason: collision with root package name */
    public long f113586i;

    /* renamed from: m, reason: collision with root package name */
    public int f113587m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f113588n = new boolean[8];

    static {
        new bw5.qd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qd0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.qd0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qd0)) {
            return false;
        }
        bw5.qd0 qd0Var = (bw5.qd0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f113581d), java.lang.Long.valueOf(qd0Var.f113581d)) && n51.f.a(java.lang.Long.valueOf(this.f113582e), java.lang.Long.valueOf(qd0Var.f113582e)) && n51.f.a(this.f113583f, qd0Var.f113583f) && n51.f.a(this.f113584g, qd0Var.f113584g) && n51.f.a(java.lang.Boolean.valueOf(this.f113585h), java.lang.Boolean.valueOf(qd0Var.f113585h)) && n51.f.a(java.lang.Long.valueOf(this.f113586i), java.lang.Long.valueOf(qd0Var.f113586i)) && n51.f.a(java.lang.Integer.valueOf(this.f113587m), java.lang.Integer.valueOf(qd0Var.f113587m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113588n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f113581d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f113582e);
            }
            java.lang.String str = this.f113583f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.pd0 pd0Var = this.f113584g;
            if (pd0Var != null && zArr[4]) {
                fVar.i(4, pd0Var.mo75928xcd1e8d8());
                this.f113584g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.a(5, this.f113585h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f113586i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f113587m);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f113581d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f113582e);
            }
            java.lang.String str2 = this.f113583f;
            if (str2 != null && zArr[3]) {
                h17 += b36.f.j(3, str2);
            }
            bw5.pd0 pd0Var2 = this.f113584g;
            if (pd0Var2 != null && zArr[4]) {
                h17 += b36.f.i(4, pd0Var2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f113585h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f113586i);
            }
            return zArr[7] ? h17 + b36.f.e(7, this.f113587m) : h17;
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
                this.f113581d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113582e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113583f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.pd0 pd0Var3 = new bw5.pd0();
                    if (bArr != null && bArr.length > 0) {
                        pd0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f113584g = pd0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f113585h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113586i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113587m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
