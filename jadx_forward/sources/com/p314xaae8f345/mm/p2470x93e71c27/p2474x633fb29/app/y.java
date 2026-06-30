package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class y implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f270684d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f270685e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f270686f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f270687g = false;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f270688h;

    public y() {
        this.f270684d = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x(this), false);
        this.f270688h = b4Var;
        new java.util.ArrayList();
        new java.util.ArrayList();
        this.f270684d = new java.util.HashMap();
        this.f270685e = new java.util.Vector();
        this.f270686f = new java.util.ArrayList();
        b4Var.c(600000L, 600000L);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f Bi = zo3.p.Bi();
        Bi.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g(Bi, 7, this));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 u3Var) {
        if (u3Var.b() != 7) {
            return;
        }
        synchronized (this) {
            java.util.List list = this.f270686f;
            if (list != null && !((java.util.ArrayList) list).isEmpty()) {
                ((java.util.Vector) this.f270685e).removeAll(this.f270686f);
                ((java.util.ArrayList) this.f270686f).clear();
            }
        }
        this.f270687g = false;
        g();
    }

    public final synchronized void b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || ((java.util.Vector) this.f270685e).contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoService", "should not add this appid:[%s], it is already runing", str);
        } else if (!e(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoService", "this app has reach the max retry count, appid is %s", str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoService", "add appid:[%s]", str);
            ((java.util.Vector) this.f270685e).add(str);
        }
    }

    public void c(java.util.LinkedList linkedList) {
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoService", "batch push appinfo err: null or nil applist");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            b((java.lang.String) it.next());
        }
        g();
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m d(java.lang.String str, long j17) {
        if (str != null && str.length() != 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(str);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w3 w3Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w3(linkedList);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.p8();
            lVar.f152198b = new r45.q8();
            lVar.f152199c = "/cgi-bin/micromsg-bin/appcenter";
            lVar.f152200d = 452;
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            r45.p8 p8Var = (r45.p8) a17.f152243a.f152217a;
            byte[] c17 = w3Var.c();
            if (c17 != null) {
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(c17);
                p8Var.f464351e = cu5Var;
            }
            p8Var.f464350d = 7;
            com.p314xaae8f345.mm.p944x882e457a.f b17 = com.p314xaae8f345.mm.p944x882e457a.l3.b(a17, j17);
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoService", "getSync resp == null");
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoService", "call getAppInfoList cgi result, errType = %d, errCode = %d", java.lang.Integer.valueOf(b17.f152148a), java.lang.Integer.valueOf(b17.f152149b));
            if (b17.f152148a == 0 && b17.f152149b == 0) {
                w3Var.a(x51.j1.d(((r45.q8) b17.f152151d).f465286d));
                w3Var.mo804x5f9cdc6f(0, b17.f152148a, b17.f152149b, b17.f152150c, a17, new byte[0]);
                ap3.f a18 = ap3.e.a();
                if (a18 != null) {
                    return ((kt.a) a18).wi(str);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoService", "getISubCorePluginBase() == null");
                return null;
            }
        }
        return null;
    }

    public final boolean e(java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoService", "increaseCounter fail, appId is null");
            return false;
        }
        java.util.Map map = this.f270684d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) ((java.util.HashMap) map).get(str), 0));
        if (valueOf.intValue() >= 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoService", "increaseCounter fail, has reached the max try count");
            return false;
        }
        ((java.util.HashMap) map).put(str, java.lang.Integer.valueOf(valueOf.intValue() + 1));
        return true;
    }

    public void f(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoService", "push fail, appId is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoService", "push appid : ".concat(str));
        b(str);
        g();
    }

    public final void g() {
        java.util.List list;
        if (this.f270687g || (list = this.f270685e) == null || ((java.util.Vector) list).isEmpty()) {
            return;
        }
        int size = ((java.util.Vector) this.f270685e).size();
        if (size > 20) {
            size = 20;
        }
        synchronized (this) {
            ((java.util.ArrayList) this.f270686f).addAll(((java.util.Vector) this.f270685e).subList(0, size));
        }
        java.util.List list2 = this.f270686f;
        if (list2 == null || ((java.util.ArrayList) list2).isEmpty()) {
            return;
        }
        this.f270687g = true;
        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v3(7, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w3(this.f270686f)));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (mo808xfb85f7b0 != 451) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoService", "error type: " + mo808xfb85f7b0);
            return;
        }
        synchronized (this) {
            java.util.List list = this.f270686f;
            if (list != null && !((java.util.ArrayList) list).isEmpty()) {
                ((java.util.Vector) this.f270685e).removeAll(this.f270686f);
                ((java.util.ArrayList) this.f270686f).clear();
            }
        }
        this.f270687g = false;
        g();
    }
}
