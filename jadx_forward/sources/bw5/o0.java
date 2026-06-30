package bw5;

/* loaded from: classes9.dex */
public class o0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final bw5.o0 f112394n = new bw5.o0();

    /* renamed from: d, reason: collision with root package name */
    public long f112395d;

    /* renamed from: e, reason: collision with root package name */
    public long f112396e;

    /* renamed from: f, reason: collision with root package name */
    public float f112397f;

    /* renamed from: g, reason: collision with root package name */
    public long f112398g;

    /* renamed from: h, reason: collision with root package name */
    public long f112399h;

    /* renamed from: i, reason: collision with root package name */
    public long f112400i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f112401m = new boolean[7];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.o0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o0)) {
            return false;
        }
        bw5.o0 o0Var = (bw5.o0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f112395d), java.lang.Long.valueOf(o0Var.f112395d)) && n51.f.a(java.lang.Long.valueOf(this.f112396e), java.lang.Long.valueOf(o0Var.f112396e)) && n51.f.a(java.lang.Float.valueOf(this.f112397f), java.lang.Float.valueOf(o0Var.f112397f)) && n51.f.a(java.lang.Long.valueOf(this.f112398g), java.lang.Long.valueOf(o0Var.f112398g)) && n51.f.a(java.lang.Long.valueOf(this.f112399h), java.lang.Long.valueOf(o0Var.f112399h)) && n51.f.a(java.lang.Long.valueOf(this.f112400i), java.lang.Long.valueOf(o0Var.f112400i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.o0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112401m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f112395d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f112396e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f112397f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f112398g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f112399h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f112400i);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f112395d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f112396e);
            }
            if (zArr[3]) {
                h17 += b36.f.d(3, this.f112397f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f112398g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f112399h);
            }
            return zArr[6] ? h17 + b36.f.h(6, this.f112400i) : h17;
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
                this.f112395d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112396e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112397f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112398g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112399h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112400i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
