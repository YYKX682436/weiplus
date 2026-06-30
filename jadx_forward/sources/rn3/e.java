package rn3;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f479479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f479480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f479481f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn3.f f479482g;

    public e(rn3.f fVar, java.lang.String str, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        this.f479482g = fVar;
        this.f479479d = str;
        this.f479480e = bitmap;
        this.f479481f = bitmap2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download url ");
        java.lang.String str = this.f479479d;
        sb6.append(str);
        sb6.append(" , result ");
        android.graphics.Bitmap bitmap = this.f479480e;
        sb6.append(bitmap == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NormalIconNewTipPreference", sb6.toString());
        rn3.f fVar = this.f479482g;
        if (str.equals(fVar.f479483a.f233891b2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f474056 = fVar.f479483a;
            c16742x4f474056.getClass();
            if (c16742x4f474056 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16738xd72a6f01) {
                android.graphics.Bitmap bitmap2 = this.f479481f;
                android.graphics.Bitmap s07 = (bitmap2 == null || bitmap2.isRecycled()) ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap2, false, fVar.f479483a.i0(bitmap2));
                fVar.f479483a.l0(s07);
                fVar.f479483a.R(s07);
            } else {
                fVar.f479483a.R(bitmap);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f4740562 = fVar.f479483a;
            c16742x4f4740562.f233891b2 = null;
            c16742x4f4740562.k0();
        }
    }
}
