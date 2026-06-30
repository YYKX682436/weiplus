package bw5;

/* loaded from: classes2.dex */
public class wt extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116382d;

    /* renamed from: e, reason: collision with root package name */
    public int f116383e;

    /* renamed from: f, reason: collision with root package name */
    public int f116384f;

    /* renamed from: g, reason: collision with root package name */
    public int f116385g;

    /* renamed from: h, reason: collision with root package name */
    public int f116386h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116387i = new boolean[6];

    static {
        new bw5.wt();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wt mo11468x92b714fd(byte[] bArr) {
        return (bw5.wt) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wt)) {
            return false;
        }
        bw5.wt wtVar = (bw5.wt) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116382d), java.lang.Integer.valueOf(wtVar.f116382d)) && n51.f.a(java.lang.Integer.valueOf(this.f116383e), java.lang.Integer.valueOf(wtVar.f116383e)) && n51.f.a(java.lang.Integer.valueOf(this.f116384f), java.lang.Integer.valueOf(wtVar.f116384f)) && n51.f.a(java.lang.Integer.valueOf(this.f116385g), java.lang.Integer.valueOf(wtVar.f116385g)) && n51.f.a(java.lang.Integer.valueOf(this.f116386h), java.lang.Integer.valueOf(wtVar.f116386h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wt();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116387i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116382d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116383e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116384f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116385g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f116386h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f116382d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f116383e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f116384f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f116385g);
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f116386h) : e17;
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
            this.f116382d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116383e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116384f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f116385g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f116386h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
