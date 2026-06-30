package cb;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f40106a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.tasks.TaskCompletionSource f40107b = new com.google.android.gms.tasks.TaskCompletionSource();

    /* renamed from: c, reason: collision with root package name */
    public final int f40108c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f40109d;

    public c(int i17, int i18, android.os.Bundle bundle) {
        this.f40106a = i17;
        this.f40108c = i18;
        this.f40109d = bundle;
    }

    public final void a(java.lang.Object obj) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this).length() + 16 + java.lang.String.valueOf(obj).length());
        }
        this.f40107b.setResult(obj);
    }

    public final void b(cb.d dVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this).length() + 14 + java.lang.String.valueOf(dVar).length());
        }
        this.f40107b.setException(dVar);
    }

    public abstract void c(android.os.Bundle bundle);

    public abstract boolean d();

    public java.lang.String toString() {
        boolean d17 = d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(55);
        sb6.append("Request { what=");
        sb6.append(this.f40108c);
        sb6.append(" id=");
        sb6.append(this.f40106a);
        sb6.append(" oneWay=");
        sb6.append(d17);
        sb6.append("}");
        return sb6.toString();
    }
}
