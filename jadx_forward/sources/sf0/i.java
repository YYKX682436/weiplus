package sf0;

/* loaded from: classes11.dex */
public class i implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof wn4.y) {
            tn4.o oVar = (tn4.o) i95.n0.c(tn4.o.class);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = oVar.f502377m;
            if (u3Var != null) {
                u3Var.dismiss();
                oVar.f502377m = null;
            }
            wn4.y yVar = (wn4.y) m1Var;
            if (yVar.f529109d == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "is ConstantsUpdater.Source.Setting_check");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = (com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb) yVar.f529113h;
            com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb g17 = y73.p.g();
            if (g17 != null && ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Ri(g17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "hardCodeMMdiffResponeForTest responseTmp is no null");
                c16114x800e8cdb = g17;
            }
            ((qf0.q) ((rf0.o) i95.n0.c(rf0.o.class))).getClass();
            oq1.n h17 = y73.p.h(c16114x800e8cdb, false);
            if ((h17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb) && ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Ri(g17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 39L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "hardCodeXkeyMMdiffResponeForReddot responseTmp is no null");
                c16114x800e8cdb = (com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb) h17;
            }
            ((tn4.o) i95.n0.c(tn4.o.class)).fj(c16114x800e8cdb, yVar.f529109d, false);
        }
    }
}
