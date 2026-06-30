package bw5;

/* loaded from: classes4.dex */
public class cd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f107584d;

    /* renamed from: e, reason: collision with root package name */
    public float f107585e;

    /* renamed from: f, reason: collision with root package name */
    public float f107586f;

    /* renamed from: g, reason: collision with root package name */
    public float f107587g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107588h = new boolean[5];

    static {
        new bw5.cd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cd mo11468x92b714fd(byte[] bArr) {
        return (bw5.cd) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cd)) {
            return false;
        }
        bw5.cd cdVar = (bw5.cd) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f107584d), java.lang.Float.valueOf(cdVar.f107584d)) && n51.f.a(java.lang.Float.valueOf(this.f107585e), java.lang.Float.valueOf(cdVar.f107585e)) && n51.f.a(java.lang.Float.valueOf(this.f107586f), java.lang.Float.valueOf(cdVar.f107586f)) && n51.f.a(java.lang.Float.valueOf(this.f107587g), java.lang.Float.valueOf(cdVar.f107587g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107588h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f107584d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f107585e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f107586f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f107587g);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f107584d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f107585e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f107586f);
            }
            return zArr[4] ? d17 + b36.f.d(4, this.f107587g) : d17;
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
            this.f107584d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107585e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107586f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f107587g = aVar2.f(intValue);
        zArr[4] = true;
        return 0;
    }
}
