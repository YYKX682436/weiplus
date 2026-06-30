package bh3;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102442d;

    public a(android.content.Context context) {
        this.f102442d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bh3.b.a(bh3.b.f102443a, this.f102442d);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CheckContactService", th6, "initScheduleCheck err", new java.lang.Object[0]);
        }
    }
}
