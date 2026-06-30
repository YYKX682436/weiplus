package ne0;

@j95.b
/* loaded from: classes7.dex */
public final class n extends i95.w implements oe0.r {

    /* renamed from: d, reason: collision with root package name */
    public pg4.e f418032d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f418033e = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f418034f = new java.util.HashMap();

    public void Ai(java.lang.String key, java.lang.String appId, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] sendEvent key:" + key + ",appId:" + appId);
        cl0.g gVar = new cl0.g();
        gVar.h("appId", appId);
        gVar.h(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13301xac1d9648, value);
        pg4.e eVar = this.f418032d;
        if (eVar != null) {
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            eVar.G1(key, gVar2);
        }
    }

    public synchronized void Bi(java.lang.String appId, java.lang.String str, android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] biz start ".concat(appId));
        if (this.f418032d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] new biz");
            pg4.e eVar = new pg4.e();
            this.f418032d = eVar;
            eVar.X0();
        }
        pg4.e eVar2 = this.f418032d;
        if (eVar2 != null) {
            eVar2.J1(viewGroup);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] start reference:" + this.f418033e.incrementAndGet());
        if (str != null) {
            Ai("start", appId, str);
        }
    }

    public synchronized void Di(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] biz stop ".concat(appId));
        pg4.e eVar = this.f418032d;
        if (eVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "removeFrameSetView");
            com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = eVar.A;
            if (c10867x3e50a04d != null) {
                c10867x3e50a04d.f();
            }
            eVar.A = null;
        }
        Ai("stop", appId, "");
        if (this.f418033e.decrementAndGet() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] stop reference < 0");
            this.f418033e.set(0);
            wi();
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        wi();
    }

    public synchronized void wi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] forceStop");
        pg4.e eVar = this.f418032d;
        if (eVar != null) {
            hq0.e0 e0Var = eVar.f435770z;
            if (e0Var != null) {
                eVar.F1(e0Var.f364517e);
            }
            eVar.f435770z = null;
        }
        pg4.e eVar2 = this.f418032d;
        if (eVar2 != null) {
            eVar2.mo123041x5cd39ffa();
        }
        synchronized (this.f418034f) {
            this.f418034f.clear();
        }
        this.f418032d = null;
    }
}
