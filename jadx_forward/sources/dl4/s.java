package dl4;

/* loaded from: classes.dex */
public final class s implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f316998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f316999c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff0.v f317000d;

    public s(java.lang.String str, android.widget.ImageView imageView, dl4.m0 m0Var, ff0.v vVar) {
        this.f316997a = str;
        this.f316998b = imageView;
        this.f316999c = m0Var;
        this.f317000d = vVar;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... extraObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraObj, "extraObj");
        if (bitmap != null) {
            bitmap.getWidth();
        }
        if (bitmap != null) {
            bitmap.getHeight();
        }
        android.widget.ImageView imageView = this.f316998b;
        if (imageView != null) {
            imageView.getTag(com.p314xaae8f345.mm.R.id.o9g);
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(imageView != null ? imageView.getTag(com.p314xaae8f345.mm.R.id.o9g) : null, this.f316997a);
        ff0.v vVar = this.f317000d;
        if (!b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingImageFeatureService", "loadTingImage onImageLoadComplete tag not equal, imageView: %s", imageView);
            if (vVar != null) {
                vVar.a(str, view, bitmap, imageView == null);
                return;
            }
            return;
        }
        this.f316999c.getClass();
        pm0.v.X(new dl4.l0(bitmap, imageView));
        if (vVar != null) {
            vVar.a(str, view, bitmap, (bitmap == null || bitmap.isRecycled()) ? false : true);
        }
    }
}
