package j00;

/* loaded from: classes.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f378379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f378381f;

    public o0(android.graphics.Bitmap bitmap, java.lang.String str, android.widget.ImageView imageView) {
        this.f378379d = bitmap;
        this.f378380e = str;
        this.f378381f = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f378380e;
        android.graphics.Bitmap bitmap = this.f378379d;
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "loadGiftMsgBubbleCover, final bitmap is null, url:" + str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "loadGiftMsgBubbleCover, set bitmap, url:" + str);
        this.f378381f.setImageBitmap(bitmap);
    }
}
