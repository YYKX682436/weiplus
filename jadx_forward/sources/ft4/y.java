package ft4;

/* loaded from: classes14.dex */
public final class y implements dt4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f348261a;

    public y(java.lang.ref.WeakReference weakReference) {
        this.f348261a = weakReference;
    }

    @Override // dt4.i
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "onInitComplete state:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f) this.f348261a.get();
        if (activityC19138xce65e38f != null) {
            if (i17 != 3) {
                if (i17 != 4) {
                    activityC19138xce65e38f.mo48627xce38d9a();
                    return;
                } else {
                    activityC19138xce65e38f.mo73913x2b33b77f();
                    return;
                }
            }
            activityC19138xce65e38f.mo48627xce38d9a();
            dt4.p pVar = activityC19138xce65e38f.f261977w;
            if (pVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
                throw null;
            }
            activityC19138xce65e38f.f261964g = pVar.i("", 0);
            dt4.p pVar2 = activityC19138xce65e38f.f261977w;
            if (pVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
                throw null;
            }
            int j17 = pVar2.j("");
            activityC19138xce65e38f.f261965h = j17;
            if (j17 > 0) {
                int i18 = (j17 / 100) * 100;
                int i19 = i18 + 1;
                activityC19138xce65e38f.f261962e = i19;
                java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.set(i19 / 10000, ((i19 % 10000) / 100) - 1, 1);
                activityC19138xce65e38f.f261963f = i18 + calendar.getActualMaximum(5);
            }
            activityC19138xce65e38f.X6(0);
        }
    }
}
