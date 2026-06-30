package y53;

/* loaded from: classes5.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f541032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y53.x f541033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u53.x f541034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.HashMap hashMap, y53.x xVar, u53.x xVar2) {
        super(2);
        this.f541032d = hashMap;
        this.f541033e = xVar;
        this.f541034f = xVar2;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map resultMap = (java.util.Map) obj;
        java.util.List remain = (java.util.List) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultMap, "resultMap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remain, "remain");
        java.util.HashMap hashMap = this.f541032d;
        hashMap.putAll(resultMap);
        boolean z17 = !remain.isEmpty();
        u53.x xVar = this.f541034f;
        if (z17) {
            y53.r rVar = new y53.r(hashMap, xVar);
            y53.x xVar2 = this.f541033e;
            xVar2.getClass();
            new w53.d(new java.util.LinkedList(remain)).l().H(new y53.u(remain, rVar, new java.util.HashMap(), xVar2));
        } else {
            xVar.a(hashMap);
        }
        return jz5.f0.f384359a;
    }
}
