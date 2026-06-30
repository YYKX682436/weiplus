package rx4;

/* loaded from: classes.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f482823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(java.util.List list) {
        super(1);
        this.f482823d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f482823d.add(kz5.c1.k(new jz5.l("query", it.optString("query")), new jz5.l(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Integer.valueOf(it.optInt(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)))));
        return jz5.f0.f384359a;
    }
}
