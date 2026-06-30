package v61;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final v61.d f514960a = new v61.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f514961b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f514962c;

    public static final java.lang.String a(int i17) {
        return f514960a.b(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(int r10, int r11) {
        /*
            java.lang.String r0 = "_"
            java.lang.String r1 = wo.w0.k()
            java.util.concurrent.ConcurrentHashMap r2 = v61.d.f514961b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ""
            if (r2 != 0) goto L17
            r2 = r3
        L17:
            int r4 = r2.length()
            r5 = 1
            r6 = 0
            if (r4 <= 0) goto L21
            r4 = r5
            goto L22
        L21:
            r4 = r6
        L22:
            if (r4 == 0) goto L41
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = r26.i0.t(r2, r0, r3, r6)     // Catch: java.lang.Exception -> L36
            long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L36
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L36
            long r7 = r7 - r3
            goto L43
        L36:
            java.lang.String r0 = "count stay time fail, loginPageSessionId="
            java.lang.String r0 = r0.concat(r2)
            java.lang.String r3 = "AccountLoginReporter"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
        L41:
            r7 = 0
        L43:
            java.lang.Class<dy1.r> r0 = dy1.r.class
            i95.m r0 = i95.n0.c(r0)
            dy1.r r0 = (dy1.r) r0
            r3 = 6
            jz5.l[] r3 = new jz5.l[r3]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            jz5.l r4 = new jz5.l
            java.lang.String r9 = "login_page_oa_type"
            r4.<init>(r9, r10)
            r3[r6] = r4
            jz5.l r10 = new jz5.l
            java.lang.String r4 = "login_page_sessionid"
            r10.<init>(r4, r2)
            r3[r5] = r10
            jz5.l r10 = new jz5.l
            java.lang.String r2 = "device_id"
            r10.<init>(r2, r1)
            r1 = 2
            r3[r1] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r7)
            jz5.l r1 = new jz5.l
            java.lang.String r2 = "login_duration_ms"
            r1.<init>(r2, r10)
            r10 = 3
            r3[r10] = r1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            jz5.l r11 = new jz5.l
            java.lang.String r1 = "login_method"
            r11.<init>(r1, r10)
            r10 = 4
            r3[r10] = r11
            java.lang.Class<zl.i> r10 = zl.i.class
            i95.m r10 = i95.n0.c(r10)
            zl.i r10 = (zl.i) r10
            v61.f r10 = (v61.f) r10
            int r10 = r10.wi()
            if (r10 != r5) goto L9b
            goto L9c
        L9b:
            r5 = r6
        L9c:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            jz5.l r11 = new jz5.l
            java.lang.String r1 = "has_sync_chat_login"
            r11.<init>(r1, r10)
            r10 = 5
            r3[r10] = r11
            java.util.Map r10 = kz5.c1.k(r3)
            r11 = 34575(0x870f, float:4.845E-41)
            cy1.a r0 = (cy1.a) r0
            java.lang.String r1 = "login_success"
            r0.Ej(r1, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v61.d.c(int, int):void");
    }

    public static final void d(java.lang.String viewId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k());
        linkedHashMap.put("still_notify_bar", java.lang.Integer.valueOf(i17));
        linkedHashMap.put("login_ui_version", java.lang.Integer.valueOf(i18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewId, "view_clk", linkedHashMap, 34575);
    }

    public static final void e(int i17) {
        if (f514962c == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccountLoginReporter", "same login type, don't report page in");
            return;
        }
        java.lang.String k17 = wo.w0.k();
        java.lang.String b17 = f514960a.b(i17);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50272, "page_in", kz5.c1.k(new jz5.l("login_page_oa_type", java.lang.Integer.valueOf(i17)), new jz5.l("login_page_sessionid", b17), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, k17)), 34575);
        f514962c = i17;
    }

    public static final void f(int i17) {
        long currentTimeMillis;
        java.lang.String k17 = wo.w0.k();
        java.lang.String str = (java.lang.String) f514961b.remove(java.lang.Integer.valueOf(i17));
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            try {
                currentTimeMillis = java.lang.System.currentTimeMillis() - java.lang.Long.parseLong(r26.i0.t(str, k17.concat("_"), "", false));
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccountLoginReporter", "count stay time fail, loginPageSessionId=".concat(str));
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            iy1.c cVar = iy1.c.MainUI;
            ((cy1.a) rVar).Gj(50272, "page_out", kz5.c1.k(new jz5.l("login_page_oa_type", java.lang.Integer.valueOf(i17)), new jz5.l("login_page_sessionid", str), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, k17), new jz5.l("stay_time_ms", java.lang.Long.valueOf(currentTimeMillis))), 34575);
            f514962c = 0;
        }
        currentTimeMillis = 0;
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar2 = iy1.c.MainUI;
        ((cy1.a) rVar2).Gj(50272, "page_out", kz5.c1.k(new jz5.l("login_page_oa_type", java.lang.Integer.valueOf(i17)), new jz5.l("login_page_sessionid", str), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, k17), new jz5.l("stay_time_ms", java.lang.Long.valueOf(currentTimeMillis))), 34575);
        f514962c = 0;
    }

    public static final void g(java.lang.String viewId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        java.lang.String str = (java.lang.String) f514961b.get(java.lang.Integer.valueOf(i17));
        if (str == null) {
            str = "";
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewId, "view_clk", kz5.c1.k(new jz5.l("login_page_oa_type", java.lang.Integer.valueOf(i17)), new jz5.l("login_page_sessionid", str), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k())), 34575);
    }

    public static final void h(java.lang.String viewId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewId, "view_exp", kz5.c1.k(new jz5.l("login_page_oa_type", java.lang.Integer.valueOf(i17)), new jz5.l("login_page_sessionid", i17 > 0 ? f514960a.b(i17) : ""), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k())), 34575);
    }

    public static final void i(android.view.View view, java.lang.String viewId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        java.lang.String b17 = i17 > 0 ? f514960a.b(i17) : "";
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, viewId);
        aVar.gk(view, kz5.c1.k(new jz5.l("login_page_oa_type", java.lang.Integer.valueOf(i17)), new jz5.l("login_page_sessionid", b17), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k())));
        aVar.ik(view, 32, 34575);
    }

    public final java.lang.String b(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f514961b;
        java.lang.String str = (java.lang.String) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (str == null) {
            str = "";
        }
        if (!(str.length() == 0)) {
            return str;
        }
        java.lang.String str2 = wo.w0.k() + '_' + java.lang.System.currentTimeMillis();
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), str2);
        return str2;
    }
}
