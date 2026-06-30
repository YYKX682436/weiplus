package hr3;

/* loaded from: classes11.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f365466d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.ya f365467e;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2, com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar) {
        this.f365466d = new java.lang.ref.WeakReference(activityC16840x4302a3e2);
        this.f365467e = yaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) this.f365466d.get();
        com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = this.f365467e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onNotifyChange stranger %s", yaVar);
        if (activityC16840x4302a3e2 == null || activityC16840x4302a3e2.isFinishing() || activityC16840x4302a3e2.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onNotifyChange verify:%b, contact.user:%s, notify.user:%s", java.lang.Boolean.valueOf(activityC16840x4302a3e2.f235191h), activityC16840x4302a3e2.f235194n.d1(), yaVar);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = activityC16840x4302a3e2.f235194n;
        if (z3Var == null || yaVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.d1()) || !activityC16840x4302a3e2.f235194n.d1().equals(yaVar.f66694xdd77ad16) || c01.e2.U(activityC16840x4302a3e2.f235194n.d1())) {
            return;
        }
        activityC16840x4302a3e2.f235194n.n1(yaVar.f66692x4854b29d);
        activityC16840x4302a3e2.getIntent().putExtra("Contact_User", activityC16840x4302a3e2.f235194n.d1());
        t25.a aVar = activityC16840x4302a3e2.f235188e;
        if (aVar != null) {
            aVar.mo67450x3f5eee52();
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC16840x4302a3e2.f235187d).t();
        }
        activityC16840x4302a3e2.mo43517x10010bd5();
    }
}
