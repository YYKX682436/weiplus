package com.tencent.maas.export;

/* loaded from: classes4.dex */
public class MJExportManager implements com.tencent.maas.export.NativeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f48004a = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f48005b = java.util.Collections.synchronizedList(new java.util.ArrayList());
    private final com.facebook.jni.HybridData mHybridData;

    private MJExportManager(com.facebook.jni.HybridData hybridData) {
        this.mHybridData = hybridData;
        nativeSetNativeStateChangeListener(this);
    }

    private native com.tencent.maas.instamovie.base.MJError nativeCancelTaskById(java.lang.String str);

    private native java.util.Map<java.lang.String, com.tencent.maas.export.MJExportRequest> nativeGetAllPausedTasksInfo();

    private native java.util.Map<java.lang.String, com.tencent.maas.export.MJExportRequest> nativeGetScheduledTasksInfo();

    private native boolean nativeIsServicePaused();

    private native void nativePauseService();

    private native com.tencent.maas.instamovie.base.MJError nativePauseTaskById(java.lang.String str);

    private native void nativeResumeService();

    private native void nativeSetNativeStateChangeListener(com.tencent.maas.export.NativeCallback nativeCallback);

    private native com.tencent.maas.instamovie.base.MJError nativeStartTaskById(java.lang.String str);

    private native java.lang.String nativeSubmitAndStartNewTask(com.tencent.maas.export.MJExportRequest mJExportRequest);

    private native java.lang.String nativeSubmitNewTask(com.tencent.maas.export.MJExportRequest mJExportRequest);

    public com.tencent.maas.instamovie.base.MJError a(com.tencent.maas.export.c cVar) {
        return nativeCancelTaskById(cVar.f48010a);
    }

    public java.util.Map b() {
        java.util.Map<java.lang.String, com.tencent.maas.export.MJExportRequest> nativeGetScheduledTasksInfo = nativeGetScheduledTasksInfo();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, com.tencent.maas.export.MJExportRequest> entry : nativeGetScheduledTasksInfo.entrySet()) {
            java.lang.String key = entry.getKey();
            hashMap.put(new com.tencent.maas.export.c(key), entry.getValue());
        }
        return hashMap;
    }

    public com.tencent.maas.instamovie.base.MJError c(com.tencent.maas.export.c cVar) {
        return nativeStartTaskById(cVar.f48010a);
    }

    public com.tencent.maas.export.c d(com.tencent.maas.export.MJExportRequest mJExportRequest) {
        return new com.tencent.maas.export.c(nativeSubmitNewTask(mJExportRequest));
    }

    @Override // com.tencent.maas.export.NativeCallback
    public void onServiceStateChange(int i17) {
        java.util.Iterator it = this.f48005b.iterator();
        while (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
        }
    }

    @Override // com.tencent.maas.export.NativeCallback
    public void onStateChange(java.lang.String str, int i17, float f17, java.lang.String finalVideoPath) {
        for (com.tencent.maas.export.a aVar : this.f48004a) {
            if (aVar != null) {
                if (i17 == 1) {
                    com.tencent.mm.autogen.events.TemplateBackgroundVideoResultEvent templateBackgroundVideoResultEvent = new com.tencent.mm.autogen.events.TemplateBackgroundVideoResultEvent();
                    am.ty tyVar = templateBackgroundVideoResultEvent.f54888g;
                    tyVar.f8041a = 4001;
                    tyVar.f8042b = ((hz0.d) aVar).f286249a;
                    tyVar.f8044d = (int) (100 * f17);
                    tyVar.f8043c = -1;
                    templateBackgroundVideoResultEvent.e();
                } else if (i17 == 2) {
                    com.tencent.maas.export.c cVar = new com.tencent.maas.export.c(str);
                    hz0.d dVar = (hz0.d) aVar;
                    kotlin.jvm.internal.o.g(finalVideoPath, "finalVideoPath");
                    com.tencent.mars.xlog.Log.i(dVar.f286253e, "onFinish: " + str + ", " + java.lang.Thread.currentThread().getName());
                    if ((cVar.equals(com.tencent.maas.export.c.f48009b) ^ true) && kotlin.jvm.internal.o.b(str, dVar.f286249a) && com.tencent.mm.vfs.w6.j(finalVideoPath)) {
                        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsTemplateAsyncClipMockError()) == 1) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.TemplateBackgroundWork", "onFinish: hardcode local error");
                            dVar.a(cVar);
                        } else {
                            com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork templateBackgroundWork = dVar.f286254f;
                            hz0.c cVar2 = new hz0.c(finalVideoPath, dVar, templateBackgroundWork);
                            templateBackgroundWork.getClass();
                            ((ku5.t0) ku5.t0.f312615d).h(new hz0.j(templateBackgroundWork, cVar2), "sns_template_background_thread");
                        }
                    }
                } else if (i17 == 3) {
                    ((hz0.d) aVar).a(new com.tencent.maas.export.c(str));
                } else if (i17 == 4) {
                    hz0.d dVar2 = (hz0.d) aVar;
                    com.tencent.mars.xlog.Log.i(dVar2.f286253e, "onCancelled: workTagId=" + dVar2.f286249a + ", " + str);
                    kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new hz0.a(dVar2, null), 3, null);
                    long j17 = dVar2.f286251c;
                    dVar2.f286254f.getClass();
                    az0.rc.i("3002", j17, null, false, 300, 12, null);
                } else if (i17 == 5) {
                    hz0.d dVar3 = (hz0.d) aVar;
                    com.tencent.mars.xlog.Log.i(dVar3.f286253e, "onPaused: workTagId=" + dVar3.f286249a + ", " + str);
                    long j18 = dVar3.f286251c;
                    dVar3.f286254f.getClass();
                    az0.rc.i("3001", j18, null, false, 300, 12, null);
                }
            }
        }
    }
}
