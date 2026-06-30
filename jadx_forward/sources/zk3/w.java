package zk3;

/* loaded from: classes5.dex */
public final class w implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f555049d;

    public w(zk3.g0 g0Var) {
        this.f555049d = g0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16615x299ce7dc c16615x299ce7dc = this.f555049d.f554988m;
        if (c16615x299ce7dc != null && (viewTreeObserver = c16615x299ce7dc.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new zk3.v(this.f555049d));
    }
}
