package ip;

/* loaded from: classes11.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f375102a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f375103b = false;

    public final void a(java.util.Map map, boolean z17) {
        java.lang.String sb6;
        if (map == null) {
            return;
        }
        java.util.HashMap hashMap = this.f375102a;
        if (!z17) {
            hashMap.clear();
        }
        int i17 = 0;
        while (i17 < 10000) {
            java.lang.String str = "";
            if (z17) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(".sysmsg.dynacfg_split.Item");
                sb7.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                sb6 = sb7.toString();
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(".sysmsg.dynacfg.Item");
                sb8.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                sb6 = sb8.toString();
            }
            java.lang.Object obj = sb6 + ".$key";
            java.lang.String str2 = (java.lang.String) map.get(sb6);
            java.lang.String str3 = (java.lang.String) map.get(obj);
            if (str3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3.trim())) {
                break;
            }
            java.lang.String trim = str3.trim();
            if (str2 != null) {
                str = str2;
            }
            hashMap.put(trim, str);
            i17++;
        }
        hashMap.toString();
    }

    public int b(java.lang.String str, int i17) {
        try {
            return java.lang.Integer.parseInt(d(str));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DynamicConfig", "parseInt failed, val:%s, defVal:%d", str, java.lang.Integer.valueOf(i17));
            return i17;
        }
    }

    public synchronized int c(q55.e eVar) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        bm5.o1 o1Var = bm5.o1.f104252a;
        if (o1Var.m(eVar) == 0) {
            return b(eVar.j(), ((java.lang.Integer) eVar.i()).intValue());
        }
        return o1Var.h(eVar);
    }

    public synchronized java.lang.String d(java.lang.String str) {
        if (!this.f375103b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
            f();
        }
        str.trim();
        this.f375102a.get(str);
        return (java.lang.String) this.f375102a.get(str);
    }

    public synchronized java.lang.String e(q55.e eVar) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        bm5.o1 o1Var = bm5.o1.f104252a;
        if (o1Var.m(eVar) != 0) {
            return o1Var.l(eVar);
        }
        java.lang.String d17 = d(eVar.j());
        if (d17 == null) {
            d17 = (java.lang.String) eVar.i();
        }
        return d17;
    }

    public final synchronized void f() {
        if (this.f375103b) {
            return;
        }
        gm0.j1.i();
        if (gm0.j1.u() != null) {
            gm0.j1.i();
            if (gm0.j1.u().c() != null) {
                gm0.j1.i();
                a(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d((java.lang.String) gm0.j1.u().c().l(278529, null), "sysmsg", null), false);
                gm0.j1.i();
                a(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d((java.lang.String) gm0.j1.u().c().l(278530, null), "sysmsg", null), true);
                this.f375103b = true;
            }
        }
    }

    public synchronized void g(java.lang.String str, java.lang.String str2) {
        if (str != null && str2 != null) {
            this.f375102a.put(str, str2);
        }
    }

    public synchronized void h(java.lang.String str, java.util.Map map, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicConfig", "update dynacfg. increment:%b, md5:%s", java.lang.Boolean.valueOf(z17), com.p314xaae8f345.mm.vfs.w6.p(str));
        if (z17) {
            gm0.j1.i();
            gm0.j1.u().c().w(278530, str);
        } else {
            gm0.j1.i();
            gm0.j1.u().c().w(278529, str);
            gm0.j1.i();
            gm0.j1.u().c().w(278530, "");
        }
        if (map != null) {
            a(map, z17);
        } else {
            a(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null), z17);
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80().e();
    }
}
