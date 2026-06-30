package nx1;

/* loaded from: classes10.dex */
public final class m extends com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b3 {

    /* renamed from: y, reason: collision with root package name */
    public ix1.i f422832y;

    /* renamed from: z, reason: collision with root package name */
    public nx1.o f422833z;

    public m(nx1.l lVar) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b3, com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        boolean z17;
        synchronized (nx1.n.f422835s) {
            z17 = !nx1.n.f422834r.containsKey(this.f270757d);
        }
        if (!z17) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String str = this.f270757d;
            ((vf0.y1) x1Var).getClass();
            z17 = t21.d3.h(str) == null;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EditorVideoCompress", "remuxing job has been removed, filename %s", this.f270757d);
            return true;
        }
        c();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b3, com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        synchronized (nx1.n.f422835s) {
            nx1.n.f422834r.remove(this.f270757d);
        }
        nx1.o oVar = this.f422833z;
        if (oVar == null) {
            return false;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.o1) oVar).a(this.f270759f, this.f422832y);
        return false;
    }
}
