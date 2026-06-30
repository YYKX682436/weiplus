package d33;

/* loaded from: classes9.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f307770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f307771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f307773g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f, yz5.p pVar) {
        super(0);
        this.f307770d = imageView;
        this.f307771e = bitmap;
        this.f307772f = activityC15646xc9a7ee3f;
        this.f307773g = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f307771e;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight());
        android.widget.ImageView imageView = this.f307770d;
        imageView.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f = this.f307772f;
        activityC15646xc9a7ee3f.f220015z = bitmap;
        imageView.setImageBitmap(bitmap);
        this.f307773g.mo149xb9724478(java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
        activityC15646xc9a7ee3f.A = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC15646xc9a7ee3f.f220009t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        return jz5.f0.f384359a;
    }
}
