package te4;

/* loaded from: classes15.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18455x8079c32b f500141d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18455x8079c32b activityC18455x8079c32b) {
        this.f500141d = activityC18455x8079c32b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/soter/ui/SoterTestUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.security.Signature d17 = wt5.a.d("sample_auth_key_name");
        com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18455x8079c32b activityC18455x8079c32b = this.f500141d;
        try {
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterTestUI", "hy: signature is null. do sign failed");
                yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            d17.update("challenge".getBytes());
            d17.sign();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterTestUI", "hy: should NOT happen if no exception");
            activityC18455x8079c32b.f253299o.setText("not passed: signature success without fingerprint authentication");
            yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } catch (java.security.SignatureException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterTestUI", "hy: occurred exception when sign: " + e17.toString());
            xt5.f fVar = xt5.h.f538700a;
            if (fVar.mo175965xa185b5d4(activityC18455x8079c32b) && fVar.b(activityC18455x8079c32b)) {
                fVar.a(activityC18455x8079c32b, new xt5.e(d17), 0, null, new te4.m(this, d17), null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterTestUI", "hy: no hardware detected or no fingerprint registered");
            }
            yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
