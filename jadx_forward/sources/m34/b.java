package m34;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10 f404881d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10 c17688x1a8cfd10) {
        this.f404881d = c17688x1a8cfd10;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10 c17688x1a8cfd10 = this.f404881d;
        int paddingLeft = (((android.widget.FrameLayout.LayoutParams) c17688x1a8cfd10.f244007g.getLayoutParams()).leftMargin - c17688x1a8cfd10.f244008h.getPaddingLeft()) - (((c17688x1a8cfd10.mo69279x5853ad3() - c17688x1a8cfd10.f244008h.getPaddingLeft()) - c17688x1a8cfd10.f244008h.getPaddingRight()) / 2);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c17688x1a8cfd10.f244008h.getLayoutParams();
        layoutParams.leftMargin = paddingLeft;
        c17688x1a8cfd10.f244008h.setLayoutParams(layoutParams);
    }
}
