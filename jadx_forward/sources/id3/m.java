package id3;

@fd3.a(m129354x337a8b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pc.f34669x24728b)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid3/m;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/d;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.d {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.d
    public void c(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        long optLong = data.optLong("downloadId");
        vz.p1 p1Var = (vz.p1) i95.n0.c(vz.p1.class);
        id3.l lVar = new id3.l(this, f0Var, h0Var);
        ((uz.e2) p1Var).getClass();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (optLong <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiGameDownloadManager", "fail, invalid downloadId = " + optLong);
            lVar.d(808, "invalid_downloadid");
            return;
        }
        int optInt = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
        int optInt2 = data.optInt("uiarea");
        int optInt3 = data.optInt("noticeId");
        int optInt4 = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
        int optInt5 = data.optInt("downloadType", 1);
        boolean z17 = data.optInt("ignoreNetwork", 0) == 1;
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(optLong);
        if (c17 == null) {
            lVar.d(805, "get DownloadInfo fail");
            return;
        }
        c17.f68432x29cbf907 = optInt;
        c17.f68444x136fa406 = optInt2;
        c17.f68427x7c4053b8 = optInt3;
        c17.f68436x2261a7a0 = optInt4;
        c17.f68410x4e46f707 = optInt5;
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        g02.c cVar = new g02.c();
        cVar.a(c17);
        cVar.f348962j = 0L;
        ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
        g02.b.c(10, cVar);
        ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.o2(context, optLong, data.optBoolean("downloadInWifi", false), z17, lVar));
    }
}
