package d33;

/* loaded from: classes9.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f307765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.b f307767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f307768g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f, com.p314xaae8f345.mm.p1006xc5476f33.gif.b bVar, yz5.p pVar) {
        super(0);
        this.f307765d = imageView;
        this.f307766e = activityC15646xc9a7ee3f;
        this.f307767f = bVar;
        this.f307768g = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f = this.f307766e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC15646xc9a7ee3f.f220009t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activityC15646xc9a7ee3f.A = true;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.b bVar = this.f307767f;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(bVar.getIntrinsicWidth(), bVar.getIntrinsicHeight());
        android.widget.ImageView imageView = this.f307765d;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageDrawable(bVar);
        this.f307768g.mo149xb9724478(java.lang.Integer.valueOf(bVar.getIntrinsicWidth()), java.lang.Integer.valueOf(bVar.getIntrinsicHeight()));
        return jz5.f0.f384359a;
    }
}
