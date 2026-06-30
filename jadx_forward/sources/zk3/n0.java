package zk3;

/* loaded from: classes8.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31 f555015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f555016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f555017f;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31 c16620x3de5dd31, int i17, boolean z17) {
        this.f555015d = c16620x3de5dd31;
        this.f555016e = i17;
        this.f555017f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f555016e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31 c16620x3de5dd31 = this.f555015d;
        c16620x3de5dd31.f232128h = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16614x1b94bd28 c16614x1b94bd28 = c16620x3de5dd31.f232134q;
        if (c16614x1b94bd28 != null) {
            c16614x1b94bd28.f232112q = 0;
            c16614x1b94bd28.invalidate();
        }
        c16620x3de5dd31.n7();
        rk3.e eVar = c16620x3de5dd31.f232124d;
        if (eVar != null) {
            eVar.i(0, this.f555017f);
        }
        if (c16620x3de5dd31.m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c16620x3de5dd31.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo48674x36654fab();
        } else if (c16620x3de5dd31.m158354x19263085() instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = c16620x3de5dd31.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m158354x192630852).mo48674x36654fab();
        }
    }
}
