package hk4;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk4.n f363486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(hk4.n nVar) {
        super(0);
        this.f363486d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363486d.f363489k, "start finished ensure imageBitmap, isStarted:" + this.f363486d.f363503y + ", isPlaying:" + this.f363486d.f363502x + ", isInvokeOnPlayStarted:" + this.f363486d.B);
        this.f363486d.f363502x = true;
        hk4.n.p(this.f363486d);
        hk4.n nVar = this.f363486d;
        synchronized (nVar) {
            if (!nVar.B) {
                pm0.v.X(new hk4.f(nVar));
                nVar.B = true;
            }
        }
        return jz5.f0.f384359a;
    }
}
