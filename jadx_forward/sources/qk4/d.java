package qk4;

/* loaded from: classes10.dex */
public final class d implements pk4.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qk4.f f445972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qk4.a f445973b;

    public d(qk4.f fVar, qk4.a aVar) {
        this.f445972a = fVar;
        this.f445973b = aVar;
    }

    public void a() {
        qk4.f fVar = this.f445972a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fVar.f445981f;
        qk4.a aVar = this.f445973b;
        concurrentHashMap.remove(aVar);
        fVar.f445980e.add(aVar);
        kk4.v player = ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806) aVar).getPlayer();
        if (player != null) {
            player.f390117i = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f445979d, "recycle videoView " + aVar.hashCode() + " idleViews:" + fVar.f445980e.size() + " busyVideoViewMap:" + fVar.f445981f.size());
    }
}
