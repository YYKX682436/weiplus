package ek2;

/* loaded from: classes2.dex */
public final class u extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.t f335081u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j17, long j18, java.lang.String initiatorFinderUsername, boolean z17, ek2.t tVar) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initiatorFinderUsername, "initiatorFinderUsername");
        this.f335081u = tVar;
        r45.qx0 qx0Var = new r45.qx0();
        qx0Var.f465859d = db2.t4.f309704a.a(13601);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        qx0Var.f465860e = xy2.c.e(context);
        qx0Var.f465861f = j17;
        qx0Var.f465862g = j18;
        qx0Var.f465863h = z17;
        qx0Var.f465864i = initiatorFinderUsername;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = qx0Var;
        r45.rx0 rx0Var = new r45.rx0();
        r45.ie ieVar = new r45.ie();
        rx0Var.f76492x92037252 = ieVar;
        ieVar.f458493e = new r45.du5();
        lVar.f152198b = rx0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercolivepollinvitation";
        lVar.f152200d = 13601;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiCoLivePollInvitation", "init invitationId=" + j17 + ", version=" + j18 + ", screenshotDetected=" + z17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.rx0 resp = (r45.rx0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        r45.f50 f50Var = resp.f466799e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(", hasUpdate=");
        sb6.append(resp.f466798d);
        sb6.append(", version=");
        sb6.append(resp.f466800f);
        sb6.append(", pollIntervalMs=");
        sb6.append(resp.f466801g);
        sb6.append(", status=");
        sb6.append(f50Var != null ? java.lang.Integer.valueOf(f50Var.f455547e) : null);
        sb6.append(", objectId=");
        sb6.append(resp.f466802h);
        sb6.append(", liveId=");
        sb6.append(resp.f466803i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiCoLivePollInvitation", sb6.toString());
        ek2.t tVar = this.f335081u;
        if (tVar != null) {
            re2.d1 d1Var = (re2.d1) tVar;
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveRequestHelper", "pollInvitation success: hasUpdate=" + resp.f466798d + ", version=" + resp.f466800f);
                yz5.l lVar = d1Var.f475911a;
                if (lVar != null) {
                    lVar.mo146xb9724478(resp);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.CoLiveRequestHelper", "pollInvitation failed: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
            yz5.p pVar = d1Var.f475912b;
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
