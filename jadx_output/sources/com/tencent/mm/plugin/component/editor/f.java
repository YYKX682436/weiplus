package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.component.editor.f f96553d = new com.tencent.mm.plugin.component.editor.f();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f96554a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f96555b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final dn.k f96556c = new com.tencent.mm.plugin.component.editor.d(this);

    public static void a(com.tencent.mm.plugin.component.editor.f fVar, com.tencent.mm.plugin.component.editor.c cVar, com.tencent.mm.plugin.component.editor.b bVar) {
        java.util.Iterator it = ((java.util.ArrayList) fVar.f96554a).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.component.editor.e) it.next()).a(cVar, bVar);
        }
    }

    public void b(com.tencent.mm.plugin.component.editor.e eVar) {
        java.util.List list = this.f96554a;
        if (((java.util.ArrayList) list).contains(eVar)) {
            return;
        }
        ((java.util.ArrayList) list).add(eVar);
    }

    public void c(com.tencent.mm.plugin.component.editor.c cVar) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f96555b;
        if (concurrentHashMap.containsKey(cVar.f96536b)) {
            return;
        }
        java.lang.String str = cVar.f96536b;
        concurrentHashMap.put(str, cVar);
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_EditorUI";
        oVar.f241787f = this.f96556c;
        oVar.field_mediaId = str;
        oVar.field_priority = 3;
        oVar.field_appType = 264;
        oVar.field_bzScene = 2;
        int i17 = cVar.f96537c;
        boolean z17 = cVar.f96544j;
        java.lang.String str2 = cVar.f96538d;
        if (z17) {
            oVar.f241786e = true;
            oVar.field_needStorage = true;
            oVar.field_totalLen = cVar.f96540f;
            oVar.field_aesKey = cVar.f96543i;
            oVar.field_fileId = cVar.f96542h;
            oVar.field_isStreamMedia = i17 == 4;
            oVar.field_fullpath = com.tencent.mm.vfs.w6.i(str2, false);
            oVar.field_fileType = 20303;
            oVar.field_force_aeskeycdn = true;
            oVar.field_trysafecdn = false;
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(oVar);
        } else {
            oVar.f241786e = false;
            oVar.field_totalLen = cVar.f96540f;
            java.lang.String str3 = cVar.f96542h;
            oVar.field_fileId = str3;
            oVar.f241811z = str3;
            oVar.M1 = str3;
            oVar.field_fullpath = com.tencent.mm.vfs.w6.i(str2, false);
            java.lang.String str4 = cVar.f96543i;
            oVar.field_aesKey = str4;
            oVar.Y1 = str4;
            oVar.field_needStorage = true;
            oVar.field_isStreamMedia = i17 == 4;
            oVar.field_fileType = 20303;
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(oVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.editor.EditorCdnManager", "startTransfer. CdnInfo: %s", cVar);
    }

    public void d() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f96555b;
        if (concurrentHashMap.size() > 0) {
            for (com.tencent.mm.plugin.component.editor.c cVar : concurrentHashMap.values()) {
                boolean z17 = cVar.f96544j;
                java.lang.String str = cVar.f96536b;
                if (z17) {
                    ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.editor.EditorCdnManager", "cancelCurTask send: %s", str);
                } else {
                    ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.editor.EditorCdnManager", "cancelCurTask recv: %s", str);
                }
            }
            concurrentHashMap.clear();
        }
    }

    public void e(java.lang.String str) {
        com.tencent.mm.plugin.component.editor.c cVar = (com.tencent.mm.plugin.component.editor.c) this.f96555b.get(str);
        if (cVar == null) {
            return;
        }
        boolean z17 = cVar.f96544j;
        java.lang.String str2 = cVar.f96536b;
        if (z17) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.editor.EditorCdnManager", "cancelCurTask send: %s", str2);
        } else {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.editor.EditorCdnManager", "cancelCurTask recv: %s", str2);
        }
    }
}
