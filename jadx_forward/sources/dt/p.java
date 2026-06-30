package dt;

/* loaded from: classes15.dex */
public class p extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public p() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        int i17;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5388x84284666 c5388x84284666 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5388x84284666) abstractC20979x809547d1;
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        if (c5388x84284666 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:event is null.");
            return false;
        }
        am.x7 x7Var = c5388x84284666.f135722g;
        if (x7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:event.data is null.");
            return false;
        }
        int i18 = x7Var.f89895a;
        if (i18 == 27) {
            java.lang.String[] strArr = x7Var.f89899e;
            if (strArr == null || strArr.length < 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent selectionArgs error.");
            } else {
                java.lang.String str2 = strArr[0];
                java.lang.String str3 = strArr[1];
                str = "";
                if (strArr.length >= 3) {
                    java.lang.String str4 = strArr[2];
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    str = str4 != null ? str4 : "";
                    try {
                        str = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    } catch (java.io.UnsupportedEncodingException unused) {
                    }
                }
                if (str2 == null || str3 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent wrong args, %s, %s", str2, str3);
                } else {
                    java.lang.String[] strArr2 = x7Var.f89899e;
                    if (strArr2.length >= 4) {
                        java.lang.String str5 = strArr2[3];
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str5, 0);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "ExtCallBizEvent jump biz tempSession");
                            java.lang.String format = java.lang.String.format("weixin://dl/business/tempsession/?username=%s&appid=%s&sessionFrom=%s&showtype=%s&scene=%s", str3, str2, str, java.lang.Integer.valueOf(i17), 0);
                            android.content.Intent intent = new android.content.Intent(x7Var.f89897c, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12938xa4547cea.class);
                            intent.addFlags(268435456);
                            intent.setData(android.net.Uri.parse(format));
                            intent.putExtra("translate_link_scene", 1);
                            android.content.Context context = x7Var.f89897c;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(intent);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerProfile", "callbackOfExtCallBizEvent", "(Lcom/tencent/mm/autogen/events/ExtCallBizEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            context.startActivity((android.content.Intent) arrayList.get(0));
                            yj0.a.f(context, "com/tencent/mm/app/WorkerProfile", "callbackOfExtCallBizEvent", "(Lcom/tencent/mm/autogen/events/ExtCallBizEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    }
                    i17 = 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "ExtCallBizEvent jump biz tempSession");
                    java.lang.String format2 = java.lang.String.format("weixin://dl/business/tempsession/?username=%s&appid=%s&sessionFrom=%s&showtype=%s&scene=%s", str3, str2, str, java.lang.Integer.valueOf(i17), 0);
                    android.content.Intent intent2 = new android.content.Intent(x7Var.f89897c, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12938xa4547cea.class);
                    intent2.addFlags(268435456);
                    intent2.setData(android.net.Uri.parse(format2));
                    intent2.putExtra("translate_link_scene", 1);
                    android.content.Context context2 = x7Var.f89897c;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/app/WorkerProfile", "callbackOfExtCallBizEvent", "(Lcom/tencent/mm/autogen/events/ExtCallBizEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context2, "com/tencent/mm/app/WorkerProfile", "callbackOfExtCallBizEvent", "(Lcom/tencent/mm/autogen/events/ExtCallBizEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        } else if (i18 != 28) {
            android.content.Context context3 = x7Var.f89897c;
            java.lang.String[] strArr3 = x7Var.f89899e;
            java.lang.String[] strArr4 = x7Var.f89898d;
            int i19 = x7Var.f89896b;
            if (context3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:context is null.");
                context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            if (strArr3 == null || strArr3.length < 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:args error.");
                return false;
            }
            for (java.lang.String str6 : strArr3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "arg : %s", str6);
            }
            java.lang.String str7 = strArr3[0];
            java.lang.String str8 = strArr3[1];
            java.lang.String str9 = strArr3.length > 2 ? strArr3[2] : null;
            int P = strArr3.length > 3 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr3[3], 0) : 0;
            int P2 = strArr3.length > 4 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr3[4], 0) : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:source(%d)", java.lang.Integer.valueOf(i19));
            if (i19 == 1) {
                obj = null;
                if (strArr4 == null || strArr4.length == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:packageNames is null or nil.");
                    return false;
                }
            } else {
                if (i19 != 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:source is out of range.");
                    return false;
                }
                obj = null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:fromURL(%s) is null or nil.", null);
                    return false;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener: appId(%s), toUserName(%s), extInfo(%s), fromURL(%s)", str7, str8, str9, obj);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "appId or toUsername is null or nil.");
                return false;
            }
            int i27 = P == 1 ? 8 : P == 0 ? 7 : 0;
            android.content.Intent intent3 = new android.content.Intent(context3, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.class);
            intent3.putExtra("key_command_id", i27);
            intent3.putExtra("appId", str7);
            intent3.putExtra("toUserName", str8);
            intent3.putExtra("extInfo", str9);
            intent3.putExtra(ya.b.f77502x92235c1b, i19);
            intent3.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, P);
            intent3.putExtra("jump_profile_type", P2);
            intent3.addFlags(268435456).addFlags(67108864);
            if (strArr4 != null && strArr4.length > 0) {
                java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
                for (java.lang.String str10 : strArr4) {
                    arrayList3.add(str10);
                }
                intent3.putStringArrayListExtra("androidPackNameList", arrayList3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.t(intent3, context3);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "ExtCallBizEvent open exdevice rank list.");
            android.content.Context context4 = x7Var.f89897c;
            android.content.Intent intent4 = new android.content.Intent(context4, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.class);
            intent4.addFlags(268435456);
            intent4.putExtra("key_command_id", 11);
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.t(intent4, context4);
        }
        return true;
    }
}
