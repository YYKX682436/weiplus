package com.p314xaae8f345.mm.p670x38b72420;

/* loaded from: classes.dex */
public class d implements o75.a {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p670x38b72420.d f146388g = new com.p314xaae8f345.mm.p670x38b72420.d();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f146389d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f146390e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f146391f;

    public d() {
        this.f146391f = true;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5306x8769501> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5306x8769501>(a0Var) { // from class: com.tencent.mm.contact.ContactUpgradeHelper$1
            {
                this.f39173x3fe91575 = -1611655951;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5306x8769501 c5306x8769501) {
                int i17 = c5306x8769501.f135626g.f88169a;
                if (i17 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactUpgradeHelper", "do init start");
                    com.p314xaae8f345.mm.p670x38b72420.d.this.f146389d = true;
                } else if (i17 == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactUpgradeHelper", "do init end");
                    com.p314xaae8f345.mm.p670x38b72420.d.this.f146389d = false;
                }
                return false;
            }
        };
        this.f146390e = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CONTACT_UPDATE_USERNAME_BOOLEAN_SYNC, false);
        abstractC20980x9b9ad01d.mo48813x58998cd();
        boolean l17 = j62.e.g().l("clicfg_db_opt_mode_on", true, true, true);
        this.f146391f = l17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactUpgradeHelper", "defalutOptOpen:%b", java.lang.Boolean.valueOf(l17));
    }

    public boolean a() {
        return this.f146390e && this.f146391f;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        if (this.f146389d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactUpgradeHelper", "refreshUserName, init doing");
            return;
        }
        if (this.f146390e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactUpgradeHelper", "refreshUserName, updateUserNameFlag is already done!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactUpgradeHelper", "checkUpgrade");
        this.f146389d = true;
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p670x38b72420.c(this));
    }
}
