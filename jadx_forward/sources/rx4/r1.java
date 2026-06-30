package rx4;

/* loaded from: classes8.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f482791d;

    public r1(rx4.h2 h2Var) {
        this.f482791d = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rx4.h2 h2Var = this.f482791d;
        if (h2Var.m158354x19263085().isDestroyed() || h2Var.m158354x19263085().isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h2Var.f482698d, "hitest parallel mode, activity destroyed, skip initial request");
            return;
        }
        h2Var.c7(java.lang.System.currentTimeMillis() + "_native", true);
        h2Var.b7();
    }
}
