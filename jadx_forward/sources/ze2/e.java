package ze2;

/* loaded from: classes3.dex */
public final class e implements we2.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f553309a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f553310b;

    public e(gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f553309a = liveContext;
        this.f553310b = "LiveMsgRespLegalInterceptor";
    }

    @Override // we2.c0
    public boolean a(we2.c cgiResp) {
        r45.r71 r71Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiResp, "cgiResp");
        int i17 = cgiResp.f526751a;
        we2.b bVar = cgiResp.f526753c;
        r45.nw1 nw1Var = (bVar == null || (r71Var = bVar.f526747a) == null) ? null : (r45.nw1) r71Var.m75936x14adae67(3);
        java.lang.String str = cgiResp.f526754d;
        we2.b bVar2 = cgiResp.f526753c;
        java.lang.Integer valueOf = bVar2 != null ? java.lang.Integer.valueOf(bVar2.f526748b) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleLiveMsgResp errCode:");
        sb6.append(i17);
        sb6.append(" curData:");
        gk2.e eVar = this.f553309a;
        r45.nw1 nw1Var2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r;
        sb6.append(nw1Var2 != null ? java.lang.Long.valueOf(nw1Var2.m75942xfb822ef2(0)) : null);
        sb6.append(", resp.liveId:");
        sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)) : null);
        sb6.append(",reqVisitorRoleType:");
        sb6.append(valueOf);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f553310b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        java.lang.Long valueOf2 = nw1Var != null ? java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)) : null;
        r45.nw1 nw1Var3 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf2, nw1Var3 != null ? java.lang.Long.valueOf(nw1Var3.m75942xfb822ef2(0)) : null)) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("handleLiveMsgResp invalid live resp, curData:");
            r45.nw1 nw1Var4 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r;
            sb8.append(nw1Var4 != null ? java.lang.Long.valueOf(nw1Var4.m75942xfb822ef2(0)) : null);
            sb8.append(", resp.liveId:");
            sb8.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
            return false;
        }
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
        if (!((str == null || str.length() == 0) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, e1Var != null ? e1Var.f410528y : null))) {
            if (!(((mm2.c1) eVar.a(mm2.c1.class)).U7())) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "handleLiveMsgResp live has finished");
            return false;
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("handleLiveMsgResp invalid live id, curData:");
        r45.nw1 nw1Var5 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r;
        sb9.append(nw1Var5 != null ? java.lang.Long.valueOf(nw1Var5.m75942xfb822ef2(0)) : null);
        sb9.append(", resp.liveId:");
        sb9.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)) : null);
        sb9.append(", curUniqueId:");
        sb9.append(((mm2.e1) eVar.a(mm2.e1.class)).f410528y);
        sb9.append(", cgi.uniqueId:");
        sb9.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb9.toString());
        return false;
    }
}
