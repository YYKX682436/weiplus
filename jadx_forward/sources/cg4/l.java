package cg4;

/* loaded from: classes9.dex */
public class l extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public l() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5406xef2778d5 c5406xef2778d5 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5406xef2778d5) abstractC20979x809547d1;
        if (c5406xef2778d5 == null) {
            return false;
        }
        am.c9 c9Var = c5406xef2778d5.f135753g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c9Var.f87872a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceTransformResultClickEventListener", "fileName is null");
            return false;
        }
        w21.w0 y07 = w21.p0.Di().y0(c9Var.f87872a);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceTransformResultClickEventListener", "voiceInfo is null");
            return false;
        }
        cg4.k.a(y07.f524020d, 0, 0, 0, c9Var.f87873b, y07.f524028l);
        return true;
    }
}
