package ju1;

/* loaded from: classes9.dex */
public final class y0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 f383337d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76) {
        this.f383337d = activityC13077xb3b83e76;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ju1.o0 o0Var = (ju1.o0) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76.f176955r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76 = this.f383337d;
        activityC13077xb3b83e76.getClass();
        if (o0Var != null) {
            int ordinal = o0Var.ordinal();
            boolean z17 = true;
            if (ordinal == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = activityC13077xb3b83e76.f176956i;
                if (c12808x5de4409f != null) {
                    c12808x5de4409f.m1(true);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListRv");
                    throw null;
                }
            }
            if (ordinal == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f2 = activityC13077xb3b83e76.f176956i;
                if (c12808x5de4409f2 != null) {
                    c12808x5de4409f2.m1(false);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListRv");
                    throw null;
                }
            }
            if (ordinal != 5) {
                return;
            }
            java.lang.String str = o0Var.f383315d;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                lu1.a0.q(activityC13077xb3b83e76.mo55332x76847179(), "");
            } else {
                lu1.a0.r(activityC13077xb3b83e76.mo55332x76847179(), o0Var.f383315d);
            }
        }
    }
}
