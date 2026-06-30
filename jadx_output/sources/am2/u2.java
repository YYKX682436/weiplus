package am2;

/* loaded from: classes3.dex */
public final class u2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.u2 f8757d = new am2.u2();

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        df2.cn cnVar;
        androidx.lifecycle.j0 j0Var;
        kotlin.jvm.internal.o.g(it, "it");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (cnVar = (df2.cn) liveRoomControllerStore.controller(df2.cn.class)) != null && (j0Var = cnVar.f229899w) != null) {
            r45.i62 i62Var = new r45.i62();
            i62Var.set(0, 5000);
            i62Var.set(1, 3600000);
            j0Var.postValue(i62Var);
        }
        return true;
    }
}
