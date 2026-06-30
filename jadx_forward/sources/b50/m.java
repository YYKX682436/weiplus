package b50;

/* loaded from: classes11.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f99493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f99494f;

    public m(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, long j17, int i17) {
        this.f99492d = c10601x91d05935;
        this.f99493e = j17;
        this.f99494f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23472xcb4f1049 c23472xcb4f1049 = this.f99492d.f148598h;
        if (c23472xcb4f1049 != null) {
            long j17 = this.f99493e;
            int i17 = this.f99494f;
            c23472xcb4f1049.m86608x44e9ad4b(j17, i17 == 0, i17, b50.l.f99489d);
        }
    }
}
