package po0;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f438818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f438820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f438821g;

    public d(android.graphics.Bitmap bitmap, yz5.l lVar, float f17, int i17) {
        this.f438818d = bitmap;
        this.f438819e = lVar;
        this.f438820f = f17;
        this.f438821g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f438819e;
        android.graphics.Bitmap bitmap = this.f438818d;
        if (bitmap == null) {
            if (lVar != null) {
                lVar.mo146xb9724478(null);
                return;
            }
            return;
        }
        try {
            um5.d dVar = new um5.d();
            dVar.b(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            dVar.f510674b = width;
            dVar.f510675c = height;
            uq5.b b17 = dVar.f510677e.f510726b.b();
            b17.d(this.f438820f);
            b17.e(5.0f);
            dVar.a(new po0.b(this.f438821g, lVar));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveBitmapUtil", "fastblur failed: " + e17.getMessage());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new po0.c(lVar));
        }
    }
}
