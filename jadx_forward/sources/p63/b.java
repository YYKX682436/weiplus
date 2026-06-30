package p63;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final p63.b f433970a = new p63.b();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f433971b;

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.j a() {
        if (!gm0.j1.h() || !gm0.j1.a()) {
            return null;
        }
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.j.f298147b;
    }

    public final java.lang.String b(android.content.Intent intent, boolean z17) {
        java.lang.String stringExtra;
        jz5.l[] lVarArr = new jz5.l[5];
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        java.lang.String str = "";
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[0] = new jz5.l("finder_context_id", b17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        lVarArr[1] = new jz5.l("finder_tab_context_id", c17);
        if (intent != null && (stringExtra = intent.getStringExtra("finder_extraInfo_key")) != null) {
            str = stringExtra;
        }
        lVarArr[2] = new jz5.l("extra_info", str);
        lVarArr[3] = new jz5.l("is_finder_task", java.lang.Integer.valueOf(z17 ? 1 : 0));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).getClass();
        lVarArr[4] = new jz5.l("mode_flag", java.lang.Long.valueOf(sz1.a.d()));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        nf.f.c(k17);
        java.lang.String jSONObject = new org.json.JSONObject(k17).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final boolean c() {
        if (f433971b == null) {
            f433971b = java.lang.Boolean.valueOf(j62.e.g().l("clicfg_finder_time_report_open_aff_config", true, true, true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffFinderReport", "isOpenAffReport: " + f433971b);
        }
        java.lang.Boolean bool = f433971b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void d(int i17, int i18, java.lang.String targetSimpleName, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetSimpleName, "targetSimpleName");
        if (c()) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                android.os.Bundle bundle = new android.os.Bundle();
                r45.a6 a6Var = new r45.a6();
                a6Var.f451281d = targetSimpleName;
                a6Var.f451283f = i18;
                a6Var.f451285h = j17;
                a6Var.f451284g = i17;
                a6Var.f451287m = false;
                bundle.putByteArray("finderReportAffFinderTask", a6Var.mo14344x5f01b1f6());
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(str, bundle, p63.a.class);
                return;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.j a17 = a();
            if (a17 != null) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k kVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k();
                kVar.f298149d = targetSimpleName;
                kVar.f298151f = i18;
                kVar.f298153h = j17;
                kVar.f298152g = i17;
                r63.l lVar = r63.l.f474555a;
                kVar.f298156n = r63.l.f474566l ? r63.l.f474556b : 0;
                r63.n nVar = r63.n.f474575a;
                kVar.f298157o = nVar.p() ? r63.l.f474560f : 0;
                kVar.f298159q = r63.l.f474562h;
                kVar.f298158p = nVar.p();
                a17.e(kVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffFinderReport", "onPageDisappear: taskId: " + i17 + ", targetPageHC: " + i18 + ", targetSimpleName: " + targetSimpleName + ", timestamp: " + j17);
        }
    }

    public final void e(int i17, java.lang.String pageName, int i18, long j17, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        if (c()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.j a17 = a();
            if (a17 != null) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k kVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k();
                kVar.f298149d = pageName;
                kVar.f298151f = i17;
                kVar.f298152g = i18;
                kVar.f298153h = j17;
                a17.f(kVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffFinderReport", "onPopStack: pageHC: " + i17 + ", pageName: " + pageName + ", taskId: " + i18 + ", timestamp: " + j17 + ", intent: " + intent);
        }
    }
}
