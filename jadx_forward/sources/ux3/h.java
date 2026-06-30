package ux3;

/* loaded from: classes4.dex */
public final class h extends com.p314xaae8f345.mm.p944x882e457a.i {
    public h(int i17, int i18, java.lang.String sessionId, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        t45.y yVar = new t45.y();
        yVar.f497192f = i17;
        yVar.f497193g = 0;
        yVar.f497190d = i18;
        yVar.f497191e = sessionId;
        t45.x0 x0Var = new t45.x0();
        x0Var.f497189e = i18;
        x0Var.f497188d = i19;
        yVar.f497195i = android.util.Base64.encodeToString(x0Var.mo14344x5f01b1f6(), 2);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = yVar;
        lVar.f152198b = new t45.z();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getrecommendringback";
        lVar.f152200d = 4215;
        p(lVar.a());
    }
}
