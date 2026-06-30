package pk2;

/* loaded from: classes3.dex */
public final class o2 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437586h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437587i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437586h = helper.S;
        this.f437587i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        int i17 = this.f445961b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17 == 0 ? 2 : i17 == 3 ? 1 : -1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 11);
        jSONObject.put("type", 2);
        if (valueOf == null || valueOf.intValue() != -1) {
            jSONObject.put("userType", valueOf);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerInfo = ");
        pk2.o9 o9Var2 = this.f445960a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = ((mm2.c1) o9Var2.f437607b.a(mm2.c1.class)).f410355i5;
        if (c19786x6a1e2862 == null || (obj = pm0.b0.g(c19786x6a1e2862)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        java.lang.String sb7 = sb6.toString();
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, sb7, null);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = ((mm2.c1) o9Var2.f437607b.a(mm2.c1.class)).f410355i5;
        if (c19786x6a1e28622 != null) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Oj(o9Var2.f437611d, c19786x6a1e28622, null);
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437587i;
    }

    @Override // qk2.f
    public boolean o() {
        zl2.r4 r4Var = zl2.r4.f555483a;
        pk2.o9 o9Var = this.f445960a;
        return r4Var.y1(o9Var.f437607b) && ((mm2.c1) o9Var.f437607b.a(mm2.c1.class)).f410355i5 != null;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f445961b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17 == 0 ? 2 : i17 == 3 ? 1 : -1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 11);
        jSONObject.put("type", 1);
        if (valueOf == null || valueOf.intValue() != -1) {
            jSONObject.put("userType", valueOf);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        java.lang.String string = o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m98);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        s(menu, this.f437586h, string, com.p314xaae8f345.mm.R.raw.f80019x988cbbc4);
    }

    @Override // qk2.h
    public int y() {
        return this.f437586h;
    }
}
