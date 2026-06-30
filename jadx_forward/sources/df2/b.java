package df2;

/* loaded from: classes3.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.g f311296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(df2.g gVar) {
        super(0);
        this.f311296d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f311296d.m7("clickClose", false);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.U1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 3);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        return jz5.f0.f384359a;
    }
}
