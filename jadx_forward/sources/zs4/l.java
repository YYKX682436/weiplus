package zs4;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f556833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f556834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f556835f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f556836g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f556837h;

    public l(android.os.Bundle bundle, int i17, int i18, android.app.Activity activity, int i19) {
        this.f556833d = bundle;
        this.f556834e = i17;
        this.f556835f = i18;
        this.f556836g = activity;
        this.f556837h = i19;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog click OK");
        android.os.Bundle bundle = this.f556833d;
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putInt("real_name_verify_mode", this.f556834e);
        int i18 = this.f556835f;
        bundle.putInt("entry_scene", i18);
        com.p314xaae8f345.mm.p2802xd031a825.a.j(this.f556836g, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.class, bundle, null);
        int i19 = this.f556837h;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(i19 == 1 ? 9 : i19 == 2 ? 12 : 0, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), i18);
        dialogInterface.dismiss();
    }
}
