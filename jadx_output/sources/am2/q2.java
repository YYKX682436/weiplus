package am2;

/* loaded from: classes3.dex */
public final class q2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.x2 f8734d;

    public q2(am2.x2 x2Var) {
        this.f8734d = x2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        df2.g gVar;
        androidx.lifecycle.j0 j0Var;
        kotlin.jvm.internal.o.g(it, "it");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (gVar = (df2.g) liveRoomControllerStore.controller(df2.g.class)) != null && (j0Var = gVar.f230180p) != null) {
            r45.gw1 gw1Var = new r45.gw1();
            gw1Var.set(0, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            gw1Var.set(1, 6);
            am2.x2 x2Var = this.f8734d;
            gw1Var.set(2, x2Var.f8772a.getResources().getString(com.tencent.mm.R.string.mn_));
            gw1Var.set(3, x2Var.f8772a.getResources().getString(com.tencent.mm.R.string.mn9));
            j0Var.postValue(gw1Var);
        }
        return true;
    }
}
