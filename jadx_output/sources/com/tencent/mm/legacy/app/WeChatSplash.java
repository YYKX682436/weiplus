package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class WeChatSplash {

    /* renamed from: a, reason: collision with root package name */
    public static km0.c f68485a;

    public static void a() {
        com.tencent.mm.splash.j.d("MicroMsg.SplashInit", "applicationOnCreate", new java.lang.Object[0]);
        if (com.tencent.mm.splash.j.f193652k) {
            try {
                if (!com.tencent.mm.splash.j.j()) {
                    com.tencent.mm.splash.j.d("WxSplash.Splash", "double check found problem!", new java.lang.Object[0]);
                    java.lang.reflect.Field field = com.tencent.mm.splash.q.f193678f;
                    com.tencent.mm.splash.q.f193677e.f193671e = (android.os.Handler.Callback) field.get(com.tencent.mm.splash.q.f193674b);
                    field.setAccessible(true);
                    field.set(com.tencent.mm.splash.q.f193674b, com.tencent.mm.splash.q.f193677e);
                    com.tencent.mm.splash.j.f193660s.a(675L, 31L, 1L);
                    com.tencent.mm.splash.h hVar = new com.tencent.mm.splash.h();
                    java.util.Set set = com.tencent.mm.splash.p.f193668g;
                    if (com.tencent.mm.splash.j.j()) {
                        com.tencent.mm.splash.j.d("WxSplash.Splash", "verify mH callback hack, result ok.", new java.lang.Object[0]);
                    } else {
                        hVar.run();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mm.splash.j.e(e17, "double check exception.");
            }
        } else {
            com.tencent.mm.splash.j.d("WxSplash.Splash", "double check: you must do the hack first.", new java.lang.Object[0]);
        }
        com.tencent.mm.splash.t.f193683c = true;
        if (com.tencent.mm.splash.t.f193681a) {
            com.tencent.mm.legacy.app.WeChatSplashStartup weChatSplashStartup = (com.tencent.mm.legacy.app.WeChatSplashStartup) com.tencent.mm.splash.t.f193682b;
            if (weChatSplashStartup.f68488c) {
                return;
            }
            weChatSplashStartup.a(null);
            return;
        }
        synchronized (com.tencent.mm.splash.j.class) {
            synchronized (com.tencent.mm.splash.j.class) {
                if (!com.tencent.mm.splash.j.f193654m) {
                    com.tencent.mm.splash.j.f193654m = true;
                    com.tencent.mm.splash.w wVar = com.tencent.mm.splash.j.f193653l;
                    if (wVar == null) {
                        com.tencent.mm.splash.j.a();
                    } else {
                        ((com.tencent.mm.splash.r) wVar).a(com.tencent.mm.splash.j.f193662u);
                    }
                }
            }
        }
    }

    public static void b(km0.c cVar, com.tencent.mm.splash.s sVar) {
        f68485a = cVar;
        com.tencent.mm.splash.j.f193655n = new com.tencent.mm.legacy.app.z();
        com.tencent.mm.splash.j.f193648g = new com.tencent.mm.legacy.app.a0();
        if (sVar == null) {
            com.tencent.mars.xlog.Log.i("WxSplash.WeChatSplash", "splash callback class is null, return.");
            return;
        }
        long j17 = com.tencent.mm.app.x.f53906a;
        long j18 = com.tencent.mm.app.x.f53907b;
        nm.a.f338423x = j17;
        nm.a.f338424y = j18;
        nm.a.f338425z = j17;
        com.tencent.mm.splash.j.f193645d = "com.tencent.mm.ui.LauncherUI";
        com.tencent.mm.splash.j.f193657p = com.tencent.mm.app.WeChatSplashActivity.class;
        com.tencent.mm.splash.j.f193659r = com.tencent.mm.app.WeChatSplashFallbackActivity.class;
        if (!a92.a.c(cVar.f308989c)) {
            com.tencent.mm.splash.j.f193661t.add("com.google.firebase.provider.FirebaseInitProvider");
        }
        com.tencent.mm.splash.t.a(cVar.f308989c, cVar.f308987a, sVar);
    }

    public static km0.c profile() {
        return f68485a;
    }
}
