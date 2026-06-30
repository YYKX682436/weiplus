package ot0;

/* loaded from: classes9.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f430010a = new kk.l(50);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f430011b = new java.util.concurrent.ConcurrentHashMap(50);

    public static java.lang.String a(java.lang.String str, int i17, int i18, int i19) {
        return b(str, i17, i18, i19, null, "");
    }

    public static java.lang.String b(java.lang.String str, int i17, int i18, int i19, com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var, java.lang.String str2) {
        return c(str, i17, i18, i19, s1Var, str2, -1, -1, "", "", 0);
    }

    public static java.lang.String c(java.lang.String str, int i17, int i18, int i19, com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var, java.lang.String str2, int i27, int i28, java.lang.String str3, java.lang.String str4, int i29) {
        java.lang.String str5;
        java.lang.String str6;
        boolean z17;
        boolean z18;
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(str)) {
            return str;
        }
        int i37 = com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a;
        if (i37 <= 0 && i18 < 0 && i17 < 0 && i19 <= 0) {
            return str;
        }
        int indexOf = str.indexOf("#");
        boolean z19 = false;
        if (indexOf > 0) {
            str5 = str.substring(0, indexOf);
            str6 = str.substring(indexOf);
        } else {
            str5 = str;
            str6 = "";
        }
        boolean z27 = true;
        if (str.contains("?")) {
            z17 = false;
        } else {
            str5 = str5 + "?";
            z17 = true;
        }
        if (s1Var != null && s1Var.A0()) {
            z19 = true;
        }
        if (z19) {
            z27 = !str5.contains("&scene=");
            z18 = !str5.contains("&subscene=");
        } else {
            z18 = true;
        }
        if (i17 >= 0 && z27) {
            str5 = str5.replaceAll("(&scene=[\\d]*)", "").replaceAll("(\\?scene=[\\d]*)", "?") + "&scene=" + i17;
        }
        if (i18 >= 0 && z18) {
            str5 = str5.replaceAll("(&subscene=[\\d]*)", "").replaceAll("(\\?subscene=[\\d]*)", "?") + "&subscene=" + i18;
        }
        if (i37 > 0) {
            str5 = str5 + "&sessionid=" + i37;
        }
        if (i27 >= 0) {
            str5 = str5 + "&flutter_pos=" + i27;
        }
        if (i19 > 0) {
            str5 = (str5 + "&clicktime=" + i19) + "&enterid=" + i19;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str5 = str5 + "&search_click_id=" + str2;
        }
        if (i28 > 0) {
            str5 = str5 + "&finder_biz_enter_id=" + i28;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str5 = str5 + "&ranksessionid=" + str3;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && i29 > 0) {
            str5 = (str5 + "&jumppath=" + str4) + "&jumppathdepth=" + i29;
        }
        if (z17) {
            str5 = str5.replace("?&", "?");
        }
        return str5 + str6;
    }

    public static java.lang.String d(int i17) {
        if (i17 <= 0) {
            return null;
        }
        long j17 = i17;
        if (j17 >= 86400) {
            return null;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(j17 < 3600 ? "mm:ss" : "HH:mm:ss");
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT+0:00"));
        return simpleDateFormat.format(java.lang.Long.valueOf(j17 * 1000));
    }

    public static r45.qp0 e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r45.tq0 tq0Var) {
        ot0.q v17;
        ot0.f fVar;
        if (f9Var == null || !f9Var.k2() || f9Var.t2() || (v17 = ot0.q.v(f9Var.U1())) == null || (fVar = (ot0.f) v17.y(ot0.f.class)) == null) {
            return null;
        }
        if (fVar.f429988b == -1 && fVar.f429999m != 1) {
            return null;
        }
        r45.qp0 qp0Var = new r45.qp0();
        qp0Var.f465696e = fVar.f429993g;
        qp0Var.f465695d = fVar.f429988b;
        qp0Var.f465709u = fVar.f429994h;
        qp0Var.f465701m = fVar.f429996j;
        qp0Var.f465697f = fVar.f429991e;
        qp0Var.f465698g = fVar.f429992f;
        qp0Var.f465700i = fVar.f429990d;
        qp0Var.f465699h = fVar.f429989c;
        qp0Var.f465706r = v17.f430267z;
        qp0Var.f465702n = v17.f430255w;
        qp0Var.f465703o = v17.f430259x;
        tq0Var.p(v17.f430187f);
        tq0Var.j(v17.f430191g);
        return qp0Var;
    }

    public static r45.qp0 f(ot0.s0 s0Var, r45.tq0 tq0Var, java.lang.String str, java.lang.String str2) {
        if (s0Var == null || s0Var.f430303o == -1) {
            return null;
        }
        r45.qp0 qp0Var = new r45.qp0();
        int i17 = s0Var.f430303o;
        qp0Var.f465696e = i17 == 5 ? 1 : 0;
        qp0Var.f465695d = i17;
        qp0Var.f465709u = s0Var.I;
        qp0Var.f465701m = s0Var.G;
        qp0Var.f465697f = s0Var.E;
        qp0Var.f465698g = s0Var.F;
        qp0Var.f465700i = s0Var.f430307q;
        qp0Var.f465699h = (int) s0Var.f430298h;
        qp0Var.f465702n = str;
        qp0Var.f465703o = str2;
        qp0Var.f465706r = s0Var.f430299i;
        tq0Var.p(s0Var.f430294d);
        tq0Var.j(s0Var.f430302n);
        return qp0Var;
    }

    public static r45.qp0 g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.q v17;
        ot0.f fVar;
        if (f9Var == null || !f9Var.M2() || (v17 = ot0.q.v(f9Var.U1())) == null || (fVar = (ot0.f) v17.y(ot0.f.class)) == null || fVar.f429998l == null) {
            return null;
        }
        r45.qp0 qp0Var = new r45.qp0();
        qp0Var.f465702n = v17.f430255w;
        qp0Var.f465703o = v17.f430259x;
        ot0.m1 m1Var = fVar.f429998l;
        qp0Var.f465707s = m1Var.f454872d;
        qp0Var.f465708t = m1Var.f454873e;
        qp0Var.f465701m = m1Var.f454874f;
        qp0Var.f465706r = m1Var.f454876h;
        qp0Var.f465697f = m1Var.f454878m;
        qp0Var.f465698g = m1Var.f454879n;
        qp0Var.f465700i = m1Var.f454877i;
        return qp0Var;
    }

    public static int h() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(context)) {
            return 100;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context)) {
            return 2;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
            return 3;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
            return 4;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(context)) {
            return 5;
        }
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context) ? 1 : 0;
    }

    public static java.lang.String i(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, long j17) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMsgBizHelper", "getReaderAppMsgContent: context is null");
            return null;
        }
        if (str == null || str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMsgBizHelper", "getReaderAppMsgContent: msg is null");
            return null;
        }
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            db5.t7.k(context, null);
            return null;
        }
        try {
            ot0.m0 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(j17, str);
            java.util.LinkedList linkedList = Di.f430114i;
            if (linkedList != null && linkedList.size() > 0 && i17 < linkedList.size()) {
                ot0.s0 s0Var = (ot0.s0) linkedList.get(i17);
                ot0.q qVar = new ot0.q();
                qVar.f430187f = s0Var.f430294d;
                qVar.f430191g = s0Var.f430302n;
                qVar.f430195h = "view";
                qVar.f430199i = 5;
                qVar.f430207k = s0Var.f430295e;
                qVar.f430255w = Di.f430111f;
                qVar.f430259x = Di.f430112g;
                qVar.f430263y = Di.f430113h;
                qVar.f430267z = j(s0Var);
                ot0.f fVar = new ot0.f();
                int i18 = s0Var.f430303o;
                fVar.f429988b = i18;
                fVar.f429994h = s0Var.I;
                if (i18 == 5 || i18 == 16) {
                    fVar.f429996j = s0Var.G;
                    fVar.f429989c = (int) s0Var.f430298h;
                    fVar.f429990d = s0Var.f430307q;
                    fVar.f429991e = s0Var.E;
                    fVar.f429992f = s0Var.F;
                }
                qVar.f(fVar);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430267z)) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str2);
                    if (n07 != null) {
                        qVar.f430267z = n07.c();
                    }
                }
                return ot0.q.u(qVar, null, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppMsgBizHelper", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgBizHelper", "retransmit app msg error : %s", e17.getLocalizedMessage());
        }
        return null;
    }

    public static java.lang.String j(ot0.s0 s0Var) {
        int i17 = s0Var.f430303o;
        return (i17 == 5 || i17 == 16) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f430299i) ? s0Var.D : s0Var.f430299i : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.D) ? s0Var.f430299i : s0Var.D;
    }

    public static java.lang.String k(java.lang.String str) {
        java.util.Map x17 = ot0.q.x(str);
        if (x17 == null) {
            x17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        }
        if (x17 != null) {
            java.lang.String str2 = (java.lang.String) x17.get(".msg.appmsg.mmreader.category.item.title");
            return str2 == null ? "" : str2;
        }
        ot0.r0 r0Var = new ot0.r0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it = r0Var.f430114i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ot0.s0 s0Var = (ot0.s0) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f430294d)) {
                sb6.append(s0Var.f430294d);
                break;
            }
        }
        return sb6.toString();
    }
}
