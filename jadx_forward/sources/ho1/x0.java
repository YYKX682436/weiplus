package ho1;

/* loaded from: classes5.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f364381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 f364383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 f364384g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364385h;

    public x0(ho1.a1 a1Var, long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 o0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var, java.lang.String str) {
        this.f364381d = a1Var;
        this.f364382e = j17;
        this.f364383f = o0Var;
        this.f364384g = n0Var;
        this.f364385h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        mv.h0 h0Var;
        java.lang.String str = this.f364381d.f364155a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyStatusChanged pkgId=");
        long j17 = this.f364382e;
        sb6.append(j17);
        sb6.append(", taskType=");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 o0Var = this.f364383f;
        sb6.append(o0Var);
        sb6.append(", taskState=");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = this.f364384g;
        sb6.append(n0Var);
        sb6.append(", summary=");
        sb6.append(this.f364385h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        mv.f0 f0Var = mv.f0.f413034d;
        switch (n0Var) {
            case AFFROAM_TASK_STATE_INITED:
            case AFFROAM_TASK_STATE_COMPLETED:
            case AFFROAM_TASK_STATE_STOPPED:
            case AFFROAM_TASK_STATE_QUIT:
                ((nv.v1) i95.n0.c(nv.v1.class)).Ri(j17);
                return;
            case AFFROAM_TASK_STATE_PREPARING:
                f0Var = mv.f0.f413036f;
                break;
            case AFFROAM_TASK_STATE_RUNNING:
                f0Var = mv.f0.f413037g;
                break;
            case AFFROAM_TASK_STATE_PAUSED:
                f0Var = mv.f0.f413035e;
                break;
            case AFFROAM_TASK_STATE_ERROR:
                f0Var = mv.f0.f413035e;
                break;
            case AFFROAM_TASK_STATE_IMPORTING:
                f0Var = mv.f0.f413038h;
                break;
            case AFFROAM_TASK_STATE_DELETING:
                f0Var = mv.f0.f413039i;
                break;
            case AFFROAM_TASK_STATE_CONNECTING:
                f0Var = mv.f0.f413036f;
                break;
        }
        mv.f0 f0Var2 = f0Var;
        nv.v1 v1Var = (nv.v1) i95.n0.c(nv.v1.class);
        long j18 = this.f364382e;
        mv.g0 g0Var = mv.h0.f413042e;
        int i17 = o0Var.f297470d;
        g0Var.getClass();
        java.util.Iterator it = ((kz5.h) mv.h0.f413047m).iterator();
        while (true) {
            if (it.hasNext()) {
                h0Var = it.next();
                if (((mv.h0) h0Var).f413048d == i17) {
                }
            } else {
                h0Var = 0;
            }
        }
        mv.h0 h0Var2 = h0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h0Var2);
        v1Var.Di(j18, h0Var2, f0Var2, this.f364385h);
    }
}
