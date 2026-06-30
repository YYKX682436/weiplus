package al5;

/* loaded from: classes3.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22610x2e037bd7 f87452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f87453e;

    public h0(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22610x2e037bd7 c22610x2e037bd7, int i17) {
        this.f87452d = c22610x2e037bd7;
        this.f87453e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22610x2e037bd7 c22610x2e037bd7 = this.f87452d;
        c22610x2e037bd7.setPadding(c22610x2e037bd7.getPaddingLeft(), c22610x2e037bd7.getPaddingTop(), c22610x2e037bd7.getPaddingRight(), this.f87453e);
        c22610x2e037bd7.requestLayout();
    }
}
