package dy4;

/* loaded from: classes8.dex */
public final class n extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f326221a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f326222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.os.Handler handler, java.lang.ref.WeakReference weakEventHandler) {
        super(handler);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakEventHandler, "weakEventHandler");
        this.f326221a = weakEventHandler;
        this.f326222b = "MicroMsg.BrightnessObserver";
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        try {
            dy4.w wVar = (dy4.w) this.f326221a.get();
            if (wVar == null) {
                return;
            }
            org.json.JSONObject c17 = wVar.c();
            c17.put("selfChange", z17);
            wVar.a("onBrightnessChange", c17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f326222b, "onBrightnessChange fail  " + e17.getMessage());
        }
    }
}
