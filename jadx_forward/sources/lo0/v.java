package lo0;

/* loaded from: classes14.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f401618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f401619f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f401620g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, java.util.Map map, java.util.HashMap hashMap, java.util.HashMap hashMap2) {
        super(1);
        this.f401617d = str;
        this.f401618e = map;
        this.f401619f = hashMap;
        this.f401620g = hashMap2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject itemObj = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemObj, "itemObj");
        try {
            lo0.k kVar = new lo0.k(itemObj, this.f401617d, this.f401618e);
            java.lang.String str = kVar.f401566p;
            java.util.HashMap hashMap = this.f401619f;
            java.util.List list = (java.util.List) hashMap.get(str);
            if (list == null) {
                list = new java.util.ArrayList();
                hashMap.put(str, list);
            }
            list.add(kVar);
            this.f401620g.put(kVar.f401551a, kVar);
        } catch (lo0.u unused) {
        }
        return jz5.f0.f384359a;
    }
}
