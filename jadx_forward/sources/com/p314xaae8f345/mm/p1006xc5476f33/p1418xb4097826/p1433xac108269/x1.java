package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class x1 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w1 f184197h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w1(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f184198a;

    /* renamed from: b, reason: collision with root package name */
    public final int f184199b;

    /* renamed from: c, reason: collision with root package name */
    public float f184200c;

    /* renamed from: d, reason: collision with root package name */
    public int f184201d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f184202e;

    /* renamed from: f, reason: collision with root package name */
    public final int f184203f;

    /* renamed from: g, reason: collision with root package name */
    public final int f184204g;

    public x1(android.app.Activity activity, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f184198a = activity;
        this.f184199b = i17;
        this.f184200c = 0.5625f;
        this.f184201d = activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a3c);
        this.f184203f = 10012;
        this.f184204g = 10013;
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x1 x1Var, java.lang.String inputPath, java.lang.String outputPath, float f17, int i17, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        boolean z19 = (i18 & 16) != 0 ? false : z17;
        boolean z27 = (i18 & 32) != 0 ? true : z18;
        x1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPath, "inputPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        x1Var.f184200c = f17;
        x1Var.f184201d = i17;
        x1Var.f184202e = z19;
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        int i19 = x1Var.f184199b;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(inputPath, outputPath);
        b17.f237221z = z27;
        b17.F = 11;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat("crop_fix_ratio", f17);
        bundle.putInt("button_custom_color", i17);
        bundle.putBoolean("can_show_preview", z19);
        b17.M = bundle;
        ((s40.w0) i95.n0.c(s40.w0.class)).getClass();
        b17.a(1, "com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout");
        ut3.f.f512709c.f512710a = null;
        ut3.m.f512715a.f(x1Var.f184198a, i19, com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6, b17, 1, 1);
    }

    public final void b(int i17) {
        int i18 = this.f184204g;
        ut3.m mVar = ut3.m.f512715a;
        android.app.Activity activity = this.f184198a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w1 w1Var = f184197h;
        if (i17 == i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CoverResultHelper", "go_crop");
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            int i19 = this.f184199b;
            java.lang.String inputPath = w1Var.a();
            java.lang.String outputPath = w1Var.a();
            float f17 = this.f184200c;
            int i27 = this.f184201d;
            boolean z17 = this.f184202e;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPath, "inputPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(inputPath, outputPath);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("crop_fix_ratio", f17);
            bundle.putInt("button_custom_color", i27);
            bundle.putBoolean("can_show_preview", z17);
            b17.M = bundle;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            b17.f237220y = true;
            b17.f237221z = false;
            ((s40.w0) i95.n0.c(s40.w0.class)).getClass();
            b17.a(1, "com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd();
            c16995x8ab634cd.f237223d = 17;
            b17.I = c16995x8ab634cd;
            b17.F = 11;
            com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
            java.util.HashMap hashMap = (java.util.HashMap) c10402x5bc41468.f146312h;
            hashMap.put("plugin_filter", bool);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_menu", bool);
            hashMap.put("plugin_music", bool);
            b17.f237210o = c10402x5bc41468;
            mVar.f(activity, i19, com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6, b17, 1, 1);
            return;
        }
        if (i17 == this.f184203f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CoverResultHelper", "go_edit");
            c61.ub ubVar2 = (c61.ub) i95.n0.c(c61.ub.class);
            int i28 = this.f184199b;
            java.lang.String inputPath2 = w1Var.a();
            java.lang.String outputPath2 = w1Var.a();
            float f18 = this.f184200c;
            int i29 = this.f184201d;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar2).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPath2, "inputPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath2, "outputPath");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(inputPath2, outputPath2);
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putFloat("crop_fix_ratio", f18);
            bundle2.putInt("button_custom_color", i29);
            b18.M = bundle2;
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            b18.f237220y = true;
            b18.f237221z = false;
            ((w40.e) i95.n0.c(w40.e.class)).getClass();
            b18.a(1, "com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd();
            c16995x8ab634cd2.f237223d = 17;
            b18.I = c16995x8ab634cd2;
            b18.F = 11;
            com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc414682 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
            java.util.HashMap hashMap2 = (java.util.HashMap) c10402x5bc414682.f146312h;
            hashMap2.put("plugin_filter", bool2);
            hashMap2.put("plugin_poi", bool2);
            hashMap2.put("plugin_tip", bool2);
            hashMap2.put("plugin_menu", bool2);
            hashMap2.put("plugin_music", bool2);
            hashMap2.put("plugin_photo_crop", bool2);
            b18.f237210o = c10402x5bc414682;
            mVar.f(activity, i28, com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6, b18, 1, 1);
        }
    }
}
