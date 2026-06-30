package w65;

/* loaded from: classes9.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f524875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w65.c f524876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f524877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f524878g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.ref.WeakReference weakReference, w65.c cVar, java.lang.String str, android.graphics.Bitmap bitmap) {
        super(0);
        this.f524875d = weakReference;
        this.f524876e = cVar;
        this.f524877f = str;
        this.f524878g = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f524875d.get();
        if (imageView != null) {
            ((f80.b) this.f524876e).getClass();
            java.lang.Object tag = imageView.getTag(com.p314xaae8f345.mm.R.id.h9z);
            f80.b bVar = tag instanceof f80.b ? (f80.b) tag : null;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar != null ? bVar.f341610h : null, this.f524877f)) {
                imageView.setImageBitmap(this.f524878g);
            }
        }
        return jz5.f0.f384359a;
    }
}
