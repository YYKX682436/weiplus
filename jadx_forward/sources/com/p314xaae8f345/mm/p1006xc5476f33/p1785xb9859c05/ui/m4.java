package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class m4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 f224475d;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 activityC16145xcc3dc144) {
        this.f224475d = activityC16145xcc3dc144;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144.F;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 activityC16145xcc3dc144 = this.f224475d;
        sb6.append(activityC16145xcc3dc144.f224222z);
        sb6.append(" ");
        sb6.append(activityC16145xcc3dc144.C);
        sb6.append(java.lang.String.format("&rt=%s", java.lang.Integer.valueOf(itemId)));
        java.lang.String sb7 = sb6.toString();
        q83.d dVar = activityC16145xcc3dc144.f224216t;
        switch (itemId) {
            case 0:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallShareCouponCardUI", "onShare2Friends>title:%s,onShare2Friends>url:%s,onShare2Friends>desc:%s,onShare2Friends>imgPath:%s", activityC16145xcc3dc144.f224220x, activityC16145xcc3dc144.f224221y + java.lang.String.format("&rt=%s", java.lang.Integer.valueOf(itemId)), activityC16145xcc3dc144.f224218v, activityC16145xcc3dc144.f224219w);
                dVar.f442288c = (long) 0;
                dVar.b();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 20L, 1L, true);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_Type", com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4);
                intent.putExtra("select_is_ret", true);
                j45.l.v(activityC16145xcc3dc144, ".ui.transmit.SelectConversationUI", intent, 1);
                break;
            case 1:
                java.lang.String str = activityC16145xcc3dc144.f224220x;
                java.lang.String str2 = activityC16145xcc3dc144.f224221y + java.lang.String.format("&rt=%s", java.lang.Integer.valueOf(itemId));
                java.lang.String str3 = activityC16145xcc3dc144.f224218v;
                java.lang.String str4 = activityC16145xcc3dc144.f224219w;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallShareCouponCardUI", "onShareSnsEvent>title:%s,onShareSnsEvent>url:%s,onShareSnsEvent>content:%s,onShareSnsEvent>content:%s", str, str2, str3, str4);
                dVar.f442288c = 1;
                dVar.b();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 21L, 1L, true);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Ksnsupload_type", 1);
                intent2.putExtra("need_result", false);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                intent2.putExtra("Ksnsupload_title", str != null ? str : "");
                intent2.putExtra("Ksnsupload_imgurl", str4);
                intent2.putExtra("Ksnsupload_link", str2);
                java.lang.String a17 = c01.n2.a("wechat_out");
                c01.n2.d().c(a17, true).i("prePublishId", "wechat_out");
                intent2.putExtra("reportSessionId", a17);
                j45.l.n(activityC16145xcc3dc144, "sns", ".ui.SnsUploadUI", intent2, 1);
                break;
            case 2:
                android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW");
                intent3.putExtra("sms_body", sb7);
                intent3.setType("vnd.android-dir/mms-sms");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(activityC16145xcc3dc144, intent3, true, false)) {
                    dp.a.m125853x26a183b(activityC16145xcc3dc144, com.p314xaae8f345.mm.R.C30867xcad56011.igz, 1).show();
                    break;
                } else {
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent3);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(activityC16145xcc3dc144, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activityC16145xcc3dc144.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(activityC16145xcc3dc144, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    } catch (android.content.ActivityNotFoundException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallShareCouponCardUI", "ActivityNotFoundException:" + e17);
                        dp.a.m125853x26a183b(activityC16145xcc3dc144, com.p314xaae8f345.mm.R.C30867xcad56011.igz, 1).show();
                        break;
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IPCallShareCouponCardUI", e18, "", new java.lang.Object[0]);
                        break;
                    }
                }
            case 3:
                android.content.Intent intent4 = new android.content.Intent("android.intent.action.SEND");
                intent4.putExtra("android.intent.extra.SUBJECT", java.lang.String.format(activityC16145xcc3dc144.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6_), c01.z1.l()));
                intent4.putExtra("android.intent.extra.TEXT", sb7);
                intent4.setType("plain/text");
                android.content.Intent createChooser = android.content.Intent.createChooser(intent4, activityC16145xcc3dc144.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1v));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(createChooser);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC16145xcc3dc144, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC16145xcc3dc144.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC16145xcc3dc144, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                break;
            case 4:
                try {
                    android.content.Intent intent5 = new android.content.Intent();
                    intent5.setAction("android.intent.action.SEND");
                    intent5.putExtra("android.intent.extra.TEXT", sb7);
                    intent5.setType("text/plain");
                    intent5.setPackage("com.whatsapp");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent5);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(activityC16145xcc3dc144, arrayList3.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC16145xcc3dc144.startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(activityC16145xcc3dc144, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    break;
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallShareCouponCardUI", "go whatsapp error" + e19.getMessage());
                    break;
                }
            case 5:
                if (!(activityC16145xcc3dc144.f224210n.f381702b != null)) {
                    db5.e1.n(activityC16145xcc3dc144.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.j0_, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.q4(activityC16145xcc3dc144), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.z3(activityC16145xcc3dc144));
                    break;
                } else {
                    activityC16145xcc3dc144.U6(16, sb7, activityC16145xcc3dc144.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1x));
                    break;
                }
            case 6:
                if (!c01.z1.u()) {
                    db5.e1.n(activityC16145xcc3dc144.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.iqx, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a4(activityC16145xcc3dc144), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b4(activityC16145xcc3dc144));
                    break;
                } else {
                    activityC16145xcc3dc144.U6(8, sb7, activityC16145xcc3dc144.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1t));
                    break;
                }
            case 7:
                try {
                    android.content.Intent intent6 = new android.content.Intent();
                    intent6.setAction("android.intent.action.SEND");
                    intent6.putExtra("android.intent.extra.TEXT", sb7);
                    intent6.setType("text/plain");
                    intent6.setPackage("com.facebook.orca");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(intent6);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(activityC16145xcc3dc144, arrayList4.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC16145xcc3dc144.startActivity((android.content.Intent) arrayList4.get(0));
                    yj0.a.f(activityC16145xcc3dc144, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    break;
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallShareCouponCardUI", "go facebook msger error" + e27.getMessage());
                    break;
                }
            case 8:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, null, sb7, null);
                dp.a.m125853x26a183b(activityC16145xcc3dc144, com.p314xaae8f345.mm.R.C30867xcad56011.g4k, 0).show();
                break;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13340, -1, 1, java.lang.Integer.valueOf(itemId), -1, -1);
    }
}
