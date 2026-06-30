package bw5;

/* loaded from: classes2.dex */
public class lm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111384d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111385e;

    /* renamed from: f, reason: collision with root package name */
    public int f111386f;

    /* renamed from: g, reason: collision with root package name */
    public float f111387g;

    /* renamed from: h, reason: collision with root package name */
    public float f111388h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.km f111389i;

    /* renamed from: m, reason: collision with root package name */
    public int f111390m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f111391n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f111392o = new boolean[9];

    static {
        new bw5.lm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lm mo11468x92b714fd(byte[] bArr) {
        return (bw5.lm) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lm)) {
            return false;
        }
        bw5.lm lmVar = (bw5.lm) fVar;
        return n51.f.a(this.f111384d, lmVar.f111384d) && n51.f.a(this.f111385e, lmVar.f111385e) && n51.f.a(java.lang.Integer.valueOf(this.f111386f), java.lang.Integer.valueOf(lmVar.f111386f)) && n51.f.a(java.lang.Float.valueOf(this.f111387g), java.lang.Float.valueOf(lmVar.f111387g)) && n51.f.a(java.lang.Float.valueOf(this.f111388h), java.lang.Float.valueOf(lmVar.f111388h)) && n51.f.a(this.f111389i, lmVar.f111389i) && n51.f.a(java.lang.Integer.valueOf(this.f111390m), java.lang.Integer.valueOf(lmVar.f111390m)) && n51.f.a(java.lang.Boolean.valueOf(this.f111391n), java.lang.Boolean.valueOf(lmVar.f111391n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111392o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111384d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f111385e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111386f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f111387g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f111388h);
            }
            bw5.km kmVar = this.f111389i;
            if (kmVar != null && zArr[6]) {
                fVar.e(6, kmVar.f110955d);
            }
            if (zArr[7]) {
                fVar.e(7, this.f111390m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f111391n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f111384d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f111385e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f111386f);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f111387g);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f111388h);
            }
            bw5.km kmVar2 = this.f111389i;
            if (kmVar2 != null && zArr[6]) {
                i18 += b36.f.e(6, kmVar2.f110955d);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f111390m);
            }
            return zArr[8] ? i18 + b36.f.a(8, this.f111391n) : i18;
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
                this.f111384d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111385e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111386f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111387g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111388h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                int g17 = aVar2.g(intValue);
                this.f111389i = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.km.FinderLiveImgRatio_4vs3 : bw5.km.FinderLiveImgRatio_16vs9 : bw5.km.FinderLiveImgRatio_Default;
                zArr[6] = true;
                return 0;
            case 7:
                this.f111390m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111391n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
