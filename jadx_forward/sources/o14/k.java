package o14;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f423816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f423817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17361x5f3fcbd4 f423818f;

    public k(android.os.CancellationSignal cancellationSignal, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17361x5f3fcbd4 activityC17361x5f3fcbd4) {
        this.f423816d = cancellationSignal;
        this.f423817e = u3Var;
        this.f423818f = activityC17361x5f3fcbd4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean b17 = v24.o.b(this.f423816d);
        ((ku5.t0) ku5.t0.f394148d).B(new o14.j(this.f423817e, b17, this.f423818f));
    }
}
