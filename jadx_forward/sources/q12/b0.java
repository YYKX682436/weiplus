package q12;

/* loaded from: classes5.dex */
public class b0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public b0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f c5945xdd67bc5f = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f) abstractC20979x809547d1;
        if (!(c5945xdd67bc5f instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f)) {
            return false;
        }
        if (c5945xdd67bc5f.f136246g.f87927a != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiRevokeMsgListener", "has handle in sys cmd msg extension.");
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0 b0Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class);
        am.cs csVar = c5945xdd67bc5f.f136246g;
        long j17 = csVar.f87931e;
        b0Var.f147705g.put(java.lang.Long.valueOf(j17), csVar.f87928b);
        return false;
    }
}
