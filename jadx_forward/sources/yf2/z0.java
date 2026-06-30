package yf2;

/* loaded from: classes3.dex */
public final class z0 extends if2.b implements w25.e, if2.e, jm2.c {

    /* renamed from: m, reason: collision with root package name */
    public ya2.p1 f543357m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f543358n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f543359o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public static final boolean Z6(yf2.z0 z0Var, r45.d64 d64Var, w25.e eVar) {
        z0Var.getClass();
        if (!zl2.r4.f555483a.w1()) {
            return false;
        }
        ((dn3.f) ((w25.f) i95.n0.c(w25.f.class))).wi(7, d64Var, false, eVar);
        return true;
    }

    public final r45.ze2 a7() {
        r45.ze2 ze2Var = (r45.ze2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) getStore().m56796xbba4bfc0(mm2.g1.class)).f410606n).mo144003x754a37bb();
        if (ze2Var != null) {
            return ze2Var;
        }
        pf5.u uVar = pf5.u.f435469a;
        if (!((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostLocationWidget", "getLocation no permission");
            return null;
        }
        r45.ze2 ze2Var2 = new r45.ze2();
        jz5.l P6 = ((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).P6();
        ze2Var2.set(1, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        ze2Var2.set(0, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        return ze2Var2;
    }

    @Override // w25.e
    public void i3(java.lang.String str, java.util.List list) {
        if (this.f543358n || this.f543359o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostLocationWidget", "#onGetLbsLifes isDestroy=" + this.f543358n + " ignore=" + this.f543359o);
            return;
        }
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "get lbsLife fail");
            ya2.p1 p1Var = this.f543357m;
            if (p1Var != null) {
                ((yv2.b) p1Var).e();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "get lbsLife success");
        ya2.p1 p1Var2 = this.f543357m;
        if (p1Var2 != null) {
            ((yv2.b) p1Var2).e();
        }
        ya2.p1 p1Var3 = this.f543357m;
        if (p1Var3 != null) {
            r45.c64 lbsLife = (r45.c64) kz5.n0.X(list);
            yv2.b bVar = (yv2.b) p1Var3;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lbsLife, "lbsLife");
            jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
            float floatValue = ((java.lang.Number) P6.f384366d).floatValue();
            float floatValue2 = ((java.lang.Number) P6.f384367e).floatValue();
            if (bVar.f547738n) {
                bVar.f547739o = true;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    bVar.f();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a, 0, bVar.f547735h, 0, 4, null);
                    return;
                }
                android.content.Intent intent = bVar.f547737m;
                if (intent == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                    throw null;
                }
                intent.putExtra("saveLocation", true);
                android.content.Intent intent2 = bVar.f547737m;
                if (intent2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                    throw null;
                }
                intent2.putExtra("get_poi_name", "");
                android.content.Intent intent3 = bVar.f547737m;
                if (intent3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                    throw null;
                }
                intent3.putExtra("get_city", str == null ? "" : str);
                android.content.Intent intent4 = bVar.f547737m;
                if (intent4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                    throw null;
                }
                intent4.putExtra("get_lat", floatValue2);
                android.content.Intent intent5 = bVar.f547737m;
                if (intent5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                    throw null;
                }
                intent5.putExtra("get_lng", floatValue);
                android.content.Intent intent6 = bVar.f547737m;
                if (intent6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                    throw null;
                }
                intent6.putExtra("get_poi_classify_type", lbsLife.f452852p);
                android.content.Intent intent7 = bVar.f547737m;
                if (intent7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                    throw null;
                }
                intent7.putExtra("get_poi_classify_id", "");
                bVar.d(false);
                r45.ze2 ze2Var = bVar.f547735h;
                if (ze2Var != null) {
                    android.os.Bundle bundle = bVar.f547736i;
                    if (bundle == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postData");
                        throw null;
                    }
                    bundle.putByteArray("post_location", ze2Var.mo14344x5f01b1f6());
                }
                bVar.a().mo57397x15487687(str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a, 1, bVar.f547735h, 0, 4, null);
            }
        }
    }

    @Override // if2.e
    /* renamed from: onActivityResult */
    public void mo57866x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 == 20000 && intent != null && zl2.r4.f555483a.y1(getStore().getLiveRoomData())) {
            r45.ze2 ze2Var = new r45.ze2();
            java.lang.String stringExtra = intent.getStringExtra("get_poi_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            ze2Var.set(3, stringExtra);
            java.lang.String stringExtra2 = intent.getStringExtra("get_city");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            ze2Var.set(2, stringExtra2);
            ze2Var.set(1, java.lang.Float.valueOf(intent.getFloatExtra("get_lat", 0.0f)));
            ze2Var.set(0, java.lang.Float.valueOf(intent.getFloatExtra("get_lng", 0.0f)));
            java.lang.String stringExtra3 = intent.getStringExtra("get_poi_address");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            ze2Var.set(4, stringExtra3);
            java.lang.String stringExtra4 = intent.getStringExtra("get_poi_classify_id");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            ze2Var.set(5, stringExtra4);
            if (((mm2.c1) getStore().m56796xbba4bfc0(mm2.c1.class)).a8()) {
                df2.o oVar = (df2.o) getStore().m56798x25fe639c(df2.o.class);
                if (oVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f312432p, "[onLocPickResult] loc = " + pm0.b0.g(ze2Var));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(oVar, null, null, new df2.l(oVar, ze2Var, null), 3, null);
                    return;
                }
                return;
            }
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) getStore().m56796xbba4bfc0(mm2.g1.class)).f410606n).k(ze2Var);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var.m75945x2fec8307(3)) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var.m75945x2fec8307(2))) {
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) getStore().m56796xbba4bfc0(mm2.g1.class)).f410606n).k(null);
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String stringExtra5 = intent.getStringExtra("get_poi_classify_id");
            if (stringExtra5 == null) {
                stringExtra5 = "";
            }
            jSONObject.put("poiClassifyId", stringExtra5);
            jSONObject.put("longitude", java.lang.Float.valueOf(intent.getFloatExtra("get_lng", -1000.0f)));
            jSONObject.put("latitude", java.lang.Float.valueOf(intent.getFloatExtra("get_lat", -85.0f)));
            java.lang.String stringExtra6 = intent.getStringExtra("get_city");
            if (stringExtra6 == null) {
                stringExtra6 = "";
            }
            jSONObject.put("city", stringExtra6);
            java.lang.String stringExtra7 = intent.getStringExtra("get_poi_name");
            jSONObject.put("poiname", stringExtra7 != null ? stringExtra7 : "");
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 9L, jSONObject.toString(), null, 4, null);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("longitude", java.lang.Float.valueOf(ze2Var.m75938x746dc8a6(0)));
            jSONObject2.put("latitude", java.lang.Float.valueOf(ze2Var.m75938x746dc8a6(1)));
            jSONObject2.put("city", ze2Var.m75945x2fec8307(2));
            jSONObject2.put("poiName", ze2Var.m75945x2fec8307(3));
            jSONObject2.put("poiAddress", ze2Var.m75945x2fec8307(4));
            jSONObject2.put("poiClassifyId", ze2Var.m75945x2fec8307(5));
            jSONObject2.put("poiClassifyType", ze2Var.m75939xb282bd08(6));
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.j5((zy2.zb) c18, 66L, jSONObject2.toString(), null, 4, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new yf2.w0(this, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f543357m = null;
    }
}
