package androidx.slidingpanelayout.widget;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f12350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.slidingpanelayout.widget.SlidingPaneLayout f12351e;

    public b(androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout, android.view.View view) {
        this.f12351e = slidingPaneLayout;
        this.f12350d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f12350d;
        android.view.ViewParent parent = view.getParent();
        androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = this.f12351e;
        if (parent == slidingPaneLayout) {
            view.setLayerType(0, null);
            slidingPaneLayout.getClass();
            android.graphics.Paint paint = ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).f12346d;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.v0.i(view, paint);
        }
        slidingPaneLayout.f12341y.remove(this);
    }
}
