package bw5;

/* loaded from: classes2.dex */
public class o3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f112454d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112455e;

    /* renamed from: f, reason: collision with root package name */
    public long f112456f;

    /* renamed from: g, reason: collision with root package name */
    public long f112457g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f112458h;

    /* renamed from: i, reason: collision with root package name */
    public long f112459i;

    /* renamed from: m, reason: collision with root package name */
    public long f112460m;

    /* renamed from: n, reason: collision with root package name */
    public long f112461n;

    /* renamed from: o, reason: collision with root package name */
    public long f112462o;

    /* renamed from: p, reason: collision with root package name */
    public int f112463p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f112464q = new boolean[11];

    static {
        new bw5.o3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o3 mo11468x92b714fd(byte[] bArr) {
        return (bw5.o3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o3)) {
            return false;
        }
        bw5.o3 o3Var = (bw5.o3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f112454d), java.lang.Integer.valueOf(o3Var.f112454d)) && n51.f.a(this.f112455e, o3Var.f112455e) && n51.f.a(java.lang.Long.valueOf(this.f112456f), java.lang.Long.valueOf(o3Var.f112456f)) && n51.f.a(java.lang.Long.valueOf(this.f112457g), java.lang.Long.valueOf(o3Var.f112457g)) && n51.f.a(java.lang.Boolean.valueOf(this.f112458h), java.lang.Boolean.valueOf(o3Var.f112458h)) && n51.f.a(java.lang.Long.valueOf(this.f112459i), java.lang.Long.valueOf(o3Var.f112459i)) && n51.f.a(java.lang.Long.valueOf(this.f112460m), java.lang.Long.valueOf(o3Var.f112460m)) && n51.f.a(java.lang.Long.valueOf(this.f112461n), java.lang.Long.valueOf(o3Var.f112461n)) && n51.f.a(java.lang.Long.valueOf(this.f112462o), java.lang.Long.valueOf(o3Var.f112462o)) && n51.f.a(java.lang.Integer.valueOf(this.f112463p), java.lang.Integer.valueOf(o3Var.f112463p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.o3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112464q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f112454d);
            }
            java.lang.String str = this.f112455e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f112456f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f112457g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f112458h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f112459i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f112460m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f112461n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f112462o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f112463p);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f112454d) : 0;
            java.lang.String str2 = this.f112455e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f112456f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f112457g);
            }
            if (zArr[5]) {
                e17 += b36.f.a(5, this.f112458h);
            }
            if (zArr[6]) {
                e17 += b36.f.h(6, this.f112459i);
            }
            if (zArr[7]) {
                e17 += b36.f.h(7, this.f112460m);
            }
            if (zArr[8]) {
                e17 += b36.f.h(8, this.f112461n);
            }
            if (zArr[9]) {
                e17 += b36.f.h(9, this.f112462o);
            }
            return zArr[10] ? e17 + b36.f.e(10, this.f112463p) : e17;
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
                this.f112454d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112455e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112456f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112457g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112458h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112459i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112460m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112461n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f112462o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f112463p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
