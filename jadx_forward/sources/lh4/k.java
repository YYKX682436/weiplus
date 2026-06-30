package lh4;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lh4.l f400251d;

    public k(lh4.l lVar) {
        this.f400251d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long h17 = c01.z1.h();
        boolean z17 = (h17 & 32768) == 32768;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onGuideClick isTingEntryClose: %s, discoverCtrlFlag: %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(h17));
        lh4.l lVar = this.f400251d;
        if (z17) {
            lVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionMusicGuideView", "jumpToSettingsAndOpenHalfScreen");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_START_HALF_ACTIVITY_PREFERENCE", "settings_ting_switch");
            java.lang.Long TASKBAR_MUSIC_GUIDE = com.p314xaae8f345.mm.ui.t2.f291403d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(TASKBAR_MUSIC_GUIDE, "TASKBAR_MUSIC_GUIDE");
            intent.putExtra("KEY_ENTER_SCENE", TASKBAR_MUSIC_GUIDE.longValue());
            wd0.z1 z1Var = (wd0.z1) i95.n0.c(wd0.z1.class);
            android.content.Context context = lVar.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ((vd0.o3) z1Var).Zi(context, intent);
            return;
        }
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionMusicGuideView", "jumpToDiscoverAndHighLight");
        java.lang.String str = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ni() ? "find_friends_by_ting_play_state" : "find_friends_by_ting";
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClassName(lVar.getContext(), "com.tencent.mm.ui.LauncherUI");
        intent2.addFlags(268435456);
        intent2.addFlags(67108864);
        intent2.putExtra("LauncherUI.switch.tab", "tab_find_friend");
        intent2.putExtra("LauncherUI.FindMore.HighLightPreference", str);
        android.content.Context context2 = lVar.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionMusicGuideView", "jumpToDiscoverAndHighLight", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionMusicGuideView", "jumpToDiscoverAndHighLight", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
