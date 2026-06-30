package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class c1 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3 {

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f270356f = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f270354d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f270355e = new java.util.ArrayList();

    public c1() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f Bi = zo3.p.Bi();
        Bi.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g(Bi, 1, this));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 u3Var) {
        if (u3Var.b() != 1) {
            return;
        }
        this.f270356f = false;
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x3) u3Var).f270673e.size();
        this.f270354d.removeAll(this.f270355e);
        ((java.util.ArrayList) this.f270355e).clear();
        e();
    }

    public void b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppSettingService", "add appId is null");
            return;
        }
        if (!this.f270354d.contains(str)) {
            this.f270354d.add(str);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.model.app.c1$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c1.this.e();
            }
        });
    }

    public void c(java.util.List list) {
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppSettingService", "addAll list is null");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !this.f270354d.contains(str)) {
                this.f270354d.add(str);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.model.app.c1$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c1.this.e();
            }
        });
    }

    public java.lang.String d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppSettingService", "getOpenIdSync, appId is null");
            return null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m k17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.k(str, false);
        if (k17 == null) {
            return null;
        }
        java.lang.String str2 = k17.f67384x996f3ea;
        if (str2 != null && str2.length() != 0) {
            return k17.f67384x996f3ea;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x3 x3Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x3(linkedList);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.p8();
        lVar.f152198b = new r45.q8();
        lVar.f152199c = "/cgi-bin/micromsg-bin/appcenter";
        lVar.f152200d = 452;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.p8 p8Var = (r45.p8) a17.f152243a.f152217a;
        byte[] c17 = x3Var.c();
        if (c17 != null) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(c17);
            p8Var.f464351e = cu5Var;
        }
        p8Var.f464350d = 1;
        com.p314xaae8f345.mm.p944x882e457a.f b17 = com.p314xaae8f345.mm.p944x882e457a.l3.b(a17, 20000L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppSettingService", "call getOpenIdSync cgi result, errType = %d, errCode = %d", java.lang.Integer.valueOf(b17.f152148a), java.lang.Integer.valueOf(b17.f152149b));
        if (b17.f152148a == 0 && b17.f152149b == 0) {
            x3Var.a(x51.j1.d(((r45.q8) b17.f152151d).f465286d));
            x3Var.mo804x5f9cdc6f(0, b17.f152148a, b17.f152149b, b17.f152150c, a17, new byte[0]);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
            if (j17 != null) {
                return j17.f67384x996f3ea;
            }
        }
        return null;
    }

    public final void e() {
        if (!this.f270356f && this.f270354d.size() > 0) {
            this.f270354d.size();
            int size = this.f270354d.size();
            if (size > 20) {
                size = 20;
            }
            this.f270356f = true;
            ((java.util.ArrayList) this.f270355e).addAll(this.f270354d.subList(0, size));
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v3(1, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x3(this.f270355e)));
        }
    }
}
