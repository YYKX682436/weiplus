package cy;

/* loaded from: classes5.dex */
public final class c implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f306190d;

    /* renamed from: e, reason: collision with root package name */
    public final int f306191e;

    /* renamed from: f, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f306192f;

    /* renamed from: g, reason: collision with root package name */
    public final cy.a f306193g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f306194h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f306195i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f306196m;

    /* renamed from: n, reason: collision with root package name */
    public cy.g f306197n;

    public c(android.content.Context hostContext, int i17, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 messenger, java.lang.String suffix, cy.a flutterApi, java.util.Map creationParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostContext, "hostContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messenger, "messenger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suffix, "suffix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterApi, "flutterApi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(creationParams, "creationParams");
        this.f306190d = hostContext;
        this.f306191e = i17;
        this.f306192f = messenger;
        this.f306193g = flutterApi;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(hostContext);
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f306194h = frameLayout;
        java.lang.Object obj = creationParams.get("itemId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        this.f306195i = str;
        java.lang.Object obj2 = creationParams.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str3 = str2 == null ? "" : str2;
        this.f306196m = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatbotCardPlatformView", "skip ChatbotCardHostApi setup on trunk viewId=" + i17 + " suffix=" + suffix);
        if (str3.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatbotCardPlatformView", "empty scene, viewId=" + i17 + " itemId=" + str);
            a("empty scene");
            b("INVALID_ARGS", "empty scene");
            return;
        }
        cy.h hVar = cy.h.f306199a;
        java.util.Map map = cy.h.f306200b;
        if (((cy.f) ((java.util.LinkedHashMap) map).get(str3)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatbotCardPlatformView", "scene builder not found: " + str3 + " viewId=" + i17 + " itemId=" + str + " registered=" + kz5.n0.S0(((java.util.LinkedHashMap) map).keySet()));
            a("unsupported scene: ".concat(str3));
            b("SCENE_NOT_FOUND", "scene=".concat(str3));
            return;
        }
        java.lang.Object obj3 = creationParams.get("payload");
        java.util.Map map2 = obj3 instanceof java.util.Map ? (java.util.Map) obj3 : null;
        java.util.Map map3 = kz5.q0.f395534d;
        java.util.Map map4 = map2 == null ? map3 : map2;
        java.lang.Object obj4 = creationParams.get("layout");
        java.util.Map map5 = obj4 instanceof java.util.Map ? (java.util.Map) obj4 : null;
        java.util.Map map6 = map5 == null ? map3 : map5;
        java.lang.Object obj5 = creationParams.get("theme");
        java.util.Map map7 = obj5 instanceof java.util.Map ? (java.util.Map) obj5 : null;
        try {
            dy.d dVar = new dy.d(hostContext, new cy.i(creationParams, map4, map6, map7 != null ? map7 : map3, flutterApi, str));
            this.f306197n = dVar;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            frameLayout.removeAllViews();
            frameLayout.addView(dVar, layoutParams);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scene view attached: scene=");
            sb6.append(str3);
            sb6.append(" viewId=");
            sb6.append(i17);
            sb6.append(" itemId=");
            sb6.append(str);
            sb6.append(" business=");
            sb6.append(this.f306197n != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatbotCardPlatformView", sb6.toString());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatbotCardPlatformView", "scene builder threw: scene=" + str3 + " viewId=" + i17 + ": " + th6);
            java.lang.String message = th6.getMessage();
            a("scene build failed: ".concat(message == null ? th6.getClass().getSimpleName() : message));
            b("SCENE_BUILD_FAILED", th6.getMessage());
        }
    }

    public final void a(java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(this.f306190d);
        textView.setText(str);
        textView.setTextColor(-7829368);
        textView.setGravity(17);
        textView.setPadding(16, 16, 16, 16);
        android.widget.FrameLayout frameLayout = this.f306194h;
        frameLayout.removeAllViews();
        frameLayout.addView(textView, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        try {
            cy.a aVar = this.f306193g;
            if (str2 == null) {
                str2 = "";
            }
            aVar.a(str, str2, new cy.b(str));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatbotCardPlatformView", "invokeError threw: " + th6);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatbotCardPlatformView", "platformView.dispose viewId=" + this.f306191e + " scene=" + this.f306196m + " itemId=" + this.f306195i);
        this.f306197n = null;
        this.f306194h.removeAllViews();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        return this.f306194h;
    }
}
