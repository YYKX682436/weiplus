package hr3;

/* loaded from: classes11.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f365438d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.u7 f365439e;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2, com.p314xaae8f345.mm.p2621x8fb0427b.u7 u7Var) {
        this.f365438d = new java.lang.ref.WeakReference(activityC16840x4302a3e2);
        this.f365439e = u7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) this.f365438d.get();
        com.p314xaae8f345.mm.p2621x8fb0427b.u7 u7Var = this.f365439e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onNotifyFriendUserChange user: %s", u7Var);
        if (activityC16840x4302a3e2 == null || activityC16840x4302a3e2.isFinishing() || activityC16840x4302a3e2.isDestroyed()) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = activityC16840x4302a3e2.f235194n.d1();
        objArr[1] = u7Var != null ? u7Var.f66597xdd77ad16 : "";
        objArr[2] = u7Var.f66599xdec927b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onNotifyFriendUserChange contact.user:%s, notify.user:%s, friendUser:%s", objArr);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = activityC16840x4302a3e2.f235194n;
        if (z3Var == null || u7Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.d1()) || !activityC16840x4302a3e2.f235194n.d1().equals(u7Var.f66597xdd77ad16) || c01.e2.U(activityC16840x4302a3e2.f235194n.d1())) {
            return;
        }
        java.lang.String str = u7Var.f66599xdec927b;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !str.equals(activityC16840x4302a3e2.f235194n.d1())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1430, 4);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            activityC16840x4302a3e2.f235194n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        }
        activityC16840x4302a3e2.getIntent().putExtra("Contact_User", activityC16840x4302a3e2.f235194n.d1());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "new contact user:%s", activityC16840x4302a3e2.f235194n.d1());
        t25.a aVar = activityC16840x4302a3e2.f235188e;
        if (aVar != null) {
            aVar.mo67450x3f5eee52();
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC16840x4302a3e2.f235187d).t();
        }
        activityC16840x4302a3e2.mo43517x10010bd5();
    }
}
