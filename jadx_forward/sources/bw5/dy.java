package bw5;

/* loaded from: classes4.dex */
public class dy extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.kx f108173d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.kx f108174e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.kx f108175f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f108176g = new boolean[4];

    static {
        new bw5.dy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dy mo11468x92b714fd(byte[] bArr) {
        return (bw5.dy) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dy)) {
            return false;
        }
        bw5.dy dyVar = (bw5.dy) fVar;
        return n51.f.a(this.f108173d, dyVar.f108173d) && n51.f.a(this.f108174e, dyVar.f108174e) && n51.f.a(this.f108175f, dyVar.f108175f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108176g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.kx kxVar = this.f108173d;
            if (kxVar != null && zArr[1]) {
                fVar.e(1, kxVar.f111106d);
            }
            bw5.kx kxVar2 = this.f108174e;
            if (kxVar2 != null && zArr[2]) {
                fVar.e(2, kxVar2.f111106d);
            }
            bw5.kx kxVar3 = this.f108175f;
            if (kxVar3 != null && zArr[3]) {
                fVar.e(3, kxVar3.f111106d);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.kx kxVar4 = this.f108173d;
            if (kxVar4 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, kxVar4.f111106d);
            }
            bw5.kx kxVar5 = this.f108174e;
            if (kxVar5 != null && zArr[2]) {
                i18 += b36.f.e(2, kxVar5.f111106d);
            }
            bw5.kx kxVar6 = this.f108175f;
            return (kxVar6 == null || !zArr[3]) ? i18 : i18 + b36.f.e(3, kxVar6.f111106d);
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
            this.f108173d = bw5.kx.a(aVar2.g(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f108174e = bw5.kx.a(aVar2.g(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f108175f = bw5.kx.a(aVar2.g(intValue));
        zArr[3] = true;
        return 0;
    }
}
