package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class ec extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gc f280499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gc gcVar, android.os.Looper looper) {
        super(looper);
        this.f280499a = gcVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gc gcVar = this.f280499a;
        gcVar.f280113d.b0();
        int i17 = message.what;
        if (i17 == 1) {
            boolean z17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) gcVar.f280113d.f542241c.a(sb5.u1.class))).f280829g;
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) gcVar.f280113d.f542252n).i1(false);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) gcVar.f280113d.f542252n).h1(true);
            if (z17) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) gcVar.f280113d.f542252n).B.c(true);
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("load_bottom", true);
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) gcVar.f280113d.f542252n).b1(bundle);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] load bottom! isFromSearch:%s talker:%s", java.lang.Boolean.valueOf(z17), gcVar.f280113d.x());
            return;
        }
        if (i17 == 2) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) gcVar.f280113d.f542252n).i1(true);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) gcVar.f280113d.f542252n).h1(true);
            gcVar.f280631h.postDelayed(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.dc(this), 300L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] unLoad bottom! talker:%s", gcVar.f280113d.x());
            return;
        }
        if (i17 != 4) {
            if (i17 == 8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] reset presenter");
                gcVar.f280113d.f542250l.R0();
                return;
            }
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) gcVar.f280113d.f542252n).i1(false);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) gcVar.f280113d.f542252n).h1(true);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("load_bottom", true);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) gcVar.f280113d.f542252n).b1(bundle2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] unLoad bottom and reset! talker:%s", gcVar.f280113d.x());
    }
}
