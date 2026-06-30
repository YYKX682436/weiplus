package vg0;

/* loaded from: classes8.dex */
public final class m implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f517994a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f517995b;

    public m(java.lang.ref.WeakReference callbackRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackRef, "callbackRef");
        this.f517994a = callbackRef;
        this.f517995b = "toggleFlutterFullScreen";
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        tg0.q1 q1Var = (tg0.q1) this.f517994a.get();
        if (q1Var != null) {
            try {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = ((rx4.e) q1Var).f482667a;
                if (activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) activityC0065xcd7aa112).fa(-1.0f, 1.0f, 200, false);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.hitest.FTSFlutterSearchUIC", "toggleFullScreen failed:" + e17);
            }
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f517995b;
    }
}
