package oj4;

/* loaded from: classes11.dex */
public final class m implements oj4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f427352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oj4.n f427353b;

    public m(long j17, oj4.n nVar) {
        this.f427352a = j17;
        this.f427353b = nVar;
    }

    public void a(int i17, boolean z17, dn.h hVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUploadEnd cost");
        sb6.append(java.lang.System.currentTimeMillis() - this.f427352a);
        sb6.append(".errorCode");
        sb6.append(i17);
        sb6.append(",isOk");
        sb6.append(z17);
        sb6.append(",mediaType");
        oj4.n nVar = this.f427353b;
        pj4.b0 b0Var = nVar.f427354a.f436595d;
        jz5.f0 f0Var = null;
        sb6.append(b0Var != null ? java.lang.Integer.valueOf(b0Var.f436507f) : null);
        sb6.append(",sceneResult");
        sb6.append(hVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadTask", sb6.toString());
        pj4.g2 postInfo = nVar.f427354a;
        if (z17 && hVar != null) {
            java.lang.String str = hVar.f69524x419c440e;
            if (!(str == null || r26.n0.N(str))) {
                java.lang.String str2 = hVar.f69560x7b284d5e;
                if (!(str2 == null || r26.n0.N(str2))) {
                    pj4.b0 b0Var2 = postInfo.f436595d;
                    b0Var2.f436509h = hVar.f69524x419c440e;
                    b0Var2.f436511m = hVar.f69560x7b284d5e;
                    pm0.v.X(new oj4.a(new oj4.b(postInfo)));
                    return;
                }
            }
        }
        oj4.j jVar = oj4.j.f427348a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postInfo, "postInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadManager", "makeCdnFail " + jVar.a(postInfo));
        postInfo.f436600i = postInfo.f436600i + 1;
        jVar.g(postInfo);
        java.lang.String str3 = postInfo.f436605q;
        if (str3 != null) {
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(8, "StatusTextPost_".concat(str3), pj4.h2.class, new qj4.o(str3, 2L, "", ""));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
        }
        jVar.f(postInfo);
    }
}
