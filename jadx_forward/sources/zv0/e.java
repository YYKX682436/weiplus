package zv0;

/* loaded from: classes5.dex */
public final class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f557702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zv0.r f557703e;

    public e(rv0.n1 n1Var, zv0.r rVar) {
        this.f557702d = n1Var;
        this.f557703e = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        rv0.n1 n1Var = this.f557702d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(n1Var, "<this>");
        zv0.r transitionInfo = this.f557703e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transitionInfo, "transitionInfo");
        zu0.i iVar = zu0.i.f557207d;
        zu0.i iVar2 = transitionInfo.f557755b;
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 = transitionInfo.f557754a;
        if (iVar2 != iVar || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c4104x6d422cb2.f129757b, zv0.r.f557753d.f557754a.f129757b)) {
            ex0.a0 s76 = n1Var.s7();
            if (s76 != null) {
                java.lang.String str = c4104x6d422cb2.f129757b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMaterialID(...)");
                java.util.Iterator it = ((java.util.ArrayList) s76.f338630g.f338714i).iterator();
                while (it.hasNext()) {
                    s76.x((ex0.j0) it.next(), str);
                }
                s76.J(cx0.d.f306043f.a(cx0.d.f306042e), null);
            }
            ex0.a0 s77 = n1Var.s7();
            if (s77 != null) {
                ex0.i0.m(s77);
            }
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = n1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m1t);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            q76.r7(string, null);
            zv0.f0 f0Var = n1Var.f481670y;
            if (f0Var != null) {
                f0Var.D = false;
            }
            if (f0Var != null) {
                f0Var.e(true, true);
            }
            p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new zv0.a(n1Var, null), 3, null);
        }
    }
}
