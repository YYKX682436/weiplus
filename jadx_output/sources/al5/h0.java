package al5;

/* loaded from: classes3.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.InsectLinearLayout f5919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5920e;

    public h0(com.tencent.mm.ui.widget.InsectLinearLayout insectLinearLayout, int i17) {
        this.f5919d = insectLinearLayout;
        this.f5920e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.InsectLinearLayout insectLinearLayout = this.f5919d;
        insectLinearLayout.setPadding(insectLinearLayout.getPaddingLeft(), insectLinearLayout.getPaddingTop(), insectLinearLayout.getPaddingRight(), this.f5920e);
        insectLinearLayout.requestLayout();
    }
}
