package lx;

/* loaded from: classes11.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23514x26e27c3a f403524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f403526g;

    public w0(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23514x26e27c3a c23514x26e27c3a, java.lang.String str, java.lang.Boolean bool) {
        this.f403523d = weakReference;
        this.f403524e = c23514x26e27c3a;
        this.f403525f = str;
        this.f403526g = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23455x62fab325 c23455x62fab325;
        com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10490x1fce892 c10490x1fce892 = (com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10490x1fce892) this.f403523d.get();
        if (c10490x1fce892 == null || (c23455x62fab325 = c10490x1fce892.f146779f) == null) {
            return;
        }
        java.lang.Long m86784xebddad52 = this.f403524e.m86784xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86784xebddad52);
        long longValue = m86784xebddad52.longValue();
        java.lang.String str = this.f403525f;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        java.lang.Boolean bool = this.f403526g;
        c23455x62fab325.m86509xaf06b4d1(longValue, str2, bool != null ? bool.booleanValue() : false, lx.v0.f403508d);
    }
}
