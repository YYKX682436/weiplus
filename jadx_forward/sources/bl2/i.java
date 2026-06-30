package bl2;

/* loaded from: classes9.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d22 f103247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bl2.k f103248e;

    public i(r45.d22 d22Var, bl2.k kVar) {
        this.f103247d = d22Var;
        this.f103248e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel$fillMusicPanel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bw5.lp0 lp0Var = new bw5.lp0();
        r45.d22 d22Var = this.f103247d;
        lp0Var.g(dk2.q.e(d22Var));
        bw5.v70 d17 = lp0Var.d();
        d17.y(1);
        java.lang.String m75945x2fec8307 = d22Var.m75945x2fec8307(9);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        d17.u(m75945x2fec8307);
        java.lang.String m75945x2fec83072 = d22Var.m75945x2fec8307(2);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        d17.p(m75945x2fec83072);
        java.lang.String m75945x2fec83073 = d22Var.m75945x2fec8307(1);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        d17.x(m75945x2fec83073);
        java.lang.String m75945x2fec83074 = d22Var.m75945x2fec8307(4);
        if (m75945x2fec83074 == null) {
            m75945x2fec83074 = "";
        }
        d17.q(m75945x2fec83074);
        d17.r(d22Var.m75939xb282bd08(12) * 1000);
        d17.t(true);
        bw5.z90 z90Var = new bw5.z90();
        java.lang.String m75945x2fec83075 = d22Var.m75945x2fec8307(1);
        if (m75945x2fec83075 == null) {
            m75945x2fec83075 = "";
        }
        z90Var.E(m75945x2fec83075);
        java.lang.String m75945x2fec83076 = d22Var.m75945x2fec8307(2);
        if (m75945x2fec83076 == null) {
            m75945x2fec83076 = "";
        }
        z90Var.C(m75945x2fec83076);
        java.lang.String m75945x2fec83077 = d22Var.m75945x2fec8307(7);
        if (m75945x2fec83077 == null) {
            m75945x2fec83077 = "";
        }
        z90Var.z(m75945x2fec83077);
        java.lang.String m75945x2fec83078 = d22Var.m75945x2fec8307(4);
        z90Var.r(m75945x2fec83078 != null ? m75945x2fec83078 : "");
        z90Var.s(d22Var.m75939xb282bd08(12) * 1000);
        d17.w(z90Var);
        lp0Var.j(d17);
        qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
        bw5.v70 d18 = lp0Var.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getListenItem(...)");
        bl2.h hVar = new bl2.h(lp0Var, this.f103248e, d22Var);
        ((ef0.l4) i9Var).getClass();
        vk4.c cVar = new vk4.c(d18);
        cVar.l().q(new ef0.h4(cVar, hVar));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel$fillMusicPanel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
