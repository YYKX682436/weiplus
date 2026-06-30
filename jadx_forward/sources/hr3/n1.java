package hr3;

/* loaded from: classes11.dex */
public class n1 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 f365351b;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2, java.lang.String str) {
        this.f365351b = activityC16840x4302a3e2;
        this.f365350a = str;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "fetch contact result: username=" + str + ", succ=" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f365351b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16840x4302a3e2.F;
        if (u3Var != null && u3Var.isShowing()) {
            activityC16840x4302a3e2.F.dismiss();
            activityC16840x4302a3e2.F = null;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactInfoUI", "fetch contact failed, not show bodyWidget");
            gr3.c.c(52L);
            activityC16840x4302a3e2.F = db5.e1.Q(activityC16840x4302a3e2.mo55332x76847179(), activityC16840x4302a3e2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16840x4302a3e2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, null);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactInfoUI", "updated contact is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "updated contact bizType: " + n17.f318119x1);
        activityC16840x4302a3e2.f235194n = n17;
        activityC16840x4302a3e2.a7(this.f365350a);
    }
}
