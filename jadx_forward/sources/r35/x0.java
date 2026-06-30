package r35;

/* loaded from: classes3.dex */
public class x0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f450854d;

    public x0(android.graphics.Bitmap bitmap) {
        this.f450854d = bitmap;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        android.graphics.Bitmap bitmap = this.f450854d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMConfirmDialog", "bitmap recycle %s", bitmap.toString());
        bitmap.recycle();
    }
}
