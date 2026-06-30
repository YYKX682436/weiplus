package oj4;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final oj4.e f427344d = new oj4.e();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList<pj4.g2> linkedList;
        byte[] j17;
        oj4.j jVar = oj4.j.f427348a;
        pj4.f2 f2Var = new pj4.f2();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c17 = jVar.c();
        jz5.f0 f0Var = null;
        if (c17 == null || (j17 = c17.j("upload_cache_array")) == null) {
            linkedList = null;
        } else {
            f2Var.mo11468x92b714fd(j17);
            linkedList = f2Var.f436577d;
        }
        if (linkedList != null) {
            for (pj4.g2 g2Var : linkedList) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doCheck: LastUploadTask:");
                oj4.j jVar2 = oj4.j.f427348a;
                sb6.append(jVar2.a(g2Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadManager", sb6.toString());
                si4.a G = ai4.m0.f86706a.G();
                java.lang.String text_status_id = g2Var.f436606r;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text_status_id, "text_status_id");
                mj4.h t17 = G.t(text_status_id);
                if (t17 != null) {
                    mj4.a aVar = ((mj4.k) t17).f408600b;
                    if (aVar.f76512x81959a6e > g2Var.f436595d.f436515q) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.UploadManager", "doCheck, last item is new.(cur:" + aVar.f76512x81959a6e + ", new:" + g2Var.f436595d.f436515q + ')');
                        java.lang.String str = g2Var.f436605q;
                        if (str != null) {
                            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(8, "StatusTextPost_".concat(str), pj4.h2.class, new qj4.o(str, 6L, "", ""));
                            f0Var = jz5.f0.f384359a;
                        }
                        if (f0Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadManager", "clearUploadTask: ");
                        return;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadManager", "trigger upload last post");
                jVar2.f(g2Var);
            }
        }
    }
}
