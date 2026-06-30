package u81;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.BroadcastReceiver f507016a = new u81.v(this);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f507017b = new x.d(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f507018c;

    public w(u81.f0 f0Var, u81.k kVar) {
        this.f507018c = f0Var;
    }

    public void a(k75.c cVar) {
        java.util.Set set = this.f507017b;
        if (((x.d) set).add(cVar) && ((x.d) set).f532349f == 1) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f507016a, intentFilter);
        }
    }

    public void b(k75.c cVar) {
        java.util.Set set = this.f507017b;
        x.d dVar = (x.d) set;
        if (dVar.remove(cVar) && dVar.isEmpty()) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(this.f507016a);
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th6) {
                ((x.d) set).clear();
                throw th6;
            }
            ((x.d) set).clear();
        }
    }
}
