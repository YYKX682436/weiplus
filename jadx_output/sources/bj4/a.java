package bj4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final bj4.a f21163a = new bj4.a();

    public final void a(android.content.Context context, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        if (z17 && ai4.m0.f5173a.i().a() == 0) {
            return;
        }
        boolean z18 = j62.e.g().c(new com.tencent.mm.repairer.config.textstatus.flutter.RepairerConfigTextStatusMessageUseFlutter()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusEntranceConfig", "isMessagePageUseFlutter config: " + z18);
        if (z18) {
            java.util.Map l17 = kz5.c1.l(new jz5.l("is_unread_mode", java.lang.Boolean.valueOf(z17)));
            i95.m c17 = i95.n0.c(xe0.c0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            xe0.c0.d9((xe0.c0) c17, context, "MessagePage", l17, null, null, 24, null);
            if (z17) {
                ai4.m0.f5173a.r();
                return;
            }
            return;
        }
        if (z17) {
            int i18 = com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity.f173639f;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity.class);
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
            intent.putExtra("reportEnterScene", i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForUnRead", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForUnRead", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        int i19 = com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity.f173639f;
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity.class);
        intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        intent2.putExtra("reportEnterScene", i17);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForSelfAllHistory", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForSelfAllHistory", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
