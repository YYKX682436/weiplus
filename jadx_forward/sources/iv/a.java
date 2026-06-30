package iv;

@j95.b
/* loaded from: classes4.dex */
public class a extends i95.w implements jv.e {
    public boolean Ai() {
        d11.p.Ai().getClass();
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsImgPreLoadingAroundTimeLimit");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusyTimeControlLogic", "SnsImgPreLoadingAroundTimeLimit value: " + d17);
        if (d11.b.a(d17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto download SNS image.");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAutoDownload", "it is not busy time, can auto download SNS image.");
        return true;
    }

    public boolean wi(com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2) {
        d11.p.Ai().getClass();
        c19767x257d7f.f38864x6ac9171 = 0;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTAutoLoadNetwork"), 1);
        c19767x257d7f2.f38864x6ac9171 = P;
        if (P == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAutoDownload", "user settings can not auto download SNS short video[AD]");
            return false;
        }
        boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (P == 2 && !m40093xb9aa8b5f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAutoDownload", "it is not wifi now, and status_only_wifi, not auto download SNS short video[AD].");
            return false;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAutoDownload", "it is 2G now, can not auto download SNS short video[AD].");
            return false;
        }
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsAdSightNotAutoDownloadTimeRange");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusyTimeControlLogic", "isSnsAdSightNotAutoDownload value: " + d17);
        if (!d11.b.a(d17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAutoDownload", "skip all not auto download case, then auto download[AD].");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto(but need check again) download SNS short video[AD]");
        c19767x257d7f.f38864x6ac9171 = P == 2 ? 2 : 1;
        return false;
    }
}
