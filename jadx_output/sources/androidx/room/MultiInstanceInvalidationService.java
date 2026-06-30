package androidx.room;

/* loaded from: classes13.dex */
public class MultiInstanceInvalidationService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public int f12318d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f12319e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final android.os.RemoteCallbackList f12320f = new l4.k(this);

    /* renamed from: g, reason: collision with root package name */
    public final l4.e f12321g = new l4.l(this);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.f12321g;
    }
}
