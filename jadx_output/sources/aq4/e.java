package aq4;

/* loaded from: classes4.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f13210d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f13211e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f13212f;

    /* renamed from: g, reason: collision with root package name */
    public int f13213g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork f13214h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork remuxBackgroundWork, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f13214h = remuxBackgroundWork;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq4.e(this.f13214h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq4.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean contains;
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f13213g;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f13214h.f176108o, "deWork start: " + java.lang.Thread.currentThread().getName());
        java.lang.String c17 = this.f13214h.f12459e.f12466b.c("KEY_EXPORT_BACKGROUND_WORK_TAG_ID");
        aq4.d dVar = new aq4.d(c17);
        com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork remuxBackgroundWork = this.f13214h;
        this.f13210d = c17;
        this.f13211e = dVar;
        this.f13212f = remuxBackgroundWork;
        this.f13213g = 1;
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        aq4.c cVar = new aq4.c(remuxBackgroundWork, nVar);
        com.tencent.mars.xlog.Log.i(remuxBackgroundWork.f176108o, "suspend " + java.lang.Thread.currentThread().getName() + "， workTagId: " + c17);
        aq4.a aVar2 = aq4.a.f13201a;
        synchronized (aVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemuxBackgroundManager", "isWorkInRunningList >> " + c17);
            contains = c17 == null ? false : aq4.a.f13202b.contains(c17);
        }
        if (contains) {
            com.tencent.mars.xlog.Log.i(remuxBackgroundWork.f176108o, "work is repeat no to do");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(new a5.v()));
        } else {
            jz5.l i18 = com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork.i(remuxBackgroundWork, c17);
            boolean booleanValue = ((java.lang.Boolean) i18.f302833d).booleanValue();
            dm.q0 q0Var = (dm.q0) i18.f302834e;
            if (booleanValue) {
                kotlin.jvm.internal.o.d(c17);
                kotlin.jvm.internal.o.d(q0Var);
                int i19 = q0Var.field_work_type;
                com.tencent.mars.xlog.Log.i(remuxBackgroundWork.f176108o, "checkWorkIsFinish >> workType: " + i19 + ", workTagId: " + c17);
                if (i19 == 4007 || i19 == 4008) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    nVar.resumeWith(kotlin.Result.m521constructorimpl(new a5.v()));
                } else {
                    synchronized (aVar2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxBackgroundManager", "addRunningWorkToList >> ".concat(c17));
                        aq4.a.f13202b.add(c17);
                    }
                    int i27 = q0Var.field_work_type;
                    java.lang.String field_output_video_path = q0Var.field_output_video_path;
                    kotlin.jvm.internal.o.f(field_output_video_path, "field_output_video_path");
                    long j17 = q0Var.field_start_remux_time_stamp;
                    java.lang.String str = remuxBackgroundWork.f176108o;
                    com.tencent.mars.xlog.Log.i(str, "dealIsReStartWork >> workTagId: " + c17 + ", workType: " + i27 + ", startWorkTime: " + j17);
                    if (j17 == 0 || i27 == 4007) {
                        z17 = false;
                    } else {
                        com.tencent.mars.xlog.Log.i(str, "is go to restart work");
                        com.tencent.mm.vfs.w6.h(field_output_video_path);
                        z17 = true;
                    }
                    zp4.e eVar = zp4.e.f474954a;
                    long j18 = q0Var.field_start_remux_time_stamp;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    l75.k0 a17 = eVar.a();
                    p75.n0 n0Var = dm.q0.R;
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("is_killed_process_restart", java.lang.Integer.valueOf(z17 ? 1 : 2));
                    contentValues.put("start_remux_time_stamp", java.lang.Long.valueOf(z17 ? j18 : currentTimeMillis));
                    p75.m0 j19 = dm.q0.S.j(c17);
                    p75.h1 j27 = dm.q0.R.j(contentValues);
                    j27.b(j19);
                    com.tencent.mars.xlog.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", "updateIsKilledProcessRestart >> workTagId: " + c17 + ", isKill: " + z17 + ", result: " + j27.a().f(a17) + ", startMuxTimeStamp: " + j18 + ", startMuxTimeStampCurrent: " + currentTimeMillis);
                    r45.h70 h70Var = new r45.h70();
                    try {
                        h70Var.parseFrom(q0Var.field_composition_info);
                        byte[] field_video_param = q0Var.field_video_param;
                        kotlin.jvm.internal.o.f(field_video_param, "field_video_param");
                        com.tencent.mm.modelcontrol.VideoTransPara k17 = com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork.k(remuxBackgroundWork, field_video_param);
                        int b17 = remuxBackgroundWork.f12459e.f12466b.b("KEY_EXPORT_ABA_FLAG", 0);
                        int b18 = remuxBackgroundWork.f12459e.f12466b.b("KEY_EXPORT_TARGET_VIDEO_BITRATE", 0);
                        int b19 = remuxBackgroundWork.f12459e.f12466b.b("KEY_EXPORT_TEC_SCENE", 0);
                        com.tencent.mars.xlog.Log.i(remuxBackgroundWork.f176108o, "getEncodeFromDB");
                        st3.r rVar = new st3.r(q0Var.field_encode_target_width, q0Var.field_encode_target_height, q0Var.field_encode_video_bitrate, 0, q0Var.field_encode_frame_rate, q0Var.field_source_video_rotate, 0, 0, false, false, 0, 0, q0Var.field_encode_qp_switch, 0, 12232, null);
                        java.lang.String str2 = q0Var.field_output_video_path;
                        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = new com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider();
                        recordConfigProvider.f155676n = k17;
                        recordConfigProvider.B = str2;
                        recordConfigProvider.F = 2;
                        vp4.s.f439074a.c(h70Var, recordConfigProvider, b19, rVar, b17, b18, cVar, c17, dVar);
                    } catch (java.io.IOException unused) {
                        com.tencent.mars.xlog.Log.e(remuxBackgroundWork.f176108o, "parse byte error");
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        nVar.resumeWith(kotlin.Result.m521constructorimpl(new a5.v()));
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e(remuxBackgroundWork.f176108o, "checkDataBeforeRemux is false");
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                nVar.resumeWith(kotlin.Result.m521constructorimpl(new a5.v()));
            }
        }
        java.lang.Object a18 = nVar.a();
        pz5.a aVar3 = pz5.a.f359186d;
        return a18 == aVar ? aVar : a18;
    }
}
