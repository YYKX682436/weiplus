package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes8.dex */
public class ai implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 f155262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11469xa6b63310 f155263b;

    public ai(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11469xa6b63310 activityC11469xa6b63310, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var) {
        this.f155263b = activityC11469xa6b63310;
        this.f155262a = u1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11469xa6b63310 activityC11469xa6b63310 = this.f155263b;
        activityC11469xa6b63310.mo48674x36654fab();
        this.f155262a.f293531c.dismiss();
        if (!z17) {
            activityC11469xa6b63310.finish();
            return;
        }
        r45.mz5 mz5Var = new r45.mz5();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = " ";
        }
        mz5Var.f462483d = str;
        mz5Var.f462486g = activityC11469xa6b63310.f155187d;
        mz5Var.f462487h = activityC11469xa6b63310.f155188e;
        mz5Var.f462485f = activityC11469xa6b63310.f155190g;
        mz5Var.f462484e = activityC11469xa6b63310.f155189f;
        gm0.j1.d().g(new v61.l0(mz5Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11469xa6b63310 activityC11469xa6b633102 = this.f155263b;
        activityC11469xa6b633102.f155192i = db5.e1.Q(activityC11469xa6b633102, "", "", false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.zh(this));
    }
}
