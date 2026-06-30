package bw5;

/* loaded from: classes2.dex */
public class wh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116263d;

    /* renamed from: e, reason: collision with root package name */
    public int f116264e;

    /* renamed from: f, reason: collision with root package name */
    public int f116265f;

    /* renamed from: g, reason: collision with root package name */
    public int f116266g;

    /* renamed from: h, reason: collision with root package name */
    public int f116267h;

    /* renamed from: i, reason: collision with root package name */
    public int f116268i;

    /* renamed from: m, reason: collision with root package name */
    public long f116269m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f116270n = new boolean[8];

    static {
        new bw5.wh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wh0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.wh0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wh0)) {
            return false;
        }
        bw5.wh0 wh0Var = (bw5.wh0) fVar;
        return n51.f.a(this.f116263d, wh0Var.f116263d) && n51.f.a(java.lang.Integer.valueOf(this.f116264e), java.lang.Integer.valueOf(wh0Var.f116264e)) && n51.f.a(java.lang.Integer.valueOf(this.f116265f), java.lang.Integer.valueOf(wh0Var.f116265f)) && n51.f.a(java.lang.Integer.valueOf(this.f116266g), java.lang.Integer.valueOf(wh0Var.f116266g)) && n51.f.a(java.lang.Integer.valueOf(this.f116267h), java.lang.Integer.valueOf(wh0Var.f116267h)) && n51.f.a(java.lang.Integer.valueOf(this.f116268i), java.lang.Integer.valueOf(wh0Var.f116268i)) && n51.f.a(java.lang.Long.valueOf(this.f116269m), java.lang.Long.valueOf(wh0Var.f116269m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116270n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116263d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116264e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116265f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116266g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f116267h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f116268i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f116269m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f116263d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f116264e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f116265f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f116266g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f116267h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f116268i);
            }
            return zArr[7] ? i18 + b36.f.h(7, this.f116269m) : i18;
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
                this.f116263d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116264e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116265f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116266g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116267h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116268i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116269m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
