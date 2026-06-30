package pk2;

/* loaded from: classes3.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.k0 f437363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f437364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f437365g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pk2.o9 o9Var, pk2.k0 k0Var, boolean z17, v65.n nVar) {
        super(2);
        this.f437362d = o9Var;
        this.f437363e = k0Var;
        this.f437364f = z17;
        this.f437365g = nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = this.f437362d.f437605a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modifyAnchorStatusFlag: succ=");
        sb6.append(booleanValue);
        sb6.append(", isAnchorLiving=");
        pk2.k0 k0Var = this.f437363e;
        sb6.append(k0Var.n());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (booleanValue) {
            boolean n17 = k0Var.n();
            boolean z17 = this.f437364f;
            if (n17) {
                df2.jc jcVar = (df2.jc) k0Var.f445960a.e(df2.jc.class);
                if (jcVar != null) {
                    jcVar.b7();
                }
                java.lang.Integer num = 1;
                int i17 = z17 ? 2 : 3;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("element", 6);
                if (num != null) {
                    num.intValue();
                    jSONObject.put("type", num.intValue());
                }
                jSONObject.put("sub_element", 8);
                jSONObject.put("sub_type", i17);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
            } else {
                java.lang.Integer num2 = 2;
                int i18 = z17 ? 10 : 11;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("element", 6);
                if (num2 != null) {
                    num2.intValue();
                    jSONObject2.put("type", num2.intValue());
                }
                jSONObject2.put("sub_element", 7);
                jSONObject2.put("sub_type", i18);
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.c1 c1Var = ml2.c1.f408858e;
                zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
            }
        }
        this.f437365g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
