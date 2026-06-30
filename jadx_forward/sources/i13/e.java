package i13;

/* loaded from: classes2.dex */
public final class e extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f368812m;

    public e(java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f368812m = "MicroMsg.CgiGetForceNotifyInfoList";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ru5 ru5Var = new r45.ru5();
        ru5Var.f466753d = data;
        lVar.f152197a = ru5Var;
        lVar.f152198b = new r45.su5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/scanappforcepush";
        lVar.f152200d = 3538;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.su5 resp = (r45.su5) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        boolean a17 = gm0.j1.a();
        java.lang.String str2 = this.f368812m;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "account nor ready");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "CgiGetForceNotifyAcceptInfo errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "report fail");
    }
}
