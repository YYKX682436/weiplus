package y53;

/* loaded from: classes5.dex */
public final class r implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f541030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u53.x f541031b;

    public r(java.util.HashMap hashMap, u53.x xVar) {
        this.f541030a = hashMap;
        this.f541031b = xVar;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        java.util.HashMap hashMap = this.f541030a;
        hashMap.putAll(map);
        this.f541031b.a(hashMap);
    }
}
