package xp1;

/* loaded from: classes5.dex */
public class b implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 f537404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f537405b;

    public b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var, android.app.Activity activity) {
        this.f537404a = u1Var;
        this.f537405b = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v1
    public void a(boolean z17, java.lang.String str, boolean z18) {
        this.f537404a.f293531c.dismiss();
        if (z18) {
            this.f537405b.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putBoolean("no_more_show_add_short_cut_dialog", true).apply();
        }
    }
}
