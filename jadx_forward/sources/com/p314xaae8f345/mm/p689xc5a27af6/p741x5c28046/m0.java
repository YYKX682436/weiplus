package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

@j95.b
/* loaded from: classes10.dex */
public final class m0 extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5 {
    public void Ai(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        zq.h hVar = zq.h.f556505a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiLoader", "removeTask: ".concat(key));
        er.f fVar = (er.f) zq.h.f556506b.remove(key);
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiLoader", "really removeTask: ".concat(key));
            fp0.o oVar = zq.h.f556507c;
            oVar.getClass();
            pm0.v.X(new fp0.l(oVar, fVar));
        }
    }

    public dr.j wi(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo, dr.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        return zq.h.f556505a.e((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) emojiInfo, qVar);
    }
}
