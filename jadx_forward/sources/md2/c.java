package md2;

/* loaded from: classes10.dex */
public final class c implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24390x61cb6fb1 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f407365g;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f407366d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f407367e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f407368f;

    public c(android.content.Context context, gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f407366d = context;
        this.f407367e = buContext;
        this.f407368f = "LiveBlueGiftFlutterPlugin";
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24390x61cb6fb1
    /* renamed from: fetchBlueGiftCreate */
    public void mo90549x4b1abba0(java.lang.String orderID, com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24415xfefa3080 taskID, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orderID, "orderID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskID, "taskID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407368f, "[fetchBlueGiftCreate] orderID = ".concat(orderID));
        p3325xe03a0797.p3326xc267989b.l.d(this.f407367e.f354008i, null, null, new md2.a(this, orderID, callback, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24390x61cb6fb1
    /* renamed from: notifyOnSuccess */
    public void mo90550xe850ebdb(byte[] prizeConfigItemPBData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prizeConfigItemPBData, "prizeConfigItemPBData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407368f, "[notifyOnSuccess] data size = " + prizeConfigItemPBData.length);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407368f, "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24390x61cb6fb1.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24390x61cb6fb1.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24390x61cb6fb1.Companion.m90555x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407368f, "onDetachedFromEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24390x61cb6fb1.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24390x61cb6fb1.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24390x61cb6fb1.Companion.m90555x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24390x61cb6fb1
    /* renamed from: rememberHaveSignedGiveBlueGiftUserAgreement */
    public void mo90551xa594e753(com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24415xfefa3080 taskID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskID, "taskID");
        f407365g = true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24390x61cb6fb1
    /* renamed from: sendBlueGift */
    public void mo90552xfbd87c52(java.lang.String itemID, com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24415xfefa3080 taskID, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemID, "itemID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskID, "taskID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407368f, "[sendBlueGift] itemID = ".concat(itemID));
        p3325xe03a0797.p3326xc267989b.l.d(this.f407367e.f354008i, null, null, new md2.b(this, itemID, callback, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24390x61cb6fb1
    /* renamed from: showSendPrizesHistory */
    public void mo90553x822a228e(com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24415xfefa3080 taskID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskID, "taskID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407368f, "[showSendPrizesHistory] ");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Oj(this.f407366d, null, true);
    }
}
