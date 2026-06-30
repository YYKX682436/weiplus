package is;

/* loaded from: classes11.dex */
public class g0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f375868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ js.v0 f375869e;

    public g0(is.i0 i0Var, android.app.Activity activity, js.v0 v0Var) {
        this.f375868d = activity;
        this.f375869e = v0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        u11.a a17;
        android.app.Activity activity = this.f375868d;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504.class);
        intent.putExtra("bind_scene", 3);
        java.lang.String simCountryIso = ((android.telephony.TelephonyManager) activity.getSystemService("phone")).getSimCountryIso();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(simCountryIso) && (a17 = u11.b.a(simCountryIso)) != null) {
            intent.putExtra("country_name", a17.f505262c);
            intent.putExtra("couttry_code", a17.f505261b);
        }
        j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity, ".plugin.account.bind.ui.BindMContactUI", intent, 1, new is.f0(this));
    }
}
