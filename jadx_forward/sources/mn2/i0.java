package mn2;

/* loaded from: classes10.dex */
public final class i0 extends zo0.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f411553a;

    public i0(mn2.g0 g0Var) {
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f411553a = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Nf).mo141623x754a37bb()).r()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zo0.g
    public void b(ip0.a item, ep0.h fileNameCreator, zo0.b callback) {
        java.lang.String str;
        java.lang.String format;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileNameCreator, "fileNameCreator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        mn2.h3 h3Var = (mn2.h3) item.f375106a;
        if (h3Var.mo148082x7f025288() == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e) {
            str = h3Var.mo148084xb5887639() + h3Var.i();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCdnDownloader", "[loadByCdn] finder image, " + h3Var.mo148082x7f025288() + ' ' + h3Var.i() + " uniqueValue=" + h3Var.n() + ' ' + str);
        } else {
            str = h3Var.l() + h3Var.m();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCdnDownloader", "[loadByCdn] finder image, " + h3Var.mo148082x7f025288() + ' ' + h3Var.m() + " uniqueValue=" + h3Var.n() + ' ' + str);
        }
        if (this.f411553a) {
            format = "";
        } else {
            format = java.lang.String.format("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/?version=%d&nettype=%d&signal=%d%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f424562g), java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40069xf869653c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.c()), ""}, 4));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        }
        dn.j jVar = new dn.j();
        jVar.f323318d = "task_FinderCdnDownloader";
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209379nd).mo141623x754a37bb()).r()).booleanValue()) {
            jVar.N = "X-Support-Wxam:1\r\n";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l + h3Var.n();
        com.p314xaae8f345.mm.vfs.w6.h(str2);
        com.p314xaae8f345.mm.vfs.w6.u(new com.p314xaae8f345.mm.vfs.r6(str2).r());
        boolean z17 = false;
        try {
            java.lang.String host = new java.net.URL(str).getHost();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int f17 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, false, arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int f18 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, true, arrayList2);
            jVar.f69601xaca5bdda = h3Var.n();
            jVar.D1 = str;
            jVar.O1 = h3Var.h();
            jVar.E1 = host;
            jVar.F1 = format;
            jVar.G1 = str2;
            int size = arrayList.size();
            java.lang.String[] strArr = new java.lang.String[size];
            for (int i17 = 0; i17 < size; i17++) {
                strArr[i17] = arrayList.get(i17);
            }
            jVar.H1 = strArr;
            int size2 = arrayList2.size();
            java.lang.String[] strArr2 = new java.lang.String[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                strArr2[i18] = arrayList2.get(i18);
            }
            jVar.I1 = strArr2;
            jVar.J1 = f17;
            jVar.K1 = f18;
            jVar.L1 = false;
            jVar.M1 = "" + com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.c();
            jVar.N1 = "";
            jVar.f323322h = 3;
            jVar.P1 = 251;
            jVar.Q1 = 20201;
            jVar.A = 60;
            jVar.B = 60;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCdnDownloader", "attachSnsImgTaskInfo decodeKey:%s, imageUrl:%s", h3Var.h(), str);
            z17 = true;
        } catch (java.net.MalformedURLException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderCdnDownloader", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderCdnDownloader", "attachSnsImgTaskInfo fail:" + e17);
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderCdnDownloader", "attachSnsImgTaskInfo failed");
            callback.a();
            return;
        }
        jVar.f323320f = new mn2.h0(h3Var, callback, str2);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCdnDownloader", "SubCoreCdnTransport addRecvTask suc");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderCdnDownloader", "SubCoreCdnTransport addRecvTask failed");
            callback.a();
        }
    }

    public /* synthetic */ i0(mn2.g0 g0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : g0Var);
    }
}
