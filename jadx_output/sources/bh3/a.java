package bh3;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20909d;

    public a(android.content.Context context) {
        this.f20909d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bh3.b.a(bh3.b.f20910a, this.f20909d);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CheckContactService", th6, "initScheduleCheck err", new java.lang.Object[0]);
        }
    }
}
