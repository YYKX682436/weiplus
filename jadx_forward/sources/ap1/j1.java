package ap1;

/* loaded from: classes5.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f94222d;

    public j1(ap1.p1 p1Var) {
        this.f94222d = p1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ap1.p1 p1Var = this.f94222d;
        j75.f fVar = p1Var.f94258g;
        if (fVar == null) {
            fVar = p1Var.Q6();
            p1Var.f94258g = fVar;
        }
        if (fVar != null) {
            fVar.B3(new ap1.d(ap1.e.f94176h, null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamSearchContactUIC", "showSearchView");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = p1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        jz5.g gVar = p1Var.f94257f;
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).m78489xd6d59aa8(true, (com.p314xaae8f345.mm.ui.p2740x696c9db.c9) ((jz5.n) gVar).mo141623x754a37bb());
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.c9) ((jz5.n) gVar).mo141623x754a37bb()).c(true);
        em.c4 c4Var = p1Var.f94256e;
        if (c4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        c4Var.d().setVisibility(0);
        em.c4 c4Var2 = p1Var.f94256e;
        if (c4Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.widget.ListView d17 = c4Var2.d();
        ap1.i1 i1Var = p1Var.f94255d;
        if (i1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamSearchContactUIC", "showSearchView, create new SearchResultAdapter");
            i1Var = new ap1.i1(new ap1.l1(p1Var, p1Var), new ap1.n1(p1Var));
            p1Var.f94255d = i1Var;
        }
        d17.setAdapter((android.widget.ListAdapter) i1Var);
        em.c4 c4Var3 = p1Var.f94256e;
        if (c4Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        c4Var3.d().setOnItemClickListener(new ap1.o1(p1Var));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
