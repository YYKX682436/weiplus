package im2;

/* loaded from: classes10.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.g4 f373779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(im2.g4 g4Var) {
        super(0);
        this.f373779d = g4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinderBackground: preloadCount=");
        im2.g4 g4Var = this.f373779d;
        sb6.append(g4Var.f373874d.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayerFactory", sb6.toString());
        g4Var.f373875e = false;
        android.os.Looper.getMainLooper().getQueue().removeIdleHandler(g4Var.f373877g);
        java.util.List list = g4Var.f373874d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "access$getPreloadPlayer$p(...)");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((nn0.c) it.next()).w();
        }
        list.clear();
        return jz5.f0.f384359a;
    }
}
