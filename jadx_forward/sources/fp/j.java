package fp;

/* loaded from: classes5.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public long f346736a;

    public j() {
        b();
    }

    public long a() {
        return android.os.SystemClock.elapsedRealtime() - this.f346736a;
    }

    public void b() {
        this.f346736a = android.os.SystemClock.elapsedRealtime();
    }
}
