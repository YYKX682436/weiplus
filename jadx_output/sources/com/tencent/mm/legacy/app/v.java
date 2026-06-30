package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class v implements com.tencent.mm.splash.c {
    public android.app.Activity a(android.app.Activity activity) {
        boolean z17 = false;
        if (com.tencent.mm.legacy.app.w.a(false) || activity == null) {
            return activity;
        }
        java.lang.Class<?> cls = activity.getClass();
        gm0.a2 a2Var = (gm0.a2) cls.getAnnotation(gm0.a2.class);
        if (a2Var != null || cls.getSuperclass() == null ? a2Var != null : ((gm0.a2) cls.getSuperclass().getAnnotation(gm0.a2.class)) != null) {
            z17 = true;
        }
        if (!z17) {
            return activity;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.PreventAccountNotReady", "this activity %s need account but account not initiated, so we need replace it with a suicide activity.", activity);
        return new com.tencent.mm.legacy.app.SuicideHackActivity();
    }
}
