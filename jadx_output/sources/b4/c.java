package b4;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.IntentFilter f17764a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.BroadcastReceiver f17765b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17766c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17767d;

    public c(android.content.IntentFilter intentFilter, android.content.BroadcastReceiver broadcastReceiver) {
        this.f17764a = intentFilter;
        this.f17765b = broadcastReceiver;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append("Receiver{");
        sb6.append(this.f17765b);
        sb6.append(" filter=");
        sb6.append(this.f17764a);
        if (this.f17767d) {
            sb6.append(" DEAD");
        }
        sb6.append("}");
        return sb6.toString();
    }
}
