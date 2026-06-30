package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes7.dex */
public final class u9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9 f281592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281593f;

    public u9(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9 w9Var, java.lang.String str) {
        this.f281591d = f9Var;
        this.f281592e = w9Var;
        this.f281593f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281591d;
        c01.w9.f(f9Var.m124847x74d37ac6(), f9Var.Q0());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9 w9Var = this.f281592e;
        java.util.HashMap hashMap = w9Var.f281694e;
        java.lang.String frameSetName = this.f281593f;
        hashMap.remove(frameSetName);
        a12.s sVar = (a12.s) ((a12.k) i95.n0.c(a12.k.class));
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "removeFrameSetViewByName, frameSetName:".concat(frameSetName));
        iq0.c Bi = sVar.Bi();
        if (Bi != null) {
            i95.m c17 = i95.n0.c(gq0.t.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            gq0.t.u5((gq0.t) c17, Bi, null, frameSetName, 2, null);
        }
        if (w9Var.f280113d.B()) {
            w9Var.f280113d.L(true);
        }
    }
}
