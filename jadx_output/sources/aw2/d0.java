package aw2;

/* loaded from: classes2.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.j0 f14742d;

    public d0(aw2.j0 j0Var) {
        this.f14742d = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.sd1 sd1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderPostMusicWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        aw2.j0 j0Var = this.f14742d;
        r45.ao2 ao2Var = j0Var.f14761h;
        if (ao2Var != null && (sd1Var = (r45.sd1) ao2Var.getCustom(3)) != null) {
            j0Var.f14762i = uo2.m0.f429633b.a(j0Var.f14757d, sd1Var, "originalId=" + j0Var.f14759f, new aw2.f0(j0Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderPostMusicWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
