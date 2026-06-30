package lx;

/* loaded from: classes11.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23514x26e27c3a f403296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f403299h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f403300i;

    public g0(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23514x26e27c3a c23514x26e27c3a, java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f403295d = weakReference;
        this.f403296e = c23514x26e27c3a;
        this.f403297f = str;
        this.f403298g = str2;
        this.f403299h = i17;
        this.f403300i = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23455x62fab325 c23455x62fab325;
        com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10490x1fce892 c10490x1fce892 = (com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10490x1fce892) this.f403295d.get();
        if (c10490x1fce892 == null || (c23455x62fab325 = c10490x1fce892.f146779f) == null) {
            return;
        }
        java.lang.Long m86784xebddad52 = this.f403296e.m86784xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86784xebddad52);
        long longValue = m86784xebddad52.longValue();
        java.lang.String str = this.f403297f;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.f403298g;
        if (str2 == null) {
            str2 = "";
        }
        c23455x62fab325.m86501xaf8aa769(longValue, str, str2, this.f403299h, this.f403300i, lx.f0.f403285d);
    }
}
