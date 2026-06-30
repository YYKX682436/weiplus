package lo0;

/* loaded from: classes14.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f401513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401515g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, java.util.Map map, java.util.List list, java.util.List list2) {
        super(1);
        this.f401512d = str;
        this.f401513e = map;
        this.f401514f = list;
        this.f401515g = list2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject itemObj = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemObj, "itemObj");
        try {
            lo0.b0 b0Var = new lo0.b0(itemObj, this.f401512d, this.f401513e);
            this.f401514f.add(b0Var);
            lo0.b bVar = b0Var.f401506g;
            if (bVar != null) {
                this.f401515g.add(bVar);
            }
        } catch (lo0.u unused) {
        }
        return jz5.f0.f384359a;
    }
}
