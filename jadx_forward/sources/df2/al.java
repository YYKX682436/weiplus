package df2;

/* loaded from: classes3.dex */
public final class al implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f311261d;

    public al(df2.pl plVar) {
        this.f311261d = plVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.pl plVar = this.f311261d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(plVar.f312620m, "[delCustomText]");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(plVar.O6(), 1, false);
        android.view.View inflate = android.view.View.inflate(plVar.O6(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570437as5, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate;
        c22646x1e9ca55.b(com.p314xaae8f345.mm.ui.zk.a(plVar.O6(), 12), com.p314xaae8f345.mm.ui.zk.a(plVar.O6(), 12), 0.0f, 0.0f);
        android.widget.TextView textView = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f565984eb4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.widget.Button button = (android.widget.Button) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.khs);
        android.widget.Button button2 = (android.widget.Button) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        button.setOnClickListener(new df2.tk(plVar, c0Var, k0Var));
        button2.setOnClickListener(new df2.uk(k0Var));
        k0Var.f293387d = new df2.vk(c0Var, plVar);
        k0Var.f293405n = new df2.wk(k0Var, c22646x1e9ca55);
        k0Var.e(true);
        k0Var.v();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = plVar.f312623p;
        if (c22613xe7040d9c != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c, null, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
