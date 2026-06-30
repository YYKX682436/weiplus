package b50;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f99480e;

    public i(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, long j17) {
        this.f99479d = c10601x91d05935;
        this.f99480e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23472xcb4f1049 c23472xcb4f1049 = this.f99479d.f148598h;
        if (c23472xcb4f1049 != null) {
            c23472xcb4f1049.m86609xb1fb8cd2(this.f99480e, b50.h.f99477d);
        }
    }
}
