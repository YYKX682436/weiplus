package wl3;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16637xca0f8dc2 f528587d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16637xca0f8dc2 c16637xca0f8dc2) {
        this.f528587d = c16637xca0f8dc2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16637xca0f8dc2 c16637xca0f8dc2 = this.f528587d;
        int i17 = c16637xca0f8dc2.f232345m;
        int i18 = c16637xca0f8dc2.f232346n;
        int i19 = c16637xca0f8dc2.f232347o;
        c16637xca0f8dc2.f232342g.startScroll(c16637xca0f8dc2.f232345m, 0, c16637xca0f8dc2.f232346n, 0, c16637xca0f8dc2.f232347o);
        c16637xca0f8dc2.invalidate();
    }
}
