package mi5;

/* loaded from: classes3.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f408462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f408463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mi5.y0 f408464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408465g;

    public v0(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, mi5.y0 y0Var, java.lang.String str) {
        this.f408462d = bitmap;
        this.f408463e = c22699x3dcdb352;
        this.f408464f = y0Var;
        this.f408465g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f408465g;
        mi5.y0 y0Var = this.f408464f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f408463e;
        android.graphics.Bitmap bitmap = this.f408462d;
        if (bitmap == null || bitmap.isRecycled()) {
            c22699x3dcdb352.setImageBitmap(null);
            y0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ForwardPocketMoneyView", "[loadImage] bitmap is null or recycled: " + str);
            return;
        }
        c22699x3dcdb352.setImageBitmap(bitmap);
        y0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForwardPocketMoneyView", "[loadImage] image loaded successfully: " + str);
    }
}
