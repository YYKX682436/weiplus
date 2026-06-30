package yg0;

@j95.b
/* loaded from: classes8.dex */
public final class o3 extends i95.w implements tg0.l1 {

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f543767h;

    /* renamed from: i, reason: collision with root package name */
    public int f543768i;

    /* renamed from: d, reason: collision with root package name */
    public final ch0.b0 f543763d = new ch0.b0();

    /* renamed from: e, reason: collision with root package name */
    public final ch0.a0 f543764e = new ch0.a0();

    /* renamed from: f, reason: collision with root package name */
    public final ch0.e0 f543765f = new ch0.e0();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f543766g = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final android.os.MessageQueue.IdleHandler f543769m = yg0.m3.f543751d;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f543770n = new yg0.i3(this);

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f543771o = new yg0.j3(this);

    /* renamed from: p, reason: collision with root package name */
    public final ch0.n0 f543772p = new ch0.n0();

    public void Ai(java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        java.lang.String str = (java.lang.String) params.get("boxId");
        if (str == null) {
            str = "";
        }
        ch0.k c17 = ch0.d0.f122732a.c(-1, this.f543767h, params);
        ch0.b0 b0Var = this.f543763d;
        b0Var.getClass();
        b0Var.f122728b.f122768a.put(str, c17);
        yg0.h3 h3Var = new yg0.h3(this, c17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            h3Var.run();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).D(new tg0.e2(h3Var));
    }

