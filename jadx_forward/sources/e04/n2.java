package e04;

/* loaded from: classes15.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e04.o2 f327564d;

    public n2(e04.o2 o2Var) {
        this.f327564d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e04.o2 o2Var = this.f327564d;
        boolean z17 = o2Var.f327570d;
        if (o2Var.f327570d) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s sVar = o2Var.f327572f;
        if (sVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) sVar).u7(true, true, o2Var.f327571e);
        }
        e04.m2 m2Var = o2Var.f327573g;
        if (m2Var != null) {
            m2Var.mo126561xc39f557c();
        }
    }
}
