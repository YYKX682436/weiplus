package e04;

/* loaded from: classes15.dex */
public final class o2 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public boolean f327570d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r f327571e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s f327572f;

    /* renamed from: g, reason: collision with root package name */
    public final e04.m2 f327573g;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s sVar, e04.m2 m2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r rVar) {
        this.f327572f = sVar;
        this.f327573g = m2Var;
        this.f327571e = rVar;
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        boolean cancel = super.cancel();
        this.f327570d = true;
        e04.m2 m2Var = this.f327573g;
        if (m2Var != null) {
            m2Var.mo126560xb349b3ab();
        }
        return cancel;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new e04.n2(this));
    }
}
