package qs2;

/* loaded from: classes10.dex */
public final class v implements qs2.t {

    /* renamed from: a, reason: collision with root package name */
    public static final qs2.v f447860a = new qs2.v();

    public static void h(qs2.v vVar, android.content.Context context, java.lang.String str, java.lang.String str2, int i17, android.webkit.ValueCallback valueCallback, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            i17 = wc1.a.f77339x366c91de;
        }
        if ((i18 & 16) != 0) {
            valueCallback = null;
        }
        vVar.getClass();
        if (str.length() == 0) {
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = str;
        b1Var.f398555f = str2;
        b1Var.f398549c = 0;
        b1Var.f398565k = i17;
        b1Var.f398570o = valueCallback;
        b1Var.M = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PublishRouterApi", "appId: " + str + ", enterPath: " + b1Var.f398555f);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
    }

    public void b(android.app.Activity context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15026xb84ce7c3.class);
        intent.putExtra("key_result_file_name", "finder_avatar.tmp");
        intent.putExtra("key_crop_source", 1);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterCropAvatarUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void c(android.content.Context context, android.content.Intent intent, int i17, int i18, java.lang.Boolean bool, java.lang.Integer num, int i19, boolean z17) {
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        boolean z19 = context instanceof android.app.Activity;
        android.content.Intent intent3 = !z19 ? intent2 : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        intent2.setClassName(context, "com.tencent.mm.plugin.finder.ui.FinderAlbumUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_is_user_vlog_mode, 1) != 1) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z18 = false;
        } else {
            z18 = true;
        }
        if (!z18) {
            intent2.putExtra("key_can_select_video_and_pic", true);
        }
        intent2.putExtra("is_hide_album_footer", true);
        intent2.putExtra("show_header_view", false);
        intent2.putExtra("max_select_count", i18);
        intent2.putExtra("query_source_type", i19);
        intent2.putExtra("query_media_type", i17);
        intent2.putExtra("album_video_max_duration", t70Var.J2());
        intent2.putExtra("album_video_min_duration", t70Var.K2().f152729i);
        intent2.putExtra("key_max_video_duration", ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).bj() - 1);
        if (z17) {
            intent2.putExtra("Gallery_LivePhoto_Need_Query", true);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) || !z19) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostAlbumUI", "(Landroid/content/Context;Landroid/content/Intent;IILjava/lang/Boolean;Ljava/lang/Integer;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostAlbumUI", "(Landroid/content/Context;Landroid/content/Intent;IILjava/lang/Boolean;Ljava/lang/Integer;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        int intValue = num != null ? num.intValue() : -1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostAlbumUI", "(Landroid/content/Context;Landroid/content/Intent;IILjava/lang/Boolean;Ljava/lang/Integer;IZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void d(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z18 = true;
        if (iq.b.g(context) || iq.b.C(context) || iq.b.v(context) || iq.b.c(context, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostChecker", "camera check false");
            z17 = false;
        } else {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enterFinderPostRouterUI cameraCheck false!");
            return;
        }
        android.content.Intent b17 = xy2.c.b(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15053x15a6cfc3.class, intent, false, false, 24, null);
        if ((context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null) != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
            java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216918q;
            java.lang.String str4 = str3 != null ? str3 : "";
            if (str != null && str.length() != 0) {
                z18 = false;
            }
            if (z18) {
                b17.putExtra("key_finder_context_id", str2);
            } else {
                b17.putExtra("key_finder_context_id", str);
            }
            b17.putExtra("key_finder_session_id", str4);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r11 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.content.Context r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qs2.v.e(android.content.Context, android.content.Intent):void");
    }

    public final void f(android.content.Intent intent, android.content.Context context, int i17) {
        android.app.Activity Ui;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().j());
        sb6.append('_');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        intent.putExtra("post_id", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        p2Var.W(p2Var.i(context, i17, false));
        if (!(context instanceof android.app.Activity) && (Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui()) != null) {
            context = Ui;
        }
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        e(context, intent);
    }

    public void g(android.app.Activity context, android.content.Intent intent, int i17, boolean z17, int i18) {
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClassName(context, "com.tencent.mm.plugin.finder.ui.FinderAlbumUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_is_user_vlog_mode, 1) != 1) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z18 = false;
        } else {
            z18 = true;
        }
        if (!z18) {
            intent.putExtra("key_can_select_video_and_pic", true);
        }
        intent.putExtra("show_header_view", z17);
        intent.putExtra("query_source_type", 32);
        intent.putExtra("query_media_type", i17);
        intent.putExtra("album_video_max_duration", t70Var.J2());
        intent.putExtra("album_video_min_duration", t70Var.K2().f152729i);
        intent.putExtra("key_max_video_duration", 300);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderTemplateAlbumUI", "(Landroid/app/Activity;Landroid/content/Intent;IZI)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
