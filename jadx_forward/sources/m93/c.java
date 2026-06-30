package m93;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m93.g f406554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m93.d f406555e;

    public c(m93.d dVar, m93.g gVar) {
        this.f406555e = dVar;
        this.f406554d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m93.d dVar = this.f406555e;
        m93.i iVar = dVar.f406559d;
        m93.f fVar = new m93.f(iVar, null);
        fVar.f406564b = dVar.f406557b;
        fVar.f406563a = this.f406554d;
        ((java.util.concurrent.ConcurrentHashMap) iVar.f406572e).put(dVar.f406556a + "_" + java.lang.Integer.toString(dVar.f406558c), fVar);
    }
}
