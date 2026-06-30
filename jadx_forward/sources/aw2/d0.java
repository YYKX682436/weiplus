package aw2;

/* loaded from: classes2.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.j0 f96275d;

    public d0(aw2.j0 j0Var) {
        this.f96275d = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.sd1 sd1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderPostMusicWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        aw2.j0 j0Var = this.f96275d;
        r45.ao2 ao2Var = j0Var.f96294h;
        if (ao2Var != null && (sd1Var = (r45.sd1) ao2Var.m75936x14adae67(3)) != null) {
            j0Var.f96295i = uo2.m0.f511166b.a(j0Var.f96290d, sd1Var, "originalId=" + j0Var.f96292f, new aw2.f0(j0Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderPostMusicWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
