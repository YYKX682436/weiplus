package dj3;

/* loaded from: classes14.dex */
public class m implements java.lang.Runnable {
    public m(dj3.n nVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().A()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
            if (Ri.S.f382766b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "no allow to show main ui");
                Ri.L();
                z17 = false;
            } else {
                z17 = true;
            }
            if (z17 && com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231709s == sj3.e4.Inviting) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkAppForegroundListener", "multitalk resume on app foreground");
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
                if (Ri2.f231718y0 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "on multitalk resume");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s1 s1Var = Ri2.f231718y0;
                    Ri2.e(s1Var.f231661a, s1Var.f231662b);
                    Ri2.L();
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkAppForegroundListener", "do not need resume multitalk ");
    }
}
