package wm3;

/* loaded from: classes10.dex */
public abstract class n extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public j75.f f528815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public abstract j75.a T6();

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        j75.a initState = T6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initState, "initState");
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(context.getViewModel(), new j75.t(initState, context)).a(j75.r.class);
        j75.r rVar = a17 instanceof j75.r ? (j75.r) a17 : null;
        if (rVar == null) {
            throw new j75.s();
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.f379619d.f273884e, context)) {
            rVar.f379619d = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("UIStateCenter.LifecycleScope", context, 0, 4, null);
        }
        this.f528815d = rVar;
    }
}
