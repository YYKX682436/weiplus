package com.tencent.mm.plugin.emoji.ui.fts;

/* loaded from: classes15.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI f98016d;

    public g(com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f98016d = fTSEmojiDetailPageUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i18 = com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI.P;
        com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI = this.f98016d;
        fTSEmojiDetailPageUI.getClass();
        tg0.v1 v1Var = (tg0.v1) i95.n0.c(tg0.v1.class);
        int i19 = fTSEmojiDetailPageUI.f98003u;
        java.lang.String str = fTSEmojiDetailPageUI.f98004v;
        java.lang.String str2 = fTSEmojiDetailPageUI.f98006x;
        int i27 = fTSEmojiDetailPageUI.f98002t;
        if (i27 == 2) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(fTSEmojiDetailPageUI.f98007y)) {
                i17 = 1;
            }
            i17 = 0;
        } else if (i27 != 3) {
            if (i27 == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(fTSEmojiDetailPageUI.B)) {
                i17 = 3;
            }
            i17 = 0;
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(fTSEmojiDetailPageUI.D)) {
                i17 = 2;
            }
            i17 = 0;
        }
        ((sg0.q3) v1Var).wi(i19, str, str2, 3, !com.tencent.mm.sdk.platformtools.t8.K0(fTSEmojiDetailPageUI.I) && fTSEmojiDetailPageUI.f97988J == 1 ? 4 : i17, 0, fTSEmojiDetailPageUI.f98005w);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isWeAppandOperateContent = ");
        sb6.append(!com.tencent.mm.sdk.platformtools.t8.K0(fTSEmojiDetailPageUI.G) && fTSEmojiDetailPageUI.f97988J == 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", sb6.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(fTSEmojiDetailPageUI.G) && fTSEmojiDetailPageUI.f97988J == 2) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", fTSEmojiDetailPageUI.G);
            intent.putExtra("key_start_biz_profile_from_app_brand_profile", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("force_get_contact", true);
            j45.l.j(fTSEmojiDetailPageUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(fTSEmojiDetailPageUI.I) && fTSEmojiDetailPageUI.f97988J == 1) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("stat_scene", 8);
                bundle.putString("stat_search_id", fTSEmojiDetailPageUI.f98004v);
                java.lang.String str3 = fTSEmojiDetailPageUI.f98004v + ":" + fTSEmojiDetailPageUI.f98006x + ":" + java.lang.String.valueOf(fTSEmojiDetailPageUI.f98003u) + ":" + java.lang.String.valueOf(fTSEmojiDetailPageUI.f98002t);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_username", fTSEmojiDetailPageUI.I);
                intent2.putExtra("key_can_swipe_back", true);
                intent2.putExtra("key_from_scene", 6);
                intent2.putExtra("key_scene_note", str3);
                intent2.putExtra("_stat_obj", bundle);
                j45.l.j(fTSEmojiDetailPageUI.getContext(), "appbrand", ".ui.AppBrandProfileUI", intent2, null);
            } else {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("preceding_scence", fTSEmojiDetailPageUI.getIntent().getIntExtra("preceding_scence", 0));
                intent3.putExtra("download_entrance_scene", 27);
                intent3.putExtra("searchID", fTSEmojiDetailPageUI.f98004v);
                intent3.putExtra("docID", fTSEmojiDetailPageUI.f98006x);
                int i28 = fTSEmojiDetailPageUI.f98002t;
                if (i28 == 2) {
                    java.lang.String str4 = fTSEmojiDetailPageUI.f98007y;
                    d22.d0 d0Var = new d22.d0(str4 != null ? str4 : "", null, null);
                    d0Var.f364155a = 27;
                    com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(fTSEmojiDetailPageUI.f98003u));
                    com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(fTSEmojiDetailPageUI.f98002t));
                    d22.u.f225876a.a(fTSEmojiDetailPageUI, d0Var);
                } else if (i28 == 3) {
                    f22.a aVar = new f22.a();
                    java.lang.String str5 = fTSEmojiDetailPageUI.D;
                    if (str5 == null) {
                        str5 = "";
                    }
                    aVar.f364028h = str5;
                    java.lang.String str6 = fTSEmojiDetailPageUI.E;
                    if (str6 == null) {
                        str6 = "";
                    }
                    aVar.f364030j = str6;
                    java.lang.String str7 = fTSEmojiDetailPageUI.F;
                    if (str7 == null) {
                        str7 = "";
                    }
                    aVar.f364031k = str7;
                    aVar.f364155a = 27;
                    java.lang.String str8 = fTSEmojiDetailPageUI.f98004v;
                    if (str8 == null) {
                        str8 = "";
                    }
                    aVar.f364037q = str8;
                    java.lang.String str9 = fTSEmojiDetailPageUI.f98006x;
                    aVar.f364038r = str9 != null ? str9 : "";
                    f22.e.f258966a.a(fTSEmojiDetailPageUI, aVar);
                } else if (i28 == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(fTSEmojiDetailPageUI.B)) {
                    intent3.putExtra("rawUrl", fTSEmojiDetailPageUI.B);
                    j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent3, null);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent3);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(fTSEmojiDetailPageUI, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI", "onClickBottomBar", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    fTSEmojiDetailPageUI.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(fTSEmojiDetailPageUI, "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI", "onClickBottomBar", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
