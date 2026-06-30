package al5;

/* loaded from: classes3.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22611x654ca43e f87458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f87459e;

    public i0(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22611x654ca43e c22611x654ca43e, int i17) {
        this.f87458d = c22611x654ca43e;
        this.f87459e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22611x654ca43e c22611x654ca43e = this.f87458d;
        c22611x654ca43e.setPadding(c22611x654ca43e.getPaddingLeft(), c22611x654ca43e.getPaddingTop(), c22611x654ca43e.getPaddingRight(), this.f87459e);
        c22611x654ca43e.requestLayout();
    }
}
