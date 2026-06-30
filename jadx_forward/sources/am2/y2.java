package am2;

/* loaded from: classes3.dex */
public final class y2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.g3 f90310d;

    public y2(am2.g3 g3Var) {
        this.f90310d = g3Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        df2.ip ipVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        r45.o35 o35Var = new r45.o35();
        o35Var.set(1, am2.g3.a(this.f90310d));
        o35Var.set(2, "背包收到新礼物，送给主播吧");
        o35Var.set(4, 1);
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e != null && (ipVar = (df2.ip) c14197x319b1b9e.m56798x25fe639c(df2.ip.class)) != null && (j0Var = ipVar.f311953o) != null) {
            j0Var.mo7808x76db6cb1(o35Var);
        }
        return true;
    }
}
