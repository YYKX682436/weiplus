package dk5;

/* loaded from: classes9.dex */
public final class y6 {

    /* renamed from: a, reason: collision with root package name */
    public static final dk5.y6 f316543a = new dk5.y6();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f316544b;

    public static final void a(dk5.y6 y6Var, ot0.q qVar, r45.vc7 vc7Var) {
        y6Var.getClass();
        rt0.a aVar = new rt0.a();
        if (vc7Var != null) {
            aVar.f480904b = vc7Var.f469652m;
            qVar.E2 = vc7Var.f469653n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendWXMediaMessageHelper", "sendSecretAppMsg isSecretMsg: " + aVar.f480904b + ", forwardFlag: " + qVar.E2);
        }
        qVar.f(aVar);
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a i(dk5.y6 y6Var, boolean z17, java.lang.String str, java.lang.String str2, dk5.f6 f6Var, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str2 = "";
        }
        if ((i17 & 8) != 0) {
            f6Var = null;
        }
        return y6Var.h(z17, str, str2, f6Var);
    }

    public static final void l(android.content.Context context, android.content.Intent intent, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m app, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.util.LinkedList linkedList, int i17, boolean z17, boolean z18, java.lang.String pkgName, int i18, java.lang.String str, int i19, dk5.e6 e6Var, dk5.f6 f6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(app, "app");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgName, "pkgName");
        if (c11286x34a5504 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendWXMediaMessageHelper", "sendWXMediaMessage fail, WXMediaMessage = null");
            if (e6Var != null) {
                ((dk5.z4) e6Var).b(3, "cb_msg_is_null");
                return;
            }
            return;
        }
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendWXMediaMessageHelper", "sendWXMediaMessage fail, toUserList is Empty");
            if (e6Var != null) {
                ((dk5.z4) e6Var).b(3, "cb_key_user_list_is_empty");
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendWXMediaMessageHelper", "sendWXMediaMessage  type:" + c11286x34a5504.m48467xfb85f7b0() + "  scene:" + i19);
        dk5.y6 y6Var = f316543a;
        if (i19 != 2) {
            y6Var.d(context, intent, app, c11286x34a5504, linkedList, i17, z17, z18, pkgName, i18, str, i19, e6Var, f6Var);
            return;
        }
        dk5.u6 u6Var = new dk5.u6(context, intent, app, c11286x34a5504, linkedList, i17, z17, z18, pkgName, i18, str, i19, e6Var);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject = c11286x34a5504.f33122xe4128443;
        if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXImageObject");
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9 c11283x90d63ed9 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) iMediaObject;
            java.lang.String imagePath = c11283x90d63ed9.f33105xcba65c20;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imagePath, "imagePath");
            y6Var.c(imagePath, new dk5.g6(c11283x90d63ed9, u6Var));
            return;
        }
        if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXFileObject");
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c c11280xa65cf99c = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c) iMediaObject;
            java.lang.String filePath = c11280xa65cf99c.f33093xd426afc1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath, "filePath");
            y6Var.c(filePath, new dk5.h6(c11280xa65cf99c, u6Var));
            return;
        }
        if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXEmojiObject");
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984 c11276x643df984 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984) iMediaObject;
            java.lang.String emojiPath = c11276x643df984.f33077x6482c58b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emojiPath, "emojiPath");
            y6Var.c(emojiPath, new dk5.i6(c11276x643df984, u6Var));
            return;
        }
        if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXVideoFileObject");
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995 c11297x655ab995 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995) iMediaObject;
            java.lang.String filePath2 = c11297x655ab995.f33233xd426afc1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath2, "filePath");
            y6Var.c(filePath2, new dk5.j6(c11297x655ab995, u6Var));
            return;
        }
        if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11282x3580fbc3) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject");
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11282x3580fbc3 c11282x3580fbc3 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11282x3580fbc3) iMediaObject;
            java.lang.String filePath3 = c11282x3580fbc3.f33097xd426afc1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath3, "filePath");
            y6Var.c(filePath3, new dk5.k6(c11282x3580fbc3, u6Var));
            return;
        }
        if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXAppExtendObject");
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699) iMediaObject;
            java.lang.String filePath4 = c11272xd6622699.f33063xd426afc1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath4, "filePath");
            y6Var.c(filePath4, new dk5.l6(c11272xd6622699, u6Var));
            return;
        }
        if (!(iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936)) {
            u6Var.mo146xb9724478(0);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject");
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936) iMediaObject;
        java.lang.String hdAlbumThumbFilePath = c11289x4ff06936.f33195x4b66fa4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hdAlbumThumbFilePath, "hdAlbumThumbFilePath");
        y6Var.c(hdAlbumThumbFilePath, new dk5.m6(c11289x4ff06936, u6Var));
    }

    public final void b(java.lang.String str, k91.v5 v5Var, ot0.q qVar, r45.vc7 vc7Var, dk5.f6 f6Var) {
        r45.k46 k46Var;
        ot0.a aVar = new ot0.a();
        aVar.f429893p = v5Var.u0() != null ? v5Var.u0().f387175q : 0;
        aVar.f429895r = v5Var.u0() != null ? v5Var.u0().f387176r : 0;
        aVar.f429896s = v5Var.u0() != null ? v5Var.u0().f387177s : 0;
        if (vc7Var != null) {
            boolean z17 = vc7Var.f469649g;
            aVar.f429882e = z17;
            if (z17 && (k46Var = vc7Var.f469648f) != null) {
                aVar.f429883f = k46Var.f459899d;
                aVar.f429884g = k46Var.f459900e;
                aVar.f429885h = k46Var.f459901f;
                aVar.f429886i = k46Var.f459902g;
                aVar.f429887j = k46Var.f459903h;
                aVar.f429888k = k46Var.f459906n;
                aVar.f429890m = k46Var.f459905m;
                aVar.f429889l = k46Var.f459904i;
            }
            boolean z18 = vc7Var.f469652m;
            aVar.f429900w = z18;
            if (z18) {
                qVar.f430238r2 = 1;
            }
        }
        aVar.K = f6Var != null ? f6Var.f316157a : false;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wxid_wi_1d142z0zdj03", str)) {
            java.lang.String str2 = v5Var.f68904x28d45f97;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.c0 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.p) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.b0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.b0.class))).Ai(str2);
            if (Ai != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendWXMediaMessageHelper", "getAndUploadPageContentCache appId:" + str2 + "}result:" + Ai);
                aVar.S = Ai.f161827c;
                aVar.T = Ai.f161828d;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendWXMediaMessageHelper", "getAndUploadPageContentCache appId:" + str2 + " result is null");
            }
        }
        qVar.f(aVar);
    }

    public final void c(java.lang.String str, yz5.p pVar) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.e(str)) {
            pVar.mo149xb9724478(3, null);
            return;
        }
        pVar.mo149xb9724478(1, null);
        ((ku5.t0) ku5.t0.f394148d).h(new dk5.n6(str, pVar), "SendWXMediaMessageCopyFile");
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0612  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Context r28, android.content.Intent r29, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m r30, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 r31, java.util.LinkedList r32, int r33, boolean r34, boolean r35, java.lang.String r36, int r37, java.lang.String r38, int r39, dk5.e6 r40, dk5.f6 r41) {
        /*
            Method dump skipped, instructions count: 1575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk5.y6.d(android.content.Context, android.content.Intent, com.tencent.mm.pluginsdk.model.app.m, com.tencent.mm.opensdk.modelmsg.WXMediaMessage, java.util.LinkedList, int, boolean, boolean, java.lang.String, int, java.lang.String, int, dk5.e6, dk5.f6):void");
    }

    public final void f(ot0.q qVar, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504) {
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject;
        if (qVar == null || c11286x34a5504 == null || (iMediaObject = c11286x34a5504.f33122xe4128443) == null) {
            return;
        }
        if (!(iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11275x4f8e5c4f)) {
            if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject");
                qVar.f430238r2 = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb) iMediaObject).f33171xd24bdadd;
                return;
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXDynamicVideoMiniProgramObject");
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11275x4f8e5c4f c11275x4f8e5c4f = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11275x4f8e5c4f) iMediaObject;
        ot0.a aVar = new ot0.a();
        byte[] thumbData = c11286x34a5504.f33128x4f3b3aa0;
        if (thumbData != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thumbData, "thumbData");
            if (!(thumbData.length == 0)) {
                byte[] bArr = c11286x34a5504.f33128x4f3b3aa0;
                int length = bArr.length;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(length));
                arrayList.add(0);
                arrayList.add(bArr);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/transmit/SendWXMediaMessageHelper", "fillWeishiVideoData", "(Lcom/tencent/mm/message/AppMessage$Content;Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                yj0.a.e(obj, decodeByteArray, "com/tencent/mm/ui/transmit/SendWXMediaMessageHelper", "fillWeishiVideoData", "(Lcom/tencent/mm/message/AppMessage$Content;Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                if (decodeByteArray != null) {
                    aVar.f429903z = decodeByteArray.getWidth();
                    aVar.A = decodeByteArray.getHeight();
                }
            }
        }
        aVar.B = c11275x4f8e5c4f.f33074x3de4e076;
        aVar.C = c11275x4f8e5c4f.f33073x89f970fa;
        aVar.D = 1;
        qVar.f(aVar);
        qVar.f430238r2 = c11275x4f8e5c4f.f33171xd24bdadd;
        qVar.f430259x = null;
    }

    public final java.lang.String g(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        java.lang.String str = mVar.f67370x28d45f97;
        java.lang.String a17 = c01.n2.a("app_" + mVar.f67370x28d45f97);
        c01.n2.d().c(a17, true).i("prePublishId", "app_" + mVar.f67370x28d45f97);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        return a17;
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a h(boolean z17, java.lang.String str, java.lang.String str2, dk5.f6 f6Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a();
        aVar.f270323a = z17 ? 1 : 0;
        aVar.f270324b = str;
        aVar.f270325c = str2;
        aVar.f270326d = f6Var != null ? f6Var.f316158b : null;
        aVar.f270327e = f6Var != null ? f6Var.f316159c : null;
        aVar.f270328f = f6Var != null ? f6Var.f316160d : null;
        aVar.f270329g = f6Var != null ? f6Var.f316161e : 0;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x003d, code lost:
    
        if ((r0.length() == 0) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if ((r0.length == 0) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m r21, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 r22, java.util.LinkedList r23, java.lang.String r24, java.lang.String r25, int r26, boolean r27, boolean r28, java.lang.String r29, java.lang.String r30, java.lang.Object r31, dk5.e6 r32, dk5.f6 r33) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk5.y6.j(com.tencent.mm.pluginsdk.model.app.m, com.tencent.mm.opensdk.modelmsg.WXMediaMessage, java.util.LinkedList, java.lang.String, java.lang.String, int, boolean, boolean, java.lang.String, java.lang.String, java.lang.Object, dk5.e6, dk5.f6):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m r17, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 r18, java.util.LinkedList r19, boolean r20, boolean r21, dk5.e6 r22, dk5.f6 r23, com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e r24) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk5.y6.k(com.tencent.mm.pluginsdk.model.app.m, com.tencent.mm.opensdk.modelmsg.WXMediaMessage, java.util.LinkedList, boolean, boolean, dk5.e6, dk5.f6, com.tencent.mm.modelmulti.WxaInfo):void");
    }
}
