package n44;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f416448a;

    /* renamed from: b, reason: collision with root package name */
    public final int f416449b;

    /* renamed from: c, reason: collision with root package name */
    public final int f416450c;

    /* renamed from: d, reason: collision with root package name */
    public final int f416451d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f416452e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f416453f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f416454g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f416455h;

    public d(android.content.Context context, int i17, int i18, int i19, boolean z17, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 2) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560138ae2 : i17;
        i18 = (i27 & 4) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.adz : i18;
        i19 = (i27 & 8) != 0 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f563408cp4 : i19;
        z17 = (i27 & 16) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f416448a = context;
        this.f416449b = i17;
        this.f416450c = i18;
        this.f416451d = i19;
        this.f416452e = z17;
        this.f416453f = jz5.h.b(new n44.c(this));
        this.f416454g = jz5.h.b(new n44.a(this));
        jz5.h.b(new n44.b(this));
    }

    public final android.view.View a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeaderLine", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        android.view.View view = (android.view.View) ((jz5.n) this.f416453f).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeaderLine", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        return view;
    }

    public final android.view.View b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        android.view.View findViewById;
        android.view.View findViewById2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        android.view.View view = this.f416455h;
        android.content.Context context = this.f416448a;
        if (view == null) {
            this.f416455h = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dji, (android.view.ViewGroup) null);
        }
        android.view.View view2 = this.f416455h;
        if (view2 != null && (findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.f566749gy1)) != null) {
            findViewById2.setBackgroundResource(this.f416451d);
        }
        android.view.View view3 = this.f416455h;
        boolean z17 = this.f416452e;
        if (view3 != null && (findViewById = view3.findViewById(com.p314xaae8f345.mm.R.id.gxy)) != null) {
            if (!z17) {
                findViewById.getLayoutParams().height = -2;
            }
            findViewById.setBackgroundColor(context.getResources().getColor(this.f416449b));
        }
        android.view.View view4 = this.f416455h;
        if (view4 != null && (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view4.findViewById(com.p314xaae8f345.mm.R.id.gxz)) != null) {
            c22699x3dcdb352.setVisibility(z17 ? 0 : 8);
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(this.f416450c));
        }
        android.view.View view5 = this.f416455h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        return view5;
    }

    public final void c(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTranslationChange", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        if (!this.f416452e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTranslationChange", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
            return;
        }
        android.content.Context context = this.f416448a;
        float b17 = (f17 - 0) / (i65.a.b(context, 56) - 0);
        float f18 = (b17 - 0.5f) * 2.0f;
        if (f18 < 0.0f) {
            f18 = 0.0f;
        }
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        if (b17 > 1.0f) {
            b17 = 1.0f;
        }
        float f19 = 0.0f < b17 ? b17 : 0.0f;
        int b18 = i65.a.b(context, 16);
        int b19 = i65.a.b(context, 4);
        android.view.View a17 = a();
        android.view.ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        layoutParams.height = (int) (b19 + (f19 * (b18 - b19)));
        a17.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeaderArrow", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f416454g).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeaderArrow", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        c22699x3dcdb352.setAlpha(f18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTranslationChange", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
    }
}
