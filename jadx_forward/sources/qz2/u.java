package qz2;

/* loaded from: classes9.dex */
public class u implements pz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000 f449445d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000 activityC15524xc77ba000) {
        this.f449445d = activityC15524xc77ba000;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000 activityC15524xc77ba000 = this.f449445d;
        activityC15524xc77ba000.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qz2.v(activityC15524xc77ba000, false));
        if (i17 != 0) {
            activityC15524xc77ba000.U6(str, i17);
            return;
        }
        activityC15524xc77ba000.f218543f = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthUI", "hy: is screen on: %b", java.lang.Boolean.valueOf(!activityC15524xc77ba000.f218548n));
        if (true ^ activityC15524xc77ba000.f218548n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthUI", "request Identify2");
            activityC15524xc77ba000.f218546i.c(activityC15524xc77ba000.mo55332x76847179(), new qz2.w(activityC15524xc77ba000));
        }
    }
}
