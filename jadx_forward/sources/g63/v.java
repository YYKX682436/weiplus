package g63;

/* loaded from: classes8.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.f0 f350710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g63.f0 f0Var) {
        super(2);
        this.f350710d = f0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        g63.t0 t0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List result = (java.util.List) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        g63.f0 f0Var = this.f350710d;
        if (booleanValue) {
            g63.j jVar = f0Var.f350640b;
            jVar.getClass();
            pm0.v.X(new g63.g(jVar, result));
            g63.t0 t0Var2 = f0Var.f350639a;
            if (t0Var2 != null) {
                pm0.v.X(new g63.g0((com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025) t0Var2));
            }
            if (result.size() < 15 && (t0Var = f0Var.f350639a) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025 activityC16045xfe36c025 = (com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025) t0Var;
                activityC16045xfe36c025.f223525h = false;
                activityC16045xfe36c025.T6().f83286e.m82688x390c1d00(false);
            }
            pm0.v.X(new g63.t(f0Var));
            f0Var.a();
            int x17 = f0Var.f350640b.x();
            long j17 = e63.a.f331350a;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d c6633xea2e527d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d();
            c6633xea2e527d.f139873d = 2L;
            c6633xea2e527d.f139874e = 202L;
            c6633xea2e527d.f139875f = 0L;
            c6633xea2e527d.f139876g = 1L;
            c6633xea2e527d.f139877h = j17;
            c6633xea2e527d.f139884o = x17;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("list_state", x17 == 0 ? 2 : 1);
            c6633xea2e527d.p(java.net.URLEncoder.encode(jSONObject.toString()));
            c6633xea2e527d.k();
        } else {
            g63.t0 t0Var3 = f0Var.f350639a;
            if (t0Var3 != null) {
                pm0.v.X(new g63.i0((com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025) t0Var3));
            }
        }
        return jz5.f0.f384359a;
    }
}
