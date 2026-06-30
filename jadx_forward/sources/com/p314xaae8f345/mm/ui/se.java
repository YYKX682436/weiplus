package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class se implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.he f291345d;

    public se(com.p314xaae8f345.mm.ui.he heVar) {
        this.f291345d = heVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.MainTabUnreadMgr", "Account not Ready!!!");
            return;
        }
        if (this.f291345d.f290399g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.MainTabUnreadMgr", "set tag job, but tab view is null");
            return;
        }
        ((km5.q) km5.u.d()).q(new com.p314xaae8f345.mm.ui.je(this)).h(new com.p314xaae8f345.mm.ui.ie(this)).f(this.f291345d.f290396d);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.le(this), "UpdateSettingsRedDot");
    }

    /* renamed from: toString */
    public java.lang.String m80963x9616526c() {
        return super.toString() + "|setTagRunnable";
    }
}
