package ga2;

/* loaded from: classes.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f351366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f351367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(in5.s0 s0Var, android.graphics.Bitmap bitmap) {
        super(0);
        this.f351366d = s0Var;
        this.f351367e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f351366d.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tsh);
        if (imageView != null) {
            imageView.setImageBitmap(this.f351367e);
        }
        return jz5.f0.f384359a;
    }
}
