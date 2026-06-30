package tl;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.n f501589d;

    public k(tl.n nVar) {
        this.f501589d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tl.n nVar = this.f501589d;
        nVar.f501594a.h();
        tl.a aVar = nVar.f501594a.f501658e;
        if (aVar != null) {
            aVar.a();
        }
    }
}
