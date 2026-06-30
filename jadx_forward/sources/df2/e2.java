package df2;

/* loaded from: classes10.dex */
public final class e2 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.k2 f311563a;

    public e2(df2.k2 k2Var) {
        this.f311563a = k2Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            df2.k2 k2Var = this.f311563a;
            if (hashCode == -2128145023) {
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "ScreenStateReceiver - Screen OFF (locked)");
                    if (k2Var.f312082r.compareAndSet(false, true)) {
                        k2Var.f312083s.a(true, k2Var.b7());
                        return;
                    }
                    return;
                }
                return;
            }
            if (hashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "ScreenStateReceiver - User present (unlocked)");
                if (k2Var.f312082r.compareAndSet(true, false)) {
                    k2Var.f312083s.a(false, k2Var.b7());
                }
            }
        }
    }
}
