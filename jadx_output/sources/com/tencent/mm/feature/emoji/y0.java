package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes12.dex */
public class y0 extends i95.w {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mm.storage.n5 f17 = com.tencent.mm.storage.n5.f();
        synchronized (f17.f195163a) {
            f17.c().add(f17.f195182t);
            f17.a().add(f17.f195181s);
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai();
        if (com.tencent.mm.vfs.w6.j(rr.s.f399149a.b())) {
            return;
        }
        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(37, 7);
        if (com.tencent.mm.vfs.w6.j(Bi)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiResAnimPreInitService", "update emoji anim res from cache");
            y12.j e17 = y12.j.e();
            nr.g f18 = e17.f(y12.i.EMOJI_ANIM);
            f18.b(e17.a(Bi, "emoji_anim"));
            f18.f339046a.k();
        }
    }
}
