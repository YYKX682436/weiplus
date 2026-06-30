package zl1;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f555120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f555121e;

    public f(zl1.t tVar, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f555120d = imageView;
        this.f555121e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f555120d.setImageBitmap(this.f555121e);
    }
}
