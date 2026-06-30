package jz0;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b f384147d;

    public p(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b c11022x6fd7187b) {
        this.f384147d = c11022x6fd7187b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b c11022x6fd7187b = this.f384147d;
        if (c11022x6fd7187b.m158354x19263085().isFinishing() || c11022x6fd7187b.m158354x19263085().isDestroyed()) {
            return;
        }
        c11022x6fd7187b.m158354x19263085().finish();
    }
}
