package ks4;

/* loaded from: classes8.dex */
public final class c extends ks4.i {
    public c(java.lang.String token, com.p314xaae8f345.mm.p2495xc50a8b8b.g ctxBuff, com.p314xaae8f345.mm.p2495xc50a8b8b.g sign, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctxBuff, "ctxBuff");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sign, "sign");
        r45.bk0 bk0Var = new r45.bk0();
        bk0Var.f452346d = ctxBuff;
        bk0Var.f452347e = sign;
        bk0Var.f452348f = token;
        bk0Var.f452349g = str;
        bk0Var.f452350h = i17;
        bk0Var.f452351i = js4.r.f383100c;
        s(bk0Var, new r45.ck0(), 5991, "/cgi-bin/micromsg-bin/encashincome");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonWeCoinCgi", "CgiEncashIncomeRequest: ctx_buff: " + ctxBuff + ", sign: " + sign);
    }
}
