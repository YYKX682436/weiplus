package androidx.core.content;

/* loaded from: classes15.dex */
public abstract class UnusedAppRestrictionsBackportService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final a3.c f11035d = new b3.t(this);

    public abstract void a(b3.s sVar);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.f11035d;
    }
}
