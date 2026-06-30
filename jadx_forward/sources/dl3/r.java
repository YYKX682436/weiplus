package dl3;

/* loaded from: classes13.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n01.b f316876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl3.s f316877e;

    public r(dl3.s sVar, n01.b bVar) {
        this.f316877e = sVar;
        this.f316876d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl3.s sVar = this.f316877e;
        dl3.i iVar = sVar.f316878a;
        n01.b bVar = this.f316876d;
        iVar.T(bVar.f415369a);
        sVar.f316878a.U(bVar);
        sVar.f316878a.A(bVar.f415369a);
    }
}
