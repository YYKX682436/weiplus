package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes8.dex */
public final class g extends com.p314xaae8f345.mm.p944x882e457a.i {
    public g(com.p314xaae8f345.mm.p2495xc50a8b8b.g extDeviceId, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extDeviceId, "extDeviceId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.bn0 bn0Var = new r45.bn0();
        bn0Var.f452418d = extDeviceId;
        bn0Var.f452422h = "";
        bn0Var.f452419e = i17;
        bn0Var.f452420f = i18;
        bn0Var.f452421g = i19;
        r45.cn0 cn0Var = new r45.cn0();
        r45.ie ieVar = new r45.ie();
        cn0Var.f76492x92037252 = ieVar;
        ieVar.f458493e = new r45.du5();
        lVar.f152197a = bn0Var;
        lVar.f152198b = cn0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/extdeviceoplog";
        lVar.f152200d = 4048;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiExtDeviceOplog", "opcode:" + bn0Var.f452420f + " setting:" + i19);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiExtDeviceOplog", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
