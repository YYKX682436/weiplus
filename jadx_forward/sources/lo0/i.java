package lo0;

/* loaded from: classes14.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f401541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f401542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.util.Map map, java.util.HashMap hashMap) {
        super(1);
        this.f401541d = map;
        this.f401542e = hashMap;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String itemId = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemId, "itemId");
        lo0.k kVar = (lo0.k) this.f401541d.get(itemId);
        if (!(kVar == null)) {
            this.f401542e.put(kVar.f401551a, kVar);
        }
        return jz5.f0.f384359a;
    }
}
