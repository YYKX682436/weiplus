package bj4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final bj4.a f102696a = new bj4.a();

    public final void a(android.content.Context context, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (z17 && ai4.m0.f86706a.i().a() == 0) {
            return;
        }
        boolean z18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.p2571xd2ae381c.C20724xddad0ba1()) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusEntranceConfig", "isMessagePageUseFlutter config: " + z18);
        if (z18) {
            java.util.Map l17 = kz5.c1.l(new jz5.l("is_unread_mode", java.lang.Boolean.valueOf(z17)));
            i95.m c17 = i95.n0.c(xe0.c0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            xe0.c0.d9((xe0.c0) c17, context, "MessagePage", l17, null, null, 24, null);
            if (z17) {
                ai4.m0.f86706a.r();
                return;
            }
            return;
        }
        if (z17) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18651x182090c3.f255172f;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18651x182090c3.class);
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
            intent.putExtra("reportEnterScene", i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForUnRead", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForUnRead", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18651x182090c3.f255172f;
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18651x182090c3.class);
        intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
        intent2.putExtra("reportEnterScene", i17);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForSelfAllHistory", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForSelfAllHistory", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
