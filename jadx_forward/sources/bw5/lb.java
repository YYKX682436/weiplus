package bw5;

/* loaded from: classes4.dex */
public class lb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111240d;

    /* renamed from: e, reason: collision with root package name */
    public double f111241e;

    /* renamed from: f, reason: collision with root package name */
    public double f111242f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111243g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111244h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f111245i = new boolean[6];

    static {
        new bw5.lb();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lb mo11468x92b714fd(byte[] bArr) {
        return (bw5.lb) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lb)) {
            return false;
        }
        bw5.lb lbVar = (bw5.lb) fVar;
        return n51.f.a(this.f111240d, lbVar.f111240d) && n51.f.a(java.lang.Double.valueOf(this.f111241e), java.lang.Double.valueOf(lbVar.f111241e)) && n51.f.a(java.lang.Double.valueOf(this.f111242f), java.lang.Double.valueOf(lbVar.f111242f)) && n51.f.a(this.f111243g, lbVar.f111243g) && n51.f.a(this.f111244h, lbVar.f111244h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lb();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111245i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111240d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.c(2, this.f111241e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f111242f);
            }
            java.lang.String str2 = this.f111243g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f111244h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f111240d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.c(2, this.f111241e);
            }
            if (zArr[3]) {
                i18 += b36.f.c(3, this.f111242f);
            }
            java.lang.String str5 = this.f111243g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f111244h;
            return (str6 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str6);
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
            this.f111240d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111241e = aVar2.e(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f111242f = aVar2.e(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f111243g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f111244h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
