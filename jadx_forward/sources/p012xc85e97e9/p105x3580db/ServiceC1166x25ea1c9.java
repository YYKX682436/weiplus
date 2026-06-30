package p012xc85e97e9.p105x3580db;

/* renamed from: androidx.room.MultiInstanceInvalidationService */
/* loaded from: classes13.dex */
public class ServiceC1166x25ea1c9 extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public int f93851d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f93852e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final android.os.RemoteCallbackList f93853f = new l4.k(this);

    /* renamed from: g, reason: collision with root package name */
    public final l4.e f93854g = new l4.l(this);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.f93854g;
    }
}
