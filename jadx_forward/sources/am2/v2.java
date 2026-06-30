package am2;

/* loaded from: classes3.dex */
public final class v2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.v2 f90295d = new am2.v2();

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        df2.wt wtVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e != null && (wtVar = (df2.wt) c14197x319b1b9e.m56798x25fe639c(df2.wt.class)) != null && (j0Var = wtVar.f313244q) != null) {
            r45.e32 e32Var = new r45.e32();
            e32Var.set(0, java.lang.Boolean.TRUE);
            e32Var.set(3, 5000);
            e32Var.set(2, 30000);
            r45.h32 h32Var = new r45.h32();
            h32Var.set(0, java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)));
            h32Var.set(1, 1);
            h32Var.set(4, "test");
            h32Var.set(20, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(0) % 2 == 0 ? 1 : 0));
            e32Var.set(1, h32Var);
            j0Var.mo7808x76db6cb1(e32Var);
        }
        return true;
    }
}
