package sj3;

/* loaded from: classes14.dex */
public final class w2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f490322d;

    public w2(sj3.g3 g3Var) {
        this.f490322d = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        uj3.b0 b0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$openScreenCastBigVideo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sj3.g3 g3Var = this.f490322d;
        g3Var.f490070r = "";
        g3Var.l().f231798p.mo522xb5bdeb7a((p012xc85e97e9.p093xedfae76a.k0) ((jz5.n) g3Var.f490075w).mo141623x754a37bb());
        g3Var.i().f();
        g3Var.d().setVisibility(0);
        g3Var.d().a();
        g3Var.i().setVisibility(8);
        wj3.a aVar = g3Var.f490072t;
        if (aVar != null && (b0Var = aVar.f528279e) != null) {
            b0Var.g();
        }
        wj3.a aVar2 = g3Var.f490072t;
        if (aVar2 != null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) g3Var.f490067o).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "<get-screenCasePluginLayout>(...)");
            aVar2.g(relativeLayout);
        }
        g3Var.f490072t = null;
        g3Var.f().setOnClickListener(new sj3.h2(g3Var));
        g3Var.r(false);
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$openScreenCastBigVideo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
