package lx;

/* loaded from: classes11.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23514x26e27c3a f403326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f403328g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f403329h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f403330i;

    public i0(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23514x26e27c3a c23514x26e27c3a, java.lang.String str, int i17, int i18, int i19) {
        this.f403325d = weakReference;
        this.f403326e = c23514x26e27c3a;
        this.f403327f = str;
        this.f403328g = i17;
        this.f403329h = i18;
        this.f403330i = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23455x62fab325 c23455x62fab325;
        com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10490x1fce892 c10490x1fce892 = (com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10490x1fce892) this.f403325d.get();
        if (c10490x1fce892 == null || (c23455x62fab325 = c10490x1fce892.f146779f) == null) {
            return;
        }
        java.lang.Long m86784xebddad52 = this.f403326e.m86784xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86784xebddad52);
        long longValue = m86784xebddad52.longValue();
        java.lang.String str = this.f403327f;
        if (str == null) {
            str = "";
        }
        c23455x62fab325.m86502xe5a8c2b1(longValue, str, this.f403328g, this.f403329h, this.f403330i, lx.h0.f403312d);
    }
}
