package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes13.dex */
public class c0 extends p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f92800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f92801b;

    public c0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.util.concurrent.atomic.AtomicReference atomicReference, h.b bVar) {
        this.f92801b = componentCallbacksC1101xa17d4670;
        this.f92800a = atomicReference;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c
    public void a(java.lang.Object obj, z2.m mVar) {
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c cVar = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c) this.f92800a.get();
        if (cVar == null) {
            throw new java.lang.IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        cVar.a(obj, mVar);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c
    public void b() {
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c cVar = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c) this.f92800a.getAndSet(null);
        if (cVar != null) {
            cVar.b();
        }
    }
}
