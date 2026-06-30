package p012xc85e97e9.p093xedfae76a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/v;", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1 */
/* loaded from: classes4.dex */
public final class C1124x3029b39e implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f93127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.o f93128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.n f93129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f93130g;

    public C1124x3029b39e(p3325xe03a0797.p3326xc267989b.q qVar, p012xc85e97e9.p093xedfae76a.o oVar, p012xc85e97e9.p093xedfae76a.n nVar, yz5.a aVar, boolean z17, p3325xe03a0797.p3326xc267989b.p0 p0Var) {
        this.f93127d = qVar;
        this.f93128e = oVar;
        this.f93129f = nVar;
        this.f93130g = aVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int i17 = p012xc85e97e9.p093xedfae76a.l.f93167a[this.f93129f.ordinal()];
        p012xc85e97e9.p093xedfae76a.m mVar = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : p012xc85e97e9.p093xedfae76a.m.ON_RESUME : p012xc85e97e9.p093xedfae76a.m.ON_START : p012xc85e97e9.p093xedfae76a.m.ON_CREATE;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f93127d;
        p012xc85e97e9.p093xedfae76a.o oVar = this.f93128e;
        if (event != mVar) {
            if (event == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                oVar.c(this);
                p012xc85e97e9.p093xedfae76a.s sVar = new p012xc85e97e9.p093xedfae76a.s();
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(sVar)));
                return;
            }
            return;
        }
        oVar.c(this);
        yz5.a aVar = this.f93130g;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(aVar.mo152xb9724478());
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(m143895xf1229813);
    }
}
