package z64;

/* loaded from: classes4.dex */
public class a implements y64.b {
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        boolean z17;
        int i18;
        android.content.Intent intent;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        boolean z18 = false;
        if (view == null || c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
        java.lang.String str = m70354x74235b3e.xml;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasAvatarCanvasNode", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        try {
            z17 = za4.z0.v(str, "headCanvasInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasAvatarCanvasNode", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasAvatarCanvasNode", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            return false;
        }
        java.lang.String str2 = "";
        java.lang.String replaceAll = m70354x74235b3e.xml.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("headCanvasInfo", "adCanvasInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFromScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFromScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            i18 = 22;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFromScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            i18 = 23;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toIntent", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
        if (view.getContext() == null || android.text.TextUtils.isEmpty(replaceAll)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toIntent", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
            intent = null;
        } else {
            intent = new android.content.Intent();
            intent.putExtra("sns_landing_pages_share_sns_id", c17933xe8d1b226.m70367x7525eefd());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsRawId", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
            if (c17933xe8d1b226.m70371x485d7() != null) {
                str2 = c17933xe8d1b226.m70371x485d7().Id;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsRawId", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsRawId", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
            }
            intent.putExtra("sns_landing_pages_rawSnsId", str2);
            intent.putExtra("sns_landing_pages_ux_info", c17933xe8d1b226.m70375x338a8cc7());
            intent.putExtra("sns_landing_pages_xml", replaceAll);
            a54.g.b(view.getContext(), intent, replaceAll);
            intent.putExtra("sns_landig_pages_from_source", i18);
            intent.putExtra("sns_landing_pages_xml_prefix", dm.n.f67493x36901555);
            intent.putExtra("sns_landing_is_native_sight_ad", true);
            intent.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toIntent", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
        }
        android.content.Context context = view.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startActivity", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        if (intent == null || context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startActivity", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        } else {
            try {
                if (context instanceof android.app.Activity) {
                    android.app.Activity activity = (android.app.Activity) context;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/clicker/avatar/impl/AdCanvasAvatarAction", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity, "com/tencent/mm/plugin/sns/ad/timeline/clicker/avatar/impl/AdCanvasAvatarAction", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                } else {
                    intent.addFlags(268435456);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/clicker/avatar/impl/AdCanvasAvatarAction", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/sns/ad/timeline/clicker/avatar/impl/AdCanvasAvatarAction", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startActivity", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
                z18 = true;
            } catch (java.lang.Throwable unused2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startActivity", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        return z18;
    }

    @Override // y64.b
    public void b(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        if (dVar != null && (c11137xb05b06ad = (com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) dVar.a("ext_sns_ad_click", null)) != null) {
            a84.u0.a(c11137xb05b06ad, 21);
            ca4.z0.x0(c11137xb05b06ad);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
    }
}
