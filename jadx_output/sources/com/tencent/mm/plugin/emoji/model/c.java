package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes12.dex */
public final class c implements com.tencent.mm.feature.emoji.api.q5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.emoji.model.c f97541a = new com.tencent.mm.plugin.emoji.model.c();

    @Override // com.tencent.mm.feature.emoji.api.q5
    public void a(boolean z17, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (iEmojiInfo != null && z17 && !com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo.H0())) {
            java.util.Set set = com.tencent.mm.plugin.emoji.model.b0.f97540a;
            kotlin.jvm.internal.o.d(set);
            if (set.remove(iEmojiInfo.getMd5())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiLogic", "emojiServiceCallback onDownload %s", iEmojiInfo.getMd5());
                com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent fTSEmojiDownloadedEvent = new com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent();
                am.n9 n9Var = fTSEmojiDownloadedEvent.f54231g;
                n9Var.f7406a = 2;
                n9Var.f7407b = iEmojiInfo.X0();
                n9Var.f7409d = iEmojiInfo.getName();
                n9Var.f7410e = iEmojiInfo.getAesKey();
                n9Var.f7411f = iEmojiInfo.J1();
                n9Var.f7408c = iEmojiInfo.l();
                n9Var.f7412g = iEmojiInfo.H0();
                n9Var.f7413h = iEmojiInfo.getGroupId();
                java.lang.String N0 = iEmojiInfo.N0();
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(iEmojiInfo.getMd5());
                am.o9 o9Var = fTSEmojiDownloadedEvent.f54232h;
                if (u17 == null || (u17.field_reserved4 & 1) != 1) {
                    o9Var.f7518a = N0;
                } else {
                    if (com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir() == null) {
                        return;
                    }
                    java.io.File externalCacheDir = com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir();
                    java.lang.String md52 = iEmojiInfo.getMd5();
                    kotlin.jvm.internal.o.f(md52, "getMd5(...)");
                    byte[] bytes = md52.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    java.lang.String o17 = new com.tencent.mm.vfs.r6(externalCacheDir, kk.k.g(bytes)).o();
                    kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                    if (com.tencent.mm.vfs.w6.j(N0) && !com.tencent.mm.vfs.w6.j(o17)) {
                        byte[] z18 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).z(u17);
                        if (z18 != null) {
                            com.tencent.mm.vfs.w6.a(o17, z18);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.FTS.FTSEmojiLogic", "onDownload: decrypt failed");
                        }
                    }
                    o9Var.f7518a = o17;
                }
                fTSEmojiDownloadedEvent.b(android.os.Looper.getMainLooper());
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiLogic", "somethings error.");
    }
}
