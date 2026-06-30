package p61;

/* loaded from: classes5.dex */
public class t0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 f433910d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970) {
        this.f433910d = activityC11360x90d2d970;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        boolean a17 = yp5.a.f545942a.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970 = this.f433910d;
        if (a17) {
            intent.putExtra("kintent_hint", activityC11360x90d2d970.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0c));
        } else {
            intent.putExtra("kintent_hint", activityC11360x90d2d970.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0d));
        }
        intent.putExtra("from_unbind", true);
        j45.l.n(activityC11360x90d2d970, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", intent, 1);
    }
}
