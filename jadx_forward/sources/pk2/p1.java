package pk2;

/* loaded from: classes3.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f437668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.r1 f437670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f437671g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(boolean z17, pk2.o9 o9Var, pk2.r1 r1Var, v65.n nVar) {
        super(2);
        this.f437668d = z17;
        this.f437669e = o9Var;
        this.f437670f = r1Var;
        this.f437671g = nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean z17 = this.f437668d;
        java.lang.String string = z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dx_) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dx8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        pk2.o9 o9Var = this.f437669e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z17 ? o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573142dn5) : o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573140dn3));
        if (booleanValue) {
            ((mm2.o4) o9Var.c(mm2.o4.class)).F = z17 ? 1 : 0;
            pk2.r1 r1Var = this.f437670f;
            if (r1Var.f445961b == 1) {
                java.lang.Integer num = 1;
                int i17 = z17 ? 9 : 8;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("element", 6);
                if (num != null) {
                    num.intValue();
                    jSONObject.put("type", num.intValue());
                }
                jSONObject.put("sub_element", 6);
                jSONObject.put("sub_type", i17);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.c1 c1Var = ml2.c1.f408858e;
                zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c18;
                ml2.z4 z4Var = ml2.z4.f409893l1;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                ml2.e1[] e1VarArr = ml2.e1.f408906d;
                jSONObject2.put("type", z17 ? "0" : "1");
                zy2.zb.y6(zbVar2, z4Var, jSONObject2.toString(), null, 4, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2 n2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a;
            int i18 = o9Var.f437609c;
            int i19 = r1Var.f445961b;
            if (z17) {
                n2Var.e("enableLinkMic", (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_ENABLE", true);
                o9Var.j(qo0.b.Q3, bundle);
                if (i18 == 1) {
                    if (i19 == 1) {
                        i95.m c19 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                        zy2.zb zbVar3 = (zy2.zb) c19;
                        ml2.c1 c1Var2 = ml2.c1.f408858e;
                        ml2.r2 r2Var = ml2.r2.f409429e;
                        zy2.zb.j5(zbVar3, 15L, java.lang.String.valueOf(1), null, 4, null);
                    } else {
                        i95.m c27 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                        zy2.zb zbVar4 = (zy2.zb) c27;
                        ml2.z4 z4Var2 = ml2.z4.f409919x;
                        ml2.r2 r2Var2 = ml2.r2.f409429e;
                        zy2.zb.y6(zbVar4, z4Var2, java.lang.String.valueOf(1), null, 4, null);
                    }
                }
            } else {
                n2Var.e("disableLinkMic", (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_ENABLE", false);
                o9Var.j(qo0.b.Q3, bundle2);
                if (i18 == 1) {
                    if (i19 == 1) {
                        i95.m c28 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
                        zy2.zb zbVar5 = (zy2.zb) c28;
                        ml2.c1 c1Var3 = ml2.c1.f408858e;
                        ml2.r2 r2Var3 = ml2.r2.f409429e;
                        zy2.zb.j5(zbVar5, 15L, java.lang.String.valueOf(2), null, 4, null);
                    } else {
                        i95.m c29 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c29, "getService(...)");
                        zy2.zb zbVar6 = (zy2.zb) c29;
                        ml2.z4 z4Var3 = ml2.z4.f409919x;
                        ml2.r2 r2Var4 = ml2.r2.f409429e;
                        zy2.zb.y6(zbVar6, z4Var3, java.lang.String.valueOf(2), null, 4, null);
                    }
                }
            }
            if (r1Var.n()) {
                i95.m c37 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c37, "getService(...)");
                zy2.zb.T8((zy2.zb) c37, z17 ? ml2.t1.F : ml2.t1.G, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
            }
        } else {
            db5.t7.b(o9Var.f437611d, string + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cud));
        }
        this.f437671g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
