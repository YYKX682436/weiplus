package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2058x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/setting/ui/setting/service/SettingsHearingAidSettingsHearingAidVolumeLockService$lockVolume$1", "Landroid/content/BroadcastReceiver;", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.service.SettingsHearingAidSettingsHearingAidVolumeLockService$lockVolume$1 */
/* loaded from: classes.dex */
public final class C17501x58d100fc extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION") && intExtra == 3) {
            throw null;
        }
    }
}
