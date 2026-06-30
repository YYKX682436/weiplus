package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class x1 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.w1 f102664h = new com.tencent.mm.plugin.finder.assist.w1(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f102665a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102666b;

    /* renamed from: c, reason: collision with root package name */
    public float f102667c;

    /* renamed from: d, reason: collision with root package name */
    public int f102668d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f102669e;

    /* renamed from: f, reason: collision with root package name */
    public final int f102670f;

    /* renamed from: g, reason: collision with root package name */
    public final int f102671g;

    public x1(android.app.Activity activity, int i17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f102665a = activity;
        this.f102666b = i17;
        this.f102667c = 0.5625f;
        this.f102668d = activity.getResources().getColor(com.tencent.mm.R.color.a3c);
        this.f102670f = 10012;
        this.f102671g = 10013;
    }

    public static void a(com.tencent.mm.plugin.finder.assist.x1 x1Var, java.lang.String inputPath, java.lang.String outputPath, float f17, int i17, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        boolean z19 = (i18 & 16) != 0 ? false : z17;
        boolean z27 = (i18 & 32) != 0 ? true : z18;
        x1Var.getClass();
        kotlin.jvm.internal.o.g(inputPath, "inputPath");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        x1Var.f102667c = f17;
        x1Var.f102668d = i17;
        x1Var.f102669e = z19;
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        int i19 = x1Var.f102666b;
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(inputPath, outputPath);
        b17.f155688z = z27;
        b17.F = 11;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat("crop_fix_ratio", f17);
        bundle.putInt("button_custom_color", i17);
        bundle.putBoolean("can_show_preview", z19);
        b17.M = bundle;
        ((s40.w0) i95.n0.c(s40.w0.class)).getClass();
        b17.a(1, "com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout");
        ut3.f.f431176c.f431177a = null;
        ut3.m.f431182a.f(x1Var.f102665a, i19, com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6, b17, 1, 1);
    }

    public final void b(int i17) {
        int i18 = this.f102671g;
        ut3.m mVar = ut3.m.f431182a;
        android.app.Activity activity = this.f102665a;
        com.tencent.mm.plugin.finder.assist.w1 w1Var = f102664h;
        if (i17 == i18) {
            com.tencent.mars.xlog.Log.i("CoverResultHelper", "go_crop");
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            int i19 = this.f102666b;
            java.lang.String inputPath = w1Var.a();
            java.lang.String outputPath = w1Var.a();
            float f17 = this.f102667c;
            int i27 = this.f102668d;
            boolean z17 = this.f102669e;
            ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(inputPath, "inputPath");
            kotlin.jvm.internal.o.g(outputPath, "outputPath");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(inputPath, outputPath);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("crop_fix_ratio", f17);
            bundle.putInt("button_custom_color", i27);
            bundle.putBoolean("can_show_preview", z17);
            b17.M = bundle;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            b17.f155687y = true;
            b17.f155688z = false;
            ((s40.w0) i95.n0.c(s40.w0.class)).getClass();
            b17.a(1, "com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout");
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
            videoCaptureReportInfo.f155690d = 17;
            b17.I = videoCaptureReportInfo;
            b17.F = 11;
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
            java.util.HashMap hashMap = (java.util.HashMap) uICustomParam.f64779h;
            hashMap.put("plugin_filter", bool);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_menu", bool);
            hashMap.put("plugin_music", bool);
            b17.f155677o = uICustomParam;
            mVar.f(activity, i19, com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6, b17, 1, 1);
            return;
        }
        if (i17 == this.f102670f) {
            com.tencent.mars.xlog.Log.i("CoverResultHelper", "go_edit");
            c61.ub ubVar2 = (c61.ub) i95.n0.c(c61.ub.class);
            int i28 = this.f102666b;
            java.lang.String inputPath2 = w1Var.a();
            java.lang.String outputPath2 = w1Var.a();
            float f18 = this.f102667c;
            int i29 = this.f102668d;
            ((com.tencent.mm.plugin.finder.assist.i0) ubVar2).getClass();
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(inputPath2, "inputPath");
            kotlin.jvm.internal.o.g(outputPath2, "outputPath");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b18 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(inputPath2, outputPath2);
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putFloat("crop_fix_ratio", f18);
            bundle2.putInt("button_custom_color", i29);
            b18.M = bundle2;
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            b18.f155687y = true;
            b18.f155688z = false;
            ((w40.e) i95.n0.c(w40.e.class)).getClass();
            b18.a(1, "com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout");
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo2 = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
            videoCaptureReportInfo2.f155690d = 17;
            b18.I = videoCaptureReportInfo2;
            b18.F = 11;
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam2 = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
            java.util.HashMap hashMap2 = (java.util.HashMap) uICustomParam2.f64779h;
            hashMap2.put("plugin_filter", bool2);
            hashMap2.put("plugin_poi", bool2);
            hashMap2.put("plugin_tip", bool2);
            hashMap2.put("plugin_menu", bool2);
            hashMap2.put("plugin_music", bool2);
            hashMap2.put("plugin_photo_crop", bool2);
            b18.f155677o = uICustomParam2;
            mVar.f(activity, i28, com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6, b18, 1, 1);
        }
    }
}
