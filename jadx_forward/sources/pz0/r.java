package pz0;

/* loaded from: classes10.dex */
public final class r implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.InterfaceC24522x942cb70a, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public final uy0.f f440693d;

    /* renamed from: e, reason: collision with root package name */
    public final ez0.i f440694e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f440695f;

    /* renamed from: g, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener f440696g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534.C11017xf7264b1c f440697h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f440698i;

    public r(uy0.f finderApi, ez0.i plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderApi, "finderApi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f440693d = finderApi;
        this.f440694e = plugin;
        this.f440698i = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.InterfaceC24522x942cb70a
    /* renamed from: getMaasVersion */
    public long mo90925x1f4d2bfc() {
        return 2008004L;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.InterfaceC24522x942cb70a
    /* renamed from: getResourceList */
    public void mo90926x4a05c442(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "getResourceList");
        p3325xe03a0797.p3326xc267989b.l.d(this.f440698i, null, null, new pz0.n(callback, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.InterfaceC24522x942cb70a
    /* renamed from: getWeVisionVersion */
    public long mo90927x8738956c() {
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        return tq5.i.f502802a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.InterfaceC24522x942cb70a
    /* renamed from: launchAlbum */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo90928xf09ec27c(com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24520xeb621540 r12, yz5.l r13) {
        /*
            r11 = this;
            java.lang.String r0 = "request"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.String r0 = "callback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            android.app.Activity r0 = r11.f440695f
            java.lang.String r1 = "MicroMsg.MJTemplateApiFlutterPlugin"
            if (r0 != 0) goto L2e
            java.lang.String r12 = "activity is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r12)
            kotlin.Result$Companion r12 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Throwable r12 = new java.lang.Throwable
            java.lang.String r0 = "activity not attached"
            r12.<init>(r0)
            java.lang.Object r12 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r12)
            java.lang.Object r12 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r12)
            kotlin.Result r12 = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(r12)
            r13.mo146xb9724478(r12)
            return
        L2e:
            r45.rz6 r2 = new r45.rz6
            r2.<init>()
            byte[] r3 = r12.m90917x12f2b736()     // Catch: java.lang.Exception -> L3b
            r2.mo11468x92b714fd(r3)     // Catch: java.lang.Exception -> L3b
            goto L45
        L3b:
            r3 = move-exception
            java.lang.String r4 = "parse template info error"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r4, r3)
        L45:
            az0.i5 r5 = az0.i5.f97090a
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 7
            r10 = 0
            az0.i5.s(r5, r6, r7, r8, r9, r10)
            nz0.o r1 = nz0.o.f423063a
            java.lang.String r3 = r2.f466853d
            java.lang.String r4 = ""
            if (r3 != 0) goto L58
            r3 = r4
        L58:
            r5 = 2
            r1.e(r3, r5)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            com.tencent.mm.mj_template.api.MJTemplateSession r3 = new com.tencent.mm.mj_template.api.MJTemplateSession
            byte[] r12 = r12.m90917x12f2b736()
            r3.<init>(r12, r4)
            java.lang.String r12 = "mj_template_session"
            r1.putExtra(r12, r3)
            r45.b70 r12 = r2.f466856g
            r3 = 0
            if (r12 == 0) goto L77
            java.lang.String r12 = r12.f452117f
            goto L78
        L77:
            r12 = r3
        L78:
            java.lang.String r4 = "album_footer_info_str"
            r1.putExtra(r4, r12)
            r45.e7 r12 = r2.f466858i
            r4 = 0
            r5 = 1
            if (r12 == 0) goto L9c
            int r12 = r12.f454594e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            int r6 = r12.intValue()
            if (r6 <= 0) goto L91
            r6 = r5
            goto L92
        L91:
            r6 = r4
        L92:
            if (r6 == 0) goto L95
            r3 = r12
        L95:
            if (r3 == 0) goto L9c
            int r12 = r3.intValue()
            goto L9e
        L9c:
            r12 = 20
        L9e:
            java.lang.String r3 = "max_select_count"
            r1.putExtra(r3, r12)
            r45.e7 r12 = r2.f466858i
            if (r12 == 0) goto La9
            int r4 = r12.f454593d
        La9:
            java.lang.String r12 = "min_select_count"
            r1.putExtra(r12, r4)
            uy0.f r12 = r11.f440693d
            r12.a(r0, r5, r1)
            pz0.o r12 = new pz0.o
            r12.<init>(r13, r11)
            r11.f440696g = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pz0.r.mo90928xf09ec27c(com.tencent.pigeon.mj_template.AlbumRequest, yz5.l):void");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 p07) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "onAttachedToActivity");
        this.f440695f = p07.mo137508x19263085();
        p07.mo137502xbf77c2e1(new pz0.p(this));
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        android.app.Activity activity = this.f440695f;
        android.content.Intent intent2 = activity != null ? activity.getIntent() : null;
        if (intent2 == null) {
            intent2 = new android.content.Intent();
        }
        com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534.C11017xf7264b1c c11017xf7264b1c = new com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534.C11017xf7264b1c(Ri, 134, "square_feed_template", intent2);
        android.app.Activity activity2 = this.f440695f;
        long j17 = 0;
        if (activity2 != null && (intent = activity2.getIntent()) != null) {
            j17 = intent.getLongExtra("key_topic_id", 0L);
        }
        c11017xf7264b1c.a("activityid", j17);
        this.f440697h = c11017xf7264b1c;
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f440695f;
        p012xc85e97e9.p093xedfae76a.y yVar = componentCallbacks2 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) componentCallbacks2 : null;
        if (yVar == null || (mo273xed6858b4 = yVar.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(c11017xf7264b1c);
        mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$onAttachedToActivity$2$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroy */
            public final void m47544xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                az0.i5.x(az0.i5.f97090a, false, false, 3, null);
            }
        });
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.InterfaceC24522x942cb70a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.InterfaceC24522x942cb70a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.InterfaceC24522x942cb70a.Companion.m90933x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "onDetachedFromActivity");
        this.f440695f = null;
        this.f440697h = null;
        ez0.i iVar = this.f440694e;
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginMJTemplate", "enter destroyEngine");
        iVar.f339339d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "onDetachedFromEngine");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.InterfaceC24522x942cb70a
    /* renamed from: reportTemplateListItemClicked */
    public void mo90929xa9f0ba68(java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(templateId, "empty_id")) {
            com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534.C11017xf7264b1c c11017xf7264b1c = this.f440697h;
            if (c11017xf7264b1c != null) {
                c11017xf7264b1c.d(templateId, "no_template1");
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534.C11017xf7264b1c c11017xf7264b1c2 = this.f440697h;
        if (c11017xf7264b1c2 != null) {
            c11017xf7264b1c2.d(templateId, c11017xf7264b1c2.f151340f);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.InterfaceC24522x942cb70a
    /* renamed from: reportTemplateListItemExposed */
    public void mo90930x289f8f61(java.lang.String templateId) {
        com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534.C11017xf7264b1c c11017xf7264b1c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(templateId, "empty_id") || (c11017xf7264b1c = this.f440697h) == null) {
            return;
        }
        c11017xf7264b1c.c(templateId, false, c11017xf7264b1c.f151340f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.InterfaceC24522x942cb70a
    /* renamed from: requestMusicPost */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo90931xc718fe96(com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24533xf2d7228a r10, yz5.l r11) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pz0.r.mo90931xc718fe96(com.tencent.pigeon.mj_template.MusicPostRequest, yz5.l):void");
    }
}
