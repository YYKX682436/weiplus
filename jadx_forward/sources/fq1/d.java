package fq1;

/* loaded from: classes8.dex */
public final class d implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f347038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f347039e;

    public d(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, int i17) {
        this.f347038d = c22624x85d69039;
        this.f347039e = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f347038d;
        android.view.ViewTreeObserver viewTreeObserver = c22624x85d69039.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        c22624x85d69039.post(new fq1.c(this.f347039e, c22624x85d69039));
        return true;
    }
}
