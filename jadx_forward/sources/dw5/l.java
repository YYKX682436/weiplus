package dw5;

/* loaded from: classes15.dex */
public class l extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f325911d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f325912e;

    /* renamed from: f, reason: collision with root package name */
    public dw5.m f325913f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f325914g;

    /* renamed from: h, reason: collision with root package name */
    public int f325915h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f325916i = new boolean[6];

    static {
        new dw5.l();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dw5.l mo11468x92b714fd(byte[] bArr) {
        return (dw5.l) super.mo11468x92b714fd(bArr);
    }

    public dw5.l c(int i17) {
        this.f325915h = i17;
        this.f325916i[5] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.l)) {
            return false;
        }
        dw5.l lVar = (dw5.l) fVar;
        return n51.f.a(this.f325911d, lVar.f325911d) && n51.f.a(this.f325912e, lVar.f325912e) && n51.f.a(this.f325913f, lVar.f325913f) && n51.f.a(this.f325914g, lVar.f325914g) && n51.f.a(java.lang.Integer.valueOf(this.f325915h), java.lang.Integer.valueOf(lVar.f325915h));
    }

    public dw5.l d(java.lang.String str) {
        this.f325911d = str;
        this.f325916i[1] = true;
        return this;
    }

    public dw5.l e(java.lang.String str) {
        this.f325914g = str;
        this.f325916i[4] = true;
        return this;
    }

    public dw5.l f(dw5.m mVar) {
        this.f325913f = mVar;
        this.f325916i[3] = true;
        return this;
    }

    public dw5.l g(java.lang.String str) {
        this.f325912e = str;
        this.f325916i[2] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new dw5.l();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f325916i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f325911d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f325912e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            dw5.m mVar = this.f325913f;
            if (mVar != null && zArr[3]) {
                fVar.e(3, mVar.f325922d);
            }
            java.lang.String str3 = this.f325914g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f325915h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f325911d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f325912e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            dw5.m mVar2 = this.f325913f;
            if (mVar2 != null && zArr[3]) {
                i18 += b36.f.e(3, mVar2.f325922d);
            }
            java.lang.String str6 = this.f325914g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f325915h) : i18;
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
            this.f325911d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f325912e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            int g17 = aVar2.g(intValue);
            this.f325913f = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : dw5.m.Fake : dw5.m.Finder : dw5.m.MP : dw5.m.Weixin;
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f325914g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f325915h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
