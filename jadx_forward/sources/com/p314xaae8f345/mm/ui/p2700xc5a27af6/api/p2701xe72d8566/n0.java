package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class n0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f290063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 f290064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qj5.q f290065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f290066g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f290067h;

    public n0(qj5.n nVar, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var, qj5.q qVar, android.app.Activity activity, java.util.HashMap hashMap) {
        this.f290063d = nVar;
        this.f290064e = j1Var;
        this.f290065f = qVar;
        this.f290066g = activity;
        this.f290067h = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p15.x l17;
        k91.v5 b17;
        p15.m j17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c;
        java.lang.String str4 = this.f290063d.f445519t2;
        if (str4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotShareService", "image is null");
            return;
        }
        int itemId = menuItem.getItemId();
        boolean z17 = false;
        switch (itemId) {
            case 910524417:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "shareToFriend onClick");
                this.f290064e.Bi(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.w.f290098g);
                com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var = this.f290064e;
                qj5.q qVar = this.f290065f;
                android.app.Activity activity = this.f290066g;
                boolean z18 = this.f290063d.f445520u2;
                j1Var.getClass();
                jd5.a aVar = new jd5.a();
                aVar.p(str4);
                aVar.q(qVar.b(!z18));
                n13.r rVar = new n13.r();
                rVar.f415650a = true;
                rVar.f415651b = 910524417;
                rVar.f415652c = j1Var;
                ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activity, aVar, rVar);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_type_btn", "view_clk", kz5.c1.n(kz5.c1.n(this.f290067h, new jz5.l("forward_method", 2)), new jz5.l("is_with_jump", java.lang.Integer.valueOf(qj5.q.g(this.f290065f, false, 1, null) != null ? 1 : 2))), 36458);
                return;
            case 910524418:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "shareToSns onClick");
                this.f290064e.Bi(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.w.f290096e);
                com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var2 = this.f290064e;
                android.app.Activity activity2 = this.f290066g;
                j1Var2.getClass();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Ksnsupload_source", 1);
                intent.putExtra("need_result", true);
                intent.putExtra("Ksnsupload_type", 0);
                intent.putExtra("sns_kemdia_path", str4);
                if (activity2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
                    j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity2, ".plugin.sns.ui.SnsUploadUI", intent, 910524418, j1Var2);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotShareService", "shareToSns, context is not MMFragmentActivity, drop \"Hide when success\" logic");
                    j45.l.n(activity2, "sns", ".ui.SnsUploadUI", intent, 910524418);
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_type_btn", "view_clk", kz5.c1.n(this.f290067h, new jz5.l("screenshot_share_type", 3)), 36458);
                return;
            case 910524419:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "saveToFav onClick, imagePath: ".concat(str4));
                this.f290064e.Bi(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.w.f290100i);
                com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var3 = this.f290064e;
                android.app.Activity activity3 = this.f290066g;
                j1Var3.getClass();
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str4), com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.m.class, new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.a1(activity3, j1Var3));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_type_btn", "view_clk", kz5.c1.n(this.f290067h, new jz5.l("screenshot_share_type", 2)), 36458);
                return;
            default:
                switch (itemId) {
                    case 910524425:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "image search onClick, imagePath: ".concat(str4));
                        this.f290064e.Bi(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.w.f290101m);
                        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var4 = this.f290064e;
                        qj5.q qVar2 = this.f290065f;
                        android.app.Activity activity4 = this.f290066g;
                        j1Var4.getClass();
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        linkedHashMap.put("imgPath", str4);
                        p15.n g17 = qj5.q.g(qVar2, false, 1, null);
                        if (g17 != null && (j17 = g17.j()) != null) {
                            switch (j17.j()) {
                                case 10:
                                case 12:
                                    java.lang.String k17 = j17.k();
                                    if (k17 != null) {
                                        try {
                                            android.net.Uri parse = android.net.Uri.parse(k17);
                                            java.lang.String queryParameter = parse.getQueryParameter(dm.i4.f66875xa013b0d5);
                                            if (queryParameter != null) {
                                                linkedHashMap.put("finderUserName", queryParameter);
                                            }
                                            java.lang.String queryParameter2 = parse.getQueryParameter("feedid");
                                            if (queryParameter2 != null) {
                                                linkedHashMap.put("referrerFeedId", queryParameter2);
                                                break;
                                            }
                                        } catch (java.lang.IllegalArgumentException e17) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScreenShotShareService", e17, "parse source fail", new java.lang.Object[0]);
                                            break;
                                        }
                                    }
                                    break;
                                case 11:
                                    linkedHashMap.put("sourceUrl", j17.k());
                                    break;
                            }
                        }
                        p15.n g18 = qj5.q.g(qVar2, false, 1, null);
                        if (g18 != null && (l17 = g18.l()) != null && (b17 = k91.w5.f387346b.b(l17.m157697x74292566(), new java.lang.String[0])) != null) {
                            linkedHashMap.put("wxaUserName", b17.f68924xdec927b);
                        }
                        ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ai(activity4, 15, 2, linkedHashMap);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_type_btn", "view_clk", kz5.c1.n(this.f290067h, new jz5.l("screenshot_share_type", 1)), 36458);
                        return;
                    case 910524426:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "shareToBiz onClick");
                        this.f290064e.Bi(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.w.f290096e);
                        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var5 = this.f290064e;
                        android.app.Activity activity5 = this.f290066g;
                        j1Var5.getClass();
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        tk.t tVar = tk.u.f501404e;
                        jSONObject.put("mpPublishAction", 2);
                        jSONObject.put("publishScene", "screenShot");
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1401);
                        jSONObject.put("weAppParam", jSONObject2);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                            str = "share_type_btn";
                            str2 = "view_clk";
                            obj = "screenshot_share_type";
                            ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Di(activity5, jSONObject, kz5.b0.c(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23531x767fe49d(str4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null)), new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.b1(j1Var5));
                        } else {
                            str = "share_type_btn";
                            str2 = "view_clk";
                            obj = "screenshot_share_type";
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("image_path", str4);
                            bundle.putString("json_params", jSONObject.toString());
                            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.n1.class, new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.d1(j1Var5));
                        }
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, str2, kz5.c1.n(this.f290067h, new jz5.l(obj, 6)), 36458);
                        return;
                    case 910524427:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "share to gamecircle onClick, imagePath: ".concat(str4));
                        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var6 = this.f290064e;
                        qj5.q qVar3 = this.f290065f;
                        android.app.Activity context = this.f290066g;
                        j1Var6.getClass();
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("imagePath", str4);
                        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
                            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).m78750xc5512edd(j1Var6);
                        } else if ((context instanceof q80.z) && (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback)) {
                            ((q80.z) context).R1(new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.e1(j1Var6));
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotShareService", "shareToGameCircle, context is not MMFragmentActivity, drop \"Hide when success\" logic");
                        }
                        org.json.JSONObject f17 = qVar3.f();
                        if (f17 != null) {
                            intent2.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, f17.toString());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "shareToGameCircle: extraData=" + f17);
                        }
                        ((et.i) ((ft.y3) i95.n0.c(ft.y3.class))).getClass();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) context;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc q76 = activityC12666xc288131a.q7();
                            if (q76 != null && (mo48805xd384d23c = q76.mo48805xd384d23c()) != null && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.m48815xb9a3283c(mo48805xd384d23c)) {
                                z17 = true;
                            }
                            if (z17) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc q77 = activityC12666xc288131a.q7();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q77);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c2 = q77.mo48805xd384d23c();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo48805xd384d23c2);
                                str3 = mo48805xd384d23c2.f156336n;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getAppId(...)");
                                intent2.putExtra("gameAppId", str3);
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).bj(context, intent2);
                                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_type_btn", "view_clk", kz5.c1.n(this.f290067h, new jz5.l("screenshot_share_type", 5)), 36458);
                                return;
                            }
                        }
                        str3 = "";
                        intent2.putExtra("gameAppId", str3);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).bj(context, intent2);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_type_btn", "view_clk", kz5.c1.n(this.f290067h, new jz5.l("screenshot_share_type", 5)), 36458);
                        return;
                    default:
                        return;
                }
        }
    }
}
