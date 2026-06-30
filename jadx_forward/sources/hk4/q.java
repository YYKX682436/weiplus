package hk4;

/* loaded from: classes10.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk4.x f363509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(hk4.x xVar) {
        super(1);
        this.f363509d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        kk4.b it = (kk4.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        hk4.x xVar = this.f363509d;
        synchronized (xVar) {
            if (!xVar.f363526s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f363518k, "invokeOnPlayFinished");
                pm0.v.X(new hk4.u(xVar));
                xVar.f363526s = true;
            }
        }
        return jz5.f0.f384359a;
    }
}
