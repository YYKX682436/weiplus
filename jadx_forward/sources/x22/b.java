package x22;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x22.c f533094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f533095f;

    public b(java.lang.String str, x22.c cVar, yz5.l lVar) {
        this.f533093d = str;
        this.f533094e = cVar;
        this.f533095f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new p22.a(this.f533093d).l().K(new x22.a(this.f533094e, this.f533095f));
    }
}
