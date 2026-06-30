package md4;

/* loaded from: classes3.dex */
public final class c implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f407407d;

    public c(android.view.View view) {
        this.f407407d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$updateCardView$1");
        android.view.View view = this.f407407d;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        md4.e eVar = md4.e.f407410a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addGradientBackground", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.content.Context context = view.getContext();
        int[] iArr = {context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aml), context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aml), context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b), context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b)};
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bcb);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2208x373aa5.C18355xe50e56e5 c18355xe50e56e5 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2208x373aa5.C18355xe50e56e5) view.findViewById(com.p314xaae8f345.mm.R.id.f564933sj2);
        if (imageView == null || c18355xe50e56e5 == null || view.getHeight() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addGradientBackground", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        } else {
            float[] fArr = {0.0f, (imageView.getHeight() * 1.0f) / view.getHeight(), ((imageView.getHeight() + context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz)) * 1.0f) / view.getHeight(), 1.0f};
            android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
            paintDrawable.setCornerRadius(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
            paintDrawable.setShaderFactory(new md4.a(iArr, fArr));
            c18355xe50e56e5.setBackground(paintDrawable);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addGradientBackground", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$updateCardView$1");
    }
}
