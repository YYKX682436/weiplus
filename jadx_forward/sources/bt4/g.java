package bt4;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static bt4.g f106004b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f106005a;

    public g() {
        java.util.Map d17;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f106005a = hashMap;
        hashMap.clear();
        gm0.j1.i();
        java.util.Iterator it = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(((java.lang.String) gm0.j1.u().c().l(270341, "")).split(";")).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null)) != null) {
                try {
                    java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.mallactivitynew.functionid");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f272 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27(str2);
                    c19101x8593f272.f261367g = (java.lang.String) d17.get(".sysmsg.mallactivitynew.activityid");
                    c19101x8593f272.f261378u = (java.lang.String) d17.get(".sysmsg.mallactivitynew.type");
                    c19101x8593f272.f261379v = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.mallactivitynew.showtype"), 0);
                    if (d17.containsKey(".sysmsg.mallactivitynew.showflag")) {
                        c19101x8593f272.f261364d = (java.lang.String) d17.get(".sysmsg.mallactivitynew.showflag");
                    } else {
                        c19101x8593f272.f261364d = "0";
                    }
                    if (d17.containsKey(".sysmsg.mallactivitynew.newsTipFlag")) {
                        c19101x8593f272.f261365e = (java.lang.String) d17.get(".sysmsg.mallactivitynew.newsTipFlag");
                    } else {
                        c19101x8593f272.f261365e = "0";
                    }
                    c19101x8593f272.f261375r = str;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        c19101x8593f27 = c19101x8593f272;
                    }
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallNewsManagerNewVersion", "cmdid error");
                }
            }
            if (c19101x8593f27 != null) {
                hashMap.put(c19101x8593f27.f261366f, c19101x8593f27);
            }
        }
    }

    public static bt4.g b() {
        if (f106004b == null) {
            f106004b = new bt4.g();
        }
        return f106004b;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27) {
        if (c19101x8593f27 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallNewsManagerNewVersion", "null obj");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<sysmsg><mallactivitynew><functionid>");
        java.lang.String str = c19101x8593f27.f261366f;
        sb6.append(str);
        sb6.append("</functionid><activityid>");
        sb6.append(c19101x8593f27.f261367g);
        sb6.append("</activityid><type>");
        sb6.append(c19101x8593f27.f261378u);
        sb6.append("</type><showflag>");
        sb6.append(c19101x8593f27.f261364d);
        sb6.append("</showflag><newsTipFlag>");
        sb6.append(c19101x8593f27.f261365e);
        sb6.append("</newsTipFlag></mallactivitynew></sysmsg>;");
        c19101x8593f27.f261375r = sb6.toString();
        ((java.util.HashMap) this.f106005a).put(str, c19101x8593f27);
        e();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c(java.lang.String str) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27) ((java.util.HashMap) this.f106005a).get(str);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.util.Map map = this.f106005a;
        if (!((java.util.HashMap) map).containsKey(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27) ((java.util.HashMap) map).get(str);
        if ("0".equals(c19101x8593f27.f261364d)) {
            c19101x8593f27.f261364d = "1";
            e();
        }
        return c19101x8593f27;
    }

    public boolean e() {
        java.util.Map map = this.f106005a;
        ((java.util.HashMap) map).size();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.lang.String str : ((java.util.HashMap) map).keySet()) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27) ((java.util.HashMap) map).get(str);
                stringBuffer.append(c19101x8593f27.f261375r.replace("</mallactivitynew></sysmsg>;", "").replaceAll("<activityid>([^<]*)</activityid>", "").replaceAll("<type>([^<]*)</type>", "").replaceAll("<showflag>([^<]*)</showflag>", "").replaceAll("<newsTipFlag>([^<]*)</newsTipFlag>", "") + "<activityid>" + c19101x8593f27.f261367g + "</activityid><type>" + c19101x8593f27.f261378u + "</type><showflag>" + c19101x8593f27.f261364d + "</showflag><newsTipFlag>" + c19101x8593f27.f261365e + "</newsTipFlag></mallactivitynew></sysmsg>;");
            }
        }
        gm0.j1.i();
        gm0.j1.u().c().w(270341, stringBuffer.toString());
        return true;
    }
}
