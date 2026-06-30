package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes12.dex */
public final class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent event = (com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
        am.n9 n9Var = event.f54231g;
        emojiInfo.field_designerID = n9Var.f7407b;
        emojiInfo.field_name = n9Var.f7409d;
        emojiInfo.field_aeskey = n9Var.f7410e;
        emojiInfo.field_encrypturl = n9Var.f7411f;
        emojiInfo.field_thumbUrl = n9Var.f7408c;
        emojiInfo.field_md5 = n9Var.f7412g;
        emojiInfo.field_groupId = n9Var.f7413h;
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(emojiInfo.getMd5());
        int i17 = n9Var.f7406a;
        if (i17 != 3) {
            if (i17 != 1) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiLogic", "emoji download: %s", emojiInfo.getMd5());
            java.util.Set set = com.tencent.mm.plugin.emoji.model.b0.f97540a;
            kotlin.jvm.internal.o.d(set);
            java.lang.String md52 = emojiInfo.getMd5();
            kotlin.jvm.internal.o.f(md52, "getMd5(...)");
            set.add(md52);
            if (u17 == null) {
                emojiInfo.field_temp = 1;
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                com.tencent.mm.storage.n5.f().c().J0(emojiInfo);
            }
            zq.h.f474972a.e(emojiInfo, new com.tencent.mm.plugin.emoji.model.x(emojiInfo));
            return false;
        }
        java.lang.String N0 = emojiInfo.N0();
        am.o9 o9Var = event.f54232h;
        if (u17 == null || (u17.field_reserved4 & 1) != 1) {
            o9Var.f7518a = N0;
        } else {
            java.io.File cacheDir = com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir();
            java.lang.String md53 = n9Var.f7412g;
            kotlin.jvm.internal.o.f(md53, "md5");
            byte[] bytes = md53.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String o17 = new com.tencent.mm.vfs.r6(cacheDir, kk.k.g(bytes)).o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            if (com.tencent.mm.vfs.w6.j(N0) && !com.tencent.mm.vfs.w6.j(o17)) {
                com.tencent.mm.vfs.w6.a(o17, ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).E(u17));
            }
            o9Var.f7518a = o17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiLogic", "gen path: %s", o9Var.f7518a);
        return false;
    }
}
