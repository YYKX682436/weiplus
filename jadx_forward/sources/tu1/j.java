package tu1;

/* loaded from: classes13.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu1.o f503634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xu1.c f503635e;

    public j(tu1.o oVar, xu1.c cVar) {
        this.f503634d = oVar;
        this.f503635e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f503634d.f503661s;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f503635e);
        }
    }
}
