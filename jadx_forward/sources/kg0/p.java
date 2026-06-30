package kg0;

@j95.b
/* loaded from: classes14.dex */
public class p extends i95.w implements lg0.m {
    public void Ai() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
        Bi.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipService", "onForegroundServiceStart");
        dr4.p1 p1Var = Bi.E;
        if (p1Var == null || !Bi.f258108r) {
            return;
        }
        if (!p1Var.f324236b && !p1Var.f324252r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "onCameraAllowLaunch succ ");
            p1Var.f324236b = true;
            p1Var.m();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "onCameraAllowLaunch failed " + p1Var.f324236b + " and " + p1Var.f324252r + ' ');
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
    }

    public java.lang.String wi(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s1.f258331a.c(sb6, 112, i17);
        return sb6.toString();
    }
}
