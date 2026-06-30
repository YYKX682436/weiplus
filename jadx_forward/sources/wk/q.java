package wk;

/* loaded from: classes12.dex */
public class q extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public q() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5403xedb7e971 c5403xedb7e971 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5403xedb7e971) abstractC20979x809547d1;
        if (w21.p0.Di() == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SubCoreVoice.getVoiceStg() == null");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtVoiceFileNameToMsgId", sb6.toString());
        }
        w21.w0 z07 = w21.p0.Di().z0(c5403xedb7e971.f135748g.f89900a);
        if (z07 == null) {
            return true;
        }
        c5403xedb7e971.f135749h.f89976a = z07.f524029m;
        return true;
    }
}
