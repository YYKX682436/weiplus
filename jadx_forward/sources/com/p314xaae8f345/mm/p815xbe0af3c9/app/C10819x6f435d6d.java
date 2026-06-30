package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* renamed from: com.tencent.mm.legacy.app.WeChatSplash */
/* loaded from: classes12.dex */
public class C10819x6f435d6d {

    /* renamed from: a, reason: collision with root package name */
    public static km0.c f150018a;

    public static void a() {
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("MicroMsg.SplashInit", "applicationOnCreate", new java.lang.Object[0]);
        if (com.p314xaae8f345.mm.p2617xca9a2a67.j.f275185k) {
            try {
                if (!com.p314xaae8f345.mm.p2617xca9a2a67.j.j()) {
                    com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.Splash", "double check found problem!", new java.lang.Object[0]);
                    java.lang.reflect.Field field = com.p314xaae8f345.mm.p2617xca9a2a67.q.f275211f;
                    com.p314xaae8f345.mm.p2617xca9a2a67.q.f275210e.f275204e = (android.os.Handler.Callback) field.get(com.p314xaae8f345.mm.p2617xca9a2a67.q.f275207b);
                    field.setAccessible(true);
                    field.set(com.p314xaae8f345.mm.p2617xca9a2a67.q.f275207b, com.p314xaae8f345.mm.p2617xca9a2a67.q.f275210e);
                    com.p314xaae8f345.mm.p2617xca9a2a67.j.f275193s.a(675L, 31L, 1L);
                    com.p314xaae8f345.mm.p2617xca9a2a67.h hVar = new com.p314xaae8f345.mm.p2617xca9a2a67.h();
                    java.util.Set set = com.p314xaae8f345.mm.p2617xca9a2a67.p.f275201g;
                    if (com.p314xaae8f345.mm.p2617xca9a2a67.j.j()) {
                        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.Splash", "verify mH callback hack, result ok.", new java.lang.Object[0]);
                    } else {
                        hVar.run();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p2617xca9a2a67.j.e(e17, "double check exception.");
            }
        } else {
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.Splash", "double check: you must do the hack first.", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p2617xca9a2a67.t.f275216c = true;
        if (com.p314xaae8f345.mm.p2617xca9a2a67.t.f275214a) {
            com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 c10820x69adf850 = (com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850) com.p314xaae8f345.mm.p2617xca9a2a67.t.f275215b;
            if (c10820x69adf850.f150021c) {
                return;
            }
            c10820x69adf850.a(null);
            return;
        }
        synchronized (com.p314xaae8f345.mm.p2617xca9a2a67.j.class) {
            synchronized (com.p314xaae8f345.mm.p2617xca9a2a67.j.class) {
                if (!com.p314xaae8f345.mm.p2617xca9a2a67.j.f275187m) {
                    com.p314xaae8f345.mm.p2617xca9a2a67.j.f275187m = true;
                    com.p314xaae8f345.mm.p2617xca9a2a67.w wVar = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275186l;
                    if (wVar == null) {
                        com.p314xaae8f345.mm.p2617xca9a2a67.j.a();
                    } else {
                        ((com.p314xaae8f345.mm.p2617xca9a2a67.r) wVar).a(com.p314xaae8f345.mm.p2617xca9a2a67.j.f275195u);
                    }
                }
            }
        }
    }

    public static void b(km0.c cVar, com.p314xaae8f345.mm.p2617xca9a2a67.s sVar) {
        f150018a = cVar;
        com.p314xaae8f345.mm.p2617xca9a2a67.j.f275188n = new com.p314xaae8f345.mm.p815xbe0af3c9.app.z();
        com.p314xaae8f345.mm.p2617xca9a2a67.j.f275181g = new com.p314xaae8f345.mm.p815xbe0af3c9.app.a0();
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxSplash.WeChatSplash", "splash callback class is null, return.");
            return;
        }
        long j17 = com.p314xaae8f345.mm.app.x.f135439a;
        long j18 = com.p314xaae8f345.mm.app.x.f135440b;
        nm.a.f419956x = j17;
        nm.a.f419957y = j18;
        nm.a.f419958z = j17;
        com.p314xaae8f345.mm.p2617xca9a2a67.j.f275178d = "com.tencent.mm.ui.LauncherUI";
        com.p314xaae8f345.mm.p2617xca9a2a67.j.f275190p = com.p314xaae8f345.mm.app.ActivityC5029x1adff79c.class;
        com.p314xaae8f345.mm.p2617xca9a2a67.j.f275192r = com.p314xaae8f345.mm.app.ActivityC5030xa8eb239e.class;
        if (!a92.a.c(cVar.f390522c)) {
            com.p314xaae8f345.mm.p2617xca9a2a67.j.f275194t.add("com.google.firebase.provider.FirebaseInitProvider");
        }
        com.p314xaae8f345.mm.p2617xca9a2a67.t.a(cVar.f390522c, cVar.f390520a, sVar);
    }

    /* renamed from: profile */
    public static km0.c m46379xed8e89a9() {
        return f150018a;
    }
}
