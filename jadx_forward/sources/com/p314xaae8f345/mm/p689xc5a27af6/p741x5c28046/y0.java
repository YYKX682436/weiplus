package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

@j95.b
/* loaded from: classes12.dex */
public class y0 extends i95.w {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
        synchronized (f17.f276696a) {
            f17.c().add(f17.f276715t);
            f17.a().add(f17.f276714s);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai();
        if (com.p314xaae8f345.mm.vfs.w6.j(rr.s.f480682a.b())) {
            return;
        }
        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(37, 7);
        if (com.p314xaae8f345.mm.vfs.w6.j(Bi)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiResAnimPreInitService", "update emoji anim res from cache");
            y12.j e17 = y12.j.e();
            nr.g f18 = e17.f(y12.i.EMOJI_ANIM);
            f18.b(e17.a(Bi, "emoji_anim"));
            f18.f420579a.k();
        }
    }
}
