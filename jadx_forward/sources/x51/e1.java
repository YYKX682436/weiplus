package x51;

/* loaded from: classes5.dex */
public class e1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f533526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f533527e;

    public e1(java.lang.Runnable runnable, android.app.Activity activity) {
        this.f533526d = runnable;
        this.f533527e = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r61.q0.k(false);
        x51.i1.g(false, false);
        java.lang.Runnable runnable = this.f533526d;
        if (runnable != null) {
            runnable.run();
        }
        this.f533527e.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putBoolean("login_upload_contacts_already_displayed", true).commit();
    }
}
