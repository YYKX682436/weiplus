package am2;

/* loaded from: classes3.dex */
public final class j implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.j f8698d = new am2.j();

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        df2.a9 a9Var;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData diffMutableLiveData;
        kotlin.jvm.internal.o.g(it, "it");
        r45.e84 e84Var = new r45.e84();
        e84Var.set(0, java.lang.Integer.valueOf(c01.id.e()));
        e84Var.set(1, java.lang.Integer.valueOf(e84Var.getInteger(0) + 35));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        new r45.nz3().set(0, "MMFinderLiveGift100001");
        e84Var.set(2, linkedList);
        e84Var.set(5, java.lang.String.valueOf(c01.id.e()));
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (a9Var = (df2.a9) liveRoomControllerStore.controller(df2.a9.class)) != null && (diffMutableLiveData = a9Var.f229698x) != null) {
            diffMutableLiveData.postValue(e84Var);
        }
        return true;
    }
}
