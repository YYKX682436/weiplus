package ex5;

/* loaded from: classes7.dex */
public class f implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.AbstractActivityC27751xff12907d f338783d;

    public f(com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.AbstractActivityC27751xff12907d abstractActivityC27751xff12907d) {
        this.f338783d = abstractActivityC27751xff12907d;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        android.view.View currentFocus;
        if (1 != i17 || (currentFocus = this.f338783d.getCurrentFocus()) == null) {
            return;
        }
        currentFocus.clearFocus();
    }
}
