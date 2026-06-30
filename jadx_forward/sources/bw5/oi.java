package bw5;

/* loaded from: classes2.dex */
public class oi extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112633d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112634e;

    /* renamed from: f, reason: collision with root package name */
    public float f112635f;

    /* renamed from: g, reason: collision with root package name */
    public float f112636g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f112637h = new boolean[5];

    static {
        new bw5.oi();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oi mo11468x92b714fd(byte[] bArr) {
        return (bw5.oi) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oi)) {
            return false;
        }
        bw5.oi oiVar = (bw5.oi) fVar;
        return n51.f.a(this.f112633d, oiVar.f112633d) && n51.f.a(this.f112634e, oiVar.f112634e) && n51.f.a(java.lang.Float.valueOf(this.f112635f), java.lang.Float.valueOf(oiVar.f112635f)) && n51.f.a(java.lang.Float.valueOf(this.f112636g), java.lang.Float.valueOf(oiVar.f112636g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.oi();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112637h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112633d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f112634e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.d(3, this.f112635f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f112636g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f112633d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f112634e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f112635f);
            }
            return zArr[4] ? i18 + b36.f.d(4, this.f112636g) : i18;
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
            this.f112633d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f112634e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f112635f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f112636g = aVar2.f(intValue);
        zArr[4] = true;
        return 0;
    }
}
