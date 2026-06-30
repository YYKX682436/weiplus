package ky2;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f395054f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f395055g;

    public d(android.view.View view, ky2.w wVar, int i17, android.widget.TextView textView) {
        this.f395052d = view;
        this.f395053e = wVar;
        this.f395054f = i17;
        this.f395055g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$SettingVoteViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f395052d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(view2.getContext(), 1, false);
        ky2.w wVar = this.f395053e;
        android.view.View view3 = this.f395052d;
        k0Var.f293405n = new ky2.b(wVar, view3);
        k0Var.f293414s = new ky2.c(wVar, this.f395054f, this.f395055g, view3, k0Var);
        java.lang.Object systemService = wVar.f395117d.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$SettingVoteViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
