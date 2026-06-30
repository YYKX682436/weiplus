package lp4;

/* loaded from: classes10.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.d1 f401863d;

    public b1(lp4.d1 d1Var) {
        this.f401863d = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lp4.d1 d1Var = this.f401863d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = d1Var.f401872h;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        d1Var.f401872h = null;
    }
}
