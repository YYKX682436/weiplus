package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class q7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.x7 f246964d;

    public q7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.x7 x7Var) {
        this.f246964d = x7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.x7 x7Var = this.f246964d;
        boolean z18 = x7Var.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        java.lang.String str8 = "(Landroid/view/View;)V";
        if (z18) {
            x7Var.N++;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSightVideoClickCheckingCanvasId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x7Var.m0().L)) {
                str4 = "(Landroid/view/View;)V";
                str5 = "android/view/View$OnClickListener";
                str6 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$7";
                str7 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$7";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightVideoClickCheckingCanvasId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                z17 = false;
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("sns_landig_pages_from_source", 14);
                intent.putExtra("sns_landig_pages_origin_from_source", x7Var.u().g());
                intent.putExtra("sns_landing_pages_ux_info", x7Var.u().o());
                intent.putExtra("sns_landing_pages_xml", "");
                intent.putExtra("sns_landing_pages_canvasid", x7Var.m0().L);
                intent.putExtra("sns_landing_pages_canvas_ext", x7Var.m0().M);
                intent.putExtra("sns_landing_pages_no_store", x7Var.m0().N);
                intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                android.content.Context context = x7Var.A;
                if ((context instanceof android.app.Activity) && x7Var.u().d() == 2) {
                    android.app.Activity activity = (android.app.Activity) context;
                    java.lang.String stringExtra = activity.getIntent().getStringExtra("sns_landing_pages_sessionId");
                    java.lang.String stringExtra2 = activity.getIntent().getStringExtra("sns_landing_pages_ad_buffer");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                        str7 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$7";
                        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000);
                        str4 = "(Landroid/view/View;)V";
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        str5 = "android/view/View$OnClickListener";
                        try {
                            jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, valueOf);
                            str6 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$7";
                            try {
                                jSONObject.put("cid", x7Var.m0().f84350d);
                                jSONObject.put("adBuffer", !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) ? stringExtra2 : "");
                                jSONObject.put("preSessionId", stringExtra);
                            } catch (java.lang.Exception unused) {
                            }
                        } catch (java.lang.Exception unused2) {
                            str6 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$7";
                        }
                        intent.putExtra("sns_landing_pages_search_extra", jSONObject.toString());
                        intent.putExtra("sns_landing_pages_sessionId", valueOf);
                        intent.putExtra("sns_landing_pages_ad_buffer", stringExtra2);
                        int[] iArr = new int[2];
                        x7Var.f247347x.getLocationOnScreen(iArr);
                        intent.putExtra("img_gallery_top", iArr[1]);
                        intent.putExtra("img_gallery_left", iArr[0]);
                        intent.putExtra("img_gallery_width", x7Var.f247347x.getWidth());
                        intent.putExtra("img_gallery_height", x7Var.f247347x.getHeight());
                        j45.l.j(context, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightVideoClickCheckingCanvasId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                        z17 = true;
                    }
                }
                str4 = "(Landroid/view/View;)V";
                str5 = "android/view/View$OnClickListener";
                str6 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$7";
                str7 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$7";
                int[] iArr2 = new int[2];
                x7Var.f247347x.getLocationOnScreen(iArr2);
                intent.putExtra("img_gallery_top", iArr2[1]);
                intent.putExtra("img_gallery_left", iArr2[0]);
                intent.putExtra("img_gallery_width", x7Var.f247347x.getWidth());
                intent.putExtra("img_gallery_height", x7Var.f247347x.getHeight());
                j45.l.j(context, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightVideoClickCheckingCanvasId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                z17 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            if (z17) {
                yj0.a.h(this, str6, str5, "onClick", str4);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", str7);
                return;
            } else {
                str8 = str4;
                str = str5;
                str3 = str7;
                str2 = str6;
            }
        } else {
            str = "android/view/View$OnClickListener";
            str2 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$7";
            str3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$7";
        }
        yj0.a.h(this, str2, str, "onClick", str8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", str3);
    }
}
