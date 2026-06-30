package sc2;

/* loaded from: classes.dex */
public final class z5 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f487954a;

    public z5(sc2.d6 d6Var, android.widget.ImageView imageView) {
        this.f487954a = imageView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        jz5.f0 f0Var;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.widget.ImageView imageView = this.f487954a;
        if (bitmap != null) {
            pm0.v.X(new sc2.y5(imageView, bitmap));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            imageView.setVisibility(8);
        }
    }
}
