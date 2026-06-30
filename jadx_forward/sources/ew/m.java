package ew;

/* loaded from: classes11.dex */
public final class m implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f338521d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23598x99bf6511 f338522e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f338524g;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f338523f = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public final long f338525h = 200;

    public static final com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23588x1a1a4a26 a(ew.m mVar, android.database.Cursor cursor) {
        mVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(cursor);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
        l4Var.mo9015xbf5d97fd(cursor);
        return new com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23588x1a1a4a26(z3Var.d1(), z3Var.P0(), l4Var.y0(), java.lang.Long.valueOf(l4Var.w0() / 1000), java.lang.Long.valueOf(z3Var.f1()), java.lang.Boolean.valueOf((z3Var.m124896xfb85f7b0() & 2048) != 0), java.lang.Long.valueOf(z3Var.m124895x3fdd41df()));
    }

    public static final android.database.Cursor b(ew.m mVar, int i17, int i18, int i19) {
        mVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("select rcontact.username, rcontact.nickname, rcontact.verifyFlag, bizinfo.type, rcontact.type, rcontact.createTime, rcontact.lvbuff, rconversation.digest, rconversation.conversationTime from rcontact left join bizinfo on rcontact.username = bizinfo.username left join rconversation on rcontact.username = rconversation.username");
        mVar.d(sb6);
        mVar.c(sb6);
        if (i17 >= 0) {
            sb6.append(" order by ");
            sb6.append(" case when (rcontact.type & 2048) != 0 then 1 else 0 end desc, ");
            if (i17 == 0) {
                sb6.append("conversationTime desc ");
            } else {
                sb6.append("createTime desc ");
            }
        }
        sb6.append(" LIMIT ");
        sb6.append(i19);
        sb6.append(" OFFSET ");
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return gm0.j1.u().f354686f.f(sb7, null, 2);
    }

    public final void c(java.lang.StringBuilder sb6) {
        java.util.List<java.lang.String> V0 = kz5.n0.V0(c01.e2.i());
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        arrayList.add("weixin");
        arrayList.add("gh_9639b5a92773");
        arrayList.add("gh_43f2581f6fd6");
        arrayList.addAll(com.p314xaae8f345.mm.p2621x8fb0427b.z3.u3());
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minishop_plugin_enabled, 1) == 1) {
            arrayList.add("gh_579db1f2cf89");
        }
        arrayList.add("gh_051d9102de63");
        arrayList.add("gh_25d9ac85a4bc");
        for (java.lang.String str : V0) {
            sb6.append(" and ");
            sb6.append("rcontact");
            sb6.append(".");
            sb6.append(dm.i4.f66875xa013b0d5);
            sb6.append(" != '");
            sb6.append(str);
            sb6.append("'");
        }
    }

    public final void d(java.lang.StringBuilder sb6) {
        sb6.append(" where (");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append("verifyFlag");
        sb6.append(" & ");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
        sb6.append(8);
        sb6.append(") != 0 ");
        sb6.append(" and (");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append("type");
        sb6.append(" & ");
        sb6.append(1);
        sb6.append(") != 0 ");
        sb6.append(" and ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("type");
        sb6.append(" = ");
        sb6.append(1);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96
    /* renamed from: doSearch */
    public void mo87322x17288a13() {
        zv.q.f557612a.a();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96
    /* renamed from: enterChatting */
    public void mo87323xa0b08d3e(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(username);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", username);
        intent.putExtra("finish_direct", true);
        intent.putExtra("biz_click_item_unread_count", p17 != null ? p17.d1() : 0);
        intent.putExtra("specific_chat_from_scene", 14);
        intent.putExtra("KOpenArticleSceneFromScene", 287);
        if (this.f338521d != null) {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, this.f338521d);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if ((a1Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.e8) && (obj instanceof java.lang.String)) {
            long j17 = this.f338525h;
            android.os.Handler handler = this.f338523f;
            if (i17 == 2 || i17 == 3) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) obj, true);
                if (n17 != null) {
                    java.lang.String str = "update Brand Service :" + n17.d1();
                    if (this.f338524g != null) {
                        return;
                    }
                    ew.k kVar = new ew.k(this, str);
                    this.f338524g = kVar;
                    handler.postDelayed(kVar, j17);
                    return;
                }
                return;
            }
            if (i17 != 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBrsConversationPlugin", "Unhandled storage event: " + i17 + " for " + obj);
                return;
            }
            java.lang.String str2 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55714x23574fe5 + obj;
            if (this.f338524g != null) {
                return;
            }
            ew.k kVar2 = new ew.k(this, str2);
            this.f338524g = kVar2;
            handler.postDelayed(kVar2, j17);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96
    /* renamed from: getConversationCount */
    public long mo87324x7ecf6596() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("select count(*) from rcontact left join bizinfo on rcontact.username = bizinfo.username");
        d(sb6);
        c(sb6);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        android.database.Cursor f17 = gm0.j1.u().f354686f.f(sb7, null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96
    /* renamed from: getConversationListOrderByCreateTime */
    public void mo87325xa7e3cd97(long j17, long j18, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new ew.g(this, j17 < 0 ? 0 : (int) j17, j18, new java.util.ArrayList(), callback, null), 2, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96
    /* renamed from: getConversationListOrderByUpdateTime */
    public void mo87326x44a3b6e4(long j17, long j18, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new ew.i(this, j17 < 0 ? 0 : (int) j17, j18, new java.util.ArrayList(), callback, null), 2, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f338521d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96.Companion.m87329x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f338522e = new com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23598x99bf6511(m137983x3b5b91dc2, null, 2, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f338521d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f338521d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96.Companion.m87329x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f338522e = null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        java.lang.Runnable runnable = this.f338524g;
        if (runnable != null) {
            this.f338523f.removeCallbacks(runnable);
        }
        this.f338524g = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f338521d = binding.mo137508x19263085();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23589x251bdb96
    /* renamed from: unSubscribeContact */
    public void mo87327x22a2382f(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        qk.o b17 = r01.q3.cj().b1(username);
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        android.app.Activity activity = this.f338521d;
        ew.l lVar = new ew.l(username);
        ((com.p314xaae8f345.mm.app.o7) n6Var).getClass();
        com.p314xaae8f345.mm.ui.p2740x696c9db.n1.b(b17, activity, n17, false, lVar, 2);
    }
}
