package kp1;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6 f392431d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6 abstractC12879x228c0db6) {
        this.f392431d = abstractC12879x228c0db6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView recentDescTextView = this.f392431d.getRecentDescTextView();
        if (recentDescTextView == null) {
            return;
        }
        recentDescTextView.setSelected(true);
    }
}
