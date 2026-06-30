package i85;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f371193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i85.c f371194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f371195f;

    public a(java.lang.Throwable th6, i85.c cVar, java.lang.reflect.Method method) {
        this.f371193d = th6;
        this.f371194e = cVar;
        this.f371195f = method;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String[] strArr = new java.lang.String[2];
        strArr[0] = this.f371194e.a();
        java.lang.reflect.Method method = this.f371195f;
        strArr[1] = java.lang.String.valueOf(method != null ? method.getName() : null);
        ap.a.a(1, "amsCall", this.f371193d, null, strArr);
    }
}
