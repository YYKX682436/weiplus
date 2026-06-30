package bk2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f21368a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f21369b;

    /* renamed from: c, reason: collision with root package name */
    public int f21370c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f21371d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f21372e;

    public c(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store, gk2.e buContext) {
        kotlin.jvm.internal.o.g(store, "store");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f21368a = store;
        this.f21369b = buContext;
        this.f21371d = "";
        this.f21372e = new com.tencent.mm.sdk.platformtools.b4("LiveMiltstoneBubble::Timer", (com.tencent.mm.sdk.platformtools.a4) new bk2.b(this), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r45.f02 r13) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk2.c.a(r45.f02):void");
    }

    public final void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MilestoneDistractManager", str + ":endTimer remainTimeSecond:" + this.f21370c + ", timerLotteryId:" + this.f21371d);
        this.f21372e.d();
    }

    public final void c(int i17) {
        b("onTimerEnd remainTimeSecond: " + i17);
        gk2.e eVar = this.f21369b;
        mm2.r4 P6 = ((mm2.v4) eVar.a(mm2.v4.class)).P6();
        if (P6 != null && P6.f329376a == 1) {
            mm2.r4 P62 = ((mm2.v4) eVar.a(mm2.v4.class)).P6();
            if (P62 != null) {
                P62.f329376a = 2;
            }
            mm2.r4 P63 = ((mm2.v4) eVar.a(mm2.v4.class)).P6();
            if (P63 != null) {
                mf2.p.a(this.f21368a, P63, true, false, false);
            }
        }
    }
}
