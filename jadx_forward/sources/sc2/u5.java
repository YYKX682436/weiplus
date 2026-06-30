package sc2;

/* loaded from: classes2.dex */
public final class u5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f487817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487820g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(sc2.d6 d6Var, android.view.View view, android.view.View view2, android.view.View view3) {
        super(0);
        this.f487817d = d6Var;
        this.f487818e = view;
        this.f487819f = view2;
        this.f487820g = view3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0;
        android.view.View view = this.f487819f;
        sc2.d6 d6Var = this.f487817d;
        d6Var.getClass();
        android.view.View view2 = this.f487818e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) view2.findViewById(com.p314xaae8f345.mm.R.id.eej);
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.edk);
        android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.f566015pw4);
        android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.eet);
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.lte);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca552 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) view2.findViewById(com.p314xaae8f345.mm.R.id.eei);
        android.widget.TextView textView2 = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.edj);
        android.view.View findViewById4 = view2.findViewById(com.p314xaae8f345.mm.R.id.edl);
        android.view.View findViewById5 = view2.findViewById(com.p314xaae8f345.mm.R.id.ees);
        android.view.View findViewById6 = view2.findViewById(com.p314xaae8f345.mm.R.id.ltf);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view3 = this.f487820g;
        view3.getGlobalVisibleRect(rect);
        xc2.p0 p0Var = d6Var.f84680h;
        if ((p0Var == null || (c19786x6a1e2862 = p0Var.f534767a) == null || (m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0()) == null || m76506x42318aa0.m77224x4236b52c() != 14) ? false : true) {
            android.view.View findViewById7 = view2.findViewById(com.p314xaae8f345.mm.R.id.kfm);
            findViewById7.animate().cancel();
            findViewById7.animate().alpha(0.0f).setDuration(100L).start();
        }
        findViewById5.animate().cancel();
        findViewById5.animate().alpha(0.0f).setDuration(100L).start();
        ad2.h.F(d6Var, view, view3, 0L, null, new sc2.k5(view3, view, findViewById2), 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22646x1e9ca552);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22646x1e9ca55);
        ad2.h.F(d6Var, c22646x1e9ca552, c22646x1e9ca55, 0L, null, null, 28, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        ad2.h.F(d6Var, textView2, textView, 0L, null, null, 28, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        ad2.h.F(d6Var, findViewById4, findViewById, 0L, null, null, 28, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
        ad2.h.F(d6Var, findViewById5, findViewById2, 0L, null, null, 28, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById3);
        ad2.h.F(d6Var, findViewById6, findViewById3, 0L, null, null, 28, null);
        return jz5.f0.f384359a;
    }
}
