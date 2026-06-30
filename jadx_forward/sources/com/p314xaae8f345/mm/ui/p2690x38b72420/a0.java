package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment f288108d;

    public a0(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment) {
        this.f288108d = addressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.i();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().w("@social.black.android", null, null) > 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATONLY_ENTRANCE_BOOLEAN, java.lang.Boolean.TRUE);
            this.f288108d.D.post(new com.p314xaae8f345.mm.ui.p2690x38b72420.z(this));
        }
    }
}
