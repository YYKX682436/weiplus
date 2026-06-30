package q12;

/* loaded from: classes12.dex */
public class s3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public s3() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5701xe3413c8c c5701xe3413c8c = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5701xe3413c8c) abstractC20979x809547d1;
        if (c5701xe3413c8c == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiEvent", "manualAuthEventListener callback");
        if (!c5701xe3413c8c.f136023g.f88961a) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        c17.x(u3Var, bool);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN, bool);
        return false;
    }
}
