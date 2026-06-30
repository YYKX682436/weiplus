package am2;

/* loaded from: classes3.dex */
public final class t2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.t2 f8751d = new am2.t2();

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        df2.cn cnVar;
        kotlin.jvm.internal.o.g(it, "it");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore == null || (cnVar = (df2.cn) liveRoomControllerStore.controller(df2.cn.class)) == null) {
            return true;
        }
        cnVar.u7(r45.wg7.MMFinderLiveLikeSource_ForwardRealnameLikeButton, null);
        return true;
    }
}
