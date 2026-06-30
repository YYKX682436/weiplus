package ks4;

/* loaded from: classes8.dex */
public final class g extends ks4.i {
    public g(int i17, int i18, java.lang.Integer num) {
        r45.is3 is3Var = new r45.is3();
        is3Var.f458835d = i17;
        is3Var.f458838g = i18;
        is3Var.f458839h = js4.r.f383100c;
        is3Var.f458840i = com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41356x83dbbdc1();
        if (num != null) {
            is3Var.f458837f = num.intValue();
        }
        s(is3Var, new r45.js3(), 6299, "/cgi-bin/micromsg-bin/getwecoinpricelist");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonWeCoinCgi", "CgiGetWecoinPriceListRequest: ");
    }
}
