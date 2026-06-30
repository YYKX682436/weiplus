package i13;

/* loaded from: classes8.dex */
public final class f extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f368813m = "MicroMsg.CgiGetForceNotifyInfoList";

    public f() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.bg3();
        lVar.f152198b = new r45.cg3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getforcepush";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.p1.f34640x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.cg3 resp = (r45.cg3) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        boolean a17 = gm0.j1.a();
        java.lang.String str2 = this.f368813m;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "account nor ready");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "CgiGetForceNotifyInfoList errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "report fail");
            return;
        }
        java.util.LinkedList linkedList = resp.f453073d;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.k43 k43Var = (r45.k43) it.next();
                i13.j jVar = new i13.j();
                jVar.f66503x11b86abb = k43Var.f459894i;
                jVar.f66497xc9a553ad = k43Var.f459891f * 1000;
                jVar.f66495x81959a6e = k43Var.f459890e * 1000;
                int i19 = 0;
                if (!(c01.id.c() >= jVar.f66497xc9a553ad)) {
                    i19 = 1;
                }
                jVar.f66500xda05eaf7 = i19;
                jVar.f66498x89ebb00a = k43Var.f459895m;
                jVar.f66496x685e8417 = k43Var.f459892g;
                jVar.f66502x11b62ca9 = k43Var.f459893h;
                jVar.f66499xaeadb4bb = k43Var.f459889d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "ret:%s item:%s", java.lang.Boolean.valueOf(j13.a.f378710d.mo11260x413cb2b4(jVar)), jVar);
            }
        }
    }
}
