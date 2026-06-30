package q81;

/* loaded from: classes7.dex */
public final class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c implements q81.z {

    /* renamed from: g, reason: collision with root package name */
    public static final q81.e0 f442237g = new q81.e0();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f442238h = new java.util.concurrent.ConcurrentSkipListSet();

    public e0() {
        super(1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl", "onQueueDrained");
        f442238h.clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a task, yz5.a onEnd) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onEnd, "onEnd");
        if (task instanceof q81.a0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl", "runTask CheckCmdAndSubmitTask");
            ((q81.a0) task).f442224d = onEnd;
            ((ku5.t0) ku5.t0.f394148d).q((java.lang.Runnable) task);
            return;
        }
        if (task instanceof q81.d0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runTask RunCmdTask(");
            q81.d0 d0Var = (q81.d0) task;
            sb6.append(d0Var.f442234d);
            sb6.append(')');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl", sb6.toString());
            d0Var.f442236f = onEnd;
            ((ku5.t0) ku5.t0.f394148d).q((java.lang.Runnable) task);
        }
    }

    @Override // q81.z
    public void h() {
        this.f171927e.clear();
        f442238h.clear();
        q81.x._INSTANCE.h();
    }

    @Override // q81.z
    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl", "triggerRetry stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        a(new q81.a0());
    }

    @Override // q81.z
    public boolean k(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return f442238h.contains(str);
    }
}
