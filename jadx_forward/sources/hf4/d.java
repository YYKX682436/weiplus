package hf4;

/* loaded from: classes4.dex */
public final class d extends zo0.g {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zo0.g
    public void b(ip0.a data, ep0.h fileNameCreator, zo0.b callback) {
        java.lang.String concat;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileNameCreator, "fileNameCreator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.Object obj = data.f375106a;
        hf4.e eVar = (hf4.e) obj;
        java.lang.String str = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/?version=%d&nettype=%d&signal=%d%s";
        java.lang.Integer valueOf = java.lang.Integer.valueOf(o45.wf.f424562g);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40069xf869653c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i0 i0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a;
        java.lang.String format = java.lang.String.format(str, java.util.Arrays.copyOf(new java.lang.Object[]{valueOf, valueOf2, java.lang.Integer.valueOf(i0Var.c()), ""}, 4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        dn.j jVar = new dn.j();
        jVar.f323318d = "task_StoryDownloader";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadDataImp ");
        sb6.append(obj);
        sb6.append(" story ");
        r45.xe6 xe6Var = eVar.f362757d;
        sb6.append(xe6Var.f471556f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.StoryDownloader", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        ef4.c0 c0Var = ef4.c0.f333971a;
        java.lang.String str2 = eVar.f362757d.f471556f;
        java.lang.String str3 = eVar.f362758e;
        if (str2 == null) {
            concat = "";
        } else {
            java.lang.String concat2 = c0Var.a(str3).concat("pic/");
            byte[] bytes = str2.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            concat = c0Var.e(concat2, kk.k.g(bytes)).concat(".d");
        }
        sb7.append(concat);
        sb7.append((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(data.m139674x9616526c()) ? kk.k.g(data.m139674x9616526c().getBytes()) : null) + ".tmp");
        java.lang.String sb8 = sb7.toString();
        try {
            java.lang.String host = new java.net.URL(xe6Var.f471558h).getHost();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int f17 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, false, arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int f18 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, true, arrayList2);
            jVar.f69601xaca5bdda = xe6Var.f471554d + '_';
            jVar.D1 = xe6Var.f471558h;
            jVar.E1 = host;
            jVar.F1 = format;
            jVar.G1 = sb8;
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
            jVar.O1 = xe6Var.f471572y;
            jVar.f323322h = 3;
            jVar.P1 = 100;
            jVar.Q1 = 20201;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.StoryDownloader", "attachSnsImgTaskInfo reqDownType:%s", jVar);
            z17 = true;
        } catch (java.net.MalformedURLException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Loader.StoryDownloader", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Loader.StoryDownloader", "attachSnsImgTaskInfo fail:" + e17);
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Loader.StoryDownloader", "attachSnsImgTaskInfo failed");
            callback.a();
            return;
        }
        jVar.f323320f = new hf4.c(eVar, callback, sb8);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.StoryDownloader", "SubCoreCdnTransport addRecvTask suc");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Loader.StoryDownloader", "SubCoreCdnTransport addRecvTask failed");
            callback.a();
        }
    }
}
