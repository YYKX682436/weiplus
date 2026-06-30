package pk2;

/* loaded from: classes3.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f437874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.d0 f437875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f437877g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z17, pk2.d0 d0Var, pk2.o9 o9Var, v65.n nVar) {
        super(2);
        this.f437874d = z17;
        this.f437875e = d0Var;
        this.f437876f = o9Var;
        this.f437877g = nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            boolean z17 = this.f437874d;
            ml2.t1 t1Var = z17 ? ml2.t1.B : ml2.t1.C;
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            pk2.d0 d0Var = this.f437875e;
            zy2.zb.T8(zbVar, t1Var, j0Var.bj(d0Var.n() ? ml2.s1.f409449f : ml2.s1.f409448e), null, null, null, null, false, 124, null);
            if (this.f437876f.f437609c == 1) {
                if (z17) {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                    ml2.j0.f409116i.T.f409204r++;
                    if (d0Var.n()) {
                        i95.m c18 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                        zy2.zb zbVar2 = (zy2.zb) c18;
                        ml2.z4 z4Var = ml2.z4.f409887h;
                        ml2.d1[] d1VarArr = ml2.d1.f408883d;
                        zy2.zb.y6(zbVar2, z4Var, java.lang.String.valueOf(2), null, 4, null);
                        java.lang.Integer num = 1;
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("element", 13);
                        if (num != null) {
                            num.intValue();
                            jSONObject.put("type", num.intValue());
                        }
                        jSONObject.put("sub_element", 1);
                        jSONObject.put("sub_type", 1);
                        i95.m c19 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                        zy2.zb.y6((zy2.zb) c19, ml2.z4.D1, jSONObject.toString(), null, 4, null);
                    } else {
                        java.lang.Integer num2 = 1;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("element", 6);
                        if (num2 != null) {
                            num2.intValue();
                            jSONObject2.put("type", num2.intValue());
                        }
                        jSONObject2.put("sub_element", 1);
                        jSONObject2.put("sub_type", 1);
                        i95.m c27 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                        zy2.zb zbVar3 = (zy2.zb) c27;
                        ml2.c1 c1Var = ml2.c1.f408858e;
                        zy2.zb.j5(zbVar3, 37L, jSONObject2.toString(), null, 4, null);
                    }
                } else {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                    ml2.j0.f409116i.T.f409203q++;
                    if (d0Var.n()) {
                        i95.m c28 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
                        zy2.zb zbVar4 = (zy2.zb) c28;
                        ml2.z4 z4Var2 = ml2.z4.f409887h;
                        ml2.d1[] d1VarArr2 = ml2.d1.f408883d;
                        zy2.zb.y6(zbVar4, z4Var2, java.lang.String.valueOf(1), null, 4, null);
                        java.lang.Integer num3 = 1;
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("element", 13);
                        if (num3 != null) {
                            num3.intValue();
                            jSONObject3.put("type", num3.intValue());
                        }
                        jSONObject3.put("sub_element", 1);
                        jSONObject3.put("sub_type", 2);
                        i95.m c29 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c29, "getService(...)");
                        zy2.zb.y6((zy2.zb) c29, ml2.z4.D1, jSONObject3.toString(), null, 4, null);
                    } else {
                        java.lang.Integer num4 = 1;
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        jSONObject4.put("element", 6);
                        if (num4 != null) {
                            num4.intValue();
                            jSONObject4.put("type", num4.intValue());
                        }
                        jSONObject4.put("sub_element", 1);
                        jSONObject4.put("sub_type", 2);
                        i95.m c37 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c37, "getService(...)");
                        zy2.zb zbVar5 = (zy2.zb) c37;
                        ml2.c1 c1Var2 = ml2.c1.f408858e;
                        zy2.zb.j5(zbVar5, 37L, jSONObject4.toString(), null, 4, null);
                    }
                }
            }
        }
        this.f437877g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
