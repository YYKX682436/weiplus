package ph;

/* loaded from: classes12.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.t f435811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f435812e;

    public r(ph.t tVar, android.content.Intent intent) {
        this.f435811d = tVar;
        this.f435812e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f435811d.j(this.f435812e);
    }
}
