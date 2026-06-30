package lx;

/* loaded from: classes11.dex */
public final class t4 implements rv.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f403485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403486c;

    public t4(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a, boolean z17, java.lang.ref.WeakReference weakReference) {
        this.f403484a = c10491x8102098a;
        this.f403485b = z17;
        this.f403486c = weakReference;
    }

    @Override // rv.e3
    public final void a(com.p314xaae8f345.p2845xc516c4b6.biz.C23225x7fed2801 c23225x7fed2801, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p2845xc516c4b6.biz.C23186xda420f98 c23186xda420f98;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f403484a.f146786d, "openPersonalCenterMiniAppPage receive publishCallback");
        if (!this.f403485b || (c23186xda420f98 = (com.p314xaae8f345.p2845xc516c4b6.biz.C23186xda420f98) this.f403486c.get()) == null) {
            return;
        }
        c23186xda420f98.m85210x44841f42(true, lx.s4.f403477d);
    }
}
