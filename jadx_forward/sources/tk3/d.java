package tk3;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e f501446a;

    /* renamed from: b, reason: collision with root package name */
    public int f501447b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.WindowManager f501448c;

    public d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f501447b = 1;
        i65.a.k(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e(context, null, 0, 6, null);
        this.f501446a = c16608xd141945e;
        c16608xd141945e.f232073h.add(new tk3.b(this));
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f501448c = (android.view.WindowManager) systemService;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "detachFromWindowInternal, detach all listeners");
            android.view.WindowManager windowManager = this.f501448c;
            if (windowManager == null || (c16608xd141945e = this.f501446a) == null) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16608xd141945e);
            ((java.util.concurrent.CopyOnWriteArraySet) c16608xd141945e.f232073h).clear();
            ((java.util.concurrent.CopyOnWriteArraySet) c16608xd141945e.f232074i).clear();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(windowManager);
            windowManager.removeView(this.f501446a);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultiTaskNewFloatBallContainer", e17, "detachFromWindowInternal exception", new java.lang.Object[0]);
        }
    }

    public final void b(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "setAlpha");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e2 = this.f501446a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.a(c16608xd141945e2 != null ? java.lang.Float.valueOf(c16608xd141945e2.getAlpha()) : null, f17) || (c16608xd141945e = this.f501446a) == null) {
            return;
        }
        c16608xd141945e.setAlpha(f17);
    }
}
