package tl;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.n f501591d;

    public l(tl.n nVar) {
        this.f501591d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tl.n nVar = this.f501591d;
        nVar.f501594a.h();
        tl.a aVar = nVar.f501594a.f501658e;
        if (aVar != null) {
            aVar.a();
        }
    }
}
