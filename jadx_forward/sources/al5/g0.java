package al5;

/* loaded from: classes3.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22609x6e7a10cf f87444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f87445e;

    public g0(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22609x6e7a10cf c22609x6e7a10cf, int i17) {
        this.f87444d = c22609x6e7a10cf;
        this.f87445e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22609x6e7a10cf c22609x6e7a10cf = this.f87444d;
        java.lang.String str = c22609x6e7a10cf.f292805d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("InsectFrameLayout onLayout. bottomInsect=");
        int i17 = this.f87445e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        c22609x6e7a10cf.setPadding(c22609x6e7a10cf.getPaddingLeft(), c22609x6e7a10cf.getPaddingTop(), c22609x6e7a10cf.getPaddingRight(), i17);
        c22609x6e7a10cf.requestLayout();
    }
}
