package im2;

/* loaded from: classes10.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.g4 f373824e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(java.lang.String str, im2.g4 g4Var) {
        super(0);
        this.f373823d = str;
        this.f373824e = g4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPreload: source=");
        sb6.append(this.f373823d);
        sb6.append(", isInFinder=");
        im2.g4 g4Var = this.f373824e;
        sb6.append(g4Var.f373875e);
        sb6.append(", preloadPlayer.size=");
        java.util.List list = g4Var.f373874d;
        sb6.append(list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayerFactory", sb6.toString());
        if (g4Var.f373875e && list.size() < 2) {
            android.os.MessageQueue queue = android.os.Looper.getMainLooper().getQueue();
            android.os.MessageQueue.IdleHandler idleHandler = g4Var.f373877g;
            queue.removeIdleHandler(idleHandler);
            android.os.Looper.getMainLooper().getQueue().addIdleHandler(idleHandler);
        }
        return jz5.f0.f384359a;
    }
}
