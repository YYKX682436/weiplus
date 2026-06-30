package gs0;

/* loaded from: classes14.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.w f356553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs0.h f356554e;

    public s(gs0.w wVar, rs0.h hVar) {
        this.f356553d = wVar;
        this.f356554e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gs0.w wVar = this.f356553d;
        os0.g gVar = wVar.f356571h;
        if (gVar != null) {
            gVar.n();
        }
        rs0.i.f480829a.u(this.f356554e);
        wVar.f356572i = null;
    }
}
