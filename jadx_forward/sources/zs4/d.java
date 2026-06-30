package zs4;

/* loaded from: classes9.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f556813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f556814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f556815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f556816g;

    public d(android.os.Bundle bundle, int i17, android.app.Activity activity, boolean z17) {
        this.f556813d = bundle;
        this.f556814e = i17;
        this.f556815f = activity;
        this.f556816g = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click OK");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog click OK");
        android.os.Bundle bundle = this.f556813d;
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putInt("real_name_verify_mode", 0);
        int i18 = this.f556814e;
        bundle.putInt("entry_scene", i18);
        bundle.putBoolean("key_from_set_pwd", true);
        android.app.Activity activity = this.f556815f;
        com.p314xaae8f345.mm.p2802xd031a825.a.j(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.class, bundle, null);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(19, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), i18);
        dialogInterface.dismiss();
        if (this.f556816g) {
            activity.finish();
        }
    }
}
