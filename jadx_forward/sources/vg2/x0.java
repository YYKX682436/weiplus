package vg2;

/* loaded from: classes3.dex */
public final class x0 extends vg2.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f518149f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.content.Context context, android.view.ViewGroup parentRoot) {
        super(context, parentRoot);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentRoot, "parentRoot");
        this.f518149f = "GiftSamePkgGiftWidget";
    }

    @Override // vg2.c
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dc7;
    }

    @Override // vg2.c
    public void d(android.view.ViewGroup attachView, java.lang.String giftId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachView, "attachView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        super.d(attachView, giftId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f518149f, "[showWidget] giftId:".concat(giftId));
        this.f518018c.setOnClickListener(new vg2.w0(this));
    }
}
