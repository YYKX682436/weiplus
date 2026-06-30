package lx;

/* loaded from: classes11.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f403221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f403222f;

    public a4(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a, int i17, java.util.List list) {
        this.f403220d = c10491x8102098a;
        this.f403221e = i17;
        this.f403222f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a = this.f403220d;
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23413x332f291 c23413x332f291 = c10491x8102098a.f146787e;
        if (c23413x332f291 != null) {
            int i17 = this.f403221e;
            c23413x332f291.m86241x98f37bd(i17, this.f403222f, new lx.z3(c10491x8102098a, i17));
        }
    }
}
