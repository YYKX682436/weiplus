package zw1;

/* loaded from: classes15.dex */
public class x1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558375a;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7) {
        this.f558375a = activityC13144xce1cfbb7;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = this.f558375a;
        if (activityC13144xce1cfbb7.isFinishing() || activityC13144xce1cfbb7.isDestroyed()) {
            return null;
        }
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13144xce1cfbb7.mo55332x76847179());
            u1Var.u(fVar.f152150c);
            u1Var.b(new zw1.w1(this));
            u1Var.q(false);
            return java.lang.Boolean.FALSE;
        }
        r45.jx jxVar = (r45.jx) fVar.f152151d;
        java.lang.String str = jxVar.f459712d;
        java.lang.String str2 = jxVar.f459713e;
        int i17 = jxVar.f459714f;
        if (activityC13144xce1cfbb7.V) {
            activityC13144xce1cfbb7.P = str;
        } else {
            activityC13144xce1cfbb7.L = str;
        }
        activityC13144xce1cfbb7.M = str2;
        activityC13144xce1cfbb7.Q = i17;
        activityC13144xce1cfbb7.p7();
        activityC13144xce1cfbb7.V1 = ((r45.jx) fVar.f152151d).f459715g;
        activityC13144xce1cfbb7.c7(null, null);
        activityC13144xce1cfbb7.e7(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13944, 5);
        activityC13144xce1cfbb7.T1 = false;
        return java.lang.Boolean.TRUE;
    }
}
