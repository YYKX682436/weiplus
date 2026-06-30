package lj2;

/* loaded from: classes10.dex */
public final class c0 implements qi2.s1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f400363a;

    /* renamed from: b, reason: collision with root package name */
    public final lj2.v0 f400364b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.t f400365c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.t f400366d;

    /* renamed from: e, reason: collision with root package name */
    public final lj2.s f400367e;

    /* renamed from: f, reason: collision with root package name */
    public final lj2.s f400368f;

    /* renamed from: g, reason: collision with root package name */
    public final qo0.c f400369g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f400370h;

    public c0(android.view.View root, lj2.v0 pluginAbility) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        this.f400363a = root;
        this.f400364b = pluginAbility;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.eob);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f400365c = new lj2.t(findViewById);
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.eod);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f400366d = new lj2.t(findViewById2);
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.f566095eo2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        lj2.s sVar = new lj2.s(findViewById3);
        this.f400367e = sVar;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.f566096eo3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        lj2.s sVar2 = new lj2.s(findViewById4);
        this.f400368f = sVar2;
        this.f400369g = pluginAbility.q();
        this.f400370h = true;
        lj2.u uVar = new lj2.u(this);
        sVar.f400476g.setOnClickListener(new lj2.q(uVar, this));
        sVar2.f400476g.setOnClickListener(new lj2.r(uVar, this));
    }

    public final lj2.s b() {
        return this.f400370h ? this.f400367e : this.f400368f;
    }

    public final lj2.t c() {
        return this.f400370h ? this.f400365c : this.f400366d;
    }

    public void d(yz5.a aVar) {
        if (b().f400470a.getVisibility() == 8) {
            return;
        }
        pm0.v.X(new lj2.w(this, aVar));
    }

    public void e(yz5.a aVar) {
        if (c().f400480a.getVisibility() == 8) {
            return;
        }
        pm0.v.X(new lj2.y(this, aVar));
    }

    public final void f(boolean z17) {
        this.f400370h = z17;
        this.f400367e.f400470a.setTranslationX(0.0f);
        this.f400365c.f400480a.setTranslationX(0.0f);
        this.f400368f.f400470a.setTranslationX(0.0f);
        this.f400366d.f400480a.setTranslationX(0.0f);
        android.view.ViewTreeObserver viewTreeObserver = this.f400363a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnPreDrawListener(new lj2.z(this));
        }
    }

    public void g(int i17) {
        android.view.View view = this.f400363a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
