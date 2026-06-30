package oj4;

/* loaded from: classes11.dex */
public final class h extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = msg.obj;
        if (obj instanceof pj4.g2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusPostInfo");
            pj4.g2 g2Var = (pj4.g2) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadManager", "retryHandler " + oj4.j.f427348a.a(g2Var));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g2Var.f436604p)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.UploadManager", "business fial " + g2Var.f436604p);
                return;
            }
            if (g2Var.f436603o) {
                if (g2Var.f436601m > 3) {
                    ai4.m0.f86706a.H(5, en1.a.a(), g2Var.f436595d.f436515q);
                    return;
                }
            } else if (g2Var.f436600i > 5) {
                ai4.m0.f86706a.H(5, en1.a.a(), g2Var.f436595d.f436515q);
                return;
            }
            if (c01.id.e() - g2Var.f436595d.f436515q > 1800) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.UploadManager", "exceed 30min to fial");
                ai4.m0.f86706a.H(5, en1.a.a(), g2Var.f436595d.f436515q);
            } else {
                ((ku5.t0) ku5.t0.f394148d).h(new oj4.k(g2Var), "MicroMsg.TextStatus.UploadPackHelper");
            }
        }
    }
}
