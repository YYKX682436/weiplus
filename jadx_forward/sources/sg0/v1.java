package sg0;

/* loaded from: classes8.dex */
public final class v1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.a2 f489360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f489361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(sg0.a2 a2Var, org.json.JSONObject jSONObject) {
        super(0);
        this.f489360d = a2Var;
        this.f489361e = jSONObject;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sg0.a2 a2Var = this.f489360d;
        kz5.h0.B(a2Var.f489204i, sg0.u1.f489350d);
        java.util.Iterator it = ((java.util.ArrayList) a2Var.f489204i).iterator();
        while (it.hasNext()) {
            ((sg0.k1) it.next()).getClass();
            org.json.JSONObject ret = this.f489361e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        }
        return jz5.f0.f384359a;
    }
}
