package aq4;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork f13203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f13204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f13205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13206g;

    public b(com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork remuxBackgroundWork, java.lang.String str, kotlin.coroutines.Continuation continuation, int i17) {
        this.f13203d = remuxBackgroundWork;
        this.f13204e = str;
        this.f13205f = continuation;
        this.f13206g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork remuxBackgroundWork = this.f13203d;
        java.lang.String str = remuxBackgroundWork.f176108o;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deal result in async thread >> ");
        java.lang.String str2 = this.f13204e;
        sb6.append(str2);
        sb6.append(", ");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        jz5.l i18 = com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork.i(remuxBackgroundWork, str2);
        boolean booleanValue = ((java.lang.Boolean) i18.f302833d).booleanValue();
        dm.q0 q0Var = (dm.q0) i18.f302834e;
        kotlin.coroutines.Continuation continuation = this.f13205f;
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.e(remuxBackgroundWork.f176108o, "work result is lose");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new a5.v()));
            aq4.a.f13201a.a(str2);
            return;
        }
        kotlin.jvm.internal.o.d(q0Var);
        remuxBackgroundWork.getClass();
        int i19 = q0Var.field_work_type;
        if (i19 == 4002 || i19 == 4004) {
            java.lang.String str3 = q0Var.field_output_video_path;
            java.lang.String str4 = q0Var.field_output_thumb_path;
            com.tencent.mars.xlog.Log.i(remuxBackgroundWork.f176108o, "dealFileByLastWorkType >> " + i19 + "videoPath:  " + str3 + " thumbPath: " + str4 + " realVideoPath: " + com.tencent.mm.vfs.w6.i(str3, false) + "realThumbPath: " + com.tencent.mm.vfs.w6.i(str4, false));
            com.tencent.mm.vfs.w6.h(str3);
            com.tencent.mm.vfs.w6.h(str4);
        }
        aq4.a aVar = aq4.a.f13201a;
        boolean z17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_SnsBackgroundRemuxError_Int, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxBackgroundManager", "getSnsBackgroundRemuxError >> " + z17);
        if (z17) {
            com.tencent.mars.xlog.Log.i(remuxBackgroundWork.f176108o, "hardcode error");
            i17 = 1013;
        } else {
            i17 = this.f13206g;
        }
        if (i17 != 0 || z17) {
            com.tencent.mars.xlog.Log.e(remuxBackgroundWork.f176108o, "remux error " + i17 + ", " + z17);
            kotlin.jvm.internal.o.d(str2);
            com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork.j(remuxBackgroundWork, com.google.android.gms.wearable.WearableStatusCodes.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED, i17, str2, q0Var);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new a5.v()));
            return;
        }
        byte[] field_video_param = q0Var.field_video_param;
        kotlin.jvm.internal.o.f(field_video_param, "field_video_param");
        com.tencent.mm.modelcontrol.VideoTransPara k17 = com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork.k(remuxBackgroundWork, field_video_param);
        vp4.s sVar = vp4.s.f439074a;
        boolean z18 = q0Var.field_is_save_source_media;
        boolean z19 = q0Var.field_is_sava_to_sys_album_if_media_edited;
        java.lang.String str5 = q0Var.field_output_video_path;
        java.lang.String str6 = q0Var.field_source_video_path;
        boolean z27 = q0Var.field_is_change;
        java.lang.String str7 = q0Var.field_output_thumb_path;
        int i27 = k17.f71204t;
        boolean z28 = q0Var.field_is_capture_video;
        kotlin.jvm.internal.o.d(str7);
        kotlin.jvm.internal.o.d(str6);
        kotlin.jvm.internal.o.d(str5);
        vp4.s.b(sVar, z18, str7, i27, str6, str5, z19, z28, z27, null, true, 256, null);
        kotlin.jvm.internal.o.d(str2);
        com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork.j(remuxBackgroundWork, com.google.android.gms.wearable.WearableStatusCodes.UNKNOWN_CAPABILITY, i17, str2, q0Var);
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(a5.y.a()));
    }
}
