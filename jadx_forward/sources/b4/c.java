package b4;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.IntentFilter f99297a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.BroadcastReceiver f99298b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f99299c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f99300d;

    public c(android.content.IntentFilter intentFilter, android.content.BroadcastReceiver broadcastReceiver) {
        this.f99297a = intentFilter;
        this.f99298b = broadcastReceiver;
    }

    /* renamed from: toString */
    public java.lang.String m9802x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append("Receiver{");
        sb6.append(this.f99298b);
        sb6.append(" filter=");
        sb6.append(this.f99297a);
        if (this.f99300d) {
            sb6.append(" DEAD");
        }
        sb6.append("}");
        return sb6.toString();
    }
}
