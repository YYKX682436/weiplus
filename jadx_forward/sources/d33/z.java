package d33;

/* loaded from: classes9.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f307837e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f, android.graphics.Bitmap bitmap) {
        super(0);
        this.f307836d = activityC15646xc9a7ee3f;
        this.f307837e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f = this.f307836d;
        android.widget.ImageView Z6 = activityC15646xc9a7ee3f.Z6();
        Z6.setVisibility(0);
        Z6.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        Z6.setImageBitmap(this.f307837e);
        activityC15646xc9a7ee3f.A = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC15646xc9a7ee3f.f220009t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        return jz5.f0.f384359a;
    }
}
