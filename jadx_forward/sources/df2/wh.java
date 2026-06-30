package df2;

/* loaded from: classes3.dex */
public final class wh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.fi f313221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f313222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(df2.fi fiVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f313221d = fiVar;
        this.f313222e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View S6 = this.f313221d.S6(com.p314xaae8f345.mm.R.id.opb);
        android.widget.ImageView imageView = S6 != null ? (android.widget.ImageView) S6.findViewById(com.p314xaae8f345.mm.R.id.oiw) : null;
        if (imageView != null) {
            imageView.setImageBitmap(this.f313222e);
        }
        return jz5.f0.f384359a;
    }
}
