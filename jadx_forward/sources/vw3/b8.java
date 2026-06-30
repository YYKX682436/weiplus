package vw3;

/* loaded from: classes.dex */
public final class b8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.VideoSendDebugConfigUI f522434d;

    public b8(com.tencent.mm.plugin.repairer.ui.VideoSendDebugConfigUI videoSendDebugConfigUI) {
        this.f522434d = videoSendDebugConfigUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.repairer.ui.VideoSendDebugConfigUI.f;
        com.tencent.mm.plugin.repairer.ui.VideoSendDebugConfigUI videoSendDebugConfigUI = this.f522434d;
        videoSendDebugConfigUI.X6();
        videoSendDebugConfigUI.finish();
        return false;
    }
}
