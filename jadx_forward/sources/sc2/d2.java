package sc2;

/* loaded from: classes2.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f487360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487361g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(android.view.View view, android.view.View view2, sc2.f2 f2Var, android.view.View view3) {
        super(0);
        this.f487358d = view;
        this.f487359e = view2;
        this.f487360f = f2Var;
        this.f487361g = view3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f487358d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) view.findViewById(com.p314xaae8f345.mm.R.id.eej);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.edk);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f566015pw4);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.eet);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca552 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) view.findViewById(com.p314xaae8f345.mm.R.id.eei);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.edj);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.edl);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.ees);
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.f566033q54);
        this.f487359e.getGlobalVisibleRect(new android.graphics.Rect());
        sc2.f2 f2Var = this.f487360f;
        android.view.View view2 = this.f487361g;
        android.view.View view3 = this.f487359e;
        ad2.h.F(f2Var, view2, view3, 0L, null, new sc2.c2(view3, view2, viewGroup, findViewById3), 12, null);
        sc2.f2 f2Var2 = this.f487360f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22646x1e9ca552);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22646x1e9ca55);
        ad2.h.F(f2Var2, c22646x1e9ca552, c22646x1e9ca55, 0L, null, null, 28, null);
        sc2.f2 f2Var3 = this.f487360f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        ad2.h.F(f2Var3, textView2, textView, 0L, null, null, 28, null);
        sc2.f2 f2Var4 = this.f487360f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        ad2.h.F(f2Var4, findViewById2, findViewById, 0L, null, null, 28, null);
        sc2.f2 f2Var5 = this.f487360f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup2);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        ad2.h.F(f2Var5, viewGroup2, viewGroup2, 0L, valueOf, null, 20, null);
        viewGroup.setAlpha(0.0f);
        if (findViewById3.getVisibility() == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(valueOf);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$originalExpandAnimate$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$originalExpandAnimate$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f384359a;
    }
}
