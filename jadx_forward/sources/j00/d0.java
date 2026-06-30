package j00;

/* loaded from: classes9.dex */
public final class d0 implements com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f378273d;

    /* renamed from: e, reason: collision with root package name */
    public final int f378274e = hashCode();

    public final void a(long j17, java.lang.String str, java.lang.String str2, yz5.l lVar) {
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.ecs.C23685xd9ee55b6(java.lang.Long.valueOf(j17), str, str2))));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: addNewAddress */
    public void mo43932xe03c35b5(boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f378273d;
        if (activity == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("activity is null")))));
        } else {
            b30.i a17 = b30.i.f99096b.a(activity);
            a17.a().add(new m00.b(callback));
            j45.l.n(activity, "address", ".ui.WalletAddAddressUI", null, 4360);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: callAppPay */
    public void mo43935x3fbe26c5(com.p314xaae8f345.p2845xc516c4b6.ecs.C23634xb11e796a payInfo, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payInfo, "payInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String m87581x48dc4674 = payInfo.m87581x48dc4674();
        java.lang.String m87580xf5da30d3 = payInfo.m87580xf5da30d3();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m87581x48dc4674) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m87580xf5da30d3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsGiftFlutterPlugin", "callAppPay error, payPackage or orderId is empty");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.ecs.C23635xf2489dd9(-1L, "payPackage or orderId invalid", null, 4, null))));
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.m) ((mh0.p) i95.n0.c(mh0.p.class))).wi(this.f378273d, m87581x48dc4674, new j00.z(m87580xf5da30d3, callback));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: editAddress */
    public void mo43944x2bd4c68a(com.p314xaae8f345.p2845xc516c4b6.ecs.C23633x64df374 address, boolean z17, yz5.l callback) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(address, "address");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f378273d;
        if (activity != null) {
            b30.i.f99096b.a(activity).a().add(new m00.c(callback, address));
            ct.o2 o2Var = (ct.o2) i95.n0.c(ct.o2.class);
            java.lang.Long m87558x338de979 = address.m87558x338de979();
            int longValue = m87558x338de979 != null ? (int) m87558x338de979.longValue() : 0;
            ((o71.b) o2Var).getClass();
            o71.l.Bi().g();
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0.class);
            intent.putExtra("address_id", longValue);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4361);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/address/app/AddrFeatureService", "launchEditAddressUIForResult", "(Landroid/app/Activity;II)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("activity is null")))));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: enableGiftPageSwipe */
    public void mo43945x884091d8() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftFlutterPlugin", "enableGiftPageSwipe");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: getAllAddress */
    public void mo43949xfcc28b09(boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((o71.b) ((ct.o2) i95.n0.c(ct.o2.class))).wi(new m00.d(callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: getEcsGiftImgCacheDirectory */
    public java.lang.String mo43960x4e1a93f() {
        java.lang.String valueOf = java.lang.String.valueOf((java.lang.String) ((jz5.n) ((j00.d2) ((c00.m3) i95.n0.c(c00.m3.class))).f378279d).mo141623x754a37bb());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftFlutterPlugin", "getEcsGiftImgCacheDirectory, dir: ".concat(valueOf));
        return valueOf;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: getPoiInfo */
    public void mo43968x25db91e2(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: getSearchtExtraSessionData */
    public java.lang.String mo43971xda8f78e6() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: launchSearch */
    public void mo43999x418da33b(java.lang.String extData, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extData, "extData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: markBoxUnwrap */
    public void mo44001x8827ffc1(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftFlutterPlugin", "markBoxUnwrap, giftMsgId is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftFlutterPlugin", "markBoxUnwrap, giftMsgId:" + str + ", sendType:" + j17);
        int i17 = (int) j17;
        if (i17 == 0 || i17 == 1) {
            n00.f a17 = n00.d.f415348a.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            a17.J0(str, true);
            return;
        }
        n00.f a18 = n00.d.f415348a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        a18.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgRecordStorage", "updateOrInsertHasMsgClicked, isInsertNew:true");
        if (a18.D0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgRecordStorage", "updateOrInsertHasMsgClicked, is insert new is true, update directly");
            a18.J0(str, true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgRecordStorage", "updateOrInsertHasMsgClicked, is insert new is true, insert new");
            a18.z0(str, 0L, "", true, "", false);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: nativeRouter */
    public void mo44004x8d362640(com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a request, yz5.l callback) {
        android.app.Activity activity;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftFlutterPlugin", "nativeRouter");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(request.m87727x29c21c7c())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsGiftFlutterPlugin", "nativeRouter error, params invalid");
            a(-1L, "", "", callback);
            return;
        }
        try {
            java.lang.String m87727x29c21c7c = request.m87727x29c21c7c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m87727x29c21c7c);
            org.json.JSONObject jSONObject = new org.json.JSONObject(m87727x29c21c7c);
            int i17 = jSONObject.getInt("recipientType");
            java.lang.Long m87728xfb85f7b0 = request.m87728xfb85f7b0();
            bw5.x7 Ai = m87728xfb85f7b0 != null ? ((j00.d2) ((c00.m3) i95.n0.c(c00.m3.class))).Ai(m87728xfb85f7b0.longValue(), i17) : null;
            if (Ai == null || (activity = this.f378273d) == null) {
                return;
            }
            pq.a aVar = new pq.a(activity);
            aVar.b(jSONObject);
            java.lang.Long m87728xfb85f7b02 = request.m87728xfb85f7b0();
            i00.a[] aVarArr = i00.a.f368028d;
            if (m87728xfb85f7b02 != null && m87728xfb85f7b02.longValue() == 7) {
                bw5.g8 g8Var = new bw5.g8();
                g8Var.f109245e = true;
                g8Var.f109255r[2] = true;
                aVar.f439085b.e(g8Var);
                ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).wi(aVar, Ai, new j00.b0(request, this, callback));
            }
            aVar.f439086c = new j00.a0(this, callback);
            ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).wi(aVar, Ai, new j00.b0(request, this, callback));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EcsGiftFlutterPlugin", e17, "", new java.lang.Object[0]);
            a(1L, "", "", callback);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f378273d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftFlutterPlugin", "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e.Companion companion = com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e.Companion.m87689x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f378273d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f378273d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftFlutterPlugin", "onDetachedFromEngine");
        com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e.Companion companion = com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e.Companion.m87689x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: onEcsGiftResendCompleted */
    public void mo44008xf64303ea(com.p314xaae8f345.p2845xc516c4b6.ecs.C23683xb6c76994 result) {
        java.lang.Object m143895xf1229813;
        java.lang.Long m87715x348bb483;
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        j00.e0 e0Var = (j00.e0) ((j00.z3) i95.n0.c(j00.z3.class));
        e0Var.getClass();
        e0Var.f378289f.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.Gift.Live.EcsGiftInLiveMonitor", "onFinishResend, seqId: " + result.m87716x7521d024() + ", errCode: " + result.m87714xe591acbc());
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            jz5.l[] lVarArr = new jz5.l[4];
            j00.s1[] s1VarArr = j00.s1.f378418d;
            lVarArr[0] = new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(1));
            lVarArr[1] = new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54499xf5c94a0, "resend_end");
            java.lang.String m87716x7521d024 = result.m87716x7521d024();
            if (m87716x7521d024 == null) {
                m87716x7521d024 = "";
            }
            lVarArr[2] = new jz5.l("seqId", m87716x7521d024);
            lVarArr[3] = new jz5.l("errCode", java.lang.String.valueOf(result.m87714xe591acbc()));
            java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(lVarArr)).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject, ",", ";", false);
            y02.v0 a17 = y02.x0.f540167d.a();
            if (a17 != null) {
                a17.p1(bw5.d5.EcsGiftSendFlow, 1, t17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Ecs.Gift.Live.EcsGiftInLiveMonitor", m143898xd4a2fc34, "onFinishResend", new java.lang.Object[0]);
        }
        java.lang.String m87716x7521d0242 = result.m87716x7521d024();
        if (m87716x7521d0242 != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = e0Var.f378288e;
            c00.l3 l3Var = (c00.l3) concurrentHashMap.get(m87716x7521d0242);
            if (l3Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.as asVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.as) l3Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(asVar.f199326a.f199813J, "cgiSendWxGiftAgain ecsResult orderID " + result.m87715x348bb483() + " errorCode " + result.m87714xe591acbc());
                java.lang.Long m87714xe591acbc = result.m87714xe591acbc();
                long longValue = m87714xe591acbc != null ? m87714xe591acbc.longValue() : 0L;
                v65.n nVar = asVar.f199327b;
                if (longValue != 0 || ((m87715x348bb483 = result.m87715x348bb483()) != null && m87715x348bb483.longValue() == 0)) {
                    nVar.a(null);
                } else {
                    nVar.a(result.m87715x348bb483());
                }
            }
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f378273d = binding.mo137508x19263085();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: openUrl */
    public void mo44022xb4b50ac5(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        android.app.Activity activity = this.f378273d;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: publishEcsGiftOpenEvent */
    public void mo44026x10a90cba(long j17, java.lang.String eventId, java.lang.String str, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        c00.d3 d3Var = (c00.d3) i95.n0.c(c00.d3.class);
        bw5.j8 a17 = bw5.j8.a((int) j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "forNumber(...)");
        bw5.i8 i8Var = new bw5.i8();
        i8Var.f110027f = str;
        i8Var.f110029h[3] = true;
        ((j00.o) d3Var).Ai(eventId, a17, i8Var);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: publishEscGiftNotifyEvent */
    public void mo44027x7093fabb(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftFlutterPlugin", "publishEscGiftNotifyEvent, eventType:" + j17);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5315x902ce14c c5315x902ce14c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5315x902ce14c();
        c5315x902ce14c.f135631g.f88660a = (int) j17;
        c5315x902ce14c.b(android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: selectAddress */
    public void mo44036xe6b6ab58(boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f378273d;
        if (activity == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Throwable("selectAddress activity null")))));
            return;
        }
        b30.i a17 = b30.i.f99096b.a(activity);
        a17.a().add(new m00.e(callback));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("pageTitle", com.p314xaae8f345.mm.R.C30867xcad56011.neh);
        intent.putExtra("launch_from_ecs_gift", true);
        intent.putExtra("KEY_ITEM_SHOW_EDIT", true);
        j45.l.o(activity, "address", ".ui.WalletSelectAddrUI", intent, 4359, false);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: selectContact */
    public void mo44037x63d63384(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: selectStandardAddress */
    public void mo44038x5fcee1db(java.lang.String str, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            ((b30.k) ((c00.w2) i95.n0.c(c00.w2.class))).Ai(this.f378273d, this.f378274e, jSONObject, new j00.c0(this, callback));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EcsGiftFlutterPlugin", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: sendLocalGiftMessage */
    public void mo44039x4ec003f4(java.lang.String str, java.lang.String str2, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23660x9fa9ca8e
    /* renamed from: updateEcsGiftMsgStatus */
    public void mo44046xc0e738d7(java.lang.String giftMsgId, com.p314xaae8f345.p2845xc516c4b6.ecs.C23649xe87ad48d statusInfo, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftMsgId, "giftMsgId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusInfo, "statusInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        j00.k1 k1Var = (j00.k1) ((c00.e3) i95.n0.c(c00.e3.class));
        k1Var.getClass();
        ((ku5.t0) ku5.t0.f394148d).h(new j00.i1(statusInfo, giftMsgId, k1Var), "MicroMsg.EcsGiftMsgService");
    }
}
