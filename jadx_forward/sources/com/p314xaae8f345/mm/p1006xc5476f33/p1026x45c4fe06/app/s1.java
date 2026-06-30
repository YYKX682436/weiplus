package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.s1 f156801a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.s1();

    public final boolean a(android.app.ActivityManager.AppTask appTask) {
        android.content.Intent intent;
        android.content.ComponentName component;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appTask, "appTask");
        android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
        if (taskInfo != null && (intent = taskInfo.baseIntent) != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent.getAction(), "android.intent.action.MAIN")) {
            java.util.Set<java.lang.String> categories = intent.getCategories();
            if ((categories != null && categories.contains("android.intent.category.LAUNCHER")) || (component = intent.getComponent()) == null) {
                return false;
            }
            java.lang.String className = component.getClassName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "getClassName(...)");
            if (r26.i0.y(className, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a.class.getName(), false)) {
                return true;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156628m) {
                java.lang.String className2 = component.getClassName();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className2, "getClassName(...)");
                if (r26.i0.y(className2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93.class.getName(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
