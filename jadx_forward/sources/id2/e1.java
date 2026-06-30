package id2;

/* loaded from: classes3.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372079d;

    public e1(id2.v1 v1Var) {
        this.f372079d = v1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshEditLevelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        id2.v1 v1Var = this.f372079d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(v1Var.m158354x19263085(), new java.util.ArrayList(v1Var.U6().keySet()));
        java.util.ArrayList arrayList2 = v1Var.C;
        c0Var.i(arrayList2.indexOf(java.lang.Integer.valueOf(v1Var.L)));
        c0Var.B = new id2.s1(v1Var);
        c0Var.f293792t = new id2.t1(v1Var, c0Var);
        android.view.View inflate = android.view.LayoutInflater.from(v1Var.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ary, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        int color = v1Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560596oq);
        android.widget.Button button = c0Var.f293785m;
        if (button != null) {
            button.setTextColor(color);
        }
        c0Var.h(2);
        android.widget.Button button2 = c0Var.f293784i;
        if (button2 != null) {
            button2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563234a12);
        }
        java.lang.String string = v1Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.diq);
        android.widget.Button button3 = c0Var.f293784i;
        if (button3 != null) {
            button3.setText(string);
        }
        c0Var.g(inflate);
        y9.i iVar = c0Var.f293779d;
        if (iVar != null) {
            iVar.getWindow().setDimAmount(0.0f);
        }
        c0Var.l();
        zl2.r4.f555483a.T2(2);
        android.view.View view2 = (android.view.View) ((jz5.n) v1Var.f372377q).mo141623x754a37bb();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "showChooseTargetLevelDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "showChooseTargetLevelDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View S6 = v1Var.S6();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(4);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(S6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "showChooseTargetLevelDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(S6, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "showChooseTargetLevelDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        v1Var.W6((java.lang.Integer) arrayList2.get(c0Var.b()));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshEditLevelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
