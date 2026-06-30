package lo0;

/* loaded from: classes14.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f401583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lo0.r0 f401584f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401585g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401586h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(java.lang.String str, java.util.Map map, lo0.r0 r0Var, java.util.List list, java.util.List list2) {
        super(1);
        this.f401582d = str;
        this.f401583e = map;
        this.f401584f = r0Var;
        this.f401585g = list;
        this.f401586h = list2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject itemObj = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemObj, "itemObj");
        try {
            java.lang.String str = this.f401582d;
            java.util.Map map = this.f401583e;
            lo0.r0 r0Var = this.f401584f;
            if (r0Var == null) {
                r0Var = new lo0.r0(0, 0, 0, null, null, null);
            }
            lo0.k0 k0Var = new lo0.k0(itemObj, str, map, r0Var);
            this.f401585g.add(k0Var);
            java.util.List list = this.f401586h;
            lo0.b bVar = k0Var.f401574g;
            if (bVar != null) {
                list.add(bVar);
            }
            list.addAll(((java.util.LinkedHashMap) k0Var.f401575h.f401519b).values());
        } catch (lo0.u unused) {
        }
        return jz5.f0.f384359a;
    }
}
