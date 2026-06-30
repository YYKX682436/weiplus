package tl;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.n f501593d;

    public m(tl.n nVar) {
        this.f501593d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tl.n nVar = this.f501593d;
        nVar.f501594a.h();
        tl.a aVar = nVar.f501594a.f501658e;
        if (aVar != null) {
            aVar.a();
        }
    }
}
