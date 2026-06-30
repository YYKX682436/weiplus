package eq1;

/* loaded from: classes8.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f337320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337321f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, android.widget.ImageView imageView, java.lang.String str2) {
        super(1);
        this.f337319d = str;
        this.f337320e = imageView;
        this.f337321f = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.widget.ImageView imageView = this.f337320e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f337319d, imageView.getTag(com.p314xaae8f345.mm.R.id.bph))) {
            eq1.h hVar = eq1.h.f337345a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "setForegroundPic requestEffect effectBitmap:" + bitmap);
            n11.a.b().o(this.f337321f, bitmap);
            imageView.setImageBitmap(bitmap);
        } else {
            eq1.h hVar2 = eq1.h.f337345a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "recycled");
        }
        return jz5.f0.f384359a;
    }
}
