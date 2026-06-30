package sc2;

/* loaded from: classes2.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f487542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f487543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f487544g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(android.view.View view, android.view.ViewGroup viewGroup, sc2.f2 f2Var, android.view.ViewGroup viewGroup2) {
        super(0);
        this.f487541d = view;
        this.f487542e = viewGroup;
        this.f487543f = f2Var;
        this.f487544g = viewGroup2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f487541d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) view.findViewById(com.p314xaae8f345.mm.R.id.tdu);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.tdc);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.tdb);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.tdx);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca552 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) view.findViewById(com.p314xaae8f345.mm.R.id.eei);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.edj);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.edl);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.ees);
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.f566033q54);
        this.f487542e.getGlobalVisibleRect(new android.graphics.Rect());
        sc2.f2 f2Var = this.f487543f;
        android.view.ViewGroup viewGroup3 = this.f487544g;
        android.view.ViewGroup viewGroup4 = this.f487542e;
        ad2.h.F(f2Var, viewGroup3, viewGroup4, 250L, null, new sc2.j1(viewGroup4, viewGroup3, viewGroup, findViewById3), 8, null);
        sc2.f2 f2Var2 = this.f487543f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22646x1e9ca552);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22646x1e9ca55);
        ad2.h.F(f2Var2, c22646x1e9ca552, c22646x1e9ca55, 250L, null, null, 24, null);
        sc2.f2 f2Var3 = this.f487543f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        ad2.h.F(f2Var3, textView2, textView, 250L, null, null, 24, null);
        sc2.f2 f2Var4 = this.f487543f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        ad2.h.F(f2Var4, findViewById2, findViewById, 250L, null, null, 24, null);
        sc2.f2 f2Var5 = this.f487543f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup2);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        ad2.h.F(f2Var5, viewGroup2, viewGroup2, 250L, valueOf, null, 16, null);
        viewGroup.setAlpha(0.0f);
        if (findViewById3.getVisibility() == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(valueOf);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$animateExpandDesc$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$animateExpandDesc$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f384359a;
    }
}
