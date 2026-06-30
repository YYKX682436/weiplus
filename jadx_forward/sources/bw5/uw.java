package bw5;

/* loaded from: classes2.dex */
public class uw extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f115594d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f115595e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f115596f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f115597g;

    /* renamed from: h, reason: collision with root package name */
    public int f115598h;

    /* renamed from: i, reason: collision with root package name */
    public int f115599i;

    /* renamed from: m, reason: collision with root package name */
    public int f115600m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f115601n = new boolean[8];

    static {
        new bw5.uw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uw mo11468x92b714fd(byte[] bArr) {
        return (bw5.uw) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uw)) {
            return false;
        }
        bw5.uw uwVar = (bw5.uw) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f115594d), java.lang.Boolean.valueOf(uwVar.f115594d)) && n51.f.a(java.lang.Boolean.valueOf(this.f115595e), java.lang.Boolean.valueOf(uwVar.f115595e)) && n51.f.a(java.lang.Boolean.valueOf(this.f115596f), java.lang.Boolean.valueOf(uwVar.f115596f)) && n51.f.a(java.lang.Boolean.valueOf(this.f115597g), java.lang.Boolean.valueOf(uwVar.f115597g)) && n51.f.a(java.lang.Integer.valueOf(this.f115598h), java.lang.Integer.valueOf(uwVar.f115598h)) && n51.f.a(java.lang.Integer.valueOf(this.f115599i), java.lang.Integer.valueOf(uwVar.f115599i)) && n51.f.a(java.lang.Integer.valueOf(this.f115600m), java.lang.Integer.valueOf(uwVar.f115600m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.uw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115601n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f115594d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f115595e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f115596f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f115597g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f115598h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f115599i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115600m);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f115594d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f115595e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f115596f);
            }
            if (zArr[4]) {
                a17 += b36.f.a(4, this.f115597g);
            }
            if (zArr[5]) {
                a17 += b36.f.e(5, this.f115598h);
            }
            if (zArr[6]) {
                a17 += b36.f.e(6, this.f115599i);
            }
            return zArr[7] ? a17 + b36.f.e(7, this.f115600m) : a17;
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
                this.f115594d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115595e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115596f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115597g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115598h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115599i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115600m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
