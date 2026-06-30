package z83;

/* loaded from: classes14.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 f552279d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e6) {
        this.f552279d = activityC16160x425523e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f552279d.f224683q;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
