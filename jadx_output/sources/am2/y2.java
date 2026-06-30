package am2;

/* loaded from: classes3.dex */
public final class y2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.g3 f8777d;

    public y2(am2.g3 g3Var) {
        this.f8777d = g3Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        df2.ip ipVar;
        androidx.lifecycle.j0 j0Var;
        kotlin.jvm.internal.o.g(it, "it");
        r45.o35 o35Var = new r45.o35();
        o35Var.set(1, am2.g3.a(this.f8777d));
        o35Var.set(2, "背包收到新礼物，送给主播吧");
        o35Var.set(4, 1);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (ipVar = (df2.ip) liveRoomControllerStore.controller(df2.ip.class)) != null && (j0Var = ipVar.f230420o) != null) {
            j0Var.postValue(o35Var);
        }
        return true;
    }
}
