package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class z1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.y1 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.z1 f156890b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.z1();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.y1
    public boolean a(android.app.ActivityManager.AppTask appTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appTask, "appTask");
        android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
        return taskInfo != null && taskInfo.numActivities <= 0;
    }
}
