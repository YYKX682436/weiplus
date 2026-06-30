package pk2;

/* loaded from: classes3.dex */
public final class f7 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 {

    /* renamed from: q2, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 f437278q2;

    /* renamed from: r2, reason: collision with root package name */
    public java.lang.Object f437279r2;

    public f7(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        this.f293397i.setOnDismissListener(new pk2.d7(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0
    public void p(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 c1Var) {
        this.f437278q2 = c1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0
    public void v() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.v();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMMBottomSheet", "start openPanel");
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).oj(this);
        android.view.View view = this.S;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new pk2.e7(this));
    }
}
