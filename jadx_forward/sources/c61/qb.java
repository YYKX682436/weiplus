package c61;

/* loaded from: classes11.dex */
public final class qb implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f120804d;

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchAppChooser */
    public void mo14362x4a162fed(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24539xde1e0d82 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchAppChooser(filePath=" + request.m90978x5000ed37() + ", fileExt=" + request.m90976xad696cf() + ", fileName=" + request.m90977x5000039d() + ')');
        android.app.Activity activity = this.f120804d;
        if (activity == null) {
            return;
        }
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        java.lang.String m90977x5000039d = request.m90977x5000039d();
        if (m90977x5000039d == null) {
            m90977x5000039d = "";
        }
        java.lang.String str = m90977x5000039d;
        if (!(str.length() > 0)) {
            ((ht.a) vVar).wi(activity, request.m90978x5000ed37(), request.m90976xad696cf(), 1);
            return;
        }
        java.lang.String m90978x5000ed37 = request.m90978x5000ed37();
        java.lang.String m90976xad696cf = request.m90976xad696cf();
        ((ht.a) vVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.i(activity, 0L, "", m90978x5000ed37, m90976xad696cf, str, 1);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchBizArticle */
    public void mo14363xe6d3d876(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24542x8824b99 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchBizArticle(url=" + request.m91010xb5887639() + ", username=" + request.m91011x6c03c64c() + ", srcUsername=" + request.m91009xcfc1cda4() + ", appId=" + request.m91006x74292566() + ", itemShowType=" + request.m91007x7235c680() + ')');
        android.app.Activity activity = this.f120804d;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", request.m91010xb5887639());
        java.lang.String m91009xcfc1cda4 = request.m91009xcfc1cda4();
        if (!(m91009xcfc1cda4 == null || m91009xcfc1cda4.length() == 0)) {
            intent.putExtra("srcUsername", request.m91009xcfc1cda4());
            java.lang.String m91008x5edab6df = request.m91008x5edab6df();
            if (m91008x5edab6df == null) {
                m91008x5edab6df = "";
            }
            intent.putExtra("srcDisplayname", m91008x5edab6df);
        }
        java.lang.String m91006x74292566 = request.m91006x74292566();
        if (!(m91006x74292566 == null || m91006x74292566.length() == 0)) {
            intent.putExtra("KAppId", request.m91006x74292566());
        }
        java.lang.Long m91007x7235c680 = request.m91007x7235c680();
        int longValue = (int) (m91007x7235c680 != null ? m91007x7235c680.longValue() : -1L);
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        ((yq1.z) a0Var).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(3)) {
            if (((yq1.z) a0Var).E(activity, request.m91010xb5887639(), longValue, false, 3, 0, intent)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchBizArticle: jump to TmplWebview (preloaded)");
                return;
            }
        }
        j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchBizTimeline */
    public void mo14364xc11f38c1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchBizTimeline()");
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Zi();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchDoubleLinkSettings */
    public void mo14365x287c4dc1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchDoubleLinkSettings()");
        android.content.Intent intent = new android.content.Intent();
        android.app.Activity activity = this.f120804d;
        if (activity == null) {
            return;
        }
        intent.setClassName(activity, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera");
        intent.putExtra("activity_caller_params", 1);
        intent.setFlags(268435456);
        android.app.Activity activity2 = this.f120804d;
        if (activity2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/plugin/FlutterRouterPlugin", "launchDoubleLinkSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/plugin/FlutterRouterPlugin", "launchDoubleLinkSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchFinderFeed */
    public void mo14366xfe8a8af7(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24559xaf7f72b8 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchFinderFeed(" + request.m91059x18e4224f() + ", " + request.m91060xbc613d34() + ')');
        android.app.Activity activity = this.f120804d;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_user", c01.z1.r());
        intent.putExtra("feed_object_id", request.m91059x18e4224f());
        intent.putExtra("feed_object_nonceId", request.m91060xbc613d34());
        intent.putExtra("key_session_id", c01.id.a());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(33, 2, 25, intent);
        intent.putExtra("key_comment_scene", 25);
        intent.putExtra("key_extra_info", "");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.b(ya2.e1.f542005a, activity, intent, false, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchFinderProfile */
    public void mo14367x641e39b0(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24560x79318199 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchFinderProfile(" + request.m91071x93d5ac12() + ')');
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("action", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.h0.f34297x24728b);
            jSONObject2.put("finderUserName", request.m91071x93d5ac12());
            jSONObject.put("extInfo", jSONObject2);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f542005a;
            android.app.Activity activity = this.f120804d;
            if (activity == null) {
                return;
            }
            e1Var.F(activity, jSONObject.toString(), null, null);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterRouterPlugin", "launchFinderProfile failed: " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchFinderTimeline */
    public void mo14368xdf9f251a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchFinderTimeline()");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        android.app.Activity activity = this.f120804d;
        if (activity == null) {
            return;
        }
        e1Var.C(activity, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchGallery */
    public void mo14369x6f20ec1f(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24598x2c7a4346 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchGallery(mediaItems.size=" + request.m91198x60aa8e32().size() + ')');
        android.app.Activity activity = this.f120804d;
        if (activity == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : request.m91198x60aa8e32()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24599xb4b52e01 c24599xb4b52e01 = (com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24599xb4b52e01) obj;
            if (c24599xb4b52e01 != null) {
                com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10615x40454758 c10615x40454758 = new com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10615x40454758();
                e60.v0 v0Var = new e60.v0(c24599xb4b52e01.m91210x5000ed37(), "", 0, null);
                java.lang.String m91211x75e04be9 = c24599xb4b52e01.m91211x75e04be9();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m91211x75e04be9, "<set-?>");
                c10615x40454758.f148639e = m91211x75e04be9;
                c10615x40454758.f148640f = ((zh5.l0) ((e60.d1) i95.n0.c(e60.d1.class))).wi(v0Var);
                int i19 = c61.pb.f120767a[c24599xb4b52e01.m91212x7f025288().ordinal()];
                int i27 = 1;
                if (i19 == 1) {
                    i27 = 0;
                } else if (i19 != 2) {
                    i27 = -1;
                }
                c10615x40454758.f148638d = i27;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "Gallery media i=" + i17 + ", mediaId=" + c24599xb4b52e01.m91211x75e04be9() + ", type=" + c10615x40454758.f148638d + ", mediaUri=" + c10615x40454758.f148640f);
                arrayList.add(c10615x40454758);
            }
            i17 = i18;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24600xb4b90cd2 m91197xcc481a26 = request.m91197xcc481a26();
        e60.t0 t0Var = new e60.t0(null, 0, 0, (int) request.m91196xbc4070d0(), false, false, new e60.u0((int) m91197xcc481a26.m91226xfb82087d(), (int) m91197xcc481a26.m91228xb588721f(), (int) (m91197xcc481a26.m91227x75156866() - m91197xcc481a26.m91226xfb82087d()), (int) (m91197xcc481a26.m91225x12a4bd21() - m91197xcc481a26.m91228xb588721f())), 55, null);
        ((zh5.l0) ((e60.d1) i95.n0.c(e60.d1.class))).getClass();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2717x62f6fe4.ActivityC22445xcae55707.class);
        intent.putParcelableArrayListExtra("key_media_gallery_data", new java.util.ArrayList<>(arrayList));
        intent.putExtra("key_media_gallery_config", t0Var);
        pf5.j0.a(intent, ei5.a.class);
        e60.u0 u0Var = t0Var.f331272m;
        intent.putExtra("img_gallery_left", u0Var.f331273d);
        intent.putExtra("img_gallery_top", u0Var.f331274e);
        intent.putExtra("img_gallery_width", u0Var.f331275f);
        intent.putExtra("img_gallery_height", u0Var.f331276g);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/ui/media/common/MediaGalleryServiceImpl", "openFlutterGallery", "(Landroid/content/Context;Lcom/tencent/mm/feature/gallery/api/GalleryConfig;Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/media/common/MediaGalleryServiceImpl", "openFlutterGallery", "(Landroid/content/Context;Lcom/tencent/mm/feature/gallery/api/GalleryConfig;Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchSnsPost */
    public void mo14370x70c305(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24700x6b5e5824 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchUserProfile(" + request.m91507x6c03c64c() + ", " + request.m91506x51f8f5b0() + ')');
        android.app.Activity activity = this.f120804d;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        intent.putExtra("INTENT_TALKER", request.m91507x6c03c64c());
        intent.putExtra("INTENT_SNS_LOCAL_ID", request.m91506x51f8f5b0());
        intent.putExtra("INTENT_FROMGALLERY", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(1);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/FlutterRouterPlugin", "launchSnsPost", "(Lcom/tencent/pigeon/mm_foundation/SnsPostLaunchRequest;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchTingCategory */
    public void mo14371xade6295f(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24701x809b8490 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchTingCategory(data size=" + request.m91517x3047c7f1().length + ')');
        android.app.Activity activity = this.f120804d;
        if (activity == null) {
            return;
        }
        bw5.o50 mo11468x92b714fd = new bw5.o50().mo11468x92b714fd(request.m91517x3047c7f1());
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
        qk.f9.c(aj6, activity, mo11468x92b714fd, null, null, null, 28, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchTingForFile */
    public boolean mo14372xc44a6d64(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24702x8e0e11a5 request) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchTingForFile(filePath=" + request.m91532x5000ed37() + ", fileExt=" + request.m91530xad696cf() + ", fileName=" + request.m91531x5000039d() + ", tingScene=" + request.m91533x393beb88() + ')');
        android.app.Activity activity = this.f120804d;
        if (activity == null) {
            return false;
        }
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(request.m91532x5000ed37(), false);
        if (!com.p314xaae8f345.mm.vfs.w6.j(i18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterRouterPlugin", "launchTingForFile filePath not exist: " + i18);
            return false;
        }
        ef0.f2 f2Var = (ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class));
        if (f2Var.Ai(request.m91530xad696cf())) {
            bw5.l80 wi6 = f2Var.wi(request.m91532x5000ed37(), request.m91530xad696cf(), request.m91531x5000039d(), null);
            java.lang.Long m91533x393beb88 = request.m91533x393beb88();
            if (m91533x393beb88 != null) {
                i17 = (int) m91533x393beb88.longValue();
            } else {
                bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                i17 = 0;
            }
            if (f2Var.Ni(wi6, new il4.e(null, 0, i17, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554419, null))) {
                return true;
            }
        }
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        java.lang.String m91531x5000039d = request.m91531x5000039d();
        if (m91531x5000039d == null) {
            m91531x5000039d = "";
        }
        java.lang.String str = m91531x5000039d;
        if (str.length() > 0) {
            java.lang.String m91532x5000ed37 = request.m91532x5000ed37();
            java.lang.String m91530xad696cf = request.m91530xad696cf();
            ((ht.a) vVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.i(activity, 0L, "", m91532x5000ed37, m91530xad696cf, str, 1);
        } else {
            ((ht.a) vVar).wi(activity, request.m91532x5000ed37(), request.m91530xad696cf(), 1);
        }
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchTingPlayer */
    public void mo14373xd523ab82(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24703x7626cc0d request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchTingPlayer(autoPlay=" + request.m91544xd199aaf9() + ", data size=" + request.m91545xd85898e1().length + ')');
        android.app.Activity activity = this.f120804d;
        if (activity == null) {
            return;
        }
        qk.f9.b(((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj(), activity, request.m91544xd199aaf9(), new bw5.lp0().mo11468x92b714fd(request.m91545xd85898e1()), new il4.e(null, 0, 1300, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554419, null), null, null, bw5.ar0.TingScene_Chat, null, 176, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e
    /* renamed from: launchUserProfile */
    public void mo14374x3a53b1ab(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24705x7cb638be request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchUserProfile(" + request.m91575x6c03c64c() + ')');
        android.app.Activity activity = this.f120804d;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.U;
        intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.class);
        intent.putExtra("Contact_User", request.m91575x6c03c64c());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/FlutterRouterPlugin", "launchUserProfile", "(Lcom/tencent/pigeon/mm_foundation/UserProfileLaunchRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/FlutterRouterPlugin", "launchUserProfile", "(Lcom/tencent/pigeon/mm_foundation/UserProfileLaunchRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f120804d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e.Companion.m91495x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f120804d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f120804d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24684xc81ac47e.Companion.m91495x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f120804d = binding.mo137508x19263085();
    }
}
