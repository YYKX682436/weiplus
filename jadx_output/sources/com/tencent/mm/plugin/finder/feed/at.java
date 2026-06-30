package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class at extends xc2.o {

    /* renamed from: g, reason: collision with root package name */
    public r45.q23 f106323g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f106324h;

    @Override // xc2.j, xc2.z2
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        java.lang.String str;
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.d(holder, jumpView, infoEx);
        com.tencent.mm.protocal.protobuf.NativeInfo native_info = infoEx.f453234a.getNative_info();
        if (native_info == null || (str = native_info.getNecessary_params()) == null) {
            str = "";
        }
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("Finder.JumperUtils", e17.getMessage());
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        r45.q23 q23Var = new r45.q23();
        q23Var.f383585d = jSONObject.optString(dm.i4.COL_ID);
        q23Var.f383586e = jSONObject.optInt("type");
        q23Var.f383587f = jSONObject.optInt("sdk_version");
        q23Var.f383594p = pm0.v.Z(xc2.y2.f453343a.t(str));
        this.f106323g = q23Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        long j17 = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? 0L : feedObject.field_id;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (q23Var.f383586e == 3) {
            java.lang.String str2 = q23Var.f383585d;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("shooting_templateid", str2);
        } else {
            java.lang.String str3 = q23Var.f383585d;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("templateid", str3);
        }
        hashMap.put("template_type", java.lang.Integer.valueOf(q23Var.f383586e));
        java.lang.String str4 = q23Var.f383591m;
        hashMap.put("music_id", str4 != null ? str4 : "");
        hashMap.put("feed_id", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(j17));
        cy1.a aVar = (cy1.a) rVar;
        aVar.gk(jumpView, hashMap);
        aVar.pk(jumpView, "shoot_same_video");
        aVar.ik(jumpView, 40, 25496);
    }

    @Override // xc2.j, xc2.z2
    public void h(boolean z17, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.h(z17, holder, jumpView, infoEx);
        this.f106324h = false;
    }

    @Override // xc2.j
    public void k() {
        r45.q23 q23Var = this.f106323g;
        jz5.f0 f0Var = null;
        java.lang.String str = q23Var != null ? q23Var.f383585d : null;
        if (this.f106324h || str == null) {
            return;
        }
        i95.m c17 = i95.n0.c(bg0.v.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        synchronized (us2.u.f430550c) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", "cancel preload templateId:".concat(str));
                kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) us2.u.f430551d.remove(str);
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                    f0Var = jz5.f0.f302826a;
                }
                kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
        }
    }

    @Override // xc2.j
    public void l() {
        i95.m c17 = i95.n0.c(pp0.h0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((yy0.m0) ((pp0.h0) c17)).ij();
        r45.q23 q23Var = this.f106323g;
        if (q23Var != null && q23Var.f383586e == 3) {
            i95.m c18 = i95.n0.c(e42.e0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            if (((h62.d) ((e42.e0) c18)).Ni(e42.c0.clicfg_finder_maas_record_template_preload_in_feed, 0) == 1) {
                java.lang.String str = q23Var.f383585d;
                if (str == null || r26.n0.N(str)) {
                    return;
                }
                i95.m c19 = i95.n0.c(e42.e0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                boolean z17 = ((h62.d) ((e42.e0) c19)).Ni(e42.c0.clicfg_finder_maas_record_template_auto_retry, 1) == 1;
                i95.m c27 = i95.n0.c(bg0.v.class);
                kotlin.jvm.internal.o.f(c27, "getService(...)");
                bg0.v vVar = (bg0.v) c27;
                java.lang.String str2 = q23Var.f383585d;
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
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.r(holder, jumpView, infoEx);
        this.f106324h = true;
        r45.q23 q23Var = this.f106323g;
        if (q23Var == null || (str = q23Var.f383585d) == null) {
            return;
        }
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        us2.u.f430548a.c(str);
    }

    @Override // xc2.j
    public boolean u() {
        return true;
    }
}
