package tu1;

/* loaded from: classes13.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu1.o f503622d;

    public b(tu1.o oVar) {
        this.f503622d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xu1.c cVar = xu1.c.f538728i;
        tu1.o oVar = this.f503622d;
        oVar.f503660r = cVar;
        yz5.l lVar = oVar.f503661s;
        if (lVar != null) {
            lVar.mo146xb9724478(cVar);
        }
    }
}
