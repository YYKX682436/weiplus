package fc4;

/* loaded from: classes.dex */
public final class l0 {
    public l0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToPage", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2184x67fe93cb.ActivityC18194xa82f7027.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/SnsFlexibleVideoActivity$Companion", "jumpToPage", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/flexible/SnsFlexibleVideoActivity$Companion", "jumpToPage", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).overridePendingTransition(0, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToPage", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity$Companion");
    }
}
