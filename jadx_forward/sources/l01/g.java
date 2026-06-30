package l01;

/* loaded from: classes7.dex */
public class g extends l01.w {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f396302h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l01.b bVar, android.widget.ImageView imageView, l01.b bVar2, java.lang.String str, l01.e0 e0Var, android.graphics.drawable.Drawable drawable) {
        super(imageView, bVar2, str, e0Var, null);
        this.f396302h = drawable;
    }

    @Override // l01.u
    public void d() {
        android.graphics.drawable.Drawable drawable;
        java.lang.ref.WeakReference weakReference = this.f396321d;
        if (((android.widget.ImageView) weakReference.get()) == null || (drawable = this.f396302h) == null) {
            return;
        }
        ((android.widget.ImageView) weakReference.get()).setImageDrawable(drawable);
    }
}
