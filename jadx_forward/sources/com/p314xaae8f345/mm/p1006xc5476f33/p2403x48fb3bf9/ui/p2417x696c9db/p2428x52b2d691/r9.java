package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes12.dex */
public final class r9 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r9 f268022d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r9();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.Object obj;
        java.lang.Integer num;
        nw4.g gVar;
        nw4.y2 y2Var;
        java.lang.Object obj2;
        java.lang.Object obj3;
        boolean z17;
        java.lang.String string;
        android.app.Application application;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj4 = ((java.util.HashMap) msg.f422323a).get("type");
        boolean z18 = obj4 == null;
        nw4.g gVar2 = env.f422396d;
        if (z18) {
            gVar2.a(msg, "missing arguments");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateStreamVoiceInput", "nativeVoice: handleMsg, opType: " + obj4 + ", params: " + msg.f422323a);
        boolean equals = "start".equals(obj4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = env.f422397e;
        if (equals) {
            int e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(msg.f422323a, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 14);
            float d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.d(msg.f422323a, "vad_s_n_ration", 2.5f);
            boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(msg.f422323a, "setLangBySystem", false);
            su4.c1 c1Var = (su4.c1) i95.n0.c(su4.c1.class);
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(c22633x83752a59 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e ? (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) c22633x83752a59 : null);
            s50.l1 l1Var = (s50.l1) c1Var;
            l1Var.getClass();
            l1Var.f484614e = weakReference;
            int n17 = gm0.j1.d().n();
            if (!(n17 == 4 || n17 == 6)) {
                l1Var.Zi(l1Var.f484614e, s50.w0.f484664g, "network is not reachable");
            } else if (iq.b.C(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) || iq.b.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) || iq.b.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                l1Var.Zi(l1Var.f484614e, s50.w0.f484662e, "audio conflict");
            } else {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                ((sb0.f) jVar).getClass();
                if (j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
                    l1Var.Di(e17, d17, c17);
                } else {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(80, new s50.k1(l1Var, e17, d17, c17), "android.permission.RECORD_AUDIO");
                }
            }
        } else if ("stop".equals(obj4)) {
            s50.l1 l1Var2 = (s50.l1) ((su4.c1) i95.n0.c(su4.c1.class));
            l1Var2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "stopStreamVoiceInput");
            l1Var2.f484618i = s50.x0.f484673g;
            z21.e eVar = l1Var2.f484613d;
            if (eVar != null) {
                eVar.mo48299x360802(false);
            }
            s50.e1 e1Var = l1Var2.f484622p;
            e1Var.mo50303x856b99f0(101);
            e1Var.mo50303x856b99f0(102);
            e1Var.mo50307xb9e94560(101, 3000L);
            e1Var.mo50307xb9e94560(102, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        } else if ("cancel".equals(obj4)) {
            s50.l1 l1Var3 = (s50.l1) ((su4.c1) i95.n0.c(su4.c1.class));
            if (l1Var3.f484618i != s50.x0.f484670d) {
                l1Var3.f484618i = s50.x0.f484675i;
                l1Var3.Bi();
            }
        } else {
            if (!"startNativeVoiceInput".equals(obj4)) {
                obj = "msg";
                if ("showNativeVoiceInputEntry".equals(obj4)) {
                    android.content.Context context2 = env.f422393a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74 = context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) context2 : null;
                    if (abstractActivityC19367xd1ae8c74 != null) {
                        abstractActivityC19367xd1ae8c74.ea();
                    }
                    java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(msg.f422323a, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                    int i17 = abstractActivityC19367xd1ae8c74 != null ? abstractActivityC19367xd1ae8c74.f265784h4 : 3;
                    num = 0;
                    int e18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(msg.f422323a, "sceneType", 2);
                    boolean c18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(msg.f422323a, "enableGreenStyle", false);
                    gVar = gVar2;
                    boolean c19 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(msg.f422323a, "enableBindWithKeyboard", false);
                    java.lang.String f18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(msg.f422323a, "extInfo");
                    su4.c1 c1Var2 = (su4.c1) i95.n0.c(su4.c1.class);
                    android.content.Context context3 = env.f422393a;
                    java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(c22633x83752a59 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e ? (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) c22633x83752a59 : null);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f18);
                    s50.l1 l1Var4 = (s50.l1) c1Var2;
                    l1Var4.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nativeVoice: showNativeVoiceForWebView, sceneType: ");
                    sb6.append(e18);
                    sb6.append(", searchScene: ");
                    sb6.append(i17);
                    sb6.append(", modelCount: ");
                    java.util.Map map = l1Var4.f484615f;
                    sb6.append(map.size());
                    sb6.append(", thirdExtInfo: ");
                    sb6.append(f18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", sb6.toString());
                    l1Var4.f484621o = f18;
                    java.util.Set entrySet = ((java.util.LinkedHashMap) map).entrySet();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj5 : entrySet) {
                        if (((java.lang.ref.WeakReference) ((java.util.Map.Entry) obj5).getValue()).get() == null) {
                            arrayList.add(obj5);
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(java.lang.Integer.valueOf(((java.lang.Number) ((java.util.Map.Entry) it.next()).getKey()).intValue()));
                    }
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        map.remove(java.lang.Integer.valueOf(((java.lang.Number) it6.next()).intValue()));
                    }
                    if (context3 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        int identityHashCode = java.lang.System.identityHashCode(context3);
                        k23.v0 Ri = l1Var4.Ri(identityHashCode);
                        if (Ri != null) {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Ri.f385246h, java.lang.Boolean.valueOf(c18))) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "setBtnStyleForFinderSearch, style unchanged: " + c18 + ", skip");
                            } else {
                                Ri.f385246h = java.lang.Boolean.valueOf(c18);
                                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = Ri.f385239a;
                                if (c18) {
                                    int d18 = i65.a.d(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30859x5a72f63.f77736x48893d57);
                                    int d19 = i65.a.d(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30859x5a72f63.aby);
                                    android.view.View m141803xca568c10 = Ri.q().m141803xca568c10();
                                    m141803xca568c10.setBackgroundColor(d18);
                                    Ri.q().m141808xa378a62(d19);
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m141803xca568c10.findViewById(com.p314xaae8f345.mm.R.id.ugo);
                                    if (c22699x3dcdb352 != null) {
                                        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80610xddce36b9);
                                        c22699x3dcdb352.m82040x7541828(d19);
                                    }
                                } else {
                                    int d27 = i65.a.d(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f);
                                    int d28 = i65.a.d(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30859x5a72f63.abw);
                                    android.view.View m141803xca568c102 = Ri.q().m141803xca568c10();
                                    m141803xca568c102.setBackgroundColor(d27);
                                    Ri.q().m141808xa378a62(d28);
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m141803xca568c102.findViewById(com.p314xaae8f345.mm.R.id.ugo);
                                    if (c22699x3dcdb3522 != null) {
                                        c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f80612xe98418cc);
                                        c22699x3dcdb3522.m82040x7541828(d28);
                                    }
                                }
                            }
                            Ri.q().m141807x31c3fd81(f17);
                            Ri.C();
                            if (c19) {
                                if (!Ri.f385256r) {
                                    Ri.i();
                                }
                            } else if (Ri.f385256r) {
                                Ri.h();
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "nativeVoice: showNativeVoiceForWebView, " + identityHashCode + " already showStartRecognizingButton!");
                        } else {
                            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context3;
                            android.view.ViewGroup Ni = l1Var4.Ni(weakReference2);
                            if (Ni == null) {
                                android.view.View findViewById = abstractActivityC21394xb3d2c0cf2.findViewById(com.p314xaae8f345.mm.R.id.jlt);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                                Ni = (android.view.ViewGroup) findViewById;
                            }
                            k23.v0 v0Var = new k23.v0(abstractActivityC21394xb3d2c0cf2);
                            k23.d0 d0Var = new k23.d0(Ni, new android.widget.FrameLayout.LayoutParams(-1, -1, 81), new s50.g1(l1Var4, weakReference2, v0Var), Ni, k23.w0.f385270g, e18, i17, f17, c18 ? k23.u2.f385235e : k23.u2.f385234d, null, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de, null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "hitest nativeVoice: showNativeVoiceForWebView, frostedContentView=" + Ni.getClass().getSimpleName() + ", id=" + Ni.getId() + ", childCount=" + Ni.getChildCount() + ", width=" + Ni.getWidth() + ", height=" + Ni.getHeight());
                            v0Var.t(d0Var);
                            v0Var.E();
                            k23.i1 q17 = v0Var.q();
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("hitest nativeVoice: after showStartRecognizingButton, btnParent=");
                            android.view.ViewParent parent = q17.getParent();
                            sb7.append(parent != null ? parent.getClass().getSimpleName() : null);
                            sb7.append(", btnVisibility=");
                            sb7.append(q17.getVisibility());
                            sb7.append(" (VISIBLE=0 GONE=8), btnWidth=");
                            sb7.append(q17.getWidth());
                            sb7.append(", btnHeight=");
                            sb7.append(q17.getHeight());
                            sb7.append(", containerChildCount=");
                            sb7.append(Ni.getChildCount());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", sb7.toString());
                            map.put(java.lang.Integer.valueOf(identityHashCode), new java.lang.ref.WeakReference(v0Var));
                            l1Var4.fj(abstractActivityC21394xb3d2c0cf2, weakReference2, v0Var);
                            z50.e.f551696a.a(vu4.a.f521772f, vu4.b.C, i17, e18, new org.json.JSONObject(), "");
                            if (c19) {
                                v0Var.i();
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "nativeVoice: showNativeVoiceForWebView, contextID: " + identityHashCode + ", enableBindWithKeyboard: " + c19);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "nativeVoice: showNativeVoiceForWebView, context is not MMActivity");
                    }
                } else {
                    num = 0;
                    gVar = gVar2;
                    if (!"hideNativeVoiceInputEntry".equals(obj4)) {
                        if ("configBottomAiContinue".equals(obj4)) {
                            android.content.Context context4 = env.f422393a;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c742 = context4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) context4 : null;
                            if (abstractActivityC19367xd1ae8c742 != null) {
                                abstractActivityC19367xd1ae8c742.ea();
                            }
                            y2Var = msg;
                            boolean c27 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(y2Var.f422323a, "visible", true);
                            int e19 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(y2Var.f422323a, "modeType", 1);
                            java.lang.String f19 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(y2Var.f422323a, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
                            int i18 = abstractActivityC19367xd1ae8c742 != null ? abstractActivityC19367xd1ae8c742.f265784h4 : 3;
                            int e27 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(y2Var.f422323a, "sceneType", 2);
                            java.lang.String f27 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(y2Var.f422323a, "extInfo");
                            boolean c28 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(y2Var.f422323a, "enableGreenStyle", false);
                            int e28 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(y2Var.f422323a, "styleType", 0);
                            su4.c1 c1Var3 = (su4.c1) i95.n0.c(su4.c1.class);
                            android.content.Context context5 = env.f422393a;
                            java.lang.ref.WeakReference weakReference3 = new java.lang.ref.WeakReference(c22633x83752a59 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e ? (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) c22633x83752a59 : null);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f19);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f27);
                            s50.l1 l1Var5 = (s50.l1) c1Var3;
                            l1Var5.getClass();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context5, "context");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "configBottomAiContinue: visible=" + c27 + ", modeType=" + e19 + ", text=" + f19 + ", styleType=" + e28 + ", thirdExtInfo=" + f27);
                            l1Var5.f484621o = f27;
                            if (context5 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                                int identityHashCode2 = java.lang.System.identityHashCode(context5);
                                java.util.Map map2 = l1Var5.f484623q;
                                ((java.util.LinkedHashMap) map2).entrySet().removeIf(s50.y0.f484679a);
                                if (c27) {
                                    if (f19.length() == 0) {
                                        if (e19 == 2) {
                                            string = context5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.niw);
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                                        } else {
                                            string = context5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.niu);
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                                        }
                                        f19 = string;
                                    }
                                    k23.f0.f385096e.getClass();
                                    java.util.Iterator it7 = ((kz5.h) k23.f0.f385100i).iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it7.next();
                                        if (((k23.f0) obj2).f385101d == e19) {
                                            break;
                                        }
                                    }
                                    k23.f0 f0Var = (k23.f0) obj2;
                                    if (f0Var == null) {
                                        f0Var = k23.f0.f385097f;
                                    }
                                    p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                                    k23.v0 Ui = l1Var5.Ui(identityHashCode2);
                                    h0Var.f391656d = Ui;
                                    if (Ui != null) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "configModeSwitch: mode=" + f0Var + ", text=" + f19 + ", isTriggeredByConfig=true");
                                        Ui.A = true;
                                        k23.j2 m17 = Ui.m();
                                        if (m17 != null) {
                                            if (f19.length() > 0) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "configCustomText: ".concat(f19));
                                                m17.f385131p = f19;
                                                m17.f385132q = true;
                                            }
                                            z17 = false;
                                            m17.n(f0Var, false);
                                        } else {
                                            z17 = false;
                                        }
                                        Ui.A = z17;
                                        ((k23.v0) h0Var.f391656d).C();
                                        k23.v0 v0Var2 = (k23.v0) h0Var.f391656d;
                                        v0Var2.q().post(new s50.z0(l1Var5, weakReference3, v0Var2));
                                    } else {
                                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context5;
                                        android.view.ViewGroup Ni2 = l1Var5.Ni(weakReference3);
                                        if (Ni2 == null) {
                                            android.view.View findViewById2 = abstractActivityC21394xb3d2c0cf3.findViewById(com.p314xaae8f345.mm.R.id.jlt);
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                                            Ni2 = (android.view.ViewGroup) findViewById2;
                                        }
                                        android.view.ViewGroup viewGroup = Ni2;
                                        k23.v0 v0Var3 = new k23.v0(abstractActivityC21394xb3d2c0cf3);
                                        k23.b0.f385051e.getClass();
                                        java.util.Iterator it8 = ((kz5.h) k23.b0.f385055i).iterator();
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                obj3 = null;
                                                break;
                                            }
                                            obj3 = it8.next();
                                            if (((k23.b0) obj3).f385056d == e28) {
                                                break;
                                            }
                                        }
                                        k23.b0 b0Var = (k23.b0) obj3;
                                        k23.b0 b0Var2 = b0Var == null ? k23.b0.f385052f : b0Var;
                                        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1, 81);
                                        s50.c1 c1Var4 = new s50.c1(l1Var5, weakReference3, v0Var3);
                                        k23.w0 w0Var = k23.w0.f385271h;
                                        v0Var3.t(new k23.d0(viewGroup, layoutParams, c1Var4, viewGroup, w0Var, e27, i18, f19, c28 ? k23.u2.f385235e : k23.u2.f385234d, null, b0Var2, 512, null));
                                        s50.b1 b1Var = new s50.b1(l1Var5, weakReference3);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "initModeSwitch: initialMode=" + f0Var);
                                        k23.d0 d0Var2 = v0Var3.f385240b;
                                        if (d0Var2 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
                                            throw null;
                                        }
                                        if (d0Var2.f385081e != w0Var) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSFloatingVoiceInputViewModel", "initModeSwitch: not in MODE_SWITCH scene");
                                        } else {
                                            v0Var3.f385264z = b1Var;
                                            k23.j2 m18 = v0Var3.m();
                                            if (m18 != null) {
                                                m18.n(f0Var, false);
                                                m18.m141822xa8713c8d(new k23.k0(v0Var3));
                                            }
                                            y50.m.a(y50.m.f540993a, v0Var3.f385239a, v0Var3.q().m141806x53a819e6(), 0L, null, null, 28, null);
                                        }
                                        v0Var3.q().m141807x31c3fd81(f19);
                                        v0Var3.C();
                                        h0Var.f391656d = v0Var3;
                                        map2.put(java.lang.Integer.valueOf(identityHashCode2), new java.lang.ref.WeakReference(v0Var3));
                                        ((k23.v0) h0Var.f391656d).q().post(new s50.a1(l1Var5, weakReference3, h0Var));
                                    }
                                    l1Var5.fj((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context5, weakReference3, (k23.v0) h0Var.f391656d);
                                } else {
                                    k23.v0 Ui2 = l1Var5.Ui(identityHashCode2);
                                    if (Ui2 != null) {
                                        Ui2.r();
                                    }
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "configBottomAiContinue: context is not MMActivity");
                            }
                        } else {
                            y2Var = msg;
                            if (!"startActionTriggerShimmerAnimation".equals(obj4)) {
                                gVar.a(y2Var, "unsupported type: " + obj4);
                                return true;
                            }
                            su4.c1 c1Var5 = (su4.c1) i95.n0.c(su4.c1.class);
                            android.content.Context context6 = env.f422393a;
                            s50.l1 l1Var6 = (s50.l1) c1Var5;
                            l1Var6.getClass();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context6, "context");
                            int identityHashCode3 = java.lang.System.identityHashCode(context6);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "startActionTriggerShimmerAnimation, contextID: " + identityHashCode3);
                            k23.v0 Ui3 = l1Var6.Ui(identityHashCode3);
                            if (Ui3 != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "startActionTriggerShimmerAnimation");
                                k23.j2 m19 = Ui3.m();
                                if (m19 != null) {
                                    if (m19.f385130o != k23.f0.f385097f) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "startActionTriggerShimmerAnimation: not in H5KeyBoard mode, skip");
                                    } else if (m19.G) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "startActionTriggerShimmerAnimation: already animating, skip");
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "startActionTriggerShimmerAnimation");
                                        m19.G = true;
                                        m19.m141803xca568c10().post(new k23.h2(m19));
                                    }
                                }
                            }
                        }
                        gVar.getClass();
                        java.lang.String str = y2Var.f422552i + ":ok";
                        java.util.HashMap hashMap = new java.util.HashMap();
                        java.lang.Integer num2 = num;
                        hashMap.put("retCode", num2);
                        hashMap.put("err_code", num2);
                        hashMap.put(obj, str);
                        gVar.e(y2Var.f422546c, str, hashMap);
                        return true;
                    }
                    su4.c1 c1Var6 = (su4.c1) i95.n0.c(su4.c1.class);
                    android.content.Context context7 = env.f422393a;
                    new java.lang.ref.WeakReference(c22633x83752a59 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e ? (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) c22633x83752a59 : null);
                    s50.l1 l1Var7 = (s50.l1) c1Var6;
                    l1Var7.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context7, "context");
                    int identityHashCode4 = java.lang.System.identityHashCode(context7);
                    k23.v0 Ri2 = l1Var7.Ri(identityHashCode4);
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("hitest nativeVoice: hideNativeVoiceForWebView, contextID: ");
                    sb8.append(identityHashCode4);
                    sb8.append(", hasViewModel=");
                    sb8.append(Ri2 != null);
                    sb8.append(", btnVisible=");
                    sb8.append(Ri2 != null ? java.lang.Boolean.valueOf(Ri2.q().getVisibility() == 0) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", sb8.toString());
                    if (Ri2 != null) {
                        Ri2.r();
                        Ri2.h();
                    }
                    if ((context7 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) && (application = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context7).getApplication()) != null) {
                        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (android.app.Application.ActivityLifecycleCallbacks) l1Var7.f484616g.remove(java.lang.Integer.valueOf(java.lang.System.identityHashCode(context7)));
                        if (activityLifecycleCallbacks != null) {
                            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                        }
                    }
                }
                y2Var = msg;
                gVar.getClass();
                java.lang.String str2 = y2Var.f422552i + ":ok";
                java.util.HashMap hashMap2 = new java.util.HashMap();
                java.lang.Integer num22 = num;
                hashMap2.put("retCode", num22);
                hashMap2.put("err_code", num22);
                hashMap2.put(obj, str2);
                gVar.e(y2Var.f422546c, str2, hashMap2);
                return true;
            }
            android.content.Context context8 = env.f422393a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c743 = context8 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) context8 : null;
            if (abstractActivityC19367xd1ae8c743 != null) {
                abstractActivityC19367xd1ae8c743.ea();
            }
            java.lang.String f28 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(msg.f422323a, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            int i19 = abstractActivityC19367xd1ae8c743 != null ? abstractActivityC19367xd1ae8c743.f265784h4 : 3;
            int e29 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(msg.f422323a, "sceneType", 2);
            boolean c29 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(msg.f422323a, "enableGreenStyle", false);
            java.lang.String f29 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(msg.f422323a, "extInfo");
            su4.c1 c1Var7 = (su4.c1) i95.n0.c(su4.c1.class);
            android.content.Context context9 = env.f422393a;
            java.lang.ref.WeakReference weakReference4 = new java.lang.ref.WeakReference(c22633x83752a59 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e ? (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) c22633x83752a59 : null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f28);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f29);
            s50.l1 l1Var8 = (s50.l1) c1Var7;
            l1Var8.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context9, "context");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "nativeVoice: startNativeVoiceInput, thirdExtInfo: ".concat(f29));
            l1Var8.f484621o = f29;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219737f.a(context9, new s50.h1(l1Var8, weakReference4), i19, e29, k23.w0.f385269f, f28, c29);
        }
        y2Var = msg;
        obj = "msg";
        num = 0;
        gVar = gVar2;
        gVar.getClass();
        java.lang.String str22 = y2Var.f422552i + ":ok";
        java.util.HashMap hashMap22 = new java.util.HashMap();
        java.lang.Integer num222 = num;
        hashMap22.put("retCode", num222);
        hashMap22.put("err_code", num222);
        hashMap22.put(obj, str22);
        gVar.e(y2Var.f422546c, str22, hashMap22);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return -2;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "operateStreamVoiceInput";
    }
}
