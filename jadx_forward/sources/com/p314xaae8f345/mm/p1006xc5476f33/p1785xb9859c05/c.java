package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05;

/* loaded from: classes8.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.c f223969e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f223970d = false;

    public void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c5 c5Var = t83.c.f497944a;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5247xb7907c7d c5247xb7907c7d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5247xb7907c7d();
        c5247xb7907c7d.e();
        boolean z17 = c5247xb7907c7d.f135580g.f88752a;
        if (!this.f223970d && java.lang.Math.abs(java.lang.System.currentTimeMillis() - ((java.lang.Long) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_ADDRESS_GETMFRIEND_LASTUPDATE_TIME_LONG, 0L)).longValue()) >= 86400000) {
            this.f223970d = true;
            c01.d9.e().a(32, this);
            s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.a(this), "IPCallAddressBookUpdater_updateUsername");
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (this.f223970d) {
            c01.d9.e().q(32, this);
            java.lang.System.currentTimeMillis();
            if (i17 == 0 && i18 == 0) {
                s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.b(this), "IPCallAddressBookUsernameUpdater_updateUsernameAfterGetMFriend");
                return;
            }
            this.f223970d = false;
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_ADDRESS_GETMFRIEND_LASTUPDATE_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }
}
