package q12;

/* loaded from: classes12.dex */
public class y3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y3() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiStorageMgr", "RefreshSmileyPanelEvent was arrived before login, ignore it.");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStorageMgr", "REFRESH_PANEL_EVENT");
        gr.t g17 = gr.t.g();
        g17.l(true);
        g17.n(true);
        g17.m(true);
        return false;
    }
}
