package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class o6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6 f251621d;

    public o6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6 i6Var) {
        this.f251621d = i6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        int i18;
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o6 o6Var;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.NewSightWidget$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/NewSightWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6 i6Var = this.f251621d;
        boolean z18 = i6Var.A;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = i6Var.f251490c;
        java.lang.String str7 = "com/tencent/mm/plugin/sns/ui/NewSightWidget$4";
        if (z18) {
            gm0.j1.i();
            if (!gm0.j1.u().l()) {
                db5.t7.k(abstractActivityC21394xb3d2c0cf2, null);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/NewSightWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.NewSightWidget$4");
                return;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ws.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                i6Var.u();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                i6Var.z();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            }
            o6Var = this;
            str6 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$4";
            str4 = "(Landroid/view/View;)V";
            str5 = "onClick";
            str3 = "android/view/View$OnClickListener";
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0 w0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateEditPagePlayStartTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoPublishReporter", "sessionId: " + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246523b + ", lastTimeStamp: " + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246528g + ", currentTimeStamp: " + currentTimeMillis);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246528g = currentTimeMillis;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateEditPagePlayCnt", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6913xf7b4b00d c6913xf7b4b00d = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246524c;
            long j17 = c6913xf7b4b00d.f142332i;
            c6913xf7b4b00d.f142332i = j17 + 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoPublishReporter", "updateEditPagePlayCnt >> sessionId: " + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246524c.f142327d + ", lastCnt: " + j17 + ", currentCnt: " + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246524c.f142332i);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateEditPagePlayCnt", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateEditPagePlayStartTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            int[] iArr = new int[2];
            if (view != null) {
                view.getLocationInWindow(iArr);
                i17 = view.getWidth();
                i18 = view.getHeight();
            } else {
                i17 = 0;
                i18 = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            int i19 = iArr[0];
            int i27 = iArr[1];
            be4.b bVar = i6Var.I;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = bVar.f101089a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClick", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(bVar.f101090b == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVLogHelper", "doClick %b", objArr);
            if (bVar.f101090b == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
                str2 = "com/tencent/mm/plugin/sns/ui/NewSightWidget$4";
                z17 = false;
            } else {
                try {
                    str2 = "com/tencent/mm/plugin/sns/ui/NewSightWidget$4";
                    try {
                        int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2327x2fd755.ActivityC18797x4748ed86.f257442g;
                        android.content.Intent intent = new android.content.Intent(abstractActivityC21394xb3d2c0cf3, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2327x2fd755.ActivityC18797x4748ed86.class);
                        str = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
                        try {
                            intent.putExtra("intent_taskid", bVar.f101092d);
                            intent.putExtra("intent_thumbpath", bVar.f101090b.f457718i);
                            intent.putExtra("sns_video_scene", 6);
                            intent.putExtra("img_gallery_left", i19);
                            intent.putExtra("img_gallery_top", i27);
                            intent.putExtra("img_gallery_width", i17);
                            intent.putExtra("img_gallery_height", i18);
                            abstractActivityC21394xb3d2c0cf3.startActivityForResult(intent, 12);
                            abstractActivityC21394xb3d2c0cf3.overridePendingTransition(0, 0);
                        } catch (java.lang.ClassNotFoundException unused) {
                        }
                    } catch (java.lang.ClassNotFoundException unused2) {
                        str = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
                    }
                } catch (java.lang.ClassNotFoundException unused3) {
                    str = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
                    str2 = "com/tencent/mm/plugin/sns/ui/NewSightWidget$4";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", str);
                z17 = true;
            }
            if (z17) {
                yj0.a.h(this, str2, "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.NewSightWidget$4");
                return;
            }
            o6Var = this;
            str3 = "android/view/View$OnClickListener";
            str4 = "(Landroid/view/View;)V";
            str5 = "onClick";
            str7 = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            boolean z19 = i6Var.O;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            if (z19 && !com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6.o(i6Var).isEmpty()) {
                android.content.Intent intent2 = new android.content.Intent();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                boolean z27 = i6Var.P;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                if (z27) {
                    abstractActivityC21394xb3d2c0cf = abstractActivityC21394xb3d2c0cf2;
                    intent2.setClassName(abstractActivityC21394xb3d2c0cf, "com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoActivity");
                } else {
                    abstractActivityC21394xb3d2c0cf = abstractActivityC21394xb3d2c0cf2;
                    intent2.setClassName(abstractActivityC21394xb3d2c0cf, "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
                }
                intent2.putExtra("intent_video_background_word_id", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6.o(i6Var));
                intent2.putExtra("intent_video_is_preview", true);
                intent2.putExtra("intent_left", iArr[0]);
                intent2.putExtra("intent_top", iArr[1]);
                intent2.putExtra("intent_width", i17);
                intent2.putExtra("intent_height", i18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                java.lang.String str8 = i6Var.f250103j;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                intent2.putExtra("intent_video_thumb_path", str8);
                abstractActivityC21394xb3d2c0cf.startActivityForResult(intent2, 12);
                abstractActivityC21394xb3d2c0cf.overridePendingTransition(0, 0);
                yj0.a.h(o6Var, str7, str3, str5, str4);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, "com.tencent.mm.plugin.sns.ui.NewSightWidget$4");
                return;
            }
            int i29 = i18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            int i37 = i17;
            java.lang.String str9 = i6Var.f250105k;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            if (!com.p314xaae8f345.mm.vfs.w6.j(str9)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click videopath is not exist ");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                java.lang.String str10 = i6Var.f250105k;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                sb6.append(str10);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSightWidget", sb6.toString());
                yj0.a.h(o6Var, str7, str3, str5, str4);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, "com.tencent.mm.plugin.sns.ui.NewSightWidget$4");
                return;
            }
            str6 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$4";
            android.content.Intent intent3 = new android.content.Intent(abstractActivityC21394xb3d2c0cf2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.class);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            java.lang.String str11 = i6Var.f250105k;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            intent3.putExtra("intent_videopath", str11);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            java.lang.String str12 = i6Var.f250103j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            intent3.putExtra("intent_thumbpath", str12);
            intent3.putExtra("intent_isad", false);
            intent3.putExtra("intent_ispreview", true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            boolean z28 = i6Var.G;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            intent3.putExtra("KBlockAdd", z28);
            intent3.putExtra("sns_video_scene", 6);
            intent3.putExtra("img_gallery_left", iArr[0]);
            intent3.putExtra("img_gallery_top", iArr[1]);
            intent3.putExtra("img_gallery_width", i37);
            intent3.putExtra("img_gallery_height", i29);
            abstractActivityC21394xb3d2c0cf2.startActivityForResult(intent3, 12);
            abstractActivityC21394xb3d2c0cf2.overridePendingTransition(0, 0);
        }
        yj0.a.h(o6Var, str7, str3, str5, str4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str6);
    }
}
