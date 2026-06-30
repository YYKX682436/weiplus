package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class n1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427 f222827a;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427 activityC16010xe7956427) {
        this.f222827a = activityC16010xe7956427;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427 activityC16010xe7956427;
        if (intent == null || !"com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) || (activityC16010xe7956427 = this.f222827a) == null || activityC16010xe7956427.isFinishing()) {
            return;
        }
        if (!intent.hasExtra("game_finish_activity_id")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebTabUI", "GameWebTabUI exit!");
            activityC16010xe7956427.finish();
        } else if (java.lang.System.identityHashCode(activityC16010xe7956427) == intent.getIntExtra("game_finish_activity_id", -1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebTabUI", "GameWebTabUI exit from GameTabHelper.finish");
            activityC16010xe7956427.finish();
        }
    }
}
