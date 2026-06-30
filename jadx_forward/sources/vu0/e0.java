package vu0;

/* loaded from: classes5.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.o0 f521614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(vu0.o0 o0Var, java.lang.String str) {
        super(1);
        this.f521614d = o0Var;
        this.f521615e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        wu0.d dVar = this.f521614d.f521666f;
        dVar.getClass();
        java.lang.String groupID = this.f521615e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupID, "groupID");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = dVar.f531188b;
        wu0.b bVar = (wu0.b) concurrentHashMap.get(groupID);
        concurrentHashMap.put(groupID, bVar != null ? wu0.b.a(bVar, floatValue, 0.0f, false, 6, null) : new wu0.b(floatValue, 0.0f, false, 4, null));
        dVar.a();
        return jz5.f0.f384359a;
    }
}
