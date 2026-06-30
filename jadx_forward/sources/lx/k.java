package lx;

/* loaded from: classes10.dex */
public final class k implements com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23110x1840f664, com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23107x64198b8a, com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23117x5c83ed27, com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23114xfaca7e32, com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23099xd9d92063, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f403355d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.biz.C23102xc5e76437 f403356e;

    /* renamed from: f, reason: collision with root package name */
    public r45.lk2 f403357f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10488x93079ccb f403358g;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.feature.brandservice.flutter.model.FinderBizMeTabPlugin$feedDeleteListener$1] */
    public k() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f403358g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.feature.brandservice.flutter.model.FinderBizMeTabPlugin$feedDeleteListener$1
            {
                this.f39173x3fe91575 = -108499199;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 event = c5437xe8b43b11;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new lx.e(event, lx.k.this));
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23099xd9d92063
    /* renamed from: fetchFinderPersonalCenterData */
    public void mo84825xd7d7039f(java.lang.String username, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMeTabPlugin", "fetchFinderPersonalCenterData:".concat(username));
        if (username.length() == 0) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new bw5.bu().mo14344x5f01b1f6())));
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        p3325xe03a0797.p3326xc267989b.l.d(((c61.l7) i95.n0.c(c61.l7.class)).U, null, null, new ya2.l1(new lx.f(this), null), 3, null);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity activity = this.f403355d;
        lx.g gVar = new lx.g(callback);
        lx.h hVar = new lx.h(callback);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8 k8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8.f183861a;
        java.lang.String selfUsername = g92.b.f351302e.U();
        ya2.k1 k1Var = new ya2.k1(gVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUsername, "selfUsername");
        java.lang.String concat = "23-".concat(selfUsername);
        pq5.g l17 = new db2.a4(selfUsername, 23).l();
        if (activity != null) {
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity);
        }
        k8Var.a(l17, concat, k1Var, hVar);
        k8Var.b(concat);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403355d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23110x1840f664.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23110x1840f664.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23110x1840f664.Companion.m84902x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23107x64198b8a.Companion companion2 = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23107x64198b8a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23107x64198b8a.Companion.m84893x97a46f3a(companion2, m137983x3b5b91dc2, this, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23117x5c83ed27.Companion companion3 = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23117x5c83ed27.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc3 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc3, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23117x5c83ed27.Companion.m84917x97a46f3a(companion3, m137983x3b5b91dc3, this, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23099xd9d92063.Companion companion4 = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23099xd9d92063.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc4 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc4, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23099xd9d92063.Companion.m84827x97a46f3a(companion4, m137983x3b5b91dc4, this, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23114xfaca7e32.Companion companion5 = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23114xfaca7e32.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc5 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc5, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23114xfaca7e32.Companion.m84910x97a46f3a(companion5, m137983x3b5b91dc5, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc6 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc6, "getBinaryMessenger(...)");
        this.f403356e = new com.p314xaae8f345.p2845xc516c4b6.biz.C23102xc5e76437(m137983x3b5b91dc6, null, 2, null);
        mo48813x58998cd();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f403355d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f403355d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23110x1840f664.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23110x1840f664.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23110x1840f664.Companion.m84902x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23107x64198b8a.Companion companion2 = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23107x64198b8a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23107x64198b8a.Companion.m84893x97a46f3a(companion2, m137983x3b5b91dc2, null, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23117x5c83ed27.Companion companion3 = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23117x5c83ed27.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc3 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc3, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23117x5c83ed27.Companion.m84917x97a46f3a(companion3, m137983x3b5b91dc3, null, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23099xd9d92063.Companion companion4 = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23099xd9d92063.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc4 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc4, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23099xd9d92063.Companion.m84827x97a46f3a(companion4, m137983x3b5b91dc4, null, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23114xfaca7e32.Companion companion5 = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23114xfaca7e32.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc5 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc5, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23114xfaca7e32.Companion.m84910x97a46f3a(companion5, m137983x3b5b91dc5, null, null, 4, null);
        this.f403356e = null;
        mo48814x2efc64();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403355d = binding.mo137508x19263085();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0138, code lost:
    
        if (r11 != null) goto L56;
     */
    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23107x64198b8a
    /* renamed from: openFinderProfileDetail */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo84891x6ce6a2a(java.lang.String r25, yz5.l r26) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.k.mo84891x6ce6a2a(java.lang.String, yz5.l):void");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23114xfaca7e32
    /* renamed from: openFinderRedDot */
    public void mo84908xe1bdca28(java.lang.String tipsUuid) {
        r45.xs2 xs2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsUuid, "tipsUuid");
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb B0 = zy2.fa.B0(((c61.l7) ((zy2.b6) c17)).nk(), "FinderPhotoCardEntry", tipsUuid, false, false, 12, null);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = (B0 == null || (xs2Var = B0.N) == null) ? null : xs2Var.m75934xbce7f2f(11);
        i95.m c18 = i95.n0.c(zy2.ca.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.ca caVar = (zy2.ca) c18;
        lx.i iVar = lx.i.f403324d;
        if (m75934xbce7f2f == null) {
            com.p314xaae8f345.p2845xc516c4b6.biz.C23102xc5e76437 c23102xc5e76437 = this.f403356e;
            if (c23102xc5e76437 != null) {
                c23102xc5e76437.m84834xc4e06dab(iVar);
            }
            ((c61.t8) caVar).Ai(null, "FinderPhotoCardEntry");
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((c61.t8) caVar).Bi(context, m75934xbce7f2f, "FinderPhotoCardEntry", null);
        com.p314xaae8f345.p2845xc516c4b6.biz.C23102xc5e76437 c23102xc5e764372 = this.f403356e;
        if (c23102xc5e764372 != null) {
            c23102xc5e764372.m84834xc4e06dab(iVar);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23117x5c83ed27
    /* renamed from: openVideoDetail */
    public void mo84915xb65a2002(java.lang.String feedId, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMeTabPlugin", "openFinderProfileDetail:".concat(feedId));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = this.f403355d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        long Z = pm0.v.Z(feedId);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        intent.putExtra("feed_encrypted_object_id", Z);
        intent.putExtra("finder_username", g92.b.f351302e.U());
        intent.putExtra("KEY_FINDER_SELF_FLAG", true);
        intent.putExtra("key_from_biz_photo", true);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, 55, 8), intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "enterProfileTimelineFromBizPhoto ".concat(pm0.v.u(Z)));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).lk(context, intent);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23110x1840f664
    /* renamed from: publishFinderLive */
    public void mo84899x7299cca1(java.lang.String username) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMeTabPlugin", "publishFinderLive");
        android.app.Activity activity = this.f403355d;
        if (activity != null) {
            i95.m c17 = i95.n0.c(s40.w0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) c17)).dk(activity, new lx.j(this), false);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMeTabPlugin", "activity null");
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23110x1840f664
    /* renamed from: publishFinderVideo */
    public void mo84900xe12c6f66(java.lang.String username, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMeTabPlugin", "publishFinderVideo ".concat(username));
        android.app.Activity activity = this.f403355d;
        r45.lk2 lk2Var = this.f403357f;
        if (activity == null || lk2Var == null) {
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f542005a.H(activity, username, lk2Var);
    }
}
