package cr;

/* loaded from: classes12.dex */
public final class g {
    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, yz5.l lVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.f68686x7b284d5e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverFetcher", "loadDataImp: load by gif " + c21053xdbf1e5f4.mo42933xb5885648());
            zq.h.f556505a.f(c21053xdbf1e5f4, false, new cr.f(c21053xdbf1e5f4, lVar));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverFetcher", "loadDataImp: load by url " + c21053xdbf1e5f4.mo42933xb5885648());
        q11.b b17 = new r12.b().b(c21053xdbf1e5f4.f68686x7b284d5e);
        if ((b17 != null ? b17.f441066c : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverFetcher", "loadDataImp: thumbUrl download failed, fallback to loadFile " + c21053xdbf1e5f4.mo42933xb5885648());
            zq.h.f556505a.f(c21053xdbf1e5f4, false, new cr.f(c21053xdbf1e5f4, lVar));
            return;
        }
        ar.c.f94889a.b(c21053xdbf1e5f4.mo42933xb5885648(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(b17.f441066c));
        com.p314xaae8f345.mm.vfs.w6.R(c21053xdbf1e5f4.h0(), b17.f441066c);
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
    }
}
