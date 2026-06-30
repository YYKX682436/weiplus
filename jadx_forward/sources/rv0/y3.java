package rv0;

/* loaded from: classes5.dex */
public final class y3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481875d;

    public y3(rv0.n1 n1Var) {
        this.f481875d = n1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        rv0.n1 n1Var = this.f481875d;
        if (itemId == 1) {
            du0.v0 R6 = n1Var.R6();
            zw0.a[] aVarArr = zw0.a.f558083d;
            R6.S6("BatchClippingTimeRangeTo1s");
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(1.0d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33969x7905b775, "fromSeconds(...)");
            rv0.a4.b(n1Var, m33969x7905b775);
            return;
        }
        if (itemId == 2) {
            du0.v0 R62 = n1Var.R6();
            zw0.a[] aVarArr2 = zw0.a.f558083d;
            R62.S6("BatchClippingTimeRangeTo3s");
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b7752 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(3.0d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33969x7905b7752, "fromSeconds(...)");
            rv0.a4.b(n1Var, m33969x7905b7752);
            return;
        }
        if (itemId != 3) {
            return;
        }
        du0.v0 R63 = n1Var.R6();
        zw0.a[] aVarArr3 = zw0.a.f558083d;
        R63.S6("BatchClippingTimeRangeToOrigin");
        ex0.a0 s76 = n1Var.s7();
        if (s76 == null) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) s76.f338630g.f338710e).iterator();
        while (it.hasNext()) {
            ex0.r rVar = (ex0.r) it.next();
            rVar.g();
            rVar.h();
        }
        gx0.kh q76 = n1Var.q7();
        java.lang.String string = n1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574038lm0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        q76.r7(string, null);
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.v3(n1Var, s76, null), 3, null);
    }
}
