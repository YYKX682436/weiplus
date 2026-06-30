package cb;

/* loaded from: classes13.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f121721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cb.u f121722e;

    public v(cb.u uVar, android.content.Intent intent) {
        this.f121722e = uVar;
        this.f121721d = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new java.lang.StringBuilder(java.lang.String.valueOf(this.f121721d.getAction()).length() + 61);
        this.f121722e.a();
    }
}
