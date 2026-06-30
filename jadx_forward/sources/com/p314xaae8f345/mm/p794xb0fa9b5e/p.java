package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public volatile lk0.c f149914a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.ServiceConnection f149915b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f149916c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f149917d;

    public p(com.p314xaae8f345.mm.p794xb0fa9b5e.k kVar) {
    }

    /* renamed from: toString */
    public java.lang.String m46200x9616526c() {
        lk0.c cVar;
        android.content.ServiceConnection serviceConnection;
        boolean z17;
        java.lang.Runnable runnable;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        synchronized (this) {
            cVar = this.f149914a;
            serviceConnection = this.f149915b;
            z17 = this.f149916c;
            runnable = this.f149917d;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("IPCBridgeWrapper{bridge=");
        if (cVar == null) {
            str = "null";
        } else {
            str = "@" + cVar.hashCode();
        }
        sb6.append(str);
        sb6.append(", serviceConnection=");
        if (serviceConnection == null) {
            str2 = "null";
        } else {
            str2 = "@" + serviceConnection.hashCode();
        }
        sb6.append(str2);
        sb6.append(", isConnecting=");
        sb6.append(z17);
        sb6.append(", connectTimeoutRunnable=");
        if (runnable == null) {
            str3 = "null";
        } else {
            str3 = "@" + runnable.hashCode();
        }
        sb6.append(str3);
        sb6.append('}');
        return sb6.toString();
    }
}
