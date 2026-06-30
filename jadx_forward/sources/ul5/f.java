package ul5;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.OverScroller f510163d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f510164e;

    /* renamed from: f, reason: collision with root package name */
    public int f510165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22715x5d5f7a08 f510166g;

    public f(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22715x5d5f7a08 c22715x5d5f7a08, android.widget.OverScroller mScroller, android.view.View target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mScroller, "mScroller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        this.f510166g = c22715x5d5f7a08;
        this.f510163d = mScroller;
        this.f510164e = target;
        this.f510165f = mScroller.getCurrX();
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.OverScroller overScroller = this.f510163d;
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        int currX = overScroller.getCurrX();
        int i17 = currX - this.f510165f;
        android.view.View view = this.f510164e;
        if ((view instanceof android.widget.AbsListView) || (view instanceof android.widget.ScrollView)) {
            if (ul5.y.f510199j) {
                overScroller.getCurrVelocity();
                ul5.c0.b(view);
                ul5.c0.a(view);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22715x5d5f7a08 c22715x5d5f7a08 = this.f510166g;
            if (!computeScrollOffset) {
                c22715x5d5f7a08.j(view, 1);
                return;
            }
            if (i17 < 0 && ul5.c0.b(view)) {
                c22715x5d5f7a08.g(view, i17, 1, new int[2]);
            } else if (i17 > 0 && ul5.c0.a(view)) {
                c22715x5d5f7a08.g(view, i17, 1, new int[2]);
            }
            this.f510165f = currX;
            c22715x5d5f7a08.postOnAnimation(this);
        }
    }
}
