package oz0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final oz0.c f431734g = new oz0.c(106, com.p314xaae8f345.mm.vfs.q7.c("MaasWarmUpRes") + "/album");

    /* renamed from: h, reason: collision with root package name */
    public static final oz0.c f431735h = new oz0.c(107, com.p314xaae8f345.mm.vfs.q7.c("MaasWarmUpRes") + "/camera");

    /* renamed from: a, reason: collision with root package name */
    public final int f431736a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f431737b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f431738c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f431739d;

    /* renamed from: e, reason: collision with root package name */
    public final oz0.d f431740e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p916x4268f0dc.p927xc5d8e75b.C11026x3d52f8e7 f431741f;

    /* JADX WARN: Type inference failed for: r3v5, types: [com.tencent.mm.mj_template.template_res.MaasTemplateResMgr$resEventListener$1] */
    public c(int i17, java.lang.String resRootDir) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resRootDir, "resRootDir");
        this.f431736a = i17;
        this.f431737b = resRootDir;
        this.f431738c = "MicroMsg.MaasTemplateResMgr_" + i17;
        this.f431739d = new java.lang.Object();
        this.f431740e = new oz0.d(i17);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f431741f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd>(a0Var) { // from class: com.tencent.mm.mj_template.template_res.MaasTemplateResMgr$resEventListener$1
            {
                this.f39173x3fe91575 = 905296653;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = c5255x5f3208fd;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.r2 r2Var = event.f135586g;
                int i18 = r2Var.f89292a;
                oz0.c cVar = oz0.c.this;
                if (i18 != cVar.f431736a) {
                    return false;
                }
                int i19 = r2Var.f89293b;
                java.lang.String str = r2Var.f89294c;
                boolean z17 = r2Var.f89296e;
                java.lang.String str2 = cVar.f431738c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "get res " + i19 + ", " + str + ", " + z17);
                if (str == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "get res path is null");
                    return false;
                }
                if (!z17 || !cVar.g(i19, str)) {
                    return false;
                }
                cVar.a();
                return false;
            }
        };
    }

    public final void a() {
        synchronized (this.f431739d) {
            oz0.d dVar = this.f431740e;
            dVar.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("maas_template_res");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
            long j17 = M.getLong(dVar.f431742a, 0L);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("maas_template_res");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M2, "getMMKV(...)");
            boolean z17 = M2.getLong(dVar.f431743b, 0L) < j17;
            java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(d(), false);
            boolean z18 = (s17 != null ? kz5.n0.P(s17) : 0) <= 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f431738c, "checkMergeRes: update:" + z17 + ", empty:" + z18);
            if (z17 || z18) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.Iterable s18 = com.p314xaae8f345.mm.vfs.w6.s(c(), false);
                if (s18 != null) {
                    java.util.Iterator it = s18.iterator();
                    while (it.hasNext()) {
                        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.vfs.x1) it.next()).f294765b, -1);
                        if (P >= 0) {
                            arrayList.add(java.lang.Integer.valueOf(P));
                        }
                    }
                }
                kz5.g0.s(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f431738c, "checkMergeRes: merge res " + arrayList);
                if (!arrayList.isEmpty()) {
                    f(arrayList);
                }
            }
        }
    }

    public final boolean b() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6713x5cc61749 c6713x5cc61749 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6713x5cc61749();
        int i17 = this.f431736a;
        c6713x5cc61749.f140545d = i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List<dm.v9> Ai = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ai(i17);
        if (Ai != null) {
            for (dm.v9 v9Var : Ai) {
                oz0.a aVar = new oz0.a();
                aVar.f431731a = v9Var.f68796x5334f55;
                aVar.f431732b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(v9Var.f68780xf1e133f7, 0);
                linkedList.add(aVar);
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((oz0.a) it.next()).b());
        }
        jSONObject.put("list", jSONArray);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6713x5cc61749.f140546e = c6713x5cc61749.b("SubTypeList", r26.i0.u(jSONObject2, ',', ';', false, 4, null), true);
        c6713x5cc61749.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f431738c, "checkRes: " + c6713x5cc61749.n());
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(d(), false);
        return !((s17 != null ? kz5.n0.P(s17) : 0) <= 0);
    }

    public final java.lang.String c() {
        java.lang.String str = this.f431737b + "/list";
        com.p314xaae8f345.mm.vfs.w6.u(str);
        return str;
    }

    public final java.lang.String d() {
        java.lang.String str = this.f431737b + "/result";
        com.p314xaae8f345.mm.vfs.w6.u(str);
        return str;
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f431738c, "init: ");
        java.util.List Ai = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ai(this.f431736a);
        if (Ai != null) {
            java.util.Iterator it = Ai.iterator();
            while (it.hasNext()) {
                int i17 = ((dm.v9) it.next()).f68796x5334f55;
                if (!com.p314xaae8f345.mm.vfs.w6.j(c() + '/' + i17)) {
                    java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(this.f431736a, i17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f431738c, "init: get cached file " + i17 + ", " + Bi);
                    if (Bi != null) {
                        g(i17, Bi);
                    }
                }
                ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ri(this.f431736a, i17, -1);
            }
        }
        mo48813x58998cd();
        ((ku5.t0) ku5.t0.f394148d).k(new oz0.b(this), 5000L);
        a();
    }

    public final void f(java.util.List list) {
        oz0.d dVar = this.f431740e;
        dVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("maas_template_res");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        M.putLong(dVar.f431743b, java.lang.System.currentTimeMillis());
        java.lang.String d17 = d();
        com.p314xaae8f345.mm.vfs.w6.f(d17);
        com.p314xaae8f345.mm.vfs.w6.u(d17);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f431738c, "mergeRes: copy " + intValue);
            com.p314xaae8f345.mm.vfs.w6.b(c() + '/' + intValue, d17);
        }
    }

    public final boolean g(int i17, java.lang.String str) {
        synchronized (this.f431739d) {
            if (str == null) {
                return false;
            }
            java.lang.String str2 = this.f431737b + "/temp";
            com.p314xaae8f345.mm.vfs.w6.u(str2);
            java.lang.String str3 = c() + '/' + i17;
            com.p314xaae8f345.mm.vfs.w6.f(str2);
            com.p314xaae8f345.mm.vfs.w6.u(str2);
            int Q = com.p314xaae8f345.mm.vfs.w6.Q(str, str2);
            if (Q != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f431738c, "unzipRes: unzip fail " + Q);
                return false;
            }
            com.p314xaae8f345.mm.vfs.w6.f(str3);
            com.p314xaae8f345.mm.vfs.w6.v(str2, str3);
            oz0.d dVar = this.f431740e;
            dVar.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("maas_template_res");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
            M.putLong(dVar.f431742a, java.lang.System.currentTimeMillis());
            return true;
        }
    }
}
