package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class at extends xc2.o {

    /* renamed from: g, reason: collision with root package name */
    public r45.q23 f187856g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f187857h;

    @Override // xc2.j, xc2.z2
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        java.lang.String str;
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.d(holder, jumpView, infoEx);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = infoEx.f534767a.m76506x42318aa0();
        if (m76506x42318aa0 == null || (str = m76506x42318aa0.m77225xe7ed3fec()) == null) {
            str = "";
        }
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.JumperUtils", e17.getMessage());
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        r45.q23 q23Var = new r45.q23();
        q23Var.f465118d = jSONObject.optString(dm.i4.f66865x76d1ec5a);
        q23Var.f465119e = jSONObject.optInt("type");
        q23Var.f465120f = jSONObject.optInt("sdk_version");
        q23Var.f465127p = pm0.v.Z(xc2.y2.f534876a.t(str));
        this.f187856g = q23Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        long j17 = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? 0L : feedObject.f66939xc8a07680;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (q23Var.f465119e == 3) {
            java.lang.String str2 = q23Var.f465118d;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("shooting_templateid", str2);
        } else {
            java.lang.String str3 = q23Var.f465118d;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("templateid", str3);
        }
        hashMap.put("template_type", java.lang.Integer.valueOf(q23Var.f465119e));
        java.lang.String str4 = q23Var.f465124m;
        hashMap.put("music_id", str4 != null ? str4 : "");
        hashMap.put("feed_id", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ui(j17));
        cy1.a aVar = (cy1.a) rVar;
        aVar.gk(jumpView, hashMap);
        aVar.pk(jumpView, "shoot_same_video");
        aVar.ik(jumpView, 40, 25496);
    }

    @Override // xc2.j, xc2.z2
    public void h(boolean z17, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.h(z17, holder, jumpView, infoEx);
        this.f187857h = false;
    }

    @Override // xc2.j
    public void k() {
        r45.q23 q23Var = this.f187856g;
        jz5.f0 f0Var = null;
        java.lang.String str = q23Var != null ? q23Var.f465118d : null;
        if (this.f187857h || str == null) {
            return;
        }
        i95.m c17 = i95.n0.c(bg0.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        synchronized (us2.u.f512083c) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "cancel preload templateId:".concat(str));
                p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) us2.u.f512084d.remove(str);
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    f0Var = jz5.f0.f384359a;
                }
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
        }
    }

    @Override // xc2.j
    public void l() {
        i95.m c17 = i95.n0.c(pp0.h0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((yy0.m0) ((pp0.h0) c17)).ij();
        r45.q23 q23Var = this.f187856g;
        if (q23Var != null && q23Var.f465119e == 3) {
            i95.m c18 = i95.n0.c(e42.e0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            if (((h62.d) ((e42.e0) c18)).Ni(e42.c0.clicfg_finder_maas_record_template_preload_in_feed, 0) == 1) {
                java.lang.String str = q23Var.f465118d;
                if (str == null || r26.n0.N(str)) {
                    return;
                }
                i95.m c19 = i95.n0.c(e42.e0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                boolean z17 = ((h62.d) ((e42.e0) c19)).Ni(e42.c0.clicfg_finder_maas_record_template_auto_retry, 1) == 1;
                i95.m c27 = i95.n0.c(bg0.v.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                bg0.v vVar = (bg0.v) c27;
                java.lang.String str2 = q23Var.f465118d;
                if (str2 == null) {
                    str2 = "";
                }
                ((b92.u2) vVar).fj(20, str2, z17);
            }
        }
    }

    @Override // xc2.o, xc2.j
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.r(holder, jumpView, infoEx);
        this.f187857h = true;
        r45.q23 q23Var = this.f187856g;
        if (q23Var == null || (str = q23Var.f465118d) == null) {
            return;
        }
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        us2.u.f512081a.c(str);
    }

    @Override // xc2.j
    public boolean u() {
        return true;
    }
}
