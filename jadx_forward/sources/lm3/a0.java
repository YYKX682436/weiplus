package lm3;

/* loaded from: classes10.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.b0 f400998d;

    public a0(lm3.b0 b0Var) {
        this.f400998d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initSongInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        lm3.b0 b0Var = this.f400998d;
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) eVar).Ui(b0Var.f401003e, 7, r45.bt4.class);
        if (bt4Var != null) {
            bt4Var.f452587y = 3;
        }
        b21.m.j();
        ((ja0.c0) ((ka0.h0) i95.n0.c(ka0.h0.class))).getClass();
        ll3.q0.b(true);
        if (((ka0.h0) i95.n0.c(ka0.h0.class)) != null) {
            ll3.b1 b1Var = ll3.b1.f400673a;
            ll3.e1 e1Var = ll3.b1.f400674b;
            if (e1Var != null) {
                e1Var.f400693x = false;
            }
        }
        b0Var.f401003e.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initSongInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
