package bw5;

/* loaded from: classes4.dex */
public class fd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f108761d;

    /* renamed from: e, reason: collision with root package name */
    public int f108762e;

    /* renamed from: f, reason: collision with root package name */
    public int f108763f;

    /* renamed from: g, reason: collision with root package name */
    public int f108764g;

    /* renamed from: h, reason: collision with root package name */
    public int f108765h;

    /* renamed from: i, reason: collision with root package name */
    public int f108766i;

    /* renamed from: m, reason: collision with root package name */
    public int f108767m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f108768n = new boolean[8];

    static {
        new bw5.fd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fd mo11468x92b714fd(byte[] bArr) {
        return (bw5.fd) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fd)) {
            return false;
        }
        bw5.fd fdVar = (bw5.fd) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f108761d), java.lang.Integer.valueOf(fdVar.f108761d)) && n51.f.a(java.lang.Integer.valueOf(this.f108762e), java.lang.Integer.valueOf(fdVar.f108762e)) && n51.f.a(java.lang.Integer.valueOf(this.f108763f), java.lang.Integer.valueOf(fdVar.f108763f)) && n51.f.a(java.lang.Integer.valueOf(this.f108764g), java.lang.Integer.valueOf(fdVar.f108764g)) && n51.f.a(java.lang.Integer.valueOf(this.f108765h), java.lang.Integer.valueOf(fdVar.f108765h)) && n51.f.a(java.lang.Integer.valueOf(this.f108766i), java.lang.Integer.valueOf(fdVar.f108766i)) && n51.f.a(java.lang.Integer.valueOf(this.f108767m), java.lang.Integer.valueOf(fdVar.f108767m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108768n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f108761d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f108762e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f108763f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f108764g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f108765h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108766i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f108767m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f108761d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f108762e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f108763f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f108764g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f108765h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f108766i);
            }
            return zArr[7] ? e17 + b36.f.e(7, this.f108767m) : e17;
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
                this.f108761d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108762e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108763f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108764g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108765h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108766i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108767m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
