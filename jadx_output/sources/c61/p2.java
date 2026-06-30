package c61;

@j95.b
/* loaded from: classes10.dex */
public final class p2 extends i95.w implements c61.yb, c50.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f39214d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f39215e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f39216f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f39217g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f39218h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f39219i;

    public p2() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f39214d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent>(a0Var) { // from class: com.tencent.mm.plugin.FinderCommonBaseFeatureService$destroyPreloadedWebViewListener$1
            {
                this.__eventId = 303899871;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent) {
                com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent event = destroyPreloadedWebViewEvent;
                kotlin.jvm.internal.o.g(event, "event");
                long j17 = event.f54089g.f6217a;
                com.tencent.mm.plugin.finder.webview.q qVar = com.tencent.mm.plugin.finder.webview.q.f136914a;
                synchronized (com.tencent.mm.plugin.finder.webview.q.class) {
                    if (com.tencent.mm.plugin.finder.webview.q.f136915b != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BoxWebViewPreloadManager", "MultiWebView-Trace destroy 1 webView for FinderWebView");
                        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView = com.tencent.mm.plugin.finder.webview.q.f136915b;
                        if (boxWebView != null) {
                            boxWebView.destroy();
                        }
                        com.tencent.mm.plugin.finder.webview.q.f136915b = null;
                    }
                }
                return false;
            }
        };
        this.f39215e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent>(a0Var) { // from class: com.tencent.mm.plugin.FinderCommonBaseFeatureService$openSpecificViewEvent$1
            {
                this.__eventId = 2142564152;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent jSApiOpenSpecificViewEvent) {
                com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent event = jSApiOpenSpecificViewEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.sh shVar = event.f54443g;
                boolean p17 = r26.i0.p(shVar.f7899b, "channel/contact_setting", true);
                am.th thVar = event.f54444h;
                if (!p17) {
                    if (!r26.i0.p(shVar.f7899b, "channel/black_list", true)) {
                        return false;
                    }
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(context))) {
                        thVar.f8011b = true;
                    } else {
                        android.content.Intent intent = new android.content.Intent();
                        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.finder.ui.FinderBlackListUI.class);
                        thVar.f8010a = intent;
                    }
                    thVar.f8012c = true;
                    return true;
                }
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                if (com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(context2))) {
                    thVar.f8011b = true;
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_from_comment_scene", 39);
                    intent2.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    ya2.e1 e1Var = ya2.e1.f460472a;
                    android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context3, "getContext(...)");
                    e1Var.x(context3, intent2, 20, 2);
                }
                thVar.f8012c = true;
                return true;
            }
        };
        this.f39216f = new java.util.HashMap();
        this.f39217g = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f39218h = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f39219i = java.util.Collections.synchronizedSet(new java.util.HashSet());
    }

    public az2.j Ai(long j17, java.lang.String str, int i17, int i18, java.lang.String feedUsername, boolean z17, com.tencent.mm.protobuf.g gVar, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, long j18, java.lang.String username, boolean z18, boolean z19, java.lang.String encryptedObjectId, r45.qt2 qt2Var, int i19, java.lang.String udfKv) {
        kotlin.jvm.internal.o.g(feedUsername, "feedUsername");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(encryptedObjectId, "encryptedObjectId");
        kotlin.jvm.internal.o.g(udfKv, "udfKv");
        return new db2.g4(j17, str, i17, i18, feedUsername, z17, gVar, yj0Var, j18, username, z18, z19, encryptedObjectId, qt2Var, i19, null, false, null, null, udfKv, null, null, 0, 0, null, null, false, null, null, 402096128, null);
    }

    public void Aj(java.lang.Object drawer, com.tencent.mm.plugin.finder.storage.FinderItem feedObj) {
        kotlin.jvm.internal.o.g(drawer, "drawer");
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = drawer instanceof com.tencent.mm.plugin.finder.view.FinderLikeDrawer ? (com.tencent.mm.plugin.finder.view.FinderLikeDrawer) drawer : null;
        if (finderLikeDrawer != null) {
            finderLikeDrawer.u();
            int c17 = com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i17 = b17.x;
            int i18 = b17.y;
            java.lang.System.nanoTime();
            boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!z17) {
                if (i18 >= i17) {
                    i17 = i18;
                }
                i18 = i17;
            }
            int i19 = ((int) (i18 * 0.75d)) - c17;
            int h17 = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479703an3) - c17;
            int size = (feedObj.getFinderObject().getLikeList().size() * i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479727dj)) + i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479731dn) + c17 + i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479731dn);
            if (size >= h17) {
                h17 = size;
            }
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer.w(finderLikeDrawer, null, feedObj, null, h17 > i19 ? i19 : h17, null, null, 48, null);
        }
    }

    public void Bi(android.content.Context context, r45.ac4 jumpInfoWrapper, l81.b1 b1Var, in5.s0 s0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfoWrapper, "jumpInfoWrapper");
        xc2.y2 y2Var = xc2.y2.f453343a;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) jumpInfoWrapper.getCustom(1);
        if (finderJumpInfo == null) {
            finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        }
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        p0Var.f453251m = b1Var;
        p0Var.M = jumpInfoWrapper.getBoolean(2);
        p0Var.N = jumpInfoWrapper.getBoolean(3);
        p0Var.f453252n = jumpInfoWrapper.getInteger(4) != 1 ? 0 : 1;
        p0Var.O = jumpInfoWrapper.getBoolean(5);
        p0Var.P = jumpInfoWrapper.getBoolean(6);
        p0Var.Q = jumpInfoWrapper.getBoolean(7);
        y2Var.h(context, p0Var, jumpInfoWrapper.getInteger(0), s0Var);
    }

    public java.lang.String Bj(java.lang.String xml, java.util.LinkedList keyInfoList, java.util.ArrayList parseInfoList) {
        kotlin.jvm.internal.o.g(xml, "xml");
        kotlin.jvm.internal.o.g(keyInfoList, "keyInfoList");
        kotlin.jvm.internal.o.g(parseInfoList, "parseInfoList");
        if (xml.length() == 0) {
            return null;
        }
        com.tencent.mm.plugin.finder.assist.u1 u1Var = new com.tencent.mm.plugin.finder.assist.u1();
        java.lang.String xml2 = "<finderComment>" + xml + "</finderComment>";
        kotlin.jvm.internal.o.g(xml2, "xml");
        java.lang.ThreadLocal threadLocal = com.tencent.mm.plugin.finder.assist.u1.f102589b;
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) threadLocal.get();
        if (xmlPullParser == null) {
            xmlPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
            kotlin.jvm.internal.o.f(xmlPullParser, "newPullParser(...)");
            threadLocal.set(xmlPullParser);
        }
        xmlPullParser.setInput(new java.io.StringReader(xml2));
        int eventType = xmlPullParser.getEventType();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (eventType != 1) {
            try {
                eventType = xmlPullParser.next();
                if (eventType == 2) {
                    u1Var.b(xmlPullParser, sb6);
                } else if (eventType == 3) {
                    u1Var.a(xmlPullParser, sb6, parseInfoList);
                } else if (eventType == 4) {
                    u1Var.c(xmlPullParser, sb6, keyInfoList);
                }
            } catch (java.lang.Exception e17) {
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.f(sb7, "toString(...)");
                java.lang.String message = e17.getMessage();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("FinderCommentSearchParser", "parse comment xml failed currentParsed %s msg %s stack %s ", sb7, message, com.tencent.mm.sdk.platformtools.z3.c(e17));
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                return null;
            }
        }
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        return sb8;
    }

    public final android.text.SpannableString Cj(java.lang.String str, android.text.SpannableString spannableString, java.util.List list, yz5.p pVar, long j17, java.lang.String str2, yz5.l lVar) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return spannableString;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) hc2.x0.i(spannableString.toString(), new java.util.HashMap(), true, null).f302834e;
        java.util.List<com.tencent.mm.plugin.finder.assist.m9> h17 = hc2.x0.h(spannableString.toString(), arrayList, null);
        for (com.tencent.mm.plugin.finder.assist.m9 m9Var : h17) {
            int i17 = m9Var.f102388a - 1;
            if (i17 < 0) {
                i17 = 0;
            }
            list.add(new com.tencent.mm.plugin.finder.assist.m9(i17, m9Var.f102389b + 1, "#" + m9Var.f102390c));
        }
        com.tencent.mars.xlog.Log.i("FinderCommonService", "parseDefaultDesc: atSize=" + arrayList.size() + ", topicSize=" + ((java.util.ArrayList) h17).size() + ", defaultDesc=" + ((java.lang.Object) spannableString));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String spannableString2 = spannableString.toString();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString valueOf = android.text.SpannableString.valueOf(new android.text.SpannableStringBuilder(com.tencent.mm.pluginsdk.ui.span.c0.i(context, spannableString2)));
        kotlin.jvm.internal.o.d(valueOf);
        pj(j17, str2, valueOf, list, pVar);
        nj(valueOf, arrayList, lVar);
        return valueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Di(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof c61.d2
            if (r0 == 0) goto L13
            r0 = r8
            c61.d2 r0 = (c61.d2) r0
            int r1 = r0.f38931f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38931f = r1
            goto L18
        L13:
            c61.d2 r0 = new c61.d2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f38929d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f38931f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            kotlin.ResultKt.throwOnFailure(r8)
            goto L41
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            kotlin.ResultKt.throwOnFailure(r8)
            bq.j0 r8 = new bq.j0
            r8.<init>(r3, r6)
            r0.f38931f = r4
            java.lang.Object r8 = rm0.h.b(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            com.tencent.mm.modelbase.f r8 = (com.tencent.mm.modelbase.f) r8
            boolean r6 = r8.b()
            if (r6 == 0) goto L61
            com.tencent.mm.protobuf.f r6 = r8.f70618d
            r45.d61 r6 = (r45.d61) r6
            if (r6 == 0) goto L80
            java.lang.String r6 = r6.getString(r4)
            if (r6 == 0) goto L80
            int r7 = r6.length()
            if (r7 <= 0) goto L5c
            goto L5d
        L5c:
            r4 = 0
        L5d:
            if (r4 == 0) goto L80
            r3 = r6
            goto L80
        L61:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "fetchFeedH5Url failed: errType="
            r6.<init>(r7)
            int r7 = r8.f70615a
            r6.append(r7)
            java.lang.String r7 = ", errCode="
            r6.append(r7)
            int r7 = r8.f70616b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "FinderCommonService"
            com.tencent.mars.xlog.Log.w(r7, r6)
        L80:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.p2.Di(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.text.SpannableString Dj(java.lang.String r20, android.text.SpannableString r21, long r22, java.lang.String r24, java.util.List r25, java.util.LinkedList r26, java.util.LinkedList r27, yz5.p r28, yz5.l r29) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.p2.Dj(java.lang.String, android.text.SpannableString, long, java.lang.String, java.util.List, java.util.LinkedList, java.util.LinkedList, yz5.p, yz5.l):android.text.SpannableString");
    }

    public java.lang.Object Ej(android.app.Activity activity, yz5.l lVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        android.view.Window window = activity.getWindow();
        kotlin.jvm.internal.o.f(window, "getWindow(...)");
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer a17 = com.tencent.mm.plugin.finder.view.vc.a(vcVar, activity, window, 4, false, false, 24, null);
        a17.h(new c61.m2(lVar));
        return a17;
    }

    public void Fj(com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c17).rk(finderObject, i17, null);
    }

    public java.lang.String Gj(java.lang.String origin) {
        kotlin.jvm.internal.o.g(origin, "origin");
        return com.tencent.mm.plugin.finder.search.l4.f125761a.d(origin);
    }

    public boolean Hj() {
        jz5.g gVar = tn2.d.f420822x;
        return ((tn2.d) tn2.d.f420822x.getValue()).t0() || kd2.p1.N.a().t0();
    }

    public final void Ij(java.util.Map map, boolean z17) {
        if (map != null) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            map.put("if_jumpable_remind_finder", java.lang.Integer.valueOf(z17 ? 1 : 0));
            ((cy1.a) rVar).Ej("view_clk", kz5.c1.s(map), 25496);
        }
    }

    public void Jj(r45.qt2 qt2Var, int i17, java.util.List extStatsList) {
        kotlin.jvm.internal.o.g(extStatsList, "extStatsList");
        if (!bq.t.f23523s.a()) {
            gm0.j1.d().g(new db2.g5(qt2Var, i17, extStatsList, (java.lang.String) null));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.j1.f((cq.k) c17, qt2Var, i17, extStatsList, null);
    }

    public void Kj(r45.qt2 qt2Var, int i17, r45.jn0 extStats) {
        kotlin.jvm.internal.o.g(extStats, "extStats");
        if (!bq.t.f23523s.a()) {
            gm0.j1.d().g(new db2.g5(qt2Var, i17, extStats, (java.lang.String) null));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.j1.f((cq.k) c17, qt2Var, i17, kz5.c0.d(extStats), null);
    }

    public void Lj(r45.qt2 qt2Var, int i17, r45.jn0 extStats, java.lang.String str) {
        kotlin.jvm.internal.o.g(extStats, "extStats");
        if (!bq.t.f23523s.a()) {
            gm0.j1.d().g(new db2.g5(qt2Var, i17, extStats, str));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.j1.f((cq.k) c17, qt2Var, i17, kz5.c0.d(extStats), str);
    }

    public void Mj(androidx.appcompat.app.AppCompatActivity context, java.lang.String userName, db5.h4 menu, com.tencent.mm.plugin.finder.storage.FinderItem feedObject, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        context.toString();
        menu.toString();
        feedObject.toString();
        com.tencent.mm.plugin.finder.assist.n7.t(n7Var, context, feedObject, new android.os.Bundle(), 3, true, null, new com.tencent.mm.plugin.finder.assist.g7(feedObject, true, context, userName, menu, lVar), null, 128, null);
    }

    public com.tencent.mm.plugin.finder.storage.FinderItem Ni(long j17) {
        com.tencent.mm.plugin.finder.storage.f90 Pj = ((c61.l7) i95.n0.c(c61.l7.class)).Pj();
        Pj.getClass();
        android.database.Cursor f17 = Pj.f126760f.f("SELECT * FROM FinderFeedItem  WHERE id = " + j17, null, 2);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = new com.tencent.mm.plugin.finder.storage.FinderItem();
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    finderItem.convertFrom(f17);
                }
                vz5.b.a(f17, null);
            } finally {
            }
        }
        return finderItem;
    }

    public void Nj(androidx.appcompat.app.AppCompatActivity context, java.lang.String userName, db5.h4 menu, com.tencent.mm.plugin.finder.storage.FinderItem feedObject, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        zy2.c cVar = new zy2.c();
        r45.g92 finderLive = feedObject.getFinderLive();
        kotlin.jvm.internal.o.g(finderLive, "<set-?>");
        cVar.f477359b = finderLive;
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a(context).c(zy2.v9.class))).Q6(cVar.f477359b);
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a(context).c(zy2.v9.class))).P6(cVar.f477359b);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        com.tencent.mars.xlog.Log.i("MircoMsg.FinderRecentForwardUtils", "showForwardConfirmDialog() called with: isNewFinderForward:true, context = " + context + ", userName = " + userName + ", menu = " + menu + ", feedObject = " + feedObject);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        fc5.f fVar = new fc5.f();
        ot0.q qVar = new ot0.q();
        qVar.f(cVar);
        qVar.f348666i = ((java.lang.Number) com.tencent.mm.plugin.finder.feed.wi.f110978a.c(feedObject).f302833d).intValue();
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        fVar.k(ot0.q.u(qVar, null, null));
        com.tencent.mm.plugin.finder.feed.vi viVar = new com.tencent.mm.plugin.finder.feed.vi(context, menu, feedObject, lVar);
        n13.t tVar = new n13.t();
        tVar.f334134b = viVar;
        ((dk5.y) a0Var).wi(context, fVar, userName, tVar);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.f328076q, null, null, null, null, null, false, 126, null);
    }

    public void Oj(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderJumpInfo info, com.tencent.mm.plugin.lite.s sVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(info, "info");
        xc2.y2.L(xc2.y2.f453343a, context, new xc2.p0(info), null, sVar, null, 16, null);
    }

    public com.tencent.mm.plugin.finder.model.BaseFinderFeed Pj(com.tencent.mm.plugin.finder.storage.FinderItem finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        return cu2.u.f222441a.p(finderObject);
    }

    public void Qj(android.content.Context context, r45.k74 liteAppInfo) {
        cl0.g gVar;
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(liteAppInfo, "liteAppInfo");
        java.lang.String string = liteAppInfo.getString(0);
        if (string == null || string.length() == 0) {
            com.tencent.mars.xlog.Log.e("FinderCommonService", "liteapp do preload err: liteAppInfo.app_id is null or empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderCommonService", "litepp do preload");
        java.lang.String string2 = liteAppInfo.getString(2);
        if (string2 == null || string2.length() == 0) {
            gVar = new cl0.g();
        } else {
            com.tencent.mars.xlog.Log.i("FinderCommonService", "litepp do preload, query:" + string2);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(new cl0.g(string2));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                m521constructorimpl = null;
            }
            gVar = (cl0.g) m521constructorimpl;
            if (gVar == null) {
                gVar = new cl0.g();
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (context != null) {
            try {
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                gVar.o("commentscene", V6.getInteger(5));
                java.lang.String string3 = V6.getString(1);
                if (string3 == null) {
                    string3 = "";
                }
                gVar.h("finder_context_id", string3);
                java.lang.String string4 = V6.getString(2);
                if (string4 == null) {
                    string4 = "";
                }
                gVar.h("finder_tab_context_id", string4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FinderCommonService", "liteapp do preload err: " + e17);
            }
        }
        linkedHashMap.put("query", gVar);
        jz5.l[] lVarArr = new jz5.l[3];
        java.lang.String string5 = liteAppInfo.getString(0);
        if (string5 == null) {
            string5 = "";
        }
        lVarArr[0] = new jz5.l("appId", string5);
        java.lang.String string6 = liteAppInfo.getString(1);
        lVarArr[1] = new jz5.l(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, string6 != null ? string6 : "");
        lVarArr[2] = new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "finder");
        java.util.Map k17 = kz5.c1.k(lVarArr);
        i95.m c17 = i95.n0.c(q80.g0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.lite.w.o("finder.jumpInfoExpose", liteAppInfo.getString(0), k17, linkedHashMap);
    }

    public java.lang.String Ri(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3 = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str2 == null ? "" : str2;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        ya2.g gVar = ya2.h.f460484a;
        if (str != null ? r26.i0.n(str, "@finder", false) : false) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                kotlin.jvm.internal.o.d(str);
                ya2.b2 b17 = gVar.b(str);
                if (b17 != null) {
                    str3 = b17.w0();
                }
            } else if (str2 != null) {
                str3 = str2;
            }
            stringBuffer.append("displayName is is finder contact");
        } else {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 != null && ((int) n17.E2) != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(n17.g2())) {
                str3 = n17.g2();
                kotlin.jvm.internal.o.f(str3, "getDisplayRemark(...)");
                stringBuffer.append("displayName is ".concat(str3));
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                java.lang.String d17 = n17 != null ? n17.d1() : null;
                if (d17 != null) {
                    str3 = d17;
                }
            } else if (str2 != null) {
                str3 = str2;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderCommonService", "getDisplayName username " + str + " nickname " + str2 + " buf:" + ((java.lang.Object) stringBuffer));
        }
        return str3;
    }

    public void Rj(java.lang.String username, java.lang.String selfUsername, java.util.List list) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(selfUsername, "selfUsername");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.A9).getValue()).r()).intValue() == 0 && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.B9).getValue()).r()).intValue() == 0) && kotlin.jvm.internal.o.b(username, selfUsername)) {
            if ((list != null ? list.size() : 0) > 0) {
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                pm0.v.T(new bq.f0(username, list).l(), new cq.y0(c61.n2.f39180d, c61.o2.f39196d));
            }
        }
    }

    public zy2.ra Sj(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!(context instanceof com.tencent.mm.ui.MMFragmentActivity)) {
            return null;
        }
        return (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
    }

    public ya2.b2 Ui(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        return ((c61.l7) i95.n0.c(c61.l7.class)).Jj().y0(username);
    }

    public com.tencent.mm.plugin.finder.storage.FinderItem Vi(long j17) {
        return ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).dk(j17);
    }

    public java.lang.String Zi(long j17, int i17, java.lang.String str) {
        return ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str, i17);
    }

    public com.tencent.mm.plugin.finder.report.e6 aj(long j17, java.lang.String str, int i17) {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return com.tencent.mm.plugin.finder.report.o3.hk((com.tencent.mm.plugin.finder.report.o3) c17, j17, str, i17, null, 8, null);
    }

    public java.lang.String bj(java.lang.String dirName, java.lang.String id6) {
        kotlin.jvm.internal.o.g(dirName, "dirName");
        kotlin.jvm.internal.o.g(id6, "id");
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        return com.tencent.mm.plugin.finder.assist.e9.f102135d + dirName + '/' + id6 + ".pag";
    }

    public java.lang.CharSequence cj(android.content.Context context, android.text.TextPaint paint, java.lang.CharSequence spanText, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(paint, "paint");
        kotlin.jvm.internal.o.g(spanText, "spanText");
        int a17 = hc2.t.a(context, i17);
        int a18 = hc2.t.a(context, i17 + 1);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(spanText, 0, spanText.length(), paint, a17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (new android.text.StaticLayout(spanText, 0, spanText.length(), paint, a18, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
            return spanText;
        }
        int lineEnd = staticLayout.getLineEnd(0);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String substring = spanText.toString().substring(0, lineEnd);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String concat = substring.concat("…");
        ((ke0.e) xVar).getClass();
        return com.tencent.mm.pluginsdk.ui.span.c0.i(context, concat);
    }

    public java.lang.String fj() {
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        return com.tencent.mm.plugin.finder.assist.e9.f102143l + java.lang.System.nanoTime() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
    }

    public r45.fx2 hj() {
        return ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).S6();
    }

    public int ij() {
        return ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ik();
    }

    public java.util.List mj(java.util.List objectList) {
        kotlin.jvm.internal.o.g(objectList, "objectList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objectList) {
            if (hc2.o0.C((com.tencent.mm.protocal.protobuf.FinderObject) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.List j17 = cu2.u.f222441a.j(arrayList, 2, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : j17) {
            if (!((com.tencent.mm.plugin.finder.storage.FinderItem) obj2).isLiveFeed()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final void nj(android.text.SpannableString spannableString, java.util.ArrayList arrayList, yz5.l lVar) {
        int color = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_0) : com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479254u6);
        int color2 = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a9e) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.assist.m0 m0Var = (com.tencent.mm.plugin.finder.assist.m0) it.next();
            com.tencent.mm.plugin.finder.view.yl ylVar = new com.tencent.mm.plugin.finder.view.yl(m0Var.f102377c, color, color2, false, false, new c61.e2(lVar), 16, null);
            ylVar.f133409n = true;
            spannableString.setSpan(ylVar, m0Var.f102375a, m0Var.f102376b, 17);
        }
    }

    public java.util.List oj(android.content.Context context, android.text.Spannable sendContent, long j17, long j18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(sendContent, "sendContent");
        return (java.util.List) hc2.x0.g(sendContent.toString(), true, new c61.g2(sendContent, j18, j17, context, this)).f302833d;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f39215e.alive();
        this.f39214d.alive();
        com.tencent.mm.plugin.finder.viewmodel.component.aa aaVar = (com.tencent.mm.plugin.finder.viewmodel.component.aa) pf5.u.f353936a.e(zy2.b6.class).a(com.tencent.mm.plugin.finder.viewmodel.component.aa.class);
        aaVar.getClass();
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context2).registerActivityLifecycleCallbacks(new com.tencent.mm.plugin.finder.viewmodel.component.z9(aaVar));
        or2.a aVar = or2.a.f347607a;
        or2.a.f347608b = 0;
        or2.a.f347609c = 0L;
        or2.a.f347610d = 0L;
        or2.a.f347611e = "";
        or2.a.f347612f = 0;
        or2.a.f347613g = 0;
        or2.a.f347614h = false;
        or2.a.f347615i = false;
        aVar.e();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f39215e.dead();
        this.f39214d.dead();
    }

    public final void pj(long j17, java.lang.String str, android.text.SpannableString spannableString, java.util.List list, yz5.p pVar) {
        int color = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_0) : com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479254u6);
        int color2 = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a9e) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.assist.m9 m9Var = (com.tencent.mm.plugin.finder.assist.m9) it.next();
            java.lang.String substring = m9Var.f102390c.substring(1);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            com.tencent.mm.plugin.finder.view.yl ylVar = new com.tencent.mm.plugin.finder.view.yl(substring, color, color2, false, true, new c61.i2(pVar, j17, str));
            int i17 = m9Var.f102388a;
            spannableString.setSpan(ylVar, i17, m9Var.f102389b + i17, 17);
        }
    }

    public boolean qj() {
        return this.f39218h.size() > 0;
    }

    public boolean rj(java.lang.String str) {
        nv2.d0 d0Var = nv2.d0.f340470e;
        return nv2.d0.c(nv2.d0.f340470e, str, false, false, 6, null);
    }

    public boolean sj(java.lang.String str) {
        return ((c61.l7) i95.n0.c(c61.l7.class)).Gk(str);
    }

    public boolean tj() {
        return this.f39217g.size() > 0;
    }

    public void uj(android.content.Context context, java.lang.String nickname, java.lang.String str, boolean z17, java.util.Map map, org.json.JSONObject jSONObject) {
        boolean z18;
        kotlin.jvm.internal.o.g(nickname, "nickname");
        if (context != null) {
            java.util.HashMap hashMap = this.f39216f;
            if (!hashMap.containsKey(nickname)) {
                new db2.u1(kz5.b0.c(nickname), null).l().K(new c61.k2(this, nickname, context, jSONObject, str, z17, map));
                return;
            }
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) hashMap.get(nickname);
            java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(username) || username == null) {
                com.tencent.mars.xlog.Log.i("FinderCommonService", "username nil");
                db5.t7.makeText(context, com.tencent.mm.R.string.clo, 0).show();
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0,2,");
                sb6.append(nickname);
                sb6.append(",2,");
                sb6.append(str != null ? str : "");
                g0Var.kvStat(21172, sb6.toString());
                z18 = false;
            } else {
                wj(username, context, context, jSONObject);
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("0,2,");
                sb7.append(nickname);
                sb7.append(",1,");
                sb7.append(str != null ? str : "");
                g0Var2.kvStat(21172, sb7.toString());
                z18 = true;
            }
            if (z17) {
                Ij(map, z18);
            }
        }
    }

    public final void vj(java.lang.String clickUsername, android.content.Context context, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, android.content.Context context2, org.json.JSONObject jSONObject) {
        ec2.d e27;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", clickUsername);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        long j17 = finderItem.field_id;
        if (j17 == 0) {
            j17 = finderItem.getLocalId();
        }
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, j17, null, 0, 2, false, 0, finderItem.field_id == 0 ? null : finderItem.getDupFlag(), 192, null);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_entrance_type", 4);
        java.lang.String stringExtra = intent.getStringExtra("key_udf_kv");
        if (stringExtra == null) {
            stringExtra = "";
        }
        cl0.g gVar = stringExtra.length() > 0 ? new cl0.g(stringExtra) : new cl0.g();
        gVar.h("enter_udfkv", jSONObject);
        intent.putExtra("key_udf_kv", gVar.toString());
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
        if (e17 != null) {
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            r45.qt2 V6 = e17.V6();
            o3Var.getClass();
            kotlin.jvm.internal.o.g(clickUsername, "clickUsername");
            com.tencent.mm.autogen.mmdata.rpt.FinderClickMentionStruct finderClickMentionStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderClickMentionStruct();
            finderClickMentionStruct.f56635d = finderClickMentionStruct.b("FeedId", o3Var.Ui(finderItem.getId()), true);
            finderClickMentionStruct.f56636e = finderClickMentionStruct.b("SessionId", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri(), true);
            finderClickMentionStruct.f56637f = finderClickMentionStruct.b("PosterUsername", finderItem.getFeedObject().getUsername(), true);
            finderClickMentionStruct.f56638g = finderClickMentionStruct.b("ViewerUsername", xy2.c.f(V6), true);
            finderClickMentionStruct.f56639h = finderClickMentionStruct.b("MentionedUsername", clickUsername, true);
            finderClickMentionStruct.f56640i = V6.getInteger(5);
            finderClickMentionStruct.f56641j = finderItem.getFeedObject().getOrgRecommendType();
            finderClickMentionStruct.f56642k = finderItem.getFeedObject().getLikeCount();
            finderClickMentionStruct.f56643l = finderItem.getFeedObject().getCommentCount();
            finderClickMentionStruct.k();
            o3Var.Zk(finderClickMentionStruct);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context2);
        if (e18 == null || (e27 = zy2.ra.e2(e18, 0, 1, null)) == null) {
            return;
        }
        e27.a(new ec2.a(20, finderItem.getId(), finderItem.getDupFlag()));
    }

    public az2.j wi(long j17, java.lang.String str) {
        return new db2.g4(j17, "", 0, 2, "", true, null, null, 0L, null, false, false, null, null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, str, null, 402644928, null);
    }

    public final void wj(java.lang.String str, android.content.Context context, android.content.Context context2, org.json.JSONObject jSONObject) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", str);
        intent.putExtra("KEY_FINDER_SELF_FLAG", hc2.t.d(context2));
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent, 0L, null, 0, 2, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        java.lang.String stringExtra = intent.getStringExtra("key_udf_kv");
        if (stringExtra == null) {
            stringExtra = "";
        }
        cl0.g gVar = stringExtra.length() > 0 ? new cl0.g(stringExtra) : new cl0.g();
        gVar.h("enter_udfkv", jSONObject);
        intent.putExtra("key_udf_kv", gVar.toString());
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
    }

    public void xj(android.content.Context context, r45.qt2 qt2Var, long j17, java.lang.String username, java.lang.Long l17, int i17, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        bd2.b.f19244a.j(context, qt2Var, j17, username, l17, i17, finderObject != null ? new so2.h1(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0)) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        if (((r13 == null || r13.isFinishing()) ? false : true) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void yj(com.tencent.mm.ui.MMActivity r20) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.p2.yj(com.tencent.mm.ui.MMActivity):void");
    }

    public void zj(com.tencent.mm.ui.MMActivity finder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        vn2.q qVar;
        kotlin.jvm.internal.o.g(finder, "finder");
        boolean z17 = finder instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI;
        if ((z17 || (finder instanceof com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity)) && !(finder instanceof com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity)) {
            com.tencent.mm.plugin.finder.service.l3 l3Var = (com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class));
            l3Var.getClass();
            com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "on finder foreground " + finder);
            if (!(z17 ? ((com.tencent.mm.plugin.finder.ui.MMFinderUI) finder).f128812n : false)) {
                or2.a aVar = or2.a.f347607a;
                int i17 = or2.a.f347612f + 1;
                or2.a.f347612f = i17;
                if (i17 >= 1) {
                    aVar.b(true, false);
                }
            }
            java.util.Set set = l3Var.f126132r;
            if (!set.contains(finder)) {
                boolean Di = ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Di(finder);
                if (!Di) {
                    com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    if (t70Var.U0()) {
                        if (!(set.size() > 0) && !l3Var.f126124g && !l3Var.f126123f) {
                            boolean z18 = finder.getIntent().getIntExtra("enter_finder_home_ui_type", 1) == 2;
                            boolean z19 = finder.getIntent().getIntExtra("enter_finder_home_ui_type", 1) == 4;
                            if (!l3Var.f126126i && !z18 && !z19) {
                                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).mj(1, null);
                                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(finder, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
                            }
                            l3Var.f126126i = false;
                            android.content.Intent intent = finder.getIntent();
                            if (intent != null) {
                                intent.putExtra("enter_finder_home_ui_type", 1);
                            }
                        }
                    }
                    com.tencent.mm.plugin.finder.report.b2 b2Var = com.tencent.mm.plugin.finder.report.b2.f124965a;
                    boolean z27 = l3Var.f126123f;
                    boolean z28 = l3Var.f126124g;
                    if (t70Var.U0()) {
                        com.tencent.mm.plugin.finder.service.l3 l3Var2 = (com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class));
                        boolean z29 = l3Var2.f126132r.size() > 0;
                        if (!z29) {
                            b2Var.a(com.tencent.mm.plugin.finder.report.y1.f125449f);
                        }
                        if (!z29 && l3Var2.Di(finder)) {
                            com.tencent.mars.xlog.Log.i("FinderMultiTaskReporter", "onFinderForeground: isMainProcBackground=" + z27 + ", isScreenOff = " + z28);
                            if (z28) {
                                b2Var.a(com.tencent.mm.plugin.finder.report.y1.f125454n);
                            } else {
                                java.util.Set enterFinderActivity = l3Var2.f126133s;
                                kotlin.jvm.internal.o.f(enterFinderActivity, "enterFinderActivity");
                                java.util.Iterator it = enterFinderActivity.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj = it.next();
                                        if (((androidx.appcompat.app.AppCompatActivity) obj) instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                android.app.Activity activity = (android.app.Activity) obj;
                                com.tencent.mm.plugin.finder.ui.FinderHomeUI finderHomeUI = activity instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI ? (com.tencent.mm.plugin.finder.ui.FinderHomeUI) activity : null;
                                java.util.Iterator it6 = enterFinderActivity.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj2 = it6.next();
                                        if (((androidx.appcompat.app.AppCompatActivity) obj2) instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedAffinityUI) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                android.app.Activity activity2 = (android.app.Activity) obj2;
                                com.tencent.mm.plugin.finder.ui.FinderShareFeedAffinityUI finderShareFeedAffinityUI = activity2 instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedAffinityUI ? (com.tencent.mm.plugin.finder.ui.FinderShareFeedAffinityUI) activity2 : null;
                                if (z27) {
                                    if (finderHomeUI != null) {
                                        finderHomeUI.f128584z = true;
                                    }
                                    if (finderShareFeedAffinityUI != null) {
                                        finderShareFeedAffinityUI.f128756q2 = true;
                                    }
                                    com.tencent.mm.plugin.finder.report.g5 g5Var = com.tencent.mm.plugin.finder.report.g5.f125053a;
                                    com.tencent.mm.plugin.finder.report.g5.f125054b = java.lang.System.currentTimeMillis();
                                    g5Var.a(finder, true);
                                    b2Var.a(com.tencent.mm.plugin.finder.report.y1.f125451h);
                                    com.tencent.mars.xlog.Log.i("FinderMultiTaskReporter", "onFinderForeground: enter finder task from system ui");
                                } else {
                                    if (finderHomeUI != null) {
                                        finderHomeUI.f128584z = false;
                                    }
                                    if (finderShareFeedAffinityUI != null) {
                                        finderShareFeedAffinityUI.f128756q2 = false;
                                    }
                                    b2Var.a(com.tencent.mm.plugin.finder.report.y1.f125452i);
                                    com.tencent.mars.xlog.Log.i("FinderMultiTaskReporter", "onFinderForeground: enter finder task normally");
                                }
                            }
                            b2Var.a(com.tencent.mm.plugin.finder.report.y1.f125450g);
                        }
                        java.lang.Class<?> cls = finder.getClass();
                        jz2.x0 x0Var = jz2.x0.f302754a;
                        if (kotlin.jvm.internal.o.b(cls, (java.lang.Class) ((jz5.n) jz2.x0.f302755b).getValue())) {
                            b2Var.a(com.tencent.mm.plugin.finder.report.y1.f125456p);
                        } else if (kotlin.jvm.internal.o.b(finder.getClass(), (java.lang.Class) ((jz5.n) jz2.x0.f302757d).getValue())) {
                            b2Var.a(com.tencent.mm.plugin.finder.report.y1.f125455o);
                        }
                    }
                }
                l3Var.f126124g = false;
                if (!Di) {
                    l3Var.f126130p = 0L;
                    set.add(finder);
                    l3Var.f126121d = false;
                    l3Var.f126122e = false;
                    if (!l3Var.f126127m) {
                        l3Var.f126127m = l3Var.Zi(finder);
                    }
                }
            }
            java.util.Set set2 = this.f39218h;
            if (set2.contains(finder)) {
                return;
            }
            if (((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Di(finder)) {
                com.tencent.mars.xlog.Log.i("FinderCommonService", "onFinderForeground: ui is from nearby, ui = " + finder);
                return;
            }
            if (set2.size() == 0) {
                for (bs2.n1 n1Var : ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).f122543e) {
                    com.tencent.mars.xlog.Log.i(n1Var.f23909c, "performEnterFinder: ");
                    n1Var.f23910d = true;
                    n1Var.f23911e.c("performEnterFinder");
                }
                if (((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Di(finder)) {
                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().Z();
                }
                wn2.f fVar = (wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class));
                fVar.getClass();
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = fVar.f447522f;
                if (i0Var != null && (qVar = i0Var.f120942n) != null) {
                    java.lang.String stringExtra = finder.getIntent().getStringExtra("key_context_id");
                    qVar.d("onFinderForeground sessionInEnterTimeMs=" + qVar.f438359e + ",activity=" + finder.getClass().getSimpleName() + " contextId=" + stringExtra);
                    if (qVar.f438359e == 0 && kotlin.jvm.internal.o.b(stringExtra, qVar.f438355a)) {
                        qVar.e();
                    }
                }
            }
            set2.add(finder);
        }
    }
}
