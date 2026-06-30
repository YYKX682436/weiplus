package bw5;

/* loaded from: classes2.dex */
public class jd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110460d;

    /* renamed from: e, reason: collision with root package name */
    public long f110461e;

    /* renamed from: f, reason: collision with root package name */
    public long f110462f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f110463g = new boolean[4];

    static {
        new bw5.jd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jd mo11468x92b714fd(byte[] bArr) {
        return (bw5.jd) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jd)) {
            return false;
        }
        bw5.jd jdVar = (bw5.jd) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110460d), java.lang.Integer.valueOf(jdVar.f110460d)) && n51.f.a(java.lang.Long.valueOf(this.f110461e), java.lang.Long.valueOf(jdVar.f110461e)) && n51.f.a(java.lang.Long.valueOf(this.f110462f), java.lang.Long.valueOf(jdVar.f110462f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.jd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110463g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110460d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f110461e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f110462f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f110460d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f110461e);
            }
            return zArr[3] ? e17 + b36.f.h(3, this.f110462f) : e17;
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
            this.f110460d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110461e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f110462f = aVar2.i(intValue);
        zArr[3] = true;
        return 0;
    }
}
