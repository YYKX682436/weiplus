package oz1;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    public static volatile oz1.e f431765e;

    /* renamed from: b, reason: collision with root package name */
    public oz1.b f431767b;

    /* renamed from: a, reason: collision with root package name */
    public int f431766a = 7118;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Boolean f431768c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f431769d = null;

    public static oz1.e a() {
        if (f431765e == null) {
            synchronized (oz1.e.class) {
                if (f431765e == null) {
                    f431765e = new oz1.e();
                }
            }
        }
        return f431765e;
    }

    public final boolean b() {
        if (this.f431768c == null) {
            this.f431768c = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_data_report_open_new_uba_switch, true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.NewUserBehaviourReporter", "[isOpenNewUBA] mOpenNewUBASwitch : " + this.f431768c);
        }
        return this.f431768c.booleanValue();
    }

    public final void c(java.util.List list, boolean z17) {
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            oz1.a aVar = (oz1.a) it.next();
            if (aVar != null && !u46.l.e(aVar.f431746s)) {
                java.lang.String replace = aVar.f431746s.replace("#", "/");
                byte[] bytes = replace.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                if (bytes.length + i17 <= this.f431766a) {
                    sb6.append(replace);
                    sb6.append("#");
                    i17 += bytes.length;
                } else {
                    arrayList.add(sb6.toString());
                    sb6 = new java.lang.StringBuilder();
                    sb6.append(replace);
                    sb6.append("#");
                    i17 = bytes.length;
                }
            }
        }
        if (!u46.l.e(sb6.toString())) {
            arrayList.add(sb6.toString());
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.p(35244, str.replace(",", ";"), false, false, true);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.p(26251, str.replace(",", ";"), false, false, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.String r6, long r7, java.util.Map r9) {
        /*
            r5 = this;
            java.lang.String r0 = "Amoeba.NewUserBehaviourReporter"
            java.lang.String r1 = ""
            java.lang.String r2 = ","
            boolean r3 = u46.l.e(r6)
            if (r3 != 0) goto Lc3
            boolean r3 = r5.b()
            if (r3 != 0) goto L14
            goto Lc3
        L14:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            cy1.a r4 = cy1.a.Ui()
            ly1.b r4 = r4.f306227q
            sy1.d r4 = (sy1.d) r4
            r4.a(r3)
            cy1.a r4 = cy1.a.Ui()
            r4.wi(r6, r3)
            if (r9 == 0) goto L36
            int r4 = r9.size()
            if (r4 <= 0) goto L36
            r3.putAll(r9)
        L36:
            java.lang.Object r9 = sz1.f.c(r3)     // Catch: java.lang.Exception -> L49
            org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch: java.lang.Exception -> L49
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L49
            if (r9 == 0) goto L5f
            java.lang.String r3 = ";"
            java.lang.String r9 = r9.replace(r2, r3)     // Catch: java.lang.Exception -> L49
            goto L60
        L49:
            r9 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[reportFlutterAllOutEvent] throw Exception e : "
            r3.<init>(r4)
            java.lang.String r9 = r9.getMessage()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r9)
        L5f:
            r9 = r1
        L60:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r2)
            r3.append(r7)
            r3.append(r2)
            r3.append(r9)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[reportFlutterAllOutEvent] sb : "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r6)
            java.lang.String r6 = "mmkv_id_flutter_report_cache"
            com.tencent.mm.sdk.platformtools.o4 r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(r6)
            java.lang.String r7 = "mmkv_key_flutter_report_cache"
            java.lang.String r8 = r6.getString(r7, r1)
            boolean r9 = u46.l.e(r8)
            java.lang.String r0 = "/"
            java.lang.String r1 = "#"
            if (r9 != 0) goto Lb8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r1)
            java.lang.String r8 = r3.toString()
            java.lang.String r8 = r8.replace(r1, r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            goto Lc0
        Lb8:
            java.lang.String r8 = r3.toString()
            java.lang.String r8 = r8.replace(r1, r0)
        Lc0:
            r6.putString(r7, r8)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oz1.e.d(java.lang.String, long, java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b3, code lost:
    
        if (r5 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01ee, code lost:
    
        if (r10 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0210, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01cc, code lost:
    
        if (r10.moveToFirst() != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ce, code lost:
    
        r0 = new oz1.a();
        r0.mo9015xbf5d97fd(r10);
        r0.f431745r = r0.f67345x799f106a;
        r0.f431746s = r0.f67347x858e9f58;
        r0.f431747t = r0.f67346x47757815;
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01e9, code lost:
    
        if (r10.moveToNext() != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x020e, code lost:
    
        if (r10 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        if (r13 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0144, code lost:
    
        r13.w(java.lang.Long.valueOf(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0142, code lost:
    
        if (r13 == null) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r21, long r22, java.lang.Object r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz1.e.e(java.lang.String, long, java.lang.Object, java.lang.String):void");
    }

    public void f(long j17, java.lang.String str, java.lang.Object obj, java.util.Map map) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object obj2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Object obj3;
        java.lang.Object obj4;
        sy1.f fVar;
        if (u46.l.e(str) || this.f431767b == null || !b()) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        ((sy1.d) cy1.a.Ui().f306227q).a(hashMap);
        cy1.a.Ui().wi(str, hashMap);
        if (map != null && map.size() > 0) {
            hashMap.putAll(map);
        }
        java.lang.Object obj5 = (obj != null || !(u46.l.c(str, "app_out") || u46.l.c(str, "app_in")) || (fVar = cy1.a.Ui().f306223m) == null) ? obj : fVar.f495380b;
        java.lang.String str8 = "";
        if (sz1.a.j() && (u46.l.c(str, "page_in") || u46.l.c(str, "page_out"))) {
            java.lang.String str9 = obj5 instanceof hz1.a ? ((hz1.a) obj5).f367822c : "";
            if (u46.l.e(str9) && map != null && (obj4 = map.get("page_name")) != null) {
                str9 = obj4.toString();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.p(36843, str + "," + str9 + "," + java.lang.System.currentTimeMillis(), false, false, true);
        }
        ry1.a a17 = ry1.b.a(str, obj5);
        if (a17 != null) {
            java.lang.String str10 = a17.f482895a;
            if (!u46.l.e(str10)) {
                hashMap.put("page_id", str10);
            }
            java.util.Map map2 = a17.f482896b;
            if (map2 != null && ((java.util.HashMap) map2).size() > 0) {
                hashMap.putAll(map2);
            }
        }
        try {
            java.lang.String jSONObject = ((org.json.JSONObject) sz1.f.c(hashMap)).toString();
            if (jSONObject != null) {
                str8 = jSONObject.replace(",", ";");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.NewUserBehaviourReporter", "[reportStandardEvent] throw Exception e : " + e17.getMessage());
        }
        java.lang.String str11 = str8;
        if (u46.l.c(str, "app_out") || u46.l.c(str, "biz_out") || u46.l.c(str, "session_out") || u46.l.c(str, "page_out")) {
            str2 = "page_in";
            str3 = "session_out";
            str4 = "biz_out";
            obj2 = "page_id";
            str5 = "app_out";
            str6 = "page_out";
            str7 = ",";
            e(str, j17, obj5, str11);
        } else {
            str4 = "biz_out";
            str3 = "session_out";
            str7 = ",";
            str5 = "app_out";
            str2 = "page_in";
            obj2 = "page_id";
            str6 = "page_out";
        }
        if (u46.l.c(str, "view_unexp")) {
            java.lang.Object obj6 = hashMap.get("view_id");
            if (obj6 == null) {
                obj6 = uy1.a.m(obj5);
            }
            obj3 = "view_id";
            e(str, j17, obj6, str11);
        } else {
            obj3 = "view_id";
        }
        if (!str.contains("view_") && !str.contains("cgi_")) {
            boolean z17 = obj5 instanceof hz1.a;
            hz1.a aVar = z17 ? (hz1.a) obj5 : null;
            if (hashMap.get("page_name") != null) {
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = str;
                objArr[1] = hashMap.get("page_name");
                objArr[2] = hashMap.get(obj2);
                objArr[3] = hashMap.get("biz_id");
                objArr[4] = java.lang.Integer.valueOf(aVar != null ? aVar.f367829j : -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.NewUserBehaviourReporter", java.lang.String.format("[reportStandardEvent] eventId : %s, pageName : %s, pageId : %s, bizId : %s, stackDeep : %d", objArr));
                if (u46.l.c(str, str6) && z17 && ((hz1.a) obj5).f367826g) {
                    java.lang.String.format("[reportStandardEvent] eventId : %s, pageName : %s, tab_in_red_dot_start_time : %s, tab_out_red_dot_start_time : %s", str, hashMap.get("page_name"), hashMap.get("tab_in_red_dot_start_time"), hashMap.get("tab_out_red_dot_start_time"));
                }
            } else if (u46.l.c(str, "app_in")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.NewUserBehaviourReporter", "[reportStandardEvent] --- --- ---");
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                objArr2[0] = str;
                if (obj5 == null) {
                    obj5 = "null";
                }
                objArr2[1] = obj5;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.NewUserBehaviourReporter", java.lang.String.format("[reportStandardEvent] pageName is null, eventId : %s, target : %s", objArr2));
                java.lang.String str12 = aVar != null ? aVar.f367822c : "unknow";
                if (pz1.a.a()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add("9");
                    arrayList.add(str12);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.l(24504, arrayList);
                }
            }
        } else if (hashMap.get(obj3) != null && hashMap.get(obj3).toString().contains("tab_red_dot_")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("enricwu.test.rd", java.lang.String.format("[reportStandardEvent] eventId : %s, view_id : %s, expose_start_time : %s", str, hashMap.get(obj3), hashMap.get("expose_start_time")));
        }
        if (u46.l.e(str) || u46.l.e(str11)) {
            return;
        }
        if (this.f431769d == null) {
            this.f431769d = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_data_report_is_report_all_uba, false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.NewUserBehaviourReporter", "[isReportAllUBA] mIsReportAllUBA : " + this.f431769d);
        }
        if (this.f431769d.booleanValue()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            java.lang.String str13 = str7;
            sb6.append(str13);
            sb6.append(j17);
            sb6.append(str13);
            sb6.append(str11);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.NewUserBehaviourReporter", "[reportAllUBA] sb : " + ((java.lang.Object) sb6));
            if (u46.l.c(str, "app_in") || u46.l.c(str, str5) || u46.l.c(str, "biz_in") || u46.l.c(str, str4) || u46.l.c(str, "session_in") || u46.l.c(str, str3) || u46.l.c(str, str2) || u46.l.c(str, str6) || u46.l.c(str, "view_clk") || u46.l.c(str, "view_double_tap") || u46.l.c(str, "view_long_press")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.p(28356, sb6.toString(), false, false, true);
            }
        }
    }
}
