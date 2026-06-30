package oj4;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj4.h f427345d;

    public f(mj4.h hVar) {
        this.f427345d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        oj4.j jVar = oj4.j.f427348a;
        mj4.h hVar = this.f427345d;
        pj4.g2 b17 = jVar.b(((mj4.k) hVar).f408600b.f76512x81959a6e);
        if (b17 != null) {
            if (hVar != null) {
                mj4.a aVar = ((mj4.k) hVar).f408600b;
                if (aVar.f76512x81959a6e > b17.f436595d.f436515q) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.UploadManager", "reCommit, last item is new.(cur:" + aVar.f76512x81959a6e + ", new:" + b17.f436595d.f436515q + ')');
                    java.lang.String str = b17.f436605q;
                    if (str != null) {
                        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(8, "StatusTextPost_".concat(str), pj4.h2.class, new qj4.o(str, 6L, "", ""));
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadManager", "clearUploadTask: ");
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadManager", "reCommit last post");
            if (!b17.f436603o) {
                b17.f436600i = 0;
            }
            b17.f436601m = 0;
            b17.f436604p = "";
            jVar.e(b17.f436595d.f436515q);
            pj4.b0 b0Var = b17.f436595d;
            int i17 = b0Var.f436515q;
            b0Var.f436515q = c01.id.e();
            si4.a G = ai4.m0.f86706a.G();
            mj4.h i18 = G.i(bk4.k1.a(), i17);
            if (i18 != null) {
                mj4.j jVar2 = new mj4.j((mj4.k) i18);
                jVar2.f(3);
                jVar2.f408599b.put("field_CreateTime", java.lang.Integer.valueOf(b17.f436595d.f436515q));
                mj4.h a17 = jVar2.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadManager", "reCommitByUser: update item STATE_SENDING, CreateTime Old=" + i17 + ", New=" + ((mj4.k) a17).f408600b.f76512x81959a6e);
                G.s(a17);
            }
            jVar.g(b17);
            jVar.f(b17);
        }
    }
}
