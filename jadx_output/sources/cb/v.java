package cb;

/* loaded from: classes13.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f40188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cb.u f40189e;

    public v(cb.u uVar, android.content.Intent intent) {
        this.f40189e = uVar;
        this.f40188d = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new java.lang.StringBuilder(java.lang.String.valueOf(this.f40188d.getAction()).length() + 61);
        this.f40189e.a();
    }
}
