package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class j1 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ListPopupWindow f9616d;

    public j1(androidx.appcompat.widget.ListPopupWindow listPopupWindow) {
        this.f9616d = listPopupWindow;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        if (i17 == 1) {
            androidx.appcompat.widget.ListPopupWindow listPopupWindow = this.f9616d;
            if ((listPopupWindow.E.getInputMethodMode() == 2) || listPopupWindow.E.getContentView() == null) {
                return;
            }
            android.os.Handler handler = listPopupWindow.A;
            androidx.appcompat.widget.l1 l1Var = listPopupWindow.f9433w;
            handler.removeCallbacks(l1Var);
            l1Var.run();
        }
    }
}
