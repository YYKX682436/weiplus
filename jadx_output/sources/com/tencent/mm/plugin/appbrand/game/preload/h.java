package com.tencent.mm.plugin.appbrand.game.preload;

/* loaded from: classes7.dex */
public class h implements uh1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.game.preload.i f78210c;

    public h(com.tencent.mm.plugin.appbrand.game.preload.i iVar, java.lang.String str, java.lang.String str2) {
        this.f78210c = iVar;
        this.f78208a = str;
        this.f78209b = str2;
    }

    @Override // uh1.d
    public void a(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f78210c.f78219i.addAndGet(jSONObject.getInt("Content-Length"));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGamePreloadManager", e17, "content-length get error", new java.lang.Object[0]);
            }
        }
    }

    @Override // uh1.d
    public void b(int i17, long j17, long j18) {
    }

    @Override // uh1.d
    public void c(int i17, java.lang.String str, java.lang.String str2, int i18, long j17, java.util.Map map) {
        java.lang.String str3 = this.f78208a;
        com.tencent.mm.plugin.appbrand.game.preload.i iVar = this.f78210c;
        if (iVar.f78214d == null || i18 != 200) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WAGamePreloadManager", "download fileSystem is null or download failed!");
            return;
        }
        iVar.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            synchronized (iVar.f78217g) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = iVar.f78217g;
                if (copyOnWriteArrayList != null) {
                    java.util.Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (str3.equals((java.lang.String) it.next())) {
                            iVar.f78217g.remove(str3);
                            break;
                        }
                    }
                }
            }
        }
        this.f78210c.a();
        java.lang.String str4 = this.f78209b;
        com.tencent.mm.plugin.appbrand.appstorage.j1 mkdir = this.f78210c.f78214d.mkdir(str4.substring(0, str4.lastIndexOf("/") + 1), true);
        if (mkdir == com.tencent.mm.plugin.appbrand.appstorage.j1.OK || mkdir == com.tencent.mm.plugin.appbrand.appstorage.j1.RET_ALREADY_EXISTS) {
            this.f78210c.f78214d.copyTo(this.f78209b, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2)), true);
        }
        this.f78210c.f78220j.addAndGet(1);
    }

    @Override // uh1.d
    public void d(int i17, java.lang.String str, int i18) {
    }
}
