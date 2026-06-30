package b50;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99473e;

    public f(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, java.lang.String str) {
        this.f99472d = c10601x91d05935;
        this.f99473e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23413x332f291 c23413x332f291 = this.f99472d.f148595e;
        if (c23413x332f291 != null) {
            java.lang.String cardId = this.f99473e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cardId, "$cardId");
            c23413x332f291.m86240x343e4b95(cardId, b50.e.f99469d);
        }
    }
}
