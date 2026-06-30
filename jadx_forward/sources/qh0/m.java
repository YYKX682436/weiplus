package qh0;

@j95.b
/* loaded from: classes.dex */
public final class m extends i95.w implements rh0.u {
    public java.lang.String Ai() {
        return com.p314xaae8f345.mm.vfs.q7.c("scan_passport_model") + "/card.xnet";
    }

    public boolean Bi(java.lang.String originResourceFilePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originResourceFilePath, "originResourceFilePath");
        java.lang.String Ai = Ai();
        if (!com.p314xaae8f345.mm.vfs.w6.j(originResourceFilePath)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanPassportFeatureService", "[saveFiletoLocal] failed：originResourceFilePath not exist");
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(originResourceFilePath);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(a17.m82499x9616526c());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanPassportFeatureService", "[recordMd5] ".concat(p17));
        L.putString("ScanPassportFeatureService.ScanPassportModelMd5", p17);
        if (com.p314xaae8f345.mm.vfs.w6.j(Ai)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanPassportFeatureService", "[saveFiletoLocal] targetFilePath fileExists exist, first delete file ");
            com.p314xaae8f345.mm.vfs.w6.h(Ai);
            ((qh0.m) ((rh0.u) i95.n0.c(rh0.u.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(32227, "5,16," + java.lang.System.currentTimeMillis() + ",0");
        } else {
            ((qh0.m) ((rh0.u) i95.n0.c(rh0.u.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(32227, "5,14," + java.lang.System.currentTimeMillis() + ",0");
        }
        com.p314xaae8f345.mm.vfs.w6.c(originResourceFilePath, Ai);
        return true;
    }

    public final boolean wi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanPassportFeatureService", "[getFileFromCache] begin");
        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(193, 1);
        if (Bi == null) {
            Bi = "";
        }
        boolean Bi2 = Bi(Bi);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanPassportFeatureService", "[getFileFromCache] cacheFilePath : " + Bi + ", saveRet： " + Bi2);
        if (Bi2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanPassportFeatureService", "[getFileFromCache] success");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanPassportFeatureService", "[getFileFromCache] failed");
        return false;
    }
}
