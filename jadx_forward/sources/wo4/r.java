package wo4;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f529820d;

    public r(wo4.y yVar) {
        this.f529820d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wo4.y yVar = this.f529820d;
        yz5.r rVar = yVar.f529845s;
        if (rVar != null) {
            rVar.C("", yVar.f529847u, java.lang.Boolean.TRUE, -1);
        }
    }
}
