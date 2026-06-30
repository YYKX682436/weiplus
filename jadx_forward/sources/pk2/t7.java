package pk2;

/* loaded from: classes3.dex */
public final class t7 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437799h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437800i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437799h = helper.D;
        this.f437800i = "anchorlive.more.shareqrcode";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        pk2.g8 g8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        pk2.o9 o9Var2 = this.f445960a;
        if (o9Var2 == null || (abstractActivityC21394xb3d2c0cf = o9Var2.f437611d) == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.c3[] c3VarArr = ml2.c3.f408864d;
        java.lang.String jSONObject2 = jSONObject.put("type", 2).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.B1, jSONObject2, null, 4, null);
        pk2.d9 d9Var = o9Var.f437615f;
        if (d9Var == null || (g8Var = d9Var.f437191a) == null) {
            return;
        }
        pk2.g8.a(g8Var, null, null, new pk2.s7(abstractActivityC21394xb3d2c0cf, o9Var, null), 3, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437800i;
    }

    @Override // qk2.f
    public boolean o() {
        return pm0.v.z(((mm2.c1) this.f445960a.c(mm2.c1.class)).Q1, 16384);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437799h;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        java.lang.String string = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f79872xf6d61b33, abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.c3[] c3VarArr = ml2.c3.f408864d;
        java.lang.String jSONObject2 = jSONObject.put("type", 1).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.B1, jSONObject2, null, 4, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437799h;
    }
}
