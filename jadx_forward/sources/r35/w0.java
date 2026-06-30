package r35;

/* loaded from: classes9.dex */
public class w0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f450851d;

    public w0(android.graphics.Bitmap bitmap) {
        this.f450851d = bitmap;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        android.graphics.Bitmap bitmap = this.f450851d;
        if (bitmap != null) {
            bitmap.isRecycled();
        }
    }
}
