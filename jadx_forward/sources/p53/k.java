package p53;

/* loaded from: classes8.dex */
public class k extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16021xdc850885 f433597a;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16021xdc850885 activityC16021xdc850885) {
        this.f433597a = activityC16021xdc850885;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16021xdc850885 activityC16021xdc850885;
        android.app.Activity activity;
        if (intent == null || !"com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) || (activity = (activityC16021xdc850885 = this.f433597a).T3) == null || activity.isFinishing()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebUI", "%s exit!", activityC16021xdc850885.T3.getClass().getSimpleName());
        activityC16021xdc850885.T3.finish();
    }
}
