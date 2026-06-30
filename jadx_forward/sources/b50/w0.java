package b50;

/* loaded from: classes11.dex */
public final class w0 implements rv.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f99529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f99530c;

    public w0(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, boolean z17, java.lang.ref.WeakReference weakReference) {
        this.f99528a = c10601x91d05935;
        this.f99529b = z17;
        this.f99530c = weakReference;
    }

    @Override // rv.e3
    public final void a(com.p314xaae8f345.p2845xc516c4b6.biz.C23225x7fed2801 c23225x7fed2801, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p2845xc516c4b6.biz.C23186xda420f98 c23186xda420f98;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f99528a.f148594d, "openPersonalCenterMiniAppPage receive publishCallback");
        if (!this.f99529b || (c23186xda420f98 = (com.p314xaae8f345.p2845xc516c4b6.biz.C23186xda420f98) this.f99530c.get()) == null) {
            return;
        }
        c23186xda420f98.m85210x44841f42(true, b50.v0.f99526d);
    }
}
