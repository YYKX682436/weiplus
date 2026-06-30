package lh4;

/* loaded from: classes8.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lh4.l f400250d;

    public j(lh4.l lVar) {
        this.f400250d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionMusicGuideView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lh4.l lVar = this.f400250d;
        lVar.getClass();
        o11.g gVar = gh4.j0.f353466a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarConfig", "recordMusicGuideClicked");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("taskbar_config").putBoolean("music_guide_clicked", true);
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Di(1134);
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) lVar.m145775x71965dbb();
        c18557xc00aa3f3.u(17, false, false, null);
        c18557xc00aa3f3.G2 = 19;
        c18557xc00aa3f3.E2 = true;
        ku5.u0 u0Var = ku5.t0.f394148d;
        lh4.k kVar = new lh4.k(lVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(kVar, 0L, false);
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionMusicGuideView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
