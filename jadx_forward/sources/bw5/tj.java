package bw5;

/* loaded from: classes8.dex */
public class tj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f115000d;

    /* renamed from: e, reason: collision with root package name */
    public float f115001e;

    /* renamed from: f, reason: collision with root package name */
    public int f115002f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f115003g = new boolean[4];

    static {
        new bw5.tj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tj)) {
            return false;
        }
        bw5.tj tjVar = (bw5.tj) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f115000d), java.lang.Float.valueOf(tjVar.f115000d)) && n51.f.a(java.lang.Float.valueOf(this.f115001e), java.lang.Float.valueOf(tjVar.f115001e)) && n51.f.a(java.lang.Integer.valueOf(this.f115002f), java.lang.Integer.valueOf(tjVar.f115002f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115003g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f115000d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f115001e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115002f);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f115000d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f115001e);
            }
            return zArr[3] ? d17 + b36.f.e(3, this.f115002f) : d17;
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
            this.f115000d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115001e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f115002f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.tj) super.mo11468x92b714fd(bArr);
    }
}
