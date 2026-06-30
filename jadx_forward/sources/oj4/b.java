package oj4;

/* loaded from: classes11.dex */
public final class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final pj4.g2 f427341d;

    /* renamed from: e, reason: collision with root package name */
    public long f427342e;

    public b(pj4.g2 postInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postInfo, "postInfo");
        this.f427341d = postInfo;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.PostTask", "[doPost] end cost:" + (java.lang.System.currentTimeMillis() - this.f427342e) + ",errType" + i17 + ",errCode" + i18 + ", errMsg=" + str);
        gm0.j1.d().q(5293, this);
        if (i17 == 0 && i18 == 0) {
            return;
        }
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.jx_);
        oj4.j jVar = oj4.j.f427348a;
        pj4.g2 postInfo = this.f427341d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postInfo, "postInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadManager", "makeCgiFail " + jVar.a(postInfo));
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r17);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (K0) {
            postInfo.f436601m++;
            jVar.g(postInfo);
            java.lang.String str2 = postInfo.f436605q;
            if (str2 != null) {
                ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(8, "StatusTextPost_".concat(str2), pj4.h2.class, new qj4.o(str2, 2L, "", ""));
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
            }
            jVar.f(postInfo);
            return;
        }
        postInfo.f436604p = r17;
        jVar.g(postInfo);
        ai4.m0.f86706a.H(6, en1.a.a(), postInfo.f436595d.f436515q);
        java.lang.String str3 = postInfo.f436605q;
        if (str3 != null) {
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(8, "StatusTextPost_".concat(str3), pj4.h2.class, new qj4.o(str3, 5L, "", ""));
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
        }
    }
}
