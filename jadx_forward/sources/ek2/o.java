package ek2;

/* loaded from: classes2.dex */
public final class o extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.n f335041u;

    /* JADX WARN: Multi-variable type inference failed */
    public o(int i17, ek2.n nVar) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f335041u = nVar;
        r45.kx0 kx0Var = new r45.kx0();
        kx0Var.f460544d = db2.t4.f309704a.a(8947);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        kx0Var.f460545e = xy2.c.e(context);
        kx0Var.f460546f = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = kx0Var;
        r45.lx0 lx0Var = new r45.lx0();
        r45.ie ieVar = new r45.ie();
        lx0Var.f76492x92037252 = ieVar;
        ieVar.f458493e = new r45.du5();
        lVar.f152198b = lx0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercolivecreateinvitation";
        lVar.f152200d = 8947;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiCoLiveCreateInvitation", "init settlementMode=" + i17 + ", myFinderUsername=" + kx0Var.f460545e);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.lx0 resp = (r45.lx0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(", invitationId=");
        sb6.append(resp.f461451d);
        sb6.append(", qrcodeUrl=");
        java.lang.String str2 = resp.f461452e;
        sb6.append(str2 != null ? r26.p0.E0(str2, 50) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiCoLiveCreateInvitation", sb6.toString());
        ek2.n nVar = this.f335041u;
        if (nVar != null) {
            re2.a1 a1Var = (re2.a1) nVar;
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveRequestHelper", "createInvitation success: invitationId=" + resp.f461451d);
                yz5.l lVar = a1Var.f475892a;
                if (lVar != null) {
                    lVar.mo146xb9724478(resp);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.CoLiveRequestHelper", "createInvitation failed: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
            yz5.p pVar = a1Var.f475893b;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), str);
            }
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }
}
