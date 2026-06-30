package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts;

/* loaded from: classes15.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 f179549d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 activityC13331xc936a5b5) {
        this.f179549d = activityC13331xc936a5b5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5.P;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 activityC13331xc936a5b5 = this.f179549d;
        activityC13331xc936a5b5.getClass();
        tg0.v1 v1Var = (tg0.v1) i95.n0.c(tg0.v1.class);
        int i19 = activityC13331xc936a5b5.f179536u;
        java.lang.String str = activityC13331xc936a5b5.f179537v;
        java.lang.String str2 = activityC13331xc936a5b5.f179539x;
        int i27 = activityC13331xc936a5b5.f179535t;
        if (i27 == 2) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13331xc936a5b5.f179540y)) {
                i17 = 1;
            }
            i17 = 0;
        } else if (i27 != 3) {
            if (i27 == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13331xc936a5b5.B)) {
                i17 = 3;
            }
            i17 = 0;
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13331xc936a5b5.D)) {
                i17 = 2;
            }
            i17 = 0;
        }
        ((sg0.q3) v1Var).wi(i19, str, str2, 3, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13331xc936a5b5.I) && activityC13331xc936a5b5.f179521J == 1 ? 4 : i17, 0, activityC13331xc936a5b5.f179538w);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isWeAppandOperateContent = ");
        sb6.append(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13331xc936a5b5.G) && activityC13331xc936a5b5.f179521J == 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", sb6.toString());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13331xc936a5b5.G) && activityC13331xc936a5b5.f179521J == 2) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", activityC13331xc936a5b5.G);
            intent.putExtra("key_start_biz_profile_from_app_brand_profile", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("force_get_contact", true);
            j45.l.j(activityC13331xc936a5b5, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13331xc936a5b5.I) && activityC13331xc936a5b5.f179521J == 1) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("stat_scene", 8);
                bundle.putString("stat_search_id", activityC13331xc936a5b5.f179537v);
                java.lang.String str3 = activityC13331xc936a5b5.f179537v + ":" + activityC13331xc936a5b5.f179539x + ":" + java.lang.String.valueOf(activityC13331xc936a5b5.f179536u) + ":" + java.lang.String.valueOf(activityC13331xc936a5b5.f179535t);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_username", activityC13331xc936a5b5.I);
                intent2.putExtra("key_can_swipe_back", true);
                intent2.putExtra("key_from_scene", 6);
                intent2.putExtra("key_scene_note", str3);
                intent2.putExtra("_stat_obj", bundle);
                j45.l.j(activityC13331xc936a5b5.mo55332x76847179(), "appbrand", ".ui.AppBrandProfileUI", intent2, null);
            } else {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("preceding_scence", activityC13331xc936a5b5.getIntent().getIntExtra("preceding_scence", 0));
                intent3.putExtra("download_entrance_scene", 27);
                intent3.putExtra("searchID", activityC13331xc936a5b5.f179537v);
                intent3.putExtra("docID", activityC13331xc936a5b5.f179539x);
                int i28 = activityC13331xc936a5b5.f179535t;
                if (i28 == 2) {
                    java.lang.String str4 = activityC13331xc936a5b5.f179540y;
                    d22.d0 d0Var = new d22.d0(str4 != null ? str4 : "", null, null);
                    d0Var.f445688a = 27;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(activityC13331xc936a5b5.f179536u));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(activityC13331xc936a5b5.f179535t));
                    d22.u.f307409a.a(activityC13331xc936a5b5, d0Var);
                } else if (i28 == 3) {
                    f22.a aVar = new f22.a();
                    java.lang.String str5 = activityC13331xc936a5b5.D;
                    if (str5 == null) {
                        str5 = "";
                    }
                    aVar.f445561h = str5;
                    java.lang.String str6 = activityC13331xc936a5b5.E;
                    if (str6 == null) {
                        str6 = "";
                    }
                    aVar.f445563j = str6;
                    java.lang.String str7 = activityC13331xc936a5b5.F;
                    if (str7 == null) {
                        str7 = "";
                    }
                    aVar.f445564k = str7;
                    aVar.f445688a = 27;
                    java.lang.String str8 = activityC13331xc936a5b5.f179537v;
                    if (str8 == null) {
                        str8 = "";
                    }
                    aVar.f445570q = str8;
                    java.lang.String str9 = activityC13331xc936a5b5.f179539x;
                    aVar.f445571r = str9 != null ? str9 : "";
                    f22.e.f340499a.a(activityC13331xc936a5b5, aVar);
                } else if (i28 == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13331xc936a5b5.B)) {
                    intent3.putExtra("rawUrl", activityC13331xc936a5b5.B);
                    j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent3, null);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent3);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(activityC13331xc936a5b5, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI", "onClickBottomBar", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC13331xc936a5b5.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(activityC13331xc936a5b5, "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI", "onClickBottomBar", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
