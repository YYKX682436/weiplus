package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes10.dex */
public abstract class l7 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f273299a;

    public static void a(java.lang.String str, android.content.Context context, zb0.a0 a0Var) {
        if (a0Var == null) {
            a0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k7(context);
        }
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(context, str, a0Var);
    }

    public static java.lang.String b(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        if (f273299a == null) {
            f273299a = context.getSharedPreferences("system_config_prefs", 0).getString("camera_file_path", null);
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(f273299a)) {
            f273299a = com.p314xaae8f345.mm.ui.p2740x696c9db.i1.b(context, intent, str);
        }
        q75.c.f(f273299a, context);
        return f273299a;
    }

    public static void c(android.app.Activity activity, int i17, int i18, int i19, int i27, boolean z17, android.content.Intent intent) {
        d(activity, i17, i18, i19, i27, z17, intent, true);
    }

    public static void d(android.app.Activity activity, int i17, int i18, int i19, int i27, boolean z17, android.content.Intent intent, boolean z18) {
        android.os.Bundle extras;
        android.content.Intent intent2 = new android.content.Intent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            intent2.putExtras(extras);
        }
        intent2.putExtra("max_select_count", i18);
        intent2.putExtra("query_source_type", i19);
        intent2.putExtra("query_media_type", i27);
        intent2.putExtra("show_header_view", z17);
        if (z18) {
            intent2.addFlags(67108864);
        }
        j45.l.n(activity, "gallery", ".ui.GalleryEntryUI", intent2, i17);
    }

    public static void e(android.app.Activity activity, int i17, int i18, int i19, android.content.Intent intent) {
        f(activity, i17, i18, i19, intent, true);
    }

    public static void f(android.app.Activity activity, int i17, int i18, int i19, android.content.Intent intent, boolean z17) {
        android.os.Bundle extras;
        android.content.Intent intent2 = new android.content.Intent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            intent2.putExtras(extras);
        }
        intent2.putExtra("max_select_count", i18);
        intent2.putExtra("query_source_type", i19);
        intent2.putExtra("need_to_clear_top", z17);
        if (z17) {
            intent2.addFlags(67108864);
        }
        j45.l.n(activity, "gallery", ".ui.GalleryEntryUI", intent2, i17);
    }

    public static void g(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17, int i18, int i19, int i27, java.lang.String str, java.lang.String str2, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TakePhotoUtil", "summerhardcoder startPerformance[%s]", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(true, 0, 1, 1, 0, 2000, 706, 4L, "MicroMsg.TakePhotoUtil")));
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            intent2.putExtra("GalleryUI_FromUser", str);
            intent2.putExtra("GalleryUI_ToUser", str2);
        }
        intent2.putExtra("max_select_count", i18);
        intent2.putExtra("query_source_type", i19);
        intent2.putExtra("query_media_type", i27);
        boolean z17 = x51.o1.f533575a;
        intent2.putExtra("show_header_view", false);
        intent2.addFlags(67108864);
        intent2.putExtra("animation_push_up_in", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TakePhotoUtil", "selectPicFromMMGallery: requestCode:%s", java.lang.Integer.valueOf(i17));
        if (i17 == -1) {
            j45.l.j(componentCallbacksC1101xa17d4670.mo7438x76847179(), "gallery", ".ui.AlbumPreviewUI", intent2, null);
        } else {
            j45.l.p(componentCallbacksC1101xa17d4670, "gallery", ".ui.AlbumPreviewUI", intent2, i17);
        }
    }

    public static boolean h(android.app.Activity activity, int i17, android.content.Intent intent) {
        e(activity, i17, 1, 0, intent);
        return true;
    }

    public static void i(android.app.Activity activity, java.lang.String str, int i17, int i18, int i19, int i27, boolean z17) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var.m()) {
            r6Var.l();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("output", com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(activity, r6Var));
        intent.putExtra("android.intent.extra.videoQuality", i27);
        intent.putExtra("android.intent.extras.CAMERA_FACING", z17 ? 1 : 0);
        if (i18 > 0) {
            intent.putExtra("android.intent.extra.durationLimit", i18);
        }
        if (i19 > 0) {
            intent.putExtra("android.intent.extra.sizeLimit", i19);
        }
        intent.setAction("android.media.action.VIDEO_CAPTURE");
        intent.addCategory("android.intent.category.DEFAULT");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/TakePhotoUtil", "selectVideoFromSys", "(Landroid/app/Activity;Ljava/lang/String;IIIIZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public static boolean j(android.content.Context context, int i17, android.content.Intent intent, int i18, int i19) {
        k(context, i17, intent, i18, "", i19, "");
        return true;
    }

    public static boolean k(android.content.Context context, int i17, android.content.Intent intent, int i18, java.lang.String str, int i19, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TakePhotoUtil", "summerhardcoder startPerformance[%s]", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(true, 0, 1, 1, 0, 2000, 707, 4L, "MicroMsg.TakePhotoUtil")));
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = intent != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63) intent.getParcelableExtra("KEY_SIGHT_PARAMS") : null;
        if (c16528xd9aafd63 == null) {
            c16528xd9aafd63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(i18, i19);
        }
        c16528xd9aafd63.f230360q = str2;
        intent.putExtra("KEY_SIGHT_PARAMS", c16528xd9aafd63);
        if (i18 == 1) {
            java.lang.String a17 = t21.c3.a(str);
            c16528xd9aafd63.a(a17, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, a17, true), ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, a17, true), q75.c.d() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg"));
        }
        intent.putExtra("KEY_SIGHT_PARAMS", c16528xd9aafd63);
        j45.l.n(context, "mmsight", ".ui.SightCaptureUI", intent, i17);
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1);
        }
        return true;
    }

    public static boolean l(android.app.Activity activity, java.lang.String str, java.lang.String str2, int i17) {
        boolean z17 = false;
        if (!iq.b.g(activity) && !iq.b.v(activity) && !iq.b.e(activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TakePhotoUtil", "summerhardcoder startPerformance[%s]", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(true, 0, 1, 1, 0, 2000, 707, 4L, "MicroMsg.TakePhotoUtil")));
            f273299a = com.p314xaae8f345.mm.vfs.w6.i(str + str2, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("takePhotoFromSys(), filePath = ");
            sb6.append(f273299a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TakePhotoUtil", sb6.toString());
            java.lang.String str3 = f273299a;
            android.content.SharedPreferences.Editor edit = activity.getSharedPreferences("system_config_prefs", 0).edit();
            edit.putString("camera_file_path", str3);
            edit.commit();
            android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (!r6Var.m()) {
                try {
                    r6Var.J();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TakePhotoUtil", e17, "", new java.lang.Object[0]);
                }
            }
            if (r6Var.m()) {
                android.net.Uri b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(activity, new com.p314xaae8f345.mm.vfs.r6(f273299a));
                intent.addFlags(2);
                intent.putExtra("output", b17);
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/TakePhotoUtil", "takePhotoFromSys", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TakePhotoUtil", "takePhotoFromSys()");
                    z17 = true;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), " + e18.getMessage());
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), dir not exist. ".concat(str));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TakePhotoUtil", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", str, str2, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
