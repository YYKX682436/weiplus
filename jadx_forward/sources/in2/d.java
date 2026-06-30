package in2;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f374348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f374349e;

    public d(in2.s sVar, android.view.View view) {
        this.f374348d = sVar;
        this.f374349e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in2.s sVar = this.f374348d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = sVar.P;
        boolean z17 = (viewOnClickListenerC22631x1cc07cc8 == null || viewOnClickListenerC22631x1cc07cc8.f292896x) ? false : true;
        android.view.View view2 = this.f374349e;
        if (z17) {
            if (viewOnClickListenerC22631x1cc07cc8 != null) {
                viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(true);
            }
            sf2.x xVar = sVar.I;
            xVar.q7(true);
            xVar.n7(true, new in2.l(sVar, true, view2));
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(view2.getContext(), 1, true);
            android.content.Context context = view2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570805by3, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odb);
            textView.setGravity(17);
            if (sVar.f0()) {
                textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.om_));
            } else {
                textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p1p));
            }
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            textView.setTextSize(1, 14.0f);
            k0Var.s(inflate, false);
            k0Var.f293405n = new in2.b(sVar, view2);
            k0Var.f293414s = new in2.c(sVar, view2);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
