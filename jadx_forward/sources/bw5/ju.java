package bw5;

/* loaded from: classes2.dex */
public class ju extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110672d;

    /* renamed from: e, reason: collision with root package name */
    public int f110673e;

    /* renamed from: f, reason: collision with root package name */
    public int f110674f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f110675g = new boolean[4];

    static {
        new bw5.ju();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ju mo11468x92b714fd(byte[] bArr) {
        return (bw5.ju) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ju)) {
            return false;
        }
        bw5.ju juVar = (bw5.ju) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110672d), java.lang.Integer.valueOf(juVar.f110672d)) && n51.f.a(java.lang.Integer.valueOf(this.f110673e), java.lang.Integer.valueOf(juVar.f110673e)) && n51.f.a(java.lang.Integer.valueOf(this.f110674f), java.lang.Integer.valueOf(juVar.f110674f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ju();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110675g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110672d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f110673e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f110674f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f110672d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f110673e);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f110674f) : e17;
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
            this.f110672d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110673e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f110674f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
