package pk2;

/* loaded from: classes3.dex */
public final class wa implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.xa f437870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437871b;

    public wa(pk2.xa xaVar, pk2.o9 o9Var) {
        this.f437870a = xaVar;
        this.f437871b = o9Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorP2PSwitchOption", "p2p switch check=" + z17);
        r45.ll1 ll1Var = new r45.ll1();
        ll1Var.set(1, db2.t4.f309704a.a(8652));
        ll1Var.set(2, 1);
        java.util.LinkedList m75941xfb821914 = ll1Var.m75941xfb821914(3);
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 1);
        r45.pl1 pl1Var = new r45.pl1();
        pl1Var.set(0, java.lang.Boolean.valueOf(!z17));
        pl1Var.set(1, java.lang.Integer.valueOf(c01.id.e()));
        pk2.xa xaVar = this.f437870a;
        pl1Var.set(2, java.lang.Long.valueOf(((mm2.e1) xaVar.f445960a.c(mm2.e1.class)).f410516m));
        hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(pl1Var.mo14344x5f01b1f6()));
        m75941xfb821914.add(hx0Var);
        pq5.g l17 = ll1Var.d().l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        pm0.v.T(l17, new pk2.va(this.f437871b, xaVar, z17));
        qk2.f.f(xaVar, false, 1, null);
    }
}
