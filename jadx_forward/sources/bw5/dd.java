package bw5;

/* loaded from: classes2.dex */
public class dd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107969d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f107970e;

    /* renamed from: f, reason: collision with root package name */
    public long f107971f;

    /* renamed from: g, reason: collision with root package name */
    public long f107972g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107973h = new boolean[5];

    static {
        new bw5.dd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dd mo11468x92b714fd(byte[] bArr) {
        return (bw5.dd) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dd)) {
            return false;
        }
        bw5.dd ddVar = (bw5.dd) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107969d), java.lang.Integer.valueOf(ddVar.f107969d)) && n51.f.a(java.lang.Boolean.valueOf(this.f107970e), java.lang.Boolean.valueOf(ddVar.f107970e)) && n51.f.a(java.lang.Long.valueOf(this.f107971f), java.lang.Long.valueOf(ddVar.f107971f)) && n51.f.a(java.lang.Long.valueOf(this.f107972g), java.lang.Long.valueOf(ddVar.f107972g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107973h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107969d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f107970e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f107971f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f107972g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107969d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f107970e);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f107971f);
            }
            return zArr[4] ? e17 + b36.f.h(4, this.f107972g) : e17;
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
            this.f107969d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107970e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107971f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f107972g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }
}
