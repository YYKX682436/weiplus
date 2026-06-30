package ko5;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public er4.r f391631a = er4.r.MP_ROOM_TYPE_VOICE;

    /* renamed from: b, reason: collision with root package name */
    public er4.l f391632b;

    /* renamed from: c, reason: collision with root package name */
    public er4.l f391633c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2793xcfa97743.v2.p2798xdb7d1c3f.C22890x51043139 f391634d;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.voipmp.v2.extension.VoIPMPQuickAcceptExtension$mShortcutVoipControllerListener$1] */
    public c() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f391634d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6017xfdefe458>(a0Var) { // from class: com.tencent.mm.voipmp.v2.extension.VoIPMPQuickAcceptExtension$mShortcutVoipControllerListener$1
            {
                this.f39173x3fe91575 = 635809864;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6017xfdefe458 c6017xfdefe458) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6017xfdefe458 event = c6017xfdefe458;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPQuickAccept", "shortcutVoipControllerListener callback " + event.f136311g.f88899a);
                int i17 = event.f136311g.f88899a;
                if (i17 == 1) {
                    if (ko5.c.this.f391631a == er4.r.MP_ROOM_TYPE_VIDEO) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPQuickAccept", "video mode not allow ti response accept");
                        return false;
                    }
                    nq4.f fVar = nq4.f.f420547a;
                    if (nq4.f.f420552f) {
                        ((jp5.o) i95.n0.c(jp5.o.class)).ti();
                        return false;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPQuickAccept", "current has not broadcast coming message,not allow to response accept");
                    return false;
                }
                er4.l lVar = er4.l.MAIN_UI_INVITED;
                if (i17 != 2) {
                    if (i17 != 3) {
                        return false;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPQuickAccept", "krxkli - Receive ShortcutVoipControllerEvent.BT_SCO_CONNECTED");
                    er4.l lVar2 = ko5.c.this.f391633c;
                    if (lVar2 == null) {
                        return false;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPQuickAccept", "launchQuickAccept After BT_SCO_CONNECTED");
                    if (lVar2 != lVar) {
                        return false;
                    }
                    ((jp5.o) i95.n0.c(jp5.o.class)).Hd();
                    ((jp5.o) i95.n0.c(jp5.o.class)).Ee();
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPQuickAccept", "shortcutVoipControllerListener callback " + event.f136311g.f88899a);
                if (ko5.c.this.f391632b != lVar) {
                    ((jp5.o) i95.n0.c(jp5.o.class)).cb();
                    return false;
                }
                nq4.f fVar2 = nq4.f.f420547a;
                if (nq4.f.f420552f) {
                    ((jp5.o) i95.n0.c(jp5.o.class)).cb();
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPQuickAccept", "current has not broadcast coming message,not allow to response reject");
                return false;
            }
        };
    }

    public final void a(er4.l state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f391632b = state;
        er4.l lVar = er4.l.MAIN_UI_INVITING;
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2798xdb7d1c3f.C22890x51043139 c22890x51043139 = this.f391634d;
        if (state == lVar || state == er4.l.MAIN_UI_INVITED) {
            c22890x51043139.mo48813x58998cd();
        } else if (state == er4.l.MAIN_UI_CALL_END) {
            c22890x51043139.mo48814x2efc64();
        }
    }
}
