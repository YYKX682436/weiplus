package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f f178086d = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f178087a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f178088b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final dn.k f178089c = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.d(this);

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b bVar) {
        java.util.Iterator it = ((java.util.ArrayList) fVar.f178087a).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e) it.next()).a(cVar, bVar);
        }
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e eVar) {
        java.util.List list = this.f178087a;
        if (((java.util.ArrayList) list).contains(eVar)) {
            return;
        }
        ((java.util.ArrayList) list).add(eVar);
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c cVar) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f178088b;
        if (concurrentHashMap.containsKey(cVar.f178069b)) {
            return;
        }
        java.lang.String str = cVar.f178069b;
        concurrentHashMap.put(str, cVar);
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_EditorUI";
        oVar.f323320f = this.f178089c;
        oVar.f69601xaca5bdda = str;
        oVar.f69609xd84b8349 = 3;
        oVar.f69580x454032b6 = 264;
        oVar.f69584x89a4c0cf = 2;
        int i17 = cVar.f178070c;
        boolean z17 = cVar.f178077j;
        java.lang.String str2 = cVar.f178071d;
        if (z17) {
            oVar.f323319e = true;
            oVar.f69606xccdbf540 = true;
            oVar.f69620xeb1a61d6 = cVar.f178073f;
            oVar.f69575xf11df5f5 = cVar.f178076i;
            oVar.f69591xf9dbbe9c = cVar.f178075h;
            oVar.f69597x853bb235 = i17 == 4;
            oVar.f69595x6d25b0d9 = com.p314xaae8f345.mm.vfs.w6.i(str2, false);
            oVar.f69592xf1ebe47b = 20303;
            oVar.f69594x4b409164 = true;
            oVar.f69621xf91593ca = false;
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(oVar);
        } else {
            oVar.f323319e = false;
            oVar.f69620xeb1a61d6 = cVar.f178073f;
            java.lang.String str3 = cVar.f178075h;
            oVar.f69591xf9dbbe9c = str3;
            oVar.f323344z = str3;
            oVar.M1 = str3;
            oVar.f69595x6d25b0d9 = com.p314xaae8f345.mm.vfs.w6.i(str2, false);
            java.lang.String str4 = cVar.f178076i;
            oVar.f69575xf11df5f5 = str4;
            oVar.Y1 = str4;
            oVar.f69606xccdbf540 = true;
            oVar.f69597x853bb235 = i17 == 4;
            oVar.f69592xf1ebe47b = 20303;
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(oVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.editor.EditorCdnManager", "startTransfer. CdnInfo: %s", cVar);
    }

    public void d() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f178088b;
        if (concurrentHashMap.size() > 0) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c cVar : concurrentHashMap.values()) {
                boolean z17 = cVar.f178077j;
                java.lang.String str = cVar.f178069b;
                if (z17) {
                    ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.editor.EditorCdnManager", "cancelCurTask send: %s", str);
                } else {
                    ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.editor.EditorCdnManager", "cancelCurTask recv: %s", str);
                }
            }
            concurrentHashMap.clear();
        }
    }

    public void e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c) this.f178088b.get(str);
        if (cVar == null) {
            return;
        }
        boolean z17 = cVar.f178077j;
        java.lang.String str2 = cVar.f178069b;
        if (z17) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.editor.EditorCdnManager", "cancelCurTask send: %s", str2);
        } else {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.editor.EditorCdnManager", "cancelCurTask recv: %s", str2);
        }
    }
}
