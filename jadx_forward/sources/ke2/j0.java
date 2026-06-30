package ke2;

/* loaded from: classes8.dex */
public final class j0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388492t;

    /* renamed from: u, reason: collision with root package name */
    public final ke2.i0 f388493u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(java.lang.String nickname, java.lang.String url, int i17, long j17, ke2.i0 i0Var) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f388492t = "Finder.CgiFinderLiveSetSockPuppetAttr";
        this.f388493u = i0Var;
        r45.c92 c92Var = new r45.c92();
        c92Var.set(2, nickname);
        c92Var.set(3, url);
        c92Var.set(1, db2.t4.f309704a.a(6816));
        c92Var.set(4, java.lang.Integer.valueOf(i17));
        c92Var.set(5, java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = c92Var;
        r45.d92 d92Var = new r45.d92();
        d92Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d92Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = d92Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivesetsockpuppetattr";
        lVar.f152200d = 6816;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init nickname:");
        sb6.append(c92Var.m75945x2fec8307(2));
        sb6.append(",url:");
        sb6.append(c92Var.m75945x2fec8307(3));
        sb6.append(",live_identity:");
        r45.kv0 kv0Var = (r45.kv0) c92Var.m75936x14adae67(1);
        sb6.append(kv0Var != null ? java.lang.Integer.valueOf(kv0Var.m75939xb282bd08(6)) : null);
        sb6.append(",scene:");
        sb6.append(c92Var.m75939xb282bd08(4));
        sb6.append(", show_ts:");
        sb6.append(c92Var.m75942xfb822ef2(5));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveSetSockPuppetAttr", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        r45.d92 resp = (r45.d92) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388492t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ke2.i0 i0Var = this.f388493u;
        if (i17 != 0 || i18 != 0) {
            if (i0Var != null) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.o8(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.q8) i0Var).f191981a, i18, str));
                return;
            }
            return;
        }
        if (i0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 activityC13996x5a58c237 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.q8) i0Var).f191981a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13996x5a58c237.f190888v, "save alias nickName:" + activityC13996x5a58c237.L + ",avatar:" + activityC13996x5a58c237.f190887J);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save alias_info?.head_img_url:");
            r45.of1 of1Var = (r45.of1) resp.m75936x14adae67(1);
            sb6.append(of1Var != null ? of1Var.m75945x2fec8307(1) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13996x5a58c237.f190888v, sb6.toString());
            android.content.Intent intent = new android.content.Intent();
            r45.of1 of1Var2 = (r45.of1) resp.m75936x14adae67(1);
            if (of1Var2 == null || (str2 = of1Var2.m75945x2fec8307(0)) == null) {
                str2 = activityC13996x5a58c237.L;
            }
            intent.putExtra("KEY_ALIAS_VISITOR_NICKNAME", str2);
            r45.of1 of1Var3 = (r45.of1) resp.m75936x14adae67(1);
            if (of1Var3 == null || (str3 = of1Var3.m75945x2fec8307(1)) == null) {
                str3 = activityC13996x5a58c237.f190887J;
            }
            intent.putExtra("KEY_ALIAS_VISITOR_AVATAR", str3);
            r45.of1 of1Var4 = (r45.of1) resp.m75936x14adae67(1);
            if (of1Var4 == null || (str4 = of1Var4.m75945x2fec8307(3)) == null) {
                str4 = activityC13996x5a58c237.f190887J;
            }
            intent.putExtra("KEY_ALIAS_VISITOR_USERNAME", str4);
            activityC13996x5a58c237.setResult(-1, intent);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p8(activityC13996x5a58c237));
            activityC13996x5a58c237.finish();
        }
    }
}
