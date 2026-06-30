package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public class n9 {

    /* renamed from: t, reason: collision with root package name */
    public static jz5.l f283550t;

    /* renamed from: a, reason: collision with root package name */
    public android.app.Activity f283551a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f283554d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f283555e;

    /* renamed from: f, reason: collision with root package name */
    public b12.o f283556f;

    /* renamed from: g, reason: collision with root package name */
    public b12.j f283557g;

    /* renamed from: h, reason: collision with root package name */
    public b12.g f283558h;

    /* renamed from: m, reason: collision with root package name */
    public f21.g f283563m;

    /* renamed from: n, reason: collision with root package name */
    public oq.e f283564n;

    /* renamed from: o, reason: collision with root package name */
    public f21.e f283565o;

    /* renamed from: p, reason: collision with root package name */
    public jh5.a f283566p;

    /* renamed from: q, reason: collision with root package name */
    public d12.b f283567q;

    /* renamed from: r, reason: collision with root package name */
    public jh5.b f283568r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f283569s;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 f283552b = null;

    /* renamed from: c, reason: collision with root package name */
    public kh5.h f283553c = null;

    /* renamed from: i, reason: collision with root package name */
    public int f283559i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f283560j = false;

    /* renamed from: k, reason: collision with root package name */
    public long f283561k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final kh5.a f283562l = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.o9(this);

    public n9() {
        jh5.a aVar = jh5.a.f381394e;
        this.f283566p = jh5.a.f381394e;
        this.f283569s = false;
    }

    public static void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9 n9Var, d12.b bVar, f21.e eVar, android.app.Activity context, boolean z17) {
        n9Var.getClass();
        if (eVar == null) {
            return;
        }
        int i17 = eVar.f340414q;
        if (i17 == 3) {
            if (bVar == null) {
                return;
            }
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79.f178970o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            java.lang.String keyword = bVar.f307248a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79.class);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("keyword", keyword);
            bundle.putString("trace_id", bVar.f307249b);
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, bVar.f307250c);
            bundle.putString("egg_name", eVar.f340405e);
            bundle.putString("background", eVar.f340412o.f340392n);
            bundle.putBoolean("is_chat_room", z17);
            intent.putExtras(bundle);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/EggMgr", "onLuckyClick", "(Lcom/tencent/mm/plugin/eggspring/model/LuckyBagInfo;Lcom/tencent/mm/modelpackage/EggInfo;Landroid/app/Activity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/chatting/EggMgr", "onLuckyClick", "(Lcom/tencent/mm/plugin/eggspring/model/LuckyBagInfo;Lcom/tencent/mm/modelpackage/EggInfo;Landroid/app/Activity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (i17 == 2) {
            f21.d dVar = eVar.f340415r;
            if (dVar == null) {
                return;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.f340384h)) {
                q80.d0 d0Var = new q80.d0(eVar.f340415r.f340384h);
                d0Var.f442204w = 3000L;
                d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559390df;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.q9(n9Var, d0Var, context));
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f340415r.f340382f)) {
                return;
            }
            java.lang.String str = eVar.f340415r.f340382f;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", str);
            intent2.putExtra("from_shortcut", true);
            intent2.putExtra("disable_minimize", true);
            intent2.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            intent2.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent2, 3001);
            context.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            return;
        }
        if (i17 == 4) {
            if (bVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f307253f)) {
                return;
            }
            java.lang.String str2 = bVar.f307253f;
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("rawUrl", str2);
            intent3.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            intent3.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent3, 3001);
            context.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            return;
        }
        if (i17 == 5) {
            java.lang.String str3 = eVar.f340419v.f340438e;
            e30.e eVar2 = (e30.e) i95.n0.c(e30.e.class);
            java.lang.String str4 = n9Var.f283558h.f98584f;
            d30.a aVar = (d30.a) eVar2;
            aVar.getClass();
            l81.b1 b1Var = new l81.b1();
            b1Var.f398545a = str3;
            boolean z18 = 1 == bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Egg_PreviewMiniApp_Int, 0);
            b1Var.f398565k = 1189;
            if (z18) {
                b1Var.f398549c = 2;
            } else {
                b1Var.f398549c = 0;
            }
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                b1Var.f398561i = new d30.d(aVar, str4);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggSpringFeatureService", "goMiniApp username:%s", str3);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.m9 b(java.lang.String r8, f21.g r9, oq.e r10) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9.b(java.lang.String, f21.g, oq.e):com.tencent.mm.ui.chatting.m9");
    }

    public static boolean d(f21.e eVar) {
        if (eVar == null) {
            return false;
        }
        int i17 = eVar.f340414q;
        return i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5;
    }

    public final void c(final f21.e eVar, java.lang.String keyword) {
        int i17;
        if (eVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(keyword)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(eVar != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EggMgr", "egg info or keyWord err!!! info != null:[%s].", objArr);
            return;
        }
        b12.k.f98593a.b(2, b12.k.f98600h, "");
        if (d(eVar)) {
            int i18 = eVar.f340414q;
            if (i18 == 3) {
                if (this.f283556f == null) {
                    this.f283556f = new b12.o();
                }
                b12.o oVar = this.f283556f;
                oVar.f98617e = new yz5.l() { // from class: com.tencent.mm.ui.chatting.n9$$a
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        d12.b bVar = (d12.b) obj;
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9 n9Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9.this;
                        n9Var.getClass();
                        f21.e eVar2 = eVar;
                        if (eVar2.f340412o.f340402x == null && eVar2.f340417t != 1) {
                            return null;
                        }
                        n9Var.f(eVar2, bVar);
                        return null;
                    }
                };
                oVar.f98618f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21849x6288e77();
                java.lang.String str = eVar.f340412o.f340385d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringLuckyEggHelper", "start check egg: appId=" + str + ", keyword=" + keyword + " lastCheckTime： " + oVar.f98615c + " now: " + elapsedRealtime);
                long j17 = oVar.f98615c;
                if (j17 > 0 && (i17 = oVar.f98616d) > 0) {
                    long j18 = elapsedRealtime - j17;
                    if (j18 < i17 * 1000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpringLuckyEggHelper", "The check is too frequent, interval=" + oVar.f98616d + ", delta=" + j18);
                        yz5.l lVar = oVar.f98618f;
                        if (lVar != null) {
                            lVar.mo146xb9724478(b12.l.f98602e);
                            return;
                        }
                        return;
                    }
                }
                oVar.f98615c = elapsedRealtime;
                p3325xe03a0797.p3326xc267989b.r2 r2Var = oVar.f98614b;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                oVar.f98614b = p3325xe03a0797.p3326xc267989b.l.d(oVar.f98613a, null, null, new b12.n(oVar, keyword, str, null), 3, null);
                return;
            }
            if (i18 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggMgr", "initLuckyBagOrNot: game lucky egg %s", eVar.f340415r.f340380d);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = this.f283552b;
                if (c21614x5c06ae16 != null) {
                    c21614x5c06ae16.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.r9(this, eVar));
                    ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
                    return;
                }
                return;
            }
            if (i18 == 4) {
                if (this.f283557g == null) {
                    this.f283557g = new b12.j();
                }
                b12.j jVar = this.f283557g;
                jVar.f98592e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.s9(this, eVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggRedEnvelopeHelper", "checkShowEgg: ");
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                if (android.os.SystemClock.elapsedRealtime() - jVar.f98590c <= jVar.f98591d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EggRedEnvelopeHelper", "checkShowEgg: " + jVar.f98590c + ", " + jVar.f98591d + ", " + elapsedRealtime2);
                    return;
                }
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_egg_red_envelope_percent, 100);
                int d17 = c06.e.f119249d.d(100);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggRedEnvelopeHelper", "checkShowEgg: percent " + Ni + ", " + d17);
                if (d17 >= Ni) {
                    return;
                }
                jVar.f98590c = elapsedRealtime2;
                p3325xe03a0797.p3326xc267989b.r2 r2Var2 = jVar.f98589b;
                if (r2Var2 != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                }
                jVar.f98589b = p3325xe03a0797.p3326xc267989b.l.d(jVar.f98588a, null, null, new b12.i(jVar, null), 3, null);
                return;
            }
            if (i18 == 5) {
                if (this.f283558h == null) {
                    this.f283558h = new b12.g();
                }
                b12.g gVar = this.f283558h;
                gVar.f98583e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.t9(this, eVar);
                java.lang.Long l17 = b12.k.f98597e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggMiniAppHelper", "checkShowEgg: " + l17);
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                if (android.os.SystemClock.elapsedRealtime() - gVar.f98581c <= gVar.f98582d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EggMiniAppHelper", "checkShowEgg: " + gVar.f98581c + ", " + gVar.f98582d + ", " + elapsedRealtime3);
                    return;
                }
                ((d30.a) ((e30.e) i95.n0.c(e30.e.class))).getClass();
                int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EmoticonLuckyBagProb", 100);
                int nextInt = new java.util.Random().nextInt(100);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggSpringFeatureService", "enablePlayLuckyEffect config:%d, random:%d", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(nextInt));
                if (nextInt < b17) {
                    gVar.f98581c = elapsedRealtime3;
                    p3325xe03a0797.p3326xc267989b.r2 r2Var3 = gVar.f98580b;
                    if (r2Var3 != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
                    }
                    gVar.f98580b = p3325xe03a0797.p3326xc267989b.l.d(gVar.f98579a, null, null, new b12.f(gVar, l17, null), 3, null);
                }
            }
        }
    }

    public final boolean e() {
        f21.e eVar = this.f283565o;
        if (eVar == null || eVar.f340414q <= 0) {
            return true;
        }
        if (!(this.f283569s || this.f283560j)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = this.f283552b;
            if (!(c21614x5c06ae16.R != null && (c21614x5c06ae16.f279725f > 0 || c21614x5c06ae16.Q))) {
                return true;
            }
        }
        return false;
    }

    public final void f(f21.e eVar, d12.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggMgr", "playLuckyEffect: ");
        int i17 = eVar.f340417t;
        b12.k kVar = b12.k.f98593a;
        if (i17 == 1) {
            this.f283567q = bVar;
            kVar.b(3, b12.k.f98600h, "");
            g(this.f283568r, true, this.f283566p, false);
            return;
        }
        if (e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EggMgr", "lucky anim is not playing, ignore");
            return;
        }
        this.f283567q = bVar;
        this.f283552b.b();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = this.f283552b;
        c21614x5c06ae16.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "showLuckyBag: ");
        if (c21614x5c06ae16.f279737u == null || c21614x5c06ae16.M == null || c21614x5c06ae16.Q) {
            return;
        }
        kVar.b(3, b12.k.f98600h, "");
        c21614x5c06ae16.Q = true;
        c21614x5c06ae16.S = bVar;
        c21614x5c06ae16.f279723d.addView(c21614x5c06ae16.f279737u);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "lucky bag start anim!!!");
        c21614x5c06ae16.M.start();
        c21614x5c06ae16.f279737u.x();
    }

    public final void g(jh5.b bVar, boolean z17, jh5.a aVar, boolean z18) {
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EggMgr", "meta is null");
            return;
        }
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EggMgr", "extData is null");
            return;
        }
        jh5.a aVar2 = z17 ? new jh5.a("", 0L, aVar.f381397c) : new jh5.a(aVar.f381395a, aVar.f381396b, aVar.f381397c, z18);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z18);
        java.lang.String a17 = aVar.a();
        java.lang.String eggKey = bVar.f381400a;
        java.lang.String eggId = bVar.f381401b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggMgr", "playMagicEgg: eggKey:%s, eggId:%s, clickable:%s, isContinue:%s, extInfo:%s", eggKey, eggId, valueOf, valueOf2, a17);
        kh5.h hVar = this.f283553c;
        if (hVar != null) {
            hVar.getClass();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar.f389610q, jh5.b.f381399d) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar.f389610q, bVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MEChattingMgr", "[ME]: markMagicEgg trying to override eggMeta");
                hVar.X0(hVar.f389610q, 2);
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar.f389610q, bVar)) {
                hVar.m143477xed060d07();
                hVar.f389610q = bVar;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggKey, "eggKey");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggId, "eggId");
            java.lang.String sceneId = bVar.f381402c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneId, "sceneId");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6724x2ee3cacb c6724x2ee3cacb = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6724x2ee3cacb();
            c6724x2ee3cacb.f140619e = c6724x2ee3cacb.b("sessionid", eggId, true);
            c6724x2ee3cacb.f140621g = c6724x2ee3cacb.b("chatid", sceneId, true);
            c6724x2ee3cacb.f140622h = c6724x2ee3cacb.b("activityid", eggKey, true);
            c6724x2ee3cacb.f140620f = 5;
            c6724x2ee3cacb.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MEChattingMgr", "[ME]: markMagicEgg: " + bVar + ' ' + z17 + ' ' + aVar2);
            java.util.ArrayList arrayList = hVar.f389612s;
            if (!arrayList.isEmpty()) {
                arrayList.add(new kh5.c(java.lang.System.currentTimeMillis(), z17, aVar2));
                return;
            }
            if (z17) {
                hVar.m1(hVar.f389610q, true, aVar2);
                return;
            }
            if (((java.lang.Boolean) hVar.f389607n.mo146xb9724478(java.lang.Long.valueOf(aVar2.f381396b))).booleanValue()) {
                hVar.m1(hVar.f389610q, false, aVar2);
            } else {
                arrayList.add(new kh5.c(java.lang.System.currentTimeMillis(), false, aVar2));
            }
        }
    }

    public void h() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = this.f283552b;
        if (c21614x5c06ae16 != null) {
            c21614x5c06ae16.e();
        }
        b12.o oVar = this.f283556f;
        if (oVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispose: job is running: ");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = oVar.f98614b;
            sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringLuckyEggHelper", sb6.toString());
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = oVar.f98614b;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            oVar.f98614b = null;
        }
        b12.j jVar = this.f283557g;
        if (jVar != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("dispose: ");
            p3325xe03a0797.p3326xc267989b.r2 r2Var3 = jVar.f98589b;
            sb7.append(r2Var3 != null ? java.lang.Boolean.valueOf(((p3325xe03a0797.p3326xc267989b.a) r2Var3).a()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggRedEnvelopeHelper", sb7.toString());
            p3325xe03a0797.p3326xc267989b.r2 r2Var4 = jVar.f98589b;
            if (r2Var4 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var4, null, 1, null);
            }
            jVar.f98589b = null;
            jVar.f98592e = null;
        }
        this.f283569s = false;
        jh5.a aVar = jh5.a.f381394e;
        this.f283566p = jh5.a.f381394e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggMgr", "egg has been stop, %s", this.f283552b);
    }
}
