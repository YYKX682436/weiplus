package ss1;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13025x6878a547 f493434d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13025x6878a547 c13025x6878a547) {
        this.f493434d = c13025x6878a547;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f493434d.f176123i;
        if (c22624x85d69039 != null) {
            c22624x85d69039.requestLayout();
        }
    }
}
