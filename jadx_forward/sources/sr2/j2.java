package sr2;

/* loaded from: classes2.dex */
public final class j2 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f493132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493133b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f493134c;

    public j2(android.view.View view, java.lang.String str, sr2.y2 y2Var) {
        this.f493132a = view;
        this.f493133b = str;
        this.f493134c = y2Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        android.content.Context context = this.f493132a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b7 == null || (str2 = c19783xd9a946b7.m76317x2a881cd1()) == null) {
            str2 = "";
        }
        hashMap.put("finder_post_sessionid", str2);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("post_poi_view", this.f493133b)) {
            sr2.y2 y2Var = this.f493134c;
            int i17 = 1;
            hashMap.put("poi_exp_type", java.lang.Integer.valueOf(y2Var.T6() ? 3 : (y2Var.U6() || y2Var.R6()) ? 2 : 1));
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue()) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                hashMap.put("enter_scene", java.lang.Integer.valueOf(c19783xd9a946b72 != null ? c19783xd9a946b72.m76275xbcc8608a() : 0));
                if (y2Var.m158359x1e885992().getBooleanExtra("saveLocation", false)) {
                    ya2.p1 p1Var = y2Var.f493333d;
                    if (p1Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                        throw null;
                    }
                    r45.ze2 ze2Var = ((yv2.b) p1Var).f547735h;
                    if (ze2Var != null && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var.m75945x2fec8307(3)) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var.m75945x2fec8307(2)))) {
                        i17 = 0;
                    }
                }
                hashMap.put("if_clk_empty", java.lang.Integer.valueOf(i17));
            }
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.b(V6, hashMap);
    }
}
