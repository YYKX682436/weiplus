package ks4;

/* loaded from: classes8.dex */
public final class b extends ks4.i {
    public b(com.p314xaae8f345.mm.p2495xc50a8b8b.g ctxBuff, com.p314xaae8f345.mm.p2495xc50a8b8b.g signBuff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctxBuff, "ctxBuff");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signBuff, "signBuff");
        r45.l80 l80Var = new r45.l80();
        l80Var.f460753e = signBuff;
        l80Var.f460752d = ctxBuff;
        l80Var.f460754f = js4.r.f383100c;
        s(l80Var, new r45.m80(), 5994, "/cgi-bin/micromsg-bin/consumewecoin");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonWeCoinCgi", "CgiConsumeWecoinRequest: ctxBuff: " + ctxBuff + ", sign: " + signBuff);
    }
}
