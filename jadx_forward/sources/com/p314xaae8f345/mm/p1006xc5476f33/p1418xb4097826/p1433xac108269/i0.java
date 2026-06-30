package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

@j95.b
/* loaded from: classes10.dex */
public final class i0 extends i95.w implements c61.ub {
    public static void Ak(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, android.content.Intent intent, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        android.content.Intent intent2 = (i17 & 2) != 0 ? null : intent;
        boolean z19 = (i17 & 4) != 0 ? false : z17;
        boolean z27 = (i17 & 8) != 0 ? false : z18;
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
            i0Var.wl(context, intent2, z19, z27);
            return;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c0 c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c0(i0Var, context, intent2, z19, z27);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(context, 34359738368L, null, c0Var, 3);
    }

    public static void Qj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.app.Activity context, android.content.Intent intent, r45.kb4 localContent, r45.fn2 fn2Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        r45.fn2 fn2Var2 = (i17 & 8) != 0 ? null : fn2Var;
        boolean z19 = (i17 & 16) != 0 ? false : z17;
        boolean z27 = (i17 & 32) != 0 ? false : z18;
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localContent, "localContent");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15045x9eacaabe.class);
        intent2.putExtra("media_list_", localContent.mo14344x5f01b1f6());
        intent2.putExtra("media_list_count", localContent.m75941xfb821914(0).size());
        intent2.putExtra("ref_feed_info", fn2Var2 != null ? fn2Var2.mo14344x5f01b1f6() : null);
        intent2.putExtra("long_video_preview", z19);
        intent2.putExtra("KEY_SHOW_SEEK_BAR", z27);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMediaPreviewUI", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/protocal/protobuf/LocalFinderContent;Lcom/tencent/mm/protocal/protobuf/FinderObjectRefInfo;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMediaPreviewUI", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/protocal/protobuf/LocalFinderContent;Lcom/tencent/mm/protocal/protobuf/FinderObjectRefInfo;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void Rk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, android.content.Intent intent, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i0Var.ol(context, intent)) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        if (!z17) {
            intent.putExtra("key_to_comment_scene", 138);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.ui.ActivityC13649x64352d84.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMusicTopicUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMusicTopicUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void bk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, android.content.Intent intent, java.lang.Integer num, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            intent = null;
        }
        if ((i17 & 4) != 0) {
            num = 0;
        }
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = context instanceof android.app.Activity ? null : intent;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.putExtra("KEY_SOURCE", num);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14059x88678ab1.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderNewManagementUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderNewManagementUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void gl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, bw5.o50 categoryItem, bw5.ar0 enterScene, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        android.content.Intent intent;
        boolean z19 = (i17 & 8) != 0 ? true : z17;
        boolean z27 = (i17 & 16) != 0 ? false : z18;
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryItem, "categoryItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        bw5.ar0 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.cd0.f208113a.b(context, enterScene);
        boolean h17 = il4.l.f373675a.h(context);
        java.lang.String str = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            str = intent.getStringExtra("finder_username");
        }
        il4.e eVar = new il4.e(null, 0, b17.f106955d, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        il4.f fVar = eVar.f373655s;
        fVar.f373664c = h17;
        if (str != null) {
            fVar.f373665d.put("finderusername", str);
        }
        eVar.f373657u = z27;
        qk.f9.c(((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj(), context, categoryItem, b17, eVar, null, 16, null);
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k0.f206625a.a(context, "TingCategory");
        }
    }

    public static void pj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, android.content.Intent intent, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            intent = null;
        }
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("KEY_TALKER_TYPE", 1);
        intent.putExtra("KEY_TALKER_SCENE", 2);
        intent.putExtra("KEY_FINDER_PROCESS_ID", 3);
        android.content.Intent intent2 = context instanceof android.app.Activity ? null : intent;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15023xcce103d.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderConversationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderConversationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 sl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, yz5.l lVar, int i18, java.lang.Object obj) {
        return i0Var.pl(context, str, (i18 & 4) != 0 ? null : intent, i17, (i18 & 16) != 0 ? null : lVar);
    }

    public static final boolean wi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, int i17, int i18, java.lang.String str) {
        i0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ActivityRouter", "checkShowCgiErrorAlter: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        if (i17 == 0 && i18 == 0) {
            return false;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293262s = str;
        aVar.A = true;
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        return true;
    }

    public static void wk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, android.content.Intent intent, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            intent = null;
        }
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14096xb222a3af.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderTeenModeTipsUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderTeenModeTipsUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Ai(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13930xdbd6d612.class);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterAccountManagementUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterAccountManagementUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Aj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enterFinderGameLiveFinishUI");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        jz2.x0 x0Var = jz2.x0.f384287a;
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.D).mo141623x754a37bb());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGameLiveFinishUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGameLiveFinishUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Bi(android.content.Context context, android.content.Intent intent, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (ol(context, intent)) {
            return;
        }
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        if (!z17) {
            intent2.putExtra("key_to_comment_scene", 59);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent2);
        }
        android.content.Intent intent3 = !(context instanceof android.app.Activity) ? intent2 : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.ActivityC13641x5c962c08.class);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.ActivityC13641x5c962c08.f183271v;
        long longExtra = intent2.getLongExtra("key_activity_id", 0L);
        java.lang.String stringExtra = intent2.getStringExtra("key_encrypted_topic_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        long longExtra2 = intent2.getLongExtra("key_feed_ref_id", 0L);
        java.lang.String stringExtra2 = intent2.getStringExtra("key_feed_ref_dup_flag");
        java.lang.String stringExtra3 = intent2.getStringExtra("key_by_pass_info");
        r45.a34 a34Var = new r45.a34();
        java.lang.String str = "KEY_JSAPI_SOURCE_TYPE";
        a34Var.set(0, java.lang.Integer.valueOf(intent2.getIntExtra("KEY_JSAPI_SOURCE_TYPE", 0)));
        java.lang.String str2 = "KEY_JSAPI_SOURCE_BUFFER";
        java.lang.String stringExtra4 = intent2.getStringExtra("KEY_JSAPI_SOURCE_BUFFER");
        if (stringExtra4 != null) {
            a34Var.set(1, stringExtra4);
        }
        jz5.g gVar = u92.e.f507357h;
        java.util.Iterator it = ((java.util.List) ((jz5.n) u92.e.f507357h).mo141623x754a37bb()).iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.ActivityC13641x5c962c08.f183271v;
            r45.a34 a34Var2 = a34Var;
            java.lang.String b17 = ey2.o2.b(ey2.p2.f339000g, longExtra, stringExtra, null, intValue, 1, 4, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityProfileUI", "preloadTab cacheKey:" + b17);
            ir2.g0.a(ir2.a1.f375622r, new ba2.a(7, longExtra, java.lang.Long.valueOf(longExtra2), stringExtra2, stringExtra, 1, null, null, stringExtra3, b17, 0, a34Var2), null, null, 6, null);
            str2 = str2;
            str = str;
            a34Var = a34Var2;
        }
        java.lang.String str3 = str2;
        java.lang.String str4 = str;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.ActivityC13641x5c962c08.f183271v;
        long longExtra3 = intent2.getLongExtra("key_activity_id", 0L);
        java.lang.String stringExtra5 = intent2.getStringExtra("key_encrypted_topic_id");
        java.lang.String str5 = stringExtra5 == null ? "" : stringExtra5;
        long longExtra4 = intent2.getLongExtra("key_feed_id", 0L);
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ir2.y1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ir2.y1 y1Var = (ir2.y1) a17;
        r45.a34 a34Var3 = new r45.a34();
        a34Var3.set(0, java.lang.Integer.valueOf(intent2.getIntExtra(str4, 0)));
        java.lang.String stringExtra6 = intent2.getStringExtra(str3);
        if (stringExtra6 != null) {
            a34Var3.set(1, stringExtra6);
        }
        p3325xe03a0797.p3326xc267989b.l.d(y1Var.mo144225x95f74600(), null, null, new s92.e(longExtra3, str5, longExtra4, a34Var3, null), 3, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterActivityProfileUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterActivityProfileUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Bj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727.class);
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderImagePreviewUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderImagePreviewUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Bk(java.lang.String str, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        if (str == null) {
            str = "";
        }
        intent.putExtra("Contact_User", str);
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public void Cj(android.content.Context context, android.content.Intent intent, int i17, java.util.List topicList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicList, "topicList");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13974xf3622848.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(topicList, 10));
        java.util.Iterator it = topicList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13878x16d00f4e((r45.r03) it.next()));
        }
        arrayList.addAll(arrayList2);
        intent.putExtra("KEY_TOPIC_LIST", arrayList);
        intent.putExtra("KEY_SCENE", i17);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderInteractionSearchUI", "(Landroid/content/Context;Landroid/content/Intent;ILjava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderInteractionSearchUI", "(Landroid/content/Context;Landroid/content/Intent;ILjava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Ck(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13957xb8bbb130.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFriendLikeTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFriendLikeTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Di(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i18, java.lang.String str7) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_encrypted_topic_id", str == null ? "" : str);
        intent.putExtra("key_activity_name", str2 == null ? "" : str2);
        intent.putExtra("key_extra_report_info", str4 == null ? "" : str4);
        intent.putExtra("key_enter_scene", i17);
        if (!(str3 == null || str3.length() == 0)) {
            intent.putExtra("key_extra_info", r26.i0.t(str3, ",", ";", false));
        }
        intent.putExtra("KEY_JSAPI_SOURCE_TYPE", i18);
        if (str7 != null) {
            intent.putExtra("KEY_JSAPI_SOURCE_BUFFER", str7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l0.f183872b;
        l0Var.getClass();
        if (l0Var.f183836a.containsKey(str5 != null ? str5 : "")) {
            intent.putExtra("async_callback_param", str5);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enterActivityProfileUI :" + str + " eventName:" + str2 + " entryScene:" + i17);
        java.lang.String str8 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s0.f206872a;
        s92.g gVar = s92.g.f486539a;
        if (36 == i17) {
            gVar.a(context, intent, c01.id.c(), 3);
        } else {
            gVar.a(context, intent, c01.id.c(), 5);
        }
        if (36 == i17) {
            if (!(str8 == null || str8.length() == 0)) {
                intent.putExtra("key_context_id", str8);
                intent.putExtra("CLIENT_KV_REPORTINFO", str6);
                intent.putExtra("key_activity_profile_src_type", "4");
                Bi(context, intent, true);
            }
        }
        if (6 == i17) {
            i95.m c17 = i95.n0.c(zy2.b6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((c61.l7) ((zy2.b6) c17)).Bj(6, 2, 59, intent);
        } else if (15 == i17) {
            intent.putExtra("key_extra_info", str4);
            i95.m c18 = i95.n0.c(zy2.b6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ((c61.l7) ((zy2.b6) c18)).Bj(15, 2, 59, intent);
        } else {
            i95.m c19 = i95.n0.c(zy2.b6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            ((c61.l7) ((zy2.b6) c19)).Bj(4, 4, 59, intent);
        }
        intent.putExtra("CLIENT_KV_REPORTINFO", str6);
        intent.putExtra("key_activity_profile_src_type", "4");
        Bi(context, intent, true);
    }

    public final void Dj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15038x7294f699.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLikedFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLikedFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Dk(android.app.Activity context, android.content.Intent intent, int i17, int i18, byte[] bArr, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("BIZ_SCENE", i18);
        intent.putExtra("EXT_BUFF", bArr);
        intent.putExtra("TAB_TYPE", i19);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13959xc919d7e1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterGalleryTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;II[BI)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void Ej(android.content.Context context, dk2.x4 config, java.lang.String contextId, android.content.Intent intent) {
        dk2.r9 f17;
        dk2.r9 d17;
        dk2.r9 g17;
        dk2.r9 a17;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "[enterFinderLiveAnchorUI] " + config);
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        dk2.r9 r9Var = dk2.r9.f315558a;
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Zi("", "goAnchorUIWithCheck");
        ws2.k1.f530599r.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = contextId;
        if (contextId.length() == 0) {
            zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
            if (Sj == null || (str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).f216915p) == null) {
                str = "";
            }
            h0Var.f391656d = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "goAnchorUIWithCheck locContextId:" + ((java.lang.String) h0Var.f391656d));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        h0Var2.f391656d = string;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionChannels.k(context, null)) {
            r9Var = null;
        }
        if (r9Var != null) {
            dk2.p8 p8Var = new dk2.p8(context, h0Var2);
            if (!zl2.r4.f555489g && com.p314xaae8f345.mm.ui.bk.A()) {
                p8Var.mo152xb9724478();
                r9Var = null;
            }
            if (r9Var == null || (f17 = r9Var.f(new dk2.r8(context, h0Var2))) == null || (d17 = f17.d(new dk2.s8(context))) == null) {
                return;
            }
            iq.b.r();
            dk2.r9 e17 = d17.e(context, true, new dk2.t8(config, context, h0Var, intent, ""));
            if (e17 == null || (g17 = e17.g(context, new dk2.u8(context))) == null || (a17 = g17.a(new dk2.v8(context))) == null) {
                return;
            }
            if (iq.b.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "checkTingChatRoom conflict with ting chat room");
                a17 = null;
            }
            if (a17 != null) {
                dk2.n8 n8Var = new dk2.n8(context);
                if (iq.b.q(null, false)) {
                    n8Var.mo152xb9724478();
                    a17 = null;
                }
                if (a17 != null) {
                    a17.h(context, config, (java.lang.String) h0Var.f391656d, "", intent);
                }
            }
        }
    }

    public void Ek(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14092xe1a56d1c.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterGameRankSwitchUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterGameRankSwitchUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void Fj(android.content.Intent intent, android.content.Context context, long j17, long j18, java.lang.String nonceId, java.lang.String str, java.lang.String contextId, java.lang.String str2, java.lang.String str3) {
        r45.nw1 m59258xd0557130;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        en0.g gVar = new en0.g();
        gVar.f336779a = 0;
        gVar.f336781c = j18;
        gVar.f336795q = nonceId;
        gVar.f336789k = j17;
        gVar.f336784f = xy2.c.e(context);
        gVar.f336790l = str;
        gVar.f336802x = str3;
        gVar.f336801w = str2;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e a17 = gVar.a();
        dk2.x4 x4Var = new dk2.x4();
        x4Var.f315851l.add(a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j17);
        x4Var.f315852m = (h17 == null || (m59258xd0557130 = h17.m59258xd0557130()) == null) ? -1 : m59258xd0557130.m75939xb282bd08(21);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bk(j18);
        Ej(context, x4Var, contextId, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Fk(android.content.Context r6, android.content.Intent r7, int r8, java.lang.String r9) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            if (r7 != 0) goto Lc
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
        Lc:
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_FINDER_LIVE_TASK_GUIDE_FLAG_BOOLEAN_SYNC
            r2 = 0
            boolean r0 = r0.o(r1, r2)
            r3 = 1
            r0 = r0 ^ r3
            if (r9 == 0) goto L2c
            int r4 = r9.length()
            if (r4 <= 0) goto L27
            r4 = r3
            goto L28
        L27:
            r4 = r2
        L28:
            if (r4 != r3) goto L2c
            r4 = r3
            goto L2d
        L2c:
            r4 = r2
        L2d:
            if (r4 == 0) goto L30
            goto L37
        L30:
            if (r0 == 0) goto L35
            java.lang.String r9 = "https://channels.weixin.qq.com/mobile-support/pages/anchor-tasks/whatsnew"
            goto L37
        L35:
            java.lang.String r9 = "https://channels.weixin.qq.com/mobile-support/pages/anchor-tasks/tasks"
        L37:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.net.Uri$Builder r9 = r9.buildUpon()
            java.lang.String r4 = "buildUpon(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r4)
            java.lang.String r4 = "SourceScene"
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r9.appendQueryParameter(r4, r8)
            android.net.Uri r8 = r9.build()
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r9)
            java.lang.String r9 = "showShare"
            r7.putExtra(r9, r2)
            java.lang.String r9 = "KRightBtn"
            r7.putExtra(r9, r3)
            java.lang.String r9 = "rawUrl"
            r7.putExtra(r9, r8)
            r8 = 0
            java.lang.String r9 = "webview"
            java.lang.String r2 = ".ui.tools.WebViewUI"
            j45.l.j(r6, r9, r2, r7, r8)
            if (r0 == 0) goto L84
            gm0.b0 r6 = gm0.j1.u()
            com.tencent.mm.storage.n3 r6 = r6.c()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.x(r1, r7)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.Fk(android.content.Context, android.content.Intent, int, java.lang.String):void");
    }

    public void Gj(android.app.Activity context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        jz2.x0 x0Var = jz2.x0.f384287a;
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.f384296j).mo141623x754a37bb());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveCreateVisitorRoleUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void Gk(android.content.Context context, android.content.Intent intent, java.lang.String authorFinderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "#enterMemberAreaUI authorFinderUsername=".concat(authorFinderUsername));
        if (ol(context, intent)) {
            return;
        }
        intent.putExtra("key_to_comment_scene", 204);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        ml(context, intent);
        intent.putExtra("key_author_finder_name", authorFinderUsername);
        intent.putExtra("finder_username", authorFinderUsername);
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14477x2ab0681.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMemberAreaUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMemberAreaUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Hj(android.content.Context context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            if (intent == null) {
                intent = new android.content.Intent();
            }
            jz2.x0 x0Var = jz2.x0.f384287a;
            intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.G).mo141623x754a37bb());
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).startActivityForResult(intent, i17);
        }
    }

    public final void Hk(android.content.Context context, android.content.Intent intent, java.lang.String authorFinderUsername, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        ml(context, intent);
        intent.putExtra("key_author_finder_name", authorFinderUsername);
        intent.putExtra("key_finder_member_status", i17);
        intent.putExtra("key_finder_member_visitor_status", i18);
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14478xa545d043.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMemberBanUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMemberBanUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Ij(android.app.Activity activity, android.content.Intent intent, int i17, r45.n01 info, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        jz2.x0 x0Var = jz2.x0.f384287a;
        intent.setClass(activity, (java.lang.Class) ((jz5.n) jz2.x0.M).mo141623x754a37bb());
        intent.putExtra("INTENT_KEY_ERROR_PAGE_INFO", info.mo14344x5f01b1f6());
        intent.putExtra("INTENT_KEY_ERROR_PAGE_TYPE", num);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLivePostSecurityUI", "(Landroid/app/Activity;Landroid/content/Intent;ILcom/tencent/mm/protocal/protobuf/FinderCreateLiveWarnPageCommon;Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void Ik(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (ol(context, intent)) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        ml(context, intent);
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMemberFanListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMemberFanListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Jj(android.app.Activity context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        jz2.x0 x0Var = jz2.x0.f384287a;
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.f384294h).mo141623x754a37bb());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLivePrecheckLicenseUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ae, code lost:
    
        if (r11 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jk(android.content.Context r17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r18, int r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.Jk(android.content.Context, com.tencent.mm.plugin.finder.storage.FinderItem, int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Kj(android.content.Context r24, r45.j01 r25, android.content.Intent r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.Kj(android.content.Context, r45.j01, android.content.Intent, boolean):void");
    }

    public void Kk(android.content.Context context, android.content.Intent intent, java.lang.String authorFinderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "#enterMemberPreviewUI authorFinderUsername=".concat(authorFinderUsername));
        if (ol(context, intent)) {
            return;
        }
        intent.putExtra("key_to_comment_scene", 206);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        ml(context, intent);
        intent.putExtra("key_author_finder_name", authorFinderUsername);
        intent.putExtra("finder_username", authorFinderUsername);
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14481x516a7dbc.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMemberPreviewUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMemberPreviewUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Lj(android.app.Activity activity, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        jz2.x0 x0Var = jz2.x0.f384287a;
        intent.setClass(activity, (java.lang.Class) ((jz5.n) jz2.x0.K).mo141623x754a37bb());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveShoppingManagerUIForResult", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
    }

    public void Lk(android.content.Context context, android.content.Intent i17, java.lang.String authorFinderUsername, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i17, "i");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        i17.putExtra("key_author_finder_name", authorFinderUsername);
        i17.putExtra("key_member_qa_type", i18);
        android.content.Intent intent = !(context instanceof android.app.Activity) ? i17 : null;
        if (intent != null) {
            intent.addFlags(268435456);
        }
        i17.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15046x3f02b3e4.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(i17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostQAUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostQAUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Mj(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = "userName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            g92.b r0 = g92.b.f351302e
            m92.i r0 = r0.X4(r6)
            r1 = 0
            if (r0 == 0) goto L52
            int r2 = r0.f406520a
            r3 = 1
            if (r2 != r3) goto L52
            java.lang.String r2 = r0.f406521b
            if (r2 == 0) goto L2a
            int r2 = r2.length()
            if (r2 <= 0) goto L25
            r2 = r3
            goto L26
        L25:
            r2 = r1
        L26:
            if (r2 != r3) goto L2a
            r2 = r3
            goto L2b
        L2a:
            r2 = r1
        L2b:
            if (r2 == 0) goto L52
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.Class<l40.e> r2 = l40.e.class
            i95.m r2 = i95.n0.c(r2)
            l40.e r2 = (l40.e) r2
            java.lang.String r0 = r0.f406521b
            k40.f r2 = (k40.f) r2
            java.lang.String r6 = r2.Ai(r6, r0)
            java.lang.String r0 = "rawUrl"
            r1.putExtra(r0, r6)
            r6 = 0
            java.lang.String r0 = "webview"
            java.lang.String r2 = ".ui.tools.WebViewUI"
            j45.l.j(r5, r0, r2, r1, r6)
            r1 = r3
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.Mj(android.content.Context, java.lang.String):boolean");
    }

    public final void Mk(android.content.Context context, android.content.Intent intent, int i17, int i18, java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
        android.app.Activity Ui;
        android.content.Context context2 = ((context instanceof android.app.Activity) || (Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui()) == null) ? context : Ui;
        if (num != null && num.intValue() == 2) {
            Hk(context2, intent, str, 2, num2 != null ? num2.intValue() : 0);
            return;
        }
        if (num2 != null && num2.intValue() == 0) {
            if (i17 != 0 && i18 != 0) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, i18, 206, intent);
            }
            Kk(context2, intent, str);
            return;
        }
        if (i17 != 0 && i18 != 0) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, i18, 204, intent);
        }
        Gk(context2, intent, str);
    }

    public final void Ni(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.ActivityRouter", "青少年模式只看关注时，禁止进入专辑.");
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterAlbumRelatedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterAlbumRelatedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Nj(android.app.Activity context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        jz2.x0 x0Var = jz2.x0.f384287a;
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.L).mo141623x754a37bb());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLotteryAudienceUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLotteryAudienceUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Nk(android.content.Context context, android.content.Intent intent, java.lang.String authorFinderUsername, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        if (ol(context, intent)) {
            return;
        }
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        r45.qt2 qt2Var = null;
        if ((context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? context : null) != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            if (nyVar != null) {
                qt2Var = nyVar.V6();
            }
        }
        eo2.d c17 = eo2.f.f337098a.c(authorFinderUsername);
        if (c17 != null) {
            Mk(context, intent2, i17, i18, authorFinderUsername, java.lang.Integer.valueOf(c17.f337093b), java.lang.Integer.valueOf(c17.f337094c));
            return;
        }
        ho2.c cVar = new ho2.c(qt2Var, authorFinderUsername, 0, 4, null);
        az2.j.u(cVar, context, null, 0L, 6, null);
        pm0.v.T(cVar.l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e0(this, context, intent2, i17, i18, authorFinderUsername));
    }

    public void Oj(android.content.Context context, android.content.Intent intent, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        if (z17) {
            intent.putExtra("KEY_IS_FROM_SETTING", true);
        }
        if (!(context instanceof android.app.Activity)) {
            context = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a.b();
        }
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        jz2.x0 x0Var = jz2.x0.f384287a;
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.f384306t).mo141623x754a37bb());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLotteryHistoryUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLotteryHistoryUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Ok(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f.class);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterModifyNameUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterModifyNameUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Pj(android.app.Activity context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        jz2.x0 x0Var = jz2.x0.f384287a;
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.f384308v).mo141623x754a37bb());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLotteryWinnerListUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLotteryWinnerListUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Pk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ri()) {
            if (intent == null) {
                intent = new android.content.Intent();
            }
            android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            try {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16649xd6b36a3b.f232393h;
                intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16649xd6b36a3b.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMusicMvMainUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMusicMvMainUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.ClassNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ActivityRouter", "enterMusicMvMainUI : " + e17);
            }
        }
    }

    public final void Qk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        try {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b.f232422g;
            intent.putExtra("KEY_MUSIC_ROUTER", 3);
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMusicMvMakerUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMusicMvMakerUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ActivityRouter", "enterMusicMvMakerUI : " + e17);
        }
    }

    public final void Ri(android.app.Activity context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13929xfdbd586b.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        hc2.e0.a(intent, 0, null, 3, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterBizProfileTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void Rj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        android.content.Intent intent3 = !(context instanceof android.app.Activity) ? intent2 : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        intent2.addFlags(67108864);
        intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.class);
        intent2.putExtra("key_mention_business_type", 1);
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.f210107t;
        bq.p0 p0Var = bq.q0.f105046t;
        bq.q0.f105047u.clear();
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.f210110w;
        int length = iArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            int i19 = iArr[i17];
            int i27 = i18 + 1;
            ir2.g0 g0Var = ir2.a1.f375622r;
            java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.f210108u.get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            ir2.g0.a(g0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14859x45ba311f(1, i19, (int[]) obj, xy2.c.e(context), 1), null, null, 6, null);
            i17++;
            i18 = i27;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMemberNotifyMsgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMemberNotifyMsgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Sj(android.content.Context context, android.content.Intent intent, long j17, java.lang.String nonceId, r45.kb4 kb4Var, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        if (ol(context, intent)) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        ml(context, intent);
        intent.putExtra("key_feed_id", j17);
        intent.putExtra("key_nonce_id", nonceId);
        intent.putExtra("key_local_media", kb4Var != null ? kb4Var.mo14344x5f01b1f6() : null);
        android.content.Intent intent2 = context instanceof android.app.Activity ? null : intent;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f.class);
        if (num == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMemberQAVideoUI", "(Landroid/content/Context;Landroid/content/Intent;JLjava/lang/String;Lcom/tencent/mm/protocal/protobuf/LocalFinderContent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMemberQAVideoUI", "(Landroid/content/Context;Landroid/content/Intent;JLjava/lang/String;Lcom/tencent/mm/protocal/protobuf/LocalFinderContent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        int intValue = num.intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMemberQAVideoUI", "(Landroid/content/Context;Landroid/content/Intent;JLjava/lang/String;Lcom/tencent/mm/protocal/protobuf/LocalFinderContent;Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void Sk(android.content.Context context, nr2.m paidCollectionData, boolean z17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paidCollectionData, "paidCollectionData");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        intent.putExtra("collection_ref_comment_scene", V6 != null ? V6.m75939xb282bd08(5) : 0);
        intent.putExtra("paid_collection_topic_id", paidCollectionData.l());
        intent.putExtra("KEY_FINDER_SELF_FLAG", z17);
        intent.putExtra("paid_collection_info", paidCollectionData.f420801d.mo14344x5f01b1f6());
        intent.putExtra("paid_collection_username", str);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14061xec7cb04.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPaidCollectionUI", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionData;ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPaidCollectionUI", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionData;ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Tj(android.content.Context context, android.content.Intent intent, java.lang.String authorFinderUsername, java.lang.String finderMemberTicket, int i17, int i18, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderMemberTicket, "finderMemberTicket");
        if (ol(context, intent)) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        ml(context, intent);
        intent.putExtra("key_author_finder_name", authorFinderUsername);
        intent.putExtra("key_finder_member_ticket", finderMemberTicket);
        intent.putExtra("key_finder_member_visitor_status", i17);
        intent.putExtra("key_finder_member_feed_type", i18);
        intent.putExtra("key_member_title", str);
        intent.putExtra("key_member_price", num);
        intent.putExtra("key_member_subscribe_price", num2);
        intent.putExtra("key_remain_feed_count", num3);
        intent.putExtra("key_member_preview_mode", i19);
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14488x37b59d35.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMemberTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMemberTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Tk(android.content.Context context, android.content.Intent i17, r45.f96 location, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i17, "i");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        if (ol(context, i17)) {
            return;
        }
        boolean z17 = context instanceof android.app.Activity;
        android.content.Intent intent = !z17 ? i17 : null;
        if (intent != null) {
            intent.addFlags(268435456);
        }
        i17.addFlags(134217728);
        int intExtra = i17.getIntExtra("key_entrance_type", -1);
        la2.d dVar = la2.d.f399043a;
        java.io.Serializable serializableExtra = i17.getSerializableExtra("key_from_type");
        zy2.o9 o9Var = serializableExtra instanceof zy2.o9 ? (zy2.o9) serializableExtra : null;
        java.io.Serializable serializableExtra2 = i17.getSerializableExtra("key_half_screen_mode");
        int i19 = o9Var == zy2.o9.f559049d ? 81 : (serializableExtra2 instanceof la2.a ? (la2.a) serializableExtra2 : null) == la2.a.f399034e ? 303 : 26;
        location.set(16, java.lang.Boolean.TRUE);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(context, i17, i19, intExtra);
        dVar.b(context, i17, i18, location, true, 15, true, i17.getBooleanExtra("key_enable_flutter_poi", false));
        if (z17) {
            ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
    }

    public void Ui(android.content.Context context, java.lang.String fromUsername, r45.xn1 toUser, int i17, int i18, yz5.a aVar) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (toUser.m75933x41a8a7f2(10)) {
            db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.enz, 0).show();
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) toUser.m75936x14adae67(0);
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "[enterChattingUIFromLive] fromUsername=" + fromUsername + " toUsername=" + str2 + " scene=" + i17);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = db2.m4.f309605t;
        db2.m4.f309605t = toUser.m75934xbce7f2f(9);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4 m4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l(str2, this, context, aVar, fromUsername, i18);
        if (!(str2.length() == 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.d(m4Var, context, i17, str2, null, 0L, 0L, false, null, null, null, null, null, null, false, false, false, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.i4(lVar), 524280, null);
            return;
        }
        lVar.a("", false, 0, 0, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.SessionInfoService", "[getSessionId] username=" + str2 + " is invalid, just return.");
    }

    public final void Uj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15069x5667c8cb.class);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMessageSettingUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMessageSettingUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Uk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (ol(context, intent)) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.getBooleanExtra("key_enable_flutter_poi", false);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.class);
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        int intExtra = intent.getIntExtra("key_entrance_type", -1);
        java.io.Serializable serializableExtra = intent.getSerializableExtra("key_from_type");
        zy2.o9 o9Var = serializableExtra instanceof zy2.o9 ? (zy2.o9) serializableExtra : null;
        java.io.Serializable serializableExtra2 = intent.getSerializableExtra("key_half_screen_mode");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(context, intent, o9Var == zy2.o9.f559049d ? 81 : (serializableExtra2 instanceof la2.a ? (la2.a) serializableExtra2 : null) == la2.a.f399034e ? 303 : 26, intExtra);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPoiFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPoiFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Vi(android.content.Context context, int i17, r45.zy1 toUser, java.lang.String lotteryId, long j17, r45.qt2 qt2Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryId, "lotteryId");
        if (toUser.m75933x41a8a7f2(5)) {
            db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.enz, 0).show();
            return;
        }
        java.lang.String m75945x2fec8307 = toUser.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String str = m75945x2fec8307;
        int i18 = z17 ? 1 : 7;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4 m4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n(this, context, qt2Var, i17);
        if (!(str.length() == 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.d(m4Var, context, i17, str, null, j17, 0L, true, lotteryId, null, java.lang.Integer.valueOf(i18), null, null, null, false, false, false, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.d4(nVar), 523560, null);
            return;
        }
        nVar.a("", false, 0, 0, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.SessionInfoService", "[getSessionId] username=" + str + " is invalid, just return.");
    }

    public final void Vj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        hz2.d dVar = hz2.d.f367846a;
        if (dVar.b(ya.a.f77450x918d59a8) != 0) {
            db5.e1.y(context, dVar.c(ya.a.f77450x918d59a8), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
            return;
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 0L, 1L, false);
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14953xa4cd9092.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMixSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMixSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.overridePendingTransition(0, 0);
        }
    }

    public final void Vk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14064x3f930afd.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPoiManageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPoiManageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Wj(android.content.Context context, android.content.Intent intent, int i17, java.util.List topicList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicList, "topicList");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13974xf3622848.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(topicList, 10));
        java.util.Iterator it = topicList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13878x16d00f4e((r45.r03) it.next()));
        }
        arrayList.addAll(arrayList2);
        intent.putExtra("KEY_TOPIC_LIST", arrayList);
        intent.putExtra("KEY_MIX_SEARCH_TAB_TYPE", i17);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMixSearchUI", "(Landroid/content/Context;Landroid/content/Intent;ILjava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMixSearchUI", "(Landroid/content/Context;Landroid/content/Intent;ILjava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Wk(android.app.Activity context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.addFlags(67108864);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14065xa37006af.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPoiRelativeList", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void Xj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        xy2.c.c(context, intent);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMsgFeedDetailUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMsgFeedDetailUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Xk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14066x6ba5f9d9.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPoiTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPoiTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Yj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15050x22d18475.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMultiTaskRouterUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderMultiTaskRouterUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Yk(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, android.content.Intent intent, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!z17) {
            if (intent == null) {
                intent = new android.content.Intent();
            }
            intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d.class);
            activity.startActivityForResult(intent, i17);
            return;
        }
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = activity;
        cVar.d(intent);
        cVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15225x42c8d450.class);
        cVar.a("com.tencent.mm.plugin.finder.ui.FinderPostAtUI");
        cVar.h(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Zi(android.content.Context r27, java.lang.String r28, int r29, android.content.Intent r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.Integer r33, java.lang.Long r34) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.Zi(android.content.Context, java.lang.String, int, android.content.Intent, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long):void");
    }

    public final void Zj(android.content.Context context, r45.qj2 nativeDramaInfo, long j17, java.lang.String str, boolean z17, java.lang.Integer num, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        android.app.Activity m81193x1252e2cf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nativeDramaInfo, "nativeDramaInfo");
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.ActivityC13714x7254592f.class);
        intent.putExtra("native_drama_id", nativeDramaInfo.m75942xfb822ef2(0));
        intent.putExtra("native_drama_info", nativeDramaInfo.mo14344x5f01b1f6());
        intent.putExtra("native_drama_object_id", j17);
        intent.putExtra("native_drama_object_dup_flag", str);
        intent.putExtra("native_drama_init_position", num);
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f activityC13722xc5bc5e9f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f) context;
            intent.putExtra("native_drama_enter_object_id", activityC13722xc5bc5e9f.getIntent().getLongExtra("native_drama_enter_object_id", 0L));
            intent.putExtra("native_drama_enter_promotion_comment_scene", activityC13722xc5bc5e9f.getIntent().getIntExtra("native_drama_enter_promotion_comment_scene", -1));
            intent.putExtra("native_drama_enter_dupflag", activityC13722xc5bc5e9f.getIntent().getStringExtra("native_drama_enter_dupflag"));
            intent.putExtra("native_drama_session_buffer", activityC13722xc5bc5e9f.getIntent().getStringExtra("native_drama_session_buffer"));
        } else {
            intent.putExtra("native_drama_enter_object_id", j17);
            intent.putExtra("native_drama_enter_promotion_comment_scene", i17);
            intent.putExtra("native_drama_enter_dupflag", str);
            intent.putExtra("native_drama_session_buffer", str2);
            java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, str, i17);
            java.lang.String str3 = "openDetail enterObjectId " + pm0.v.u(j17) + " buffer " + pm0.v.e0(ek6, ek6.length() - 8, ek6.length());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209175cd).mo141623x754a37bb()).r()).booleanValue()) {
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = str3;
                e4Var.c();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", str3);
        }
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderNativeDramaDetailUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderNativeDramaInfo;JLjava/lang/String;ZLjava/lang/Integer;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderNativeDramaDetailUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderNativeDramaInfo;JLjava/lang/String;ZLjava/lang/Integer;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        pf5.u uVar = pf5.u.f435469a;
        intent.putExtra("key_context_id", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) uVar.b(context).c(zy2.ra.class))).V6().m75945x2fec8307(1));
        intent.putExtra("key_click_tab_context_id", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) uVar.b(context).c(zy2.ra.class))).V6().m75945x2fec8307(2));
        intent.putExtra("native_drama_drawer_mode", true);
        p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.b(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y) a17;
        long longExtra = intent.getLongExtra("native_drama_id", 0L);
        int intExtra = intent.getIntExtra("native_drama_init_position", 0);
        long longExtra2 = intent.getLongExtra("native_drama_object_id", 0L);
        if (longExtra == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderNativeDramaDramaUIC", "no id");
            return;
        }
        yVar.f186720e = longExtra2;
        if (yVar.f186728p) {
            if (yVar.f186719d != longExtra) {
                yVar.O6();
                p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = yVar.m158354x19263085().mo7595x9cdc264().m7630xb2c12e75();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
                android.widget.FrameLayout frameLayout = yVar.f186723h;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b17 = lk5.q0.b("com.tencent.mm.plugin.finder.drama.drawer.FinderNativeDramaDetailNewUI", intent, false, 4, null);
                yVar.f186721f = b17;
                b17.q0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.w(yVar));
                gx2.q qVar = yVar.f186722g;
                if (qVar != null) {
                    qVar.m132474x77f391b9(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.x(yVar));
                }
                com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = yVar.f186721f;
                if (c22584xf7d97e83 != null) {
                    m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.tfd, c22584xf7d97e83, null);
                    m7630xb2c12e75.f();
                }
                yVar.f186719d = longExtra;
            } else {
                gx2.q qVar2 = yVar.f186722g;
                if (qVar2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(qVar2, false, 1, null);
                }
                com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = yVar.f186721f;
                if (c22584xf7d97e832 != null) {
                    pf5.z zVar = pf5.z.f435481a;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.j) zVar.b(c22584xf7d97e832).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.j.class)).f186788v = longExtra2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0) zVar.b(c22584xf7d97e832).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0.class);
                    e0Var.f186762s = intExtra;
                    e0Var.P6(intExtra);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = e0Var.f186755i;
                    if (c1163xf1deaba4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("episodeRv");
                        throw null;
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
                    if (mo7946xf939df19 != null) {
                        mo7946xf939df19.m8146xced61ae5();
                    }
                    if (!(yVar.m80379x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f)) {
                        intent.getLongExtra("native_drama_enter_object_id", 0L);
                        intent.getIntExtra("native_drama_enter_promotion_comment_scene", -1);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0) zVar.b(c22584xf7d97e832).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0.class)).getClass();
                    }
                }
            }
            abstractActivityC22579xbed01a37 = null;
        } else if (yVar.f186719d != longExtra) {
            yVar.O6();
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e752 = yVar.m158354x19263085().mo7595x9cdc264().m7630xb2c12e75();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e752, "beginTransaction(...)");
            android.widget.FrameLayout frameLayout2 = yVar.f186723h;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
            }
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b18 = lk5.q0.b("com.tencent.mm.plugin.finder.drama.detail.FinderNativeDramaDetailUI", intent, false, 4, null);
            yVar.f186721f = b18;
            b18.q0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.u(yVar));
            gx2.q qVar3 = yVar.f186722g;
            if (qVar3 != null) {
                qVar3.m132474x77f391b9(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.v(yVar));
            }
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e833 = yVar.f186721f;
            if (c22584xf7d97e833 != null) {
                abstractActivityC22579xbed01a37 = null;
                m7630xb2c12e752.k(com.p314xaae8f345.mm.R.id.tfd, c22584xf7d97e833, null);
                m7630xb2c12e752.f();
            } else {
                abstractActivityC22579xbed01a37 = null;
            }
            yVar.f186719d = longExtra;
        } else {
            abstractActivityC22579xbed01a37 = null;
            gx2.q qVar4 = yVar.f186722g;
            if (qVar4 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(qVar4, false, 1, null);
            }
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e834 = yVar.f186721f;
            if (c22584xf7d97e834 != null) {
                pf5.z zVar2 = pf5.z.f435481a;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.i) zVar2.b(c22584xf7d97e834).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.i.class)).f186695u = longExtra2;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.p) zVar2.b(c22584xf7d97e834).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.p.class)).y7(intExtra);
                if (!(yVar.m80379x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f)) {
                    long longExtra3 = intent.getLongExtra("native_drama_enter_object_id", 0L);
                    int intExtra2 = intent.getIntExtra("native_drama_enter_promotion_comment_scene", -1);
                    java.lang.String stringExtra = intent.getStringExtra("native_drama_enter_dupflag");
                    java.lang.String stringExtra2 = intent.getStringExtra("native_drama_session_buffer");
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.p) zVar2.b(c22584xf7d97e834).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.p.class)).Y6()) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.c) pf5.z.f435481a.b(fragment).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.c.class);
                        if (cVar != null) {
                            cVar.f186668h = longExtra3;
                            cVar.f186669i = intExtra2;
                            cVar.f186670m = stringExtra;
                            cVar.f186671n = stringExtra2;
                        }
                    }
                }
            }
        }
        android.app.Activity m80379x76847179 = yVar.m80379x76847179();
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372 = m80379x76847179 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) m80379x76847179 : abstractActivityC22579xbed01a37;
        if (abstractActivityC22579xbed01a372 == null || (m81193x1252e2cf = abstractActivityC22579xbed01a372.m81193x1252e2cf()) == null) {
            return;
        }
        pf5.z zVar3 = pf5.z.f435481a;
        if (!(m81193x1252e2cf instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y yVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y) zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m81193x1252e2cf).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y.class);
        if (yVar2 != null) {
            yVar2.f186729q.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.t(m81193x1252e2cf));
        }
    }

    public final void Zk(android.app.Activity context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14070xcb09708f.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPostPlayTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPostPlayTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void aj(android.content.Context context, java.lang.String sessionId, java.lang.String username, int i17, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4 m4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r(this, context, qt2Var);
        if (username.length() == 0) {
            rVar.a("", false, 0, 0, "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.SessionInfoService", "[getSessionId] username=" + username + " is invalid, just return.");
            return;
        }
        qb2.x1 J0 = m4Var.e().J0(sessionId);
        java.lang.String str = J0.f65984xbed8694c;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.d(m4Var, context, 1, username, null, 0L, 0L, false, null, null, java.lang.Integer.valueOf(i17), null, null, null, false, false, false, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.g4(rVar), 523768, null);
            return;
        }
        java.lang.String field_sessionId = J0.f65984xbed8694c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
        zy2.ab.a(m4Var, context, field_sessionId, java.lang.Integer.valueOf(i17), null, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.h4(rVar, J0), 56, null);
    }

    public final void ak(android.content.Context context, android.content.Intent intent, long j17, long j18, java.lang.String str, java.lang.String str2, long j19, java.lang.String str3, int i17, java.lang.String str4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f.class);
        intent.putExtra("native_drama_id", j17);
        intent.putExtra("native_drama_object_id", j18);
        intent.putExtra("native_drama_object_dup_flag", str);
        intent.putExtra("native_drama_title", str2);
        intent.putExtra("native_drama_enter_object_id", j19);
        intent.putExtra("native_drama_enter_promotion_comment_scene", i17);
        intent.putExtra("native_drama_enter_dupflag", str3);
        intent.putExtra("native_drama_session_buffer", str4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderNativeDramaTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderNativeDramaTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void al(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14072x6386c4f6.class);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterPreviewAtTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterPreviewAtTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void bj(android.content.Context context, int i17, r45.my0 my0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (my0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s0.f206873b = nyVar != null ? nyVar.f216915p : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        java.lang.String m75945x2fec8307 = my0Var.m75945x2fec8307(1);
        java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        java.lang.String m75945x2fec83072 = my0Var.m75945x2fec8307(4);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        o3Var.Jk(V6, true, i17, str, m75945x2fec83072);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r45.ac4 ac4Var = new r45.ac4();
        ac4Var.set(1, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) my0Var.m75936x14adae67(2));
        ac4Var.set(4, 1);
        c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
    }

    public final void bl(android.app.Activity context, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) || (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15063x2c6bbac6)) {
            yl(context, str);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14078x2b7ecc95.class);
        intent.putExtra("enterRealnameVerifyUI", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterRealnameVerifyUI", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterRealnameVerifyUI", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void cj(android.content.Context context, nr2.m paidCollectionData, boolean z17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paidCollectionData, "paidCollectionData");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", 16);
        java.lang.String k17 = paidCollectionData.k();
        long l17 = paidCollectionData.l();
        intent.putExtra("finder_username", str);
        intent.putExtra("KEY_FINDER_SELF_FLAG", z17);
        intent.putExtra("key_topic_title", k17);
        intent.putExtra("KEY_TOPIC_ID", l17);
        intent.putExtra("KEY_FROM_PAID_COLLECTION", true);
        intent.putExtra("paid_collection_username", paidCollectionData.o());
        intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
        intent.putExtra("paid_collection_info", paidCollectionData.f420801d.mo14344x5f01b1f6());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).il(context, intent);
    }

    public final void ck(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        android.content.Intent intent3 = !(context instanceof android.app.Activity) ? intent2 : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        intent2.addFlags(67108864);
        intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.class);
        intent2.putExtra("key_mention_business_type", 0);
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.f210107t;
        bq.p0 p0Var = bq.q0.f105046t;
        bq.q0.f105047u.clear();
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.f210109v;
        int length = iArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            int i19 = iArr[i17];
            int i27 = i18 + 1;
            ir2.g0 g0Var = ir2.a1.f375622r;
            java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.f210107t.get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            ir2.g0.a(g0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14859x45ba311f(1, i19, (int[]) obj, xy2.c.e(context), 0), null, null, 6, null);
            i17++;
            i18 = i27;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderNotifyMsgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderNotifyMsgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void cl(android.content.Context context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14081x710b817a.class);
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterRelatedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        intent.addFlags(268435456);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterRelatedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterRelatedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void dk(android.content.Context context, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, r45.do2 paidCollectionInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paidCollectionInfo, "paidCollectionInfo");
        nr2.m mVar = new nr2.m(paidCollectionInfo);
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.i iVar = null;
        boolean z18 = false;
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806) {
            intent2.putExtra("collection_ref_comment_scene", 65);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            intent2.putExtra("collection_ref_comment_scene", V6 != null ? V6.m75939xb282bd08(5) : 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enterFinderPayCourseUI %s", pm0.v.u(mVar.l()));
        intent2.putExtra("paid_collection_topic_id", mVar.l());
        intent2.putExtra("paid_collection_feed_id", abstractC14490x69736cb5 != null ? java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()) : null);
        intent2.putExtra("paid_collection_info", mVar.f420801d.mo14344x5f01b1f6());
        intent2.putExtra("paid_collection_username", mVar.o());
        if (!z17) {
            intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14061xec7cb04.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderPaidCollectionUI", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/protocal/protobuf/FinderPaidCollectionInfo;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderPaidCollectionUI", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/protocal/protobuf/FinderPaidCollectionInfo;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        intent2.putExtra("paid_collection_drawer_mode", true);
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(nr2.p.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        nr2.p pVar = (nr2.p) a17;
        long longExtra = intent2.getLongExtra("paid_collection_topic_id", 0L);
        if (longExtra == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderPayCollectionDrawerUIC", "no id");
            return;
        }
        if (pVar.f420815d == longExtra) {
            gx2.q qVar = pVar.f420817f;
            if (qVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(qVar, false, 1, null);
                return;
            }
            return;
        }
        if (pVar.f420817f == null) {
            android.view.View decorView = pVar.m158354x19263085().getWindow().getDecorView();
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup != null) {
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(pVar.m80379x76847179());
                frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                frameLayout.setId(com.p314xaae8f345.mm.R.id.f566050qf2);
                frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                pVar.f420818g = frameLayout;
                float k17 = (i65.a.k(pVar.m80379x76847179()) + com.p314xaae8f345.mm.ui.bk.p(pVar.m80379x76847179())) * kx2.a.f394811a.a(pVar.m80379x76847179());
                gx2.a aVar = new gx2.a();
                aVar.f358870c = k17;
                aVar.f358871d = new hx2.g(pVar.m80379x76847179(), 0, 0, 0, false, false, 62, null);
                android.widget.FrameLayout frameLayout2 = pVar.f420818g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout2);
                aVar.f358872e = new hx2.c(frameLayout2);
                aVar.f358873f = new hx2.b(pVar.m80379x76847179(), z18, 2, iVar);
                pVar.f420817f = aVar.b(viewGroup);
            }
        }
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = pVar.m158354x19263085().mo7595x9cdc264().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        android.widget.FrameLayout frameLayout3 = pVar.f420818g;
        if (frameLayout3 != null) {
            frameLayout3.removeAllViews();
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b17 = lk5.q0.b("com.tencent.mm.plugin.finder.feed.ui.FinderPaidCollectionUI", intent2, false, 4, null);
        pVar.f420816e = b17;
        b17.q0(new nr2.n(pVar));
        gx2.q qVar2 = pVar.f420817f;
        if (qVar2 != null) {
            qVar2.m132474x77f391b9(new nr2.o(pVar));
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = pVar.f420816e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22584xf7d97e83);
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.f566050qf2, c22584xf7d97e83, null);
        m7630xb2c12e75.f();
        pVar.f420815d = longExtra;
    }

    public final void dl(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterSelectLocalFileRouterUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterSelectLocalFileRouterUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void ek(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14062xe0ee6cec.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderPlayListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderPlayListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void el(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClassName(context, "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterSnsAlbumPickerUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterSnsAlbumPickerUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void fj(android.app.Activity context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13948x3e6dc16a.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFavTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void fk(android.content.Context context, android.content.Intent intent, int i17, int i18, java.lang.Boolean bool, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        qs2.t.a(qs2.v.f447860a, context, intent, i17, i18, bool, num, 0, false, 192, null);
    }

    public final void fl(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14097xe1167cb2.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterTemplateCollectionUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterTemplateCollectionUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void gk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        qs2.v.f447860a.d(context, intent, null);
    }

    public void hj(android.app.Activity activity, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14106x3ad782d3.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderAffiliateAccountDoneUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void hk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        qs2.v.f447860a.e(context, intent);
    }

    public void hl(android.content.Context context, android.content.Intent intent) {
        android.app.Activity Ui;
        android.content.Context context2 = context;
        android.content.Intent intent2 = intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (ol(context, intent)) {
            return;
        }
        if (!(context2 instanceof android.app.Activity) && (Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui()) != null) {
            context2 = Ui;
        }
        boolean booleanExtra = intent2 != null ? intent2.getBooleanExtra("KEY_IGNORE_REPORT_INIT", false) : false;
        if (intent2 == null) {
            intent2 = new android.content.Intent();
        }
        intent2.putExtra("key_to_comment_scene", 22);
        if (!booleanExtra) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context2, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
        }
        android.content.Intent intent3 = !(context2 instanceof android.app.Activity) ? intent2 : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        if (intent2.getIntExtra("key_topic_type", 1) == 1) {
            intent2.setClass(context2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1431x696cd2f.ui.ActivityC13666x6ea74329.class);
        } else {
            intent2.setClass(context2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b.class);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterTopicFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterTopicFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void ij(android.content.Context context, android.content.Intent intent, java.lang.String type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15014x7ce71a81.class);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15014x7ce71a81.f210054z;
        intent.putExtra("BLOCK_LIST_SEARCH_TYPE", type);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderBlockListSearchUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderBlockListSearchUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void ik(android.content.Context context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClassName(context, "com.tencent.mm.ui.contact.privacy.FinderBlockListUI");
        intent.putExtra("BLOCK_LIST_TYPE", i17);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderPrivacyBlockListNewUi", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderPrivacyBlockListNewUi", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void il(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterTopicTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterTopicTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void jk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
            ul(context, intent);
            return;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a0(this, context, intent);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(context, 34359738368L, null, a0Var, 3);
    }

    public final void jl(android.content.Context context, so2.j0 continueWatchData) {
        java.lang.String str;
        long j17;
        int i17;
        byte[] bArr;
        pf5.z zVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continueWatchData, "continueWatchData");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", 16);
        r45.zx0 zx0Var = continueWatchData.f491971d;
        long m75942xfb822ef2 = zx0Var.m75942xfb822ef2(5);
        r45.vx0 vx0Var = (r45.vx0) zx0Var.m75936x14adae67(0);
        str = "";
        if (vx0Var != null) {
            java.lang.String m75945x2fec8307 = vx0Var.m75945x2fec8307(1);
            str = m75945x2fec8307 != null ? m75945x2fec8307 : "";
            j17 = vx0Var.m75942xfb822ef2(0);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = vx0Var.m75934xbce7f2f(22);
            bArr = m75934xbce7f2f != null ? m75934xbce7f2f.f273689a : null;
            i17 = vx0Var.m75939xb282bd08(21);
        } else {
            j17 = 0;
            i17 = 0;
            bArr = null;
        }
        intent.putExtra("key_topic_title", str);
        intent.putExtra("KEY_TOPIC_ID", j17);
        intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
        intent.putExtra("key_ref_object_id", m75942xfb822ef2);
        intent.putExtra("key_topic_type", i17);
        intent.putExtra("KEY_HOT_TOPIC_BUFFER", bArr);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            zVar = pf5.z.f435481a;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.ActivityRouter", th6, "enterTopicTimelineUI", new java.lang.Object[0]);
        }
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jSONObject.put("collection_id", pm0.v.u(j17));
        jSONObject.put("ref_commentscene", V6 != null ? V6.m75939xb282bd08(5) : 0);
        intent.putExtra("key_ref_comment_scene", V6 != null ? V6.m75939xb282bd08(5) : 0);
        intent.putExtra("key_extra_info", jSONObject.toString());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).il(context, intent);
    }

    public final void kk(android.app.Activity context, java.lang.String username, r45.ct4 ct4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String m75945x2fec8307 = ct4Var != null ? ct4Var.m75945x2fec8307(4) : null;
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
            ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).bj(username, c01.id.a(), 1);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", hc2.x0.e(m75945x2fec8307, 4, false, null, 6, null));
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "[initEditLayout] onClick username:".concat(username));
        android.content.Intent intent2 = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent2, 0L, null, 0, 0, false, 0, null, 384, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).rk(context, intent2, 10010, username);
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.f03 b07 = nk6.b0("FinderSetting", username);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb S0 = zy2.ia.S0(nk6, "FinderSetting", username, false, false, 12, null);
        if (S0 != null && b07 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a, "3", S0, b07, 2, V6, 0, null, 0, 0, 480, null);
        }
        nk6.y("FinderSetting", username);
        nk6.O("ProfileEntrance", new int[]{1000}, username);
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).bj(username, c01.id.a(), 1);
    }

    public final void kl(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15080x3b5accbd.class);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterUnOpenUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterUnOpenUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void lk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
            vl(context, intent);
            return;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b0(this, context, intent);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(context, 34359738368L, null, b0Var, 3);
    }

    public void ll(android.content.Context context, java.lang.String appId, java.lang.String enterPath, int i17, java.lang.String sceneNote) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterPath, "enterPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneNote, "sceneNote");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enter we app appId:" + appId + ",enterPath:" + enterPath + ",scene:" + i17 + ",sceneNote:" + sceneNote);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(appId)) {
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = appId;
        b1Var.f398555f = enterPath;
        b1Var.f398565k = i17;
        b1Var.f398567l = sceneNote;
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        b1Var.f398549c = zl2.q4.f555466a.x();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
    }

    public final void mj(android.content.Context context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15016x7c995a79.class);
        intent.putExtra("BLOCK_LIST_TYPE", i17);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderBlockListUi", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderBlockListUi", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mk(android.content.Context r22, android.content.Intent r23) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.mk(android.content.Context, android.content.Intent):void");
    }

    public final void ml(android.content.Context context, android.content.Intent intent) {
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            if (intent.getIntExtra("key_member_inlet_source", 0) == 0) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                eo2.b bVar = (eo2.b) pf5.z.f435481a.a(activity).e(eo2.b.class);
                intent.putExtra("key_member_inlet_source", bVar != null ? bVar.f337091d : 0);
            }
        }
    }

    public final void nj(android.content.Context context, r45.b31 b31Var, android.content.Intent i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i17, "i");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207296c = b31Var;
        jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 2L, 1L, false);
        i17.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(i17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderContactSearchIncludeFollowUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderFeedSearchObj;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderContactSearchIncludeFollowUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderFeedSearchObj;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void nk(android.content.Context context, android.content.Intent intent, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14077xa0d7f43b.class);
        intent.putExtra("key_purchase_member_count", i17);
        intent.putExtra("key_purchase_live_count", i18);
        intent.putExtra("key_purchase_course_count", i19);
        intent.putExtra("key_purchase_pay_mic_course_count", i28);
        intent.putExtra("key_purchase_paid_collection_count", java.lang.Math.max(i27, i19));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderPurchaseUI", "(Landroid/content/Context;Landroid/content/Intent;IIIII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderPurchaseUI", "(Landroid/content/Context;Landroid/content/Intent;IIIII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void nl(android.content.Intent intent, android.content.Intent curIntent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curIntent, "curIntent");
        pm0.v.g(intent, curIntent, "KEY_POST_ENTERSCENE", 0);
        pm0.v.g(intent, curIntent, "key_finder_post_from", -1);
        pm0.v.g(intent, curIntent, "key_ref_comment_scene", 0);
        pm0.v.g(intent, curIntent, "KEY_FINDER_TARGET_TEMPLATE_TYPE", 0);
        pm0.v.g(intent, curIntent, "KEY_FINDER_POST_DRAFT_SOURCE_ENTER_SCENE", 0);
        pm0.v.k(intent, curIntent, "KEY_FINDER_USERNAME_SELF");
        pm0.v.k(intent, curIntent, "key_context_id");
        pm0.v.k(intent, curIntent, "key_jump_id");
        pm0.v.k(intent, curIntent, "key_click_tab_context_id");
        pm0.v.k(intent, curIntent, "vst_id");
        pm0.v.k(intent, curIntent, "post_entry_type");
        pm0.v.k(intent, curIntent, "CLIENT_KV_REPORTINFO");
        pm0.v.k(intent, curIntent, "KEY_FINDER_POST_TOPIC_WORD");
        pm0.v.k(intent, curIntent, "KEY_FINDER_ACTION_BAR_TITLE");
        pm0.v.k(intent, curIntent, "KEY_FINDER_TARGET_TEMPLATE_ID");
        pm0.v.d(intent, curIntent, "KEY_POST_DIRECTLY_FROM_SNS", false);
        pm0.v.d(intent, curIntent, "key_finder_sns_post_within_30s", false);
        pm0.v.d(intent, curIntent, "key_post_has_show_safe_dialog", false);
        pm0.v.d(intent, curIntent, "KEY_FINDER_MEMBER_VIDEO", false);
        pm0.v.d(intent, curIntent, "key_finder_post_can_switch_account", false);
        pm0.v.d(intent, curIntent, "KEY_FINDER_NEED_POST_TO_COMMENT", false);
        pm0.v.d(intent, curIntent, "KEY_FINDER_POST_IS_HIGHLIGHT_TOPIC", false);
        pm0.v.d(intent, curIntent, "KEY_SYNC_POST_LOADING", false);
        intent.putExtra("key_ref_feed_id", java.lang.Long.valueOf(curIntent.getLongExtra("key_ref_feed_id", 0L)));
        pm0.v.k(intent, curIntent, "key_ref_feed_dup_flag");
        pm0.v.k(intent, curIntent, "KEY_FINDER_AD_POST_TIPS_HEADER");
        pm0.v.k(intent, curIntent, "KEY_FINDER_AD_POST_TIPS_LINK");
        pm0.v.k(intent, curIntent, "KEY_FINDER_AD_POST_BY_PASS");
        pm0.v.g(intent, curIntent, "KEY_FINDER_AD_POST_ENTER_SOURCE", 108);
        pm0.v.d(intent, curIntent, "KEY_FINDER_AD_POST_DRAFT", false);
        pm0.v.k(intent, curIntent, "key_source_feed_session_buffer");
        intent.putExtra("key_source_cluster_id", java.lang.Long.valueOf(curIntent.getLongExtra("key_source_cluster_id", 0L)));
        boolean booleanExtra = curIntent.getBooleanExtra("KEY_POST_WARM_GOODS_SELECT_MEDIA", false);
        intent.putExtra("KEY_POST_WARM_GOODS_SELECT_MEDIA", booleanExtra);
        if (booleanExtra) {
            intent.putExtra("JUMP_INFO", curIntent.getByteArrayExtra("JUMP_INFO"));
        }
    }

    public final void oj(android.content.Context context, r45.b31 b31Var, android.content.Intent i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i17, "i");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207296c = b31Var;
        jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 2L, 1L, false);
        i17.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(i17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderContactSearchUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderFeedSearchObj;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderContactSearchUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderFeedSearchObj;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void ok(android.content.Context context, android.content.Intent intent, int i17, int i18, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        boolean z17 = context instanceof android.app.Activity;
        android.content.Intent intent3 = !z17 ? intent2 : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        intent2.setClassName(context, "com.tencent.mm.plugin.finder.ui.FinderAlbumUI");
        intent2.putExtra("key_can_select_video_and_pic", true);
        intent2.putExtra("is_hide_album_footer", false);
        intent2.putExtra("show_header_view", false);
        intent2.putExtra("max_select_count", i18);
        intent2.putExtra("query_source_type", 37);
        intent2.putExtra("query_media_type", i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        intent2.putExtra("album_video_max_duration", t70Var.J2());
        intent2.putExtra("album_video_min_duration", t70Var.K2().f152729i);
        intent2.putExtra("key_max_video_duration", ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).bj() - 1);
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderQuestionAlbumUI", "(Landroid/content/Context;Landroid/content/Intent;IILjava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderQuestionAlbumUI", "(Landroid/content/Context;Landroid/content/Intent;IILjava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        int intValue = num != null ? num.intValue() : -1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderQuestionAlbumUI", "(Landroid/content/Context;Landroid/content/Intent;IILjava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final boolean ol(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            return false;
        }
        ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
        java.lang.Object stringExtra = intent != null ? intent.getStringExtra("key_finder_teen_mode_scene") : null;
        if (stringExtra == null) {
            stringExtra = 5;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20912, 3, stringExtra, "", "");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0175  */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pk(android.content.Context r31) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.pk(android.content.Context):void");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 pl(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "jump to wx profile %s", str);
        android.content.Intent intent2 = new android.content.Intent();
        if (intent != null) {
            intent2.putExtras(intent);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            intent2.putExtra("Username", str);
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.f214053a.f(context, intent2, i17, lVar);
    }

    public void qj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderCreateContactUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderCreateContactUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void qk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("KEY_FINDER_PROCESS_ID", 1);
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15063x2c6bbac6.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSelfUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSelfUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void ql(android.content.Context context, java.lang.String feedUserName, so2.y0 item, java.lang.String str, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUserName, "feedUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Intent intent = new android.content.Intent();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(feedUserName) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(feedUserName, xy2.c.e(context))) {
            intent.putExtra("Action", 2);
            intent.putExtra("IsPoster", false);
            i18 = 5;
        } else {
            intent.putExtra("IsPoster", true);
            intent.putExtra("Action", 1);
            intent.putExtra("feedUser", feedUserName);
            i18 = 3;
        }
        int i19 = i18;
        intent.putExtra("Avatar", item.f492236d.L0());
        intent.putExtra("Nickname", item.f492238f);
        intent.putExtra("CommentId", item.f492236d.t0());
        intent.putExtra("FeedId", item.f492236d.f68959xf9a02e3e);
        intent.putExtra("DupFlag", item.f492236d.f68957xec748fc6);
        intent.putExtra("memberProviderUsername", str);
        intent.putExtra("PreviewScene", i17);
        intent.putExtra("FeedNonceId", item.f492236d.f68962x2812d6a6);
        intent.putExtra("V5UserName", item.f492236d.Z0());
        if (item.f492236d.u0().m76083x8de01399() != null) {
            r45.lz0 m76083x8de01399 = item.f492236d.u0().m76083x8de01399();
            intent.putExtra("ContactMsgInfo", m76083x8de01399 != null ? m76083x8de01399.mo14344x5f01b1f6() : null);
        }
        sl(this, context, item.f492236d.Z0(), intent, i19, null, 16, null);
        item.f492236d.u0();
        if (item.f492236d.u0().m76083x8de01399() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "msgInfo is null ,feedId:" + item.f492236d.f68959xf9a02e3e + ",comentId:" + item.f492236d.t0());
        }
    }

    public void rj(android.app.Activity activity, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.addFlags(67108864);
        intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderCreateContactUIForResult", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void rk(android.app.Activity context, android.content.Intent intent, int i17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.addFlags(67108864);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15066x6f77678c.class);
        intent.putExtra("finder_username", username);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSettingInfoUI", "(Landroid/app/Activity;Landroid/content/Intent;ILjava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rl(in5.s0 r10, java.lang.String r11, jv2.i r12) {
        /*
            r9 = this;
            java.lang.String r0 = "holder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "feedUserName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.lang.String r0 = "item"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r11)
            java.lang.String r1 = "getContext(...)"
            java.lang.String r2 = "Action"
            java.lang.String r3 = "IsPoster"
            android.content.Context r10 = r10.f374654e
            if (r0 != 0) goto L3d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r1)
            java.lang.String r0 = xy2.c.e(r10)
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r11, r0)
            if (r0 == 0) goto L3d
            r0 = 1
            r4.putExtra(r3, r0)
            r4.putExtra(r2, r0)
            java.lang.String r0 = "feedUser"
            r4.putExtra(r0, r11)
            r11 = 3
            goto L46
        L3d:
            r11 = 0
            r4.putExtra(r3, r11)
            r11 = 2
            r4.putExtra(r2, r11)
            r11 = 5
        L46:
            r5 = r11
            jv2.c r11 = r12.f383756d
            java.lang.String r11 = r11.z0()
            java.lang.String r0 = "Avatar"
            r4.putExtra(r0, r11)
            jv2.c r11 = r12.f383756d
            java.lang.String r11 = r11.D0()
            java.lang.String r0 = "Nickname"
            r4.putExtra(r0, r11)
            jv2.c r11 = r12.f383756d
            java.lang.String r11 = r11.f67481x2812d6a6
            java.lang.String r0 = "FeedNonceId"
            r4.putExtra(r0, r11)
            jv2.c r11 = r12.f383756d
            java.lang.String r11 = r11.L0()
            java.lang.String r0 = "V5UserName"
            r4.putExtra(r0, r11)
            jv2.c r11 = r12.f383756d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r11 = r11.u0()
            r45.lz0 r11 = r11.m76083x8de01399()
            if (r11 == 0) goto L94
            jv2.c r11 = r12.f383756d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r11 = r11.u0()
            r45.lz0 r11 = r11.m76083x8de01399()
            if (r11 == 0) goto L8e
            byte[] r11 = r11.mo14344x5f01b1f6()
            goto L8f
        L8e:
            r11 = 0
        L8f:
            java.lang.String r0 = "ContactMsgInfo"
            r4.putExtra(r0, r11)
        L94:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r1)
            jv2.c r11 = r12.f383756d
            java.lang.String r3 = r11.L0()
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r10
            sl(r1, r2, r3, r4, r5, r6, r7, r8)
            jv2.c r10 = r12.f383756d
            r10.u0()
            jv2.c r10 = r12.f383756d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r10 = r10.u0()
            r45.lz0 r10 = r10.m76083x8de01399()
            if (r10 != 0) goto Ldd
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "msgInfo is null ,feedId:"
            r10.<init>(r11)
            jv2.c r11 = r12.f383756d
            long r0 = r11.f67478xf9a02e3e
            r10.append(r0)
            java.lang.String r11 = ",comentId:"
            r10.append(r11)
            jv2.c r11 = r12.f383756d
            long r11 = r11.t0()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "Finder.ActivityRouter"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r10)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.rl(in5.s0, java.lang.String, jv2.i):void");
    }

    public void sj(android.app.Activity context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        jz2.x0 x0Var = jz2.x0.f384287a;
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.A).mo141623x754a37bb());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderCreateLotteryUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        context.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    public final void sk(android.app.Activity context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.addFlags(67108864);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15073xb2df199.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSettingProtectUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSettingProtectUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void tj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15027x39e0411.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderEditTextUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderEditTextUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void tk(android.app.Activity context, android.content.Intent intent, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        hc2.e0.a(intent, 0, null, 3, null);
        if (z17) {
            intent.putExtra("key_get_relative_open_time", c01.id.c());
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15074xeba4993.class);
        } else {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6.class);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderShareFeedDetailUI", "(Landroid/app/Activity;Landroid/content/Intent;IZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void tl(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, yz5.l lVar) {
        org.json.JSONObject jSONObject;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (c19786x6a1e2862 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "[openAddTagLiteApp] jumpInfo is null");
            return;
        }
        if (map != null) {
            try {
                r45.k74 m76504xa819f0c7 = c19786x6a1e2862.m76504xa819f0c7();
                if (m76504xa819f0c7 == null || (str = m76504xa819f0c7.m75945x2fec8307(2)) == null) {
                    str = "";
                }
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Exception unused) {
                jSONObject = new org.json.JSONObject();
            }
            r45.k74 m76504xa819f0c72 = c19786x6a1e2862.m76504xa819f0c7();
            if (m76504xa819f0c72 != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                }
                m76504xa819f0c72.set(2, jSONObject.toString());
            }
        }
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        p0Var.f534777f = abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.f225700d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g0(lVar);
        xc2.y2.L(xc2.y2.f534876a, context, p0Var, null, sVar, null, 20, null);
    }

    public final void uj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078.class);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderFansListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderFansListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void uk(android.content.Context context, android.content.Intent intent, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        hc2.e0.a(intent, 0, null, 3, null);
        android.content.Intent intent2 = context instanceof android.app.Activity ? null : intent;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        if (z17) {
            intent.addFlags(268435456);
            intent.addFlags(32768);
            intent.putExtra("key_get_relative_open_time", c01.id.c());
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15074xeba4993.class);
        } else {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6.class);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enterFinderShare finderAffinity " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderShareFeedDetailUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderShareFeedDetailUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void ul(android.content.Context context, android.content.Intent intent) {
        android.content.Intent intent2;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        hc2.e0.a(intent, 0, null, 3, null);
        boolean z17 = context instanceof android.app.Activity;
        android.content.Intent intent3 = !z17 ? intent : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14073xdbdaf452.class);
        android.app.Activity activity = z17 ? (android.app.Activity) context : null;
        if ((activity == null || (intent2 = activity.getIntent()) == null || !intent2.getBooleanExtra("KEY_IS_FROM_FINDER_TASK", false)) ? false : true) {
            intent.putExtra("KEY_IS_FROM_FINDER_TASK", true);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "realEnterFinderProfileLongFeedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "realEnterFinderProfileLongFeedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void vj(android.content.Context context, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa feedList, java.lang.String vmKey, int i17, java.lang.String str, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vmKey, "vmKey");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9().b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9(feedList, null, i17, null, null, 16, null), intent2);
        android.content.Intent intent3 = !(context instanceof android.app.Activity) ? intent2 : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13949x90d2cfd6.class);
        intent2.putExtra("KEY_FINDER_FEEDLIST_TITLE", str);
        intent2.putExtra("KEY_FINDER_FEEDLIST_VM_KEY", vmKey);
        intent2.putExtra("KEY_FINDER_FEEDLIST_COLUMN_ID", i18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderFeedListUI", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;Ljava/lang/String;ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderFeedListUI", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;Ljava/lang/String;ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void vk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        android.content.Intent b17 = xy2.c.b(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14093x52d98fcd.class, intent, false, false, 24, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderSharePostUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderSharePostUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void vl(android.content.Context context, android.content.Intent intent) {
        android.content.Intent intent2;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        hc2.e0.a(intent, 0, null, 3, null);
        boolean z17 = context instanceof android.app.Activity;
        android.content.Intent intent3 = !z17 ? intent : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598.class);
        android.app.Activity activity = z17 ? (android.app.Activity) context : null;
        if ((activity == null || (intent2 = activity.getIntent()) == null || !intent2.getBooleanExtra("KEY_IS_FROM_FINDER_TASK", false)) ? false : true) {
            intent.putExtra("KEY_IS_FROM_FINDER_TASK", true);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "realEnterFinderProfileTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "realEnterFinderProfileTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void wj(android.content.Context context, r45.b31 b31Var, android.content.Intent i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i17, "i");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207296c = b31Var;
        i17.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160.class);
        i17.putExtra("key_to_comment_scene", 6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, i17, 0L, null, 0, 0, false, 0, null, 508, null);
        android.content.Intent intent = !(context instanceof android.app.Activity) ? i17 : null;
        if (intent != null) {
            intent.addFlags(268435456);
        }
        hc2.e0.a(i17, 0, null, 3, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(i17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderFeedSearchUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderFeedSearchObj;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderFeedSearchUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderFeedSearchObj;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 1L, 1L, false);
    }

    public final void wl(android.content.Context context, android.content.Intent intent, boolean z17, boolean z18) {
        android.app.Activity Ui;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        if (!(context instanceof android.app.Activity) && (Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui()) != null) {
            context = Ui;
        }
        if (!z18) {
            android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
        }
        intent.setClass(context, z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13952x23804a9a.class : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14054x4592214c.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "realEnterFloatBallDetailUI", "(Landroid/content/Context;Landroid/content/Intent;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "realEnterFloatBallDetailUI", "(Landroid/content/Context;Landroid/content/Intent;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void xj(android.content.Context context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        intent.putExtra("key_sys_msg_scene", i17);
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15032x9972f334.class);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderFinderSysMsgUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderFinderSysMsgUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) r5).Di((android.app.Activity) r12) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void xk(android.content.Context r12, android.content.Intent r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.xk(android.content.Context, android.content.Intent, int, boolean):void");
    }

    public final void xl(android.content.Context context, android.content.Intent intent) {
        android.app.Activity Ui;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        if (!(context instanceof android.app.Activity) && (Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui()) != null) {
            context = Ui;
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14051xa2b0bb65.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "realEnterLongFeedDetailUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "realEnterLongFeedDetailUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void yj(android.content.Context context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        boolean z17 = context instanceof android.app.Activity;
        android.content.Intent intent2 = !z17 ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13960xc5151fc0.class);
        if (!z17 || i17 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGalleryUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGalleryUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGalleryUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void yk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("KEY_TALKER_TYPE", 1);
        intent.putExtra("KEY_TALKER_SCENE", 1);
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15022xdaaa9eb1.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderWxConversationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderWxConversationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void yl(android.app.Activity context, java.lang.String str) {
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.os.Bundle bundle = new android.os.Bundle();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String className = context.getComponentName().getClassName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "getClassName(...)");
            if (r26.i0.y(className, "com.tencent.mm.plugin.finder", false)) {
                str2 = className.substring("com.tencent.mm.plugin.finder".length());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
            } else {
                str2 = className;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "fullActivity " + className + ", fromActivity " + str2);
            bundle.putString("realname_verify_process_jump_activity", str2);
        } else {
            bundle.putString("realname_verify_process_jump_activity", str);
        }
        bundle.putString("realname_verify_process_jump_plugin", "finder");
        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).Bi(context, bundle);
    }

    public void zj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enterFinderGameLiveAuthUI");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        jz2.x0 x0Var = jz2.x0.f384287a;
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.C).mo141623x754a37bb());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGameLiveAuthUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGameLiveAuthUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void zk(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15083x5361f44e.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderWxMsgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderWxMsgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
