package x11;

/* loaded from: classes12.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x11.t f532920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x11.a f532921e;

    public s(x11.t tVar, x11.a aVar) {
        this.f532920d = tVar;
        this.f532921e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x11.t tVar = this.f532920d;
        tVar.f532933q = true;
        ((java.util.LinkedList) tVar.f532935s).add(this.f532921e);
        do {
        } while (tVar.g());
        tVar.f532933q = false;
    }
}
