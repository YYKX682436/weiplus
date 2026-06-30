package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f170466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t0 f170467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf.f f170468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f170469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f170470h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f170471i;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t0 t0Var, sf.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f170466d = k0Var;
        this.f170467e = t0Var;
        this.f170468f = fVar;
        this.f170469g = lVar;
        this.f170470h = i17;
        this.f170471i = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap;
        boolean z17;
        sh1.e eVar;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f170466d;
        if (!(k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.f)) {
            if (k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.i) {
                int optInt = this.f170471i.optInt("viewId");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0 k0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0.f170435a;
                java.lang.String jSONObject = this.f170471i.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                sh1.g b17 = k0Var2.b(optInt);
                if (b17 != null) {
                    b17.d(jSONObject);
                    return;
                }
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt(dm.i4.f66865x76d1ec5a, optInt);
                bundle.putString("params", jSONObject);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str2, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.g0.f170428d.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.h0.f170429d);
                return;
            }
            if (!(k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.g)) {
                if (k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.h) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t0 t0Var = this.f170467e;
                    t0Var.f170481i = null;
                    t0Var.f170479g = null;
                    int optInt2 = this.f170471i.optInt("viewId");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0 k0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0.f170435a;
                    java.lang.String jSONObject2 = this.f170471i.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    k0Var3.d(optInt2, jSONObject2);
                    return;
                }
                return;
            }
            int optInt3 = this.f170471i.optInt("viewId");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0 k0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0.f170435a;
            java.lang.String jSONObject3 = this.f170471i.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            sh1.g b18 = k0Var4.b(optInt3);
            if (b18 != null) {
                b18.b(jSONObject3);
                return;
            }
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt(dm.i4.f66865x76d1ec5a, optInt3);
            bundle2.putString("params", jSONObject3);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str3, bundle2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.x.f170489d.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.y.f170490d);
            return;
        }
        this.f170467e.f170481i = this.f170468f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f170469g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
        u81.b mo48799xc0ccc466 = lVar.mo48799xc0ccc466();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48799xc0ccc466, "getAppState(...)");
        if (mo48799xc0ccc466 != u81.b.FOREGROUND) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SkylineNativeViewPluginHandler", "id:" + this.f170467e.f334030d + " insertNativeView fail, state:" + mo48799xc0ccc466);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = this.f170469g;
            if (lVar2 != null) {
                int i17 = this.f170470h;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var5 = this.f170466d;
                k0Var5.getClass();
                str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                lVar2.a(i17, k0Var5.u(str, jSONObject4));
                return;
            }
            return;
        }
        int optInt4 = this.f170471i.optInt("viewId");
        java.lang.String optString = this.f170471i.optString("nativeViewType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineNativeViewPluginHandler", "id:" + optInt4 + " insertNativeView");
        sf.f fVar = this.f170467e.f170481i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = fVar != null ? fVar.m() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) m17 : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0 k0Var6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0.f170435a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n7Var);
        android.view.View mo51310xc2a54588 = n7Var.mo51310xc2a54588();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        java.lang.String jSONObject5 = this.f170471i.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
        kf.b bVar = this.f170467e.f170479g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t0 invoker = this.f170467e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invoker, "invoker");
        k0Var6.c();
        synchronized (k0Var6) {
            hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0.f170436b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t) hashMap.get(optString);
            z17 = tVar != null ? tVar.f170477a : false;
        }
        if (z17) {
            synchronized (k0Var6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0.f170437c.put(java.lang.Integer.valueOf(optInt4), invoker);
            }
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt(dm.i4.f66865x76d1ec5a, optInt4);
            bundle3.putString("processName", bm5.f1.a());
            bundle3.putString("viewType", optString);
            bundle3.putString("params", jSONObject5);
            bundle3.putParcelable("surface", new android.view.Surface(bVar));
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str5, bundle3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.v.f170483d.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.w.f170485d);
        } else {
            synchronized (k0Var6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t tVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t) hashMap.get(optString);
                eVar = tVar2 != null ? tVar2.f170478b : null;
            }
            sh1.g b19 = eVar != null ? eVar.b(mo51310xc2a54588, optInt4, jSONObject5, bVar, invoker) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineNativeViewManager", "createSkylineNativeView factory:" + eVar + " receiver:" + b19);
            if (b19 != null) {
                synchronized (k0Var6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0.f170438d.put(java.lang.Integer.valueOf(optInt4), b19);
                }
            }
        }
        kf.b bVar2 = this.f170467e.f170479g;
        if (bVar2 != null) {
            bVar2.f388694c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.m0(optInt4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.p0(optInt4);
        n7Var.U(p0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.o0(optInt4);
        n7Var.R(o0Var);
        n7Var.w(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.n0(optInt4, n7Var, o0Var, p0Var, this.f170467e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar3 = this.f170469g;
        if (lVar3 != null) {
            int i18 = this.f170470h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var7 = this.f170466d;
            k0Var7.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            try {
                jSONObject6.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar3.a(i18, k0Var7.u(str, jSONObject6));
        }
    }
}
