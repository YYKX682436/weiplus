package y52;

/* loaded from: classes15.dex */
public abstract class b {
    public static void a(java.lang.String str, int i17, long j17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.String g17 = b52.b.g(str);
        r45.jw3 jw3Var = new r45.jw3();
        jw3Var.f459692d = g17;
        jw3Var.f459700o = i17;
        jw3Var.f459693e = j17;
        r45.c45 e17 = x52.c.e();
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellPageFlowManager", "addPageflow(addPage2Flow), Unknown Page: %s", g17);
            jw3Var.f459695g = null;
            x52.i.e();
        } else {
            java.lang.String m17 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.m(e17);
            jw3Var.f459695g = m17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellPageFlowManager", "addPageflow(addPage2Flow), session: %s, %s", g17, m17);
            x52.i.c(jw3Var);
        }
        r45.iw3 a17 = y52.a.a();
        a17.f458887d.addLast(jw3Var);
        y52.a.b(a17);
    }

    public static void b(r45.c45 c45Var, java.lang.String str, int i17, long j17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (c45Var == null || !b62.b.a(c45Var.f452803d)) {
            c(c45Var, str, i17, j17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellPageFlowManager", "addpageFlow scan-session, need filter !!");
        }
    }

    public static void c(r45.c45 c45Var, java.lang.String str, int i17, long j17) {
        r45.jw3 jw3Var;
        java.lang.String g17 = b52.b.g(str);
        r45.iw3 a17 = y52.a.a();
        if (c45Var == null) {
            if ("LauncherUI".equals(g17) || "FinderHomeUI".equals(g17) || "FinderHomeAffinityUI".equals(g17) || "FinderConversationUI".equals(g17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellPageFlowManager", "Invalidate Page: LauncherUI/FinderHomeUI");
                return;
            }
        } else if ("LauncherUI".equals(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellPageFlowManager", "Invalidate Page: LauncherUI");
            return;
        } else if ("FinderHomeUI".equals(g17) || "FinderHomeAffinityUI".equals(g17) || "FinderConversationUI".equals(g17)) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 a18 = p52.k.a();
            g17 = a18 != null ? a18.getClass().getSimpleName() : "FinderFollowTabFragment";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellPageFlowManager", "maybe invalidate Page: FinderHomeUI in %s, %s", c45Var.f452803d, g17);
        }
        java.util.LinkedList linkedList = a17.f458887d;
        r45.jw3 jw3Var2 = (r45.jw3) linkedList.peekLast();
        if (jw3Var2 != null) {
            if (jw3Var2.f459692d.equals(g17)) {
                if (c45Var != null && !c45Var.f452803d.equals(jw3Var2.f459695g)) {
                    java.lang.String str2 = jw3Var2.f459695g;
                    jw3Var2.f459695g = c45Var.f452803d;
                    linkedList.set(linkedList.size() - 1, jw3Var2);
                    j(a17, str2, c45Var.f452803d, false);
                    y52.a.b(a17);
                }
                if (jw3Var2.f459700o <= 0 && i17 > 0) {
                    jw3Var2.f459700o = i17;
                    y52.a.b(a17);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellPageFlowManager", "repeated page, no need to add this page: %s, %d, %s, %d", jw3Var2.f459692d, java.lang.Integer.valueOf(jw3Var2.f459700o), g17, java.lang.Integer.valueOf(i17));
                return;
            }
            if (c45Var != null && !jw3Var2.f459695g.equals(c45Var.f452803d)) {
                j(a17, jw3Var2.f459695g, c45Var.f452803d, true);
            }
            int size = linkedList.size();
            if (size > 2 && (jw3Var = (r45.jw3) linkedList.get(size - 2)) != null) {
                if ("MsgRetransmitUI".equals(jw3Var.f459692d) && "SelectConversationUI".equals(jw3Var2.f459692d) && "MsgRetransmitUI".equals(g17)) {
                    return;
                }
                if ("SelectConversationUI".equals(jw3Var.f459692d) && "MsgRetransmitUI".equals(jw3Var2.f459692d) && "SelectConversationUI".equals(g17)) {
                    return;
                }
            }
        }
        r45.jw3 jw3Var3 = new r45.jw3();
        jw3Var3.f459692d = g17;
        jw3Var3.f459700o = i17;
        jw3Var3.f459693e = j17;
        if (c45Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellPageFlowManager", "addPageFlow, Unknown Page: %s, %d", g17, java.lang.Integer.valueOf(i17));
            jw3Var3.f459695g = null;
            x52.i.e();
        } else {
            jw3Var3.f459695g = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.m(c45Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellPageFlowManager", "addPageFlow, session: %s, %d, %s", g17, java.lang.Integer.valueOf(i17), jw3Var3.f459695g);
            x52.i.c(jw3Var3);
        }
        linkedList.addLast(jw3Var3);
        y52.a.b(a17);
    }

    public static android.util.Pair d() {
        java.util.LinkedList linkedList = y52.a.a().f458887d;
        if (linkedList.isEmpty()) {
            return null;
        }
        return android.util.Pair.create((r45.jw3) linkedList.getLast(), java.lang.Integer.valueOf(linkedList.size() - 1));
    }

    public static nm5.b e(java.lang.String str, java.lang.String str2) {
        java.lang.String g17;
        if (str != null && str2 != null && !str2.isEmpty()) {
            java.lang.String g18 = b52.b.g(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellPageFlowManager", "getPageFlowItemOfCurSession: %s, %s", g18, str);
            java.util.LinkedList linkedList = y52.a.a().f458887d;
            for (int size = linkedList.size() - 1; size >= 0; size--) {
                r45.jw3 jw3Var = (r45.jw3) linkedList.get(size);
                if (jw3Var.f459695g.equals(str) && (g17 = b52.b.g(jw3Var.f459692d)) != null && g17.equals(g18)) {
                    return nm5.j.c(jw3Var, java.lang.Integer.valueOf(size));
                }
            }
        }
        return null;
    }

    public static java.util.List f(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = y52.a.a().f458887d;
        int size = linkedList.size();
        for (int i17 = 0; i17 < size; i17++) {
            r45.jw3 jw3Var = (r45.jw3) linkedList.get(i17);
            if (jw3Var.f459695g.equals(str)) {
                arrayList.add(jw3Var);
            }
        }
        return arrayList;
    }

    public static void g() {
        synchronized (y52.a.class) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            c52.c.d("mmkv_key_hell_PFLOW", new byte[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellPageFlowDao", "HellPageFlowDao-reset-time: %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void h(java.lang.String str, long j17) {
        r45.jw3 jw3Var;
        r45.iw3 a17 = y52.a.a();
        java.util.LinkedList linkedList = a17.f458887d;
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellPageFlowManager", "setEndTimeOfPageWhenEvent8, pageFlow.items == NULL");
            return;
        }
        java.lang.String g17 = b52.b.g(str);
        if (g17 == null || g17.isEmpty() || (jw3Var = (r45.jw3) linkedList.getLast()) == null) {
            return;
        }
        long j18 = j17 - jw3Var.f459693e;
        if (j18 <= 0) {
            j18 = 0;
        }
        jw3Var.f459694f = j18;
        y52.a.b(a17);
    }

    public static void i(r45.jw3 jw3Var, int i17) {
        if (jw3Var == null) {
            return;
        }
        r45.iw3 a17 = y52.a.a();
        try {
            a17.f458887d.set(i17, jw3Var);
            y52.a.b(a17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellPageFlowManager", e17, "updatePageFlow crash: %s", e17.getMessage());
        }
    }

    public static void j(r45.iw3 iw3Var, java.lang.String str, java.lang.String str2, boolean z17) {
        int size = iw3Var.f458887d.size();
        if (!z17) {
            size--;
        }
        for (int i17 = size - 1; i17 >= 0; i17--) {
            r45.jw3 jw3Var = (r45.jw3) iw3Var.f458887d.get(i17);
            if (jw3Var != null) {
                if (!jw3Var.f459695g.equals(str)) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.f181316a;
                nm5.b l17 = bVar.l(str);
                java.lang.String str3 = l17 != null ? (java.lang.String) l17.a(1) : null;
                nm5.b l18 = bVar.l(str2);
                java.lang.String str4 = l18 != null ? (java.lang.String) l18.a(1) : null;
                if (str3 != null && str3.equals(str4)) {
                    jw3Var.f459695g = str2;
                }
            }
        }
    }
}
