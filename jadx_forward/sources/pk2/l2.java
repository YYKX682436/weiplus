package pk2;

/* loaded from: classes3.dex */
public final class l2 extends qk2.h {

    /* renamed from: m, reason: collision with root package name */
    public static final pk2.i2 f437471m = new pk2.i2(null);

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f437472n = "";

    /* renamed from: h, reason: collision with root package name */
    public r45.v71 f437473h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f437474i;

    /* renamed from: j, reason: collision with root package name */
    public final int f437475j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f437476k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f437477l;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f437478r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437475j = helper.U;
        this.f437476k = "";
        this.f437477l = true;
        this.f437478r = true;
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        if (n()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 14);
            jSONObject.put("type", 2);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 10);
            jSONObject2.put("type", 2);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5((zy2.zb) c18, 37L, jSONObject2.toString(), null, 4, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 j17 = j();
        if (j17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(j17, null, null, new pk2.k2(this, o9Var, null), 3, null);
        }
    }

    @Override // qk2.f
    public boolean h() {
        return this.f437477l;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437476k;
    }

    @Override // qk2.f
    public boolean o() {
        boolean n17 = n();
        pk2.o9 o9Var = this.f445960a;
        if (n17 && zl2.r4.F1(o9Var.f437607b)) {
            return false;
        }
        if (!n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) o9Var.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
            if (r5Var != null ? r5Var.b7(5) : false) {
                return false;
            }
        }
        return true;
    }

    @Override // qk2.f
    public boolean r() {
        return this.f437478r;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437475j;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f79958x80dde837, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f409116i;
        ml2.l1 l1Var = n() ? ml2.l1.f409218i : ml2.l1.f409217h;
        y4Var.getClass();
        y4Var.f409828e0 = l1Var;
        if (n()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 14);
            jSONObject.put("type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 10);
            jSONObject2.put("type", 1);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 j17 = j();
        jz5.f0 f0Var = null;
        if (j17 != null) {
            this.f437474i = p3325xe03a0797.p3326xc267989b.l.d(j17, null, null, new pk2.j2(this, o9Var, null), 3, null);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o9Var.f437605a, "addItem: scope is null, scene=" + this.f445961b);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f437475j;
    }
}
