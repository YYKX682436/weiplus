package si0;

/* loaded from: classes4.dex */
public final class m1 implements com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24817x841a06a7, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, oi0.a, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v7 {

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 f489663e;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ho f489665g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.C10705x905b5a95 f489666h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f489662d = new java.lang.ref.WeakReference(null);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f489664f = new java.util.HashMap();

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.flutter.plugin.SnsNativeRouterPlugin$uiFeedNotifyListener$1] */
    public m1() {
        p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f489666h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6108x48c0353a>(a0Var) { // from class: com.tencent.mm.flutter.plugin.SnsNativeRouterPlugin$uiFeedNotifyListener$1
            {
                this.f39173x3fe91575 = 1025439562;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6108x48c0353a c6108x48c0353a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6108x48c0353a event = c6108x48c0353a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.SnsNativeRouterPlugin", "uiFeedNotifyListener >> type: %d id: %s", java.lang.Integer.valueOf(event.f136384g.f88409a), ca4.z0.t0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(event.f136384g.f88410b)));
                ((ku5.t0) ku5.t0.f394148d).q(new si0.l1(event, si0.m1.this));
                return false;
            }
        };
    }

    @Override // oi0.a
    public void a(java.lang.String imgPath, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        if (imgPath.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverImage: imgPath is empty");
            return;
        }
        java.lang.String r17 = c01.z1.r();
        if (r17 == null || r17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverImage: userName is null");
            return;
        }
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("sns_aff_cache");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = r17 + '_' + currentTimeMillis;
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(c17, str).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        if (!com.p314xaae8f345.mm.vfs.w6.u(c17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverImage: mkdirs failed");
            return;
        }
        if (com.p314xaae8f345.mm.vfs.w6.d(imgPath, o17, false) < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverImage: copy failed");
            return;
        }
        bw5.tc0 tc0Var = new bw5.tc0();
        tc0Var.f114909g = str;
        tc0Var.Z[4] = true;
        bw5.uj0 uj0Var = new bw5.uj0();
        uj0Var.f115472e = currentTimeMillis;
        boolean[] zArr = uj0Var.f115480p;
        zArr[2] = true;
        uj0Var.f115471d = r17;
        zArr[1] = true;
        uj0Var.f115473f = 1;
        zArr[3] = true;
        uj0Var.f115477m = false;
        zArr[7] = true;
        uj0Var.f115478n = (int) (f17 * 10000.0d);
        zArr[8] = true;
        uj0Var.f115474g = tc0Var;
        zArr[4] = true;
        com.p314xaae8f345.p3133xd0ce8b26.aff.sns.b.f299034b.b(uj0Var, si0.f1.f489607a);
    }

    @Override // oi0.a
    public void b(java.lang.String thumbPath, java.lang.String videoPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        if (!(thumbPath.length() == 0)) {
            if (!(videoPath.length() == 0)) {
                java.lang.String r17 = c01.z1.r();
                if (r17 == null || r17.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverVideo: userName is null");
                    return;
                }
                java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("sns_aff_cache");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String str = r17 + '_' + currentTimeMillis + "_coverThumb";
                java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(c17, str).o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                java.lang.String str2 = r17 + '_' + currentTimeMillis + "_coverVideo";
                java.lang.String o18 = new com.p314xaae8f345.mm.vfs.r6(c17, str2).o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
                if (!com.p314xaae8f345.mm.vfs.w6.u(c17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverImage: mkdirs failed");
                    return;
                }
                if (com.p314xaae8f345.mm.vfs.w6.d(thumbPath, o17, false) < 0 || com.p314xaae8f345.mm.vfs.w6.d(videoPath, o18, false) < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverVideo: copy failed");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(o18, true);
                bw5.tc0 tc0Var = new bw5.tc0();
                tc0Var.f114909g = str2;
                boolean[] zArr = tc0Var.Z;
                zArr[4] = true;
                tc0Var.f114911i = str;
                zArr[6] = true;
                bw5.uc0 uc0Var = new bw5.uc0();
                uc0Var.f115375d = d17.f243917c;
                boolean[] zArr2 = uc0Var.f115378g;
                zArr2[1] = true;
                uc0Var.f115376e = d17.f243918d;
                zArr2[2] = true;
                tc0Var.f114915p = uc0Var;
                zArr[10] = true;
                bw5.uj0 uj0Var = new bw5.uj0();
                uj0Var.f115472e = currentTimeMillis;
                boolean[] zArr3 = uj0Var.f115480p;
                zArr3[2] = true;
                uj0Var.f115471d = r17;
                zArr3[1] = true;
                uj0Var.f115473f = 2;
                zArr3[3] = true;
                uj0Var.f115477m = false;
                zArr3[7] = true;
                uj0Var.f115474g = tc0Var;
                zArr3[4] = true;
                com.p314xaae8f345.p3133xd0ce8b26.aff.sns.b.f299034b.b(uj0Var, si0.g1.f489611a);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverVideo: path is empty");
    }

    @Override // oi0.a
    public void c(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        if (c17933xe8d1b226 == null) {
            return;
        }
        try {
            bw5.ak0 ak0Var = new bw5.ak0();
            boolean[] zArr = ak0Var.f106787m;
            long j17 = i17;
            ak0Var.f106782e = j17;
            zArr[2] = true;
            ak0Var.f106781d = c17933xe8d1b226.m70374x6bf53a6c();
            zArr[1] = true;
            bw5.to0 to0Var = new bw5.to0();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
            m70371x485d7.m77289x6e018feb(c17933xe8d1b226.f68883xac3be4e);
            try {
                to0Var.mo11468x92b714fd(m70371x485d7.mo14344x5f01b1f6());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "onPostSaveLocal: " + e17.getMessage());
            }
            to0Var.f115080e = c17933xe8d1b226.m70374x6bf53a6c();
            boolean[] zArr2 = to0Var.Q;
            zArr2[2] = true;
            to0Var.f115082g = c17933xe8d1b226.f68883xac3be4e;
            zArr2[4] = true;
            ak0Var.f106783f = to0Var;
            zArr[3] = true;
            java.lang.String d17 = wa4.a0.d(m70371x485d7);
            r45.cu5 cu5Var = new r45.cu5();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
            byte[] bytes = d17.getBytes(UTF_8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            cu5Var.d(bytes);
            bw5.fk0 fk0Var = new bw5.fk0();
            boolean[] zArr3 = fk0Var.C1;
            fk0Var.f108849d = j17;
            zArr3[1] = true;
            fk0Var.f108850e = c17933xe8d1b226.m70374x6bf53a6c();
            zArr3[2] = true;
            fk0Var.f108852g = c17933xe8d1b226.f68883xac3be4e;
            zArr3[4] = true;
            fk0Var.f108853h = cu5Var;
            zArr3[5] = true;
            ak0Var.f106784g = fk0Var;
            zArr[4] = true;
            this.f489664f.put(java.lang.Integer.valueOf(c17933xe8d1b226.f68883xac3be4e), java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.p3133xd0ce8b26.aff.sns.h.f299036b.c(ak0Var, fk0Var, new si0.j1());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "onPostSaveLocal: " + e18.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    @Override // oi0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r23) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.m1.d(com.tencent.mm.protocal.protobuf.FinderObject):void");
    }

    @Override // oi0.a
    public void e(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        if (c19806x4c372b7 == null) {
            return;
        }
        bw5.fk0 fk0Var = new bw5.fk0();
        long j17 = c19806x4c372b7.Id;
        fk0Var.f108849d = j17;
        boolean[] zArr = fk0Var.C1;
        zArr[1] = true;
        fk0Var.f108871x1 = c19806x4c372b7.f38980x988ba8e;
        zArr[52] = true;
        com.p314xaae8f345.p3133xd0ce8b26.aff.sns.h.f299036b.e(j17, fk0Var, si0.h1.f489617a);
    }

    @Override // oi0.a
    public void f(long j17, r45.p96 opChangeVisibility) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opChangeVisibility, "opChangeVisibility");
        bw5.gk0 gk0Var = new bw5.gk0();
        gk0Var.f109424o = opChangeVisibility.f464432o;
        boolean[] zArr = gk0Var.f109428s;
        zArr[9] = true;
        java.util.LinkedList linkedList = opChangeVisibility.f464425e;
        java.util.LinkedList linkedList2 = gk0Var.f109417e;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add((r45.du5) it.next());
                zArr[2] = true;
            }
        }
        gk0Var.f109416d = linkedList2 != null ? linkedList2.size() : 0;
        zArr[1] = true;
        java.util.LinkedList<java.lang.Integer> linkedList3 = opChangeVisibility.f464427g;
        java.util.LinkedList linkedList4 = gk0Var.f109419g;
        if (linkedList3 != null) {
            for (java.lang.Integer num : linkedList3) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                linkedList4.add(java.lang.Integer.valueOf(num.intValue()));
                zArr[4] = true;
            }
        }
        gk0Var.f109418f = linkedList4 != null ? linkedList4.size() : 0;
        zArr[3] = true;
        java.util.LinkedList linkedList5 = opChangeVisibility.f464429i;
        java.util.LinkedList linkedList6 = gk0Var.f109421i;
        if (linkedList5 != null) {
            java.util.Iterator it6 = linkedList5.iterator();
            while (it6.hasNext()) {
                linkedList6.add((r45.du5) it6.next());
                zArr[6] = true;
            }
        }
        gk0Var.f109420h = linkedList6 != null ? linkedList6.size() : 0;
        zArr[5] = true;
        java.util.LinkedList<java.lang.Integer> linkedList7 = opChangeVisibility.f464431n;
        java.util.LinkedList linkedList8 = gk0Var.f109423n;
        if (linkedList7 != null) {
            for (java.lang.Integer num2 : linkedList7) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                linkedList8.add(java.lang.Integer.valueOf(num2.intValue()));
                zArr[8] = true;
            }
        }
        gk0Var.f109422m = linkedList8 != null ? linkedList8.size() : 0;
        zArr[7] = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.SnsNativeRouterPlugin", "onVisibilityChanged: snsId=" + j17 + " opType=" + gk0Var.f109424o + " blackList=" + gk0Var.f109416d + " blackTag=" + gk0Var.f109418f + " groupUser=" + gk0Var.f109420h + " groupTag=" + gk0Var.f109422m);
        com.p314xaae8f345.p3133xd0ce8b26.aff.sns.h.f299036b.f(j17, gk0Var, si0.k1.f489629a);
    }

    public final void g(java.util.Map map, yz5.l lVar) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleJumpToDetail enter, hasParams=");
        sb6.append(map != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.SnsNativeRouterPlugin", sb6.toString());
        try {
            android.content.Context i18 = i();
            if (i18 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "handleJumpToDetail: context is null");
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
                return;
            }
            if (map != null && map.containsKey("object_buffer")) {
                java.lang.Object obj = map.get("object_buffer");
                byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
                if (bArr == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "handleJumpToDetail: object_buffer is not ByteArray");
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
                    return;
                }
                java.lang.Object obj2 = map.get("sns_session_id");
                java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                java.lang.Object obj3 = map.get("from_page");
                java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                if (str3 != null) {
                    str2 = str3;
                }
                java.lang.Object obj4 = map.get("home_page_type");
                java.lang.Integer num = obj4 instanceof java.lang.Integer ? (java.lang.Integer) obj4 : null;
                int intValue = num != null ? num.intValue() : 0;
                int i19 = intValue != 0 ? intValue != 1 ? intValue != 2 ? 0 : 3 : 9 : 2;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
                try {
                    c19806x4c372b7.mo11468x92b714fd(bArr);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleJumpToDetail: parsed snsId=");
                    java.lang.String str4 = str;
                    java.lang.String str5 = str2;
                    sb7.append(ca4.z0.t0(c19806x4c372b7.Id));
                    sb7.append(" createTime=");
                    sb7.append(c19806x4c372b7.f38965xc86e6609);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.SnsNativeRouterPlugin", sb7.toString());
                    java.lang.String r17 = c01.z1.r();
                    int i27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19806x4c372b7.f38999xf403ecf6, r17) ? 4 : 8;
                    java.lang.Integer num2 = (java.lang.Integer) this.f489664f.get(java.lang.Integer.valueOf(c19806x4c372b7.f38965xc86e6609));
                    if (num2 == null || num2.intValue() == 0) {
                        i17 = i19;
                        c17933xe8d1b226 = null;
                        z17 = false;
                    } else {
                        i17 = i19;
                        c17933xe8d1b226 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(num2.intValue());
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("handleJumpToDetail: found from createTimeToLocalMap, localId=");
                        sb8.append(num2);
                        sb8.append(", snsInfo=");
                        sb8.append(c17933xe8d1b226 != null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.SnsNativeRouterPlugin", sb8.toString());
                        z17 = true;
                    }
                    if (c17933xe8d1b226 == null) {
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.q(c19806x4c372b7, r17, i27);
                            c17933xe8d1b226 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(c19806x4c372b7.Id);
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MircroMsg.SnsNativeRouterPlugin", th6, "handleJumpToDetail: SnsInfoStorageLogic.replace failed, snsId=" + c19806x4c372b7.Id, new java.lang.Object[0]);
                            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6))));
                            return;
                        }
                    }
                    if (c17933xe8d1b226 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "handleJumpToDetail: snsInfo not found for id=" + c19806x4c372b7.Id + " createTime=" + c19806x4c372b7.f38965xc86e6609);
                        p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent(i18, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.class);
                    intent.putExtra("INTENT_TALKER", c19806x4c372b7.f38999xf403ecf6);
                    if (z17) {
                        intent.putExtra("INTENT_SNS_LOCAL_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("sns_table_", c17933xe8d1b226.f38324x142bbdc6));
                    } else {
                        intent.putExtra("INTENT_SNSID", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", c19806x4c372b7.Id));
                        intent.putExtra("INTENT_SNS_OBJ", bArr);
                    }
                    intent.putExtra("INTENT_FROMGALLERY", false);
                    intent.putExtra("INTENT_NEED_RPT_FEED", true);
                    intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", str4);
                    intent.putExtra("INTENT_SNS_PAGE_SCENE", str5);
                    intent.putExtra("INTENT_ALBUM_SCENE", i17);
                    android.app.Activity activity = i18 instanceof android.app.Activity ? (android.app.Activity) i18 : null;
                    if (activity != null) {
                        db5.f.c(activity, null);
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(i18, arrayList.toArray(), "com/tencent/mm/flutter/plugin/SnsNativeRouterPlugin", "handleJumpToDetail", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    i18.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(i18, "com/tencent/mm/flutter/plugin/SnsNativeRouterPlugin", "handleJumpToDetail", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.SnsNativeRouterPlugin", "handleJumpToDetail leave normally, snsId=" + c19806x4c372b7.Id + " isLocal=" + z17);
                    p3321xbce91901.C29043x91b2b43d.Companion companion5 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
                    return;
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MircroMsg.SnsNativeRouterPlugin", th7, "handleJumpToDetail: parseFrom snsObjectBuffer failed, size=" + bArr.length, new java.lang.Object[0]);
                    p3321xbce91901.C29043x91b2b43d.Companion companion6 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7))));
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "handleJumpToDetail: jump failed with null buffer");
            p3321xbce91901.C29043x91b2b43d.Companion companion7 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
        } catch (java.lang.Throwable th8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MircroMsg.SnsNativeRouterPlugin", th8, "handleJumpToDetail: unexpected throwable", new java.lang.Object[0]);
            p3321xbce91901.C29043x91b2b43d.Companion companion8 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th8))));
        }
    }

    public final void h() {
        android.content.Context i17 = i();
        if (i17 != null && this.f489665g == null) {
            p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c = i17 instanceof p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c ? (p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) i17 : null;
            if (activityC0053x3d3f670c != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ho hoVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ho(activityC0053x3d3f670c, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342(activityC0053x3d3f670c));
                this.f489665g = hoVar;
                hoVar.f250058c = new si0.a1(this);
            }
        }
    }

    public final android.content.Context i() {
        return (android.content.Context) this.f489662d.get();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24817x841a06a7
    /* renamed from: jumpToSNSDetailWithSnsId */
    public void mo91950x70ed6ccd(long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.SnsNativeRouterPlugin", "jumpToSNSDetailWithSnsId >> snsId: " + ca4.z0.t0(j17));
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new si0.d1(this, new java.util.LinkedHashMap(), callback, j17, null), 3, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x036f, code lost:
    
        if (r28.equals("album_list") == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015b, code lost:
    
        if (r28.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0373, code lost:
    
        r0 = c01.z1.r();
        r2 = new android.content.Intent();
        r2.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.ui.AlbumUI"));
        r2.putExtra("sns_userName", r0);
        r2.putExtra(dm.i4.f66875xa013b0d5, r0);
        r2.putExtra("story_dot", false);
        r2.setFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        r2.addFlags(67108864);
        r0 = new java.util.ArrayList();
        r0.add(r2);
        java.util.Collections.reverse(r0);
        yj0.a.d(r4, r0.toArray(), "com/tencent/mm/flutter/plugin/SnsNativeRouterPlugin", "jumpToAlbum", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        r4.startActivity((android.content.Intent) r0.get(0));
        yj0.a.f(r4, "com/tencent/mm/flutter/plugin/SnsNativeRouterPlugin", "jumpToAlbum", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r30.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0026. Please report as an issue. */
    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24817x841a06a7
    /* renamed from: jumpToSNSNativePage */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo91951x951e4615(java.lang.String r28, java.util.Map r29, yz5.l r30) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.m1.mo91951x951e4615(java.lang.String, java.util.Map, yz5.l):void");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ho hoVar = this.f489665g;
        if (hoVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
        if (5985 == i17 && i18 == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
            return false;
        }
        hoVar.f250057b.k(i17, i18, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
        return false;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.SnsNativeRouterPlugin", "[" + hashCode() + "]onAttachedToActivity");
        this.f489663e = binding;
        this.f489662d = new java.lang.ref.WeakReference(binding.mo137508x19263085());
        binding.mo137502xbf77c2e1(this);
        mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().b(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.SnsNativeRouterPlugin", "[" + hashCode() + "]onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24817x841a06a7.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24817x841a06a7.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24817x841a06a7.Companion.m91953x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        oi0.e eVar = oi0.e.f427124d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z17 = true;
            } else if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        }
        if (z17) {
            oi0.e.f427125e = new java.lang.ref.WeakReference(this);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.SnsNativeRouterPlugin", "[" + hashCode() + "]onDetachedFromActivity");
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 interfaceC28627xb16524e3 = this.f489663e;
        if (interfaceC28627xb16524e3 != null) {
            interfaceC28627xb16524e3.mo137517xa002e684(this);
        }
        this.f489663e = null;
        mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().n(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 interfaceC28627xb16524e3 = this.f489663e;
        if (interfaceC28627xb16524e3 != null) {
            interfaceC28627xb16524e3.mo137517xa002e684(this);
        }
        this.f489663e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.SnsNativeRouterPlugin", "[" + hashCode() + "]onDetachedFromEngine");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24817x841a06a7.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24817x841a06a7.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24817x841a06a7.Companion.m91953x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        oi0.e eVar = oi0.e.f427124d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z17 = true;
            } else if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        }
        if (z17) {
            oi0.e.f427125e = new java.lang.ref.WeakReference(null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v7
    /* renamed from: onPostEnd */
    public void mo70052x3854353c(int i17, boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i17);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        mo260x9f807ad(binding);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v7
    /* renamed from: updateBackView */
    public void mo70053xb249ac15(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 x1Var) {
    }
}
