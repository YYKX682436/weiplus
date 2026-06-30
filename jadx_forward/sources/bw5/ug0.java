package bw5;

/* loaded from: classes2.dex */
public class ug0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f115421d;

    /* renamed from: e, reason: collision with root package name */
    public int f115422e;

    /* renamed from: f, reason: collision with root package name */
    public int f115423f;

    /* renamed from: g, reason: collision with root package name */
    public int f115424g;

    /* renamed from: h, reason: collision with root package name */
    public int f115425h;

    /* renamed from: i, reason: collision with root package name */
    public int f115426i;

    /* renamed from: m, reason: collision with root package name */
    public int f115427m;

    /* renamed from: n, reason: collision with root package name */
    public long f115428n;

    /* renamed from: o, reason: collision with root package name */
    public int f115429o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f115430p = new boolean[10];

    static {
        new bw5.ug0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ug0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ug0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ug0)) {
            return false;
        }
        bw5.ug0 ug0Var = (bw5.ug0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f115421d), java.lang.Long.valueOf(ug0Var.f115421d)) && n51.f.a(java.lang.Integer.valueOf(this.f115422e), java.lang.Integer.valueOf(ug0Var.f115422e)) && n51.f.a(java.lang.Integer.valueOf(this.f115423f), java.lang.Integer.valueOf(ug0Var.f115423f)) && n51.f.a(java.lang.Integer.valueOf(this.f115424g), java.lang.Integer.valueOf(ug0Var.f115424g)) && n51.f.a(java.lang.Integer.valueOf(this.f115425h), java.lang.Integer.valueOf(ug0Var.f115425h)) && n51.f.a(java.lang.Integer.valueOf(this.f115426i), java.lang.Integer.valueOf(ug0Var.f115426i)) && n51.f.a(java.lang.Integer.valueOf(this.f115427m), java.lang.Integer.valueOf(ug0Var.f115427m)) && n51.f.a(java.lang.Long.valueOf(this.f115428n), java.lang.Long.valueOf(ug0Var.f115428n)) && n51.f.a(java.lang.Integer.valueOf(this.f115429o), java.lang.Integer.valueOf(ug0Var.f115429o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ug0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115430p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f115421d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f115422e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115423f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115424g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f115425h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f115426i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115427m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f115428n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f115429o);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f115421d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f115422e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f115423f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f115424g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f115425h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f115426i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f115427m);
            }
            if (zArr[8]) {
                h17 += b36.f.h(8, this.f115428n);
            }
            return zArr[9] ? h17 + b36.f.e(9, this.f115429o) : h17;
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
                this.f115421d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115422e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115423f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115424g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115425h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115426i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115427m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115428n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115429o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
