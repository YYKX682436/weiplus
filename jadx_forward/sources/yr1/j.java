package yr1;

/* loaded from: classes14.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9.C12995x6d6be93 f546177d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9.C12995x6d6be93 c12995x6d6be93) {
        this.f546177d = c12995x6d6be93;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window;
        android.app.Dialog m7393x15b1203e = this.f546177d.m7393x15b1203e();
        if (m7393x15b1203e == null || (window = m7393x15b1203e.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575680ff);
    }
}
