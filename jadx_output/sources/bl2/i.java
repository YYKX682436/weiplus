package bl2;

/* loaded from: classes9.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d22 f21714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bl2.k f21715e;

    public i(r45.d22 d22Var, bl2.k kVar) {
        this.f21714d = d22Var;
        this.f21715e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel$fillMusicPanel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bw5.lp0 lp0Var = new bw5.lp0();
        r45.d22 d22Var = this.f21714d;
        lp0Var.g(dk2.q.e(d22Var));
        bw5.v70 d17 = lp0Var.d();
        d17.y(1);
        java.lang.String string = d22Var.getString(9);
        if (string == null) {
            string = "";
        }
        d17.u(string);
        java.lang.String string2 = d22Var.getString(2);
        if (string2 == null) {
            string2 = "";
        }
        d17.p(string2);
        java.lang.String string3 = d22Var.getString(1);
        if (string3 == null) {
            string3 = "";
        }
        d17.x(string3);
        java.lang.String string4 = d22Var.getString(4);
        if (string4 == null) {
            string4 = "";
        }
        d17.q(string4);
        d17.r(d22Var.getInteger(12) * 1000);
        d17.t(true);
        bw5.z90 z90Var = new bw5.z90();
        java.lang.String string5 = d22Var.getString(1);
        if (string5 == null) {
            string5 = "";
        }
        z90Var.E(string5);
        java.lang.String string6 = d22Var.getString(2);
        if (string6 == null) {
            string6 = "";
        }
        z90Var.C(string6);
        java.lang.String string7 = d22Var.getString(7);
        if (string7 == null) {
            string7 = "";
        }
        z90Var.z(string7);
        java.lang.String string8 = d22Var.getString(4);
        z90Var.r(string8 != null ? string8 : "");
        z90Var.s(d22Var.getInteger(12) * 1000);
        d17.w(z90Var);
        lp0Var.j(d17);
        qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
        bw5.v70 d18 = lp0Var.d();
        kotlin.jvm.internal.o.f(d18, "getListenItem(...)");
        bl2.h hVar = new bl2.h(lp0Var, this.f21715e, d22Var);
        ((ef0.l4) i9Var).getClass();
        vk4.c cVar = new vk4.c(d18);
        cVar.l().q(new ef0.h4(cVar, hVar));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel$fillMusicPanel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
