package ph;

/* loaded from: classes12.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.t f435802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f435803e;

    public m(ph.t tVar, android.content.Intent intent) {
        this.f435802d = tVar;
        this.f435803e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f435802d.h(this.f435803e);
    }
}
