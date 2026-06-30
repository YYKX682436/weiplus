package im2;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.k f373913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mo0.a f373914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ug5.v f373915f;

    public i(im2.k kVar, mo0.a aVar, ug5.v vVar) {
        this.f373913d = kVar;
        this.f373914e = aVar;
        this.f373915f = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        im2.k kVar = this.f373913d;
        if (kVar.f373940e) {
            kVar.h(this.f373914e, this.f373915f);
        }
    }
}
