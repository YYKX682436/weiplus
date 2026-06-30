package bw5;

/* loaded from: classes2.dex */
public class rc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114018d;

    /* renamed from: e, reason: collision with root package name */
    public float f114019e;

    /* renamed from: f, reason: collision with root package name */
    public float f114020f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114021g;

    /* renamed from: h, reason: collision with root package name */
    public long f114022h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f114023i = new boolean[6];

    static {
        new bw5.rc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rc mo11468x92b714fd(byte[] bArr) {
        return (bw5.rc) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rc)) {
            return false;
        }
        bw5.rc rcVar = (bw5.rc) fVar;
        return n51.f.a(this.f114018d, rcVar.f114018d) && n51.f.a(java.lang.Float.valueOf(this.f114019e), java.lang.Float.valueOf(rcVar.f114019e)) && n51.f.a(java.lang.Float.valueOf(this.f114020f), java.lang.Float.valueOf(rcVar.f114020f)) && n51.f.a(this.f114021g, rcVar.f114021g) && n51.f.a(java.lang.Long.valueOf(this.f114022h), java.lang.Long.valueOf(rcVar.f114022h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f114023i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114018d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.d(2, this.f114019e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f114020f);
            }
            java.lang.String str2 = this.f114021g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.h(5, this.f114022h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f114018d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.d(2, this.f114019e);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f114020f);
            }
            java.lang.String str4 = this.f114021g;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            return zArr[5] ? i18 + b36.f.h(5, this.f114022h) : i18;
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
            this.f114018d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114019e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f114020f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f114021g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f114022h = aVar2.i(intValue);
        zArr[5] = true;
        return 0;
    }
}
