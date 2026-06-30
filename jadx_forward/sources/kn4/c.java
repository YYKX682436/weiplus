package kn4;

/* loaded from: classes12.dex */
public abstract class c implements kn4.w {

    /* renamed from: a, reason: collision with root package name */
    public long f391208a = android.net.TrafficStats.getMobileRxBytes();

    /* renamed from: b, reason: collision with root package name */
    public long f391209b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f391210c;

    public c() {
        long mobileTxBytes = android.net.TrafficStats.getMobileTxBytes();
        this.f391209b = mobileTxBytes;
        this.f391210c = (this.f391208a == -1 || mobileTxBytes == -1) ? false : true;
    }
}
