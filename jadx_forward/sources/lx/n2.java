package lx;

/* loaded from: classes11.dex */
public final class n2 implements com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public final int f403409d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f403410e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.biz.C23304x40aed91d f403411f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.a8 f403412g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z1 f403413h;

    public n2(int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a8 oj6;
        this.f403409d = i17;
        if (i17 == 5) {
            oj6 = r01.q3.ij();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oj6);
        } else {
            oj6 = r01.q3.oj();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oj6);
        }
        this.f403412g = oj6;
        this.f403413h = new lx.m2(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p2845xc516c4b6.biz.C23287xe8d18758 a(com.p314xaae8f345.mm.p2621x8fb0427b.s1 r30) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.n2.a(com.tencent.mm.storage.s1):com.tencent.pigeon.biz.NotifyMsg");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: addContact */
    public void mo85953xaa747c3f(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        o25.a aVar = new o25.a();
        aVar.f424002g = false;
        aVar.f424003h = false;
        ((r35.o) ((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).wi(this.f403410e, username, 268, new lx.k2(this, username), aVar)).f();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: addToPreload */
    public void mo85954x81a9936d(java.lang.String url, long j17, long j18, java.lang.String brandUserName, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brandUserName, "brandUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(url, (int) j17, (int) j18, brandUserName, new java.lang.Object[0]);
    }

    public final java.util.List b(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((com.p314xaae8f345.mm.p2621x8fb0427b.s1) it.next()));
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: canUseStyleV2WhenMsgVersion */
    public boolean mo85955x16730b07(long j17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e eVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a;
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService").getBoolean("k_personalCenterMessageListUseStyleV2_V" + ((int) j17), true);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: getNotificationTabInfo */
    public com.p314xaae8f345.p2845xc516c4b6.biz.C23182x6874c685 mo85956x3999e342() {
        return this.f403409d == 5 ? ur1.n.f511894a.c() : ur1.n.f511894a.c();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: getNotifyCount */
    public long mo85957x706b3610() {
        return this.f403412g.x();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: getNotifyMsgList */
    public java.util.List mo85958x1972cc80(long j17, long j18, long j19) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a8 a8Var = this.f403412g;
        if (j17 == 1) {
            java.util.List b17 = a8Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getInitList(...)");
            return b(b17);
        }
        if (j18 > 0) {
            java.util.List U = a8Var.U((int) j19, j18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(U, "getMoreList(...)");
            return b(U);
        }
        java.util.List i17 = a8Var.i((int) j19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "getInitList(...)");
        return b(i17);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: getNotifyUnReadCount */
    public long mo85959x6c0662c1() {
        return this.f403412g.f();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: gotoBizProfile */
    public void mo85960xf3cb96d9(java.lang.String username, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (r26.n0.N(username)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBizNotifyMsgPlugin", "gotoBizProfile username invalid");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizNotifyMsgPlugin", "gotoBizProfile username=" + username + ", addContactScene=" + j17 + ", serviceType=" + j18);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", username);
        intent.putExtra("Contact_Scene", (int) j17);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        android.content.Context context = this.f403410e;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403410e = binding.mo137508x19263085();
        this.f403412g.j0(this.f403413h, android.os.Looper.getMainLooper());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2.Companion.m85967x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f403411f = new com.p314xaae8f345.p2845xc516c4b6.biz.C23304x40aed91d(m137983x3b5b91dc2, null, 2, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f403410e = null;
        this.f403412g.P(this.f403413h);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f403410e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2.Companion.m85967x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f403411f = null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: onItemClick */
    public void mo85961x7cfc8b16(com.p314xaae8f345.p2845xc516c4b6.biz.C23287xe8d18758 msg) {
        java.util.Map d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
        s1Var.f67306x114ef53e = msg.m85945x3092e94f();
        java.lang.Long m85942x74d37ac6 = msg.m85942x74d37ac6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m85942x74d37ac6);
        s1Var.f67292x297eb4f7 = m85942x74d37ac6.longValue();
        java.lang.Long m85933xe67d4b7a = msg.m85933xe67d4b7a();
        s1Var.f67308x2262335f = m85933xe67d4b7a != null ? (int) m85933xe67d4b7a.longValue() : 0;
        s1Var.f67281xad49e234 = msg.m85941xf3cc99ae();
        java.lang.Long m85932x3fdd41df = msg.m85932x3fdd41df();
        s1Var.f67282xac3be4e = m85932x3fdd41df != null ? m85932x3fdd41df.longValue() : 0L;
        if (s1Var.f67292x297eb4f7 != 0) {
            java.lang.String str = s1Var.f67281xad49e234;
            if (str == null || str.length() == 0) {
                return;
            }
            if (s1Var.z0()) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", s1Var.t0().f275335f);
                intent.putExtra("geta8key_username", s1Var.t0().f275330a);
                intent.putExtra("geta8key_scene", 56);
                j45.l.j(this.f403410e, "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            }
            int i17 = this.f403409d;
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.s2.a(s1Var, i17)) {
                long j17 = s1Var.f67292x297eb4f7;
                if (j17 > 0) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 o17 = pt0.f0.f439742b1.o(s1Var.f67306x114ef53e, j17, true);
                    if (o17 == null || o17.m124847x74d37ac6() == 0) {
                        android.app.Activity activity = this.f403410e;
                        db5.e1.T(activity, activity != null ? activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ali) : null);
                        return;
                    }
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Chat_User", s1Var.f67306x114ef53e);
                    intent2.putExtra("finish_direct", true);
                    intent2.putExtra("from_global_search", true);
                    intent2.putExtra("msg_local_id", s1Var.f67292x297eb4f7);
                    intent2.putExtra("specific_chat_from_scene", 9);
                    intent2.putExtra("preChatTYPE", 13);
                    j45.l.u(this.f403410e, ".ui.chatting.ChattingUI", intent2, null);
                    return;
                }
                return;
            }
            android.content.Context context = this.f403410e;
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s1Var.f67281xad49e234) && s1Var.w0() && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(s1Var.f67281xad49e234, "msg", null)) != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.o2 o2Var = new com.p314xaae8f345.mm.p2621x8fb0427b.o2(s1Var, d17, i17, context);
                com.p314xaae8f345.mm.p2621x8fb0427b.q2 q2Var = new com.p314xaae8f345.mm.p2621x8fb0427b.q2(d17, i17, context, s1Var);
                com.p314xaae8f345.mm.p2621x8fb0427b.r2 r2Var = new com.p314xaae8f345.mm.p2621x8fb0427b.r2(d17, i17, s1Var, context);
                com.p314xaae8f345.mm.p2621x8fb0427b.p2 p2Var = new com.p314xaae8f345.mm.p2621x8fb0427b.p2(s1Var, d17, i17, context);
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader." + com.p314xaae8f345.mm.p2621x8fb0427b.s2.g(i17) + ".act"), 0);
                if (P == 1) {
                    o2Var.mo152xb9724478();
                } else if (P == 2) {
                    q2Var.mo152xb9724478();
                } else if (P == 3) {
                    r2Var.mo152xb9724478();
                } else if (P != 4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "unknow type");
                } else {
                    p2Var.mo152xb9724478();
                }
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.s2.k(s1Var, i17);
            com.p314xaae8f345.mm.p2621x8fb0427b.s2.f(s1Var, i17);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: onItemDelete */
    public boolean mo85962x23e871dd(com.p314xaae8f345.p2845xc516c4b6.biz.C23287xe8d18758 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Long m85942x74d37ac6 = msg.m85942x74d37ac6();
        if (m85942x74d37ac6 == null) {
            return false;
        }
        return this.f403412g.c(m85942x74d37ac6.longValue(), true, true);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: onNotifyMsgBlockStatusChanged */
    public void mo85963x3ad20b0e(java.lang.String mpArticleKey, long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mpArticleKey, "mpArticleKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        boolean s17 = this.f403412g.s(mpArticleKey, (int) j17);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(s17))));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403410e = binding.mo137508x19263085();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: reportPersonalCenter */
    public void mo85964x33c82509(long j17, long j18, long j19, java.lang.String biz, boolean z17, long j27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        ur1.e eVar = ur1.e.f511879d;
        ur1.e.f511879d.c(j17, j18, j19, biz, z17, "", j27);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23288x57161ba2
    /* renamed from: setHasRead */
    public void mo85965xdac80c8e(java.util.List list, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a8 a8Var = this.f403412g;
        if (z17) {
            a8Var.H(list);
        } else {
            a8Var.i0(list);
        }
    }
}
