package te2;

/* loaded from: classes3.dex */
public final class t1 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f499955a = new java.util.LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te2.u1 f499956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf2.e0 f499957c;

    public t1(te2.u1 u1Var, sf2.e0 e0Var) {
        this.f499956b = u1Var;
        this.f499957c = e0Var;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.lang.String valueOf;
        java.util.List list;
        bm2.w wVar;
        dk2.vg vgVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            if (k3Var instanceof bm2.x) {
                boolean x17 = dk2.ef.f314905a.x();
                te2.u1 u1Var = this.f499956b;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = u1Var.m166328x92013f13().mo7946xf939df19();
                bm2.a0 a0Var = mo7946xf939df19 instanceof bm2.a0 ? (bm2.a0) mo7946xf939df19 : null;
                r45.d22 d22Var = (a0Var == null || (list = a0Var.f103282f) == null || (wVar = (bm2.w) kz5.n0.a0(list, ((bm2.x) k3Var).m8183xf806b362())) == null || (vgVar = wVar.f103927b) == null) ? null : vgVar.f315787a;
                if (d22Var == null || (valueOf = d22Var.m75945x2fec8307(9)) == null) {
                    valueOf = java.lang.String.valueOf(d22Var != null ? java.lang.Integer.valueOf(d22Var.m75939xb282bd08(0)) : null);
                }
                java.util.Set set = this.f499955a;
                if (!set.contains(valueOf)) {
                    set.add(valueOf);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", 2);
                    jSONObject.put("tab_type", u1Var.m166331xfb85f7b0().f471622d);
                    jSONObject.put("base_listenid", d22Var != null ? d22Var.m75945x2fec8307(9) : null);
                    sf2.e0 e0Var = this.f499957c;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e0Var.f488648q, "")) {
                        jSONObject.put("ai_msg_id", e0Var.f488648q);
                    }
                    if (x17) {
                        i95.m c17 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        zy2.zb.y6((zy2.zb) c17, ml2.z4.O1, jSONObject.toString(), null, 4, null);
                    } else {
                        i95.m c18 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                        ml2.c1 c1Var = ml2.c1.f408858e;
                        zy2.zb.j5((zy2.zb) c18, 48L, jSONObject.toString(), null, 4, null);
                    }
                }
            }
        }
    }
}
