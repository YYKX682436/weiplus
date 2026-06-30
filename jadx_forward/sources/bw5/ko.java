package bw5;

/* loaded from: classes2.dex */
public class ko extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f110982d;

    /* renamed from: e, reason: collision with root package name */
    public long f110983e;

    /* renamed from: f, reason: collision with root package name */
    public long f110984f;

    /* renamed from: g, reason: collision with root package name */
    public long f110985g;

    /* renamed from: h, reason: collision with root package name */
    public int f110986h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f110987i = new boolean[6];

    static {
        new bw5.ko();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ko mo11468x92b714fd(byte[] bArr) {
        return (bw5.ko) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ko)) {
            return false;
        }
        bw5.ko koVar = (bw5.ko) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f110982d), java.lang.Long.valueOf(koVar.f110982d)) && n51.f.a(java.lang.Long.valueOf(this.f110983e), java.lang.Long.valueOf(koVar.f110983e)) && n51.f.a(java.lang.Long.valueOf(this.f110984f), java.lang.Long.valueOf(koVar.f110984f)) && n51.f.a(java.lang.Long.valueOf(this.f110985g), java.lang.Long.valueOf(koVar.f110985g)) && n51.f.a(java.lang.Integer.valueOf(this.f110986h), java.lang.Integer.valueOf(koVar.f110986h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ko();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110987i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f110982d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f110983e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f110984f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f110985g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f110986h);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f110982d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f110983e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f110984f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f110985g);
            }
            return zArr[5] ? h17 + b36.f.e(5, this.f110986h) : h17;
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
            this.f110982d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110983e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f110984f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f110985g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f110986h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
