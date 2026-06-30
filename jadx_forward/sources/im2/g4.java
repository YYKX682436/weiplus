package im2;

/* loaded from: classes10.dex */
public final class g4 extends pf5.k0 implements vd2.f5 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f373875e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f373874d = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f373876f = jz5.h.b(im2.e4.f373839d);

    /* renamed from: g, reason: collision with root package name */
    public final android.os.MessageQueue.IdleHandler f373877g = new im2.f4(this);

    public g4() {
        ru2.j jVar = ru2.j.f481274d;
        ru2.j.f481279i.add(new im2.c4(this));
    }

    public mn0.b0 N6(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z17 = false;
        if (i17 == 1 || !O6()) {
            return new nn0.c(context, i17, false);
        }
        java.util.List preloadPlayer = this.f373874d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(preloadPlayer, "preloadPlayer");
        nn0.c cVar = (nn0.c) kz5.h0.C(preloadPlayer);
        if (cVar == null) {
            cVar = new nn0.c(context, i17, true);
        } else {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayerFactory", "getOrCreate: useCache=" + z17 + ", customRenderMode=" + i17);
        pm0.v.X(new im2.d4("getOrCreate", this));
        if (cVar.Y == i17) {
            return cVar;
        }
        cVar.Y = i17;
        cVar.H = i17;
        ((nn0.i) cVar.p()).f420117b.n7(i17);
        return cVar;
    }

    public final boolean O6() {
        return ((java.lang.Boolean) ((jz5.n) this.f373876f).mo141623x754a37bb()).booleanValue();
    }
}
