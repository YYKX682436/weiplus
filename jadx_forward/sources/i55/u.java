package i55;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final i55.u f370422a = new i55.u();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f370423b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f370424c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f370425d;

    static {
        java.util.List k17 = kz5.c0.k("find_friends_by_finder", "find_friends_by_finder_live", "find_friends_by_finder_live_above_look", "find_friends_by_look", "find_friends_by_search", "find_friends_by_ting", "find_friends_by_ting_play_state", "find_friends_by_near_v3", "find_live_friends_by_near", "more_tab_game_recommend", "settings_mm_cardpackage_new", "settings_my_finder_and_biz", "settings_mm_cardpackage", "settings_emoji_store", "settings_my_finder_album");
        f370423b = k17;
        java.util.List k18 = kz5.c0.k("find_friends_by_qrcode", "jd_market_entrance", "app_brand_entrance", "find_friends_by_shake", "album_dyna_photo_ui_title", "ip_call_entrance", "my_life_around", "find_friends_by_near", "settings_mm_wallet", "settings_mm_favorite", "settings_my_album", "more_setting", "more_uishow", "settings_my_address", "more_tab_setting_personal_info", "settings_privacy_agreements");
        f370424c = kz5.o1.c("album_dyna_photo_ui_title");
        e55.e eVar = e55.e.f331200a;
        java.util.List list = e55.e.f331203d;
        ((java.util.ArrayList) list).addAll(k17);
        ((java.util.ArrayList) list).addAll(k18);
        f370425d = jz5.h.b(i55.t.f370421d);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r15, long r16, android.view.View r18, java.lang.String r19, java.lang.String r20) {
        /*
            r14 = this;
            e55.e r0 = e55.e.f331200a
            r1 = r15
            r2 = r19
            r3 = r20
            java.lang.String r0 = r0.k(r15, r2, r3)
            i55.u r2 = i55.u.f370422a
            java.util.Map r2 = r2.b()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.lang.Object r1 = r2.get(r1)
            i55.b r1 = (i55.b) r1
            r2 = 0
            if (r1 == 0) goto Lbb
            java.lang.String r3 = "view"
            r4 = r18
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r3)
            java.lang.String r3 = "newReportKey"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r3)
            int r3 = r18.hashCode()
            java.util.Map r4 = r1.f370368h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r6 = r4
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r12 = 1
            if (r5 == 0) goto Lb3
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r5)
            java.util.Map r13 = r1.f370369i
            if (r6 == 0) goto L7e
            r6 = r13
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r6 = r6.get(r5)
            g55.j r6 = (g55.j) r6
            if (r6 == 0) goto L7a
            java.util.Map r6 = r6.f350535a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r8 = r6
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8
            java.lang.Object r7 = r8.get(r7)
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            if (r7 == 0) goto L75
            java.lang.Object r7 = r7.get()
            if (r7 != 0) goto L73
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6.remove(r7)
            goto L75
        L73:
            r6 = r2
            goto L76
        L75:
            r6 = r12
        L76:
            if (r6 != 0) goto L7a
            r6 = r12
            goto L7b
        L7a:
            r6 = r2
        L7b:
            if (r6 == 0) goto L7e
            goto Lbb
        L7e:
            boolean r2 = r13.containsKey(r5)
            if (r2 == 0) goto Laa
            e55.m r6 = e55.m.f331214a
            int r9 = r1.f370364d
            r11 = 0
            r7 = r16
            r10 = r5
            r6.l(r7, r9, r10, r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onRedDotDisappear  old reportKey = "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " new reportKey = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.BaseRedDotExposureMonitorLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
        Laa:
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r5)
            if (r0 != 0) goto Lb3
            r13.remove(r5)
        Lb3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4.remove(r0)
            r2 = r12
        Lbb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i55.u.a(int, long, android.view.View, java.lang.String, java.lang.String):boolean");
    }

    public final java.util.Map b() {
        return (java.util.Map) ((jz5.n) f370425d).mo141623x754a37bb();
    }

    public final void c(int i17, long j17) {
        i55.b bVar = (i55.b) b().get(java.lang.Integer.valueOf(i17));
        if (bVar != null) {
            bVar.f370365e = false;
            i55.b.d(bVar, "onPagePause", j17, null, false, 12, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotExposureMonitorLogic", "on pause");
        }
    }

    public final void d(int i17, long j17, android.view.View view, java.lang.String str, java.lang.String str2, java.util.Map map, int i18) {
        java.lang.String reportKey = e55.e.f331200a.k(i17, str, str2);
        i55.b bVar = (i55.b) f370422a.b().get(java.lang.Integer.valueOf(i17));
        if (bVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportKey, "reportKey");
            int hashCode = view.hashCode();
            java.util.Map map2 = bVar.f370368h;
            if (map2.containsKey(java.lang.Integer.valueOf(hashCode))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseRedDotExposureMonitorLogic", "last red dot not Disappear err");
            } else {
                view.addOnLayoutChangeListener(bVar.f370371n);
            }
            map2.put(java.lang.Integer.valueOf(hashCode), reportKey);
            java.util.Map map3 = bVar.f370369i;
            if (!map3.containsKey(reportKey)) {
                map3.put(reportKey, new g55.j(reportKey, str2, i18));
            }
            g55.j jVar = (g55.j) ((java.util.LinkedHashMap) map3).get(reportKey);
            if (jVar != null) {
                int hashCode2 = view.hashCode();
                java.util.Map map4 = jVar.f350535a;
                if (!map4.containsKey(java.lang.Integer.valueOf(hashCode2))) {
                    map4.put(java.lang.Integer.valueOf(hashCode2), new java.lang.ref.WeakReference(view));
                }
                if (map != null) {
                    jVar.f350542h.putAll(map);
                }
                if (!bVar.f370365e || jVar.f350540f) {
                    return;
                }
                i55.b.d(bVar, "checkAndAddRedDotView", j17, view, false, 8, null);
            }
        }
    }
}
