package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes8.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f260598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.s2 f260599e;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.s2 s2Var, boolean z17) {
        this.f260599e = s2Var;
        this.f260598d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.t2 t2Var = this.f260599e.f260603d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19055xad52aa6b activityC19055xad52aa6b = t2Var.f260614i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.t2 t2Var2 = activityC19055xad52aa6b.f260485r;
        if (t2Var2 == null) {
            return;
        }
        if (this.f260598d) {
            t2Var.f260613h = 2;
        } else {
            t2Var.f260613h = 1;
        }
        int i17 = t2Var2.f260613h;
        java.lang.String str = i17 == 0 ? t2Var2.f260609d : i17 == 1 ? t2Var2.f260610e : i17 == 3 ? null : t2Var2.f260611f;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            activityC19055xad52aa6b.f260478h.H(str);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC19055xad52aa6b.f260475e).notifyDataSetChanged();
    }
}
