package bw5;

/* loaded from: classes2.dex */
public class hd0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f109705d;

    /* renamed from: e, reason: collision with root package name */
    public double f109706e;

    /* renamed from: f, reason: collision with root package name */
    public double f109707f;

    /* renamed from: g, reason: collision with root package name */
    public double f109708g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f109709h = new boolean[5];

    static {
        new bw5.hd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hd0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.hd0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hd0)) {
            return false;
        }
        bw5.hd0 hd0Var = (bw5.hd0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f109705d), java.lang.Double.valueOf(hd0Var.f109705d)) && n51.f.a(java.lang.Double.valueOf(this.f109706e), java.lang.Double.valueOf(hd0Var.f109706e)) && n51.f.a(java.lang.Double.valueOf(this.f109707f), java.lang.Double.valueOf(hd0Var.f109707f)) && n51.f.a(java.lang.Double.valueOf(this.f109708g), java.lang.Double.valueOf(hd0Var.f109708g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109709h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f109705d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f109706e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f109707f);
            }
            if (zArr[4]) {
                fVar.c(4, this.f109708g);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f109705d) : 0;
            if (zArr[2]) {
                c17 += b36.f.c(2, this.f109706e);
            }
            if (zArr[3]) {
                c17 += b36.f.c(3, this.f109707f);
            }
            return zArr[4] ? c17 + b36.f.c(4, this.f109708g) : c17;
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
            this.f109705d = aVar2.e(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f109706e = aVar2.e(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f109707f = aVar2.e(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f109708g = aVar2.e(intValue);
        zArr[4] = true;
        return 0;
    }
}
