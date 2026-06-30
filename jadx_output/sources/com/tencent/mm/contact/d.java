package com.tencent.mm.contact;

/* loaded from: classes.dex */
public class d implements o75.a {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.contact.d f64855g = new com.tencent.mm.contact.d();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f64856d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f64857e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f64858f;

    public d() {
        this.f64858f = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DoingInitContactEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DoingInitContactEvent>(a0Var) { // from class: com.tencent.mm.contact.ContactUpgradeHelper$1
            {
                this.__eventId = -1611655951;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.DoingInitContactEvent doingInitContactEvent) {
                int i17 = doingInitContactEvent.f54093g.f6636a;
                if (i17 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactUpgradeHelper", "do init start");
                    com.tencent.mm.contact.d.this.f64856d = true;
                } else if (i17 == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactUpgradeHelper", "do init end");
                    com.tencent.mm.contact.d.this.f64856d = false;
                }
                return false;
            }
        };
        this.f64857e = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_CONTACT_UPDATE_USERNAME_BOOLEAN_SYNC, false);
        iListener.alive();
        boolean l17 = j62.e.g().l("clicfg_db_opt_mode_on", true, true, true);
        this.f64858f = l17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactUpgradeHelper", "defalutOptOpen:%b", java.lang.Boolean.valueOf(l17));
    }

    public boolean a() {
        return this.f64857e && this.f64858f;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        if (this.f64856d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactUpgradeHelper", "refreshUserName, init doing");
            return;
        }
        if (this.f64857e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactUpgradeHelper", "refreshUserName, updateUserNameFlag is already done!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactUpgradeHelper", "checkUpgrade");
        this.f64856d = true;
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.contact.c(this));
    }
}
