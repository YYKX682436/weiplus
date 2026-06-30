package c61;

@j95.b
/* loaded from: classes10.dex */
public final class p2 extends i95.w implements c61.yb, c50.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f120747d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f120748e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f120749f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f120750g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f120751h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f120752i;

    public p2() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f120747d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5300x3b5972cf>(a0Var) { // from class: com.tencent.mm.plugin.FinderCommonBaseFeatureService$destroyPreloadedWebViewListener$1
            {
                this.f39173x3fe91575 = 303899871;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5300x3b5972cf c5300x3b5972cf) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5300x3b5972cf event = c5300x3b5972cf;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                long j17 = event.f135622g.f87750a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.q qVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.q.f218447a;
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.q.class) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.q.f218448b != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BoxWebViewPreloadManager", "MultiWebView-Trace destroy 1 webView for FinderWebView");
                        com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.q.f218448b;
                        if (c12962xa24d9bee != null) {
                            c12962xa24d9bee.mo52095x5cd39ffa();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.q.f218448b = null;
                    }
                }
                return false;
            }
        };
        this.f120748e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5651x28bf928>(a0Var) { // from class: com.tencent.mm.plugin.FinderCommonBaseFeatureService$openSpecificViewEvent$1
            {
                this.f39173x3fe91575 = 2142564152;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5651x28bf928 c5651x28bf928) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5651x28bf928 event = c5651x28bf928;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.sh shVar = event.f135976g;
                boolean p17 = r26.i0.p(shVar.f89432b, "channel/contact_setting", true);
                am.th thVar = event.f135977h;
                if (!p17) {
                    if (!r26.i0.p(shVar.f89432b, "channel/black_list", true)) {
                        return false;
                    }
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xy2.c.e(context))) {
                        thVar.f89544b = true;
                    } else {
                        android.content.Intent intent = new android.content.Intent();
                        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b.class);
                        thVar.f89543a = intent;
                    }
                    thVar.f89545c = true;
                    return true;
                }
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xy2.c.e(context2))) {
                    thVar.f89544b = true;
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_from_comment_scene", 39);
                    intent2.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    ya2.e1 e1Var = ya2.e1.f542005a;
                    android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                    e1Var.x(context3, intent2, 20, 2);
                }
                thVar.f89545c = true;
                return true;
            }
        };
        this.f120749f = new java.util.HashMap();
        this.f120750g = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f120751h = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f120752i = java.util.Collections.synchronizedSet(new java.util.HashSet());
    }

    public az2.j Ai(long j17, java.lang.String str, int i17, int i18, java.lang.String feedUsername, boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, long j18, java.lang.String username, boolean z18, boolean z19, java.lang.String encryptedObjectId, r45.qt2 qt2Var, int i19, java.lang.String udfKv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername, "feedUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptedObjectId, "encryptedObjectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udfKv, "udfKv");
        return new db2.g4(j17, str, i17, i18, feedUsername, z17, gVar, yj0Var, j18, username, z18, z19, encryptedObjectId, qt2Var, i19, null, false, null, null, udfKv, null, null, 0, 0, null, null, false, null, null, 402096128, null);
    }

    public void Aj(java.lang.Object drawer, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawer, "drawer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObj, "feedObj");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e = drawer instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e) drawer : null;
        if (c15307x329a684e != null) {
            c15307x329a684e.u();
            int c17 = com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i17 = b17.x;
            int i18 = b17.y;
            java.lang.System.nanoTime();
            boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!z17) {
                if (i18 >= i17) {
                    i17 = i18;
                }
                i18 = i17;
            }
            int i19 = ((int) (i18 * 0.75d)) - c17;
            int h17 = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561236an3) - c17;
            int size = (feedObj.m59240x7c94657b().m76793xbd916e4b().size() * i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj)) + i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn) + c17 + i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
            if (size >= h17) {
                h17 = size;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.w(c15307x329a684e, null, feedObj, null, h17 > i19 ? i19 : h17, null, null, 48, null);
        }
    }

    public void Bi(android.content.Context context, r45.ac4 jumpInfoWrapper, l81.b1 b1Var, in5.s0 s0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoWrapper, "jumpInfoWrapper");
        xc2.y2 y2Var = xc2.y2.f534876a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) jumpInfoWrapper.m75936x14adae67(1);
        if (c19786x6a1e2862 == null) {
            c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        }
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        p0Var.f534784m = b1Var;
        p0Var.M = jumpInfoWrapper.m75933x41a8a7f2(2);
        p0Var.N = jumpInfoWrapper.m75933x41a8a7f2(3);
        p0Var.f534785n = jumpInfoWrapper.m75939xb282bd08(4) != 1 ? 0 : 1;
        p0Var.O = jumpInfoWrapper.m75933x41a8a7f2(5);
        p0Var.P = jumpInfoWrapper.m75933x41a8a7f2(6);
        p0Var.Q = jumpInfoWrapper.m75933x41a8a7f2(7);
        y2Var.h(context, p0Var, jumpInfoWrapper.m75939xb282bd08(0), s0Var);
    }

    public java.lang.String Bj(java.lang.String xml, java.util.LinkedList keyInfoList, java.util.ArrayList parseInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyInfoList, "keyInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parseInfoList, "parseInfoList");
        if (xml.length() == 0) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u1 u1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u1();
        java.lang.String xml2 = "<finderComment>" + xml + "</finderComment>";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml2, "xml");
        java.lang.ThreadLocal threadLocal = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u1.f184122b;
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) threadLocal.get();
        if (xmlPullParser == null) {
            xmlPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(xmlPullParser, "newPullParser(...)");
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
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                java.lang.String message = e17.getMessage();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentSearchParser", "parse comment xml failed currentParsed %s msg %s stack %s ", sb7, message, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                return null;
            }
        }
        java.lang.String sb8 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
        return sb8;
    }

    public final android.text.SpannableString Cj(java.lang.String str, android.text.SpannableString spannableString, java.util.List list, yz5.p pVar, long j17, java.lang.String str2, yz5.l lVar) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return spannableString;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) hc2.x0.i(spannableString.toString(), new java.util.HashMap(), true, null).f384367e;
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m9> h17 = hc2.x0.h(spannableString.toString(), arrayList, null);
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m9 m9Var : h17) {
            int i17 = m9Var.f183921a - 1;
            if (i17 < 0) {
                i17 = 0;
            }
            list.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m9(i17, m9Var.f183922b + 1, "#" + m9Var.f183923c));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "parseDefaultDesc: atSize=" + arrayList.size() + ", topicSize=" + ((java.util.ArrayList) h17).size() + ", defaultDesc=" + ((java.lang.Object) spannableString));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String spannableString2 = spannableString.toString();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString valueOf = android.text.SpannableString.valueOf(new android.text.SpannableStringBuilder(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, spannableString2)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
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
    public java.lang.Object Di(long r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof c61.d2
            if (r0 == 0) goto L13
            r0 = r8
            c61.d2 r0 = (c61.d2) r0
            int r1 = r0.f120464f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120464f = r1
            goto L18
        L13:
            c61.d2 r0 = new c61.d2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f120462d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f120464f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L41
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            bq.j0 r8 = new bq.j0
            r8.<init>(r3, r6)
            r0.f120464f = r4
            java.lang.Object r8 = rm0.h.b(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            com.tencent.mm.modelbase.f r8 = (com.p314xaae8f345.mm.p944x882e457a.f) r8
            boolean r6 = r8.b()
            if (r6 == 0) goto L61
            com.tencent.mm.protobuf.f r6 = r8.f152151d
            r45.d61 r6 = (r45.d61) r6
            if (r6 == 0) goto L80
            java.lang.String r6 = r6.m75945x2fec8307(r4)
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
            int r7 = r8.f152148a
            r6.append(r7)
            java.lang.String r7 = ", errCode="
            r6.append(r7)
            int r7 = r8.f152149b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "FinderCommonService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r7, r6)
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
        android.view.Window window = activity.getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc.a(vcVar, activity, window, 4, false, false, 24, null);
        a17.h(new c61.m2(lVar));
        return a17;
    }

    public void Fj(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(finderObject, i17, null);
    }

    public java.lang.String Gj(java.lang.String origin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a.d(origin);
    }

    public boolean Hj() {
        jz5.g gVar = tn2.d.f502355x;
        return ((tn2.d) tn2.d.f502355x.mo141623x754a37bb()).t0() || kd2.p1.N.a().t0();
    }

    public final void Ij(java.util.Map map, boolean z17) {
        if (map != null) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            map.put("if_jumpable_remind_finder", java.lang.Integer.valueOf(z17 ? 1 : 0));
            ((cy1.a) rVar).Ej("view_clk", kz5.c1.s(map), 25496);
        }
    }

    public void Jj(r45.qt2 qt2Var, int i17, java.util.List extStatsList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extStatsList, "extStatsList");
        if (!bq.t.f105056s.a()) {
            gm0.j1.d().g(new db2.g5(qt2Var, i17, extStatsList, (java.lang.String) null));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cq.j1.f((cq.k) c17, qt2Var, i17, extStatsList, null);
    }

    public void Kj(r45.qt2 qt2Var, int i17, r45.jn0 extStats) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extStats, "extStats");
        if (!bq.t.f105056s.a()) {
            gm0.j1.d().g(new db2.g5(qt2Var, i17, extStats, (java.lang.String) null));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cq.j1.f((cq.k) c17, qt2Var, i17, kz5.c0.d(extStats), null);
    }

    public void Lj(r45.qt2 qt2Var, int i17, r45.jn0 extStats, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extStats, "extStats");
        if (!bq.t.f105056s.a()) {
            gm0.j1.d().g(new db2.g5(qt2Var, i17, extStats, str));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cq.j1.f((cq.k) c17, qt2Var, i17, kz5.c0.d(extStats), str);
    }

    public void Mj(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, java.lang.String userName, db5.h4 menu, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        context.toString();
        menu.toString();
        feedObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.t(n7Var, context, feedObject, new android.os.Bundle(), 3, true, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g7(feedObject, true, context, userName, menu, lVar), null, 128, null);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 Ni(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f90 Pj = ((c61.l7) i95.n0.c(c61.l7.class)).Pj();
        Pj.getClass();
        android.database.Cursor f17 = Pj.f208293f.f("SELECT * FROM FinderFeedItem  WHERE id = " + j17, null, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079();
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    c14994x9b99c079.mo9015xbf5d97fd(f17);
                }
                vz5.b.a(f17, null);
            } finally {
            }
        }
        return c14994x9b99c079;
    }

    public void Nj(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, java.lang.String userName, db5.h4 menu, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        zy2.c cVar = new zy2.c();
        r45.g92 m59239x1309d228 = feedObject.m59239x1309d228();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m59239x1309d228, "<set-?>");
        cVar.f558892b = m59239x1309d228;
        pf5.z zVar = pf5.z.f435481a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a(context).c(zy2.v9.class))).Q6(cVar.f558892b);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a(context).c(zy2.v9.class))).P6(cVar.f558892b);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.FinderRecentForwardUtils", "showForwardConfirmDialog() called with: isNewFinderForward:true, context = " + context + ", userName = " + userName + ", menu = " + menu + ", feedObject = " + feedObject);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        fc5.f fVar = new fc5.f();
        ot0.q qVar = new ot0.q();
        qVar.f(cVar);
        qVar.f430199i = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wi.f192511a.c(feedObject).f384366d).intValue();
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        fVar.k(ot0.q.u(qVar, null, null));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vi viVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vi(context, menu, feedObject, lVar);
        n13.t tVar = new n13.t();
        tVar.f415667b = viVar;
        ((dk5.y) a0Var).wi(context, fVar, userName, tVar);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.f409609q, null, null, null, null, null, false, 126, null);
    }

    public void Oj(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        xc2.y2.L(xc2.y2.f534876a, context, new xc2.p0(info), null, sVar, null, 16, null);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 Pj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        return cu2.u.f303974a.p(finderObject);
    }

    public void Qj(android.content.Context context, r45.k74 liteAppInfo) {
        cl0.g gVar;
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppInfo, "liteAppInfo");
        java.lang.String m75945x2fec8307 = liteAppInfo.m75945x2fec8307(0);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommonService", "liteapp do preload err: liteAppInfo.app_id is null or empty");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "litepp do preload");
        java.lang.String m75945x2fec83072 = liteAppInfo.m75945x2fec8307(2);
        if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
            gVar = new cl0.g();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "litepp do preload, query:" + m75945x2fec83072);
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new cl0.g(m75945x2fec83072));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                m143895xf1229813 = null;
            }
            gVar = (cl0.g) m143895xf1229813;
            if (gVar == null) {
                gVar = new cl0.g();
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (context != null) {
            try {
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                gVar.o("commentscene", V6.m75939xb282bd08(5));
                java.lang.String m75945x2fec83073 = V6.m75945x2fec8307(1);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                gVar.h("finder_context_id", m75945x2fec83073);
                java.lang.String m75945x2fec83074 = V6.m75945x2fec8307(2);
                if (m75945x2fec83074 == null) {
                    m75945x2fec83074 = "";
                }
                gVar.h("finder_tab_context_id", m75945x2fec83074);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommonService", "liteapp do preload err: " + e17);
            }
        }
        linkedHashMap.put("query", gVar);
        jz5.l[] lVarArr = new jz5.l[3];
        java.lang.String m75945x2fec83075 = liteAppInfo.m75945x2fec8307(0);
        if (m75945x2fec83075 == null) {
            m75945x2fec83075 = "";
        }
        lVarArr[0] = new jz5.l("appId", m75945x2fec83075);
        java.lang.String m75945x2fec83076 = liteAppInfo.m75945x2fec8307(1);
        lVarArr[1] = new jz5.l(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, m75945x2fec83076 != null ? m75945x2fec83076 : "");
        lVarArr[2] = new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "finder");
        java.util.Map k17 = kz5.c1.k(lVarArr);
        i95.m c17 = i95.n0.c(q80.g0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.o("finder.jumpInfoExpose", liteAppInfo.m75945x2fec8307(0), k17, linkedHashMap);
    }

    public java.lang.String Ri(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str2 == null ? "" : str2;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        ya2.g gVar = ya2.h.f542017a;
        if (str != null ? r26.i0.n(str, "@finder", false) : false) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                ya2.b2 b17 = gVar.b(str);
                if (b17 != null) {
                    str3 = b17.w0();
                }
            } else if (str2 != null) {
                str3 = str2;
            }
            stringBuffer.append("displayName is is finder contact");
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 != null && ((int) n17.E2) != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.g2())) {
                str3 = n17.g2();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getDisplayRemark(...)");
                stringBuffer.append("displayName is ".concat(str3));
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                java.lang.String d17 = n17 != null ? n17.d1() : null;
                if (d17 != null) {
                    str3 = d17;
                }
            } else if (str2 != null) {
                str3 = str2;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "getDisplayName username " + str + " nickname " + str2 + " buf:" + ((java.lang.Object) stringBuffer));
        }
        return str3;
    }

    public void Rj(java.lang.String username, java.lang.String selfUsername, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUsername, "selfUsername");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.A9).mo141623x754a37bb()).r()).intValue() == 0 && ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.B9).mo141623x754a37bb()).r()).intValue() == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(username, selfUsername)) {
            if ((list != null ? list.size() : 0) > 0) {
                i95.m c17 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                pm0.v.T(new bq.f0(username, list).l(), new cq.y0(c61.n2.f120713d, c61.o2.f120729d));
            }
        }
    }

    public zy2.ra Sj(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!(context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f)) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
    }

    public ya2.b2 Ui(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return ((c61.l7) i95.n0.c(c61.l7.class)).Jj().y0(username);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 Vi(long j17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).dk(j17);
    }

    public java.lang.String Zi(long j17, int i17, java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, str, i17);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 aj(long j17, java.lang.String str, int i17) {
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.hk((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, j17, str, i17, null, 8, null);
    }

    public java.lang.String bj(java.lang.String dirName, java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dirName, "dirName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183668d + dirName + '/' + id6 + ".pag";
    }

    public java.lang.CharSequence cj(android.content.Context context, android.text.TextPaint paint, java.lang.CharSequence spanText, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanText, "spanText");
        int a17 = hc2.t.a(context, i17);
        int a18 = hc2.t.a(context, i17 + 1);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(spanText, 0, spanText.length(), paint, a17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (new android.text.StaticLayout(spanText, 0, spanText.length(), paint, a18, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
            return spanText;
        }
        int lineEnd = staticLayout.getLineEnd(0);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String substring = spanText.toString().substring(0, lineEnd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        java.lang.String concat = substring.concat("…");
        ((ke0.e) xVar).getClass();
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, concat);
    }

    public java.lang.String fj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l + java.lang.System.nanoTime() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
    }

    public r45.fx2 hj() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class)).S6();
    }

    public int ij() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ik();
    }

    public java.util.List mj(java.util.List objectList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectList, "objectList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objectList) {
            if (hc2.o0.C((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.List j17 = cu2.u.f303974a.j(arrayList, 2, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : j17) {
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj2).m59311x25315bf4()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final void nj(android.text.SpannableString spannableString, java.util.ArrayList arrayList, yz5.l lVar) {
        int color = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6);
        int color2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m0) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl ylVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(m0Var.f183910c, color, color2, false, false, new c61.e2(lVar), 16, null);
            ylVar.f214942n = true;
            spannableString.setSpan(ylVar, m0Var.f183908a, m0Var.f183909b, 17);
        }
    }

    public java.util.List oj(android.content.Context context, android.text.Spannable sendContent, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendContent, "sendContent");
        return (java.util.List) hc2.x0.g(sendContent.toString(), true, new c61.g2(sendContent, j18, j17, context, this)).f384366d;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f120748e.mo48813x58998cd();
        this.f120747d.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.aa aaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.aa) pf5.u.f435469a.e(zy2.b6.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.aa.class);
        aaVar.getClass();
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context2).registerActivityLifecycleCallbacks(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.z9(aaVar));
        or2.a aVar = or2.a.f429140a;
        or2.a.f429141b = 0;
        or2.a.f429142c = 0L;
        or2.a.f429143d = 0L;
        or2.a.f429144e = "";
        or2.a.f429145f = 0;
        or2.a.f429146g = 0;
        or2.a.f429147h = false;
        or2.a.f429148i = false;
        aVar.e();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f120748e.mo48814x2efc64();
        this.f120747d.mo48814x2efc64();
    }

    public final void pj(long j17, java.lang.String str, android.text.SpannableString spannableString, java.util.List list, yz5.p pVar) {
        int color = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6);
        int color2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m9 m9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m9) it.next();
            java.lang.String substring = m9Var.f183923c.substring(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl ylVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(substring, color, color2, false, true, new c61.i2(pVar, j17, str));
            int i17 = m9Var.f183921a;
            spannableString.setSpan(ylVar, i17, m9Var.f183922b + i17, 17);
        }
    }

    public boolean qj() {
        return this.f120751h.size() > 0;
    }

    public boolean rj(java.lang.String str) {
        nv2.d0 d0Var = nv2.d0.f422003e;
        return nv2.d0.c(nv2.d0.f422003e, str, false, false, 6, null);
    }

    public boolean sj(java.lang.String str) {
        return ((c61.l7) i95.n0.c(c61.l7.class)).Gk(str);
    }

    public boolean tj() {
        return this.f120750g.size() > 0;
    }

    public void uj(android.content.Context context, java.lang.String nickname, java.lang.String str, boolean z17, java.util.Map map, org.json.JSONObject jSONObject) {
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        if (context != null) {
            java.util.HashMap hashMap = this.f120749f;
            if (!hashMap.containsKey(nickname)) {
                new db2.u1(kz5.b0.c(nickname), null).l().K(new c61.k2(this, nickname, context, jSONObject, str, z17, map));
                return;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) hashMap.get(nickname);
            java.lang.String m76197x6c03c64c = c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m76197x6c03c64c) || m76197x6c03c64c == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "username nil");
                db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.clo, 0).show();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0,2,");
                sb6.append(nickname);
                sb6.append(",2,");
                sb6.append(str != null ? str : "");
                g0Var.mo68478xbd3cda5f(21172, sb6.toString());
                z18 = false;
            } else {
                wj(m76197x6c03c64c, context, context, jSONObject);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("0,2,");
                sb7.append(nickname);
                sb7.append(",1,");
                sb7.append(str != null ? str : "");
                g0Var2.mo68478xbd3cda5f(21172, sb7.toString());
                z18 = true;
            }
            if (z17) {
                Ij(map, z18);
            }
        }
    }

    public final void vj(java.lang.String clickUsername, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, android.content.Context context2, org.json.JSONObject jSONObject) {
        ec2.d e27;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", clickUsername);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        long j17 = c14994x9b99c079.f66939xc8a07680;
        if (j17 == 0) {
            j17 = c14994x9b99c079.m59260x51f8f5b0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent, j17, null, 0, 2, false, 0, c14994x9b99c079.f66939xc8a07680 == 0 ? null : c14994x9b99c079.m59229xb5af1dd5(), 192, null);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_entrance_type", 4);
        java.lang.String stringExtra = intent.getStringExtra("key_udf_kv");
        if (stringExtra == null) {
            stringExtra = "";
        }
        cl0.g gVar = stringExtra.length() > 0 ? new cl0.g(stringExtra) : new cl0.g();
        gVar.h("enter_udfkv", jSONObject);
        intent.putExtra("key_udf_kv", gVar.toString());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(context);
        if (e17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            r45.qt2 V6 = e17.V6();
            o3Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickUsername, "clickUsername");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6474xcad4809d c6474xcad4809d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6474xcad4809d();
            c6474xcad4809d.f138168d = c6474xcad4809d.b("FeedId", o3Var.Ui(c14994x9b99c079.m59251x5db1b11()), true);
            c6474xcad4809d.f138169e = c6474xcad4809d.b("SessionId", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri(), true);
            c6474xcad4809d.f138170f = c6474xcad4809d.b("PosterUsername", c14994x9b99c079.getFeedObject().m76836x6c03c64c(), true);
            c6474xcad4809d.f138171g = c6474xcad4809d.b("ViewerUsername", xy2.c.f(V6), true);
            c6474xcad4809d.f138172h = c6474xcad4809d.b("MentionedUsername", clickUsername, true);
            c6474xcad4809d.f138173i = V6.m75939xb282bd08(5);
            c6474xcad4809d.f138174j = c14994x9b99c079.getFeedObject().m76807x45979108();
            c6474xcad4809d.f138175k = c14994x9b99c079.getFeedObject().m76791xf4204902();
            c6474xcad4809d.f138176l = c14994x9b99c079.getFeedObject().m76758x8ed22866();
            c6474xcad4809d.k();
            o3Var.Zk(c6474xcad4809d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(context2);
        if (e18 == null || (e27 = zy2.ra.e2(e18, 0, 1, null)) == null) {
            return;
        }
        e27.a(new ec2.a(20, c14994x9b99c079.m59251x5db1b11(), c14994x9b99c079.m59229xb5af1dd5()));
    }

    public az2.j wi(long j17, java.lang.String str) {
        return new db2.g4(j17, "", 0, 2, "", true, null, null, 0L, null, false, false, null, null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, str, null, 402644928, null);
    }

    public final void wj(java.lang.String str, android.content.Context context, android.content.Context context2, org.json.JSONObject jSONObject) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", str);
        intent.putExtra("KEY_FINDER_SELF_FLAG", hc2.t.d(context2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, 0L, null, 0, 2, false, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        java.lang.String stringExtra = intent.getStringExtra("key_udf_kv");
        if (stringExtra == null) {
            stringExtra = "";
        }
        cl0.g gVar = stringExtra.length() > 0 ? new cl0.g(stringExtra) : new cl0.g();
        gVar.h("enter_udfkv", jSONObject);
        intent.putExtra("key_udf_kv", gVar.toString());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
    }

    public void xj(android.content.Context context, r45.qt2 qt2Var, long j17, java.lang.String username, java.lang.Long l17, int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        bd2.b.f100777a.j(context, qt2Var, j17, username, l17, i17, c19792x256d2725 != null ? new so2.h1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0)) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        if (((r13 == null || r13.isFinishing()) ? false : true) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void yj(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r20) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.p2.yj(com.tencent.mm.ui.MMActivity):void");
    }

    public void zj(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf finder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        vn2.q qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finder, "finder");
        boolean z17 = finder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa;
        if ((z17 || (finder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15554x67783102)) && !(finder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class));
            l3Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "on finder foreground " + finder);
            if (!(z17 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) finder).f210345n : false)) {
                or2.a aVar = or2.a.f429140a;
                int i17 = or2.a.f429145f + 1;
                or2.a.f429145f = i17;
                if (i17 >= 1) {
                    aVar.b(true, false);
                }
            }
            java.util.Set set = l3Var.f207665r;
            if (!set.contains(finder)) {
                boolean Di = ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Di(finder);
                if (!Di) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                    if (t70Var.U0()) {
                        if (!(set.size() > 0) && !l3Var.f207657g && !l3Var.f207656f) {
                            boolean z18 = finder.getIntent().getIntExtra("enter_finder_home_ui_type", 1) == 2;
                            boolean z19 = finder.getIntent().getIntExtra("enter_finder_home_ui_type", 1) == 4;
                            if (!l3Var.f207659i && !z18 && !z19) {
                                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).mj(1, null);
                                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(finder, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
                            }
                            l3Var.f207659i = false;
                            android.content.Intent intent = finder.getIntent();
                            if (intent != null) {
                                intent.putExtra("enter_finder_home_ui_type", 1);
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b2 b2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b2.f206498a;
                    boolean z27 = l3Var.f207656f;
                    boolean z28 = l3Var.f207657g;
                    if (t70Var.U0()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class));
                        boolean z29 = l3Var2.f207665r.size() > 0;
                        if (!z29) {
                            b2Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206982f);
                        }
                        if (!z29 && l3Var2.Di(finder)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskReporter", "onFinderForeground: isMainProcBackground=" + z27 + ", isScreenOff = " + z28);
                            if (z28) {
                                b2Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206987n);
                            } else {
                                java.util.Set enterFinderActivity = l3Var2.f207666s;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enterFinderActivity, "enterFinderActivity");
                                java.util.Iterator it = enterFinderActivity.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj = it.next();
                                        if (((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) obj) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                android.app.Activity activity = (android.app.Activity) obj;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799 activityC15036x1a33c799 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) activity : null;
                                java.util.Iterator it6 = enterFinderActivity.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj2 = it6.next();
                                        if (((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) obj2) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15074xeba4993) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                android.app.Activity activity2 = (android.app.Activity) obj2;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15074xeba4993 activityC15074xeba4993 = activity2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15074xeba4993 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15074xeba4993) activity2 : null;
                                if (z27) {
                                    if (activityC15036x1a33c799 != null) {
                                        activityC15036x1a33c799.f210117z = true;
                                    }
                                    if (activityC15074xeba4993 != null) {
                                        activityC15074xeba4993.f210289q2 = true;
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g5 g5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g5.f206586a;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g5.f206587b = java.lang.System.currentTimeMillis();
                                    g5Var.a(finder, true);
                                    b2Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206984h);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskReporter", "onFinderForeground: enter finder task from system ui");
                                } else {
                                    if (activityC15036x1a33c799 != null) {
                                        activityC15036x1a33c799.f210117z = false;
                                    }
                                    if (activityC15074xeba4993 != null) {
                                        activityC15074xeba4993.f210289q2 = false;
                                    }
                                    b2Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206985i);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskReporter", "onFinderForeground: enter finder task normally");
                                }
                            }
                            b2Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206983g);
                        }
                        java.lang.Class<?> cls = finder.getClass();
                        jz2.x0 x0Var = jz2.x0.f384287a;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, (java.lang.Class) ((jz5.n) jz2.x0.f384288b).mo141623x754a37bb())) {
                            b2Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206989p);
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(finder.getClass(), (java.lang.Class) ((jz5.n) jz2.x0.f384290d).mo141623x754a37bb())) {
                            b2Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206988o);
                        }
                    }
                }
                l3Var.f207657g = false;
                if (!Di) {
                    l3Var.f207663p = 0L;
                    set.add(finder);
                    l3Var.f207654d = false;
                    l3Var.f207655e = false;
                    if (!l3Var.f207660m) {
                        l3Var.f207660m = l3Var.Zi(finder);
                    }
                }
            }
            java.util.Set set2 = this.f120751h;
            if (set2.contains(finder)) {
                return;
            }
            if (((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Di(finder)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "onFinderForeground: ui is from nearby, ui = " + finder);
                return;
            }
            if (set2.size() == 0) {
                for (bs2.n1 n1Var : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class)).f204076e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n1Var.f105442c, "performEnterFinder: ");
                    n1Var.f105443d = true;
                    n1Var.f105444e.c("performEnterFinder");
                }
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Di(finder)) {
                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().Z();
                }
                wn2.f fVar = (wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class));
                fVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = fVar.f529055f;
                if (i0Var != null && (qVar = i0Var.f202475n) != null) {
                    java.lang.String stringExtra = finder.getIntent().getStringExtra("key_context_id");
                    qVar.d("onFinderForeground sessionInEnterTimeMs=" + qVar.f519892e + ",activity=" + finder.getClass().getSimpleName() + " contextId=" + stringExtra);
                    if (qVar.f519892e == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, qVar.f519888a)) {
                        qVar.e();
                    }
                }
            }
            set2.add(finder);
        }
    }
}
