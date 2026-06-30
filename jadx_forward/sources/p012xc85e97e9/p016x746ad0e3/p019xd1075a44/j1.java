package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class j1 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e f91149d;

    public j1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e) {
        this.f91149d = c0099x7ccac81e;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        if (i17 == 1) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e = this.f91149d;
            if ((c0099x7ccac81e.E.getInputMethodMode() == 2) || c0099x7ccac81e.E.getContentView() == null) {
                return;
            }
            android.os.Handler handler = c0099x7ccac81e.A;
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.l1 l1Var = c0099x7ccac81e.f90966w;
            handler.removeCallbacks(l1Var);
            l1Var.run();
        }
    }
}
