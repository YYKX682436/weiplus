package pk3;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 f437974a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f437975b;

    /* renamed from: c, reason: collision with root package name */
    public int f437976c;

    public e(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f437976c = 1;
        i65.a.k(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf222 = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222(context, null, 0, 6, null);
        this.f437974a = c16602xcd2cf222;
        ((java.util.concurrent.CopyOnWriteArraySet) c16602xcd2cf222.f232044g).add(new pk3.d(this));
    }

    public final void a() {
        try {
            android.view.ViewGroup viewGroup = this.f437975b;
            if (viewGroup == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallContainer", "detachFromWindowInternal, window manager is null");
                return;
            }
            if (viewGroup != null) {
                viewGroup.removeView(this.f437974a);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "detachFromWindowInternal, detach all views");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallContainer", e17, "detachFromWindowInternal exception", new java.lang.Object[0]);
        }
    }
}
