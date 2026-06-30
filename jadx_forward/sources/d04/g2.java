package d04;

/* loaded from: classes8.dex */
public final class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f306952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f306953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f306954f;

    public g2(android.graphics.Bitmap bitmap, int i17, android.widget.ImageView imageView) {
        this.f306952d = bitmap;
        this.f306953e = i17;
        this.f306954f = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f306952d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.B;
        int i18 = this.f306953e;
        java.lang.String valueOf = java.lang.String.valueOf(i18);
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.H.put(valueOf, bitmap);
        }
        android.widget.ImageView imageView = this.f306954f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(imageView.getTag(), java.lang.Integer.valueOf(i18))) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
