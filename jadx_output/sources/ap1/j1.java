package ap1;

/* loaded from: classes5.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f12689d;

    public j1(ap1.p1 p1Var) {
        this.f12689d = p1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ap1.p1 p1Var = this.f12689d;
        j75.f fVar = p1Var.f12725g;
        if (fVar == null) {
            fVar = p1Var.Q6();
            p1Var.f12725g = fVar;
        }
        if (fVar != null) {
            fVar.B3(new ap1.d(ap1.e.f12643h, null));
        }
        com.tencent.mars.xlog.Log.i("RoamSearchContactUIC", "showSearchView");
        androidx.appcompat.app.AppCompatActivity activity = p1Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        jz5.g gVar = p1Var.f12724f;
        ((com.tencent.mm.ui.MMActivity) activity).addSearchMenu(true, (com.tencent.mm.ui.tools.c9) ((jz5.n) gVar).getValue());
        ((com.tencent.mm.ui.tools.c9) ((jz5.n) gVar).getValue()).c(true);
        em.c4 c4Var = p1Var.f12723e;
        if (c4Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        c4Var.d().setVisibility(0);
        em.c4 c4Var2 = p1Var.f12723e;
        if (c4Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.ListView d17 = c4Var2.d();
        ap1.i1 i1Var = p1Var.f12722d;
        if (i1Var == null) {
            com.tencent.mars.xlog.Log.i("RoamSearchContactUIC", "showSearchView, create new SearchResultAdapter");
            i1Var = new ap1.i1(new ap1.l1(p1Var, p1Var), new ap1.n1(p1Var));
            p1Var.f12722d = i1Var;
        }
        d17.setAdapter((android.widget.ListAdapter) i1Var);
        em.c4 c4Var3 = p1Var.f12723e;
        if (c4Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        c4Var3.d().setOnItemClickListener(new ap1.o1(p1Var));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
