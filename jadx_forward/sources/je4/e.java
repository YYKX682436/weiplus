package je4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final je4.e f380851a = new je4.e();

    public final void a(android.app.Activity activity, java.lang.String url) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openWebLink", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (activity == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openWebLink", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(url));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/util/SnsTextProcessingUtils", "openWebLink", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/sns/util/SnsTextProcessingUtils", "openWebLink", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openWebLink", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
    }

    public final void b(android.app.Activity activity, java.lang.String text) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("performFavorite", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillTextEventInfo", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.g(2);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        bq0Var.o(jq0Var);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87852e = text;
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillTextEventInfo", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
        c4Var.f87856i = activity;
        c4Var.f87860m = 2;
        c5303xc75d2f73.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("performFavorite", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
    }

    public final void c(android.app.Activity activity, java.lang.String text) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("performWebSearch", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        if (activity == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("performWebSearch", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
            return;
        }
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        java.lang.String l17 = o13.n.l(77);
        su4.j2 j2Var = new su4.j2();
        j2Var.f494475e = l17;
        j2Var.f494471a = activity;
        j2Var.f494474d = text;
        j2Var.f494472b = 77;
        j2Var.f494476f = true;
        j2Var.f494478h = true;
        j2Var.f494479i = false;
        j2Var.f494491u = true;
        j2Var.f494486p = false;
        java.util.Map extParams = j2Var.f494477g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams, "extParams");
        extParams.put("chatSearch", "1");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("performWebSearch", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
    }
}
