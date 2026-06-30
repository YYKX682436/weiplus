package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes12.dex */
public class b0 extends i95.w implements com.tencent.mm.feature.emoji.api.s5, com.tencent.mm.feature.emoji.api.o5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.z4 f66169d;

    /* renamed from: e, reason: collision with root package name */
    public y12.h f66170e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.r f66171f;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.autogen.events.SucceedUploadEmotionEvent f66175m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.feature.emoji.api.q5 f66176n;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f66172g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f66173h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f66174i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final bm5.p1 f66177o = new com.tencent.mm.feature.emoji.c0(this);

    /* renamed from: p, reason: collision with root package name */
    public final bm5.p1 f66178p = new com.tencent.mm.feature.emoji.d0(this);

    public com.tencent.mm.plugin.emoji.sync.b Ai() {
        gm0.j1.b().c();
        com.tencent.mm.plugin.emoji.sync.b bVar = (com.tencent.mm.plugin.emoji.sync.b) this.f66178p.b();
        com.tencent.mm.plugin.emoji.sync.k kVar = bVar.f97616a;
        boolean[] zArr = kVar.f97641l;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!kVar.f97641l[0]) {
                    kVar.f97643n.alive();
                    kVar.f97644o.alive();
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                    intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
                    com.tencent.mm.plugin.emoji.sync.j jVar = new com.tencent.mm.plugin.emoji.sync.j(kVar);
                    kVar.f97639j = jVar;
                    com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(jVar, intentFilter);
                    kVar.f97641l[0] = true;
                }
            }
        }
        return bVar;
    }

    public com.tencent.mm.storage.z4 Bi() {
        if (this.f66169d == null) {
            this.f66169d = com.tencent.mm.storage.z4.f196391j;
        }
        return this.f66169d;
    }

    public n11.a Di() {
        gm0.j1.b().c();
        return (n11.a) this.f66177o.b();
    }

    public y12.h Ni() {
        gm0.j1.b().c();
        if (this.f66170e == null) {
            this.f66170e = new y12.h();
        }
        return this.f66170e;
    }

    public com.tencent.mm.plugin.emoji.model.r Ri() {
        gm0.j1.b().c();
        if (this.f66171f == null) {
            this.f66171f = new com.tencent.mm.plugin.emoji.model.r();
        }
        return this.f66171f;
    }

    public void Ui(int i17, int i18) {
        int i19;
        java.util.List list = this.f66174i;
        if (((java.util.LinkedList) list).size() < 1) {
            this.f66173h = false;
            return;
        }
        com.tencent.mm.feature.emoji.g0 g0Var = (com.tencent.mm.feature.emoji.g0) ((java.util.LinkedList) list).remove(0);
        if (i17 == 0 && i18 == 0) {
            i19 = 2;
        } else {
            jx3.f.INSTANCE.idkeyStat(111L, 35L, 1L, true);
            i19 = 5;
        }
        java.lang.String str = g0Var.f66272b;
        long j17 = g0Var.f66271a;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        if (Li.getMsgId() > 0) {
            Li.r1(i19);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, Li, true);
        }
        if (((java.util.LinkedList) list).size() > 0) {
            g0Var = (com.tencent.mm.feature.emoji.g0) ((java.util.LinkedList) list).get(0);
            if (pt0.f0.Li(g0Var.f66272b, g0Var.f66271a).getMsgId() > 0) {
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = g0Var.f66273c;
                gm0.j1.n().f273288b.g(new z12.y(g0Var.f66274d, g0Var.f66272b, g0Var.f66273c, g0Var.f66271a, 0, emojiInfo != null ? emojiInfo.K2.ordinal() : 0));
            } else {
                Ui(-1, -1);
            }
        } else {
            this.f66173h = false;
        }
        if (this.f66175m == null) {
            this.f66175m = new com.tencent.mm.autogen.events.SucceedUploadEmotionEvent();
        }
        com.tencent.mm.autogen.events.SucceedUploadEmotionEvent succeedUploadEmotionEvent = this.f66175m;
        succeedUploadEmotionEvent.f54873g.f6616a = g0Var.f66273c.field_groupId;
        succeedUploadEmotionEvent.e();
    }

    public void Vi(int i17) {
        z85.b bVar;
        com.tencent.mm.storage.e5 a17 = com.tencent.mm.storage.d5.f193836a.a(i17);
        if (a17.a()) {
            java.util.Iterator it = a17.f193858b.iterator();
            while (it.hasNext()) {
                ((z85.a) it.next()).field_syncTime = 0;
            }
            com.tencent.mm.storage.n5 f17 = com.tencent.mm.storage.n5.f();
            synchronized (f17.f195163a) {
                bVar = f17.f195177o;
            }
            bVar.y0(a17);
            new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent().e();
        }
    }

    public boolean Zi(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.storage.g5 g5Var;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo;
        if (emojiInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiMsgInfo", "parserEmojiInfo failed. emojiinfo is null.");
            g5Var = null;
        } else {
            g5Var = new com.tencent.mm.storage.g5();
            g5Var.f193954d = emojiInfo.field_md5;
            g5Var.f193955e = emojiInfo.field_type;
            g5Var.f193956f = emojiInfo.field_size;
            g5Var.f193957g = emojiInfo.field_groupId;
            g5Var.f193962l = emojiInfo.field_designerID;
            g5Var.f193963m = emojiInfo.field_thumbUrl;
            g5Var.f193964n = emojiInfo.field_encrypturl;
            g5Var.f193965o = emojiInfo.field_aeskey;
            g5Var.f193972v = emojiInfo.field_width;
            g5Var.f193973w = emojiInfo.field_height;
            g5Var.f193961k = emojiInfo.field_cdnUrl;
            g5Var.f193966p = emojiInfo.field_externUrl;
            g5Var.f193967q = emojiInfo.field_externMd5;
            g5Var.f193976z = emojiInfo.field_activityid;
            g5Var.f193974x = emojiInfo.field_tpurl;
            g5Var.f193975y = emojiInfo.field_tpauthkey;
            g5Var.B = emojiInfo.field_attachedText;
            g5Var.C = emojiInfo.field_lensId;
            g5Var.D = emojiInfo.field_attachTextColor;
            g5Var.A = emojiInfo.field_linkId;
            g5Var.F = emojiInfo.field_storeUnique;
        }
        if (g5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "prepareEmoji failed. emoji msg info is null.");
            return true;
        }
        g5Var.f193951a = emojiInfo == null ? "" : emojiInfo.D2;
        g5Var.f193968r = false;
        wi(g5Var, null, true);
        return true;
    }

    public final void aj(com.tencent.mm.storage.g5 g5Var) {
        if (g5Var == null) {
            return;
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(g5Var.f193951a, "update", null, 0));
    }

    public void bj(int i17, int i18, int i19, java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.EmotionPageStruct emotionPageStruct = new com.tencent.mm.autogen.mmdata.rpt.EmotionPageStruct();
        emotionPageStruct.f56084d = i18;
        emotionPageStruct.f56086f = i17;
        emotionPageStruct.f56087g = i19;
        emotionPageStruct.f56095o = emotionPageStruct.b("FinderUserName", str, true);
        emotionPageStruct.k();
    }

    public void cj(com.tencent.mm.feature.emoji.api.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "setEmojiDownloadCallback %s", q5Var);
        this.f66176n = q5Var;
    }

    public void fj(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (pt0.f0.f358209b1.e() || f9Var == null) {
            return;
        }
        f9Var.i1(str);
    }

    public void hj(android.content.Context context, java.lang.String str, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().y(str) == null) {
            if (iEmojiInfo == null || !com.tencent.mm.sdk.platformtools.t8.D0(str, iEmojiInfo.getMd5())) {
                return;
            }
            java.lang.String p17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(n22.m.g(), iEmojiInfo.getGroupId(), iEmojiInfo.getMd5());
            if (!com.tencent.mm.vfs.w6.j(p17)) {
                return;
            }
            int i17 = com.tencent.mm.sdk.platformtools.y1.c(p17) ? 2 : 1;
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo(iEmojiInfo);
            emojiInfo.field_catalog = 65;
            emojiInfo.field_type = i17;
            emojiInfo.field_size = (int) com.tencent.mm.vfs.w6.k(p17);
            emojiInfo.field_temp = 1;
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().c().J0(emojiInfo);
        }
        lb5.a aVar = new lb5.a();
        aVar.n(str);
        if (iEmojiInfo != null && iEmojiInfo.c0() != qk.z6.SEND_FROM_SCENE_DEFAULT) {
            aVar.p(iEmojiInfo.c0().ordinal());
        }
        n13.r rVar = new n13.r();
        rVar.f334117a = true;
        rVar.f334120d.f334139a = 5;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(context, aVar, rVar);
    }

    public void ij(android.content.Context context, r45.ri0 ri0Var, java.lang.String str, int i17, java.lang.String sdkRequestID) {
        j22.a.e(ri0Var, 0, i17, 0L, i17);
        n22.f fVar = n22.f.f334290a;
        com.tencent.mm.storage.emotion.EmojiInfo i18 = n22.m.i(ri0Var);
        com.tencent.mm.feature.emoji.b0$$c b0__c = new com.tencent.mm.feature.emoji.b0$$c();
        com.tencent.mm.feature.emoji.b0$$c b0__c2 = new com.tencent.mm.feature.emoji.b0$$c();
        long j17 = ri0Var.f384902w;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(sdkRequestID, "sdkRequestID");
        n22.f.d(fVar, context, i18, false, b0__c, b0__c2, "", i17, 0L, i17, 0, j17, str, null, sdkRequestID, null, 16384, null);
    }

    public void mj(java.lang.String str, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, r15.b bVar, int i17) {
        long j17;
        long j18;
        java.lang.String e17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || emojiInfo == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (f9Var == null) {
            com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
            f9Var2.setType(47);
            f9Var2.u1(str);
            f9Var2.j1(1);
            if (bVar != null) {
                e17 = com.tencent.mm.storage.y4.e(c01.z1.r(), currentTimeMillis, (emojiInfo.k() || emojiInfo.B1()) ? false : true, emojiInfo.getMd5(), false, bVar.toXml(false, "msg"));
            } else {
                e17 = com.tencent.mm.storage.y4.e(c01.z1.r(), currentTimeMillis, (emojiInfo.k() || emojiInfo.B1()) ? false : true, emojiInfo.getMd5(), false, "");
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(bVar == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "insert emoji msg, extCommonInfo null? :%b", objArr);
            f9Var2.d1(e17);
            fj(f9Var2, emojiInfo.getMd5());
            f9Var2.e1(c01.w9.o(f9Var2.Q0()));
            if (msgIdTalker.f149480d > 0) {
                f9Var2.f193934n2 = dh3.c.f232489a.g(msgIdTalker, str);
            }
            j18 = currentTimeMillis;
            j17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
        } else {
            long msgId = f9Var.getMsgId();
            long j19 = new com.tencent.mm.storage.y4(f9Var.j()).f196354b;
            if (j19 == 0) {
                return;
            }
            j17 = msgId;
            j18 = j19;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "NetSceneUploadEmoji: msgId = %s, md5 %s, len %s", java.lang.Long.valueOf(j17), emojiInfo.getMd5(), java.lang.Integer.valueOf(emojiInfo.field_size));
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f66174i;
        linkedList.add(new com.tencent.mm.feature.emoji.g0(this, j17, str, emojiInfo, "" + j18));
        if (msgIdTalker.f149480d > 0) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
            long longValue = valueOf.longValue();
            am.xz xzVar = updateForwardMsgIdEvent.f54918g;
            xzVar.f8409a = longValue;
            xzVar.f8410b = 0;
            xzVar.f8411c = str;
            updateForwardMsgIdEvent.e();
        }
        if (!this.f66173h || linkedList.size() == 1) {
            this.f66173h = true;
            gm0.j1.n().f273288b.g(new z12.y(j18 + "", str, emojiInfo, j17, 0, i17));
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "[onAccountInitialized]");
        if (com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.mm.storage.h5.f195006d.Ai()) {
            com.tencent.mm.smiley.c0.f193225a.d(false);
        }
        i95.n0.c(e70.q.class);
        new com.tencent.mm.feature.emoji.b();
        com.tencent.wechat.aff.emoticon.x.f216682b = new com.tencent.mm.feature.emoji.b0$$d();
        new com.tencent.mm.feature.emoji.q2();
        com.tencent.wechat.aff.emoticon.c.f216635a = new com.tencent.mm.feature.emoji.b0$$e();
        new com.tencent.mm.feature.emoji.d();
        com.tencent.wechat.aff.emoticon.x.f216681a = new com.tencent.mm.feature.emoji.b0$$f();
        new com.tencent.mm.feature.emoji.s2();
        com.tencent.wechat.aff.emoticon.c.f216636b = new com.tencent.mm.feature.emoji.b0$$g();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "onAccountRelease: ");
        com.tencent.mm.storage.n5 f17 = com.tencent.mm.storage.n5.f();
        synchronized (f17.f195163a) {
            gr.t tVar = f17.f195180r;
            java.util.ArrayList arrayList = tVar.f274688g;
            if (arrayList != null) {
                arrayList.clear();
            }
            java.util.ArrayList arrayList2 = tVar.f274689h;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            tVar.f274691j.d(-1);
            f17.c().remove(f17.f195182t);
            f17.a().remove(f17.f195181s);
            f17.f195163a[0] = false;
        }
        Bi().b();
        ((java.util.LinkedList) this.f66174i).clear();
        this.f66172g.clear();
        if (this.f66178p.c()) {
            com.tencent.mm.plugin.emoji.sync.k kVar = ((com.tencent.mm.plugin.emoji.sync.b) this.f66178p.b()).f97616a;
            boolean[] zArr = kVar.f97641l;
            if (zArr[0]) {
                synchronized (zArr) {
                    if (kVar.f97641l[0]) {
                        kVar.e();
                        kVar.f97643n.dead();
                        kVar.f97644o.dead();
                        com.tencent.mm.plugin.emoji.sync.j jVar = kVar.f97639j;
                        if (jVar != null) {
                            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(jVar);
                            kVar.f97639j = null;
                        }
                        kVar.f97641l[0] = false;
                    }
                }
            }
        }
        com.tencent.mm.plugin.emoji.model.b0.f97540a.clear();
        this.f66176n = null;
        if (this.f66177o.c()) {
            ((n11.a) this.f66177o.b()).c();
        }
        pr.z zVar = pr.k0.f357723q;
        zVar.b(true).destroy();
        zVar.a(true).destroy();
        if (com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.mm.storage.h5.f195006d.Ai()) {
            com.tencent.mm.smiley.c0.f193225a.e(new com.tencent.mm.feature.emoji.b0$$c());
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
    }

    public void wi(com.tencent.mm.storage.g5 g5Var, com.tencent.mm.modelbase.p0 p0Var, boolean z17) {
        com.tencent.mm.storage.f9 o27;
        r45.j4 j4Var;
        if (g5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiFeatureService", "downloadEmoji msginfo is null.");
            return;
        }
        if (p0Var != null && (j4Var = p0Var.f70726a) != null && j4Var.f377568r == g5Var.f193958h) {
            g5Var.f193969s = c01.w9.q(p0Var);
            g5Var.f193970t = p0Var.f70726a.f377569s;
            g5Var.f193971u = r4.f377565o;
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(g5Var.f193954d);
        if (u17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "downloadEmoji: db emoji info not null %s msgInfomd5 %s svrId %s", u17.field_md5, g5Var.f193954d, java.lang.Long.valueOf(g5Var.f193958h));
            n22.m.b(g5Var, u17);
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().c().G2(u17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "downloadEmoji: create emoji info %s", g5Var.f193954d);
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "createEmojiInfo: %s", g5Var.f193954d);
            u17 = new com.tencent.mm.storage.emotion.EmojiInfo();
            n22.m.b(g5Var, u17);
            u17.field_temp = 1;
            u17.field_state = 8;
            u17.field_catalog = 65;
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().c().J0(u17);
        }
        if (g5Var.f193968r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "insertEmojiMsg: %s, %s msgSvrId: %s", g5Var.f193954d, u17.field_md5, java.lang.Long.valueOf(g5Var.f193958h));
            if (g5Var.f193958h == 0 || (o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g5Var.f193951a, g5Var.f193958h)) == null || o27.I0() != g5Var.f193958h) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g5Var.f193951a, true);
                if (n17 == null || ((int) n17.E2) == 0) {
                    com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3(g5Var.f193951a);
                    z3Var.setType(2);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(z3Var);
                }
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.setType(47);
                f9Var.u1(g5Var.f193951a);
                f9Var.j1(c01.z1.J(g5Var.f193952b) ? 1 : 0);
                ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).fj(f9Var, u17.getMd5());
                f9Var.o1(g5Var.f193958h);
                f9Var.d1(com.tencent.mm.storage.y4.e(g5Var.f193952b, 0L, (u17.k() || u17.B1()) ? false : true, u17.getMd5(), false, g5Var.f193959i));
                f9Var.e1(c01.w9.m(f9Var.Q0(), g5Var.f193971u));
                f9Var.r1(3);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(g5Var.f193960j)) {
                    f9Var.u3(g5Var.f193960j);
                }
                if (p0Var == null) {
                    int i17 = g5Var.f193969s;
                    if (i17 != 0) {
                        f9Var.f1(i17);
                        if (f9Var.getMsgId() == 0 && f9Var.A0() == 0 && (i17 & 2) != 0) {
                            f9Var.e1(g5Var.f193971u);
                        }
                    }
                    int i18 = g5Var.f193970t;
                    if (i18 != 0) {
                        f9Var.n1(i18);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "summerbadcr insertEmojiMsg addMsgInfo is null but flag[%d], msgSeq[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(g5Var.f193970t));
                } else {
                    c01.w9.n(f9Var, p0Var);
                }
                java.util.HashMap hashMap = this.f66172g;
                if (hashMap != null && hashMap.containsKey(java.lang.Long.valueOf(f9Var.I0()))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "this msg had been revoke.");
                    f9Var.d1((java.lang.String) this.f66172g.get(java.lang.Long.valueOf(f9Var.I0())));
                    f9Var.setType(10000);
                    this.f66172g.remove(java.lang.Long.valueOf(f9Var.I0()));
                }
                long x17 = c01.w9.x(f9Var);
                boolean a17 = p0Var != null ? c01.g.a(p0Var.f70726a) : false;
                if (!c01.z1.J(g5Var.f193952b) && !a17) {
                    com.tencent.mm.storage.f9 Li = pt0.f0.Li(f9Var.Q0(), x17);
                    ((c01.v8) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).a(Li);
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.emoji.e0(this, Li));
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "start download emoji %s, fileExist %b, download %b", u17.getMd5(), java.lang.Boolean.valueOf(u17.E0()), java.lang.Boolean.valueOf(z17));
        if (u17.E0()) {
            return;
        }
        if (z17) {
            zq.h.f474972a.f(u17, true, new com.tencent.mm.feature.emoji.f0(this, g5Var, u17));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "cdnurl and cncrypt url is null. autodownload %b", java.lang.Boolean.valueOf(z17));
            aj(g5Var);
        }
    }
}
