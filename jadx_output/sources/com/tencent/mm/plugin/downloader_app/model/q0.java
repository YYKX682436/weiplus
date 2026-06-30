package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.downloader_app.model.p0 f97310a;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.downloader_app.model.n0 f97311b;

    public static com.tencent.mm.plugin.downloader_app.model.n0 a() {
        if (f97311b == null) {
            com.tencent.mm.plugin.game.commlib.l lVar = (com.tencent.mm.plugin.game.commlib.l) ((h43.e) i95.n0.c(h43.e.class));
            byte[] z07 = lVar.wi() == null ? null : lVar.wi().z0("pb_appinfo");
            if (z07 != null) {
                f97311b = new com.tencent.mm.plugin.downloader_app.model.n0(z07);
            }
            f97311b = f97311b;
        }
        return f97311b;
    }

    public static void b(java.util.LinkedList linkedList, com.tencent.mm.plugin.downloader_app.model.p0 p0Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        c02.a aVar = new c02.a();
        aVar.f37582d = linkedList;
        aVar.f37584f = true;
        lVar.f70664a = aVar;
        lVar.f70665b = new c02.b();
        lVar.f70666c = "/cgi-bin/mmgame-bin/batchgetappdownloadinfo";
        lVar.f70667d = 2560;
        f97310a = p0Var;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.downloader_app.model.o0(), false);
    }
}
