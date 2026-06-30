package df2;

/* loaded from: classes10.dex */
public final class kt implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f312132d;

    public kt(df2.lt ltVar) {
        this.f312132d = ltVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.lt ltVar = this.f312132d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = ltVar.G;
        if (c22641xff2656ea != null) {
            c22641xff2656ea.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = ltVar.H;
        boolean z17 = false;
        if (c22646x1e9ca55 != null) {
            c22646x1e9ca55.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout = ltVar.F;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        r45.q12 q12Var = ((mm2.e1) ltVar.m56788xbba4bfc0(mm2.e1.class)).f410522s;
        if (q12Var != null && q12Var.m75939xb282bd08(1) == 8) {
            z17 = true;
        }
        if (!z17 || ltVar.L) {
            return;
        }
        ltVar.L = true;
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.dk((ml2.r0) c17, 1, null, 2, null);
    }
}
