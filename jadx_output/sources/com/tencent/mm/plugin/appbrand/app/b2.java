package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class b2 implements com.tencent.mm.plugin.appbrand.app.y1 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.app.b2 f75021b = new com.tencent.mm.plugin.appbrand.app.b2();

    @Override // com.tencent.mm.plugin.appbrand.app.y1
    public boolean a(android.app.ActivityManager.AppTask appTask) {
        kotlin.jvm.internal.o.g(appTask, "appTask");
        android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
        return taskInfo != null && taskInfo.id == -1;
    }
}
