package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public abstract class hd {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f283212a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f283213b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f283214c = new java.util.concurrent.ConcurrentHashMap();

    public static void a(final android.content.Context context, final com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, final java.util.List msgList, final boolean z17, final com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType, final int i17) {
        int mo78013xfb85f7b0;
        ot0.q v17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(msgList) && msgList.size() == 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) msgList.get(0);
            if (f9Var != null && ((mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0()) == 754974769 || mo78013xfb85f7b0 == 771751985 || mo78013xfb85f7b0 == 973078577 || ((v17 = ot0.q.v(f9Var.j())) != null && v17.f430199i == 24))) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) msgList.get(0);
                r45.w43 w43Var = new r45.w43();
                w43Var.f470405d = java.lang.String.valueOf(c01.id.c());
                w43Var.f470406e = 49;
                w43Var.f470407f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g((f9Var2.mo78013xfb85f7b0() == 754974769 ? c01.w9.r(f9Var2.j()) : f9Var2.j()).getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(w43Var);
                u(context);
                ((dk5.s5) tg3.t1.a()).wi(context, c(wWAppType), arrayList, new tg3.x0() { // from class: com.tencent.mm.ui.chatting.hd$$b
                    @Override // tg3.x0
                    public final void a(int i18, int i19, java.util.List list, byte[] bArr) {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.f283212a;
                        if (u3Var != null) {
                            u3Var.dismiss();
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.f283212a = null;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "onCallback() called with: errorType = [" + i18 + "], errorCode = [" + i19 + "], resultList = [" + list + "]");
                        if (i18 == 0 && i19 == 0) {
                            return;
                        }
                        android.content.Context context2 = context;
                        db5.t7.g(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h0a));
                    }
                });
                return;
            }
        }
        sc5.k kVar = sc5.k.f488122a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        java.util.ArrayList arrayList2 = (java.util.ArrayList) sc5.k.f488126e;
        arrayList2.clear();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) sc5.k.f488127f;
        arrayList3.clear();
        java.util.ArrayList arrayList4 = (java.util.ArrayList) sc5.k.f488128g;
        arrayList4.clear();
        java.util.Iterator it = msgList.iterator();
        while (true) {
            r45.ul5 ul5Var = null;
            if (!it.hasNext()) {
                if (arrayList2.size() + arrayList3.size() <= 0) {
                    g(context, z3Var, msgList, z17, wWAppType, i17);
                    return;
                }
                u(context);
                f283213b = true;
                ((java.util.concurrent.ConcurrentHashMap) f283214c).clear();
                sc5.k kVar2 = sc5.k.f488122a;
                yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.chatting.hd$$d
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        android.content.Context context2 = context;
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = z3Var;
                        java.util.List list = msgList;
                        boolean z18 = z17;
                        com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType2 = wWAppType;
                        int i18 = i17;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.f283213b) {
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.g(context2, z3Var2, list, z18, wWAppType2, i18);
                            }
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.f283212a;
                            if (u3Var != null) {
                                u3Var.dismiss();
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.f283212a = null;
                            }
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.f283213b = false;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendToWeWorkHelper", "doMultiShare: doGetBuffer failed");
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.f283212a;
                            if (u3Var2 != null) {
                                u3Var2.dismiss();
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.f283212a = null;
                            }
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.f283213b = false;
                        }
                        return null;
                    }
                };
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = sc5.k.f488123b;
                if (c20976x6ba6452a != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, null, null, new sc5.j(lVar, context, null), 3, null);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            switch (f9Var3.mo78013xfb85f7b0()) {
                case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                case 268435505:
                case 1090519089:
                    ot0.q v18 = ot0.q.v(f9Var3.U1());
                    if (v18 == null) {
                        break;
                    } else {
                        if (v18.f430199i == 19) {
                            java.lang.String j17 = f9Var3.j();
                            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var3.Q0())) {
                                j17 = c01.w9.u(f9Var3.j());
                            }
                            ot0.q v19 = ot0.q.v(j17);
                            if (v19 != null) {
                                java.lang.String recordinfo = v19.f430196h0;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recordinfo, "recordinfo");
                                ul5Var = bt3.g2.A(recordinfo);
                            }
                            if (ul5Var != null) {
                                java.util.Iterator it6 = ul5Var.f468998f.iterator();
                                while (it6.hasNext()) {
                                    kVar.e((r45.gp0) it6.next());
                                }
                            }
                        }
                        if (v18.f430199i != 24) {
                            break;
                        } else {
                            arrayList4.add(f9Var3);
                            r45.w43 d17 = kVar.d(f9Var3);
                            if (!kVar.c(d17)) {
                                arrayList3.add(d17);
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiSendToWeWorkHelper", "Message[" + d17.f470405d + "] already in pending list");
                                break;
                            }
                        }
                    }
                case 754974769:
                case 771751985:
                case 973078577:
                    kVar.b(kVar.d(f9Var3));
                    break;
            }
        }
    }

    public static java.lang.String b(java.lang.String str) {
        java.lang.String str2 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20195x8f742dd0()) != 1) {
            str2 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.net.Uri b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)));
            if (b17 != null) {
                str2 = b17.toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "getFileProviderUri: filePath：%s ,fileProviderUri:%s", str, str2);
            } else {
                str2 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "getFilePath() called with: filePath = [" + str + "] , result = [" + str2 + "]");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str2)) {
            return str2;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String P0 = m11.b1.Di().P0(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "exportToJpgAndGetFullPath, jpgFile = " + P0);
        return P0;
    }

    public static int c(com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "getIntWWAppType() called with: type = [" + wWAppType + "]");
        return (wWAppType != com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxwork && wWAppType == com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeLocal) ? 2 : 1;
    }

    public static com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "getWWAppType() called with: type = [" + i17 + "]");
        com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType = com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxwork;
        return (i17 != 1 && i17 == 2) ? com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeLocal : wWAppType;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0781 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v104, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v105, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v106, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v107, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v108, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v109, types: [com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.WWMediaLocation] */
    /* JADX WARN: Type inference failed for: r0v110, types: [com.tencent.wework.api.model.WWMediaFile, com.tencent.wework.api.model.WWMediaVideo] */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v70, types: [com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.WWMediaLink] */
    /* JADX WARN: Type inference failed for: r0v73, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v78, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v81, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v85, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v89, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v95, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v98, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.WWMediaMergedConvs] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v60, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r4v65, types: [com.tencent.wework.api.model.WWMediaText] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject e(android.content.Context r28, com.p314xaae8f345.mm.p2621x8fb0427b.z3 r29, java.util.List r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.e(android.content.Context, com.tencent.mm.storage.z3, java.util.List, boolean):com.tencent.wework.api.model.WWMediaMessage$WWMediaObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject f(com.p314xaae8f345.mm.p2621x8fb0427b.z3 r7, r45.gp0 r8, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.f(com.tencent.mm.storage.z3, r45.gp0, com.tencent.mm.storage.f9, boolean):com.tencent.wework.api.model.WWMediaMessage$WWMediaObject");
    }

    public static void g(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.util.List list, boolean z17, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType, int i17) {
        com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71 a17 = com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(context);
        try {
            com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject e17 = e(context, z3Var, list, z17);
            l(e17, i17);
            a17.a(e17, wWAppType);
            a14.g.a().c(1);
        } catch (com.p314xaae8f345.mm.ui.p2650x55bb7a46.nd unused) {
            db5.e1.s(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iik, java.lang.Long.valueOf(ip.c.k() / 1048576)), context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
            a14.g.a().c(2);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6760x897d68ec c6760x897d68ec = a14.g.a().f82142a;
        c6760x897d68ec.f140879i = 1L;
        c6760x897d68ec.n();
        c6760x897d68ec.k();
    }

    public static boolean h(android.content.Context context, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean c17 = com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(context).c(wWAppType);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "isSupport: result:%s type:%s costTime:%s", java.lang.Boolean.valueOf(c17), wWAppType, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return c17;
    }

    public static boolean i(android.content.Context context) {
        boolean z17 = k() || j();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "isSupportForwardToWeWork: isSupportMultiMsgForward:%s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static boolean j() {
        boolean b17 = com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).b(com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeLocal);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "isWeWorkLocalSupportMultiForward:%s ", java.lang.Boolean.valueOf(b17));
        return b17;
    }

    public static boolean k() {
        boolean b17 = com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).b(com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxwork);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "isWeWorkSupportMultiForward:%s ", java.lang.Boolean.valueOf(b17));
        return b17;
    }

    public static void l(com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject wWMediaObject, int i17) {
        r45.w43 w43Var;
        java.lang.String str;
        if (wWMediaObject instanceof com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27790x5a3306f) {
            com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27790x5a3306f c27790x5a3306f = (com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27790x5a3306f) wWMediaObject;
            c27790x5a3306f.f301696g = i17;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = sc5.k.f488125d;
            sc5.k.f488125d = null;
            if (gVar != null) {
                c27790x5a3306f.f301697h = gVar.f273689a;
            }
        }
        java.util.Map map = f283214c;
        for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
            long longValue = ((java.lang.Long) entry.getKey()).longValue();
            java.util.LinkedHashMap linkedHashMap = sc5.k.f488124c;
            long parseLong = (!linkedHashMap.containsKey(java.lang.Long.valueOf(longValue)) || (w43Var = (r45.w43) linkedHashMap.get(java.lang.Long.valueOf(longValue))) == null || (str = w43Var.f470405d) == null) ? -1L : java.lang.Long.parseLong(str);
            if (parseLong != -1) {
                for (com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject wWMediaObject2 : (java.util.List) entry.getValue()) {
                    if (wWMediaObject2 instanceof com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27793x95b4e831) {
                        ((com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27793x95b4e831) wWMediaObject2).f301710g = java.lang.String.valueOf(parseLong);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = f283212a;
        if (u3Var != null) {
            u3Var.dismiss();
            f283212a = null;
        }
        f283213b = false;
        ((java.util.concurrent.ConcurrentHashMap) map).clear();
    }

    public static void m(android.content.Context context, com.p314xaae8f345.mm.p2610xe8058ca2.C21010xd7fb9f66 c21010xd7fb9f66, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        if (c21010xd7fb9f66 == null) {
            return;
        }
        long longValue = c21010xd7fb9f66.f274700e.longValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendFileToWeWork() called with: context = [");
        sb6.append(context);
        sb6.append("], filePath = [");
        java.lang.String str = c21010xd7fb9f66.f274699d;
        sb6.append(str);
        sb6.append("], fileSize = [");
        sb6.append(longValue);
        sb6.append("], title = [");
        java.lang.String str2 = c21010xd7fb9f66.f274701f;
        sb6.append(str2);
        sb6.append("], appType = [");
        sb6.append(wWAppType);
        sb6.append("]");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", sb6.toString());
        long k17 = ip.c.k();
        if (longValue > k17) {
            throw new com.p314xaae8f345.mm.ui.p2650x55bb7a46.nd();
        }
        com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27786x95ae9880 c27786x95ae9880 = new com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27786x95ae9880();
        c27786x95ae9880.f301687h = str2;
        c27786x95ae9880.f301686g = b(str);
        c27786x95ae9880.f301685f = (int) k17;
        com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(context).a(c27786x95ae9880, wWAppType);
    }

    public static void n(android.content.Context context, java.lang.String str, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "sendImgToWeWork() called with: context = [" + context + "], filePath = [" + str + "], appType = [" + wWAppType + "]");
        com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27787x205066d7 c27787x205066d7 = new com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27787x205066d7();
        c27787x205066d7.f301686g = b(str);
        com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(context).a(c27787x205066d7, wWAppType);
    }

    public static void o(android.content.Context context, com.p314xaae8f345.mm.p2610xe8058ca2.C21012x4b00eae4 c21012x4b00eae4, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        if (c21012x4b00eae4 == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendLinkToWeWork() called with: context = [");
        sb6.append(context);
        sb6.append("], url = [");
        java.lang.String str = c21012x4b00eae4.f274703d;
        sb6.append(str);
        sb6.append("], title = [");
        java.lang.String str2 = c21012x4b00eae4.f274704e;
        sb6.append(str2);
        sb6.append("], description = [");
        java.lang.String str3 = c21012x4b00eae4.f274705f;
        sb6.append(str3);
        sb6.append("], imgUrl = [");
        java.lang.String str4 = c21012x4b00eae4.f274706g;
        sb6.append(str4);
        sb6.append("], appType = [");
        sb6.append(wWAppType);
        sb6.append("]");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", sb6.toString());
        com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27788x95b152fe c27788x95b152fe = new com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27788x95b152fe();
        c27788x95b152fe.f301689f = str;
        c27788x95b152fe.f301698c = str2;
        c27788x95b152fe.f301699d = str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(context).a(c27788x95b152fe, wWAppType);
        } else {
            c27788x95b152fe.f301690g = str4;
            com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(context).a(c27788x95b152fe, wWAppType);
        }
    }

    public static void p(android.content.Context context, java.lang.String str, java.lang.String str2, double d17, double d18, double d19, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "sendLocationToWeWork() called with: context = [" + context + "], poiName = [" + str + "], address = [" + str2 + "], longitude = [" + d17 + "], latitude = [" + d18 + "], zoom = [" + d19 + "], appType = [" + wWAppType + "]");
        com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27789x10fd20b9 c27789x10fd20b9 = new com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27789x10fd20b9();
        c27789x10fd20b9.f301698c = str;
        c27789x10fd20b9.f301691f = str2;
        c27789x10fd20b9.f301692g = d17;
        c27789x10fd20b9.f301693h = d18;
        c27789x10fd20b9.f301694i = d19;
        com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(context).a(c27789x10fd20b9, wWAppType);
    }

    public static void q(android.content.Context context, com.p314xaae8f345.mm.p2610xe8058ca2.C21008x40c862d0 c21008x40c862d0, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        if (c21008x40c862d0 == null) {
            return;
        }
        java.lang.String str = c21008x40c862d0.f274696h;
        java.lang.String str2 = c21008x40c862d0.f274697i;
        int intValue = c21008x40c862d0.f274698m.intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendMiniProgramToWeWork() called with: context = [");
        sb6.append(context);
        sb6.append("], appbrandUsername = [");
        java.lang.String str3 = c21008x40c862d0.f274692d;
        sb6.append(str3);
        sb6.append("], appbrandPagepath = [");
        java.lang.String str4 = c21008x40c862d0.f274693e;
        sb6.append(str4);
        sb6.append("], appbrandWeAappIconUrl = [");
        java.lang.String str5 = c21008x40c862d0.f274694f;
        sb6.append(str5);
        sb6.append("], imgPath = [");
        java.lang.String str6 = c21008x40c862d0.f274695g;
        sb6.append(str6);
        sb6.append("], srcDisplayname = [");
        sb6.append(str);
        sb6.append("], title = [");
        sb6.append(str2);
        sb6.append("], appbrandType = [");
        sb6.append(intValue);
        sb6.append("], appType = [");
        sb6.append(wWAppType);
        sb6.append("]");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", sb6.toString());
        com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27792x18e302a9 c27792x18e302a9 = new com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27792x18e302a9();
        c27792x18e302a9.f301701f = str3;
        c27792x18e302a9.f301702g = str4;
        c27792x18e302a9.f301704i = str5;
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21810x5e78d65 c21810x5e78d65 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21810x5e78d65(c27792x18e302a9, str, str2, intValue, context, wWAppType);
        byte[] bArr = null;
        if (android.text.TextUtils.isEmpty(str6)) {
            c21810x5e78d65.a(null);
            return;
        }
        if (str6.startsWith("http://") || str6.startsWith("https://")) {
            l01.d0.f396294a.o(str6, new l01.t() { // from class: com.tencent.mm.ui.chatting.hd$$c
                @Override // l01.t
                public final void a(byte[] bArr2) {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21810x5e78d65) com.p314xaae8f345.mm.ui.p2650x55bb7a46.od.this).a(bArr2);
                }
            });
            return;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str6)) {
            str6 = m11.b1.Di().D2(null, str6, true);
        }
        if (o35.a.b(str6)) {
            try {
                android.graphics.Bitmap d17 = t23.t1.d(str6);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                d17.compress(android.graphics.Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SendToWeWorkHelper", e17, "resolveMiniProgramImageData, read local file to bitmap data fail", new java.lang.Object[0]);
            }
        }
        c21810x5e78d65.a(bArr);
    }

    public static void r(android.content.Context context, java.lang.String str, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "sendTextToWeWork() called with: context = [" + context + "], textContent = [" + str + "], appType = [" + wWAppType + "]");
        com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(context).a(new com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27793x95b4e831(str), wWAppType);
    }

    public static void s(android.content.Context context, java.lang.String str, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "sendVideoToWeWork() called with: context = [" + context + "], filePath = [" + str + "], appType = [" + wWAppType + "]");
        com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27794x2105d1f7 c27794x2105d1f7 = new com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27794x2105d1f7();
        c27794x2105d1f7.f301686g = b(str);
        com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(context).a(c27794x2105d1f7, wWAppType);
    }

    public static boolean t(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.util.List list, boolean z17, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType, int i17) {
        if (list == null || list.size() == 0) {
            return false;
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.t(list)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendToWeWorkHelper", "isContainPlaceHolderMsg");
            db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bko), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571241h), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.id());
            return false;
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.w(list)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendToWeWorkHelper", "isContainUndownloadFile");
            db5.e1.u(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bks), "", new com.p314xaae8f345.mm.ui.p2650x55bb7a46.jd(), null);
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.la.a((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next())) {
                db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c96), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
                return false;
            }
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.g(true, list, z3Var.d1(), null)) {
            a(context, z3Var, list, z17, wWAppType, i17);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendToWeWorkHelper", "handleInvalidSendToFriendMsg");
        db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1l), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.kd(context, z3Var, list, z17, wWAppType, i17), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ld());
        return true;
    }

    public static void u(android.content.Context context) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = f283212a;
        if (u3Var != null) {
            u3Var.dismiss();
            f283212a = null;
        }
        if (context == null) {
            return;
        }
        f283212a = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.md());
    }
}
