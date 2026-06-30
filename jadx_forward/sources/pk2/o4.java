package pk2;

/* loaded from: classes3.dex */
public final class o4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437592h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437593i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437592h = helper.f437622i0;
        this.f437593i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14333x5924cb6c c14333x5924cb6c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        D(2);
        mf2.b0 b0Var = (if2.b) o9Var.e(yf2.z0.class);
        if (b0Var == null || !(b0Var instanceof jm2.c) || (c14333x5924cb6c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14333x5924cb6c) ((yf2.z0) ((jm2.c) b0Var)).S6(com.p314xaae8f345.mm.R.id.l0q)) == null) {
            return;
        }
        c14333x5924cb6c.h();
    }

    public final void D(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 64L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437593i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437592h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f80518xd4f4e112, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        D(1);
    }

    @Override // qk2.h
    public int y() {
        return this.f437592h;
    }
}
