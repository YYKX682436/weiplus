package im2;

/* loaded from: classes.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373776d;

    public a1(im2.z3 z3Var) {
        this.f373776d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f373776d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(z3Var.m80379x76847179(), 0, 0);
        android.view.View inflate = android.view.LayoutInflater.from(z3Var.m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aw9, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f566824h64);
        android.webkit.WebView webView = (android.webkit.WebView) inflate.findViewById(com.p314xaae8f345.mm.R.id.fes);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.fer)).getPaint(), 0.8f);
        webView.loadUrl(z3Var.A1);
        webView.getLayoutParams().height = com.p314xaae8f345.mm.ui.bl.b(z3Var.m80379x76847179()).y / 2;
        findViewById.setOnClickListener(new im2.t3(z2Var));
        z2Var.k(inflate, 0, 0);
        z2Var.C();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
