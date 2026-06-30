package i53;

/* loaded from: classes8.dex */
public class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f370196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f370197e;

    public m4(i53.n4 n4Var, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f370196d = imageView;
        this.f370197e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f370196d.setImageBitmap(this.f370197e);
    }
}
