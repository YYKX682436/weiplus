package ul5;

/* loaded from: classes15.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.OverScroller f510200d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f510201e;

    /* renamed from: f, reason: collision with root package name */
    public int f510202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4 f510203g;

    public z(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4 c22717x128919c4, android.widget.OverScroller mScroller, android.view.View target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mScroller, "mScroller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        this.f510203g = c22717x128919c4;
        this.f510200d = mScroller;
        this.f510201e = target;
        this.f510202f = mScroller.getCurrY();
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.OverScroller overScroller = this.f510200d;
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i17 = currY - this.f510202f;
        android.view.View view = this.f510201e;
        if ((view instanceof android.widget.AbsListView) || (view instanceof android.widget.ScrollView)) {
            if (ul5.y.f510199j) {
                overScroller.getCurrVelocity();
                ul5.c0.b(view);
                ul5.c0.a(view);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4 c22717x128919c4 = this.f510203g;
            if (!computeScrollOffset) {
                c22717x128919c4.j(view, 1);
                return;
            }
            if (i17 < 0 && ul5.c0.b(view)) {
                c22717x128919c4.m(view, i17, 1, new int[2]);
            } else if (i17 > 0 && ul5.c0.a(view)) {
                c22717x128919c4.m(view, i17, 1, new int[2]);
            }
            this.f510202f = currY;
            c22717x128919c4.postOnAnimation(this);
        }
    }
}
