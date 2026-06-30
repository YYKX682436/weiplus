package lx;

/* loaded from: classes11.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403245e;

    public c3(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a, java.lang.String str) {
        this.f403244d = c10491x8102098a;
        this.f403245e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23413x332f291 c23413x332f291 = this.f403244d.f146787e;
        if (c23413x332f291 != null) {
            java.lang.String cardId = this.f403245e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cardId, "$cardId");
            c23413x332f291.m86240x343e4b95(cardId, lx.b3.f403232d);
        }
    }
}
