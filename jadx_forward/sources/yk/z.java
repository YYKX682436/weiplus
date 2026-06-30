package yk;

/* loaded from: classes12.dex */
public final class z implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5089x55bc9d35 f544296d;

    public z(com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5089x55bc9d35 c5089x55bc9d35) {
        this.f544296d = c5089x55bc9d35;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRefactorReportWorker", "doWork() called idle");
        ((ku5.t0) ku5.t0.f394148d).g(new yk.y(this.f544296d));
        return false;
    }
}
