package dz0;

/* loaded from: classes5.dex */
public interface g {
    static java.lang.Object a(dz0.g gVar, java.lang.String templateId, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestRecommendMusicList");
        }
        int i18 = i17 & 2;
        java.lang.Integer num = null;
        if (i18 != 0) {
            pVar = null;
        }
        dz0.e0 e0Var = (dz0.e0) gVar;
        com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = e0Var.f326361k;
        dz0.e0 e0Var2 = c11015x5b190a3b.D;
        if (e0Var2.f326356f && ((java.lang.Boolean) ((jz5.n) e0Var2.f326357g).mo141623x754a37bb()).booleanValue()) {
            jz5.l lVar = e0Var.f326359i;
            if (lVar != null) {
                java.lang.String str = (java.lang.String) lVar.f384366d;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, templateId)) {
                    java.lang.Integer num2 = (java.lang.Integer) lVar.f384367e;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "cancelRecommendMusicList:" + str + ", " + num2);
                    az0.n7 n7Var = c11015x5b190a3b.f151316d;
                    if (n7Var != null && num2 != null) {
                        n7Var.f97275a.m33374xb3a37931(num2.intValue());
                    }
                }
            }
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) e0Var.f326358h).get(templateId);
            if (list != null && (list.isEmpty() ^ true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "requestRecommendMusicList: templateId:" + templateId + " has cache");
            } else {
                dz0.c0 c0Var = new dz0.c0(pVar, templateId, c11015x5b190a3b, e0Var);
                az0.n7 n7Var2 = c11015x5b190a3b.f151316d;
                if (n7Var2 != null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    gm0.m b17 = gm0.j1.b();
                    java.lang.String a17 = kk.v.a(b17 != null ? b17.h() : 0);
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long hashCode = (currentTimeMillis + '_' + a17 + '_' + c06.f.a(android.os.SystemClock.elapsedRealtime()).c()).hashCode();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
                    num = new java.lang.Integer(n7Var2.f97275a.m33429x1fd0f486(templateId, hashCode, new az0.u6(c0Var, hashCode, java.lang.System.currentTimeMillis())));
                }
                e0Var.f326359i = new jz5.l(templateId, num);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "requestRecommendMusicList: failed, not enable");
        }
        return num;
    }
}
