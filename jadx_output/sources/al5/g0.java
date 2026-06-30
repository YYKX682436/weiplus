package al5;

/* loaded from: classes3.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.InsectFrameLayout f5911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5912e;

    public g0(com.tencent.mm.ui.widget.InsectFrameLayout insectFrameLayout, int i17) {
        this.f5911d = insectFrameLayout;
        this.f5912e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.InsectFrameLayout insectFrameLayout = this.f5911d;
        java.lang.String str = insectFrameLayout.f211272d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("InsectFrameLayout onLayout. bottomInsect=");
        int i17 = this.f5912e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        insectFrameLayout.setPadding(insectFrameLayout.getPaddingLeft(), insectFrameLayout.getPaddingTop(), insectFrameLayout.getPaddingRight(), i17);
        insectFrameLayout.requestLayout();
    }
}
