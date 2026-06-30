package lx;

/* loaded from: classes11.dex */
public final class u implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f403489d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f403490e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.biz.C23280xd9c114f4 f403491f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f403493h;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f403492g = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final long f403494i = 200;

    /* renamed from: m, reason: collision with root package name */
    public final lx.m f403495m = new lx.m(this);

    public u(int i17) {
        this.f403489d = i17;
    }

    public static final com.p314xaae8f345.p2845xc516c4b6.biz.C23267x35e930a3 a(lx.u uVar, android.database.Cursor cursor) {
        uVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(cursor);
        kr1.a aVar = new kr1.a();
        aVar.mo9015xbf5d97fd(cursor);
        return new com.p314xaae8f345.p2845xc516c4b6.biz.C23267x35e930a3(z3Var.d1(), z3Var.P0(), aVar.f66581xf66fcca9, java.lang.Long.valueOf(aVar.f66582xa783a79b), java.lang.Long.valueOf(z3Var.f1()), java.lang.Boolean.valueOf((z3Var.m124896xfb85f7b0() & 2048) != 0), java.lang.Long.valueOf(z3Var.m124895x3fdd41df()));
    }

    public static final android.database.Cursor b(lx.u uVar, int i17, int i18, int i19) {
        uVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("select rcontact.username, rcontact.nickname, rcontact.verifyFlag, bizinfo.type, rcontact.type, rcontact.createTime, rcontact.lvbuff, BizFollowedContactDigest.updateTime, BizFollowedContactDigest.digest from rcontact left join bizinfo on rcontact.username = bizinfo.username left join BizFollowedContactDigest on rcontact.username = BizFollowedContactDigest.bizUsername");
        uVar.d(sb6);
        uVar.c(sb6);
        if (i17 >= 0) {
            sb6.append(" order by ");
            sb6.append(" case when (rcontact.type & 2048) != 0 then 1 else 0 end desc, ");
            if (i17 == 0) {
                sb6.append("BizFollowedContactDigest.updateTime desc ");
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

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79
    /* renamed from: addToPreload */
    public void mo85810x81a9936d(java.lang.String url, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).d(url, (int) j17, (int) j18, new java.lang.Object[0]);
    }

    public final void c(java.lang.StringBuilder sb6) {
        java.util.ArrayList arrayList = (java.util.ArrayList) kz5.n0.V0(c01.e2.i());
        arrayList.add("gh_9639b5a92773");
        if (!r0.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                sb6.append(" and ");
                sb6.append("rcontact");
                sb6.append(".");
                sb6.append(dm.i4.f66875xa013b0d5);
                sb6.append(" != '");
                sb6.append(str);
                sb6.append("'");
            }
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
        int i17 = this.f403489d == 2 ? 5 : 0;
        sb6.append(" and ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("type");
        sb6.append(" = ");
        sb6.append(i17);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79
    /* renamed from: doSearch */
    public void mo85811x17288a13() {
        boolean z17 = this.f403489d == 2;
        int i17 = z17 ? 245 : 11;
        int i18 = z17 ? 33562636 : 2;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.h(0)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new lx.l(i17, i18, this, z17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizConversationPlugin", "fts h5 template not avail");
        }
    }

    public final void e(java.lang.String str) {
        if (this.f403493h != null) {
            return;
        }
        lx.s sVar = new lx.s(this, str);
        this.f403493h = sVar;
        this.f403492g.postDelayed(sVar, this.f403494i);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79
    /* renamed from: enterProfile */
    public void mo85812xc6af37b1(java.lang.String username, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", username);
        intent.putExtra("Contact_Scene", (int) j17);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        android.content.Context context = this.f403490e;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        boolean w27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true).w2();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6342x68bfec9b c6342x68bfec9b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6342x68bfec9b();
        c6342x68bfec9b.f136929d = 1L;
        c6342x68bfec9b.f136930e = com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a;
        c6342x68bfec9b.f136931f = c6342x68bfec9b.b("bizusername", username, true);
        c6342x68bfec9b.f136932g = java.lang.System.currentTimeMillis();
        c6342x68bfec9b.f136933h = w27 ? 1L : 0L;
        c6342x68bfec9b.k();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79
    /* renamed from: fetchDigest */
    public void mo85813x6b91d1e() {
        yw.h1.f547865a.d(this.f403489d == 2 ? 5 : 0);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if ((a1Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.e8) && (obj instanceof java.lang.String)) {
            if (i17 != 2 && i17 != 3) {
                if (i17 != 5) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizConversationPlugin", "Unhandled storage event: " + i17 + " for " + obj);
                    return;
                }
                kr1.b Ri = yq1.u0.Ri();
                java.lang.String username = (java.lang.String) obj;
                Ri.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                Ri.m145252xb06685ab("BizFollowedContactDigest", "bizUsername=?", new java.lang.String[]{username});
                e(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55714x23574fe5 + obj);
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) obj, true);
            if (n17 != null) {
                int i18 = this.f403489d;
                if (i18 == 2 && n17.l2()) {
                    e("update Photo :" + obj);
                } else if (i18 == 1 && n17.n2()) {
                    e("update Brand :" + obj);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79
    /* renamed from: getConversationCount */
    public long mo85814x7ecf6596() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("select count(*) from rcontact left join bizinfo on rcontact.username = bizinfo.username left join BizFollowedContactDigest on rcontact.username = BizFollowedContactDigest.bizUsername");
        d(sb6);
        c(sb6);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        android.database.Cursor f17 = gm0.j1.u().f354686f.f(sb7, null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79
    /* renamed from: getConversationListOrderByCreateTime */
    public void mo85815xa7e3cd97(long j17, long j18, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new lx.o(this, j17 < 0 ? 0 : (int) j17, j18, new java.util.ArrayList(), callback, null), 2, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79
    /* renamed from: getConversationListOrderByUpdateTime */
    public void mo85816x44a3b6e4(long j17, long j18, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new lx.q(this, j17 < 0 ? 0 : (int) j17, j18, new java.util.ArrayList(), callback, null), 2, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79
    /* renamed from: gotoUrl */
    public void mo85817xca22d0c(com.p314xaae8f345.p2845xc516c4b6.biz.C23062x18e3a1e1 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        lx.a aVar = new lx.a(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        aVar.f403202g = info.m84749xb5887639();
        aVar.f403200e = info.m84747x5ae7d1ac();
        aVar.f403201f = info.m84748xff358fa2();
        aVar.f403203h = info.m84746x7235c680();
        yw.h1 h1Var = yw.h1.f547865a;
        android.content.Context context = this.f403490e;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        h1Var.t(aVar, context);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403490e = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79.Companion.m85820x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f403491f = new com.p314xaae8f345.p2845xc516c4b6.biz.C23280xd9c114f4(m137983x3b5b91dc2, null, 2, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        yq1.u0.Ri().add(this.f403495m);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f403490e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f403490e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79.Companion.m85820x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f403491f = null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        yq1.u0.Ri().mo49775xc84af884(this.f403495m);
        java.lang.Runnable runnable = this.f403493h;
        if (runnable != null) {
            this.f403492g.removeCallbacks(runnable);
        }
        this.f403493h = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403490e = binding.mo137508x19263085();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23268xccd11e79
    /* renamed from: unSubscribeContact */
    public void mo85818x22a2382f(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        qk.o b17 = r01.q3.cj().b1(username);
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        android.app.Activity activity = this.f403490e;
        lx.t tVar = new lx.t(username);
        ((com.p314xaae8f345.mm.app.o7) n6Var).getClass();
        com.p314xaae8f345.mm.ui.p2740x696c9db.n1.b(b17, activity, n17, false, tVar, 2);
    }
}
