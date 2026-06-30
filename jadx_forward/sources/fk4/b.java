package fk4;

/* loaded from: classes4.dex */
public final class b extends zo0.g {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zo0.g
    public void b(ip0.a url, ep0.h fileNameCreator, zo0.b callback) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileNameCreator, "fileNameCreator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Object obj = url.f375106a;
        fk4.n nVar = (fk4.n) obj;
        sb6.append(nVar.f345176d);
        java.lang.String str = nVar.f345179g;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/?version=%d&nettype=%d&signal=%d%s";
        java.lang.Integer valueOf = java.lang.Integer.valueOf(o45.wf.f424562g);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40069xf869653c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i0 i0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a;
        java.lang.String format = java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{valueOf, valueOf2, java.lang.Integer.valueOf(i0Var.c()), ""}, 4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        dn.j jVar = new dn.j();
        jVar.f323318d = "task_FinderCdnDownloader";
        java.lang.String str3 = nVar.f345177e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnImageDownloder", "start load tmpFileFilePath:" + str3 + ", url:" + nVar.f345176d);
        com.p314xaae8f345.mm.vfs.w6.u(new com.p314xaae8f345.mm.vfs.r6(str3).r());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "value(...)");
        fk4.n nVar2 = (fk4.n) obj;
        try {
            java.lang.String host = new java.net.URL(sb7).getHost();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int f17 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, false, arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int f18 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, true, arrayList2);
            java.lang.String n17 = nVar2.n();
            java.lang.String str4 = nVar2.f345178f;
            jVar.f69601xaca5bdda = n17;
            jVar.D1 = sb7;
            jVar.O1 = str4;
            jVar.E1 = host;
            jVar.F1 = format;
            jVar.G1 = str3;
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
            jVar.M1 = "" + i0Var.c();
            jVar.N1 = "";
            jVar.f323322h = 3;
            jVar.P1 = 150;
            jVar.Q1 = 20201;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnImageDownloder", "attachSnsImgTaskInfo, imageUrl:%s， " + str4, sb7);
            z17 = true;
        } catch (java.net.MalformedURLException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CdnImageDownloder", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnImageDownloder", "attachSnsImgTaskInfo fail:" + e17);
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnImageDownloder", "attachSnsImgTaskInfo failed");
            callback.a();
            return;
        }
        jVar.f323320f = new fk4.a(this, str3, callback);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnImageDownloder", "SubCoreCdnTransport addRecvTask succ");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnImageDownloder", "SubCoreCdnTransport addRecvTask failed");
            callback.a();
        }
    }
}
