package cb;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f121639a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc f121640b = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc();

    /* renamed from: c, reason: collision with root package name */
    public final int f121641c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f121642d;

    public c(int i17, int i18, android.os.Bundle bundle) {
        this.f121639a = i17;
        this.f121641c = i18;
        this.f121642d = bundle;
    }

    public final void a(java.lang.Object obj) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this).length() + 16 + java.lang.String.valueOf(obj).length());
        }
        this.f121640b.m19604x209a1f1f(obj);
    }

    public final void b(cb.d dVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this).length() + 14 + java.lang.String.valueOf(dVar).length());
        }
        this.f121640b.m19603xb411020d(dVar);
    }

    public abstract void c(android.os.Bundle bundle);

    public abstract boolean d();

    /* renamed from: toString */
    public java.lang.String m14584x9616526c() {
        boolean d17 = d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(55);
        sb6.append("Request { what=");
        sb6.append(this.f121641c);
        sb6.append(" id=");
        sb6.append(this.f121639a);
        sb6.append(" oneWay=");
        sb6.append(d17);
        sb6.append("}");
        return sb6.toString();
    }
}
