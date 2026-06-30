package i53;

@j95.b
/* loaded from: classes8.dex */
public class d0 extends i95.w implements m33.n1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f370074d = new java.util.HashMap();

    public static void wi(i53.d0 d0Var, boolean z17, java.lang.String str) {
        m33.g1 mj6;
        d0Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (mj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).mj(str)) == null) {
            return;
        }
        if (z17) {
            n53.b.a(mj6.f404821b, 3L, 103, 10, 0, mj6.f404829j);
        } else {
            n53.b.a(mj6.f404821b, 3L, 103, 10, 1, mj6.f404829j);
        }
    }

    public void Ai(org.json.JSONArray jSONArray, boolean z17) {
        java.util.LinkedList linkedList;
        java.util.HashMap hashMap = this.f370074d;
        if (!z17) {
            java.util.LinkedList b17 = r53.f.b(jSONArray);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b17)) {
                return;
            }
            java.util.Iterator it = b17.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                i53.d3 d3Var = (i53.d3) hashMap.remove(str);
                if (d3Var != null) {
                    d3Var.b();
                }
                Bi(str, 1);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().y0(b17);
            return;
        }
        java.util.Iterator it6 = hashMap.keySet().iterator();
        while (it6.hasNext()) {
            ((i53.d3) hashMap.get((java.lang.String) it6.next())).b();
        }
        i53.g0 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai();
        Ai.getClass();
        java.lang.String format = java.lang.String.format("select * from %s", "GameHaowanPublishEdition");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "queryAll, sql : %s", format);
        android.database.Cursor m145256x1d3f4980 = Ai.m145256x1d3f4980(format, new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            linkedList = null;
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            while (m145256x1d3f4980.moveToNext()) {
                i53.x xVar = new i53.x();
                xVar.mo9015xbf5d97fd(m145256x1d3f4980);
                linkedList2.add(xVar);
            }
            m145256x1d3f4980.close();
            linkedList = linkedList2;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().y0(r53.f.G(((i53.x) it7.next()).f67208xae33d3df));
            }
        }
        java.lang.String format2 = java.lang.String.format("delete from %s", "GameHaowanPublishEdition");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "deleteAll, sql : %s", format2);
        Ai.m145253xb158737d("GameHaowanPublishEdition", format2);
        hashMap.clear();
        Bi("", 1);
    }

    public final void Bi(final java.lang.String str, final int i17) {
        java.util.Iterator it = m33.s0.f404863a.iterator();
        while (it.hasNext()) {
            m33.w1 w1Var = (m33.w1) it.next();
            if (w1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.g0) w1Var;
                try {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("game_haowan_publish_post_id", str);
                    bundle.putInt("game_haowan_publish_retcode", i17);
                    java.util.Iterator it6 = ((java.util.ArrayList) g0Var.f265065a.f265019i).iterator();
                    while (it6.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it6.next()).f265328d.mo70207xf5bc2045(254, bundle);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "notify network change failed :%s", e17.getMessage());
                }
            }
        }
        fs.g.b(m33.x1.class, new fs.o() { // from class: m33.s0$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                java.lang.String str2 = str;
                int i18 = i17;
                ((ah0.w0) ((m33.x1) nVar)).getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("postId", str2);
                    jSONObject.put("result", i18);
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "onPublishHaowanEnd");
                    bundle2.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.toString());
                    ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle2, tw4.a.class, null);
                    if (!((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
                        return false;
                    }
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.l("onPublishHaowanEnd", jSONObject);
                    return false;
                } catch (java.lang.Exception e18) {
                    java.lang.String obj = e18.toString();
                    int i19 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HaowanPublishStateEvent", obj, null);
                    return false;
                }
            }
        });
    }

    public java.lang.String Di(int i17, int i18, org.json.JSONArray jSONArray, java.lang.String str, boolean z17, int i19, m33.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        gm0.j1.i();
        sb6.append(gm0.j1.b().h());
        sb6.append("_");
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String g17 = kk.k.g(sb6.toString().getBytes());
        java.util.LinkedList b17 = r53.f.b(jSONArray);
        i53.x xVar = new i53.x();
        xVar.f67215x11522065 = g17;
        xVar.f67207xac3be4e = java.lang.System.currentTimeMillis() / 1000;
        xVar.f67212xf10bdf85 = i17;
        xVar.f67210x1a330c39 = i18;
        xVar.f67208xae33d3df = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b17) ? "" : b17.toString();
        xVar.f67204xedd646cf = str;
        xVar.f67206xc119393c = z17;
        xVar.f67214xf10c4fa7 = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishImpl", "addToDB: " + ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().mo880xb970c2b9(xVar));
        return Ni(i18, xVar, z17, m1Var);
    }

    public final java.lang.String Ni(int i17, i53.x xVar, boolean z17, m33.m1 m1Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xVar.f67208xae33d3df)) {
            Vi(xVar.f67215x11522065, xVar.f67212xf10bdf85, null, xVar.f67204xedd646cf, xVar.f67214xf10c4fa7, m1Var);
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(new i53.z(this, i17, xVar, z17, m1Var));
        }
        return xVar.f67215x11522065;
    }

    public java.lang.String Ri(java.lang.String str) {
        i53.x xVar;
        i53.g0 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai();
        Ai.getClass();
        java.lang.String format = java.lang.String.format("select * from %s where %s=\"%s\" and %s<>%d", "GameHaowanPublishEdition", "taskId", str, "publishState", 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "queryWhenPublishNotSuccess, sql : %s", format);
        android.database.Cursor m145256x1d3f4980 = Ai.m145256x1d3f4980(format, new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            xVar = null;
        } else {
            if (m145256x1d3f4980.moveToNext()) {
                xVar = new i53.x();
                xVar.mo9015xbf5d97fd(m145256x1d3f4980);
            } else {
                xVar = null;
            }
            m145256x1d3f4980.close();
        }
        if (xVar == null) {
            return null;
        }
        return Ni(xVar.f67210x1a330c39, xVar, xVar.f67206xc119393c, new m33.m1());
    }

    public final void Ui(java.lang.String str) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().P0(str, 1);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().W0(str, 1);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new i53.a0(this, str), 2000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vi(java.lang.String r16, int r17, java.util.LinkedList r18, java.lang.String r19, int r20, m33.m1 r21) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i53.d0.Vi(java.lang.String, int, java.util.LinkedList, java.lang.String, int, m33.m1):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:58|59|60|61|(8:62|63|64|65|66|67|(4:71|72|68|69)|73)|74|75|76|78|79|56) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONArray Zi(org.json.JSONArray r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i53.d0.Zi(org.json.JSONArray, boolean):org.json.JSONArray");
    }
}
