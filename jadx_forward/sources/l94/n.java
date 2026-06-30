package l94;

/* loaded from: classes4.dex */
public final class n extends l94.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context) {
        super("WsFoldAdItemComponent", context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // l94.e
    public boolean g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShouldRegisterEventHandler", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdItemComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShouldRegisterEventHandler", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdItemComponent");
        return true;
    }

    @Override // l94.e
    public android.view.View k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdItemComponent");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(f());
        c44.a.l();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = -1;
            frameLayout.setLayoutParams(layoutParams);
        }
        c44.a.o();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = -2;
            frameLayout.setLayoutParams(layoutParams2);
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
        frameLayout.addView(linearLayout);
        c44.a.l();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            layoutParams3.width = -1;
            linearLayout.setLayoutParams(layoutParams3);
        }
        c44.a.o();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
            layoutParams4.height = -2;
            linearLayout.setLayoutParams(layoutParams4);
        }
        c44.a.m();
        linearLayout.setOrientation(1);
        int a17 = c44.b.a(20);
        android.view.ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = a17;
        }
        int a18 = c44.b.a(20);
        android.view.ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams6 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams6 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = a18;
        }
        int a19 = c44.b.a(20);
        android.view.ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams7 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams7 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.topMargin = a19;
        }
        android.content.Context context = linearLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        b(new l94.p(context), linearLayout);
        android.view.View view = new android.view.View(linearLayout.getContext());
        linearLayout.addView(view);
        c44.a.l();
        if (view.getLayoutParams() == null) {
            c44.a.o();
            view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
            layoutParams8.width = -1;
            view.setLayoutParams(layoutParams8);
        }
        int a27 = c44.b.a(12);
        if (view.getLayoutParams() == null) {
            c44.a.o();
            view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a27));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
            layoutParams9.height = a27;
            view.setLayoutParams(layoutParams9);
        }
        android.content.Context context2 = linearLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        b(new l94.k(context2), linearLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdItemComponent");
        return frameLayout;
    }

    @Override // l94.e
    public void l(h94.a adInfo, l94.l eventData) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onHandleViewEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdItemComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventData, "eventData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEventType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEventType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        if (eventData.f398907a == l94.m.f398913f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickInfo", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickInfo", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
            r45.x30 x30Var = eventData.f398910d;
            if (x30Var != null) {
                g94.a aVar = new g94.a(adInfo, x30Var, f());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickPos", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickPos", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
                aVar.a(eventData.f398908b);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h(), "the click info is null, please check it");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHandleViewEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdItemComponent");
    }
}
