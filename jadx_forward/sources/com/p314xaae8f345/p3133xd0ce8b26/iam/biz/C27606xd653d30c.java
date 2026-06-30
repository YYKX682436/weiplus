package com.p314xaae8f345.p3133xd0ce8b26.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.iam.biz.ZIDL_idvlmtlKK */
/* loaded from: classes11.dex */
public class C27606xd653d30c {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: ZIDL_AX */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m118126x1964d17f(java.lang.Object r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3133xd0ce8b26.iam.biz.C27606xd653d30c.m118126x1964d17f(java.lang.Object, byte[]):void");
    }

    /* renamed from: ZIDL_EX */
    private void m118127x1964d1fb(java.lang.Object obj, byte[] bArr) {
        java.util.Optional m119631x9fa0ed2d = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119631x9fa0ed2d(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p4.f300003g, bArr);
        ((t01.l) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.a0) obj)).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "fetchMeTabRedPointAsync " + m119631x9fa0ed2d);
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p4 p4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p4) m119631x9fa0ed2d.orElse(null);
        if (p4Var != null) {
            try {
                r45.vs2 vs2Var = new r45.vs2();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = p4Var.f300005e;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = vs2Var.mo11468x92b714fd(gVar != null ? gVar.g() : null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderRedDotCtrlInfo");
                r45.vs2 vs2Var2 = (r45.vs2) mo11468x92b714fd;
                t01.i iVar = t01.m.f495932d;
                t01.i.a(iVar).D(t01.m.f495935g, vs2Var2.f470036x);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "save tipsUuid: " + vs2Var2.f470036x);
                zy2.fa.D(t01.i.c(iVar), vs2Var2, "bizMeTab", null, false, null, 28, null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizPersonalFinderRedDot", e17, "add red dot error", new java.lang.Object[0]);
            }
        }
    }

    /* renamed from: ZIDL_FX */
    private void m118128x1964d21a(java.lang.Object obj, boolean z17) {
        ((t01.k) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.y) obj)).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "disposeMeTabRedPointAsync: " + z17);
    }

    /* renamed from: ZIDL_GX */
    private void m118129x1964d239(java.lang.Object obj, boolean z17) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        throw null;
    }

    /* renamed from: ZIDL_HX */
    private void m118130x1964d258(java.lang.Object obj, byte[] bArr) {
        java.util.Optional m119631x9fa0ed2d = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119631x9fa0ed2d(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r4.f300057v, bArr);
        ox.b bVar = (ox.b) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.b0) obj);
        bVar.getClass();
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r4 r4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r4) m119631x9fa0ed2d.orElse(null);
        if (r4Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkMeTabStrategyRemoteSwitch, open=");
            sb6.append(r4Var.f300059e);
            sb6.append(", openWithOutAcct: ");
            sb6.append(r4Var.f300062h);
            sb6.append(", canRegisterPhotoAccount: ");
            sb6.append(r4Var.f300070s == 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", sb6.toString());
            boolean z17 = r4Var.f300059e == 1;
            ox.g gVar = bVar.f430977a;
            gVar.f431005e = z17;
            gVar.f431006f = r4Var.f300062h == 1;
            gVar.f431007g = r4Var.f300070s == 1;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = gVar.f431004d;
            o4Var.putBoolean("meStrategySwitch", z17);
            o4Var.putBoolean("meStrategyOpenWithoutAcct", gVar.f431006f);
            o4Var.putBoolean("canRegisterPhotoAccount", gVar.f431007g);
            java.util.LinkedList linkedList = r4Var.f300065n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getNativeEditorScene(...)");
            gVar.f431008h = linkedList;
            if (!linkedList.isEmpty()) {
                java.util.List list = gVar.f431008h;
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
                }
                o4Var.putStringSet("nativeEditorScenes", kz5.n0.X0(arrayList));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "checkMeTabStrategyRemoteSwitch, stored nativeEditorScenes: " + gVar.f431008h);
            } else {
                o4Var.remove("nativeEditorScenes");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "checkMeTabStrategyRemoteSwitch, removed nativeEditorScenes from KV");
            }
            java.lang.String[] b17 = o4Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "allKeys(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str : b17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                if (r26.i0.y(str, "clientExpItemValue_", false)) {
                    arrayList2.add(str);
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                o4Var.W((java.lang.String) it6.next());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "clearAllClientExpItemValues, removed " + arrayList2.size() + " keys");
            java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l3> list2 = r4Var.f300064m.f299781d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "list");
            for (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l3 l3Var : list2) {
                java.lang.String key = l3Var.f299832d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "key");
                java.lang.String str2 = l3Var.f299833e;
                gVar.uj(key, str2 != null ? r26.h0.h(str2) : null);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4 w4Var = r4Var.f300071t;
            gVar.f431009i = w4Var;
            o4Var.putBoolean("bizOriginPublishSwitch", w4Var != null ? w4Var.f300290d : false);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4 w4Var2 = r4Var.f300071t;
            o4Var.putInt("bizOriginPublishSizeLimit", w4Var2 != null ? w4Var2.f300291e : 0);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkMeTabStrategyRemoteSwitch, originalPictureStrategy: ");
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4 w4Var3 = gVar.f431009i;
            sb7.append(w4Var3 != null ? java.lang.Boolean.valueOf(w4Var3.f300290d) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", sb7.toString());
            gVar.uj("support_view_photo_acct", java.lang.Integer.valueOf(r4Var.f300067p));
            gVar.uj("support_oper_photo_acct", java.lang.Integer.valueOf(r4Var.f300068q));
            gVar.uj("support_photo_acct_new_logo", java.lang.Integer.valueOf(r4Var.f300069r));
            r0 = jz5.f0.f384359a;
        }
        if (r0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizPublishApiFeatureService", "checkMeTabStrategyRemoteSwitch, resp is empty");
        }
    }

    /* renamed from: ZIDL_IX */
    private void m118131x1964d277(java.lang.Object obj, byte[] bArr) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119631x9fa0ed2d(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r4.f300057v, bArr);
        throw null;
    }

    /* renamed from: ZIDL_JX */
    private void m118132x1964d296(java.lang.Object obj, boolean z17) {
        ((rm.f0) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.i0) obj)).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncPhotoSwitchTask", "turnOnCreateBizPhotoAndFetchMeTabStrategyAsync result: " + z17);
    }

    /* renamed from: ZIDL_LX */
    private void m118133x1964d2d4(java.lang.Object obj, byte[] bArr, int i17) {
        ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.c0) obj).a(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), i17);
    }

    /* renamed from: ZIDL_MX */
    private void m118134x1964d2f3(java.lang.Object obj, boolean z17) {
        ((gr1.a) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.x) obj)).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFans.RedDotDelegate", "clearSvrNotificationRedDot " + z17);
    }

    /* renamed from: ZIDL_NX */
    private void m118135x1964d312(java.lang.Object obj, boolean z17) {
        ((jr1.f) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.h0) obj)).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansUtil", "reportBizFansOp " + z17);
    }

    /* renamed from: ZIDL_OX */
    private void m118136x1964d331(java.lang.Object obj, boolean z17) {
        ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.k0) obj).mo67728xdc453139(z17);
    }

    /* renamed from: ZIDL_PX */
    private void m118137x1964d350(java.lang.Object obj, boolean z17) {
        zw.l lVar = (zw.l) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.j0) obj);
        p3325xe03a0797.p3326xc267989b.q qVar = lVar.f558055c;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterSelectPhotoHandler", "textCoverEnable is false");
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        } else {
            zw.k kVar = new zw.k();
            ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Bi(lVar.f558053a, 0, 56, null, null, lVar.f558054b, false, kVar, new zw.j(qVar));
        }
    }

    /* renamed from: ZIDL_AV */
    public native void m118138x1964d17d(long j17, java.lang.Object obj, byte[] bArr, int i17, byte[] bArr2);

    /* renamed from: ZIDL_EV */
    public native void m118139x1964d1f9(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2);

    /* renamed from: ZIDL_FV */
    public native void m118140x1964d218(long j17, java.lang.Object obj, byte[] bArr, int i17, byte[] bArr2);

    /* renamed from: ZIDL_GV */
    public native void m118141x1964d237(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_HV */
    public native void m118142x1964d256(long j17, java.lang.Object obj, boolean z17, boolean z18);

    /* renamed from: ZIDL_IV */
    public native void m118143x1964d275(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_JV */
    public native void m118144x1964d294(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_LV */
    public native void m118145x1964d2d2(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_MV */
    public native void m118146x1964d2f1(long j17, java.lang.Object obj, byte[] bArr, int i17);

    /* renamed from: ZIDL_NV */
    public native void m118147x1964d310(long j17, java.lang.Object obj, byte[] bArr, int i17, int i18, byte[] bArr2);

    /* renamed from: ZIDL_OV */
    public native void m118148x1964d32f(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_PV */
    public native void m118149x1964d34e(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_idvlmtlKC */
    public native void m118150xd653d304(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2);
}
