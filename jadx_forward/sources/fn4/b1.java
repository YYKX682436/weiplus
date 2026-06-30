package fn4;

/* loaded from: classes15.dex */
public class b1 {

    /* renamed from: b, reason: collision with root package name */
    public static final fn4.b1 f346014b = new fn4.b1();

    /* renamed from: a, reason: collision with root package name */
    public r45.xn6 f346015a;

    public void a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, r45.un6 un6Var, r45.xn6 xn6Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xn6Var.f471797p) ? abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsm) : xn6Var.f471797p;
        gp0Var.K0(xn6Var.f471795n);
        gp0Var.O0(xn6Var.f471796o);
        gp0Var.m0(string);
        gp0Var.o0(xn6Var.f471799q);
        gp0Var.x0(true);
        gp0Var.z0(true);
        gp0Var.h0(5);
        r45.tq0 tq0Var = new r45.tq0();
        tq0Var.o(xn6Var.f471799q);
        tq0Var.p(xn6Var.f471796o);
        tq0Var.j(string);
        bq0Var.r(tq0Var);
        su4.l2 l2Var = new su4.l2();
        l2Var.f494516b = xn6Var.f471792h;
        l2Var.f494517c = xn6Var.f471806x;
        l2Var.f494518d = un6Var.f469040m;
        l2Var.f494519e = xn6Var.f471805w;
        l2Var.f494520f = 100201L;
        l2Var.f494521g = xn6Var.f471795n;
        l2Var.f494522h = xn6Var.f471796o;
        l2Var.f494523i = xn6Var.f471797p;
        l2Var.f494524j = xn6Var.f471799q;
        l2Var.f494525k = xn6Var.f471800r;
        l2Var.f494526l = xn6Var.f471801s;
        l2Var.f494527m = xn6Var.f471802t;
        l2Var.f494528n = xn6Var.f471803u;
        l2Var.f494529o = xn6Var.f471807y;
        l2Var.f494530p = xn6Var.f471808z;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(un6Var.f469044q);
        linkedList.addAll(xn6Var.W);
        l2Var.f494532r = pm4.w.s(xn6Var.D).toString();
        l2Var.f494531q = c(linkedList).toString();
        l2Var.f494533s = xn6Var.M;
        l2Var.f494534t = xn6Var.f471790f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l2Var.c(sb6, null, null, null, 0, 0);
        tq0Var.q(sb6.toString());
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(3);
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.f(xn6Var.f471795n);
        jq0Var.i(xn6Var.f471795n);
        java.lang.String str = gp0Var.f456937d;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87851d = str;
        c4Var.f87848a = bq0Var;
        c4Var.f87860m = 25;
        c4Var.getClass();
        c4Var.f87850c = 5;
        c4Var.f87856i = abstractActivityC21394xb3d2c0cf;
        bq0Var.o(jq0Var);
        bq0Var.f452497f.add(gp0Var);
        c5303xc75d2f73.e();
    }

    public void b(fn4.b bVar, int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        if (i17 == 1024) {
            if (i18 == -1) {
                dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi, 1).show();
                pm4.y.h(bVar.r0(), this.f346015a, "1", c01.z1.r(), "");
                return;
            }
            return;
        }
        if (i17 != 2048 || i18 != -1 || (stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames")) == null || stringArrayListExtra.size() <= 0) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("");
        java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(next)) {
                sb6.append("3;");
            } else {
                sb6.append("2;");
            }
            sb7.append(next);
            sb7.append(";");
        }
        pm4.y.h(bVar.r0(), this.f346015a, sb6.toString(), c01.z1.r(), sb7.toString());
    }

    public final org.json.JSONArray c(java.util.List list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < list.size(); i17++) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                r45.x50 x50Var = (r45.x50) list.get(i17);
                jSONObject.put("key", x50Var.f471321d);
                jSONObject.put("uintValue", x50Var.f471322e);
                jSONObject.put("textValue", x50Var.f471323f);
                jSONArray.put(jSONObject);
            } catch (java.lang.Exception unused) {
            }
        }
        return jSONArray;
    }
}
