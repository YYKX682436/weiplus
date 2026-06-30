package p53;

/* loaded from: classes8.dex */
public class g extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16019x54473720 f433593a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16019x54473720 activityC16019x54473720) {
        this.f433593a = activityC16019x54473720;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16019x54473720 activityC16019x54473720;
        if (intent == null || !"com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) || (activityC16019x54473720 = this.f433593a) == null || activityC16019x54473720.isFinishing()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabBridgeUI", "GameTabBridgeUI exit!");
        activityC16019x54473720.finish();
    }
}
