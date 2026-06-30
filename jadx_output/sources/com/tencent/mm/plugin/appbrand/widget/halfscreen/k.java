package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.widget.halfscreen.j f91180e = new com.tencent.mm.plugin.appbrand.widget.halfscreen.j(null);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f91181f = jz5.h.b(com.tencent.mm.plugin.appbrand.widget.halfscreen.i.f91175d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f91182g = jz5.h.b(com.tencent.mm.plugin.appbrand.widget.halfscreen.h.f91171d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f91183h = jz5.h.b(com.tencent.mm.plugin.appbrand.widget.halfscreen.g.f91169d);

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f91184a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f91185b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f91186c;

    /* renamed from: d, reason: collision with root package name */
    public final int f91187d;

    public k(android.view.View panelIndicator) {
        kotlin.jvm.internal.o.g(panelIndicator, "panelIndicator");
        this.f91184a = panelIndicator;
        android.view.View findViewById = panelIndicator.findViewById(com.tencent.mm.R.id.gxz);
        this.f91186c = findViewById;
        android.view.View findViewById2 = panelIndicator.findViewById(com.tencent.mm.R.id.f485216gy1);
        this.f91185b = findViewById2;
        this.f91187d = panelIndicator.getLayoutParams().height;
        com.tencent.mars.xlog.Log.i("AppBrandHalfScreenPanelHeadIndicatorHolder", "init headerLine:" + findViewById2 + ",headerArrow:" + findViewById);
    }
}
