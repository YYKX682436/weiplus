package p012xc85e97e9.p093xedfae76a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/q;", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/o;", "lifecycle", "Loz5/l;", "coroutineContext", "<init>", "(Landroidx/lifecycle/o;Loz5/l;)V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl */
/* loaded from: classes7.dex */
public final class C1116x78c71f86 extends p012xc85e97e9.p093xedfae76a.q implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.o f93114d;

    /* renamed from: e, reason: collision with root package name */
    public final oz5.l f93115e;

    public C1116x78c71f86(p012xc85e97e9.p093xedfae76a.o lifecycle, oz5.l coroutineContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycle, "lifecycle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coroutineContext, "coroutineContext");
        this.f93114d = lifecycle;
        this.f93115e = coroutineContext;
        if (lifecycle.b() == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            p3325xe03a0797.p3326xc267989b.v2.c(coroutineContext, null, 1, null);
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.y0
    /* renamed from: getCoroutineContext, reason: from getter */
    public oz5.l getF93115e() {
        return this.f93115e;
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p012xc85e97e9.p093xedfae76a.o oVar = this.f93114d;
        if (oVar.b().compareTo(p012xc85e97e9.p093xedfae76a.n.DESTROYED) <= 0) {
            oVar.c(this);
            p3325xe03a0797.p3326xc267989b.v2.c(this.f93115e, null, 1, null);
        }
    }
}
