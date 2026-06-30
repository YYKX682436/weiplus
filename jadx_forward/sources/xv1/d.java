package xv1;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f538924a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(3);

    public static wv1.a a(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.c cVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        wv1.a aVar = null;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileUtils", "getImagePath() msg is null !");
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18;
        }
        java.util.List e17 = e(str3);
        java.lang.String lowerCase = str2.toLowerCase();
        lowerCase.getClass();
        char c17 = 65535;
        switch (lowerCase.hashCode()) {
            case 96673:
                if (lowerCase.equals(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18)) {
                    c17 = 0;
                    break;
                }
                break;
            case 3143036:
                if (lowerCase.equals("file")) {
                    c17 = 1;
                    break;
                }
                break;
            case 100313435:
                if (lowerCase.equals("image")) {
                    c17 = 2;
                    break;
                }
                break;
            case 112202875:
                if (lowerCase.equals("video")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                wv1.a g17 = g(cVar, f9Var, str, e17);
                if (g17 != null) {
                    return g17;
                }
                wv1.h hVar = (f9Var.m78014x7b98c171() || f9Var.Y2()) ? new wv1.h(cVar, f9Var) : null;
                if (hVar != null) {
                    return hVar;
                }
                if (f9Var.o2()) {
                    aVar = new wv1.b(cVar, f9Var);
                } else if (f9Var.J2()) {
                    aVar = new wv1.g(cVar, f9Var);
                }
                return aVar;
            case 1:
                return g(cVar, f9Var, str, e17);
            case 2:
                if (f9Var.o2()) {
                    return new wv1.b(cVar, f9Var);
                }
                if (f9Var.J2()) {
                    return new wv1.g(cVar, f9Var);
                }
                return null;
            case 3:
                if (f9Var.m78014x7b98c171() || f9Var.Y2()) {
                    return new wv1.h(cVar, f9Var);
                }
                return null;
            default:
                return null;
        }
    }

    public static void b(int i17, int i18, android.content.Intent intent, lo.j jVar) {
        if (i17 == lo.a.f401475a) {
            if (i18 == -1) {
                if (intent == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileUtils", "data is null");
                    if (jVar != null) {
                        jVar.a(1, "data is null", null);
                        return;
                    }
                    return;
                }
                java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("FILEPATHS");
                if (parcelableArrayListExtra != null) {
                    if (jVar != null) {
                        jVar.a(-1, "", parcelableArrayListExtra);
                        return;
                    }
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileUtils", "msgFiles is null");
                    if (jVar != null) {
                        jVar.a(1, "msgFiles is null", null);
                        return;
                    }
                    return;
                }
            }
            if (i18 == 0) {
                if (jVar != null) {
                    jVar.a(0, "", null);
                }
            } else {
                if (i18 != 1) {
                    return;
                }
                if (intent == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileUtils", "data is null");
                    if (jVar != null) {
                        jVar.a(1, "data is null", null);
                        return;
                    }
                    return;
                }
                java.lang.String stringExtra = intent.getStringExtra("ERRMSG");
                if (jVar != null) {
                    jVar.a(1, stringExtra, null);
                }
            }
        }
    }

    public static void c(android.content.Context context, long j17, java.lang.String str) {
        if (!gm0.j1.u().l()) {
            db5.t7.k(context, null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        intent.putExtra("app_msg_id", j17);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        intent.putExtra("msg_talker", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/util/MsgFileUtils", "enterFileProfile", "(Landroid/content/Context;JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/choosemsgfile/logic/util/MsgFileUtils", "enterFileProfile", "(Landroid/content/Context;JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void d(android.content.Context context, android.view.View view, wv1.a aVar) {
        int i17;
        int i18;
        android.content.Intent intent = new android.content.Intent();
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileUtils", "[enterGallery] item == null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = aVar.f531463b;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileUtils", "[enterGallery] msg == null");
            return;
        }
        int i19 = context.getResources().getConfiguration().orientation;
        int[] iArr = new int[2];
        if (view != null) {
            i17 = view.getWidth();
            i18 = view.getHeight();
            view.getLocationInWindow(iArr);
        } else {
            i17 = 0;
            i18 = 0;
        }
        intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        intent.putExtra("img_gallery_msg_id", f9Var.m124847x74d37ac6()).putExtra("img_gallery_msg_svr_id", f9Var.I0()).putExtra("img_gallery_talker", f9Var.Q0()).putExtra("img_gallery_chatroom_name", f9Var.Q0()).putExtra("img_gallery_orientation", i19).putExtra("show_enter_grid", false).putExtra("img_gallery_enter_from_scene", 1);
        if (view != null) {
            intent.putExtra("img_gallery_width", i17).putExtra("img_gallery_height", i18).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]).putExtra("img_gallery_enter_from_grid", true);
        } else {
            intent.putExtra("img_gallery_back_from_grid", true);
        }
        j45.l.u(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, null);
        ((android.app.Activity) context).overridePendingTransition(0, 0);
    }

    public static java.util.List e(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return arrayList;
        }
        try {
            cl0.e eVar = new cl0.e(str);
            for (int i17 = 0; i17 < eVar.mo15056xbe0e3ae6(); i17++) {
                java.lang.String mo15066x48bce8a4 = eVar.mo15066x48bce8a4(i17, "");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo15066x48bce8a4)) {
                    arrayList.add(mo15066x48bce8a4);
                }
            }
        } catch (cl0.f e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgFileUtils", e17, "", new java.lang.Object[0]);
        }
        return arrayList;
    }

    public static java.lang.String f(java.lang.String str) {
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 != null) {
                return n17.P0();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileUtils", "%s, contact is null", str);
            return "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n18 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n18.P0())) {
            return n18.P0();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 != null) {
            return z07.f69094xd1f9ba88;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileUtils", "%s chatRoomMember is null", str);
        return "";
    }

    public static wv1.a g(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.c cVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.util.List list) {
        java.lang.String j17;
        ot0.q v17;
        if (!f9Var.k2() || (j17 = f9Var.j()) == null || (v17 = ot0.q.v(j17)) == null) {
            return null;
        }
        if (!((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(v17.f430199i))) {
            return null;
        }
        wv1.f fVar = new wv1.f(cVar, f9Var, str);
        if (list != null && list.size() != 0) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (fVar.d().endsWith((java.lang.String) it.next())) {
                }
            }
            return null;
        }
        return fVar;
    }

    public static void h(android.content.Context context, int i17) {
        java.lang.String format = java.lang.String.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b78), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(format);
        u1Var.a(false);
        u1Var.l(new xv1.c());
        u1Var.q(false);
    }
}
