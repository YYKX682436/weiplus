package wg0;

/* loaded from: classes8.dex */
public final class a implements tg0.u1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f527241a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f527242b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var, java.util.Map map) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.lang.String str2;
        java.lang.String str3;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        if (jbVar == null) {
            hashMap = null;
        } else {
            hashMap = new java.util.HashMap();
            hashMap.put("view_id", "websearch_reddot");
            hashMap.put("tipsid", jbVar.f65880x11c19d58);
            hashMap.put("ctrl_type", java.lang.Integer.valueOf(jbVar.m55856xfb85f7b0()));
            hashMap.put("object_id", pm0.v.u(jbVar.W0().m75942xfb822ef2(0)));
            java.lang.String str4 = jbVar.f65874xb5f7102a.f470032t;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("ext_reportinfo", str4);
        }
        if (hashMap != null) {
            if (!(!hashMap.isEmpty())) {
                hashMap = null;
            }
            if (hashMap != null) {
                hashMap3.putAll(hashMap);
            }
        }
        if (f03Var == null) {
            hashMap2 = null;
        } else {
            hashMap2 = new java.util.HashMap();
            java.lang.String str5 = f03Var.f455425i;
            if (str5 == null) {
                str5 = "";
            }
            hashMap2.put("show_path", str5);
            java.lang.String str6 = f03Var.f455426m;
            hashMap2.put("show_parent_path", str6 != null ? str6 : "");
            hashMap2.put("show_type", java.lang.Integer.valueOf(f03Var.f455420d));
            hashMap2.put("message_num", java.lang.Integer.valueOf(f03Var.f455421e));
            hashMap2.put("limit_expose_count", java.lang.Integer.valueOf(f03Var.f455433t));
            hashMap2.put("limit_expose_strategy", java.lang.Integer.valueOf(f03Var.f455434u));
        }
        if (hashMap2 != null) {
            if (!(!hashMap2.isEmpty())) {
                hashMap2 = null;
            }
            if (hashMap2 != null) {
                hashMap3.putAll(hashMap2);
            }
        }
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        java.util.HashMap hashMap4 = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("Search.Entrance");
        if (L0 != null && (str3 = L0.f65880x11c19d58) != null) {
            hashMap4.put("current_entrance_path_id", str3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L02 = nk6.L0("Search.MentionEntrance");
        if (L02 != null && (str2 = L02.f65880x11c19d58) != null) {
            hashMap4.put("current_mention_path_id", str2);
        }
        if (!(!hashMap4.isEmpty())) {
            hashMap4 = null;
        }
        if (hashMap4 != null) {
            hashMap3.putAll(hashMap4);
        }
        if (map != null) {
            if (!(!map.isEmpty())) {
                map = null;
            }
            if (map != null) {
                hashMap3.putAll(map);
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(str, null, hashMap3, 8, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportEvent, eventId: ");
        sb6.append(str);
        sb6.append(", path: ");
        sb6.append(f03Var != null ? f03Var.f455425i : null);
        sb6.append(", ctrInfo: ");
        sb6.append(jbVar);
        sb6.append(", showInfo: ");
        sb6.append(f03Var);
        sb6.append(", reportParams: ");
        sb6.append(hashMap3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchRedDotReporter", sb6.toString());
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var) {
        java.lang.String str = f03Var != null ? f03Var.f455425i : null;
        java.lang.String str2 = jbVar != null ? jbVar.f65880x11c19d58 : null;
        if (jbVar == null || f03Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearchRedDotReporter", "reportExpose, invalid params, path: " + str + ", ctrInfo: " + jbVar + ", showInfo: " + f03Var);
            return;
        }
        java.util.Map map = this.f527241a;
        java.lang.String str3 = str != null ? (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) map).get(str) : null;
        if (str3 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, jbVar.f65880x11c19d58)) {
            if (str != null && str2 != null) {
                ((java.util.concurrent.ConcurrentHashMap) map).put(str, str2);
            }
            a("view_exp", jbVar, f03Var, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchRedDotReporter", "reportExpose, duplicated, path: " + str + " ctrInfo: " + jbVar + ", showInfo: " + f03Var);
    }

    public void c(r45.vt2 vt2Var) {
        if (vt2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearchRedDotReporter", "reportExpired, invalid params, revokeTabTips is null");
            return;
        }
        java.util.LinkedList m75941xfb821914 = vt2Var.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRevoke_tab_tips_info(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (it.hasNext()) {
            java.lang.String m75945x2fec8307 = ((r45.wt2) it.next()).m75945x2fec8307(0);
            if (m75945x2fec8307 != null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tab_tips_revoke_id", m75945x2fec8307);
                a("red_dot_revoked", null, null, hashMap);
            }
        }
    }
}
