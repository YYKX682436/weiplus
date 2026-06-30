package fr4;

@j95.b
/* loaded from: classes11.dex */
public final class g0 extends i95.w implements gr4.f {

    /* renamed from: d, reason: collision with root package name */
    public d95.b0 f347353d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f347354e;

    /* renamed from: f, reason: collision with root package name */
    public kr4.m f347355f;

    /* renamed from: g, reason: collision with root package name */
    public kr4.k f347356g;

    /* renamed from: h, reason: collision with root package name */
    public kr4.n f347357h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f347359m;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f347362p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.ref.WeakReference f347363q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f347364r;

    /* renamed from: i, reason: collision with root package name */
    public final kr4.e f347358i = new kr4.e();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f347360n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f347361o = new java.util.concurrent.ConcurrentHashMap();

    public final kr4.k Ai() {
        gm0.j1.b().c();
        kr4.k kVar = this.f347356g;
        if (kVar == null) {
            kVar = new kr4.k(Ni());
        }
        this.f347356g = kVar;
        return kVar;
    }

    public final kr4.m Bi() {
        gm0.j1.b().c();
        if (this.f347355f == null) {
            kr4.m mVar = new kr4.m(Ni());
            this.f347355f = mVar;
            kr4.m mVar2 = this.f347355f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mVar2);
            mVar.add(mVar2);
        }
        kr4.m mVar3 = this.f347355f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mVar3);
        return mVar3;
    }

    public java.lang.String Di() {
        java.lang.String str = this.f347358i.f68903xdec927b;
        return str == null ? "" : str;
    }

    public final d95.b0 Ni() {
        d95.b0 b0Var = this.f347353d;
        if (b0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
            return b0Var;
        }
        this.f347354e = gm0.j1.u().h() + "W1wPersonalMsg.db";
        d95.b0 b0Var2 = this.f347353d;
        if (b0Var2 == null) {
            b0Var2 = new d95.b0();
            java.lang.String str = this.f347354e;
            if (str == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cacheDBPath");
                throw null;
            }
            if (!b0Var2.S(str, kz5.c1.i(new jz5.l(1269450851, fr4.t.f347394a), new jz5.l(1595239207, fr4.u.f347395a), new jz5.l(-640292320, fr4.v.f347396a)), true, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1w.W1wPersonalMsgService", "W1wPersonalMsg db init failed!");
            }
        }
        this.f347353d = b0Var2;
        return b0Var2;
    }

    public int Ri(java.lang.String str) {
        return Vi().y0(str).f69156xef647383;
    }

    public java.lang.String Ui(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f347361o;
        java.lang.String str = (java.lang.String) concurrentHashMap.get(username);
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        concurrentHashMap.put(username, uuid);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[getReddotId] generate new reddotId for username=" + username + " reddotId=" + uuid);
        return uuid;
    }

    public final kr4.n Vi() {
        gm0.j1.b().c();
        kr4.n nVar = this.f347357h;
        if (nVar == null) {
            nVar = new kr4.n(Ni());
        }
        this.f347357h = nVar;
        return nVar;
    }

    public java.lang.String Zi(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        kr4.n nVar = this.f347357h;
        if (nVar != null) {
            return nVar.y0(sessionId).f69160x3e123854;
        }
        return null;
    }

    public int aj(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        kr4.m mVar = this.f347355f;
        java.lang.Integer valueOf = mVar != null ? java.lang.Integer.valueOf(mVar.z0(0, username)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[getUnreadCount] username=" + username + " count=" + valueOf);
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    public final void bj(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[nativeSync] start sync: syncScene=" + i17 + ", selfUsername=" + str);
        if (i17 == 3009 || i17 == 3011 || i17 == 3010) {
            if (!(str == null || str.length() == 0)) {
                this.f347360n.put(str, java.lang.Boolean.TRUE);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[nativeSync] set hasEvent=true for username=" + str);
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392101a), null, null, new fr4.z(i17, null), 3, null);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("W1w.W1wPersonalMsgService", "[nativeSync] invalid params: syncScene=" + i17 + ", selfUsername=" + str);
    }

    public void cj(vu4.d actionType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String pageId, vu4.e boxInfo, java.lang.String str5, java.lang.String str6, java.lang.String str7, vu4.g msgPageType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageId, "pageId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxInfo, "boxInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgPageType, "msgPageType");
        try {
            java.util.List a17 = new vu4.f(actionType, str, str2, str3, pageId, boxInfo, "0", str5, null, str4, str6, str7, msgPageType, 256, null).a();
            r45.id4 id4Var = new r45.id4();
            id4Var.f458484d = 28760;
            id4Var.f458485e = kz5.n0.g0(a17, ",", null, null, 0, null, null, 62, null);
            id4Var.f458486f = 1;
            id4Var.f458487g = 28760;
            r45.op5 op5Var = new r45.op5();
            op5Var.f463961d.add(id4Var);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 1134;
            lVar.f152199c = "/cgi-bin/mmsearch-bin/zhuge/report_data";
            lVar.f152197a = op5Var;
            lVar.f152198b = new r45.pp5();
            com.p314xaae8f345.mm.p944x882e457a.o a18 = lVar.a();
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a18, fr4.e0.f347350a);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1w.W1wPersonalMsgService", "Failed to send 28760 report via new protobuf CGI", e17);
        }
    }

    public boolean fj(java.lang.String toUsername, java.lang.String selfUsername, gr4.e callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUsername, "selfUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[requestSessionInfo] requesting session info: fromUsername=" + selfUsername + ", toUsername=" + toUsername);
        r45.hj3 hj3Var = new r45.hj3();
        hj3Var.f457745d = selfUsername;
        hj3Var.f457746e = toUsername;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 26889;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/zhuge/get_personal_msg_session_info";
        lVar.f152197a = hj3Var;
        lVar.f152198b = new r45.ij3();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new fr4.f0(callback));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean hj(org.json.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr4.g0.hj(org.json.JSONObject):boolean");
    }

    public void ij(java.lang.String sessionId, java.lang.String talkerUserName, java.lang.String selfUserName, int i17, boolean z17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerUserName, "talkerUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUserName, "selfUserName");
        Vi().D0(sessionId, talkerUserName, selfUserName, i17, z17, i18);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        le0.x.Q0.add(fr4.a0.f347334a);
    }

    public void wi(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        kr4.m Bi = Bi();
        boolean z17 = false;
        if (sessionId.length() == 0) {
            return;
        }
        kr4.g y07 = Bi.y0(sessionId);
        int i17 = y07.f69052xa35b5abb;
        y07.f69052xa35b5abb = 0;
        y07.f69046x9b4f418d = 1;
        if (i17 != 0) {
            z17 = Bi.m145258xce0038c9(y07.f72763xa3c65b86, y07, false);
            Bi.mo142179xf35bbb4(y07.f69048xbed8694c, 5, y07);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsg.ConversationStorage", "[clearUnreadCount] ret=" + z17 + ' ' + i17 + " => " + y07.f69052xa35b5abb + " sessionId=" + sessionId);
    }
}
