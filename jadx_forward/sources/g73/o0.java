package g73;

@j95.b(m140513x1e06fd29 = {d73.j.class})
/* loaded from: classes15.dex */
public final class o0 extends i95.w implements d73.i, l75.q0 {

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 f350845e;

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 f350846f;

    /* renamed from: i, reason: collision with root package name */
    public static final g73.o f350849i;

    /* renamed from: m, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362 f350850m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f350851n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f350852o;

    /* renamed from: p, reason: collision with root package name */
    public static final g73.m2 f350853p;

    /* renamed from: q, reason: collision with root package name */
    public static final g73.n f350854q;

    /* renamed from: d, reason: collision with root package name */
    public static final g73.o0 f350844d = new g73.o0();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f350847g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final x.b f350848h = new x.b();

    static {
        android.os.Looper a17 = gm0.j1.e().a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getLooper(...)");
        f350849i = new g73.o(a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362 c11815xcf47e362 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362();
        h73.g.f361025a.a(c11815xcf47e362);
        f350850m = c11815xcf47e362;
        f350851n = true;
        android.os.Looper a18 = gm0.j1.e().a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getLooper(...)");
        f350853p = new g73.m2(a18);
        android.os.Looper a19 = gm0.j1.e().a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "getLooper(...)");
        f350854q = new g73.n(a19);
    }

