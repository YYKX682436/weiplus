package af5;

/* loaded from: classes5.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ af5.d1 f86199d;

    public z0(af5.d1 d1Var) {
        this.f86199d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ThinkingAreaMvvmView$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        af5.d1 d1Var = this.f86199d;
        v11.m0 m0Var = (v11.m0) d1Var.m48328xa0ab20ce();
        if (m0Var != null) {
            v11.n0 n0Var = v11.n0.f513978d;
            v11.n0 n0Var2 = m0Var.f513975d;
            if (n0Var2 != n0Var && n0Var2 != v11.n0.f513979e) {
                d1Var.f86098h = !d1Var.f86098h;
                em.b4 b4Var = d1Var.f86096f;
                if (b4Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerVB");
                    throw null;
                }
                b4Var.a().setRotation(d1Var.f86098h ? 180.0f : 0.0f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThinkingAreaMvvmView", "[THINKING_TRACE] onToggleExpand: isExpanded=%b, state=%s", java.lang.Boolean.valueOf(d1Var.f86098h), n0Var2.name());
                yz5.p pVar = m0Var.f513976e;
                if (pVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ThinkingAreaMvvmView", "[THINKING_TRACE] onToggleExpand: onSwitch is null");
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b = d1Var.f86097g;
                    if (c22094xdaed490b == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thinkingMarkdownView");
                        throw null;
                    }
                    c22094xdaed490b.setVisibility(8);
                } else if (d1Var.f86098h) {
                    pVar.mo149xb9724478(java.lang.Boolean.TRUE, new af5.a1(d1Var));
                } else {
                    pVar.mo149xb9724478(java.lang.Boolean.FALSE, af5.b1.f86088d);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b2 = d1Var.f86097g;
                    if (c22094xdaed490b2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thinkingMarkdownView");
                        throw null;
                    }
                    c22094xdaed490b2.setVisibility(8);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ThinkingAreaMvvmView$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
