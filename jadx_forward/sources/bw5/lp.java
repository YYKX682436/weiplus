package bw5;

/* loaded from: classes2.dex */
public class lp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111418d;

    /* renamed from: e, reason: collision with root package name */
    public int f111419e;

    /* renamed from: f, reason: collision with root package name */
    public int f111420f;

    /* renamed from: g, reason: collision with root package name */
    public int f111421g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f111422h = new boolean[5];

    static {
        new bw5.lp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lp mo11468x92b714fd(byte[] bArr) {
        return (bw5.lp) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lp)) {
            return false;
        }
        bw5.lp lpVar = (bw5.lp) fVar;
        return n51.f.a(this.f111418d, lpVar.f111418d) && n51.f.a(java.lang.Integer.valueOf(this.f111419e), java.lang.Integer.valueOf(lpVar.f111419e)) && n51.f.a(java.lang.Integer.valueOf(this.f111420f), java.lang.Integer.valueOf(lpVar.f111420f)) && n51.f.a(java.lang.Integer.valueOf(this.f111421g), java.lang.Integer.valueOf(lpVar.f111421g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111422h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111418d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111419e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111420f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f111421g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f111418d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f111419e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f111420f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f111421g) : i18;
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
            this.f111418d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111419e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f111420f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f111421g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
