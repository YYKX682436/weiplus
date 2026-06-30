package ch4;

/* loaded from: classes11.dex */
public class s extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public s() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6153x3e9dac5d c6153x3e9dac5d = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6153x3e9dac5d) abstractC20979x809547d1;
        if (!(c6153x3e9dac5d instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6153x3e9dac5d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.TalkRoomReportMgrListener", "mismatch %s", c6153x3e9dac5d.getClass().getName());
            return false;
        }
        if (!c6153x3e9dac5d.f136415g.f89025a) {
            return false;
        }
        dh4.l.Bi().f314132l = 1;
        return true;
    }
}
