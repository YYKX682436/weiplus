package ez0;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final ez0.o f339368a = new ez0.o();

    public final boolean a() {
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoDefaultTemplatetBgmRecommendEnabled", 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsMaasConfigImpl", "enableDefaultBGMRecommend() called enable: " + z17);
        return z17;
    }

    public final boolean b() {
        boolean d17 = d(bm5.h0.RepairerConfig_Maas_RecommendTempalteBgmRecommendEnable_Int, "SnsVideoNondefaultTemplateBgmRecommendEnabled", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsMaasConfigImpl", "enableRecommendBGMRecommend() called enable: " + d17);
        return d17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2548x18d5ed17.C20457x239e63df()) == 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            r5 = this;
            az0.i5 r0 = az0.i5.f97090a
            boolean r0 = r0.m()
            java.lang.String r1 = "SnsMaasConfigImpl"
            r2 = 0
            if (r0 != 0) goto L11
            java.lang.String r0 = "enableUseAsyncExport: false, unable MaasCoreUsageCount"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r2
        L11:
            bm5.o1 r0 = bm5.o1.f104252a
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumTemplateAsyncClip r3 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumTemplateAsyncClip
            r3.<init>()
            int r0 = r0.h(r3)
            r3 = 1
            if (r0 == r3) goto L37
            r4 = 2
            if (r0 == r4) goto L38
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumTemplateAsyncClip r4 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumTemplateAsyncClip
            r4.<init>()
            h62.d r0 = (h62.d) r0
            int r0 = r0.nj(r4)
            if (r0 != r3) goto L38
        L37:
            r2 = r3
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "enableUseAsyncExport="
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r3 = ", enableMaasCoreUsageCount=true"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ez0.o.c():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(bm5.h0 h0Var, java.lang.String str, boolean z17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(bm5.o1.f104252a.g(h0Var, -1));
        if ((valueOf.intValue() != -1) == false) {
            valueOf = null;
        }
        return (valueOf != null ? valueOf.intValue() : ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b(str, z17 ? 1 : 0)) == 1;
    }

    public final java.util.List e() {
        java.lang.Object m143895xf1229813;
        java.lang.Object m143895xf12298132;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsMaasConfigImpl", "getDefaultTemplateIdList");
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsVideoDefaultTemplate");
        if (d17 == null) {
            d17 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsMaasConfigImpl", "getDefaultTemplateIdList: ".concat(d17));
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new org.json.JSONObject(d17));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) m143895xf1229813;
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (jSONObject == null) {
            return p0Var;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("tpls");
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String string = jSONArray.optJSONObject(i17).getString(dm.i4.f66865x76d1ec5a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                arrayList.add(string);
            }
            m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(arrayList);
        } catch (java.lang.Throwable th7) {
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
        }
        java.util.List list = (java.util.List) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf12298132) ? null : m143895xf12298132);
        return list == null ? p0Var : list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c0 A[LOOP:0: B:15:0x018a->B:26:0x01c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01f9 -> B:10:0x01fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01fe -> B:11:0x0201). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ez0.o.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean g(long j17) {
        if (j17 <= 2008004) {
            return h() && d(bm5.h0.RepairerConfig_Maas_SnsShowCreateSameEntry_Int, "SnsVideoTemplateUseSameTemplateEnabled", false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsMaasConfigImpl", "showCutSameEntry: templateMin is " + j17 + ", sdk is 2008004");
        return false;
    }

    public boolean h() {
        com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2548x18d5ed17.C20458x77155863 c20458x77155863 = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2548x18d5ed17.C20458x77155863();
        boolean z17 = bm5.o1.f104252a.h(c20458x77155863) != 2 && 1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(c20458x77155863);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsMaasConfigImpl", "enableSnsShowAlbumTemplateEntrance: result:" + z17);
        return z17 && d(bm5.h0.RepairerConfig_Maas_SnsShowPostMainEntry_Int, "SnsVideoTemplateEnabled", false) && py0.b.f440504a.a();
    }
}
