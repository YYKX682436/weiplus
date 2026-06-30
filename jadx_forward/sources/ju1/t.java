package ju1;

/* loaded from: classes9.dex */
public final class t implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 f383327d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1) {
        this.f383327d = activityC13076xc17cada1;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ju1.o0 o0Var = (ju1.o0) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1.f176947s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1 = this.f383327d;
        activityC13076xc17cada1.getClass();
        if (o0Var != null) {
            int ordinal = o0Var.ordinal();
            boolean z17 = true;
            if (ordinal == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = activityC13076xc17cada1.f176949m;
                if (c12808x5de4409f != null) {
                    c12808x5de4409f.m1(true);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
                    throw null;
                }
            }
            if (ordinal == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f2 = activityC13076xc17cada1.f176949m;
                if (c12808x5de4409f2 != null) {
                    c12808x5de4409f2.m1(false);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
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
                lu1.a0.q(activityC13076xc17cada1.mo55332x76847179(), "");
            } else {
                lu1.a0.r(activityC13076xc17cada1.mo55332x76847179(), o0Var.f383315d);
            }
        }
    }
}
