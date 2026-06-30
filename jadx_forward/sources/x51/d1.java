package x51;

/* loaded from: classes5.dex */
public class d1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f533519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f533520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f533521f;

    public d1(int i17, android.app.Activity activity, java.lang.Runnable runnable) {
        this.f533519d = i17;
        this.f533520e = activity;
        this.f533521f = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f533519d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostLoginUtil", "[cpan] kv report logid:%d scene:%d", 11438, java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11438, java.lang.Integer.valueOf(i18));
        r61.q0.k(true);
        x51.i1.g(true, false);
        x51.e.a(x51.e.f533523b);
        java.lang.Runnable runnable = this.f533521f;
        if (runnable != null) {
            runnable.run();
        }
        this.f533520e.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putBoolean("login_upload_contacts_already_displayed", true).commit();
    }
}
