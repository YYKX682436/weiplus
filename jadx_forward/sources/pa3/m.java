package pa3;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f434524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f434525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.widget.ImageView imageView, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(0);
        this.f434524d = imageView;
        this.f434525e = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = this.f434524d;
        imageView.setVisibility(8);
        android.view.ViewParent parent = imageView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(imageView);
        }
        imageView.setImageDrawable(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f434525e;
        java.lang.Object obj = h0Var.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        if (!((android.graphics.Bitmap) obj).isRecycled()) {
            java.lang.Object obj2 = h0Var.f391656d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            ((android.graphics.Bitmap) obj2).recycle();
        }
        h0Var.f391656d = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppMultiTaskHelper", "coverBitmapToAvoidWhiteScreen remove coverBitmap");
        return jz5.f0.f384359a;
    }
}
