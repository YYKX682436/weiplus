package al5;

/* loaded from: classes3.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.InsectRelativeLayout f5925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5926e;

    public i0(com.tencent.mm.ui.widget.InsectRelativeLayout insectRelativeLayout, int i17) {
        this.f5925d = insectRelativeLayout;
        this.f5926e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.InsectRelativeLayout insectRelativeLayout = this.f5925d;
        insectRelativeLayout.setPadding(insectRelativeLayout.getPaddingLeft(), insectRelativeLayout.getPaddingTop(), insectRelativeLayout.getPaddingRight(), this.f5926e);
        insectRelativeLayout.requestLayout();
    }
}
