package am2;

/* loaded from: classes3.dex */
public final class q2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.x2 f90267d;

    public q2(am2.x2 x2Var) {
        this.f90267d = x2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        df2.g gVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e != null && (gVar = (df2.g) c14197x319b1b9e.m56798x25fe639c(df2.g.class)) != null && (j0Var = gVar.f311713p) != null) {
            r45.gw1 gw1Var = new r45.gw1();
            gw1Var.set(0, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            gw1Var.set(1, 6);
            am2.x2 x2Var = this.f90267d;
            gw1Var.set(2, x2Var.f90305a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mn_));
            gw1Var.set(3, x2Var.f90305a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mn9));
            j0Var.mo7808x76db6cb1(gw1Var);
        }
        return true;
    }
}
