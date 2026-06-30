package d04;

/* loaded from: classes8.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f307040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f307041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f307042f;

    public t1(android.graphics.Bitmap bitmap, int i17, android.widget.ImageView imageView) {
        this.f307040d = bitmap;
        this.f307041e = i17;
        this.f307042f = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f307040d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17333xea344dac.f241292n;
        int i17 = this.f307041e;
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17333xea344dac.f241292n.put(valueOf, bitmap);
        }
        android.widget.ImageView imageView = this.f307042f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(imageView.getTag(), java.lang.Integer.valueOf(i17))) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
