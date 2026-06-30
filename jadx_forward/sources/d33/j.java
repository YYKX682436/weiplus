package d33;

/* loaded from: classes9.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f307774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f307775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f307776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307777g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f307778h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307779i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, int i17, int i18, yz5.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f) {
        super(0);
        this.f307774d = imageView;
        this.f307775e = bitmap;
        this.f307776f = i17;
        this.f307777g = i18;
        this.f307778h = pVar;
        this.f307779i = activityC15646xc9a7ee3f;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = this.f307774d;
        imageView.setImageBitmap(this.f307775e);
        int i17 = this.f307776f;
        int i18 = this.f307777g;
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
        this.f307778h.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f = this.f307779i;
        activityC15646xc9a7ee3f.A = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC15646xc9a7ee3f.f220009t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        return jz5.f0.f384359a;
    }
}
