package yk;

/* loaded from: classes12.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f544293d;

    public w(android.content.Context context) {
        this.f544293d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            yk.x.a(yk.x.f544294a, this.f544293d);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgRefactorReportService", th6, "initScheduleReport err", new java.lang.Object[0]);
        }
    }
}
