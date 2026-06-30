package b50;

/* loaded from: classes11.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5500xcde1614 f99520e;

    public t(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5500xcde1614 c5500xcde1614) {
        this.f99519d = c10601x91d05935;
        this.f99520e = c5500xcde1614;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23413x332f291 c23413x332f291 = this.f99519d.f148595e;
        if (c23413x332f291 != null) {
            java.lang.String liveId = this.f99520e.f135832g.f87975b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveId, "liveId");
            c23413x332f291.m86244xe370be53(liveId, b50.s.f99516d);
        }
    }
}
