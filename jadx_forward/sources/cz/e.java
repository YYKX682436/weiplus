package cz;

@j95.b
/* loaded from: classes7.dex */
public class e extends i95.w implements dz.i {
    public void Ai(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.s2 s2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.s2.INSTANCE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceServiceIsolated", "setWaitingVoipChat wait:%b", java.lang.Boolean.valueOf(z17));
        synchronized (s2Var) {
            s2Var.f177623e = z17;
        }
    }

    public boolean wi() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.s2 s2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.s2.INSTANCE;
        synchronized (s2Var) {
            z17 = s2Var.f177623e;
        }
        return z17;
    }
}
