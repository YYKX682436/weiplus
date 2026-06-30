package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class a2 implements com.tencent.mm.plugin.appbrand.app.y1 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.app.a2 f75006b = new com.tencent.mm.plugin.appbrand.app.a2();

    @Override // com.tencent.mm.plugin.appbrand.app.y1
    public boolean a(android.app.ActivityManager.AppTask appTask) {
        kotlin.jvm.internal.o.g(appTask, "appTask");
        android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
        return (taskInfo == null || taskInfo.isRunning) ? false : true;
    }
}
