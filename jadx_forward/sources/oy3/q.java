package oy3;

/* loaded from: classes13.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 f431572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431573e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4, java.lang.String str) {
        this.f431572d = activityC17256xc70b42d4;
        this.f431573e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = this.f431572d;
        android.widget.TextView textView = activityC17256xc70b42d4.f240125g;
        if (textView != null) {
            textView.setText(this.f431573e);
        }
        activityC17256xc70b42d4.A = true;
        activityC17256xc70b42d4.Z6();
    }
}
