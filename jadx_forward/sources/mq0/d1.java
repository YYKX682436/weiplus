package mq0;

/* loaded from: classes7.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final mq0.d1 f412079a = new mq0.d1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f412080b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f412081c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f412082d = jz5.h.b(mq0.c1.f412078d);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f412083e = new java.util.HashSet();

    public final mq0.b1 a(java.lang.String str) {
        java.util.HashMap hashMap = f412080b;
        mq0.b1 b1Var = (mq0.b1) hashMap.get(str);
        if (b1Var != null) {
            return b1Var;
        }
        mq0.b1 b1Var2 = new mq0.b1(0L, 0L, 0L, false, 15, null);
        hashMap.put(str, b1Var2);
        return b1Var2;
    }

    public final synchronized void b(fq0.x frameSet, java.lang.String bizName) {
        java.lang.Integer valueOf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        mq0.b1 a17 = a(frameSet.f347011b);
        gq0.r rVar = (gq0.r) i95.n0.c(gq0.r.class);
        java.lang.String id6 = frameSet.f347011b;
        fq0.z zVar = (fq0.z) rVar;
        zVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = zVar.f347027d;
        long j17 = o4Var != null ? o4Var.getLong(id6, 0L) : 0L;
        if (j17 <= 0) {
            valueOf = null;
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = zVar.f347027d;
            if (o4Var2 != null) {
                o4Var2.remove(id6);
            }
            valueOf = java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - j17));
        }
        if (valueOf != null) {
            f412079a.c(frameSet.f347011b, valueOf.intValue());
        }
        a17.f412074b = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandReporter", "markRenderStartTime " + frameSet.f347011b + ' ' + a17.f412074b);
        je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
        java.lang.String str = frameSet.f347011b;
        java.lang.String str2 = frameSet.f347010a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c enumC16454xc40f4d3c = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c.f37603x4c7d442;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appStatus", com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d() ? 1 : 2);
        hq0.e0 e0Var = frameSet.f347012c;
        jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, e0Var != null ? e0Var.f364515c : null);
        iVar.qa(str, bizName, str2, enumC16454xc40f4d3c, 0L, null, jSONObject);
    }

    public final void c(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandReporter", "reportGapTimeFromPreloadDoneToActualUse " + str + ' ' + i17);
        i95.m c17 = i95.n0.c(je3.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        je3.i.x2((je3.i) c17, "MagicBrandPreloadToUseGap", i17, str, 0.0f, 8, null);
    }

    public final synchronized void d(fq0.x frameSet, java.lang.String bizName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        if (frameSet.f347020k == com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e.f29657x8d7557bd) {
            gq0.r rVar = (gq0.r) i95.n0.c(gq0.r.class);
            java.lang.String id6 = frameSet.f347011b;
            fq0.z zVar = (fq0.z) rVar;
            zVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = zVar.f347027d;
            if (o4Var != null) {
                o4Var.putLong(id6, java.lang.System.currentTimeMillis());
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        mq0.b1 b1Var = (mq0.b1) f412080b.get(frameSet.f347011b);
        if (b1Var != null && b1Var.f412073a > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandReporter", "reportPreloadFinish " + frameSet.f347011b + ' ' + currentTimeMillis + ' ' + (currentTimeMillis - b1Var.f412073a) + ' ' + frameSet.f347020k);
            int i17 = 1;
            b1Var.f412076d = true;
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            java.lang.String str = frameSet.f347011b;
            java.lang.String str2 = frameSet.f347010a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c enumC16454xc40f4d3c = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c.f37601x3d26810b;
            long j17 = currentTimeMillis - b1Var.f412073a;
            java.lang.String[] strArr = new java.lang.String[2];
            strArr[0] = java.lang.String.valueOf(frameSet.f347020k.getValue());
            strArr[1] = z17 ? "1" : "0";
            java.util.List i18 = kz5.c0.i(strArr);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d()) {
                i17 = 2;
            }
            jSONObject.put("appStatus", i17);
            hq0.e0 e0Var = frameSet.f347012c;
            jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, e0Var != null ? e0Var.f364515c : null);
            iVar.qa(str, bizName, str2, enumC16454xc40f4d3c, j17, i18, jSONObject);
        }
    }

    public final synchronized void e(fq0.x frameSet, java.lang.String bizName, boolean z17, int i17, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        mq0.b1 b1Var = (mq0.b1) f412080b.get(frameSet.f347011b);
        if (b1Var != null) {
            boolean z18 = b1Var.f412076d;
            long j17 = b1Var.f412075c;
            long j18 = j17 > 0 ? currentTimeMillis - j17 : -1L;
            if (b1Var.f412074b > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandReporter", "reportRenderFinish " + frameSet.f347011b + ' ' + currentTimeMillis + ' ' + (currentTimeMillis - b1Var.f412074b) + " preloadDone:" + z18 + " expose:" + j18 + ", scene: " + frameSet.f347020k);
                je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
                java.lang.String str = frameSet.f347011b;
                java.lang.String str2 = frameSet.f347010a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c enumC16454xc40f4d3c = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c.f37598xf943aa9b;
                long j19 = currentTimeMillis - b1Var.f412074b;
                java.lang.String[] strArr = new java.lang.String[4];
                strArr[0] = java.lang.String.valueOf(frameSet.f347020k.getValue());
                int i18 = 1;
                strArr[1] = z18 ? "1" : "0";
                strArr[2] = java.lang.String.valueOf(j18);
                strArr[3] = z17 ? "1" : "0";
                java.util.List i19 = kz5.c0.i(strArr);
                org.json.JSONObject jSONObject2 = jSONObject == null ? new org.json.JSONObject() : jSONObject;
                if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d()) {
                    i18 = 2;
                }
                jSONObject2.put("appStatus", i18);
                jSONObject2.put("zidl", i17);
                hq0.e0 e0Var = frameSet.f347012c;
                jSONObject2.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, e0Var != null ? e0Var.f364515c : null);
                jSONObject2.put("hasCover", ((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Ai(bizName, frameSet.f347011b));
                iVar.qa(str, bizName, str2, enumC16454xc40f4d3c, j19, i19, jSONObject2);
            }
        }
    }
}
