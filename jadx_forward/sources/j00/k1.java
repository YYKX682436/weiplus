package j00;

@j95.b
/* loaded from: classes9.dex */
public final class k1 extends i95.w implements c00.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f378343d = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f378344e = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f378345f = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f378346g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(4);

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f378347h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f378348i = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f378349m = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f378350n = new j00.i0(this);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f378351o = jz5.h.b(j00.g1.f378309d);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f378352p = jz5.h.b(j00.f1.f378307d);

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f378353q = jz5.h.b(j00.l0.f378359d);

    /* renamed from: r, reason: collision with root package name */
    public final j00.s0 f378354r = new j00.s0(this);

    public static final android.content.Context Ai(j00.k1 k1Var, android.content.Context context) {
        k1Var.getClass();
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            return context2;
        }
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        }
        return context;
    }

    public static final void Bi(j00.k1 k1Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        bw5.s8 c17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String o17;
        k1Var.getClass();
        boolean N4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(f9Var.Q0());
        bw5.t8 b17 = n00.g.f415354a.b();
        if (N4) {
            if (b17 != null) {
                c17 = b17.b();
            }
            c17 = null;
        } else {
            if (b17 != null) {
                c17 = b17.c();
            }
            c17 = null;
        }
        if (c17 != null && c17.f114386q == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "preloadGiftImg, preload img");
        } else {
            if (c17 != null && c17.f114386q == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "preloadGiftImg, not preload img");
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "preloadGiftImg, default action");
                if (N4) {
                    return;
                }
            }
        }
        l15.c cVar = new l15.c();
        java.lang.String j17 = f9Var.j();
        java.lang.String str6 = "";
        if (j17 == null) {
            j17 = "";
        }
        cVar.m126728xdc93280d(j17);
        v05.b k17 = cVar.k();
        w05.d dVar = k17 != null ? (w05.d) k17.m75936x14adae67(k17.f513848e + 66) : null;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "preloadGiftImg, ecsGiftAppMsgInfo is null");
            return;
        }
        java.lang.String t17 = dVar.t();
        java.util.List list = k1Var.f378345f;
        if (list.contains(t17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "preloadGiftImg, giftMsgId: " + t17 + " has in limit list");
            return;
        }
        list.add(t17);
        if (dVar.s().size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "preloadGiftImg, gift msg list is empty");
            return;
        }
        java.lang.Object obj = dVar.s().get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        w05.e eVar = (w05.e) obj;
        k1Var.Zi(eVar.q());
        w05.f q17 = dVar.q();
        if (q17 == null || (str = q17.l()) == null) {
            str = "";
        }
        k1Var.Zi(str);
        if (q17 == null || (str2 = q17.k()) == null) {
            str2 = "";
        }
        k1Var.Zi(str2);
        if (q17 == null || (str3 = q17.j()) == null) {
            str3 = "";
        }
        k1Var.Zi(str3);
        if (q17 == null || (str4 = q17.n()) == null) {
            str4 = "";
        }
        k1Var.Zi(str4);
        if (q17 == null || (str5 = q17.p()) == null) {
            str5 = "";
        }
        k1Var.Zi(str5);
        if (q17 != null && (o17 = q17.o()) != null) {
            str6 = o17;
        }
        k1Var.Zi(str6);
        k1Var.Zi(eVar.t());
    }

    public static final void Di(j00.k1 k1Var, java.lang.String str) {
        java.lang.String str2;
        k1Var.getClass();
        new bw5.i8();
        try {
            str2 = new org.json.JSONObject(kz5.c1.k(new jz5.l("errCode", bw5.o8.EcsOpenRespRet_Fail), new jz5.l("errMsg", "cgi request failed"))).toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "json to string fail:" + e17);
            str2 = "{}";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        c00.d3 d3Var = (c00.d3) i95.n0.c(c00.d3.class);
        bw5.j8 j8Var = bw5.j8.EcsOpenEventType_receiveGiftPageExit;
        bw5.i8 i8Var = new bw5.i8();
        i8Var.f110027f = str2;
        i8Var.f110029h[3] = true;
        ((j00.o) d3Var).Ai(str, j8Var, i8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void rj(j00.k1 r6, java.util.Map r7, java.lang.String r8, java.lang.String r9) {
        /*
            int r0 = r8.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto La
            r0 = r1
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto Le
            return
        Le:
            r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "getEcsGiftOpenPagUnzipFilePath: "
            r0.<init>(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.EcsGiftMsgService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            if (r8 == 0) goto L2e
            int r0 = r8.length()
            if (r0 != 0) goto L2d
            goto L2e
        L2d:
            r1 = r2
        L2e:
            r0 = 0
            if (r1 == 0) goto L33
        L31:
            r8 = r0
            goto L88
        L33:
            java.lang.Class<com.tencent.mm.udr.e0> r1 = com.p314xaae8f345.mm.udr.e0.class
            i95.m r1 = i95.n0.c(r1)
            com.tencent.mm.udr.e0 r1 = (com.p314xaae8f345.mm.udr.e0) r1
            com.tencent.mm.udr.a1 r1 = (com.p314xaae8f345.mm.udr.a1) r1
            java.lang.String r4 = "ilinkres_b516b52d"
            java.lang.String r5 = "EcsGiftOpenAnimation"
            com.tencent.wechat.aff.udr.x r1 = r1.Ui(r4, r5)
            if (r1 == 0) goto L4c
            java.lang.String r1 = r1.c()
            goto L4d
        L4c:
            r1 = r0
        L4d:
            boolean r4 = com.p314xaae8f345.mm.vfs.w6.j(r1)
            if (r4 == 0) goto L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "getEcsGiftOpenPagUnzipFilePath, unzipFileDir exists: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4)
            com.tencent.mm.vfs.r6 r4 = new com.tencent.mm.vfs.r6
            r4.<init>(r1, r8)
            boolean r8 = r4.m()
            if (r8 == 0) goto L31
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "file exists, return path: "
            r8.<init>(r1)
            java.lang.String r1 = r4.o()
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r8)
            java.lang.String r8 = r4.o()
        L88:
            if (r8 == 0) goto Lab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "openEcsGiftReceivePage, "
            r1.<init>(r4)
            r1.append(r9)
            java.lang.String r4 = ": "
            r1.append(r4)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            if (r7 == 0) goto Lab
            r7.put(r9, r8)
            jz5.f0 r7 = jz5.f0.f384359a
            r0 = r7
        Lab:
            if (r0 != 0) goto Lb2
            java.util.concurrent.atomic.AtomicBoolean r6 = r6.f378348i
            r6.set(r2)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.k1.rj(j00.k1, java.util.Map, java.lang.String, java.lang.String):void");
    }

    public static final void wi(j00.k1 k1Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        k1Var.getClass();
        try {
            if (k1Var.f378348i.get()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "checkResourceReadyByMsg, resource is ready");
                return;
            }
            l15.c cVar = new l15.c();
            java.lang.String j17 = f9Var.j();
            if (j17 == null) {
                j17 = "";
            }
            cVar.m126728xdc93280d(j17);
            v05.b k17 = cVar.k();
            w05.d dVar = k17 != null ? (w05.d) k17.m75936x14adae67(k17.f513848e + 66) : null;
            if (dVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "checkOpenResourceReady, ecsGiftAppMsgInfo is null");
                return;
            }
            w05.c p17 = dVar.p();
            java.lang.String k18 = p17 != null ? p17.k() : null;
            w05.c p18 = dVar.p();
            k1Var.Ui(k18, p18 != null ? p18.j() : null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "checkResourceReadyByMsg, " + e17);
        }
    }

    public boolean Ni(com.p314xaae8f345.mm.p2621x8fb0427b.f9 oldMsg, com.p314xaae8f345.mm.p2621x8fb0427b.f9 newMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldMsg, "oldMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMsg, "newMsg");
        if (oldMsg.mo78013xfb85f7b0() == -2113929167 || oldMsg.mo78013xfb85f7b0() == -2130706383) {
            if (newMsg.mo78013xfb85f7b0() == -2113929167 || newMsg.mo78013xfb85f7b0() == -2130706383) {
                l15.c cVar = new l15.c();
                java.lang.String j17 = oldMsg.j();
                if (j17 == null) {
                    j17 = "";
                }
                cVar.m126728xdc93280d(j17);
                v05.b k17 = cVar.k();
                w05.d dVar = k17 != null ? (w05.d) k17.m75936x14adae67(k17.f513848e + 66) : null;
                if (dVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, oldEcsGiftAppMsgInfo is null");
                    return false;
                }
                l15.c cVar2 = new l15.c();
                java.lang.String j18 = newMsg.j();
                cVar2.m126728xdc93280d(j18 != null ? j18 : "");
                v05.b k18 = cVar2.k();
                w05.d dVar2 = k18 != null ? (w05.d) k18.m75936x14adae67(k18.f513848e + 66) : null;
                if (dVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, newEcsGiftAppMsgInfo is null");
                    return false;
                }
                java.lang.String t17 = dVar2.t();
                java.lang.String t18 = dVar.t();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, oldGiftMsgId:" + t18 + ", newGiftMsgId:" + t17);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(t17, t18)) {
                    ((b00.q2) ((c00.b4) i95.n0.c(c00.b4.class))).wi("EcsGiftMsgUpdateError", 2, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, msg id is not equal");
                    return false;
                }
                if (dVar2.s().isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, new gift msg list is empty");
                    return false;
                }
                java.lang.Object obj = dVar2.s().get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                w05.e eVar = (w05.e) obj;
                long l17 = eVar.l();
                long w17 = eVar.w();
                if (dVar.s().isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, old gift msg list is empty");
                    return false;
                }
                java.lang.Object obj2 = dVar.s().get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                w05.e eVar2 = (w05.e) obj2;
                long l18 = eVar2.l();
                long w18 = eVar2.w();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, oldGiftMsgStatus:" + l18 + ", oldGiftMsgStatusVersion:" + w18 + ", newGiftMsgStatus:" + l17 + ", newGiftMsgStatusVersion:" + w17);
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(t18, t17) && w17 >= w18;
            }
        }
        ((b00.q2) ((c00.b4) i95.n0.c(c00.b4.class))).wi("EcsGiftMsgUpdateError", 1, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, msg is not ecs gift msg");
        return false;
    }

    public final boolean Ri(java.lang.String str) {
        if (!aj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "canHandleConversationDigest, toggle close, not show red digest");
            return false;
        }
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, talker is null");
            return false;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "canHandleConversationDigest, acc not ready");
            return false;
        }
        java.lang.String str2 = ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f145050c;
        if (str2 == null) {
            str2 = "";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "canHandleConversationDigest, is in current conv");
            return false;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str) != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "canHandleConversationDigest, conv is null");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: Exception -> 0x019b, TryCatch #0 {Exception -> 0x019b, blocks: (B:97:0x000e, B:7:0x001c, B:13:0x002a, B:15:0x003f, B:20:0x0051, B:24:0x009b, B:25:0x00d9, B:29:0x00f1, B:72:0x00ff, B:79:0x00e7, B:80:0x00ab, B:82:0x00b3, B:83:0x00c9, B:84:0x0095, B:85:0x0061, B:87:0x0069, B:88:0x007f, B:89:0x0049), top: B:96:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113 A[Catch: Exception -> 0x018a, TRY_ENTER, TryCatch #1 {Exception -> 0x018a, blocks: (B:36:0x0113, B:40:0x011e, B:41:0x0124, B:44:0x012c, B:45:0x0132, B:47:0x0137, B:49:0x013f, B:50:0x0143, B:52:0x0158, B:56:0x0170, B:61:0x017e, B:63:0x018e, B:65:0x0166, B:68:0x0197, B:92:0x019f), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ui(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.k1.Ui(java.lang.String, java.lang.String):void");
    }

    public void Vi(java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            if (talker.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "clearEcsGiftRedLabel, talker is empty");
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(talker);
            if (p17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "clearEcsGiftRedLabel, conv is empty");
                return;
            }
            if (p17.d2(4096)) {
                p17.e2(4096);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "clearEcsGiftRedLabel, convRet:" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, talker, true, true));
            }
            ((ku5.t0) ku5.t0.f394148d).h(new j00.j0(talker), "MicroMsg.EcsGiftMsgService");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EcsGiftMsgService", e17, "clearEcsGiftRedLabel error", new java.lang.Object[0]);
        }
    }

    public final void Zi(java.lang.String str) {
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "downloadEcsGiftImage, empty url");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "downloadEcsGiftImage, start preload img:".concat(str));
        java.lang.String valueOf = java.lang.String.valueOf((java.lang.String) ((jz5.n) ((j00.d2) ((c00.m3) i95.n0.c(c00.m3.class))).f378279d).mo141623x754a37bb());
        n11.a b17 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f423616g = valueOf;
        fVar.f423611b = true;
        b17.d(str, fVar.a(), new j00.k0(str));
    }

    public boolean aj() {
        return ((java.lang.Number) ((jz5.n) this.f378351o).mo141623x754a37bb()).intValue() > 0;
    }

    public java.lang.String bj(java.lang.String content) {
        java.lang.String str;
        w05.d dVar;
        java.lang.String C;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(content);
        v05.b k17 = cVar.k();
        java.lang.String m75945x2fec8307 = k17 != null ? k17.m75945x2fec8307(k17.f449898d + 2) : null;
        java.lang.String str2 = "";
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("generate gift msg summary with illegal msg: ");
            sb6.append(k17 != null ? k17.m75945x2fec8307(k17.f449898d + 2) : null);
            sb6.append('}');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", sb6.toString());
            return "";
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        if (k17 == null || (str = k17.m75945x2fec8307(k17.f449898d + 2)) == null) {
            str = "";
        }
        objArr[0] = str;
        if (k17 != null && (dVar = (w05.d) k17.m75936x14adae67(k17.f513848e + 66)) != null && (C = dVar.C()) != null) {
            str2 = C;
        }
        objArr[1] = str2;
        java.lang.String format = java.lang.String.format("[%s] %s", java.util.Arrays.copyOf(objArr, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    public java.lang.String cj(java.lang.String templateTitle, int i17, java.lang.String talker, java.lang.String recUserName, android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateTitle, "templateTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recUserName, "recUserName");
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String f17 = c01.a2.f(recUserName, talker);
        if (!r26.n0.B(templateTitle, "$nickname$", false)) {
            return templateTitle;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        java.lang.String t17 = r26.i0.t(templateTitle, "$nickname$", f17, false);
        if (textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "getEcsExclusiveGiftTitle, titleTv is null");
            return t17;
        }
        int width = textView.getWidth();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "getEcsExclusiveGiftTitle viewWidth: %s", java.lang.Integer.valueOf(width));
        if (width <= 0) {
            width = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561200c4);
        }
        java.lang.String substring = t17.substring(t17.length() - i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        java.lang.String substring2 = t17.substring(0, t17.length() - i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        float measureText = textView.getPaint().measureText(substring);
        float measureText2 = textView.getPaint().measureText(substring2);
        float measureText3 = textView.getPaint().measureText("...");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "getEcsExclusiveGiftTitle, head:" + substring2 + ", fixedTail:" + substring + ", headSize:" + measureText2 + ", viewWidth:" + width + ", tailSize:" + measureText);
        float f18 = ((float) width) - measureText;
        if (measureText2 <= f18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "getEcsExclusiveGiftTitle, return head + fixedTail");
            return substring2.concat(substring);
        }
        if (f18 <= measureText3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "getEcsExclusiveGiftTitle, availableWidth <= ellipsisSize");
            return "...".concat(substring);
        }
        int length = substring2.length();
        int i18 = 0;
        int i19 = 0;
        while (i18 <= length) {
            int i27 = (i18 + length) / 2;
            java.lang.String substring3 = substring2.substring(0, i27);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
            if (textView.getPaint().measureText(substring3) + measureText3 <= f18) {
                i18 = i27 + 1;
                i19 = i27;
            } else {
                length = i27 - 1;
            }
        }
        java.lang.String substring4 = substring2.substring(0, i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "getEcsExclusiveGiftTitle, displayHead:" + substring4 + ", fixedTail:" + substring);
        return substring4 + "..." + substring;
    }

    public int fj(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        if (!aj()) {
            int i17 = h20.c.f359796a;
            return 0;
        }
        if (l4Var == null) {
            int i18 = h20.c.f359796a;
            return 0;
        }
        java.lang.String h17 = l4Var.h1();
        if (h17 == null || h17.length() == 0) {
            int i19 = h20.c.f359796a;
            return 0;
        }
        w20.g wi6 = ((w20.d) ((c00.b3) i95.n0.c(c00.b3.class))).wi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
        w20.f y07 = wi6.y0(h17);
        if (y07 == null) {
            int i27 = h20.c.f359796a;
            return 0;
        }
        int i28 = y07.f67776xbdb2116c;
        int i29 = y07.f67775xc4d9c6fd;
        int i37 = h20.c.f359796a;
        return i29 == 2 ? i29 : i28 > 0 ? 1 : 0;
    }

    public java.lang.String hj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String msgXml) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgXml, "msgXml");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(msg.Q0()) && msg.A0() == 0) {
            l15.c cVar = new l15.c();
            java.lang.String j17 = msg.j();
            if (j17 == null) {
                j17 = "";
            }
            cVar.m126728xdc93280d(j17);
            java.lang.String m144875xc0914d16 = cVar.m144875xc0914d16();
            v05.b k17 = cVar.k();
            w05.d dVar = k17 != null ? (w05.d) k17.m75936x14adae67(k17.f513848e + 66) : null;
            if (dVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "handleGroupChatMsgIfNeeded, ecsGiftAppMsgInfo is null");
                return msgXml;
            }
            if (!(m144875xc0914d16 == null || m144875xc0914d16.length() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "handleGroupChatSenderMsg, giftMsgId:" + dVar.t() + ", msgId:" + msg.m124847x74d37ac6() + ", talker:" + msg.Q0() + ", isChatroom msg, fromUserName:" + m144875xc0914d16);
                java.lang.String A = c01.w9.A(msgXml, m144875xc0914d16);
                return A == null ? msgXml : A;
            }
            java.lang.String s17 = c01.w9.s(msg.j());
            if (s17 == null) {
                s17 = c01.w9.s(msgXml);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "handleGroupChatSenderMsg, giftMsgId:" + dVar.t() + ", msgId:" + msg.m124847x74d37ac6() + ", talker:" + msg.Q0() + ", isChatroom msg, sender:" + s17);
            if (s17 != null) {
                if (s17.length() > 0) {
                    java.lang.String A2 = c01.w9.A(msgXml, s17);
                    return A2 == null ? msgXml : A2;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "handleGroupChatSenderMsg, return origin msg xml");
        return msgXml;
    }

    public final void ij(java.lang.String str, java.lang.String str2, boolean z17, java.lang.Long l17) {
        boolean z18;
        int i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, xml:" + str + ", touser:" + str2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, xml:" + str + ", touser:" + str2);
        l15.c cVar = new l15.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        cVar.m126728xdc93280d(str);
        v05.b k17 = cVar.k();
        w05.d dVar = k17 != null ? (w05.d) k17.m75936x14adae67(k17.f513848e + 66) : null;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, ecsGiftAppMsgInfo is null");
            return;
        }
        java.lang.String t17 = dVar.t();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "isGiftMsgIdHandled, giftMsgId: " + t17);
        java.util.List giftMsgIdList = this.f378343d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(giftMsgIdList, "giftMsgIdList");
        synchronized (giftMsgIdList) {
            if (this.f378343d.contains(t17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "isGiftMsgIdHandled, giftMsgId: " + t17 + " contains");
                z18 = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "isGiftMsgIdHandled, giftMsgId: " + t17 + " not contain");
                this.f378343d.add(t17);
                if (this.f378343d.size() >= 100) {
                    this.f378343d.remove(0);
                }
                z18 = false;
            }
        }
        if (z18 || n00.d.f415348a.a().D0(t17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, giftMsgId:" + t17 + " is handled or in db");
            n00.e y07 = n00.d.f415348a.a().y0(t17);
            java.lang.String str3 = y07.f67885x3e123854;
            long j17 = y07.f67884x9a279b8a;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k18 = pt0.f0.f439742b1.k(str3, j17);
            if (k18 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg check update svr id " + k18.I0() + " to " + l17);
                if (l17 != null) {
                    k18.o1(l17.longValue());
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, k18, true);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg get msg null");
            }
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str2);
            r05.k kVar = new r05.k();
            kVar.m126731xdc93280d(str, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, start assemble msg, giftMsgId:" + t17 + ", talker:" + str2 + ", type:" + kVar.m75939xb282bd08(kVar.f449898d + 6));
            if (kVar.m75939xb282bd08(kVar.f449898d + 6) == 115) {
                i17 = -2130706383;
            } else {
                kVar.m75939xb282bd08(kVar.f449898d + 6);
                i17 = -2113929167;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.d1(str);
            f9Var.r1(2);
            f9Var.u1(str2);
            f9Var.e1(c01.w9.o(str2));
            f9Var.j1(1);
            f9Var.m124850x7650bebc(i17);
            if (l17 != null) {
                long longValue = l17.longValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, insert msg, with svrId:" + longValue);
                f9Var.o1(longValue);
            }
            long M9 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
            if (M9 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, insert msg failed, msgId:" + M9);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                mj(str2, f9Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, msgId is " + M9);
            }
        }
        if (z17) {
            long j18 = -1;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "tryGetMsgId, xml:".concat(str));
            } else {
                l15.c cVar2 = new l15.c();
                cVar2.m126728xdc93280d(str);
                v05.b k19 = cVar2.k();
                w05.d dVar2 = k19 != null ? (w05.d) k19.m75936x14adae67(k19.f513848e + 66) : null;
                if (dVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "tryGetMsgId, ecsGiftAppMsgInfo is null");
                } else {
                    j18 = n00.d.f415348a.a().y0(dVar2.t()).f67884x9a279b8a;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, jump with msgId:" + j18);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str2);
            intent.putExtra("finish_direct", false);
            intent.putExtra("msg_local_id", j18);
            intent.putExtra("from_global_search", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        }
    }

    public void mj(java.lang.String talker, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        l15.c cVar = new l15.c();
        java.lang.String j17 = msg.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.m126728xdc93280d(j17);
        v05.b k17 = cVar.k();
        w05.d dVar = k17 != null ? (w05.d) k17.m75936x14adae67(k17.f513848e + 66) : null;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "insertToEcsGiftMsgStorage, ecsGiftAppMsgInfo is null");
            return;
        }
        java.lang.String t17 = dVar.t();
        java.lang.String j18 = dVar.j();
        long m124847x74d37ac6 = msg.m124847x74d37ac6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "insertToEcsGiftMsgStorage, giftMsgId:" + t17 + ", msgId:" + m124847x74d37ac6 + ", talker:" + talker);
        n00.d.f415348a.a().z0(t17, m124847x74d37ac6, talker, false, j18, false);
    }

    public final boolean nj(java.lang.String str) {
        java.lang.String k17 = gm0.j1.b().k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "isExclusiveGiftReceiver, current user:" + k17 + ", recv user:" + str);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, k17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "isExclusiveGiftReceiver");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "is not ExclusiveGiftReceiver");
        return false;
    }

    public final boolean oj(bw5.bf0 bf0Var) {
        if (bf0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, resp is null");
            return false;
        }
        if (bf0Var.b() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, resp present_order_info is null");
            return false;
        }
        if (bf0Var.b().b() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, resp present_order_info ecsgift is null");
            return false;
        }
        if (bf0Var.b().b().c() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, resp present_order_info ecsgift gifts is null");
            return false;
        }
        if (bf0Var.b().b().c().f113657d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, resp present_order_info ecsgift gifts gift is null");
            return false;
        }
        if (bf0Var.b().b().c().f113657d.size() >= 1) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, resp gift is null");
        return false;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40963x40b15f2e(this.f378354r);
    }

    public void pj(android.content.Context context, java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "openEcsGiftGivePreviewPOIPage, params: " + params);
        java.lang.String k17 = gm0.j1.b().k();
        b00.p0 p0Var = b00.p0.f98280a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        java.lang.String c17 = p0Var.c(k17);
        params.put("giverUserName", k17);
        params.put("giverNickName", c17);
        j00.y yVar = j00.y.f378479a;
        p3325xe03a0797.p3326xc267989b.l.d(j00.y.f378480b, null, null, new j00.x("ecs_gift_give_preview_poi", params, context, null, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qj(android.content.Context r18, boolean r19, boolean r20, java.lang.String r21, long r22, java.util.Map r24, yz5.a r25) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.k1.qj(android.content.Context, boolean, boolean, java.lang.String, long, java.util.Map, yz5.a):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    public final void sj(android.content.Context context, java.util.Map map, yz5.a aVar, yz5.q qVar) {
        java.lang.Object obj = map.get("orderId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "requestPresentOrderInfoWithLoading, orderId is empty!");
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(map.get("ecsOpenEventId"));
        java.lang.Object orDefault = map.getOrDefault("isGiver", java.lang.Boolean.FALSE);
        java.lang.Boolean bool = orDefault instanceof java.lang.Boolean ? (java.lang.Boolean) orDefault : null;
        ?? booleanValue = bool != null ? bool.booleanValue() : 0;
        java.lang.Object orDefault2 = map.getOrDefault("cgiScene", 1);
        java.lang.Integer num = orDefault2 instanceof java.lang.Integer ? (java.lang.Integer) orDefault2 : null;
        int intValue = num != null ? num.intValue() : 1;
        bw5.af0 af0Var = new bw5.af0();
        af0Var.f106709d = java.lang.Long.parseLong(str2);
        boolean[] zArr = af0Var.f106714i;
        zArr[2] = true;
        af0Var.f106710e = intValue;
        zArr[3] = true;
        af0Var.f106712g = 1;
        zArr[5] = true;
        af0Var.f106713h = booleanValue;
        zArr[6] = true;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = af0Var;
        lVar.f152198b = new bw5.bf0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mmec_getpresentorder";
        lVar.f152200d = 9823;
        ((ku5.t0) ku5.t0.f394148d).B(new j00.c1(this, context, lVar.a(), str2, aVar, valueOf, map, qVar));
    }

    public boolean tj(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        if (l4Var == null || !aj()) {
            return false;
        }
        if (l4Var.d2(4096)) {
            return true;
        }
        int fj6 = fj(l4Var);
        int i17 = h20.c.f359796a;
        if (fj6 <= 0) {
            return false;
        }
        l4Var.j1(l4Var.u0() | 4096);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(l4Var, l4Var.h1(), true, true);
        return true;
    }

    public void uj(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.util.Map map) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        int i17;
        java.lang.String str16;
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        l15.c cVar = new l15.c();
        java.lang.String j17 = msg.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.m126728xdc93280d(j17);
        v05.b k17 = cVar.k();
        w05.d dVar = k17 != null ? (w05.d) k17.m75936x14adae67(k17.f513848e + 66) : null;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "startEcsGiftLogic, ecsGiftAppMsgInfo is null");
            return;
        }
        boolean z17 = msg.A0() == 1;
        int m173059xce6ddd64 = dVar.m173059xce6ddd64();
        if (m173059xce6ddd64 != 1 && m173059xce6ddd64 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "startEcsGiftLogic, open with jumpInfo");
            if (dVar.x() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "startEcsGiftLogic, giftAppMsg jumpInfo is null");
                return;
            }
            if (context != null) {
                i95.m c17 = i95.n0.c(pq.q.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                pq.q qVar = (pq.q) c17;
                pq.a aVar = new pq.a(context);
                w05.g x17 = dVar.x();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x17);
                bw5.x7 x7Var = new bw5.x7();
                x7Var.f116506d = x17.k();
                boolean[] zArr = x7Var.f116517r;
                zArr[1] = true;
                w05.k n17 = x17.n();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17 != null ? n17.m173063x74292566() : null)) {
                    bw5.u7 u7Var = new bw5.u7();
                    w05.k n18 = x17.n();
                    u7Var.e(n18 != null ? n18.m173063x74292566() : null);
                    w05.k n19 = x17.n();
                    u7Var.f115288e = n19 != null ? n19.j() : null;
                    u7Var.f115301u[2] = true;
                    w05.k n27 = x17.n();
                    u7Var.f(n27 != null ? n27.m173064xfb83cc9b() : null);
                    w05.k n28 = x17.n();
                    u7Var.g(n28 != null ? n28.m173065x7520bed6() : 1157);
                    w05.k n29 = x17.n();
                    u7Var.i(n29 != null ? n29.k() : null);
                    w05.k n37 = x17.n();
                    u7Var.j(n37 != null ? n37.l() : 0);
                    x7Var.k(u7Var);
                }
                w05.j l17 = x17.l();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17 != null ? l17.m173061x74292566() : null)) {
                    bw5.q7 q7Var = new bw5.q7();
                    w05.j l18 = x17.l();
                    q7Var.f113512d = l18 != null ? l18.m173061x74292566() : null;
                    boolean[] zArr2 = q7Var.f113520o;
                    zArr2[1] = true;
                    w05.j l19 = x17.l();
                    q7Var.f113513e = l19 != null ? l19.m173062xfb83cc9b() : null;
                    zArr2[2] = true;
                    w05.j l27 = x17.l();
                    q7Var.f113514f = l27 != null ? l27.k() : null;
                    zArr2[3] = true;
                    w05.j l28 = x17.l();
                    q7Var.f113515g = l28 != null ? l28.j() : null;
                    zArr2[4] = true;
                    x7Var.f116508f = q7Var;
                    zArr[3] = true;
                }
                w05.i j18 = x17.j();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j18 != null ? j18.m173060xb5887639() : null)) {
                    bw5.o7 o7Var = new bw5.o7();
                    w05.i j19 = x17.j();
                    o7Var.f112534d = j19 != null ? j19.m173060xb5887639() : null;
                    o7Var.f112539i[1] = true;
                    x7Var.f116509g = o7Var;
                    zArr[4] = true;
                }
                pq.q.Lb(qVar, aVar, x7Var, null, 4, null);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "hy: no context retrieved!");
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "startEcsGiftLogic, subtype is " + m173059xce6ddd64);
        if (dVar.s().size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "startEcsGiftLogic, gift msg list is empty");
            return;
        }
        java.lang.Object obj = dVar.s().get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        w05.e eVar = (w05.e) obj;
        b00.p0 p0Var = b00.p0.f98280a;
        java.lang.String y07 = msg.y0();
        if (y07 == null) {
            y07 = "";
        }
        java.lang.String c18 = p0Var.c(y07);
        java.lang.String T0 = msg.T0();
        if (T0 == null) {
            T0 = "";
        }
        java.lang.String c19 = p0Var.c(T0);
        boolean N4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(msg.Q0());
        int wi6 = N4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(msg.Q0()) : 1;
        n00.e y08 = n00.d.f415348a.a().y0(dVar.t());
        java.lang.String j27 = dVar.j();
        if ((j27.length() == 0) && (j27 = y08.f67880x4cbf2be2) == null) {
            j27 = "";
        }
        boolean z18 = y08.f67882xa281e91b;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("wishContent", dVar.C());
        linkedHashMap.put("orderId", eVar.n());
        linkedHashMap.put("giftMsgId", dVar.t());
        linkedHashMap.put("isGiver", java.lang.Boolean.valueOf(z17));
        linkedHashMap.put("giftStatus", java.lang.Long.valueOf(eVar.l()));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("imgUrl", eVar.q());
        linkedHashMap2.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, eVar.s());
        linkedHashMap2.put("saleParamsText", eVar.r());
        linkedHashMap.put("skuCard", linkedHashMap2);
        linkedHashMap.put("isBoxUnWrapped", java.lang.Integer.valueOf(z18 ? 1 : 0));
        linkedHashMap.put("isGroupChatroom", java.lang.Boolean.valueOf(N4));
        linkedHashMap.put("appMsgSign", j27);
        java.lang.String Q0 = msg.Q0();
        if (Q0 == null) {
            Q0 = "";
        }
        linkedHashMap.put("chatroomId", Q0);
        linkedHashMap.put("groupMemberCnt", java.lang.Integer.valueOf(wi6));
        linkedHashMap.put("giftTakeMethod", java.lang.Integer.valueOf(dVar.B()));
        linkedHashMap.put("detailStatusWording", eVar.k());
        linkedHashMap.put("presentCntWording", eVar.o());
        linkedHashMap.put("exclusiveRecUserName", dVar.z());
        w05.f q17 = dVar.q();
        if (q17 == null || (str = q17.l()) == null) {
            str = "";
        }
        linkedHashMap.put("giftMsgCover", str);
        if (q17 == null || (str2 = q17.k()) == null) {
            str2 = "";
        }
        linkedHashMap.put("giftBoxOuterCover", str2);
        if (q17 == null || (str3 = q17.j()) == null) {
            str3 = "";
        }
        linkedHashMap.put("giftBoxInnerCover", str3);
        if (q17 == null || (str4 = q17.n()) == null) {
            str4 = "";
        }
        linkedHashMap.put("giftNormalCover", str4);
        if (q17 == null || (str5 = q17.p()) == null) {
            str5 = "";
        }
        linkedHashMap.put("videorecvcover", str5);
        if (q17 == null || (str6 = q17.o()) == null) {
            str6 = "";
        }
        linkedHashMap.put("videonomalcover", str6);
        linkedHashMap.put("skuTitleTagName", eVar.t());
        linkedHashMap.put("fromProductSet", java.lang.Integer.valueOf(dVar.o()));
        java.util.LinkedList A = dVar.A();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(A, 10));
        java.util.Iterator it = A.iterator();
        while (it.hasNext()) {
            arrayList.add(((w05.n) it.next()).j());
        }
        linkedHashMap.put("skuImgUrlLists", arrayList);
        linkedHashMap.put("drawTimeWording", dVar.l());
        linkedHashMap.put("lotteryMethod", java.lang.Integer.valueOf(dVar.y()));
        java.util.LinkedList r17 = dVar.r();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(r17, 10));
        java.util.Iterator it6 = r17.iterator();
        while (it6.hasNext()) {
            arrayList2.add(java.lang.Byte.valueOf((byte) ((java.lang.Number) it6.next()).intValue()));
        }
        linkedHashMap.put("giftLabels", kz5.n0.N0(arrayList2));
        w05.c p17 = dVar.p();
        if (p17 == null || (str7 = p17.k()) == null) {
            str7 = "";
        }
        linkedHashMap.put("openFrontAnimationResName", str7);
        if (p17 == null || (str8 = p17.j()) == null) {
            str8 = "";
        }
        linkedHashMap.put("openBackgroundAnimationResName", str8);
        linkedHashMap.put("delivery_method", java.lang.Integer.valueOf(eVar.j()));
        w05.m p18 = eVar.p();
        if (p18 == null || (str9 = p18.k()) == null) {
            str9 = "";
        }
        linkedHashMap.put("secretImg", str9);
        if (p18 == null || (str10 = p18.l()) == null) {
            str10 = "";
        }
        linkedHashMap.put("secretImgWithBow", str10);
        if (p18 == null || (str11 = p18.j()) == null) {
            str11 = "";
        }
        linkedHashMap.put("orignialImg", str11);
        if (p18 == null || (str12 = p18.o()) == null) {
            str12 = "";
        }
        linkedHashMap.put("secretTitle", str12);
        if (p18 == null || (str13 = p18.n()) == null) {
            str13 = "";
        }
        linkedHashMap.put("secretSkuDescription", str13);
        linkedHashMap.put("isSecretPresent", java.lang.Boolean.valueOf((p18 != null ? p18.q() : 0) != 0));
        linkedHashMap.put("isRevealed", java.lang.Boolean.valueOf((p18 != null ? p18.p() : 0) != 0));
        if (p17 == null || (str14 = p17.l()) == null) {
            str14 = "";
        }
        linkedHashMap.put("mbBasicItemType", str14);
        if (p17 == null || (str15 = p17.n()) == null) {
            str15 = "";
        }
        linkedHashMap.put("mbFlyItemType", str15);
        linkedHashMap.put("mbMiniVersion", java.lang.Long.valueOf(p17 != null ? p17.o() : 0L));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (N4) {
            java.lang.String j28 = msg.j();
            if (j28 == null) {
                j28 = "";
            }
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(j28, "msg", null);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftUtil", "getAppMsgFromUserName fail, value is null");
                str16 = null;
            } else {
                str16 = (java.lang.String) d17.get(".msg.fromusername");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftUtil", "getAppMsgFromUserName, fromUserName:" + str16);
            }
            if (str16 != null) {
                java.lang.String c27 = p0Var.c(str16);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str16);
                java.lang.String d18 = n07 != null ? n07.d() : null;
                if (d18 == null) {
                    d18 = "";
                }
                linkedHashMap.put("giverNickName", c27);
                linkedHashMap.put("giverHeadImgUrl", d18);
            }
            i17 = 1;
            linkedHashMap.put("sendType", 1);
            linkedHashMap.put("presentStyleType", 1);
            linkedHashMap.put("isReceiveGiftDisable", java.lang.Integer.valueOf(dVar.k()));
            java.lang.String T02 = msg.T0();
            if (T02 == null) {
                T02 = "";
            }
            linkedHashMap.put("recipientUserName", T02);
        } else {
            i17 = 1;
            java.lang.String y09 = msg.y0();
            if (y09 == null) {
                y09 = "";
            }
            linkedHashMap.put("giverUserName", y09);
            linkedHashMap.put("giverNickName", c18);
            java.lang.String T03 = msg.T0();
            if (T03 == null) {
                T03 = "";
            }
            linkedHashMap.put("recipientUserName", T03);
            linkedHashMap.put("recipientNickName", c19);
            linkedHashMap.put("sendType", 0);
            linkedHashMap.put("presentStyleType", 0);
        }
        qj(context, z17, N4, dVar.t(), eVar.l(), linkedHashMap, null);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("ecs_gift_msg", "view_clk", kz5.c1.k(new jz5.l("type", java.lang.Integer.valueOf(N4 ? 2 : i17)), new jz5.l("group_member_uv", java.lang.Integer.valueOf(wi6)), new jz5.l("chatroom_id", msg.Q0()), new jz5.l("gift_msg_id", dVar.t()), new jz5.l("order_id", eVar.n()), new jz5.l("gift_status", java.lang.Long.valueOf(eVar.l())), new jz5.l("is_sender", java.lang.Integer.valueOf(msg.A0())), new jz5.l("take_method", java.lang.Integer.valueOf(dVar.B()))), 12, false);
    }

    public final void vj() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f378349m;
        if (atomicBoolean.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "triggerOpenPagUdrCheck, already checking UDR, skip");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "triggerOpenPagUdrCheck, triggering UDR check");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
        qVar.c("ilinkres_b516b52d");
        atomicBoolean.set(true);
        ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Di(qVar, new j00.h1(this));
    }
}
