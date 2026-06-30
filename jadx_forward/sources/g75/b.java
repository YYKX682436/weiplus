package g75;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g75.f f350881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.b f350882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g75.f fVar, j75.b bVar) {
        super(0);
        this.f350881d = fVar;
        this.f350882e = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = g75.f.f350895c;
        g75.f fVar = this.f350881d;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) concurrentHashMap.get(fVar.i());
        if (copyOnWriteArrayList != null) {
            if (!copyOnWriteArrayList.isEmpty()) {
                concurrentHashMap.put(fVar.i(), new java.util.concurrent.CopyOnWriteArrayList());
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    g75.f fVar2 = (g75.f) ((java.lang.ref.WeakReference) it.next()).get();
                    if (fVar2 != null) {
                        g75.z zVar = (g75.z) ((g75.a0) this.f350882e).f350880b.c();
                        g75.r rVar = fVar2.f350934a;
                        rVar.e(0, zVar);
                        rVar.c();
                    }
                }
            }
            fVar.i();
            copyOnWriteArrayList.size();
        }
        return jz5.f0.f384359a;
    }
}
