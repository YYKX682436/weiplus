package com.tencent.mm.plugin.backup.roambackup;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/backup/roambackup/RoamServiceInitializer$wifiEventReceiver$1", "Landroid/content/BroadcastReceiver;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RoamServiceInitializer$wifiEventReceiver$1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f92559a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.backup.roambackup.k2(this, context, intent), "notifyAffroamNetworkChanged");
    }
}
