package r53;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f474214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r53.q f474215e;

    public p(r53.q qVar, android.graphics.Bitmap bitmap) {
        this.f474215e = qVar;
        this.f474214d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView = this.f474215e.f474218c;
        if (imageView != null) {
            imageView.setImageBitmap(this.f474214d);
        }
    }
}
