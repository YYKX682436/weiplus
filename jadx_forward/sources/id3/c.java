package id3;

@fd3.a(m129354x337a8b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.v.f33753x24728b)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid3/c;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/d;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.d {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.d
    public void c(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.HashMap hashMap = new java.util.HashMap();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        vz.p1 p1Var = (vz.p1) i95.n0.c(vz.p1.class);
        id3.b bVar = new id3.b(hashMap, this, f0Var, h0Var);
        ((uz.e2) p1Var).getClass();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC, false)))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiGameDownloadManager", "addDownloadTaskStraight isTeenMode and ignore");
            bVar.d(810, "fail:This content is not accessible in Teen Mode");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(data.optString("taskUrl"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiGameDownloadManager", "url is null");
            bVar.d(700, "url is null");
            return;
        }
        java.lang.String optString = data.optString("appId");
        int optInt = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
        int optInt2 = data.optInt("downloadType", 1);
        int optInt3 = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
        g02.c cVar = new g02.c(optString, optInt, data.optString("extInfo"), data.optInt("uiarea"), optInt3, data.optInt("noticeId"), optInt2);
        ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
        g02.b.c(9, cVar);
        ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m2(context, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a.a(data), bVar));
    }
}
