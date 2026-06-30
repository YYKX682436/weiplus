package at2;

/* loaded from: classes3.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.b0 f13770d;

    public w(at2.b0 b0Var) {
        this.f13770d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/plugin/ReplayMiniViewPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        at2.b0 b0Var = this.f13770d;
        b0Var.getClass();
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(b0Var.R0().getContext())) {
            b0Var.t1();
        } else {
            com.tencent.mars.xlog.Log.i(b0Var.f13636p, "miniWindow, permission denied");
            ((ct2.j) b0Var.P0(ct2.j.class)).Y6(true);
            tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
            android.view.ViewGroup viewGroup = b0Var.f365323d;
            android.content.Context context = viewGroup.getContext();
            java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.eat);
            at2.y yVar = (at2.y) ((jz5.n) b0Var.f13637q).getValue();
            java.lang.String a17 = n25.a.a();
            ((sb0.f) iVar).getClass();
            com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.R6(context, 21, string, yVar, false, true, a17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayMiniViewPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
