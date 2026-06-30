package af5;

/* loaded from: classes5.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ af5.d1 f4666d;

    public z0(af5.d1 d1Var) {
        this.f4666d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ThinkingAreaMvvmView$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        af5.d1 d1Var = this.f4666d;
        v11.m0 m0Var = (v11.m0) d1Var.getViewModel();
        if (m0Var != null) {
            v11.n0 n0Var = v11.n0.f432445d;
            v11.n0 n0Var2 = m0Var.f432442d;
            if (n0Var2 != n0Var && n0Var2 != v11.n0.f432446e) {
                d1Var.f4565h = !d1Var.f4565h;
                em.b4 b4Var = d1Var.f4563f;
                if (b4Var == null) {
                    kotlin.jvm.internal.o.o("headerVB");
                    throw null;
                }
                b4Var.a().setRotation(d1Var.f4565h ? 180.0f : 0.0f);
                com.tencent.mars.xlog.Log.i("MicroMsg.ThinkingAreaMvvmView", "[THINKING_TRACE] onToggleExpand: isExpanded=%b, state=%s", java.lang.Boolean.valueOf(d1Var.f4565h), n0Var2.name());
                yz5.p pVar = m0Var.f432443e;
                if (pVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ThinkingAreaMvvmView", "[THINKING_TRACE] onToggleExpand: onSwitch is null");
                    com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView = d1Var.f4564g;
                    if (markdownNativeMvvmView == null) {
                        kotlin.jvm.internal.o.o("thinkingMarkdownView");
                        throw null;
                    }
                    markdownNativeMvvmView.setVisibility(8);
                } else if (d1Var.f4565h) {
                    pVar.invoke(java.lang.Boolean.TRUE, new af5.a1(d1Var));
                } else {
                    pVar.invoke(java.lang.Boolean.FALSE, af5.b1.f4555d);
                    com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView2 = d1Var.f4564g;
                    if (markdownNativeMvvmView2 == null) {
                        kotlin.jvm.internal.o.o("thinkingMarkdownView");
                        throw null;
                    }
                    markdownNativeMvvmView2.setVisibility(8);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ThinkingAreaMvvmView$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
