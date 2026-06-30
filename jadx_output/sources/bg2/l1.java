package bg2;

/* loaded from: classes3.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController f20263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f20264e;

    public l1(com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController liveConvertLiveRoomViewController, android.app.Activity activity) {
        this.f20263d = liveConvertLiveRoomViewController;
        this.f20264e = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController liveConvertLiveRoomViewController = this.f20263d;
        if (liveConvertLiveRoomViewController.f111628m == null) {
            liveConvertLiveRoomViewController.f111628m = new com.tencent.mm.ui.tools.f5(this.f20264e);
            com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController liveConvertLiveRoomViewController2 = this.f20263d;
            com.tencent.mm.ui.tools.f5 f5Var = liveConvertLiveRoomViewController2.f111628m;
            if (f5Var != null) {
                f5Var.f210400e = new bg2.k1(liveConvertLiveRoomViewController2);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f20263d.f111628m;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
