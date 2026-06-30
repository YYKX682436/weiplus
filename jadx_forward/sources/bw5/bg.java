package bw5;

/* loaded from: classes2.dex */
public class bg extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f107172d;

    /* renamed from: e, reason: collision with root package name */
    public int f107173e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f107174f;

    /* renamed from: g, reason: collision with root package name */
    public long f107175g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107176h = new boolean[5];

    static {
        new bw5.bg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bg mo11468x92b714fd(byte[] bArr) {
        return (bw5.bg) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bg)) {
            return false;
        }
        bw5.bg bgVar = (bw5.bg) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f107172d), java.lang.Long.valueOf(bgVar.f107172d)) && n51.f.a(java.lang.Integer.valueOf(this.f107173e), java.lang.Integer.valueOf(bgVar.f107173e)) && n51.f.a(java.lang.Boolean.valueOf(this.f107174f), java.lang.Boolean.valueOf(bgVar.f107174f)) && n51.f.a(java.lang.Long.valueOf(this.f107175g), java.lang.Long.valueOf(bgVar.f107175g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107176h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f107172d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f107173e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f107174f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f107175g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f107172d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f107173e);
            }
            if (zArr[3]) {
                h17 += b36.f.a(3, this.f107174f);
            }
            return zArr[4] ? h17 + b36.f.h(4, this.f107175g) : h17;
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
            this.f107172d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107173e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107174f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f107175g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }
}
