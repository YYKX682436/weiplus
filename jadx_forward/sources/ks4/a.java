package ks4;

/* loaded from: classes2.dex */
public final class a extends ks4.i {
    public a(java.lang.String billNo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(billNo, "billNo");
        r45.jt jtVar = new r45.jt();
        jtVar.f459627d = billNo;
        jtVar.f459628e = js4.r.f383100c;
        s(jtVar, new r45.kt(), 6233, "/cgi-bin/micromsg-bin/cancelwecoinrecharge");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonWeCoinCgi", "CgiCancelWecoinRechargeRequest: billNo: ".concat(billNo));
    }
}
