package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f211336a;

    /* renamed from: b, reason: collision with root package name */
    public az2.f f211337b;

    /* renamed from: c, reason: collision with root package name */
    public final so2.w5 f211338c;

    public sd(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f211336a = context;
        this.f211338c = new so2.w5(username);
    }

    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd sdVar, boolean z17) {
        sdVar.getClass();
        boolean l17 = gm0.j1.u().l();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = sdVar.f211336a;
        if (!l17) {
            db5.t7.k(abstractActivityC21394xb3d2c0cf, null);
            return false;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(abstractActivityC21394xb3d2c0cf, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelectCoverHelper", "checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), abstractActivityC21394xb3d2c0cf);
        if (!a17) {
            return false;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.pd pdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.pd(sdVar);
            java.lang.String a18 = t21.c3.a(en1.a.a());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "genFileName(...)");
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            bm5.f0 f0Var = bm5.f0.f104104s;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.String rj6 = ((k90.b) u0Var).rj(null, f0Var, a18, true);
            java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, a18, true);
            ((ee0.h4) ((fe0.d4) i95.n0.c(fe0.d4.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCoverVideoParam", "com.tencent.mm.feature.sns.SnsCoverConfigService");
            w94.a aVar = w94.a.f525608a;
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d a19 = aVar.a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoverVideoParam", "com.tencent.mm.feature.sns.SnsCoverConfigService");
            ((ee0.h4) ((fe0.d4) i95.n0.c(fe0.d4.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCoverVideoParam", "com.tencent.mm.feature.sns.SnsCoverConfigService");
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d a27 = aVar.a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoverVideoParam", "com.tencent.mm.feature.sns.SnsCoverConfigService");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.g(rj6, tj6, a19, a27.f152728h * 1000, 11);
            com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
            java.util.HashMap hashMap = (java.util.HashMap) c10402x5bc41468.f146312h;
            hashMap.put("plugin_filter", bool);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_menu", bool);
            g17.f237210o = c10402x5bc41468;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            g17.f237217v = bool2;
            g17.f237215t = bool2;
            g17.K = false;
            g17.L = false;
            g17.N = true;
            g17.f237213r = bool;
            g17.f237212q = 4;
            g17.a(1, "com.tencent.mm.plugin.recordvideo.plugin.parent.DirectSendPhotoPluginLayout");
            g17.a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout");
            ut3.f.f512709c.f512710a = pdVar;
            ut3.m.f512715a.c(sdVar.f211336a, 2000, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1, g17);
        } else {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            java.lang.String a28 = g83.a.a();
            java.lang.String str = "finderProfileCover." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
            ((ub0.r) oVar).getClass();
            if (!com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.l(abstractActivityC21394xb3d2c0cf, a28, str, 2003)) {
                dp.a.m125854x26a183b(abstractActivityC21394xb3d2c0cf, sdVar.b(com.p314xaae8f345.mm.R.C30867xcad56011.igw), 1).show();
            }
        }
        return true;
    }

    public final java.lang.String b(int i17) {
        java.lang.String string = this.f211336a.getResources().getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final void c(java.lang.String filePath) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(filePath) || !com.p314xaae8f345.mm.vfs.w6.j(filePath)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.SelectCoverHelper", "no img select");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        java.lang.String resultFileName = "finder_profile_cover_" + java.lang.System.currentTimeMillis() + ".tmp";
        i0Var.getClass();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f211336a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultFileName, "resultFileName");
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15026xb84ce7c3.class);
        intent.putExtra("key_crop_style", 2);
        intent.putExtra("key_crop_source", 3);
        intent.putExtra("key_source_img_path", filePath);
        intent.putExtra("key_result_file_name", resultFileName);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(2002);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterCropProfileBgUI", "(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void d() {
        az2.f fVar = this.f211337b;
        if (fVar != null) {
            fVar.b();
        }
        az2.c cVar = az2.f.f97658d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f211336a;
        az2.f a17 = az2.c.a(cVar, abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), 300L, null, 8, null);
        this.f211337b = a17;
        a17.a();
    }
}
