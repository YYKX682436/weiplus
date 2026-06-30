package gt4;

/* loaded from: classes9.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f356994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gt4.k2 f356995e;

    public j2(gt4.k2 k2Var, android.graphics.Bitmap bitmap) {
        this.f356995e = k2Var;
        this.f356994d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        gt4.k2 k2Var = this.f356995e;
        k2Var.f356998a.f262271m.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        k2Var.f356998a.f262271m.setImageBitmap(this.f356994d);
    }
}
