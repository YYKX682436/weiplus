package p53;

/* loaded from: classes8.dex */
public class i extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16020x9b157fb6 f433595a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16020x9b157fb6 activityC16020x9b157fb6) {
        this.f433595a = activityC16020x9b157fb6;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16020x9b157fb6 activityC16020x9b157fb6;
        if (intent == null || !"com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) || (activityC16020x9b157fb6 = this.f433595a) == null || activityC16020x9b157fb6.isFinishing()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabHomeUI", "GameTabHomeUI exit!");
        activityC16020x9b157fb6.finish();
    }
}
