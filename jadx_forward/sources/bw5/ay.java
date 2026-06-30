package bw5;

/* loaded from: classes8.dex */
public class ay extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ix f106984d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.tx f106985e;

    /* renamed from: f, reason: collision with root package name */
    public float f106986f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.zx f106987g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.dy f106988h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.mx f106989i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.wx f106990m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f106991n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f106992o = new boolean[9];

    static {
        new bw5.ay();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ay mo11468x92b714fd(byte[] bArr) {
        return (bw5.ay) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ay)) {
            return false;
        }
        bw5.ay ayVar = (bw5.ay) fVar;
        return n51.f.a(this.f106984d, ayVar.f106984d) && n51.f.a(this.f106985e, ayVar.f106985e) && n51.f.a(java.lang.Float.valueOf(this.f106986f), java.lang.Float.valueOf(ayVar.f106986f)) && n51.f.a(this.f106987g, ayVar.f106987g) && n51.f.a(this.f106988h, ayVar.f106988h) && n51.f.a(this.f106989i, ayVar.f106989i) && n51.f.a(this.f106990m, ayVar.f106990m) && n51.f.a(java.lang.Boolean.valueOf(this.f106991n), java.lang.Boolean.valueOf(ayVar.f106991n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ay();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f106992o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ix ixVar = this.f106984d;
            if (ixVar != null && zArr[1]) {
                fVar.e(1, ixVar.f110254d);
            }
            bw5.tx txVar = this.f106985e;
            if (txVar != null && zArr[2]) {
                fVar.i(2, txVar.mo75928xcd1e8d8());
                this.f106985e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.d(3, this.f106986f);
            }
            bw5.zx zxVar = this.f106987g;
            if (zxVar != null && zArr[4]) {
                fVar.i(4, zxVar.mo75928xcd1e8d8());
                this.f106987g.mo75956x3d5d1f78(fVar);
            }
            bw5.dy dyVar = this.f106988h;
            if (dyVar != null && zArr[5]) {
                fVar.i(5, dyVar.mo75928xcd1e8d8());
                this.f106988h.mo75956x3d5d1f78(fVar);
            }
            bw5.mx mxVar = this.f106989i;
            if (mxVar != null && zArr[6]) {
                fVar.e(6, mxVar.f111942d);
            }
            bw5.wx wxVar = this.f106990m;
            if (wxVar != null && zArr[7]) {
                fVar.i(7, wxVar.mo75928xcd1e8d8());
                this.f106990m.mo75956x3d5d1f78(fVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f106991n);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ix ixVar2 = this.f106984d;
            if (ixVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, ixVar2.f110254d);
            }
            bw5.tx txVar2 = this.f106985e;
            if (txVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, txVar2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f106986f);
            }
            bw5.zx zxVar2 = this.f106987g;
            if (zxVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, zxVar2.mo75928xcd1e8d8());
            }
            bw5.dy dyVar2 = this.f106988h;
            if (dyVar2 != null && zArr[5]) {
                i18 += b36.f.i(5, dyVar2.mo75928xcd1e8d8());
            }
            bw5.mx mxVar2 = this.f106989i;
            if (mxVar2 != null && zArr[6]) {
                i18 += b36.f.e(6, mxVar2.f111942d);
            }
            bw5.wx wxVar2 = this.f106990m;
            if (wxVar2 != null && zArr[7]) {
                i18 += b36.f.i(7, wxVar2.mo75928xcd1e8d8());
            }
            return zArr[8] ? i18 + b36.f.a(8, this.f106991n) : i18;
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
        bw5.ix ixVar3 = null;
        bw5.mx mxVar3 = null;
        switch (intValue) {
            case 1:
                int g17 = aVar2.g(intValue);
                if (g17 == 0) {
                    ixVar3 = bw5.ix.FinderTabTipsDSLRenderFontWeight_Default;
                } else if (g17 == 1) {
                    ixVar3 = bw5.ix.FinderTabTipsDSLRenderFontWeight_Bold;
                } else if (g17 == 2) {
                    ixVar3 = bw5.ix.FinderTabTipsDSLRenderFontWeight_Medium;
                }
                this.f106984d = ixVar3;
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.tx txVar3 = new bw5.tx();
                    if (bArr != null && bArr.length > 0) {
                        txVar3.mo11468x92b714fd(bArr);
                    }
                    this.f106985e = txVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f106986f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.zx zxVar3 = new bw5.zx();
                    if (bArr2 != null && bArr2.length > 0) {
                        zxVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f106987g = zxVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.dy dyVar3 = new bw5.dy();
                    if (bArr3 != null && bArr3.length > 0) {
                        dyVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f106988h = dyVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    mxVar3 = bw5.mx.FinderTabTipsDSLRenderTextAlign_Default;
                } else if (g18 == 1) {
                    mxVar3 = bw5.mx.FinderTabTipsDSLRenderTextAlign_Left;
                } else if (g18 == 2) {
                    mxVar3 = bw5.mx.FinderTabTipsDSLRenderTextAlign_Center;
                } else if (g18 == 3) {
                    mxVar3 = bw5.mx.FinderTabTipsDSLRenderTextAlign_Right;
                }
                this.f106989i = mxVar3;
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.wx wxVar3 = new bw5.wx();
                    if (bArr4 != null && bArr4.length > 0) {
                        wxVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f106990m = wxVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f106991n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
