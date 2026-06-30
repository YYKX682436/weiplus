package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes12.dex */
public final class c implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.c f179074a = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.c();

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q5
    public void a(boolean z17, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        if (interfaceC4987x84e327cb != null && z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(interfaceC4987x84e327cb.H0())) {
            java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b0.f179073a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(set);
            if (set.remove(interfaceC4987x84e327cb.mo42933xb5885648())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEmojiLogic", "emojiServiceCallback onDownload %s", interfaceC4987x84e327cb.mo42933xb5885648());
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372 c5417xb0026372 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372();
                am.n9 n9Var = c5417xb0026372.f135764g;
                n9Var.f88939a = 2;
                n9Var.f88940b = interfaceC4987x84e327cb.X0();
                n9Var.f88942d = interfaceC4987x84e327cb.mo42934xfb82e301();
                n9Var.f88943e = interfaceC4987x84e327cb.mo42927x1061ea06();
                n9Var.f88944f = interfaceC4987x84e327cb.J1();
                n9Var.f88941c = interfaceC4987x84e327cb.l();
                n9Var.f88945g = interfaceC4987x84e327cb.H0();
                n9Var.f88946h = interfaceC4987x84e327cb.mo42930x4f4a97c4();
                java.lang.String N0 = interfaceC4987x84e327cb.N0();
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(interfaceC4987x84e327cb.mo42933xb5885648());
                am.o9 o9Var = c5417xb0026372.f135765h;
                if (u17 == null || (u17.f68678x13320507 & 1) != 1) {
                    o9Var.f89051a = N0;
                } else {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalCacheDir() == null) {
                        return;
                    }
                    java.io.File externalCacheDir = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalCacheDir();
                    java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
                    byte[] bytes = mo42933xb5885648.getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(externalCacheDir, kk.k.g(bytes)).o();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                    if (com.p314xaae8f345.mm.vfs.w6.j(N0) && !com.p314xaae8f345.mm.vfs.w6.j(o17)) {
                        byte[] z18 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).z(u17);
                        if (z18 != null) {
                            com.p314xaae8f345.mm.vfs.w6.a(o17, z18);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.FTSEmojiLogic", "onDownload: decrypt failed");
                        }
                    }
                    o9Var.f89051a = o17;
                }
                c5417xb0026372.b(android.os.Looper.getMainLooper());
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEmojiLogic", "somethings error.");
    }
}
