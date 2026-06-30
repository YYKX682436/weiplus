package ju1;

/* loaded from: classes9.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju1.i f383245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f383246e;

    public f(ju1.i iVar, yz5.a aVar) {
        this.f383245d = iVar;
        this.f383246e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ju1.i iVar = this.f383245d;
        iVar.f383262d = iVar.f3639x46306858.getHeight();
        iVar.f383263e = iVar.f3639x46306858.getWidth();
        this.f383246e.mo152xb9724478();
    }
}
