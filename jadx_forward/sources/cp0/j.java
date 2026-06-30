package cp0;

/* loaded from: classes15.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp0.l f302283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ip0.a f302284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hp0.e f302285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 f302286g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(cp0.l lVar, ip0.a aVar, hp0.e eVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var) {
        super(0);
        this.f302283d = lVar;
        this.f302284e = aVar;
        this.f302285f = eVar;
        this.f302286g = w1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ip0.a aVar;
        cp0.l lVar = this.f302283d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = lVar.f302291a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            aVar = this.f302284e;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((jz5.l) entry.getValue()).f384366d, aVar)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cp0.l.f302290d, "onDataItemLoadEnd can not found " + aVar);
        }
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.Object obj = this.f302285f.f364443b;
            if (obj != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cp0.l.f302290d, "dispatch " + ((jz5.l) entry2.getValue()).f384367e + " resource " + obj + " url " + aVar + "  try get:" + ((cp0.f) ((jz5.l) entry2.getValue()).f384367e).f302278a.a() + " makeSureUIThread: " + this.f302286g);
                cp0.f fVar = (cp0.f) ((jz5.l) entry2.getValue()).f384367e;
                cp0.i iVar = new cp0.i(lVar, entry2, aVar);
                try {
                    fVar.a(obj, iVar);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cp0.l.f302290d, "exception " + e17.getMessage());
                    iVar.a(true);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
