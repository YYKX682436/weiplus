package ws2;

/* loaded from: classes3.dex */
public final class a0 implements we2.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f530529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ws2.b0 f530530b;

    public a0(ws2.b0 b0Var, gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f530530b = b0Var;
        this.f530529a = "ReplayMsgRespLegalInterceptor";
    }

    @Override // we2.c0
    public boolean a(we2.c cgiResp) {
        r45.r71 r71Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiResp, "cgiResp");
        int i17 = cgiResp.f526751a;
        int i18 = cgiResp.f526752b;
        we2.b bVar = cgiResp.f526753c;
        r45.nw1 nw1Var = (bVar == null || (r71Var = bVar.f526747a) == null) ? null : (r45.nw1) r71Var.m75936x14adae67(3);
        java.lang.String str = cgiResp.f526754d;
        ws2.b0 b0Var = this.f530530b;
        boolean z17 = nw1Var != null && nw1Var.m75942xfb822ef2(0) == ((ct2.j) b0Var.f410496d.a(ct2.j.class)).O6();
        java.lang.String str2 = this.f530529a;
        if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, ((mm2.e1) b0Var.f410496d.a(mm2.e1.class)).f410528y)) {
            if (i18 == 0 && i17 == 0) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "handleReplayLiveMsgResp errCode:" + i17 + ",errType:" + i18);
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleReplayLiveMsgResp localUniqId:");
        sb6.append(((mm2.e1) b0Var.f410496d.a(mm2.e1.class)).f410528y);
        sb6.append(", respUniqId:");
        sb6.append(str);
        sb6.append(", local liveId:");
        sb6.append(((ct2.j) b0Var.f410496d.a(ct2.j.class)).O6());
        sb6.append(", resp.liveId:");
        sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, sb6.toString());
        return false;
    }
}
