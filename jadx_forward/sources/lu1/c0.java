package lu1;

/* loaded from: classes15.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f402855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lu1.d0 f402856e;

    public c0(lu1.d0 d0Var, android.graphics.Bitmap bitmap) {
        this.f402856e = d0Var;
        this.f402855d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        lu1.d0 d0Var = this.f402856e;
        d0Var.f402857a.setImageBitmap(this.f402855d);
        d0Var.f402857a.setColorFilter(d0Var.f402858b, android.graphics.PorterDuff.Mode.SRC_IN);
    }
}
