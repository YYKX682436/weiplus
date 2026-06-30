package fo0;

/* loaded from: classes14.dex */
public final class j extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo0.n f346347a;

    public j(fo0.n nVar) {
        this.f346347a = nVar;
    }

    @Override // gp1.a0, gp1.z
    public void F0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreMini", "onFloatBallInfoReplaced replacedBallInfo: " + c12886x91aa2b6d + " targetBallInfo: " + c12886x91aa2b6d2);
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a abstractC10841x92aba21a = this.f346347a.f346357h;
        if (abstractC10841x92aba21a != null) {
            abstractC10841x92aba21a.d();
        }
    }

    @Override // gp1.a0, gp1.z
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreMini", "onFloatBallInfoRemoved ballInfo: " + c12886x91aa2b6d);
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreMini", "onFloatBallDeleteButtonClick ballInfo: " + c12886x91aa2b6d);
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a abstractC10841x92aba21a = this.f346347a.f346357h;
        if (abstractC10841x92aba21a != null) {
            abstractC10841x92aba21a.d();
        }
    }

    @Override // gp1.a0, gp1.z
    public void S(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreMini", "onFloatBallCollapseStateChanged ballInfo: " + c12886x91aa2b6d + " oldCollapseState: " + i17 + " newCollapseState: " + i18 + " collapseReason: " + i19 + " expandReason: " + i27);
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo2;
        fo0.n nVar = this.f346347a;
        fo0.b d17 = nVar.f346353d.d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallPlayButtonClick ballInfo: ");
        sb6.append((c12886x91aa2b6d == null || (ballButtonInfo2 = c12886x91aa2b6d.f174587o) == null) ? null : java.lang.Boolean.valueOf(ballButtonInfo2.f174602d));
        sb6.append(" player: ");
        sb6.append(d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreMini", sb6.toString());
        boolean z17 = false;
        if ((c12886x91aa2b6d == null || (ballButtonInfo = c12886x91aa2b6d.f174587o) == null || ballButtonInfo.f174602d) ? false : true) {
            if (d17 != null) {
                d17.a1();
            }
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a abstractC10841x92aba21a = nVar.f346357h;
            if (abstractC10841x92aba21a != null) {
                abstractC10841x92aba21a.e(false);
                return;
            }
            return;
        }
        if (d17 != null && !d17.mo15380xc00617a4()) {
            z17 = true;
        }
        if (z17) {
            if (d17 != null) {
                d17.u();
            }
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a abstractC10841x92aba21a2 = nVar.f346357h;
            if (abstractC10841x92aba21a2 != null) {
                abstractC10841x92aba21a2.e(true);
            }
        }
    }

    @Override // gp1.a0, gp1.z
    public void X0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreMini", "onFloatBallInfoAdded ballInfo: " + c12886x91aa2b6d);
    }
}
