package rk4;

/* loaded from: classes14.dex */
public final class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f f478632d;

    public y5(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f c18710x505d67f) {
        this.f478632d = c18710x505d67f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window;
        android.app.Dialog m7393x15b1203e = this.f478632d.m7393x15b1203e();
        if (m7393x15b1203e == null || (window = m7393x15b1203e.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575680ff);
    }
}
