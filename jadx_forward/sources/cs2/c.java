package cs2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f303593a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f303594b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f303595c;

    public c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f303593a = context;
        this.f303595c = new cs2.b(this);
    }

    public final void a() {
        java.lang.String str;
        if (this.f303594b) {
            return;
        }
        this.f303594b = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPreloadSearchWorker", "preload search execute");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209593zc).mo141623x754a37bb()).r()).booleanValue()) {
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209575yc).mo141623x754a37bb()).r()).intValue();
            if (intValue < 0) {
                str = "SearchPreload: OFF";
            } else {
                str = "SearchPreload: " + intValue + 's';
            }
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184145b;
            android.content.Context context = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (context == null) {
                context = this.f303593a;
            }
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = str;
            e4Var.c();
        }
        ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).cj(123, 14);
        su4.f1 f1Var = (su4.f1) i95.n0.c(su4.f1.class);
        if (f1Var != null) {
            ((sg0.h3) f1Var).Ai(123, this.f303593a);
        }
    }
}
