package lx;

/* loaded from: classes11.dex */
public final class v2 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f403511d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f403513f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.biz.C23191x818c91f8 f403515h;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f403512e = "";

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f403514g = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final lx.r2 f403516i = new lx.r2(this);

    /* renamed from: m, reason: collision with root package name */
    public final lx.p2 f403517m = new lx.p2(this);

    public static final /* synthetic */ java.lang.String a(lx.v2 v2Var) {
        v2Var.getClass();
        return "MicroMsg.FlutterBizPhotoPrivateMsgPlugin";
    }

    public static final void b(lx.v2 v2Var, hr1.e eVar) {
        com.p314xaae8f345.p2845xc516c4b6.biz.C23191x818c91f8 c23191x818c91f8 = v2Var.f403515h;
        if (c23191x818c91f8 == null) {
            return;
        }
        try {
            com.p314xaae8f345.p2845xc516c4b6.biz.C23322xd51df666 e17 = v2Var.e(eVar);
            if (e17 == null) {
                return;
            }
            c23191x818c91f8.m85246xfbd8f6db(e17, new lx.t2(v2Var));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "notifySessionChanged error: " + e18.getMessage());
        }
    }

    public final boolean c(java.lang.String str) {
        if (str.length() == 0) {
            return false;
        }
        return jr1.i.f382893a.a(str, 5);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254
    /* renamed from: clearGreetBoxRedDot */
    public void mo86034xbac00747(long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        try {
            dr1.a.f324117a.b((int) j17);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "clearGreetBoxRedDot error: " + e17.getMessage());
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e17))));
        }
    }

    public final nr1.f d() {
        nr1.f Vi = yq1.u0.Vi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Vi, "getBizPhotoFansConversationStorage(...)");
        return Vi;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254
    /* renamed from: deletePrivateMsgSession */
    public void mo86035x73dfcf4d(java.lang.String sessionId, java.lang.String bizuin, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizuin, "bizuin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!c(bizuin)) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("NOT_LOGIN")))));
            return;
        }
        hr1.e z07 = yq1.u0.Vi().z0(sessionId);
        boolean mo60485xc9e4dcd4 = yq1.u0.Vi().mo60485xc9e4dcd4(z07.f72763xa3c65b86, false);
        if (mo60485xc9e4dcd4) {
            yq1.u0.Zi().y0(sessionId, false);
            yq1.u0.Vi().mo142179xf35bbb4(sessionId, 6, z07);
            nr1.b Ui = yq1.u0.Ui();
            hr1.a aVar = new hr1.a();
            aVar.f66213x996f7ca = z07.f66328x114ef53e;
            Ui.mo9951xb06685ab(aVar, new java.lang.String[0]);
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(mo60485xc9e4dcd4))));
    }

    public final com.p314xaae8f345.p2845xc516c4b6.biz.C23322xd51df666 e(hr1.e eVar) {
        java.lang.String str;
        lx.v2 v2Var;
        java.lang.String obj;
        java.lang.Object b17;
        java.lang.String str2 = eVar.f66326xbed8694c;
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        eVar.u0();
        java.lang.String str3 = eVar.f66316xf66fcca9;
        java.lang.Object obj2 = "";
        if (str3 == null) {
            v2Var = this;
            str = "";
        } else {
            str = str3;
            v2Var = this;
        }
        android.content.Context context = v2Var.f403511d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        if (eVar.f66327x10a0fed7 == 1) {
            obj = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572268n53);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getString(...)");
        } else {
            obj = k35.m1.f(context, eVar.f66331xa783a79b, true, false).toString();
        }
        java.lang.String str4 = obj;
        long j17 = eVar.f66330xa35b5abb;
        java.lang.String str5 = eVar.f66325xea7a0fe2;
        java.lang.String str6 = eVar.f66326xbed8694c;
        if (!(str6 == null || str6.length() == 0) && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str6, "bizfansgreetholder@bizfansmsg") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str6, "bizphotofansgreetholder@picfansmsg"))) {
            java.lang.String field_sessionId = eVar.f66326xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573586o13);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            long j18 = eVar.f66331xa783a79b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
            return new com.p314xaae8f345.p2845xc516c4b6.biz.C23322xd51df666(field_sessionId, string, "", str, j18, str4, j17, str5, -1L, 5, 0L, true);
        }
        if (eVar.f66329x2262335f == 1) {
            java.lang.String d17 = jr1.j.d(java.lang.String.valueOf(eVar.Z));
            long j19 = eVar.f66331xa783a79b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
            return new com.p314xaae8f345.p2845xc516c4b6.biz.C23322xd51df666("photoAccountOfficial", d17, "", str, j19, str4, j17, str5, -1L, -1L, 0L, false);
        }
        i95.m c17 = i95.n0.c(zq1.u.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        hr1.a eb6 = zq1.u.eb((zq1.u) c17, eVar.f66326xbed8694c, 5, 0, 4, null);
        java.lang.String str7 = eVar.f66326xbed8694c;
        java.lang.String d18 = jr1.j.d(java.lang.String.valueOf(eVar.Z));
        java.lang.String str8 = eb6 != null ? eb6.f66207xff000111 : null;
        if (str8 == null) {
            str8 = "";
        }
        hr1.d dVar = eVar.f364879x0;
        if (dVar != null && (b17 = dVar.b(eVar)) != null) {
            obj2 = b17;
        }
        java.lang.String obj3 = obj2.toString();
        long j27 = eVar.f66331xa783a79b;
        long j28 = eb6 != null ? eb6.f66216xf8cebfca : 0;
        long j29 = eb6 != null ? eb6.f66210x4f9943d : 0L;
        long j37 = eVar.f66320xb4776b7c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
        return new com.p314xaae8f345.p2845xc516c4b6.biz.C23322xd51df666(str7, d18, str8, obj3, j27, str4, j17, str5, j29, j28, j37, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254
    /* renamed from: getPrivateMsgSessionList */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo86036x73e9c4c0(java.lang.String r9, yz5.l r10) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.v2.mo86036x73e9c4c0(java.lang.String, yz5.l):void");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254
    /* renamed from: getPrivateMsgUnreadCount */
    public void mo86037x356e3b0c(java.lang.String bizuin, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizuin, "bizuin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!c(bizuin)) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(0L)));
            return;
        }
        nr1.f d17 = d();
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f501403d;
        java.lang.String selfBiz = jr1.j.c(((ox.r) d0Var).Bi(2).c());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfBiz, "selfBiz");
        android.database.Cursor B = d17.f420681d.B("SELECT sum(unReadCount)\nFROM BizPhotoFansConversation\nWHERE selfBiz = ?\nAND type = ?", new java.lang.String[]{selfBiz, java.lang.String.valueOf(0)});
        if (B != null) {
            try {
                r1 = B.moveToFirst() ? B.getInt(0) : 0;
                vz5.b.a(B, null);
            } finally {
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPhotoFans.ConversationStorage", "[getAllUnreadCount] type=0 selfBiz:" + selfBiz + " count=" + r1);
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Long.valueOf((long) r1))));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403511d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254.Companion.m86041x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f403515h = new com.p314xaae8f345.p2845xc516c4b6.biz.C23191x818c91f8(m137983x3b5b91dc2, null, 2, null);
        ((br1.m) ((zq1.u) i95.n0.c(zq1.u.class))).getClass();
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f501403d;
        ((ox.r) d0Var).Bi(2).d(br1.l.f105154a);
        jr1.i iVar = jr1.i.f382893a;
        iVar.b();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_fans_greet_box_enable, 0) == 1) {
            ((ku5.t0) ku5.t0.f394148d).q(lx.u2.f403500d);
        }
        this.f403512e = iVar.c(5);
        this.f403513f = false;
        d().add(this.f403516i);
        yq1.u0.Ui().add(this.f403517m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "onAttachedToEngine, curBiz=" + this.f403512e);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f403511d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f403511d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254.Companion.m86041x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f403515h = null;
        d().mo49775xc84af884(this.f403516i);
        yq1.u0.Ui().mo49775xc84af884(this.f403517m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "onDetachedFromEngine, curBiz=" + this.f403512e);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254
    /* renamed from: onPrivateMsgSettingChanged */
    public void mo86038x2d02a5e1(java.lang.String bizuin, boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizuin, "bizuin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!c(bizuin)) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("NOT_LOGIN")))));
            return;
        }
        if (z17) {
            yq1.u0.Vi().y0(jr1.j.c(bizuin));
            ((gr1.h) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi()).b(5);
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403511d = binding.mo137508x19263085();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23313xbec57254
    /* renamed from: openPrivateMsgChat */
    public void mo86039x234af860(java.lang.String sessionId, java.lang.String bizuin, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizuin, "bizuin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!c(bizuin)) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("NOT_LOGIN")))));
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sessionId, "photoAccountOfficial")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "OFFICIAL_NOTICE_SESSION_ID not support");
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("OFFICIAL_NOTICE_SESSION_ID NOT_SUPPORT")))));
            return;
        }
        android.content.Context context = this.f403511d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        hr1.e z07 = d().z0(sessionId);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", z07.f66326xbed8694c);
        intent.putExtra("Chat_Self", z07.f66325xea7a0fe2);
        intent.putExtra("finish_direct", true);
        intent.putExtra("img_gallery_enter_from_chatting_ui", true);
        yn.g.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1292x55bb7a46.p1293xac8f1cfd.C12987xa57b7d50.class);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
    }
}
