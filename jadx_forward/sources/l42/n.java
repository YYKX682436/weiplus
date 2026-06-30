package l42;

@j95.b
/* loaded from: classes15.dex */
public class n extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f397532d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f397533e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f397534f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f397535g;

    /* renamed from: h, reason: collision with root package name */
    public l42.c f397536h;

    /* renamed from: i, reason: collision with root package name */
    public final l42.y f397537i = new l42.d(this);

    public static l42.n Ai() {
        return (l42.n) i95.n0.c(l42.n.class);
    }

    public static void wi(l42.n nVar) {
        r45.yh0 yh0Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d17;
        java.util.Map map = nVar.f397532d;
        if (map != null) {
            java.util.HashMap hashMap = (java.util.HashMap) map;
            if (hashMap.size() > 0) {
                yh0Var = new r45.yh0();
                for (s42.b bVar : hashMap.values()) {
                    if (!u46.l.e(bVar.f484464a)) {
                        r45.xh0 xh0Var = new r45.xh0();
                        xh0Var.f471625d = bVar.f484464a;
                        xh0Var.f471626e = bVar.f484465b;
                        xh0Var.f471627f = bVar.f484466c;
                        xh0Var.f471628g = bVar.f484467d;
                        xh0Var.f471630i = bVar.f484469f;
                        xh0Var.f471637s = bVar.f484473j;
                        xh0Var.f471635q = bVar.f484470g;
                        xh0Var.f471634p = bVar.f484471h;
                        xh0Var.f471631m = bVar.f484472i;
                        xh0Var.f471632n = bVar.f484474k;
                        xh0Var.f471638t = bVar.f484475l;
                        xh0Var.f471636r = bVar.f484477n;
                        xh0Var.f471633o = bVar.f484476m;
                        java.util.Iterator it = ((java.util.ArrayList) bVar.f484468e).iterator();
                        while (it.hasNext()) {
                            s42.a aVar = (s42.a) it.next();
                            r45.sh0 sh0Var = new r45.sh0();
                            sh0Var.f467244d = aVar.f484461a;
                            sh0Var.f467246f = aVar.f484463c;
                            sh0Var.f467245e = aVar.f484462b;
                            xh0Var.f471629h.add(sh0Var);
                        }
                        yh0Var.f472609d.add(xh0Var);
                    }
                }
                if (yh0Var != null || (d17 = g42.i.d()) == null) {
                }
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionPageConfigChangeEvent encode mmkvEncode : " + d17.H("mmkv_key_script_config_container", yh0Var.mo14344x5f01b1f6()));
                    return;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionPageConfigChangeEvent encode throw IOException : " + e17.getMessage());
                    return;
                }
            }
        }
        yh0Var = null;
        if (yh0Var != null) {
        }
    }

    public java.util.List Bi() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f397532d) {
            java.util.Iterator it = this.f397532d.values().iterator();
            while (it.hasNext()) {
                arrayList.add((s42.b) it.next());
            }
        }
        java.util.Collections.sort(arrayList, new l42.f(this));
        return arrayList;
    }

    public final void Di() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig, uin : " + j62.e.g().n());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d17 = g42.i.d();
        if (d17 == null) {
            return;
        }
        byte[] j17 = d17.j("mmkv_key_script_config_container");
        if (j17 != null && j17.length > 0) {
            r45.yh0 yh0Var = new r45.yh0();
            try {
                yh0Var.mo11468x92b714fd(j17);
                java.util.Map b17 = r42.c.b(yh0Var);
                if (b17 != null) {
                    java.util.Iterator it = ((java.util.HashMap) b17).values().iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig, scriptConfigModel configID : " + ((s42.b) it.next()).f484464a);
                    }
                    this.f397532d = b17;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig parse script config throw Exception : " + e17.getMessage());
            }
        }
        byte[] j18 = d17.j("mmkv_key_sql_config_container");
        if (j18 == null || j18.length <= 0) {
            return;
        }
        r45.ai0 ai0Var = new r45.ai0();
        try {
            ai0Var.mo11468x92b714fd(j18);
            java.util.Map c17 = r42.c.c(ai0Var);
            if (c17 != null) {
                java.util.Iterator it6 = ((java.util.HashMap) c17).values().iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig, sqlConfigModel configID : " + ((s42.c) it6.next()).f484478a);
                }
                this.f397533e = c17;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig parse sql config throw Exception : " + e18.getMessage());
        }
    }

    public final void Ni() {
        int i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (s42.b bVar : this.f397532d.values()) {
            if (bVar.f484465b == 1 && (i17 = bVar.f484466c) > 0) {
                java.util.List list = (java.util.List) hashMap.get(java.lang.String.valueOf(i17));
                if (list == null) {
                    list = new java.util.ArrayList();
                    hashMap.put(java.lang.String.valueOf(bVar.f484466c), list);
                }
                list.add(bVar);
            }
        }
        this.f397534f = hashMap;
    }

    public final void Ri() {
        r45.ai0 ai0Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d17;
        java.util.Map map = this.f397533e;
        if (map != null) {
            java.util.HashMap hashMap = (java.util.HashMap) map;
            if (hashMap.size() > 0) {
                ai0Var = new r45.ai0();
                for (s42.c cVar : hashMap.values()) {
                    if (!u46.l.e(cVar.f484478a)) {
                        r45.zh0 zh0Var = new r45.zh0();
                        zh0Var.f473587d = cVar.f484478a;
                        zh0Var.f473588e = cVar.f484479b;
                        zh0Var.f473589f = cVar.f484480c;
                        zh0Var.f473594n = cVar.f484481d;
                        zh0Var.f473592i = cVar.f484485h;
                        zh0Var.f473590g = cVar.f484482e;
                        zh0Var.f473593m = cVar.f484483f;
                        zh0Var.f473591h = cVar.f484484g;
                        ai0Var.f451551d.add(zh0Var);
                    }
                }
                if (ai0Var != null || (d17 = g42.i.d()) == null) {
                }
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionEdgeSqlChangeEvent encode mmkvEncode : " + d17.H("mmkv_key_sql_config_container", ai0Var.mo14344x5f01b1f6()));
                    return;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionEdgeSqlChangeEvent encode throw IOException : " + e17.getMessage());
                    return;
                }
            }
        }
        ai0Var = null;
        if (ai0Var != null) {
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] onAccountInitialized, uin : " + j62.e.g().n());
        this.f397532d = new java.util.HashMap();
        this.f397533e = new java.util.HashMap();
        this.f397534f = new java.util.HashMap();
        Di();
        Ni();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] onAccountRåelease, uin : " + j62.e.g().n());
        this.f397532d = new java.util.HashMap();
        this.f397533e = new java.util.HashMap();
        this.f397534f = new java.util.HashMap();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        this.f397532d = new java.util.HashMap();
        this.f397533e = new java.util.HashMap();
        this.f397534f = new java.util.HashMap();
        this.f397535g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("EdgeComputingConfigService#mParseConfigHandler");
        this.f397536h = new l42.c();
        Di();
        Ni();
    }
}
