package am2;

/* loaded from: classes3.dex */
public final class v2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.v2 f8762d = new am2.v2();

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        df2.wt wtVar;
        androidx.lifecycle.j0 j0Var;
        kotlin.jvm.internal.o.g(it, "it");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (wtVar = (df2.wt) liveRoomControllerStore.controller(df2.wt.class)) != null && (j0Var = wtVar.f231711q) != null) {
            r45.e32 e32Var = new r45.e32();
            e32Var.set(0, java.lang.Boolean.TRUE);
            e32Var.set(3, 5000);
            e32Var.set(2, 30000);
            r45.h32 h32Var = new r45.h32();
            h32Var.set(0, java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)));
            h32Var.set(1, 1);
            h32Var.set(4, "test");
            h32Var.set(20, java.lang.Integer.valueOf(h32Var.getInteger(0) % 2 == 0 ? 1 : 0));
            e32Var.set(1, h32Var);
            j0Var.postValue(e32Var);
        }
        return true;
    }
}