    public void Bi(int i17, boolean z17) {
        java.lang.ref.WeakReference weakReference;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 abstractActivityC19400xd202f864;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 abstractActivityC19400xd202f8642;
        ch0.z b17 = this.f543764e.b();
        if ((b17 != null ? b17.f122806m : null) != null) {
            ch0.h hVar = b17.f122806m;
            if (hVar != null) {
                hVar.e(i17);
                return;
            }
            return;
        }
        if (b17 != null) {
            b17.f122801h = true;
        }
        ch0.k kVar = this.f543763d.f122727a.f122773b;
        tg0.c1 c1Var = kVar != null ? kVar.f122766c : null;
        if (c1Var != null) {
            c1Var.f500562a = (z17 || this.f543767h) ? 1 : 0;
        }
        if (kVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "createViewFromNative, createData is null");
        }
        if (kVar == null) {
            kVar = ch0.d0.f122732a.c(-1, z17 || this.f543767h, null);
        }
        ch0.k kVar2 = kVar;
        int i18 = kVar2.f122765b;
        tg0.f2 f2Var = tg0.g2.f500606e;
        if (i18 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "createViewFromNative, mode is not H5_PAGE, just quit");
            return;
        }
        if (b17 == null || (weakReference = b17.f122799f) == null || (abstractActivityC19400xd202f864 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864) weakReference.get()) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference2 = b17.f122799f;
        this.f543768i = (weakReference2 == null || (abstractActivityC19400xd202f8642 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864) weakReference2.get()) == null) ? 0 : abstractActivityC19400xd202f8642.getIntent().getIntExtra("ftspreloadScene", 0);
        if (abstractActivityC19400xd202f864.E3.f448929e && !this.f543763d.e(kVar2.f122766c.f500569h)) {
            fj(kVar2);
        }
        b17.f122806m = new ch0.h();
        android.view.View r96 = abstractActivityC19400xd202f864.r9();
        android.widget.FrameLayout frameLayout = r96 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) r96 : null;
        ch0.a c17 = b17.c();
        ch0.h hVar2 = b17.f122806m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar2);
        tg0.c2 Ni = Ni(c17, abstractActivityC19400xd202f864, kVar2, hVar2.f122756j, frameLayout);
        tg0.d1 d1Var = Ni.f500583e;
        b17.f122804k = d1Var instanceof ch0.a ? (ch0.a) d1Var : null;
        ch0.h hVar3 = b17.f122806m;
        if (hVar3 != null) {
            hVar3.f122747a = Ni;
            hVar3.f122749c = frameLayout;
            tg0.s2 s2Var = Ni.f500584f;
            android.view.View view = s2Var != null ? ((ch0.p0) s2Var).f122784a : null;
            android.app.Activity m81186xd24c19fa = abstractActivityC19400xd202f864.m81186xd24c19fa();
            if (view == null) {
                view = new android.view.View(m81186xd24c19fa);
            }
            hVar3.f122748b = view;
            tg0.c2 c2Var = hVar3.f122747a;
            if (c2Var != null && c2Var.f500579a) {
                hVar3.f();
            }
        }
        ch0.h hVar4 = b17.f122806m;
        if (hVar4 != null) {
            hVar4.e(i17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tg0.c2 Di(android.content.Context r25, int r26, java.util.Map r27, tg0.b2 r28) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yg0.o3.Di(android.content.Context, int, java.util.Map, tg0.b2):tg0.c2");
    }

    public final tg0.c2 Ni(ch0.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 abstractActivityC19400xd202f864, ch0.k kVar, tg0.b2 b2Var, android.widget.FrameLayout frameLayout) {
        ch0.a a17;
        ch0.c0 c0Var = ch0.d0.f122732a;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "create, no cache");
            if (abstractActivityC19400xd202f864.L3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "create, no cache, create from new instance");
                a17 = ch0.r.f122785a.a(kVar, abstractActivityC19400xd202f864, b2Var, this.f543765f, frameLayout);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "create, no cache, create from preload webview");
                a17 = ch0.s.f122786a.a(kVar, abstractActivityC19400xd202f864, b2Var, this.f543765f, frameLayout);
            }
            ch0.a aVar2 = a17;
            return Vi(aVar2, kVar, b2Var, c0Var.b(abstractActivityC19400xd202f864, kVar), aVar2.f122720c.f448929e, true);
        }
        aVar.f122720c.f448934j = new ch0.i0(b2Var);
        if (aVar.f122723f == ch0.o0.f122779d) {
            qx4.d0 d0Var = aVar.f122720c;
            d0Var.f448936l = null;
            if (!d0Var.f448929e) {
                aVar.f122720c.p(new ch0.o(b2Var));
                java.lang.String stringExtra = abstractActivityC19400xd202f864.getIntent().getStringExtra("ftsrealurl");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                int i17 = kVar.f122766c.f500574m;
                int i18 = su4.k2.f494511a;
                jx3.f.INSTANCE.d(27700, 10, stringExtra, java.lang.Integer.valueOf(i17));
            }
            this.f543765f.a(kVar.f122765b, aVar.f122719b, frameLayout);
        }
        int i19 = aVar.f122718a;
        tg0.f2 f2Var = tg0.g2.f500606e;
        if (i19 == 1) {
            android.view.ViewParent parent = aVar.f122719b.getParent();
            android.widget.FrameLayout frameLayout2 = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
            if (frameLayout2 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(frameLayout2, frameLayout)) {
                java.lang.String content = "configCachedBean, webView parent changed, new parent: " + frameLayout;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
                frameLayout2.removeView(aVar.f122719b);
                if (frameLayout != null) {
                    frameLayout.addView(aVar.f122719b, 0);
                }
            }
        }
        if (aVar.f122722e == ch0.f0.f122737e) {
            abstractActivityC19400xd202f864.J3 = new ch0.j(b2Var);
        }
        java.lang.String b17 = c0Var.b(abstractActivityC19400xd202f864, kVar);
        boolean z17 = aVar.f122723f != ch0.o0.f122781f;
        java.lang.String content2 = "create, use cache, needNotifyH5Result: " + z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content2, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content2);
        return Vi(aVar, kVar, b2Var, b17, aVar.f122720c.f448929e, z17);
    }

    public tg0.k1 Ri() {
        return this.f543764e.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.tencent.mm.feature.webview.platformwebsearch.PlatformWSFScene$bindActivity$observer$1, androidx.lifecycle.x] */
    public void Ui(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        java.lang.Object m143895xf1229813;
        java.lang.Object m143895xf12298132;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "intoActivity, activity is not correct");
            return;
        }
        int hashCode = activity.hashCode();
        java.lang.String content = "intoActivity, hashCode: " + hashCode;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        ch0.a0 a0Var = this.f543764e;
        if (hashCode == a0Var.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "intoActivity, has called, just quit");
            return;
        }
        a0Var.f122725b.m144678xbb8646d7(java.lang.Integer.valueOf(hashCode));
        final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 abstractActivityC19400xd202f864 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864) activity;
        java.lang.String stringExtra = abstractActivityC19400xd202f864.getIntent().getStringExtra("ftsrealurl");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        final ch0.z zVar = new ch0.z(a0Var);
        zVar.f122798e = abstractActivityC19400xd202f864.hashCode();
        zVar.f122799f = new java.lang.ref.WeakReference(abstractActivityC19400xd202f864);
        ?? r86 = new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.feature.webview.platformwebsearch.PlatformWSFScene$bindActivity$observer$1
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("activity destroy, clearing service cache for: ");
                ch0.z zVar2 = ch0.z.this;
                sb6.append(zVar2.f122798e);
                java.lang.String content2 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content2, "content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content2);
                tg0.z1 z1Var = zVar2.f122803j;
                if (z1Var != null) {
                    ((ch0.y) z1Var).a();
                }
                ch0.h hVar = zVar2.f122806m;
                if (hVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSPlatformWebView", "dummy platform WebView, activity destroy");
                    hVar.f122754h = true;
                    tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
                    if (l1Var != null) {
                        tg0.c2 c2Var = hVar.f122747a;
                        ((yg0.o3) l1Var).hj(c2Var != null ? c2Var.f500589k : 0, true, c2Var != null ? c2Var.f500583e : null, c2Var != null ? c2Var.f500587i : null);
                    }
                    hVar.f122747a = null;
                    hVar.f122748b = null;
                    hVar.f122750d = null;
                }
                zVar2.f122806m = null;
                int i17 = zVar2.f122798e;
                ch0.a0 a0Var2 = zVar2.f122794a;
                a0Var2.f122724a.remove(java.lang.Integer.valueOf(i17));
                a0Var2.f122725b.remove(java.lang.Integer.valueOf(i17));
                java.lang.ref.WeakReference weakReference = zVar2.f122799f;
                if (weakReference != null) {
                    weakReference.clear();
                }
                zVar2.f122799f = null;
                tg0.l1 l1Var2 = (tg0.l1) i95.n0.c(tg0.l1.class);
                if (l1Var2 != null) {
                    ((yg0.o3) l1Var2).hj(zVar2.f122798e, true, null, null);
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("activity destroy, unuse pool size: ");
                java.util.LinkedList linkedList = zVar2.f122805l;
                sb7.append(linkedList.size());
                java.lang.String content3 = sb7.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content3, "content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content3);
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    zVar2.a((ch0.a) it.next());
                }
                linkedList.clear();
                ((java.util.LinkedHashMap) zVar2.f122807n).clear();
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onResume */
            public void mo7055x57429eec(p012xc85e97e9.p093xedfae76a.y owner) {
                tg0.l1 l1Var;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                if (abstractActivityC19400xd202f864.K3) {
                    ch0.z zVar2 = ch0.z.this;
                    if (!zVar2.f122808o && (l1Var = (tg0.l1) i95.n0.c(tg0.l1.class)) != null) {
                        ((yg0.o3) l1Var).ij();
                    }
                    zVar2.f122808o = false;
                }
            }
        };
        abstractActivityC19400xd202f864.mo273xed6858b4().a(r86);
        zVar.f122803j = new ch0.y(zVar, abstractActivityC19400xd202f864, r86);
        zVar.f122800g = abstractActivityC19400xd202f864.getIntent().getBooleanExtra("KHalfScreenSearchUseFlutter", false);
        java.util.Map map = zVar.f122807n;
        ((java.util.LinkedHashMap) map).clear();
        if (r26.n0.N(stringExtra) ^ true) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                android.net.Uri parse = android.net.Uri.parse(stringExtra);
                for (java.lang.String str2 : parse.getQueryParameterNames()) {
                    java.lang.String queryParameter = parse.getQueryParameter(str2);
                    if (queryParameter != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    }
                }
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "parseRawUrlParams exception: " + m143898xd4a2fc34);
            }
        }
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(map);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(unmodifiableMap, "unmodifiableMap(...)");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.String str3 = (java.lang.String) unmodifiableMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
            java.lang.String str4 = "0";
            if (str3 == null) {
                str3 = "0";
            }
            zVar.f122795b = java.lang.Integer.parseInt(str3);
            java.lang.String str5 = (java.lang.String) unmodifiableMap.get("type");
            if (str5 != null) {
                str4 = str5;
            }
            zVar.f122796c = java.lang.Integer.parseInt(str4);
            java.lang.String str6 = (java.lang.String) unmodifiableMap.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            if (str6 != null) {
                str = str6;
            }
            zVar.f122797d = str;
            java.lang.String content2 = "intoActivity, scene:" + zVar.f122795b + ", type:" + zVar.f122796c + ", sessionId:" + zVar.f122797d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content2, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content2);
            tg0.f2 f2Var = tg0.g2.f500606e;
            m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(tg0.m1.b(zVar.b(1, new tg0.c1(0, 0, null, null, null, 0, 0, null, null, null, 0, null, 0, 0, 0, 0.0d, 0L, 131071, null))));
        } catch (java.lang.Throwable th7) {
            p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
        }
        java.lang.Throwable m143898xd4a2fc342 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf12298132);
        if (m143898xd4a2fc342 != null) {
            java.lang.String content3 = "intoActivity, exception e:" + m143898xd4a2fc342;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content3, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content3);
        }
        a0Var.getClass();
        a0Var.f122724a.put(java.lang.Integer.valueOf(a0Var.a()), zVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0039, code lost:
    
        if (r5.f448930f != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tg0.c2 Vi(ch0.a r26, ch0.k r27, tg0.b2 r28, java.lang.String r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yg0.o3.Vi(ch0.a, ch0.k, tg0.b2, java.lang.String, boolean, boolean):tg0.c2");
    }

    public void Zi(java.lang.String event, java.lang.String params) {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        ch0.n0 n0Var = this.f543772p;
        n0Var.getClass();
        java.lang.String content = "notify flutter event: ".concat(event);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f.Callback callback = n0Var.f122777a;
            if (callback != null) {
                callback.mo117737xa248684b(event, params);
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
            java.lang.String content2 = "notify flutter event exception: " + m143898xd4a2fc34;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content2, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content2);
        }
    }

    public void aj(int i17) {
        boolean z17 = i17 == 8;
        java.lang.String content = "flutter container visible changed, visible: " + i17 + ", set focus: " + z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        bj(z17);
    }

    public void bj(boolean z17) {
        java.lang.String content = "focus changed, hasFocus: " + z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        this.f543767h = z17;
        java.util.Iterator it = this.f543766g.iterator();
        while (it.hasNext()) {
            ((ch0.i) ((tg0.b) it.next())).f122759a.d(z17);
        }
    }

    public void cj(java.util.Map createParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(createParams, "createParams");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "into preCreateView");
        ch0.k c17 = ch0.d0.f122732a.c(-1, this.f543767h, createParams);
        int i17 = c17.f122765b;
        tg0.f2 f2Var = tg0.g2.f500606e;
        if (i17 != 1) {
            Ai(createParams);
            return;
        }
        ch0.b0 b0Var = this.f543763d;
        b0Var.getClass();
        synchronized (b0Var.f122727a) {
            b0Var.f122727a.f122773b = c17;
        }
        java.lang.Runnable runnable = this.f543771o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            ((yg0.j3) runnable).run();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).D(new tg0.e2(runnable));
    }

    public final void fj(ch0.k kVar) {
        ch0.a c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e;
        ch0.z b17 = this.f543764e.b();
        ch0.a aVar = null;
        if ((b17 != null ? b17.f122799f : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "preCreateViewInner, activity is null, just quit");
            return;
        }
        java.lang.ref.WeakReference weakReference = b17.f122799f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 abstractActivityC19400xd202f864 = weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864) weakReference.get() : null;
        if (abstractActivityC19400xd202f864 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "preCreateViewInner, activity is null, just quit");
            return;
        }
        int i17 = b17.f122795b;
        tg0.c1 c1Var = kVar.f122766c;
        if (i17 != c1Var.f500574m) {
            java.lang.String content = "preCreateViewInner, scene not match, our scene: " + b17.f122795b + ", param scene: " + kVar.f122766c.f500574m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
            return;
        }
        if (!b17.f122801h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "preCreateViewInner, current scene not ready, just quit");
            return;
        }
        int i18 = kVar.f122765b;
        tg0.f2 f2Var = tg0.g2.f500606e;
        if (i18 == 1) {
            if (this.f543763d.e(c1Var.f500569h)) {
                return;
            }
            if (b17.f122804k != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "preCreateViewInner, mode is H5_PAGE, has add in Layout, just notify result");
                tg0.a2 a2Var = b17.f122802i;
                if (a2Var != null) {
                    tg0.c1 result = kVar.f122766c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
                    ((ch0.p) a2Var).f122783a.c(result);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "preCreateViewInner, will preCreate cache bean");
        android.view.View r96 = abstractActivityC19400xd202f864.r9();
        android.widget.FrameLayout frameLayout = r96 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) r96 : null;
        ch0.z b18 = this.f543764e.b();
        if (!(b18 != null && b18.f122805l.isEmpty())) {
            ch0.z b19 = this.f543764e.b();
            if (b19 != null && (c17 = b19.c()) != null) {
                qx4.d0 d0Var = c17.f122720c;
                if (d0Var.f448929e) {
                    java.lang.String content2 = "preCreate by cache, current result not notify to H5, hasCalledOnUiInit: " + d0Var.f448930f + ", data mode: " + kVar.f122765b + ", cache mode: " + c17.f122718a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content2, "content");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content2);
                    if (kVar.f122765b != 1) {
                        this.f543763d.b(kVar.f122766c, d0Var);
                    } else if (d0Var.f448930f && kVar.f122765b == c17.f122718a) {
                        this.f543763d.a(kVar.f122766c, d0Var);
                    } else {
                        this.f543763d.c(kVar.f122766c, d0Var);
                    }
                    d0Var.f448936l = null;
                    d0Var.f448934j = null;
                    aVar = wi(kVar.f122765b, c17.f122719b, d0Var, c17.f122721d, c17.f122722e);
                } else {
                    if (kVar.f122765b == 1) {
                        d0Var.p(new yg0.l3(this));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "preCreate by cache, js no ready, just quit");
                }
            }
        } else if (abstractActivityC19400xd202f864.L3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "preCreate by preload, activity preload webview has used, just quit");
        } else {
            qx4.d0 d0Var2 = abstractActivityC19400xd202f864.E3;
            if (d0Var2.f448929e) {
                if (abstractActivityC19400xd202f864.L3) {
                    abstractC19224x1fe3df6e = null;
                } else {
                    abstractActivityC19400xd202f864.L3 = true;
                    abstractC19224x1fe3df6e = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) abstractActivityC19400xd202f864.f265348f;
                }
                if (abstractC19224x1fe3df6e == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "preCreate by preload, WebView is null");
                } else {
                    java.lang.String content3 = "preCreate by preload, current result not notify to H5, hasCalledOnUiInit: " + d0Var2.f448930f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content3, "content");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content3);
                    if (kVar.f122765b != 1) {
                        this.f543763d.b(kVar.f122766c, d0Var2);
                    } else if (d0Var2.f448930f) {
                        this.f543763d.a(kVar.f122766c, d0Var2);
                    } else {
                        this.f543763d.c(kVar.f122766c, d0Var2);
                    }
                    d0Var2.f448936l = null;
                    int i19 = kVar.f122765b;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 controller = abstractActivityC19400xd202f864.L1;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(controller, "controller");
                    aVar = wi(i19, abstractC19224x1fe3df6e, d0Var2, controller, ch0.f0.f122736d);
                }
            } else {
                if (kVar.f122765b == 1) {
                    d0Var2.p(new yg0.l3(this));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "preCreate by preload, js no ready, just quit");
            }
        }
        if (aVar != null) {
            this.f543765f.a(kVar.f122765b, aVar.f122719b, frameLayout);
        }
    }

    public void hj(int i17, boolean z17, tg0.d1 d1Var, tg0.b bVar) {
        java.lang.String content = "releaseView, will destroy hashcode: " + i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        if (bVar != null) {
            this.f543766g.remove(bVar);
        }
        ch0.a0 a0Var = this.f543764e;
        ch0.z zVar = (ch0.z) ((java.util.LinkedHashMap) a0Var.f122724a).get(java.lang.Integer.valueOf(i17));
        if (zVar != null) {
            zVar.f122802i = null;
        }
        if (zVar != null) {
            zVar.f122804k = null;
        }
        int a17 = a0Var.a();
        if (a17 <= 0 || a17 == i17) {
            this.f543763d.d();
        } else {
            java.lang.String content2 = "releaseView, hashcode not match, current hashcode: " + a17 + ", old hashcode: " + i17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content2, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content2);
        }
        if (z17) {
            a0Var.f122724a.remove(java.lang.Integer.valueOf(i17));
            a0Var.f122725b.remove(java.lang.Integer.valueOf(i17));
        }
        ch0.a aVar = d1Var instanceof ch0.a ? (ch0.a) d1Var : null;
        if (aVar != null) {
            ch0.c0 c0Var = ch0.d0.f122732a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e = aVar.f122719b;
            android.content.Context context = abstractC19224x1fe3df6e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.app.Activity a18 = c0Var.a(context);
            if (a18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864) a18).J3 = null;
            }
            abstractC19224x1fe3df6e.m74099x67c34919(null);
            qx4.d0 d0Var = aVar.f122720c;
            d0Var.f448934j = null;
            d0Var.p(null);
            if (z17) {
                if (abstractC19224x1fe3df6e.f292909y) {
                    return;
                }
                abstractC19224x1fe3df6e.mo120173x7af55728("webSearchJSApi");
                nw4.n nVar = d0Var.f448927c;
                if (nVar != null) {
                    nVar.f422422c = null;
                }
                d0Var.f448934j = null;
                d0Var.f448935k = null;
                d0Var.f95859a = null;
                java.lang.Object mo120164x90fc158e = abstractC19224x1fe3df6e.mo120164x90fc158e();
                if (mo120164x90fc158e instanceof zg0.q2) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) ((zg0.q2) mo120164x90fc158e)).D0();
                }
                abstractC19224x1fe3df6e.mo52095x5cd39ffa();
                return;
            }
            if (zVar != null) {
                java.util.LinkedList linkedList = zVar.f122805l;
                if (linkedList.size() >= 2) {
                    zVar.a(aVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "destroy webview bean due to cache pool full");
                    return;
                }
                linkedList.addLast(aVar);
                java.lang.String content3 = "cache webview for activity: " + zVar.f122798e + ", pool size: " + linkedList.size();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content3, "content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content3);
            }
        }
    }

    public void ij() {
        java.lang.String content = "startIdlePreload, lastPreloadScene: " + this.f543768i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        if (qx4.l0.f448955a.b(this.f543768i) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "startIdlePreload, can preCreate WebView");
            ((ku5.t0) ku5.t0.f394148d).D(this.f543770n);
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27575xd8197730.m117741x9cf0d20b().m117743x5840afc1(new yg0.k3(this));
    }

    public final ch0.a wi(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e, qx4.d0 d0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var, ch0.f0 f0Var) {
        ch0.a aVar = new ch0.a(i17, abstractC19224x1fe3df6e, d0Var, e3Var, f0Var, ch0.o0.f122781f, null, 64, null);
        ch0.z b17 = this.f543764e.b();
        if (b17 != null) {
            java.util.LinkedList linkedList = b17.f122805l;
            if (linkedList.size() >= 2) {
                b17.a(aVar);
            } else {
                linkedList.addFirst(aVar);
                java.lang.String content = "cache webview for activity: " + b17.f122798e + ", pool size: " + linkedList.size();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
            }
        }
        return aVar;
    }
}
