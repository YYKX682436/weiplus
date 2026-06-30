package pk2;

/* loaded from: classes3.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.i1 f437293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f437294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f437295g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(pk2.o9 o9Var, pk2.i1 i1Var, boolean z17, v65.n nVar) {
        super(2);
        this.f437292d = o9Var;
        this.f437293e = i1Var;
        this.f437294f = z17;
        this.f437295g = nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean z17 = this.f437294f;
        pk2.o9 o9Var = this.f437292d;
        if (!booleanValue) {
            java.lang.String string = z17 ? o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwl) : o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            db5.t7.b(o9Var.f437611d, string + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cud));
        } else if (o9Var.f437609c == 1) {
            if (this.f437293e.n()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("element", 6);
                jSONObject.put("type", 1);
                jSONObject.put("sub_element", 6);
                jSONObject.put("sub_type", z17 ? 2 : 3);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
            } else {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("element", 6);
                jSONObject2.put("type", 1);
                jSONObject2.put("sub_element", 5);
                jSONObject2.put("sub_type", z17 ? 6 : 7);
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.c1 c1Var = ml2.c1.f408858e;
                zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
            }
        }
        this.f437295g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
