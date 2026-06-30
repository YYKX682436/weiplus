package yo3;

/* loaded from: classes9.dex */
public final class c implements yo3.d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f545677a = "";

    @Override // yo3.d
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f17 = vr4.f1.wi().Ai().f(this.f545677a);
        if (f17 == null || at4.l1.b(f17)) {
            return;
        }
        mo177433xc84a8199();
    }

    @Override // yo3.d
    public java.lang.String b() {
        return this.f545677a;
    }

    @Override // yo3.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c(boolean z17) {
        return vr4.f1.wi().Ai().f(this.f545677a);
    }

    @Override // yo3.d
    public void d(java.lang.String bindSerial) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindSerial, "bindSerial");
        this.f545677a = bindSerial;
        to3.c0.Ai().wi().f502503b = bindSerial;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f17 = vr4.f1.wi().Ai().f(bindSerial);
        if (f17 != null) {
            if (at4.l1.b(f17)) {
                at4.x1 Ai = vr4.f1.wi().Ai();
                java.lang.String str = f17.f69225xed6d60f6;
                Ai.getClass();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, str);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OfflinePriorBankcardLogic", "can't set as default card: " + f17.f69225xed6d60f6 + ", " + f17.f69223x58802fcb);
        }
    }

    @Override // yo3.d
    /* renamed from: reload */
    public void mo177433xc84a8199() {
        this.f545677a = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, null);
        to3.c0.Ai().wi().f502503b = this.f545677a;
    }
}
