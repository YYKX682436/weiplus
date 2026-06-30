package sp2;

/* loaded from: classes2.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492570d;

    public g0(sp2.o2 o2Var) {
        this.f492570d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sp2.o2 o2Var = this.f492570d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = o2Var.f492672j;
        if (c14595xffb7e034 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = c14595xffb7e034.m7949x5701d990();
        boolean z17 = false;
        if (m7949x5701d990 != null && m7949x5701d990.o()) {
            z17 = true;
        }
        if (z17) {
            m7949x5701d990.p(new sp2.i0(o2Var));
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(o2Var.f492662e, null, null, new sp2.j0(o2Var, null), 3, null);
        }
    }
}
