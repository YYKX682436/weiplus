package y35;

/* loaded from: classes11.dex */
public class l implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19704xf24fb064 f540759d;

    public l(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19704xf24fb064 c19704xf24fb064) {
        this.f540759d = c19704xf24fb064;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        long j17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19704xf24fb064 c19704xf24fb064 = this.f540759d;
        if (c19704xf24fb064.f272602o) {
            return;
        }
        c19704xf24fb064.getClass();
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageListView", "updateLbs, id is null");
            return;
        }
        try {
            j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str, 0L);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageListView", "updateLbs, id = " + str + ", ex = " + e17.getMessage());
            j17 = 0L;
        }
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageListView", "updateLbs fail, sysRowId is invalid");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = new com.p314xaae8f345.mm.p2621x8fb0427b.t8();
        if (!r21.w.Bi().get(j17, t8Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageListView", "updateLbs, get fail, id = " + j17);
            return;
        }
        y35.j jVar = c19704xf24fb064.f272598h;
        if (jVar == null || !jVar.f540752a.equals(t8Var.f66514x49f69af2)) {
            return;
        }
        java.lang.String str2 = c19704xf24fb064.f272598h.f540754c;
        if (str2 != null && str2.length() > 0) {
            c19704xf24fb064.setVisibility(0);
        }
        c19704xf24fb064.a(y35.r.e(c19704xf24fb064.f272597g, t8Var));
    }
}