    public static final boolean Ai(g73.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260) {
        o0Var.getClass();
        if ((abstractC16085x8c838260 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef) && abstractC16085x8c838260.getHandOffType() == 2) {
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef) abstractC16085x8c838260).getUrl())) {
                return true;
            }
        }
        return false;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 Di(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 c16091x79ac7403;
        int i17 = c12886x91aa2b6d.f174579d;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 == 4) {
                    c16091x79ac7403 = com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc.f37031x233c02ec.a(c12886x91aa2b6d);
                } else if (i17 != 5 && i17 != 50) {
                    c16091x79ac7403 = null;
                }
            }
            java.lang.String str = c12886x91aa2b6d.f174596x;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String string = c12886x91aa2b6d.G.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef.f37098x4791e67b);
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = c12886x91aa2b6d.G.getString("rawUrl");
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String str3 = c12886x91aa2b6d.f174590r;
            c16091x79ac7403 = new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef(str2, string.length() > 0 ? string : string2, str3 == null ? "" : str3, 2, null, null, null, null, 240, null);
        } else {
            java.lang.String str4 = c12886x91aa2b6d.f174590r;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.String str6 = c12886x91aa2b6d.f174596x;
            java.lang.String str7 = str6 == null ? "" : str6;
            java.lang.String string3 = c12886x91aa2b6d.G.getString("appId");
            java.lang.String str8 = string3 == null ? "" : string3;
            java.lang.String string4 = c12886x91aa2b6d.G.getString(dm.i4.f66875xa013b0d5);
            c16091x79ac7403 = new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16091x79ac7403(str5, str7, str8, "", string4 == null ? "" : string4, 2, null, null, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        }
        if (c16091x79ac7403 == null) {
            return null;
        }
        java.lang.String key = c12886x91aa2b6d.f174582g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "key");
        c16091x79ac7403.m65041xca02769d(key);
        c16091x79ac7403.m65036x6e018feb(c12886x91aa2b6d.C);
        java.lang.String string5 = c12886x91aa2b6d.G.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260.KId);
        if (string5 != null) {
            c16091x79ac7403.m65040x684351d(string5);
        }
        return c16091x79ac7403;
    }

    public static final boolean wi(g73.o0 o0Var) {
        o0Var.getClass();
        java.util.Iterator it = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p957x53236a1b.t) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6.class))).Ai()).iterator();
        while (it.hasNext()) {
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6) it.next()).f170341c;
            if (i17 == 38 || i17 == 37 || i17 == 43 || i17 == 39 || i17 == 15 || i17 == 14) {
                return true;
            }
        }
        return false;
    }

    @Override // d73.i
    public void A8(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        Ri(new g73.v(key));
    }

    public void Bi(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        Ri(new g73.p(handOff, this));
    }

    @Override // d73.i
    public void C6() {
        g73.o oVar = f350849i;
        oVar.mo50303x856b99f0(1);
        oVar.mo50307xb9e94560(1, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }

    @Override // d73.i
    public void Ce(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ballInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfo, "ballInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 Di = Di(ballInfo);
        if (Di != null) {
            f350844d.Bi(Di);
        }
    }

    @Override // d73.i
    public void Dg(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        x.b bVar = f350848h;
        jz5.l lVar = (jz5.l) bVar.m174751x4aabfc28(id6, null);
        if (lVar != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d) lVar.f384367e).f68112x10a0fed7 = 105L;
            bVar.m174754xc84af884(id6);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HandOffService", "error in cancel file upload, handoff with md5 [" + id6 + "] lost!");
        }
    }

    @Override // d73.i
    public void Ef(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        Ri(new g73.g0(handOff));
    }

    @Override // d73.i
    public void Ja(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260) {
        f350845e = abstractC16085x8c838260 != null ? abstractC16085x8c838260.mo65021x2eaf75() : null;
    }

    @Override // d73.i
    public void Jc(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        Ri(new g73.n0(handOff));
    }

    @Override // d73.i
    public void Kg(java.lang.String id6, java.lang.String cdnURL, java.lang.String aesKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnURL, "cdnURL");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        x.b bVar = f350848h;
        jz5.l lVar = (jz5.l) bVar.m174751x4aabfc28(id6, null);
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HandOffService", "error in file upload success, handoff with id [" + id6 + "] lost!");
            return;
        }
        java.lang.Object obj = lVar.f384366d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc c16086xc05cbbfc = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc) obj;
        c16086xc05cbbfc.m65068x6f09504(cdnURL);
        c16086xc05cbbfc.m65065x3971e12(aesKey);
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) obj;
        g73.m2 m2Var = f350853p;
        m2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        m2Var.h(3, kz5.b0.c(handOff));
        bVar.m174754xc84af884(id6);
    }

    @Override // d73.i
    public void Ma(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        Ri(new g73.a0(handOff));
    }

    @Override // d73.i
    public boolean N1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ballInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfo, "ballInfo");
        return false;
    }

    public void Ni(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        Ri(new g73.x(handOff));
    }

    @Override // d73.i
    public void Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        Ri(g73.d0.f350795d);
    }

    @Override // d73.i
    public boolean Qg() {
        return ((com.p314xaae8f345.mm.p957x53236a1b.t) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6.class))).Di();
    }

    @Override // d73.i
    public void Qi(java.lang.String id6, java.lang.String arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        x.b bVar = f350848h;
        jz5.l lVar = (jz5.l) bVar.m174751x4aabfc28(id6, null);
        g73.m2 m2Var = f350853p;
        if (lVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) lVar.f384366d;
            m2Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
            m2Var.h(8, kz5.b0.c(handOff));
            bVar.m174754xc84af884(id6);
            return;
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("opcode=\"\\d+\"");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(arg).replaceAll("opcode=\"8\"");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("seq=\"\\d+\"");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile2, "compile(...)");
        java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("seq=\"<![CSEQ]>\"");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll2, "replaceAll(...)");
        m2Var.getClass();
        m2Var.f350824e.add(replaceAll2);
        m2Var.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HandOffService", "error in file upload fail, handoff with id [" + id6 + "] lost!");
    }

    public final void Ri(final yz5.a aVar) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        g73.o oVar = f350849i;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(currentThread, oVar.mo50280x23b2dd47().getThread())) {
            aVar.mo152xb9724478();
        } else {
            oVar.mo50293x3498a0(new java.lang.Runnable(aVar) { // from class: g73.k0

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f350815d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "function");
                    this.f350815d = aVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f350815d.mo152xb9724478();
                }
            });
        }
    }

    @Override // d73.i
    public boolean S8(java.lang.String id6, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.Iterator it = f350847g.entrySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) ((java.util.Map.Entry) it.next()).getValue();
            if ((abstractC16085x8c838260 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractC16085x8c838260.getId(), id6)) {
                f350848h.put(id6, new jz5.l(abstractC16085x8c838260, info));
                return true;
            }
        }
        return false;
    }

    @Override // d73.i
    public void Sb(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        Ri(new g73.f0(handOff));
    }

    @Override // d73.i
    public void Ti(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362 onlineInfo) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onlineInfo, "onlineInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOffService", "notifyUserStatusChange: " + onlineInfo);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f350850m, onlineInfo)) {
            f350850m = onlineInfo;
            h73.g gVar = h73.g.f361025a;
            int i17 = onlineInfo.f158884d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = h73.g.f361026b;
            o4Var.A("icon_type", i17);
            o4Var.A("client_version", onlineInfo.f158885e);
            o4Var.G("is_wx_online", onlineInfo.f158886f);
            o4Var.G("CAN_XWECHAT_SEND_OPEN_REQUEST", onlineInfo.f158887g);
            o4Var.G("CAN_SEND_OPEN_REQUEST", onlineInfo.f158888h);
        }
        if (f350852o) {
            android.content.Intent intent = new android.content.Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
            intent.setPackage("com.tencent.mtt");
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(dm.i4.f66865x76d1ec5a, 3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 = f350846f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc c16086xc05cbbfc = abstractC16085x8c838260 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc ? (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc) abstractC16085x8c838260 : null;
                java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(c16086xc05cbbfc != null ? c16086xc05cbbfc.getFullPath() : null);
                if (Qg()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc.f37031x233c02ec.getClass();
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16084xdca2b46a.f37024x233c02ec.a(n17)) {
                        z17 = true;
                        jSONObject.put("isShow", z17);
                        jSONArray.put(jSONObject);
                        intent.putExtra("menuItems", jSONArray.toString());
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
                    }
                }
                z17 = false;
                jSONObject.put("isShow", z17);
                jSONArray.put(jSONObject);
                intent.putExtra("menuItems", jSONArray.toString());
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HandOffService", "UpdateQbMenuIfNeed() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
    }

    @Override // d73.i
    public boolean Wa(java.lang.String id6, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        jz5.l lVar = (jz5.l) f350848h.m174751x4aabfc28(id6, null);
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HandOffService", "error in file uploading, handoff with id [" + id6 + "] lost!");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) lVar.f384366d;
        g73.m2 m2Var = f350853p;
        m2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        m2Var.h(7, kz5.b0.c(handOff));
        return true;
    }

    @Override // d73.i
    public void a9(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        Ri(new g73.b0(handOff));
    }

    @Override // d73.i
    public void e7(java.lang.String id6, java.lang.String appId, int i17, java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        x.b bVar = f350848h;
        jz5.l lVar = (jz5.l) bVar.m174751x4aabfc28(id6, null);
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HandOffService", "error in file upload success, handoff with md5 [" + id6 + "] lost!");
            return;
        }
        java.lang.Object obj = lVar.f384366d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc c16086xc05cbbfc = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc) obj;
        c16086xc05cbbfc.m65066x52b73fda(appId);
        c16086xc05cbbfc.m65073xa769a940(i17);
        c16086xc05cbbfc.m65072xe951995d(mediaId);
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) obj;
        g73.m2 m2Var = f350853p;
        m2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        m2Var.h(3, kz5.b0.c(handOff));
        bVar.m174754xc84af884(id6);
    }

    @Override // d73.i
    public void f6(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        Ri(new g73.l0(handOff));
    }

    @Override // d73.i
    public void hb(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        Ri(new g73.m0(multiTaskInfo));
    }

    @Override // d73.i
    public void i9(java.util.List ballInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfoList, "ballInfoList");
    }

    @Override // d73.i
    public void k8() {
        Ri(g73.u.f350866d);
    }

    @Override // d73.i
    public void mb(java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        Ri(new g73.h0(message));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0 A[EDGE_INSN: B:27:0x00a0->B:28:0x00a0 BREAK  A[LOOP:0: B:16:0x0070->B:34:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:16:0x0070->B:34:?, LOOP_END, SYNTHETIC] */
    @Override // l75.q0
    /* renamed from: onNotifyChange */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo735xb0dfc7d8(java.lang.String r8, l75.w0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.String r0 = "eventData"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            java.lang.Class<z30.w> r0 = z30.w.class
            i95.m r0 = i95.n0.c(r0)
            z30.w r0 = (z30.w) r0
            long r1 = java.lang.Long.parseLong(r8)
            y30.u r0 = (y30.u) r0
            r0.getClass()
            java.lang.Class<o72.f5> r8 = o72.f5.class
            i95.m r8 = i95.n0.c(r8)
            o72.f5 r8 = (o72.f5) r8
            com.tencent.mm.plugin.fav.o r8 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.o) r8
            o72.k4 r8 = r8.oj()
            o72.r2 r8 = r8.F(r1)
            if (r8 == 0) goto Lc8
            int r0 = r8.f67657x2262335f
            r1 = 8
            if (r0 != r1) goto Lc8
            int r9 = r9.f398507b
            r0 = 3
            if (r9 != r0) goto Lc8
            r45.bq0 r9 = r8.f67640x5ab01132
            java.util.LinkedList r9 = r9.f452497f
            java.lang.String r0 = "dataList"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r0)
            java.lang.Object r9 = kz5.n0.Z(r9)
            r45.gp0 r9 = (r45.gp0) r9
            if (r9 == 0) goto Lc8
            java.lang.String r0 = r9.f456967s
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5a
            int r0 = r0.length()
            if (r0 != 0) goto L58
            goto L5a
        L58:
            r0 = r1
            goto L5b
        L5a:
            r0 = r2
        L5b:
            if (r0 != 0) goto Lc8
            java.lang.String r0 = r9.M
            java.util.concurrent.ConcurrentHashMap r3 = g73.o0.f350847g
            java.util.Collection r3 = r3.values()
            java.lang.String r4 = "<get-values>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L70:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L9f
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.tencent.mm.plugin.handoff.model.HandOff r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) r5
            boolean r6 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc
            if (r6 == 0) goto L9b
            com.tencent.mm.plugin.handoff.model.HandOffFile r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc) r5
            java.lang.String r6 = r5.getMd5()
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r0)
            if (r6 == 0) goto L9b
            java.lang.String r5 = r5.getSvrId()
            java.lang.String r6 = "-1"
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r6)
            if (r5 == 0) goto L9b
            r5 = r2
            goto L9c
        L9b:
            r5 = r1
        L9c:
            if (r5 == 0) goto L70
            goto La0
        L9f:
            r4 = 0
        La0:
            com.tencent.mm.plugin.handoff.model.HandOff r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) r4
            if (r4 == 0) goto Lc8
            com.tencent.mm.plugin.handoff.model.HandOffFile r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc) r4
            java.lang.String r0 = r9.f456967s
            java.lang.String r1 = "getCdnDataUrl(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r4.m65068x6f09504(r0)
            java.lang.String r9 = r9.f456971u
            java.lang.String r0 = "getCdnDataKey(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r0)
            r4.m65065x3971e12(r9)
            int r8 = r8.f67643xc8a07680
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r4.m65075x53b7a8a8(r8)
            g73.o0 r8 = g73.o0.f350844d
            r8.Ni(r4)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g73.o0.mo735xb0dfc7d8(java.lang.String, l75.w0):void");
    }

    @Override // d73.i
    public com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 rb(java.lang.String id6) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        java.util.Collection values = f350847g.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) obj).getId(), id6)) {
                break;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) obj;
    }

    @Override // d73.i
    public com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 t1() {
        return f350845e;
    }

    @Override // d73.i
    public void t7(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        Ri(new g73.c0(handOff));
    }

    @Override // d73.i
    public void tf(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        Ri(new g73.e0(handOff));
    }

    @Override // d73.i
    public com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 uh(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) f350847g.get(key);
        if (abstractC16085x8c838260 != null) {
            return abstractC16085x8c838260.mo65021x2eaf75();
        }
        return null;
    }

    @Override // d73.i
    public void va(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        Ri(new g73.i0(key));
    }

    @Override // d73.i
    public void vg(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        Ri(new g73.q(multiTaskInfo));
    }

    @Override // d73.i
    public void wd(java.util.List multiTaskInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfoList, "multiTaskInfoList");
        Ri(new g73.j0(multiTaskInfoList));
    }
}
