package bt4;

/* loaded from: classes9.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static bt4.f f106002b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f106003a;

    public f() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f106003a = hashMap;
        hashMap.clear();
        gm0.j1.i();
        java.util.Iterator it = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(((java.lang.String) gm0.j1.u().c().l(270339, "")).split(";")).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 e17 = e((java.lang.String) it.next());
            if (e17 != null) {
                hashMap.put(e17.f261366f, e17);
            }
        }
    }

    public static void a() {
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().h(262156, 266248);
    }

    public static bt4.f b() {
        if (f106002b == null) {
            f106002b = new bt4.f();
        }
        return f106002b;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 e(java.lang.String str) {
        java.util.Map d17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null)) == null) {
            return null;
        }
        try {
            java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.mallactivity.functionid");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27(str2);
            c19101x8593f27.f261367g = (java.lang.String) d17.get(".sysmsg.mallactivity.activityid");
            c19101x8593f27.f261368h = (java.lang.String) d17.get(".sysmsg.mallactivity.ticket");
            c19101x8593f27.f261378u = (java.lang.String) d17.get(".sysmsg.mallactivity.type");
            c19101x8593f27.f261379v = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.mallactivity.showtype"), 0);
            c19101x8593f27.f261380w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.mallactivity.walletregion"), 0);
            if (d17.containsKey(".sysmsg.mallactivity.showflag")) {
                c19101x8593f27.f261364d = (java.lang.String) d17.get(".sysmsg.mallactivity.showflag");
            } else {
                c19101x8593f27.f261364d = "0";
            }
            if (d17.containsKey(".sysmsg.mallactivity.newsTipFlag")) {
                c19101x8593f27.f261365e = (java.lang.String) d17.get(".sysmsg.mallactivity.newsTipFlag");
            } else {
                c19101x8593f27.f261365e = "0";
            }
            c19101x8593f27.f261375r = str;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return null;
            }
            return c19101x8593f27;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallNewsManager", "cmdid error");
            return null;
        }
    }

    public java.lang.String c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27) ((java.util.HashMap) this.f106003a).get(str);
        if (c19101x8593f27 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19101x8593f27.f261368h)) {
            return null;
        }
        return c19101x8593f27.f261368h;
    }

    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19100xad1ade2c.f261360o.f261367g)) {
                return;
            }
            gm0.j1.i();
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MALL_NEWS_MARKED_STRING_SYNC, "")).split(","));
            while (P1.size() > 20) {
                P1.remove(0);
            }
            if (P1.contains(c19100xad1ade2c.f261360o.f261367g)) {
                return;
            }
            P1.add(c19100xad1ade2c.f261360o.f261367g);
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(P1, ",");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "doSelectFunction %s, markedString %s", c19100xad1ade2c.f261360o.f261367g, c17);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MALL_NEWS_MARKED_STRING_SYNC, c17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallNewsManager", e17, "error in markedFunction", new java.lang.Object[0]);
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 f(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.util.Map map = this.f106003a;
        if (!((java.util.HashMap) map).containsKey(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27) ((java.util.HashMap) map).get(str);
        if ("0".equals(c19101x8593f27.f261364d)) {
            c19101x8593f27.f261364d = "1";
            g();
        }
        return c19101x8593f27;
    }

    public boolean g() {
        java.util.Map map = this.f106003a;
        ((java.util.HashMap) map).size();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.lang.String str : ((java.util.HashMap) map).keySet()) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27) ((java.util.HashMap) map).get(str);
                stringBuffer.append(c19101x8593f27.f261375r.replace("</mallactivity></sysmsg>", "").replaceAll("<showflag>([^<]*)</showflag>", "").replaceAll("<newsTipFlag>([^<]*)</newsTipFlag>", "") + "<showflag>" + c19101x8593f27.f261364d + "</showflag><newsTipFlag>" + c19101x8593f27.f261365e + "</newsTipFlag></mallactivity></sysmsg>;");
            }
        }
        gm0.j1.i();
        gm0.j1.u().c().w(270339, stringBuffer.toString());
        return true;
    }
}
