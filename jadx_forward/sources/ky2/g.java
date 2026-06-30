package ky2;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f395072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f395073g;

    public g(ky2.w wVar, android.view.View view, android.widget.TextView textView, int i17) {
        this.f395070d = wVar;
        this.f395071e = view;
        this.f395072f = textView;
        this.f395073g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$SettingVoteViewHolder$_onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f395071e;
        android.content.Context context = view2.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ky2.w wVar = this.f395070d;
        wVar.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i17 = 1; i17 < 16; i17++) {
            arrayList2.add(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eju, java.lang.String.valueOf(i17)));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(view2.getContext(), arrayList2);
        c0Var.i(wVar.f395125o);
        android.view.View inflate = android.view.LayoutInflater.from(view2.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b1s, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mnn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        c0Var.g(inflate);
        c0Var.f293792t = new ky2.f(c0Var, this.f395072f, wVar, this.f395073g);
        java.lang.Object systemService = wVar.f395117d.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
        c0Var.l();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$SettingVoteViewHolder$_onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
