package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.ua f106047a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f106048b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106049c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f106050d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f106051e;

    /* renamed from: f, reason: collision with root package name */
    public long f106052f;

    /* renamed from: g, reason: collision with root package name */
    public long f106053g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f106054h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f106055i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f106056j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f106057k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.b3 f106058l;

    /* renamed from: m, reason: collision with root package name */
    public long f106059m;

    /* renamed from: n, reason: collision with root package name */
    public long f106060n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f106061o;

    /* renamed from: p, reason: collision with root package name */
    public long f106062p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.pb f106063q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.e3 f106064r;

    /* renamed from: s, reason: collision with root package name */
    public int f106065s;

    /* renamed from: t, reason: collision with root package name */
    public long f106066t;

    /* renamed from: u, reason: collision with root package name */
    public long f106067u;

    public z5(com.tencent.mm.plugin.finder.extension.reddot.ua freqController) {
        kotlin.jvm.internal.o.g(freqController, "freqController");
        this.f106047a = freqController;
        this.f106048b = "Finder.RedDotReport32092Helper";
        this.f106049c = -1;
        this.f106050d = "";
        this.f106051e = "";
        this.f106061o = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.y5.f106033d);
        this.f106065s = -1;
    }

    public static final com.tencent.mm.plugin.finder.extension.reddot.w5 l(java.util.List list, java.lang.String str) {
        java.lang.Object obj;
        java.lang.String str2;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) obj).getValue()).f105588b, str)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        java.lang.String str3 = (java.lang.String) entry.getKey();
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105587a;
        r45.vs2 vs2Var = jbVar.field_ctrInfo;
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = jbVar.field_tipsShowEntranceExtInfo;
        if (finderTipsShowEntranceExtInfo == null || (str2 = finderTipsShowEntranceExtInfo.getString(5)) == null) {
            str2 = "";
        }
        return new com.tencent.mm.plugin.finder.extension.reddot.w5(vs2Var, str3, str2, java.lang.Boolean.valueOf(jbVar.a1(str3)), jbVar.N.getLong(3));
    }

    public static void m(com.tencent.mm.plugin.finder.extension.reddot.z5 z5Var, long j17, long j18, java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4, org.json.JSONObject jSONObject5, org.json.JSONObject jSONObject6, java.lang.String str2, org.json.JSONObject jSONObject7, java.lang.String str3, java.lang.String str4, org.json.JSONObject jSONObject8, java.lang.String str5, java.lang.String str6, int i17, long j19, long j27, int i18, java.lang.Object obj) {
        int i19;
        long j28;
        if ((i18 & 65536) != 0) {
            ((b81.a) ((y71.e) i95.n0.c(y71.e.class))).getClass();
            i19 = z71.f.Bi().f470519d;
        } else {
            i19 = i17;
        }
        if ((i18 & 131072) != 0) {
            ((b81.a) ((y71.e) i95.n0.c(y71.e.class))).getClass();
            j28 = z71.f.Bi().Ai();
        } else {
            j28 = j19;
        }
        long j29 = (i18 & 262144) != 0 ? 0L : j27;
        z5Var.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FindFriendsEntryRedDotPunishStruct findFriendsEntryRedDotPunishStruct = new com.tencent.mm.autogen.mmdata.rpt.FindFriendsEntryRedDotPunishStruct();
        findFriendsEntryRedDotPunishStruct.f56394d = j17;
        findFriendsEntryRedDotPunishStruct.f56395e = j18;
        findFriendsEntryRedDotPunishStruct.f56396f = findFriendsEntryRedDotPunishStruct.b("sns_info", str, true);
        java.lang.String jSONObject9 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject9, "toString(...)");
        findFriendsEntryRedDotPunishStruct.f56397g = findFriendsEntryRedDotPunishStruct.b("finder_info", r26.i0.t(jSONObject9, ",", ";", false), true);
        java.lang.String jSONObject10 = jSONObject2.toString();
        kotlin.jvm.internal.o.f(jSONObject10, "toString(...)");
        findFriendsEntryRedDotPunishStruct.f56398h = findFriendsEntryRedDotPunishStruct.b("listen_audio_info", r26.i0.t(jSONObject10, ",", ";", false), true);
        java.lang.String jSONObject11 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject11, "toString(...)");
        findFriendsEntryRedDotPunishStruct.f56399i = findFriendsEntryRedDotPunishStruct.b("listen_music_info", r26.i0.t(jSONObject11, ",", ";", false), true);
        java.lang.String jSONObject12 = jSONObject4.toString();
        kotlin.jvm.internal.o.f(jSONObject12, "toString(...)");
        findFriendsEntryRedDotPunishStruct.f56400j = findFriendsEntryRedDotPunishStruct.b("live_info", r26.i0.t(jSONObject12, ",", ";", false), true);
        java.lang.String jSONObject13 = jSONObject5.toString();
        kotlin.jvm.internal.o.f(jSONObject13, "toString(...)");
        findFriendsEntryRedDotPunishStruct.f56401k = findFriendsEntryRedDotPunishStruct.b("only_browse_info", r26.i0.t(jSONObject13, ",", ";", false), true);
        java.lang.String jSONObject14 = jSONObject6.toString();
        kotlin.jvm.internal.o.f(jSONObject14, "toString(...)");
        findFriendsEntryRedDotPunishStruct.f56402l = findFriendsEntryRedDotPunishStruct.b("browse_longvideo_info", r26.i0.t(jSONObject14, ",", ";", false), true);
        findFriendsEntryRedDotPunishStruct.f56403m = findFriendsEntryRedDotPunishStruct.b("browse_newlife_info", str2, true);
        java.lang.String jSONObject15 = jSONObject7.toString();
        kotlin.jvm.internal.o.f(jSONObject15, "toString(...)");
        findFriendsEntryRedDotPunishStruct.f56404n = findFriendsEntryRedDotPunishStruct.b("search_info", r26.i0.t(jSONObject15, ",", ";", false), true);
        findFriendsEntryRedDotPunishStruct.f56405o = findFriendsEntryRedDotPunishStruct.b("see_people_near_by_info", str3, true);
        findFriendsEntryRedDotPunishStruct.f56406p = findFriendsEntryRedDotPunishStruct.b("jd_store_info", str4, true);
        java.lang.String jSONObject16 = jSONObject8.toString();
        kotlin.jvm.internal.o.f(jSONObject16, "toString(...)");
        findFriendsEntryRedDotPunishStruct.f56407q = findFriendsEntryRedDotPunishStruct.b("game_info", r26.i0.t(jSONObject16, ",", ";", false), true);
        findFriendsEntryRedDotPunishStruct.f56408r = findFriendsEntryRedDotPunishStruct.b("app_brand_info", str5, true);
        findFriendsEntryRedDotPunishStruct.f56409s = findFriendsEntryRedDotPunishStruct.b("find_entry_switch", java.lang.String.valueOf(i19), true);
        findFriendsEntryRedDotPunishStruct.f56410t = findFriendsEntryRedDotPunishStruct.b("find_entry_reddot_switch", java.lang.String.valueOf(j28), true);
        findFriendsEntryRedDotPunishStruct.f56411u = findFriendsEntryRedDotPunishStruct.b("config_nms", str6, true);
        findFriendsEntryRedDotPunishStruct.f56412v = j29;
        findFriendsEntryRedDotPunishStruct.f56413w = com.tencent.mm.plugin.finder.storage.aj0.f126440a.u();
        findFriendsEntryRedDotPunishStruct.k();
    }

    public final org.json.JSONObject a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, java.util.List list) {
        java.lang.Object obj;
        jSONObject.put("is_abandon_rd", kotlin.jvm.internal.o.b(str, str2) ? 1 : 0);
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) obj).getValue()).f105588b, str)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (entry != null) {
            jSONObject.put("abandon_win_type", ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105591e.f105895d);
            if (((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105591e == com.tencent.mm.plugin.finder.extension.reddot.u5.f105889g) {
                jSONObject.put("win_sub_type", ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105592f.f105994d);
            }
        } else {
            com.tencent.mm.plugin.finder.extension.reddot.u5 u5Var = com.tencent.mm.plugin.finder.extension.reddot.u5.f105887e;
            jSONObject.put("abandon_win_type", 0);
        }
        return jSONObject;
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.w5 b(java.util.List list, java.lang.String str) {
        java.lang.Object obj;
        java.lang.String string;
        java.lang.String string2;
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((r45.rc4) obj).getString(2), str)) {
                break;
            }
        }
        r45.rc4 rc4Var = (r45.rc4) obj;
        return new com.tencent.mm.plugin.finder.extension.reddot.w5(rc4Var != null ? (r45.vs2) rc4Var.getCustom(3) : null, (rc4Var == null || (string2 = rc4Var.getString(0)) == null) ? "" : string2, (rc4Var == null || (string = rc4Var.getString(6)) == null) ? "" : string, rc4Var != null ? java.lang.Boolean.valueOf(rc4Var.getBoolean(7)) : null, rc4Var != null ? rc4Var.getLong(8) : 0L);
    }

    public final java.util.LinkedList c() {
        return (java.util.LinkedList) ((jz5.n) this.f106061o).getValue();
    }

    public final java.lang.String d(r45.at2 at2Var) {
        java.util.LinkedList d17 = com.tencent.mm.plugin.finder.extension.reddot.qa.d(at2Var, 0, null, 3, null);
        if (d17 == null || d17.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int size = d17.size();
        int i17 = 0;
        for (java.lang.Object obj : d17) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.f90 f90Var = (r45.f90) obj;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(f90Var.getInteger(0));
            sb7.append('-');
            sb7.append(f90Var.getInteger(1));
            sb6.append(sb7.toString());
            if (i17 < size - 1) {
                sb6.append(";");
            }
            i17 = i18;
        }
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        return sb8;
    }

    public final org.json.JSONObject e(java.lang.StringBuilder sb6, boolean z17, java.lang.String str, int i17, java.util.List list, java.util.List list2, java.util.Map map) {
        if (!z17) {
            return f(sb6, false, str, i17, b(list2, str), map);
        }
        if (!(this.f106050d.length() > 0)) {
            return f(sb6, false, str, i17, b(this.f106055i, str), map);
        }
        if (kotlin.jvm.internal.o.b(this.f106050d, "find_friends_by_look")) {
            return (this.f106064r == com.tencent.mm.plugin.finder.extension.reddot.e3.f105490e && kotlin.jvm.internal.o.b(str, "NewLife.Entrance_8")) ? f(sb6, true, str, i17, b(this.f106055i, str), map) : (this.f106064r == com.tencent.mm.plugin.finder.extension.reddot.e3.f105491f && kotlin.jvm.internal.o.b(str, "NewLife.Entrance_6")) ? f(sb6, true, str, i17, b(this.f106055i, str), map) : f(sb6, false, str, i17, b(this.f106055i, str), map);
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f106050d, "find_friends_by_ting");
        java.lang.String str2 = this.f106048b;
        if (b17 || kotlin.jvm.internal.o.b(this.f106050d, "find_friends_by_ting_play_state")) {
            if ((this.f106065s != 1 || !kotlin.jvm.internal.o.b(str, "Listen.Entrance_14")) && (this.f106065s != 0 || !kotlin.jvm.internal.o.b(str, "Listen.Entrance_10"))) {
                return f(sb6, false, str, i17, b(this.f106055i, str), map);
            }
            com.tencent.mars.xlog.Log.i(str2, "clickEntryKey=" + this.f106050d + ",clickTingSelectTab=" + this.f106065s);
            return f(sb6, true, str, i17, b(this.f106055i, str), map);
        }
        if (!list.contains(this.f106050d)) {
            return f(sb6, false, str, i17, b(this.f106055i, str), map);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("clickEntryKey=");
        sb7.append(this.f106050d);
        sb7.append(",entryPath=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        sb7.append(arrayList);
        com.tencent.mars.xlog.Log.i(str2, sb7.toString());
        return f(sb6, true, str, i17, b(this.f106055i, str), map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x04a4, code lost:
    
        if (r4 == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04d0, code lost:
    
        if ((r21.length() == 0 ? r13 : false) != false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0525, code lost:
    
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0527, code lost:
    
        if (r4 != null) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0529, code lost:
    
        r11 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x052d, code lost:
    
        r0.put("feedid", r11);
        r0.put("reportExtInfo", r2);
        r0 = r0.toString();
        kotlin.jvm.internal.o.f(r0, "toString(...)");
        r0 = r26.i0.t(r0, ",", ";", false);
        r6.put("ext_info", r0);
        r2 = new java.lang.StringBuilder("\text_info:");
        r2.append(r0);
        r2.append("\t reportExtInfo is empty=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0563, code lost:
    
        if (r21.length() != 0) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0566, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0567, code lost:
    
        r2.append(r13);
        r26.append(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x052c, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x051f, code lost:
    
        if ((r2.length() > 0 ? r13 : false) != false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0523, code lost:
    
        if (r2 == null) goto L303;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Type inference failed for: r13v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [dm.a5, com.tencent.mm.plugin.finder.extension.reddot.jb] */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Long, java.lang.Number] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [com.tencent.mm.plugin.finder.extension.reddot.v5] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [com.tencent.mm.plugin.finder.viewmodel.component.ny] */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject f(java.lang.StringBuilder r26, boolean r27, java.lang.String r28, int r29, com.tencent.mm.plugin.finder.extension.reddot.w5 r30, java.util.Map r31) {
        /*
            Method dump skipped, instructions count: 1435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.z5.f(java.lang.StringBuilder, boolean, java.lang.String, int, com.tencent.mm.plugin.finder.extension.reddot.w5, java.util.Map):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(java.lang.StringBuilder r18, boolean r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.z5.g(java.lang.StringBuilder, boolean, java.util.List):java.lang.String");
    }

    public final boolean h() {
        return (this.f106050d.length() > 0) && this.f106052f > 0;
    }

    public final void i(java.lang.String str) {
        if (!h() || this.f106062p <= 0) {
            return;
        }
        c().add(java.lang.Long.valueOf(c01.id.c() - this.f106062p));
        this.f106062p = 0L;
    }

    public final void j(com.tencent.mm.plugin.finder.extension.reddot.b3 actionType, java.util.List list, java.util.List list2, java.util.Map penalizedMap) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(penalizedMap, "penalizedMap");
        this.f106067u = c01.id.e();
        boolean h17 = h();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exit find actionType=");
        sb6.append(actionType);
        sb6.append(", ");
        java.util.ArrayList arrayList2 = null;
        sb6.append(h17 ^ true ? "report exit" : null);
        sb6.append(";\thaveClickTab=");
        sb6.append(h17);
        sb6.append(",clickEntryKey=");
        sb6.append(this.f106050d);
        sb6.append(",clickStartTimeMs=");
        sb6.append(this.f106052f);
        sb6.append(",clickHide=");
        sb6.append(this.f106057k);
        sb6.append(",clickLastEnterFindTime=");
        sb6.append(this.f106059m);
        sb6.append(",clickBackgroundTimeList=");
        sb6.append(c());
        sb6.append(";enterFindTime=");
        sb6.append(this.f106066t);
        sb6.append(",exitFindTime=");
        sb6.append(this.f106067u);
        sb6.append('\n');
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.rc4) it.next()).getString(2));
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        sb6.append(";sns=");
        if (list2 != null) {
            arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((r45.rc4) it6.next()).getString(2));
            }
        }
        sb6.append(arrayList2);
        sb6.append('!');
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f106048b;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (h17) {
            this.f106057k = true;
            this.f106058l = actionType;
            this.f106060n = this.f106067u;
            return;
        }
        this.f106052f = 0L;
        if (this.f106066t > 0) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            m(this, this.f106066t, this.f106067u, g(sb8, false, list2), e(sb8, false, "FinderEntrance", 1, kz5.b0.c("find_friends_by_finder"), list, penalizedMap), e(sb8, false, "Listen.Entrance_14", 14, kz5.c0.i("find_friends_by_ting", "find_friends_by_ting_play_state"), list, penalizedMap), e(sb8, false, "Listen.Entrance_10", 10, kz5.c0.i("find_friends_by_ting", "find_friends_by_ting_play_state"), list, penalizedMap), e(sb8, false, "FinderLiveEntrance", 2, kz5.c0.i("find_friends_by_finder_live", "find_friends_by_finder_live_above_look"), list, penalizedMap), e(sb8, false, "NewLife.Entrance_6", 6, kz5.b0.c("find_friends_by_look"), list, penalizedMap), e(sb8, false, "NewLife.Entrance_8", 8, kz5.b0.c("find_friends_by_look"), list, penalizedMap), "", e(sb8, false, "Search.Entrance", 9, kz5.b0.c("find_friends_by_search"), list, penalizedMap), "", "", e(sb8, false, "Game.Entrance", 13, kz5.b0.c("more_tab_game_recommend"), list, penalizedMap), "", d(((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f106047a).v()), 0, 0L, 0L, 458752, null);
            com.tencent.mars.xlog.Log.i(str, "onFindTabDismiss " + ((java.lang.Object) sb8));
        }
        this.f106066t = 0L;
        this.f106067u = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.tencent.mm.plugin.finder.extension.reddot.b3 r46, java.util.Map r47) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.z5.k(com.tencent.mm.plugin.finder.extension.reddot.b3, java.util.Map):void");
    }
}
