package h92;

/* loaded from: classes2.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec a(android.content.Context context, android.view.Window window, h92.a builder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderAccountSwitchDrawer", "createDrawerToAttachWindow ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec drawer = builder.k(context);
        h92.d dVar = (h92.d) builder;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawer, "drawer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawer.getContext(), "getContext(...)");
        dVar.f361222d = drawer;
        drawer.m82809x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563043v6);
        drawer.m82805x59f38d7d(true);
        drawer.h(dVar);
        int g17 = com.p314xaae8f345.mm.ui.bl.g(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderAccountSwitchDrawer", "[initView] bottomMargin= " + g17);
        android.view.View decorView = window.getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((android.widget.FrameLayout) decorView).addView(drawer, layoutParams);
        builder.g(context, drawer.m82795xcb847e8d());
        builder.h(context, drawer.m82792x510df255());
        android.widget.FrameLayout loadingLayout = drawer.m82797xccb9a7d0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadingLayout, "loadingLayout");
        loadingLayout.setVisibility(8);
        builder.l(context, drawer.m82794x2d5b4f1b());
        return drawer;
    }
}
