package am2;

/* loaded from: classes3.dex */
public final class l2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.l2 f8712d = new am2.l2();

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        mm2.x6 x6Var;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        kotlin.jvm.internal.o.g(it, "it");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (x6Var = (mm2.x6) k0Var.business(mm2.x6.class)) != null && (liveMutableData = x6Var.f329546f) != null) {
            r45.gw1 gw1Var = new r45.gw1();
            gw1Var.set(2, "邀请好友观看直播");
            gw1Var.set(1, 7);
            liveMutableData.postValue(gw1Var);
        }
        return true;
    }
}
