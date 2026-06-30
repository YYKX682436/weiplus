package zx;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10502x33f3d43f f558488d;

    public k(com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10502x33f3d43f c10502x33f3d43f) {
        this.f558488d = c10502x33f3d43f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10502x33f3d43f c10502x33f3d43f = this.f558488d;
        if (c10502x33f3d43f.f146840s) {
            if (c10502x33f3d43f.f146838q || c10502x33f3d43f.f146839r) {
                c10502x33f3d43f.postOnAnimation(this);
            } else {
                c10502x33f3d43f.postDelayed(new zx.j(c10502x33f3d43f), c10502x33f3d43f.getIntervalAfterRound());
            }
        }
    }
}
