package r35;

/* loaded from: classes9.dex */
public class v0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f450819d;

    public v0(android.graphics.Bitmap bitmap) {
        this.f450819d = bitmap;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        android.graphics.Bitmap bitmap = this.f450819d;
        if (bitmap != null) {
            bitmap.isRecycled();
        }
    }
}
