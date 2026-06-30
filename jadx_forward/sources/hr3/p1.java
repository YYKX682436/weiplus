package hr3;

/* loaded from: classes11.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f365404d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f365405e;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2, java.lang.String str) {
        this.f365404d = new java.lang.ref.WeakReference(activityC16840x4302a3e2);
        this.f365405e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) this.f365404d.get();
        java.lang.String str = this.f365405e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onNotifyChange contact %s", str);
        if (activityC16840x4302a3e2 == null || activityC16840x4302a3e2.isFinishing() || activityC16840x4302a3e2.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onNotifyChange verify:%b, contact.user:%s, notify.user:%s", java.lang.Boolean.valueOf(activityC16840x4302a3e2.f235191h), activityC16840x4302a3e2.f235194n.d1(), str);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = activityC16840x4302a3e2.f235194n;
        if (z3Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.d1())) {
            return;
        }
        if (activityC16840x4302a3e2.f235194n.d1().equals(str) || activityC16840x4302a3e2.f235194n.d1().equals(com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(str))) {
            activityC16840x4302a3e2.f235194n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            t25.a aVar = activityC16840x4302a3e2.f235188e;
            if (aVar != null) {
                aVar.mo67450x3f5eee52();
                if (com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
                    android.view.View X6 = activityC16840x4302a3e2.X6(activityC16840x4302a3e2.getWindow().getDecorView(), new hr3.C28486x6b16229());
                    activityC16840x4302a3e2.P = (X6 == null || (textView = (android.widget.TextView) X6.findViewById(android.R.id.title)) == null) ? "" : textView.getText().toString();
                }
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC16840x4302a3e2.f235187d).t();
            }
            activityC16840x4302a3e2.mo43517x10010bd5();
            if (com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
                android.view.View decorView = activityC16840x4302a3e2.getWindow().getDecorView();
                decorView.post(new hr3.y0(activityC16840x4302a3e2, decorView, activityC16840x4302a3e2.P));
            }
        }
    }
}
