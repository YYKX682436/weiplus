package wx;

/* loaded from: classes14.dex */
public final class o implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q0, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final wx.o f531957a = new wx.o();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f531958b;

    private o() {
    }

    public final synchronized void a() {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotIamCoreCenter", "registerAff: account not ready, skip. stack:\n" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        if (!f531958b) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l1.f297883a = wx.j.f531948a;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a1.f297600a = new wx.k(this);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w0 w0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w0.f298051b;
            w0Var.a(new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.p0(this), wx.l.f531951a);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2517x2c0e0b6f.C19977x7f5d5cf8()) == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotIamCoreCenter", "onceRegister fetchChatBotRoomInfoAsync");
                w0Var.c(wx.m.f531954a);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotIamCoreCenter", "onceRegister over");
            f531958b = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotIamCoreCenter", "registerAff result:" + f531958b);
    }

    public final synchronized void b() {
        if (f531958b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotIamCoreCenter", "releaseAffAsync");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w0.f298051b.f(wx.n.f531955a);
            hy.b0.f367261a.b();
        }
        f531958b = false;
    }
}
