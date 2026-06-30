package t21;

/* loaded from: classes12.dex */
public final class i3 {
    public i3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.util.Map map, java.lang.String str) {
        java.lang.String str2;
        if (map != null) {
            str2 = (java.lang.String) map.get(".msg.videomsg.$" + str);
        } else {
            str2 = null;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str2 == null ? "" : str2;
    }

    public final int b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        l15.f l17;
        if (f9Var == null) {
            return 0;
        }
        y15.d dVar = new y15.d();
        java.lang.String j17 = f9Var.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
        dVar.m126728xdc93280d(j17);
        l15.d l18 = dVar.l();
        return (l18 == null || (l17 = l18.l()) == null) ? f9Var.R : l17.j();
    }

    public final java.lang.String c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        n15.a k17;
        java.lang.String j17;
        if (f9Var == null) {
            return "";
        }
        boolean z17 = false;
        if (f9Var.j() != null) {
            java.lang.String j18 = f9Var.j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j18, "getContent(...)");
            if (j18.length() > 0) {
                z17 = true;
            }
        }
        if (!z17) {
            f9Var = null;
        }
        if (f9Var == null) {
            return "";
        }
        y15.d dVar = new y15.d();
        java.lang.String j19 = f9Var.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j19, "getContent(...)");
        dVar.m126728xdc93280d(j19);
        l15.d l17 = dVar.l();
        return (l17 == null || (k17 = l17.k()) == null || (j17 = k17.j()) == null) ? f9Var.Q : j17;
    }

    public final t21.j3 d(java.lang.String str) {
        java.lang.String str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        int K = r26.n0.K(str, '<', 0, false, 6, null);
        if (K > 0) {
            str2 = str.substring(K);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
        } else {
            str2 = str;
        }
        int hashCode = "parse_".concat(str).hashCode();
        t21.j3 j3Var = (t21.j3) ((lt0.f) t21.j3.f496334i).get(java.lang.Integer.valueOf(hashCode));
        if (j3Var != null) {
            return j3Var;
        }
        t21.j3 j3Var2 = new t21.j3();
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str2, "msg", null);
        try {
            t21.i3 i3Var = t21.j3.f496333h;
            j3Var2.f496336a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(i3Var.a(d17, "overwritenewmsgid"), 0L);
            i3Var.a(d17, "fileuploadtoken");
            j3Var2.f496338c = i3Var.a(d17, "rawmd5");
            j3Var2.f496339d = i3Var.a(d17, "cdnrawvideourl");
            j3Var2.f496341f = i3Var.a(d17, "cdnrawvideoaeskey");
            j3Var2.f496342g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(i3Var.a(d17, "rawlength"), 0);
            j3Var2.f496337b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(i3Var.a(d17, "isplaceholder"), 0) == 1;
            j3Var2.f496340e = i3Var.a(d17, "cdnvideourl");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoParseInfo", "parsing video msg xml failed", e17);
        }
        ((lt0.f) t21.j3.f496334i).put(java.lang.Integer.valueOf(hashCode), j3Var2);
        long j17 = j3Var2.f496336a;
        if (j17 != 0) {
            ((lt0.f) t21.j3.f496335j).put(java.lang.Long.valueOf(j17), j3Var2);
        }
        return j3Var2;
    }

    public final void e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        if (!pt0.f0.f439742b1.h() && f9Var != null) {
            f9Var.R = i17;
            f9Var.f317711r = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("talker: ");
        sb6.append(f9Var != null ? f9Var.Q0() : null);
        sb6.append(", msgId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(", downloadControlType: ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoParseInfo", sb6.toString());
    }

    public final void f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (!pt0.f0.f439742b1.h() && f9Var != null) {
            f9Var.Q = str;
            f9Var.f317711r = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("talker: ");
        sb6.append(f9Var != null ? f9Var.Q0() : null);
        sb6.append(", msgId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(", expIdStr: ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoParseInfo", sb6.toString());
    }
}
