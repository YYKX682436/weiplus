package rg5;

/* loaded from: classes8.dex */
public final class k implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rg5.o f476790d;

    public k(rg5.o oVar) {
        this.f476790d = oVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.xs2 xs2Var;
        r45.xs2 xs2Var2;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        rg5.o oVar = this.f476790d;
        com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512 = oVar.f476803j;
        if (c21363x65d29512 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot return for null");
            return;
        }
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = oVar.f476795b;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = c21357x5e7365bb.f278189w;
        if (h0Var != null && !h0Var.q(oVar.b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot return for not show ".concat(oVar.b()));
            return;
        }
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot preference:" + c21363x65d29512 + ' ' + c21363x65d29512.hashCode() + " return for result null");
            return;
        }
        if (!((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot return for isEnableFindLive");
            return;
        }
        r45.f03 f03Var = aVar.f186861b;
        if (f03Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot info is null");
            return;
        }
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderLiveEntrance");
        if (I0 == null || (i17 = I0.f455420d) <= 0 || i17 == 6) {
            I0 = null;
        }
        boolean E = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().E();
        boolean z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = aVar.f186862c;
        boolean z18 = aVar.f186860a;
        if (!z18 || f03Var.f455421e <= 0) {
            if (I0 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot return for isShow false remain liveEntranceTipsInfo");
                com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb2 = oVar.f476795b;
                if (jbVar != null && (xs2Var = jbVar.N) != null && xs2Var.m75939xb282bd08(19) == 1) {
                    z17 = true;
                }
                c21357x5e7365bb2.z0(I0, c21363x65d29512, false, E, z17, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot return for isShow clear mention");
                c21363x65d29512.Z3(false, new r45.pm6());
            }
            oVar.i();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot return for isShow:" + z18 + ", count:" + f03Var.f455421e);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot: [onChanged] preference=" + c21363x65d29512 + ' ' + c21363x65d29512.hashCode() + ", isInFinderEntrance=" + c21357x5e7365bb.F + ", result=" + aVar);
        android.view.View view = c21363x65d29512.Z1;
        if (view != null) {
            view.setContentDescription(oVar.f476794a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcl));
        }
        if (I0 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot with live entrance red dot");
            com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb3 = oVar.f476795b;
            if (jbVar != null && (xs2Var2 = jbVar.N) != null && xs2Var2.m75939xb282bd08(19) == 1) {
                z17 = true;
            }
            c21357x5e7365bb3.z0(I0, c21363x65d29512, false, E, z17, f03Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot only show live mention red dot");
            r45.pm6 pm6Var = new r45.pm6();
            pm6Var.f464719d = f03Var.f455421e;
            c21363x65d29512.Z3(true, pm6Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot currentTabIndex: " + com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78442x336b58a0());
        if (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78442x336b58a0() == 2) {
            rg5.g[] gVarArr = rg5.g.f476786d;
            oVar.h(1);
        }
    }
}
