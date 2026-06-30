package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes10.dex */
public final class m0 extends i95.w implements com.tencent.mm.feature.emoji.api.w5 {
    public void Ai(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        zq.h hVar = zq.h.f474972a;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader", "removeTask: ".concat(key));
        er.f fVar = (er.f) zq.h.f474973b.remove(key);
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader", "really removeTask: ".concat(key));
            fp0.o oVar = zq.h.f474974c;
            oVar.getClass();
            pm0.v.X(new fp0.l(oVar, fVar));
        }
    }

    public dr.j wi(com.tencent.mm.api.IEmojiInfo emojiInfo, dr.q qVar) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        return zq.h.f474972a.e((com.tencent.mm.storage.emotion.EmojiInfo) emojiInfo, qVar);
    }
}
