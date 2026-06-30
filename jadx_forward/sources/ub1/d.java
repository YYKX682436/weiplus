package ub1;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f507563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f507565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f507566g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2891x34da02.C25303x87b156a3 f507567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ub1.b f507568i;

    public d(ub1.b bVar, int i17, java.lang.String str, int i18, int i19, byte[] bArr, com.p314xaae8f345.p2891x34da02.C25303x87b156a3 c25303x87b156a3) {
        this.f507568i = bVar;
        this.f507563d = i17;
        this.f507564e = str;
        this.f507565f = i19;
        this.f507566g = bArr;
        this.f507567h = c25303x87b156a3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ub1.e eVar = this.f507568i.f507549b;
        if (eVar != null) {
            java.lang.String str = this.f507564e;
            int i17 = this.f507565f;
            byte[] bArr = this.f507566g;
            com.p314xaae8f345.p2891x34da02.C25303x87b156a3 c25303x87b156a3 = this.f507567h;
            tb1.u uVar = (tb1.u) ((ub1.h) eVar).f507569a;
            if (uVar.f498470b.compareAndSet(false, true)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new tb1.t(uVar), uVar.f498471c);
                if (c25303x87b156a3 != null && uVar.f498479k % 4 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "x: %f, y: %f, w: %f, h: %f; x0:%f, x1:%f, x2:%f, x3:%f, y0:%f, y1:%f, y2:%f, y3:%f", java.lang.Float.valueOf(c25303x87b156a3.f296763x0), java.lang.Float.valueOf(c25303x87b156a3.f296767y0), java.lang.Float.valueOf(c25303x87b156a3.f296764x1 - c25303x87b156a3.f296763x0), java.lang.Float.valueOf(c25303x87b156a3.f296770y3 - c25303x87b156a3.f296767y0), java.lang.Float.valueOf(c25303x87b156a3.f296763x0), java.lang.Float.valueOf(c25303x87b156a3.f296764x1), java.lang.Float.valueOf(c25303x87b156a3.f296765x2), java.lang.Float.valueOf(c25303x87b156a3.f296766x3), java.lang.Float.valueOf(c25303x87b156a3.f296767y0), java.lang.Float.valueOf(c25303x87b156a3.f296768y1), java.lang.Float.valueOf(c25303x87b156a3.f296769y2), java.lang.Float.valueOf(c25303x87b156a3.f296770y3));
                    uVar.f498479k++;
                }
                int i18 = this.f507563d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = uVar.f498480l;
                if (i18 == 1) {
                    tb1.e0.u(c12042x78b65610.f161702e, c12042x78b65610.mo50746x72efd496(), "qrcode", i17, str, bArr, c25303x87b156a3);
                } else if (i18 != 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandCameraView", "resultType:%d is not support, ignore");
                } else {
                    tb1.e0.u(c12042x78b65610.f161702e, c12042x78b65610.mo50746x72efd496(), "barcode", i17, str, bArr, c25303x87b156a3);
                }
            }
        }
    }
}
