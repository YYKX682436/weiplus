package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes15.dex */
public class w extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.List f226044n = java.util.Arrays.asList("wxalitecce81f5fba338df4dd5f74df8229c600", "wxalitea95723728764364c6f996b4bdab3af52");

    /* renamed from: o, reason: collision with root package name */
    public static final boolean[] f226045o = {false};

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Set f226046p = new java.util.HashSet();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.HashMap f226047q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.ArrayList f226048r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.HashMap f226049s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.HashMap f226050t = new java.util.HashMap();

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.HashMap f226051u = new java.util.HashMap();

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f226052v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.Object f226053w = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public e60.z0 f226057d;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f226060g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f226054a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f226055b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f226056c = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f226058e = 3;

    /* renamed from: f, reason: collision with root package name */
    public boolean f226059f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f226061h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f226062i = 0;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 f226063j = null;

    /* renamed from: k, reason: collision with root package name */
    public final e60.x0 f226064k = new e60.x0() { // from class: com.tencent.mm.plugin.lite.w$$j
        @Override // e60.x0
        public final boolean a(java.util.LinkedList linkedList, java.lang.Boolean bool) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.this;
            wVar.getClass();
            java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226053w;
            synchronized (obj) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "albums result size:%d", java.lang.Integer.valueOf(linkedList.size()));
                wVar.f226060g = linkedList;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "after albums result size:%d", java.lang.Integer.valueOf(linkedList.size()));
                wVar.f226059f = true;
                obj.notifyAll();
            }
            return true;
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 f226065l = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.i0(this);

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.b0 f226066m = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.j0(this);

    public w() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.h0 h0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.h0(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(h0Var, 30000L, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r3 = r5.getInteger("frame-rate");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float a(java.lang.String r8) {
        /*
            java.lang.String r0 = "frame-rate"
            java.lang.String r1 = "MicroMsg.MMWxaLiteAppCenter"
            gp.c r2 = new gp.c
            r2.<init>()
            r3 = 0
            r2.k(r8)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            int r8 = r2.d()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r4 = r3
        L12:
            if (r4 >= r8) goto L3e
            android.media.MediaFormat r5 = r2.e(r4)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.lang.String r6 = "mime"
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.lang.String r7 = "video/"
            boolean r6 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            if (r6 == 0) goto L31
            boolean r6 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            if (r6 == 0) goto L31
            int r3 = r5.getInteger(r0)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            goto L3e
        L31:
            int r4 = r4 + 1
            goto L12
        L34:
            r8 = move-exception
            goto L53
        L36:
            r8 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L34
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r4)     // Catch: java.lang.Throwable -> L34
        L3e:
            r2.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r0 = "getVideoFrameRate fps: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0, r8)
            float r8 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r0
            return r8
        L53:
            r2.g()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.a(java.lang.String):float");
    }

    public static d85.f0 b(java.lang.String str) {
        int i17;
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65653xd9e187d1(str).f37343x1daa655e.f37358x24dd40ac;
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "businessScene is null!");
            return null;
        }
        try {
            i17 = java.lang.Integer.parseInt(str2);
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMWxaLiteAppCenter", e17, "parse businessScene error!", new java.lang.Object[0]);
            i17 = 0;
        }
        for (d85.f0 f0Var : d85.f0.m123703xcee59d22()) {
            int i18 = f0Var.f308710e;
            if (i18 == i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "business matched! %d %s", java.lang.Integer.valueOf(i18), f0Var.f308709d);
                return f0Var;
            }
        }
        return null;
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65653xd9e187d1(str).f37343x1daa655e.f37357xd7e3ce6b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "businessName: %s", str2);
        return str2;
    }

    public static android.content.Context d(long j17) {
        java.lang.Object m65361xd4eb96cf = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            if (m65361xd4eb96cf instanceof android.app.Activity) {
                return (android.content.Context) m65361xd4eb96cf;
            }
            if (m65361xd4eb96cf instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) {
                return ((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) m65361xd4eb96cf).mo7430x19263085();
            }
            if (m65361xd4eb96cf instanceof android.view.View) {
                return ((android.view.View) m65361xd4eb96cf).getContext();
            }
            if (m65361xd4eb96cf instanceof com.p314xaae8f345.p362xadfe2b3.C3646xcf902238) {
                return ((com.p314xaae8f345.p362xadfe2b3.C3646xcf902238) m65361xd4eb96cf).f127508q;
            }
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
    }

    public static java.lang.String e(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, boolean z17) {
        java.lang.String concat;
        if (abstractC15633xee433078 == null) {
            return null;
        }
        java.lang.String o17 = abstractC15633xee433078.o();
        if (o17 == null || abstractC15633xee433078.mo63659xfb85f7b0() != 2) {
            return o17;
        }
        int lastIndexOf = o17.lastIndexOf(".");
        if (lastIndexOf != -1) {
            concat = o17.substring(0, lastIndexOf) + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        } else {
            concat = o17.concat(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
        }
        java.lang.String name = new java.io.File(concat).getName();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.f("photoalbum", null, null) + "LiteAppPhotoAlbum";
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        sb6.append(str);
        sb6.append("/");
        sb6.append(name);
        java.lang.String sb7 = sb6.toString();
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "realProcessThumbnail async");
            ku5.u0 u0Var = ku5.t0.f394148d;
            ((ku5.t0) u0Var).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w0(abstractC15633xee433078, sb7), "liteappphotoalbum" + name);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "realProcessThumbnail sync");
            m(abstractC15633xee433078, sb7);
        }
        return sb7;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048 A[Catch: JSONException -> 0x003f, TRY_LEAVE, TryCatch #0 {JSONException -> 0x003f, blocks: (B:18:0x002c, B:20:0x0034, B:10:0x0048, B:8:0x0041), top: B:17:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 r8) {
        /*
            com.tencent.mm.plugin.lite.logic.g1 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s()
            r1 = 0
            com.tencent.liteapp.storage.WxaLiteAppInfo r0 = r0.y(r5, r1)
            java.lang.String r1 = "MicroMsg.MMWxaLiteAppCenter"
            if (r0 != 0) goto L13
            java.lang.String r5 = "getLiteAppInfo return null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r5)
            return
        L13:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "appId"
            r0.put(r2, r5)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r3.put(r2, r5)
            java.lang.String r2 = "page"
            r3.put(r2, r6)
            if (r7 == 0) goto L41
            java.lang.String r6 = ""
            boolean r6 = r7.equals(r6)     // Catch: org.json.JSONException -> L3f
            if (r6 != 0) goto L41
            java.lang.String r6 = "query"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            r2.<init>(r7)     // Catch: org.json.JSONException -> L3f
            r3.put(r6, r2)     // Catch: org.json.JSONException -> L3f
            goto L46
        L3f:
            r6 = move-exception
            goto L73
        L41:
            java.lang.String r6 = "onOpenLiteAppEvent::query is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r6)     // Catch: org.json.JSONException -> L3f
        L46:
            if (r8 == 0) goto L80
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            r6.<init>()     // Catch: org.json.JSONException -> L3f
            java.lang.String r2 = "scene"
            com.tencent.liteapp.gen.LiteAppOpenScene r4 = r8.f14311x683188c     // Catch: org.json.JSONException -> L3f
            int r4 = r4.m28833x754a37bb()     // Catch: org.json.JSONException -> L3f
            r6.put(r2, r4)     // Catch: org.json.JSONException -> L3f
            java.lang.String r2 = "sceneId"
            java.lang.String r4 = r8.f14312x721f2ec7     // Catch: org.json.JSONException -> L3f
            r6.put(r2, r4)     // Catch: org.json.JSONException -> L3f
            java.lang.String r2 = "scenePath"
            java.lang.String r4 = r8.f14313x6711cad1     // Catch: org.json.JSONException -> L3f
            r6.put(r2, r4)     // Catch: org.json.JSONException -> L3f
            java.lang.String r2 = "extraData"
            org.json.JSONObject r8 = r8.f14309xf0df6fda     // Catch: org.json.JSONException -> L3f
            r6.put(r2, r8)     // Catch: org.json.JSONException -> L3f
            java.lang.String r8 = "referrerInfo"
            r3.put(r8, r6)     // Catch: org.json.JSONException -> L3f
            goto L80
        L73:
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            java.lang.String r7 = "onOpenLiteAppEvent::parse query to json fail. %s, query: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r7, r6)
        L80:
            java.lang.String r6 = "openLiteApp"
            o(r6, r5, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.h(java.lang.String, java.lang.String, java.lang.String, com.tencent.liteapp.storage.LiteAppReferrerInfo):void");
    }

    /* renamed from: initLib */
    public static boolean m65927x7420eb55() {
        boolean[] zArr = f226045o;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    try {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65372x7420eb55();
                        fp.d0.n("paymarshelper");
                        fp.d0.n(org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154080xdba63de6());
                        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_liteapp_enable_new_websocket, true)) {
                            wp5.e.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p0());
                        }
                        fp.d0.n("rosseta");
                        com.p314xaae8f345.p2925x527aaf15.C25478x2a2f10f7.m94453xeddcee07(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.class, "LiteAppReporterDependency");
                        zArr[0] = true;
                    } catch (java.lang.UnsatisfiedLinkError e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "initLib fail. %s", e17.toString());
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static java.util.Map.Entry j(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 activityC16256xf01eee95, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, pa3.s sVar) {
        pa3.p pVar;
        pa3.i iVar = null;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai()) {
            pa3.p pVar2 = activityC16256xf01eee95.O1;
            if (pVar2 != null) {
                pVar = pVar2;
            } else {
                pVar = new pa3.p(new pa3.r(activityC16256xf01eee95));
                activityC16256xf01eee95.O1 = pVar;
                pVar.e0(c(str));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                pVar.f434528x = str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                pVar.f434529y = str2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                pVar.f434530z = str3;
                java.lang.String a17 = pa3.p.I.a(pVar.G, pVar.f434528x, pVar.f434529y, str3, sVar.f434539g);
                pVar.F = a17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = pVar.f381610a;
                if (c16601x7ed0e40c != null) {
                    c16601x7ed0e40c.f66791xc8a07680 = a17;
                }
                pVar.B = j17;
                pVar.A = sVar.f434538f;
                java.lang.String str4 = sVar.f434534b;
                if (str4 == null) {
                    str4 = "";
                }
                pVar.C = str4;
                java.lang.String str5 = sVar.f434535c;
                if (str5 == null) {
                    str5 = "";
                }
                pVar.D = str5;
                java.lang.String str6 = sVar.f434536d;
                pVar.E = str6 != null ? str6 : "";
            }
        } else {
            pVar = null;
        }
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di()) {
            pa3.i iVar2 = activityC16256xf01eee95.P1;
            if (iVar2 != null) {
                iVar = iVar2;
            } else {
                pa3.i iVar3 = new pa3.i(new pa3.e(activityC16256xf01eee95));
                activityC16256xf01eee95.P1 = iVar3;
                java.lang.String bizName = c(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
                iVar3.B = bizName;
                int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bizName, "ask") ? 55 : 54;
                android.content.Intent mo54480x1e885992 = iVar3.f434516v.mo54480x1e885992();
                android.os.Bundle bundleExtra = mo54480x1e885992.getBundleExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
                mo54480x1e885992.putExtra("key_enter_from_float_ball", bundleExtra != null ? java.lang.Boolean.valueOf(bundleExtra.getBoolean("key_enter_from_float_ball")) : null);
                android.os.Bundle bundleExtra2 = mo54480x1e885992.getBundleExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
                mo54480x1e885992.putExtra("key_enter_with_animation", bundleExtra2 != null ? java.lang.Boolean.valueOf(bundleExtra2.getBoolean("key_enter_with_animation")) : null);
                android.os.Bundle bundleExtra3 = mo54480x1e885992.getBundleExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
                mo54480x1e885992.putExtra("key_enter_group_type", bundleExtra3 != null ? java.lang.Integer.valueOf(bundleExtra3.getInt("key_enter_group_type")) : null);
                iVar3.b(i17, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ballInfo = iVar3.f174665d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ballInfo, "ballInfo");
                ballInfo.f174581f = 1;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                iVar3.f434517w = str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                iVar3.f434518x = str2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                iVar3.f434519y = str3;
                iVar3.f174665d.f174582g = pa3.i.C.a(iVar3.B, iVar3.f434517w, iVar3.f434518x, str3, sVar.f434539g);
                iVar3.A = j17;
                iVar3.f434520z = sVar.f434538f;
                iVar3.t0();
                iVar = iVar3;
            }
        }
        f226052v.put(java.lang.Long.valueOf(j17), sVar);
        return new java.util.AbstractMap.SimpleEntry(pVar, iVar);
    }

    public static void k(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        if (!f226045o[0]) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "publishGlobalEventToAll %s without initlib", str2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "publishGlobalEventToAll %s", str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65432xa161dde(str, str2, jSONObject == null ? "{}" : jSONObject.toString());
        }
    }

    public static void l(java.lang.String str, org.json.JSONObject jSONObject) {
        k("", str, jSONObject);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:14|15|16|(3:18|(1:20)(1:42)|(2:22|(2:40|41)(7:26|27|28|29|30|31|33)))|43|44|45|46|(2:48|(1:52))(1:53)|(1:24)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0151, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
    
        r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "exception: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r0));
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem, java.lang.String):void");
    }

    public static void o(java.lang.String str, java.lang.String str2, java.util.Map map, java.util.Map map2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str2, null);
        java.lang.String jSONObject = new org.json.JSONObject(map2).toString();
        if (y17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().l(str2, true, 1, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.INSTANCE.m65924x3e9425e(str2), new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o0(str2, hashMap, str, jSONObject, map));
        } else {
            hashMap.put("appId", y17.f14359x58b7f1c);
            hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, y17.f14369x346425);
            hashMap.put("signatureKey", y17.f14372xa8503287);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65503xde82919f(str, str2, jSONObject, map, hashMap);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: addTask */
    public void mo65532xbb89e9c6(final java.lang.String str, final long j17, final java.lang.String str2, final java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "[addTask] appId: %s | appUuid: %d | page: %s | params: %s", str, java.lang.Long.valueOf(j17), str2, str4);
        android.content.Context d17 = d(j17);
        if (d17 == null || !(d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[addTask] context get null");
            return;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 activityC16256xf01eee95 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95) d17;
        final pa3.s sVar = new pa3.s();
        sVar.a(str4);
        if ("star".equals(sVar.f434533a)) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.w$$e
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 activityC16256xf01eee952 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95.this;
                    pa3.p pVar = (pa3.p) ((java.util.AbstractMap.SimpleEntry) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.j(activityC16256xf01eee952, str, j17, str2, str3, sVar)).getKey();
                    if (pVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[addTask] liteAppMultiTaskHelper is null");
                        return;
                    }
                    pVar.B(true);
                    activityC16256xf01eee952.d7(180);
                    activityC16256xf01eee952.f127637l1 = 1;
                }
            });
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.w$$f
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 activityC16256xf01eee952 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95.this;
                    pa3.i iVar = (pa3.i) ((java.util.AbstractMap.SimpleEntry) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.j(activityC16256xf01eee952, str, j17, str2, str3, sVar)).getValue();
                    if (iVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[addTask] liteappFloatBallHelper is null");
                        return;
                    }
                    iVar.A(true, 2);
                    activityC16256xf01eee952.d7(180);
                    activityC16256xf01eee952.f127637l1 = 2;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
    
        if (r12 == null) goto L23;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: callNativeRecorder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String mo65533x53781ff3(long r29, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.mo65533x53781ff3(long, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: callNativeSpeechRecognition */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo65534xd8bff1e0(long r15, java.lang.String r17, long r18, java.lang.String r20, java.lang.String r21, boolean r22, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.mo65534xd8bff1e0(long, java.lang.String, long, java.lang.String, java.lang.String, boolean, com.tencent.mm.plugin.lite.LiteAppCenter$NativeCallback):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: checkGlobalPkg */
    public java.lang.String mo65535x84cad301(java.lang.String str, java.lang.String str2) {
        if (str.isEmpty()) {
            return "";
        }
        java.lang.String[] split = str.split(",");
        java.lang.String[] split2 = str2.split(",");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        int i18 = 0;
        while (i18 < split.length) {
            java.lang.String str3 = split[i18];
            java.lang.String str4 = i18 < split2.length ? split2[i18] : "";
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str3, null);
            if (y17 == null || !(str4.isEmpty() || com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65520x18714402(y17.f14375x14f51cd8, str4))) {
                arrayList.add(str3);
            } else {
                arrayList2.add(str3);
            }
            i18++;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().l((java.lang.String) it.next(), false, 2, 0L, null, null);
        }
        if (!arrayList.isEmpty()) {
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().g(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.k0(this, countDownLatch));
            try {
                countDownLatch.await(3L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "checkGlobalPkg " + e17.toString());
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        while (i17 < split.length) {
            java.lang.String str5 = split[i17];
            java.lang.String str6 = i17 < split2.length ? split2[i17] : "0";
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y18 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str5, null);
            if (y18 != null && !y18.f14369x346425.isEmpty() && com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65520x18714402(y18.f14375x14f51cd8, str6)) {
                try {
                    jSONObject.put(str5, y18.f14369x346425);
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "checkGlobalPkg " + e18.toString());
                }
            }
            i17++;
        }
        return jSONObject.toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: checkLiteAppAndGetPath */
    public java.lang.String mo65536x438af18f(java.lang.String str, boolean z17, boolean z18) {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str, null);
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943();
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 m65924x3e9425e = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.INSTANCE.m65924x3e9425e(str);
        c3707xe60c5943.I = m65924x3e9425e;
        f226050t.put(str, c3707xe60c5943);
        if (y17 != null && !z18) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().l(str, false, 1, 0L, m65924x3e9425e, null);
            }
            return y17.f14369x346425;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        java.lang.String[] strArr = {""};
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().l(str, z18, 1, 0L, m65924x3e9425e, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s0(this, strArr, countDownLatch));
        try {
            countDownLatch.await(3L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "checkLiteAppAndGetPath " + e17.toString());
        }
        return strArr[0];
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: clearScheduleWakeUp */
    public void mo65538x9731ac83(java.lang.String str) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.f0(this, str));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: dataReporting */
    public void mo65539x7f55f5a4(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null || str2 == null) {
            return;
        }
        if (str.equals("LiteAppReporter")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", str2);
            return;
        }
        mo65614xe68be1bf(23449, str + "," + str2.replaceAll(",", ";") + "," + str3);
    }

    public final void f(final java.lang.String str, final java.lang.String str2, boolean z17, final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.x0 x0Var) {
        if (!str.startsWith("http")) {
            x0Var.a(str);
        } else {
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d.a(str2, str, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b() { // from class: com.tencent.mm.plugin.lite.w$$b
                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b
                    public final void a(java.lang.String str3, int i17, int i18) {
                        java.lang.String str4 = "";
                        if (str3 != null && str3.endsWith(".temp")) {
                            java.lang.String replace = str3.replace(".temp", "");
                            com.p314xaae8f345.mm.vfs.w6.w(str3, replace);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "download videoPath:%s", replace);
                            str3 = replace;
                        }
                        if (i17 == 0) {
                            str4 = str3;
                        } else if (i17 == 2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "video %s download fail", str);
                        }
                        x0Var.a(str4);
                    }
                });
                return;
            }
            ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(str, new k70.u() { // from class: com.tencent.mm.plugin.lite.w$$a
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x010b  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // k70.u
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(android.graphics.Bitmap r9, byte[] r10) {
                    /*
                        Method dump skipped, instructions count: 343
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.C16269x36a40a.a(android.graphics.Bitmap, byte[]):void");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[Catch: JSONException -> 0x00ca, TRY_ENTER, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0007, B:6:0x001c, B:9:0x0023, B:10:0x002b, B:13:0x0044, B:14:0x0096, B:16:0x00b9, B:17:0x00c4, B:21:0x004a, B:23:0x0052, B:24:0x0058, B:26:0x0060, B:27:0x0066, B:29:0x006e, B:30:0x0074, B:32:0x007c, B:33:0x0082, B:35:0x008a, B:36:0x0091, B:37:0x0027), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9 A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0007, B:6:0x001c, B:9:0x0023, B:10:0x002b, B:13:0x0044, B:14:0x0096, B:16:0x00b9, B:17:0x00c4, B:21:0x004a, B:23:0x0052, B:24:0x0058, B:26:0x0060, B:27:0x0066, B:29:0x006e, B:30:0x0074, B:32:0x007c, B:33:0x0082, B:35:0x008a, B:36:0x0091, B:37:0x0027), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0007, B:6:0x001c, B:9:0x0023, B:10:0x002b, B:13:0x0044, B:14:0x0096, B:16:0x00b9, B:17:0x00c4, B:21:0x004a, B:23:0x0052, B:24:0x0058, B:26:0x0060, B:27:0x0066, B:29:0x006e, B:30:0x0074, B:32:0x007c, B:33:0x0082, B:35:0x008a, B:36:0x0091, B:37:0x0027), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject g() {
        /*
            r6 = this;
            java.lang.Class<com.tencent.mars.cdn.CdnManager> r0 = com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "http.proxyHost"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: org.json.JSONException -> Lca
            java.lang.String r3 = "https.proxyHost"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)     // Catch: org.json.JSONException -> Lca
            r4 = 0
            java.lang.String r5 = "hasSystemProxy"
            if (r2 == 0) goto L27
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)     // Catch: org.json.JSONException -> Lca
            if (r2 != 0) goto L23
            goto L27
        L23:
            r1.put(r5, r4)     // Catch: org.json.JSONException -> Lca
            goto L2b
        L27:
            r2 = 1
            r1.put(r5, r2)     // Catch: org.json.JSONException -> Lca
        L2b:
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(r2)     // Catch: org.json.JSONException -> Lca
            long r2 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.m40116x2f4c919e(r2)     // Catch: org.json.JSONException -> Lca
            java.lang.String r5 = "signalStrength"
            r1.put(r5, r2)     // Catch: org.json.JSONException -> Lca
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(r2)     // Catch: org.json.JSONException -> Lca
            java.lang.String r3 = "networkType"
            if (r2 != 0) goto L4a
            java.lang.String r2 = "none"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
            goto L96
        L4a:
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(r2)     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L58
            java.lang.String r2 = "2g"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
            goto L96
        L58:
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(r2)     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L66
            java.lang.String r2 = "3g"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
            goto L96
        L66:
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(r2)     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L74
            java.lang.String r2 = "4g"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
            goto L96
        L74:
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(r2)     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L82
            java.lang.String r2 = "5g"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
            goto L96
        L82:
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(r2)     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L91
            java.lang.String r2 = "wifi"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
            goto L96
        L91:
            java.lang.String r2 = "unknown"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
        L96:
            java.lang.String r2 = "isWeakNet"
            boolean r3 = r6.f226061h     // Catch: org.json.JSONException -> Lca
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Lca
            java.lang.String r2 = "rtt"
            int r3 = r6.f226062i     // Catch: org.json.JSONException -> Lca
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Lca
            java.lang.String r2 = "isConnected"
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: org.json.JSONException -> Lca
            boolean r3 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(r3)     // Catch: org.json.JSONException -> Lca
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Lca
            com.tencent.mars.app.Context r2 = com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179()     // Catch: org.json.JSONException -> Lca
            com.tencent.mars.app.BaseManager r2 = r2.m37619x6f964b77(r0)     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto Lc4
            com.tencent.mars.app.BaseManager r0 = com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(r0)     // Catch: org.json.JSONException -> Lca
            com.tencent.mars.cdn.CdnManager r0 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) r0     // Catch: org.json.JSONException -> Lca
            r2 = 2
            int r4 = r0.m37745x9208c81b(r2)     // Catch: org.json.JSONException -> Lca
        Lc4:
            java.lang.String r0 = "downlink"
            r1.put(r0, r4)     // Catch: org.json.JSONException -> Lca
            goto Ld4
        Lca:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.MMWxaLiteAppCenter"
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)
        Ld4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.g():org.json.JSONObject");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getAppInfo */
    public java.lang.String[] mo65540xe759639(java.lang.String str) {
        return new java.lang.String[]{mo65536x438af18f(str, false, false), ""};
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getAppMemory */
    public long mo65541x4dc0b7cc() {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        activityManager.getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
        android.os.Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{android.os.Process.myPid()});
        if (processMemoryInfo != null && processMemoryInfo.length != 0) {
            return processMemoryInfo[0].getTotalPss() * 1024;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "getProcessMemoryInfo return null or emtpy array");
        return 0L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getBatteryInfo */
    public java.lang.String mo65542x526aff25() {
        android.os.BatteryManager batteryManager = (android.os.BatteryManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("batterymanager");
        if (batteryManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "no batteryManager");
            return "{}";
        }
        int intProperty = batteryManager.getIntProperty(4);
        boolean isCharging = batteryManager.isCharging();
        boolean c17 = wh.e1.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "BatteryInfo level = %d, isCharging = %b, isLowPowerModeEnabled = %b", java.lang.Integer.valueOf(intProperty), java.lang.Boolean.valueOf(isCharging), java.lang.Boolean.valueOf(c17));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.f77487x44fa364, intProperty);
            jSONObject.put("isCharging", isCharging);
            jSONObject.put("isLowPowerModeEnabled", c17);
            return jSONObject.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMWxaLiteAppCenter", e17, "getBatteryInfo fail.", new java.lang.Object[0]);
            return "{}";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getClientVersion */
    public java.lang.String mo65543xeb61b2d7() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, o45.wf.f424562g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getContext */
    public android.content.Context mo65544x76847179(long j17) {
        return d(j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getCpu */
    public float mo65545xb5883272() {
        wo.w wVar = new wo.w(android.os.Process.myPid());
        wVar.d();
        return wVar.f529369c != null ? r0.f529345a : 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getDynamicLibraryPath */
    public java.lang.String mo65546x2d6383b7(java.lang.String str) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_6d71aa8c", str);
        return Ui != null ? Ui.m117639xfb83cc9b() : "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getFilePathByLocalId */
    public java.lang.String mo65547xf3f82618(java.lang.String str) {
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(str), false);
        return i17 == null ? "" : i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getHostInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.HostInfo mo65548x69eaf7ec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.HostInfo hostInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.HostInfo();
        hostInfo.f37206xcb1c722f = "Android";
        hostInfo.f37207x8de43fa9 = "Android " + android.os.Build.VERSION.RELEASE;
        hostInfo.f37204x5875c377 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
        hostInfo.f37203x1d08e51c = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e;
        hostInfo.f37199x3c3faf23 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hostInfo.f37200xd74dcbb0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274639b;
        hostInfo.f37201x1270213a = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274640c;
        hostInfo.f37202x42bea41f = "release";
        return hostInfo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getImageInfo */
    public void mo65549xcb10cdf3(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback nativeCallback) {
        f(str, str2, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.c0(this, str, nativeCallback));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getKeepAliveInfoCountLimit */
    public int mo65550x9977196c(int i17) {
        if (i17 == 1) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65654xc6fdd8af().f37368x4e6e36f7.f37378xca6b4042;
        }
        if (i17 == 2) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65654xc6fdd8af().f37366xe3457143.f37373xca6b4042;
        }
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getKeepAliveTimeSecondsLimit */
    public int mo65551x8ad7dd9b(int i17, int i18) {
        return i18 == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65654xc6fdd8af().f37368x4e6e36f7.f37379x826e313a : i18 == 2 ? com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65654xc6fdd8af().f37366xe3457143.f37374x826e313a : i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getLiteAppBaselibInfo */
    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef mo65552x63cce245(java.lang.String str) {
        m65927x7420eb55();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().w(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getLiteAppEngineModelConfig */
    public java.lang.String mo65553x685374c() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 m65657xb5d4e76f = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65657xb5d4e76f();
        if (m65657xb5d4e76f == null || (str = m65657xb5d4e76f.f37423xeab2a7af) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "getLiteAppEngineModelConfig, Json:%s", str);
        return str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getLiteAppInfo */
    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 mo65554x3b2b08ab(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str, null);
        if (y17 == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65520x18714402(str2, y17.f14375x14f51cd8)) {
            return y17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "getLiteAppInfo fail, can't get minVersion%s for appId:%s", str2, str);
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getLiteAppModelConfig */
    public java.lang.String mo65555x3591fd2e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094 m65653xd9e187d1 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65653xd9e187d1(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "getLiteAppModelConfig:%s %s", str, m65653xd9e187d1.m65674x9616526c());
        return m65653xd9e187d1.m65674x9616526c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getLiteAppRoot */
    public java.lang.String mo65556x3b2f24df() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277808c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getLiteAppViewportMetrics */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LiteAppViewportMetrics mo65557x973c6520(android.content.Context context) {
        if (com.p314xaae8f345.mm.app.w.k() != null && com.p314xaae8f345.mm.app.w.k().get() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "getLiteAppViewportMetrics getTopActivity");
            context = (android.content.Context) com.p314xaae8f345.mm.app.w.k().get();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LiteAppViewportMetrics liteAppViewportMetrics = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LiteAppViewportMetrics();
        android.graphics.Point i17 = com.p314xaae8f345.mm.ui.bk.i(context);
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(context);
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean isInMultiWindowMode = context instanceof android.app.Activity ? ((android.app.Activity) context).isInMultiWindowMode() : false;
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
        int p17 = com.p314xaae8f345.mm.ui.bk.p(context);
        int a18 = com.p314xaae8f345.mm.ui.bl.a(context);
        liteAppViewportMetrics.f37247x6be2dc6 = i17.x;
        liteAppViewportMetrics.f37241xb7389127 = i17.y;
        liteAppViewportMetrics.f37240xa393a510 = h17.x;
        liteAppViewportMetrics.f37239xb512031d = h17.y;
        liteAppViewportMetrics.f37246xd27f48 = p17;
        liteAppViewportMetrics.f37236xcbf69d84 = a18;
        liteAppViewportMetrics.f37245xb0fc8b66 = c17;
        liteAppViewportMetrics.f37238xba56f55 = displayMetrics.densityDpi;
        liteAppViewportMetrics.f37237x5c8c94e8 = displayMetrics.density;
        liteAppViewportMetrics.f37242x571b6be7 = isInMultiWindowMode;
        liteAppViewportMetrics.f37244x7644dcbd = a17.f278668a;
        liteAppViewportMetrics.f37243x3887c110 = a17.f278669b;
        return liteAppViewportMetrics;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getLiteAppWidgetStartReporter */
    public com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 mo65558x893771e2(java.lang.String str) {
        java.util.HashMap hashMap = f226050t;
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = (com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943) hashMap.get(str);
        hashMap.remove(str);
        if (c3707xe60c5943 == null) {
            c3707xe60c5943 = new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943();
            c3707xe60c5943.I = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.INSTANCE.m65924x3e9425e(str);
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str, null);
        c3707xe60c5943.I.mo28901xc633a616(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65338x15e79bbb(y17.f14369x346425, y17.f14359x58b7f1c, y17.f14372xa8503287));
        c3707xe60c5943.I.mo28895x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.u0(this));
        return c3707xe60c5943;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getMulitExpt */
    public boolean mo65560xa54be3d0(java.lang.String str, boolean z17) {
        return j62.e.g().l(str, z17, true, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getNetworkInfo */
    public java.lang.String mo65561x6625b2c6() {
        return g().toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        if (r5 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[LOOP:0: B:4:0x0014->B:37:?, LOOP_END, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getOfflineResource */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String mo65562x97eb74db(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            com.tencent.mm.plugin.lite.logic.g1 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s()
            java.util.HashMap r0 = r0.f225495p
            java.lang.Object r0 = r0.get(r10)
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.lang.String r1 = ""
            if (r0 == 0) goto Ld0
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r0.next()
            q80.t r2 = (q80.t) r2
            c64.a r2 = (c64.a) r2
            r2.getClass()
            java.lang.String r2 = "getOfflineResource, tag is "
            java.lang.String r3 = "getOfflineResource"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.liteapp.offline.AdLiteAppOfflineResTask"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            r5 = 1
            r6 = 0
            if (r10 == 0) goto L3b
            int r7 = r10.length()
            if (r7 != 0) goto L39
            goto L3b
        L39:
            r7 = r6
            goto L3c
        L3b:
            r7 = r5
        L3c:
            java.lang.String r8 = "SnsAd.LiteAppOffRes"
            if (r7 != 0) goto Lc0
            if (r12 == 0) goto L4a
            int r7 = r12.length()
            if (r7 != 0) goto L49
            goto L4a
        L49:
            r5 = r6
        L4a:
            if (r5 == 0) goto L4e
            goto Lc0
        L4e:
            java.lang.String r5 = "pag-view"
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r11)     // Catch: java.lang.Throwable -> La6
            java.lang.String r7 = "adId"
            if (r5 == 0) goto L5f
            java.lang.String r5 = za4.t0.m(r7, r12)     // Catch: java.lang.Throwable -> La6
            if (r5 != 0) goto L6e
            goto L6d
        L5f:
            java.lang.String r5 = "image"
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r11)     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto L6d
            java.lang.String r5 = za4.t0.l(r7, r12)     // Catch: java.lang.Throwable -> La6
            if (r5 != 0) goto L6e
        L6d:
            r5 = r1
        L6e:
            boolean r7 = com.p314xaae8f345.mm.vfs.w6.j(r5)     // Catch: java.lang.Throwable -> La6
            if (r7 == 0) goto L7a
            java.lang.String r6 = com.p314xaae8f345.mm.vfs.w6.i(r5, r6)     // Catch: java.lang.Throwable -> La6
            if (r6 != 0) goto L7b
        L7a:
            r6 = r1
        L7b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r7.<init>(r2)     // Catch: java.lang.Throwable -> La6
            r7.append(r11)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = ", url is "
            r7.append(r2)     // Catch: java.lang.Throwable -> La6
            r7.append(r12)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = ", r is "
            r7.append(r2)     // Catch: java.lang.Throwable -> La6
            r7.append(r5)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = ", result is "
            r7.append(r2)     // Catch: java.lang.Throwable -> La6
            r7.append(r6)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> La6
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r2)     // Catch: java.lang.Throwable -> La6
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)     // Catch: java.lang.Throwable -> La6
            goto Lc9
        La6:
            r2 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "there is an exception "
            r5.<init>(r6)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            goto Lc8
        Lc0:
            java.lang.String r2 = "the app id or url is empty!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
        Lc8:
            r6 = r1
        Lc9:
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
            if (r2 != 0) goto L14
            r1 = r6
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.mo65562x97eb74db(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getOpenOption */
    public java.lang.String mo65563xfbfcf355(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "[getOpenOption] appId: %s", str);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().z(str);
        if (z17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "can't get liteapp iteminfo");
            return "{}";
        }
        org.json.JSONObject jSONObject = z17.f14367xdbc3b5f;
        return jSONObject != null ? jSONObject.toString() : "{}";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getPermissionBlackList */
    public java.util.List mo65564xc2f1ecf8(java.lang.String str) {
        java.util.HashMap hashMap = this.f226054a;
        if (hashMap.containsKey(str)) {
            return (java.util.List) hashMap.get(str);
        }
        java.util.LinkedList wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.k7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.r4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.r4.class))).wi(str, "liteapp");
        hashMap.put(str, wi6);
        return wi6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getRecentForward */
    public java.lang.String mo65565xf485d434(java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.f(str, "bundle", null) + "headImage";
        java.lang.String str3 = str2 + "/defaultHeadForLiteApp.png";
        if (!com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str2);
            if (!r6Var.m()) {
                r6Var.J();
            }
            if (r6Var.m()) {
                try {
                    android.graphics.Bitmap c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
                    if (c17 != null) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(c17, 100, android.graphics.Bitmap.CompressFormat.PNG, str3, true);
                    }
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "getRecentForward can't get defaultHeadImage", e17);
                }
            }
        }
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        java.util.ArrayList Ui = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m().Ui();
        if (Ui.isEmpty()) {
            return "";
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < Ui.size(); i17++) {
            try {
                o25.m2 m2Var = (o25.m2) Ui.get(i17);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, m2Var.f424094b);
                jSONObject.put("content", com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(m2Var.f424093a));
                jSONObject.put("icon", m2Var.f424095c);
                jSONObject.put("defaultHeadIcon", str3);
                jSONObject.put("iconType", "img");
                jSONArray.put(jSONObject);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMWxaLiteAppCenter", e18, "getRecentForward fail.", new java.lang.Object[0]);
                return "";
            }
        }
        java.lang.String e19 = u46.k.e(jSONArray.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "result0 %s", e19);
        return e19;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getRecentForwardTitle */
    public java.lang.String mo65566x378bde84(java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.ifh);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getRegionInfo */
    public java.lang.String mo65567x77971db8(java.lang.String str, java.lang.String str2) {
        sa3.e eVar = (sa3.e) ((q80.q) i95.n0.c(q80.q.class));
        eVar.getClass();
        cl0.e eVar2 = new cl0.e();
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                eVar2 = new cl0.e(str2);
            }
            cl0.e eVar3 = new cl0.e();
            if (str.equals("province")) {
                java.util.Iterator it = ((java.util.ArrayList) eVar.f486841e).iterator();
                while (it.hasNext()) {
                    eVar3.q(((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) it.next()).f155904d);
                }
            } else {
                boolean equals = str.equals("city");
                q71.f0 f0Var = eVar.f486840d;
                int i17 = 0;
                if (equals) {
                    java.util.Iterator it6 = ((java.util.ArrayList) f0Var.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) ((java.util.ArrayList) eVar.f486841e).get(eVar2.mo15052xb58848b9(0))).f155905e)).iterator();
                    while (it6.hasNext()) {
                        eVar3.q(((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) it6.next()).f155904d);
                    }
                } else if (str.equals("region")) {
                    java.util.Iterator it7 = ((java.util.ArrayList) f0Var.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) ((java.util.ArrayList) f0Var.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) ((java.util.ArrayList) eVar.f486841e).get(eVar2.mo15052xb58848b9(0))).f155905e)).get(eVar2.mo15052xb58848b9(1))).f155905e)).iterator();
                    while (it7.hasNext()) {
                        eVar3.q(((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) it7.next()).f155904d);
                    }
                } else if (str.equals("subDistrict")) {
                    java.util.Iterator it8 = ((java.util.ArrayList) f0Var.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) ((java.util.ArrayList) f0Var.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) ((java.util.ArrayList) f0Var.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) ((java.util.ArrayList) eVar.f486841e).get(eVar2.mo15052xb58848b9(0))).f155905e)).get(eVar2.mo15052xb58848b9(1))).f155905e)).get(eVar2.mo15052xb58848b9(2))).f155905e)).iterator();
                    while (it8.hasNext()) {
                        eVar3.q(((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) it8.next()).f155904d);
                    }
                    if (eVar3.mo15056xbe0e3ae6() == 0) {
                        eVar3.q("");
                    }
                } else if (str.equals("internationalCountry")) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] g17 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().g();
                    int length = g17.length;
                    while (i17 < length) {
                        eVar3.q(g17[i17].m77921xfb82e301());
                        i17++;
                    }
                } else if (str.equals("internationalProvince")) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] n17 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().n(com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().g()[eVar2.mo15052xb58848b9(0)].m77919xfb7e1663());
                    int length2 = n17.length;
                    while (i17 < length2) {
                        eVar3.q(n17[i17].m77921xfb82e301());
                        i17++;
                    }
                    if (eVar3.mo15056xbe0e3ae6() == 0) {
                        eVar3.q("");
                    }
                } else if (str.equals("internationalCity")) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f5 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().g()[eVar2.mo15052xb58848b9(0)];
                    com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] n18 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().n(c21050xe4d9f0f5.m77919xfb7e1663());
                    if (n18.length == 0) {
                        eVar3.q("");
                    } else {
                        com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] e17 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().e(c21050xe4d9f0f5.m77919xfb7e1663(), n18[eVar2.mo15052xb58848b9(1)].m77919xfb7e1663());
                        int length3 = e17.length;
                        while (i17 < length3) {
                            eVar3.q(e17[i17].m77921xfb82e301());
                            i17++;
                        }
                    }
                    if (eVar3.mo15056xbe0e3ae6() == 0) {
                        eVar3.q("");
                    }
                }
            }
            return eVar3.mo15068x9616526c();
        } catch (cl0.f e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppAddressService", e18.toString());
            return "";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getScheduleWakeUpInfo */
    public java.lang.String mo65568xf749949a(java.lang.String str) {
        java.lang.String[] strArr = new java.lang.String[1];
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.g0(this, strArr, str, countDownLatch));
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "error: " + e17.toString());
        }
        return strArr[0];
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getSystemInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo mo65569x148d5373(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo systemInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo();
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        android.content.Context context = (k17 == null || k17.get() == null) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : (android.content.Context) k17.get();
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context)) {
            systemInfo.f37317x8c549688 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context)) {
            systemInfo.f37317x8c549688 = "2g";
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
            systemInfo.f37317x8c549688 = "3g";
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
            systemInfo.f37317x8c549688 = "4g";
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(context)) {
            systemInfo.f37317x8c549688 = "5g";
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
            systemInfo.f37317x8c549688 = "wifi";
        } else {
            systemInfo.f37317x8c549688 = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        float f17 = context.getResources().getDisplayMetrics().density;
        systemInfo.f37310x59a4b87 = android.os.Build.MANUFACTURER;
        systemInfo.f37315x633fb29 = wo.w0.m();
        systemInfo.f37314x9fd29358 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(context);
        systemInfo.f37319x6fbd6873 = "Android";
        systemInfo.f37321xcb1c722f = "Android" + android.os.Build.VERSION.RELEASE;
        systemInfo.f37312xa386663b = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37146x33108b1b ? context.getResources().getConfiguration().fontScale : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37145xa386663b;
        systemInfo.f37323x14f51cd8 = "0x" + java.lang.Integer.toHexString(o45.wf.f424562g).toUpperCase();
        systemInfo.f37318xfd923125 = f17;
        if (i17 > 0) {
            float f18 = i17 / f17;
            systemInfo.f37316xb0fc8b66 = f18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "navigationBarHeight: %f", java.lang.Float.valueOf(f18));
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37142x6207eae4 > 0) {
            float f19 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37142x6207eae4 / f17;
            systemInfo.f37316xb0fc8b66 = f19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "use cached NavigationBarHeight: %f", java.lang.Float.valueOf(f19));
        } else {
            try {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r0(this, context, systemInfo, f17)).get();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", e17.toString());
                systemInfo.f37316xb0fc8b66 = com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) / f17;
            }
        }
        systemInfo.f37320xd27f48 = com.p314xaae8f345.mm.ui.bl.j(context) / f17;
        systemInfo.f37322x7f4b7fa2 = com.p314xaae8f345.mm.ui.bl.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) / f17;
        systemInfo.f37311x67c2f239 = com.p314xaae8f345.mm.ui.bk.C();
        return systemInfo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getTaskState */
    public java.lang.String mo65570x98cbb56(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "[getTaskState] appId: %s | appUuid: %d | page: %s | key: %s", str, java.lang.Long.valueOf(j17), str2, str4);
        android.content.Context d17 = d(j17);
        if (d17 == null || !(d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[getTaskState] context get null");
            return "{}";
        }
        java.lang.String bizName = c(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
        pa3.l lVar = pa3.p.I;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        c16601x7ed0e40c.f66793x2262335f = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bizName, "ask") ? 29 : 28;
        c16601x7ed0e40c.f66791xc8a07680 = lVar.a(bizName, str, str2, str3, str4);
        boolean Ri = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ri(c16601x7ed0e40c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bizName, "ask") ? 55 : 54, pa3.i.C.a(bizName, str, str2, str3, str4), null);
        c12886x91aa2b6d.f174581f = 1;
        boolean z17 = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().t0(c12886x91aa2b6d) != null;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("star", Ri);
            jSONObject.put("minimize", z17);
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[getTaskState] exception: %s", e17.toString());
            return "{}";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getTaskSwitch */
    public java.lang.String mo65571x2838990f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "[getTaskSwitch] ");
        boolean Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai();
        boolean Di = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("star", Ai);
            jSONObject.put("minimize", Di);
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[getTaskSwitch] exception: %s", e17.toString());
            return "{}";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getUin */
    public java.lang.String mo65572xb5887524() {
        return kk.k.g(("" + gm0.l.d()).getBytes());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getUserAgent */
    public java.lang.String mo65573x11fd7f44() {
        java.lang.String str;
        java.lang.Object obj;
        android.net.NetworkInfo activeNetworkInfo;
        try {
            java.lang.String str2 = "NoNet";
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        str2 = "WIFI";
                    } else if (type != 2 && type != 3 && type != 4 && type != 5) {
                        str2 = "OtherNet";
                    }
                }
                str2 = "4G";
            }
            java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
            int length = strArr.length;
            int i17 = 0;
            while (true) {
                str = "arm64";
                if (i17 >= length) {
                    obj = "arm32";
                    break;
                }
                if ("arm64-v8a".equals(strArr[i17])) {
                    obj = "arm64";
                    break;
                }
                i17++;
            }
            android.content.Context context = zc.c.f552872b;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appContext");
                throw null;
            }
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.lang.String str3 = zc.c.f552873c;
            if (str3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
                throw null;
            }
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str3, 0);
            java.lang.String str4 = packageInfo.versionName;
            int i18 = packageInfo.versionCode;
            java.lang.Object[] objArr = new java.lang.Object[10];
            objArr[0] = android.os.Build.VERSION.RELEASE;
            objArr[1] = wo.w0.m();
            objArr[2] = android.os.Build.ID;
            objArr[3] = str4;
            objArr[4] = java.lang.Integer.valueOf(i18);
            objArr[5] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
            objArr[6] = str2;
            objArr[7] = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
            objArr[8] = obj;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
                str = "arm32";
            }
            objArr[9] = str;
            java.lang.String format = java.lang.String.format("Mozilla/5.0 (Linux; Android %s; %s Build/%s; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/66.0.3359.126 MQQBrowser/6.2 TBS/045140 Mobile Safari/537.36 MMWEBID/3371 MicroMessenger/%s.%d(%s) Process/lite NetType/%s Language/%s ABI/%s WeChat/%s", objArr);
            if (com.p314xaae8f345.mm.ui.bk.A()) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (format == null) {
                    format = "";
                }
                if (!format.contains("Android Tablet")) {
                    format = format.concat(" Android Tablet");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "get user agent:" + format);
            return format;
        } catch (java.lang.Exception unused) {
            return java.lang.System.getProperty("http.agent");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0040, code lost:
    
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.STORAGE, r13) == false) goto L56;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getUserAlbums */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String mo65574x2df79b85(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.mo65574x2df79b85(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getVideoInfo */
    public void mo65575x4edba913(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback nativeCallback) {
        f(str, str2, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.d0(this, str, nativeCallback));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getVolume */
    public java.lang.String mo65576x34c20a10() {
        android.media.AudioManager audioManager = (android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f17 = streamVolume / streamMaxVolume;
        int ringerMode = audioManager.getRingerMode();
        java.lang.String str = "normal";
        java.lang.String str2 = ringerMode == 0 ? "silent" : ringerMode == 1 ? "vibrate" : "normal";
        int mode = audioManager.getMode();
        if (mode == 1) {
            str = "ringtone";
        } else if (mode == 2) {
            str = "call";
        } else if (mode == 3) {
            str = "communication";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "currentVolume = %d, maxVolume = %d, mode = %s, ringerMode = %s", java.lang.Integer.valueOf(streamVolume), java.lang.Integer.valueOf(streamMaxVolume), str, str2);
        return "{\"volume\": " + java.lang.String.format("%.4f", java.lang.Float.valueOf(f17)) + ", \"mode\": \"" + str + "\", \"ringerMode\": \"" + str2 + "\"}";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getWebviewLocalIdByPath */
    public java.lang.String mo65577x7985af9f(java.lang.String str, java.lang.String str2) {
        return str2.isEmpty() ? "" : ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).wi(str2).f264269e;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LiteAppHandOffInfo i(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LiteAppHandOffInfo liteAppHandOffInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LiteAppHandOffInfo();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMWxaLiteAppCenter", e17, "create paramsJson fail", new java.lang.Object[0]);
        }
        liteAppHandOffInfo.f224937id = jSONObject.optString(dm.i4.f66865x76d1ec5a);
        liteAppHandOffInfo.f37234x6942258 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        liteAppHandOffInfo.f37231x313c79 = jSONObject.optString("icon");
        liteAppHandOffInfo.f37229x58b7f1c = jSONObject.optString("appId");
        liteAppHandOffInfo.f37232x34628f = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
        liteAppHandOffInfo.f37233x66f18c8 = jSONObject.optString("query");
        liteAppHandOffInfo.url = jSONObject.optString("url");
        liteAppHandOffInfo.f37235x368f3a = jSONObject.optString("bizType");
        liteAppHandOffInfo.f37230xf0df6fda = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        return liteAppHandOffInfo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: isDarkMode */
    public boolean mo65578x387a9983() {
        return com.p314xaae8f345.mm.ui.bk.C();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: liteAppWidgetCreateStore */
    public void mo65579x3a6c8e0e(java.lang.String str, int i17, boolean z17, int i18) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(str, i17, z17, i18, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.v0(this, str));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: liteAppWidgetCreateStoreWithPkgPath */
    public void mo65580xb234c57d(java.lang.String str, int i17, java.lang.String str2) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).pj(str, i17, str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: liteAppWidgetDispatchStore */
    public int mo65581xbd125b10(java.lang.String str, java.lang.String str2, java.util.Map map) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj(str, str2, map);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: liteAppWidgetPublishEventToTopPage */
    public void mo65582x2c375d87(int i17, int i18, java.lang.String str, java.util.Map map) {
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        long j17 = i17;
        org.json.JSONObject jSONObject = new org.json.JSONObject(map);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        m65927x7420eb55();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65427x4a281bfe(j17, i18, str, jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: liteAppWidgetPublishGlobalEvent */
    public void mo65583xf0a63b3f(int i17, int i18, java.lang.String str, java.util.Map map) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(i17, i18, str, new org.json.JSONObject(map));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: liteAppWidgetPublishGlobalEventToAll */
    public void mo65584xa55b2127(java.lang.String str, java.util.Map map) {
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject(map);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        l(str, jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: liteAppWidgetPublishGlobalEventToAllByAppId */
    public void mo65585xfdf9cdde(java.lang.String str, java.lang.String str2, java.util.Map map) {
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject(map);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        k(str, str2, jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: liteAppWidgetPublishGlobalEventToTopPage */
    public void mo65586x459b5a0a(int i17, java.lang.String str, java.util.Map map) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(i17, str, new org.json.JSONObject(map));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: liteAppWidgetReleaseStore */
    public void mo65587x41cdfd71(java.lang.String str) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Zj(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: liteAppWidgetStoreIsAlive */
    public boolean mo65588x6fdd85f9(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: liteAppWidgetSubscribeStore */
    public void mo65589x9a12604e(java.lang.String str, java.util.List list) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).uk(str, list);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: liteAppWidgetUnsubscribeStore */
    public void mo65590x3f812567(java.lang.String str, java.util.List list) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).vk(str, list);
    }

    public final java.lang.String n(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, str);
            jSONObject.put("error", str2);
            jSONObject.put("isNoisy", z17);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onCheckBaseLibSumFail */
    public void mo65592x2635de3e(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().B(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onCheckSumFail */
    public void mo65593x2d9f160(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().C(str, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onClearCurrentHandOff */
    public void mo65594x9cccaa15(java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.n0(this, str), "MMWxaLiteAppCenter_Handoff");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onInitJsRuntime */
    public void mo65595x5dcfd780(java.lang.String str, long j17, long j18, long j19, long j27) {
        java.util.HashMap hashMap = this.f226055b;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            hashMap.remove(java.lang.Long.valueOf(j17));
        }
        hashMap.put(java.lang.Long.valueOf(j17), new da3.c(str, j17, j18, j19, j27));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onLiteAppWidgetPrepared */
    public void mo65596xb88c7b75() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        oVar.b(4, new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943());
        oVar.d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onOpenCurrentPageOnPC */
    public void mo65597xb311f7d1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LiteAppHandOffInfo i17 = i(str);
        ((d73.i) i95.n0.c(d73.i.class)).f6(((a70.e) ((b70.e) i95.n0.c(b70.e.class))).Bi(i17.f37235x368f3a, i17.f37231x313c79, i17.f37234x6942258, i17.f37229x58b7f1c, i17.f37232x34628f, i17.f37233x66f18c8, i17.url, i17.f37230xf0df6fda, i17.f224937id));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onPreReleaseLiteApp */
    public void mo65598xc39385f0(java.lang.String str, long j17, java.lang.String str2, boolean z17) {
        if (z17) {
            da3.c cVar = (da3.c) this.f226055b.remove(java.lang.Long.valueOf(j17));
            if (cVar == null || cVar.f309297a == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAudioBinding", "destroy wxAudio");
            cVar.f309297a.m46445xbc3bfb13();
            cVar.f309297a = null;
            return;
        }
        ga3.f fVar = (ga3.f) this.f226056c.remove(java.lang.Long.valueOf(j17));
        if (fVar != null) {
            fVar.a();
        }
        ia3.e.c().e(j17, null);
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) iVar.f148707i;
        java.util.Set set = (java.util.Set) concurrentHashMap.get(str);
        if (set != null && set.remove(java.lang.Long.valueOf(j17)) && set.isEmpty()) {
            concurrentHashMap.remove(str);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) iVar.f148708m;
        java.util.Set set2 = (java.util.Set) concurrentHashMap2.get(str);
        if (set2 != null && set2.remove(str2) && set2.isEmpty()) {
            concurrentHashMap2.remove(str);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ri(j17, 0L, "releaseLiteApp", null, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onPreloadLitePageViewFailed */
    public void mo65599x9b632c49(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "onPreloadLitePageViewFailed appId: " + str + ", page: " + str2);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Yj(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onPreloadLitePageViewFinish */
    public void mo65600x9bd6249f(long j17, java.lang.String str, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "onPreloadLitePageViewFinish appId: " + str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5676xf6b12aeb c5676xf6b12aeb = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5676xf6b12aeb();
        c5676xf6b12aeb.f136002g.getClass();
        c5676xf6b12aeb.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onSetCurrentHandOff */
    public void mo65601xf695baa(java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.l0(this, str), "MMWxaLiteAppCenter_Handoff");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onShowStatusChange */
    public void mo65603xc060e1de(java.lang.String str, java.lang.String str2, long j17, long j18, boolean z17) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.z(this, str, str2, z17, j17, j18));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onStoreSendResult */
    public void mo65604x884ffda7(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.x(this, str, i17, str2, obj));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onStoreSetData */
    public void mo65605x295aba8a(java.lang.String str, java.util.Map map) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.y(this, str, map));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onUnsetUICallback */
    public void mo65606xcc8b6703(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback lVUICallback) {
        java.util.HashMap hashMap = f226049s;
        synchronized (hashMap) {
            hashMap.remove(java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: onUpdateCurrentHandOff */
    public void mo65607x32cd686f(java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.m0(this, str), "MMWxaLiteAppCenter_Handoff");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: openPage */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo65608xe1e9c7f9(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.MMWxaLiteAppCenter"
            java.lang.String r1 = "transparent"
            m65927x7420eb55()
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L18
            r3.<init>(r15)     // Catch: org.json.JSONException -> L18
            boolean r4 = r3.has(r1)     // Catch: org.json.JSONException -> L18
            if (r4 == 0) goto L26
            boolean r3 = r3.getBoolean(r1)     // Catch: org.json.JSONException -> L18
            goto L27
        L18:
            r3 = move-exception
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "openPage fail. %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r4, r3)
        L26:
            r3 = r2
        L27:
            com.tencent.mm.plugin.lite.logic.g1 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s()
            r5 = 0
            com.tencent.liteapp.storage.WxaLiteAppInfo r4 = r4.y(r12, r5)
            if (r4 != 0) goto L3c
            java.lang.String r1 = "openPage fail. appId:%s, path:%s query:%s, config:%s"
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14, r15}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1, r12)
            return
        L3c:
            com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo r12 = new com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo
            r12.<init>()
            java.lang.String r15 = r4.f14359x58b7f1c
            java.lang.String r0 = "<set-?>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            r12.f225407d = r15
            java.lang.String r15 = r4.f14369x346425
            r12.f225408e = r15
            java.lang.String r15 = r4.f14372xa8503287
            r12.f225409f = r15
            long r4 = java.lang.System.currentTimeMillis()
            r12.f225413m = r4
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r0 = "path"
            r15.putString(r0, r13)
            java.lang.String r13 = "query"
            r15.putString(r13, r14)
            if (r3 == 0) goto L6d
            r14 = 1
            r15.putBoolean(r1, r14)
        L6d:
            java.lang.String r14 = r15.getString(r0)
            r12.f225410g = r14
            java.lang.String r13 = r15.getString(r13)
            r12.f225411h = r13
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            r14 = 268435456(0x10000000, float:2.524355E-29)
            r13.addFlags(r14)
            android.content.Context r14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.Class<com.tencent.mm.plugin.lite.ui.WxaLiteAppProxyUI> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16260xf676250f.class
            r13.setClass(r14, r0)
            java.lang.String r14 = "WxaLiteAppLaunchInfo"
            r13.putExtra(r14, r12)
            java.lang.String r12 = "bundle"
            r13.putExtra(r12, r15)
            android.content.Context r12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r13)
            java.util.Collections.reverse(r14)
            java.lang.Object[] r4 = r14.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/lite/MMWxaLiteAppCenter"
            java.lang.String r6 = "openPage"
            java.lang.String r7 = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r3 = r12
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r13 = r14.get(r2)
            android.content.Intent r13 = (android.content.Intent) r13
            r12.startActivity(r13)
            java.lang.String r4 = "com/tencent/mm/plugin/lite/MMWxaLiteAppCenter"
            java.lang.String r5 = "openPage"
            java.lang.String r6 = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r3 = r12
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.mo65608xe1e9c7f9(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: prepareTask */
    public void mo65609xb1c1db2c(final java.lang.String str, final long j17, final java.lang.String str2, final java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "[prepareTask] appId: %s | appUuid: %d | page: %s | params: %s", str, java.lang.Long.valueOf(j17), str2, str4);
        android.content.Context d17 = d(j17);
        if (d17 == null || !(d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[prepareTask] context get null");
            return;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 activityC16256xf01eee95 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95) d17;
        final pa3.s sVar = new pa3.s();
        sVar.a(str4);
        ((ku5.t0) ku5.t0.f394148d).C(new java.util.concurrent.Callable() { // from class: com.tencent.mm.plugin.lite.w$$i
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.j(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95.this, str, j17, str2, str3, sVar);
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: reloadDebug */
    public void mo65610x213c3a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1799x5b09653.b.a(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: removeForwardUser */
    public void mo65611xdb37fd0c(java.lang.String str) {
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        java.util.ArrayList Ui = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m().Ui();
        if (Ui.isEmpty()) {
            return;
        }
        for (int i17 = 0; i17 < Ui.size(); i17++) {
            java.lang.String str2 = ((o25.m2) Ui.get(i17)).f424093a;
            if (str.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str2))) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).fj(str2);
                return;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: removeTask */
    public void mo65612x417ac029(final java.lang.String str, long j17, final java.lang.String str2, final java.lang.String str3, java.lang.String str4) {
        android.content.Context d17 = d(j17);
        if (d17 == null || !(d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[removeTask] context get null");
            return;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 activityC16256xf01eee95 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95) d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "[removeTask] appId: %s | appUuid: %d | page: %s | params: %s", str, java.lang.Long.valueOf(j17), str2, str4);
        final pa3.s sVar = new pa3.s();
        sVar.a(str4);
        if ("star".equals(sVar.f434533a)) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.w$$g
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 activityC16256xf01eee952 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95.this;
                    pa3.p pVar = activityC16256xf01eee952.O1;
                    if (pVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[removeTask] liteAppMultiTaskHelper get null");
                        return;
                    }
                    java.lang.String str5 = str;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
                    pVar.f434528x = str5;
                    java.lang.String str6 = str2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str6, "<set-?>");
                    pVar.f434529y = str6;
                    java.lang.String str7 = str3;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str7, "<set-?>");
                    pVar.f434530z = str7;
                    java.lang.String a17 = pa3.p.I.a(pVar.G, pVar.f434528x, pVar.f434529y, str7, sVar.f434539g);
                    pVar.F = a17;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = pVar.f381610a;
                    if (c16601x7ed0e40c != null) {
                        c16601x7ed0e40c.f66791xc8a07680 = a17;
                    }
                    pVar.B(false);
                    activityC16256xf01eee952.d7(0);
                }
            });
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.w$$h
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 activityC16256xf01eee952 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95.this;
                    pa3.i iVar = activityC16256xf01eee952.P1;
                    if (iVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[removeTask] liteAppFloatBallHelper get null");
                        return;
                    }
                    java.lang.String str5 = str;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
                    iVar.f434517w = str5;
                    java.lang.String str6 = str2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str6, "<set-?>");
                    iVar.f434518x = str6;
                    java.lang.String str7 = str3;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str7, "<set-?>");
                    iVar.f434519y = str7;
                    iVar.f174665d.f174582g = pa3.i.C.a(iVar.B, iVar.f434517w, iVar.f434518x, str7, sVar.f434539g);
                    iVar.A(false, 2);
                    activityC16256xf01eee952.d7(0);
                }
            });
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: reportIdKey */
    public void mo65613xf0101a70(long j17, long j18, long j19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, j18, j19);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: reportKv */
    public void mo65614xe68be1bf(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: setOpenOption */
    public void mo65615x2a214161(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "[setOpenOption] appId: %s | params: %s", str, str2);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().z(str);
        if (z17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "can't get liteapp iteminfo");
            return;
        }
        org.json.JSONObject jSONObject = z17.f14367xdbc3b5f;
        if (jSONObject != null && str2.equals(jSONObject.toString())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "openOption is same");
            return;
        }
        try {
            z17.f14367xdbc3b5f = new org.json.JSONObject(str2);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "json parse error: ", e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().V(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: setScheduleWakeUp */
    public void mo65616xc40ae9d8(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, boolean z17, int i19) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.e0(this, str, i17, i18, str2, str3, z17, i19));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: updateTask */
    public void mo65618xee5c55ee(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "[updateTask] appId: %s | appUuid: %d | page: %s | params: %s", str, java.lang.Long.valueOf(j17), str2, str4);
        android.content.Context d17 = d(j17);
        if (d17 == null || !(d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[updateTask] context get null");
            return;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 activityC16256xf01eee95 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95) d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "[updateTask] appId: %s | appUuid: %d | page: %s | params: %s", str, java.lang.Long.valueOf(j17), str2, str4);
        final pa3.s sVar = new pa3.s();
        sVar.a(str4);
        if ("star".equals(sVar.f434533a)) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.w$$c
                @Override // java.lang.Runnable
                public final void run() {
                    pa3.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95.this.O1;
                    if (pVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[updateTask] liteAppMultiTaskHelper get null");
                        return;
                    }
                    pa3.s tasksParams = sVar;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tasksParams, "tasksParams");
                    java.lang.String str5 = tasksParams.f434534b;
                    if (str5 != null) {
                        if (str5.length() > 0) {
                            pVar.C = str5;
                        }
                    }
                    java.lang.String str6 = tasksParams.f434535c;
                    if (str6 != null) {
                        if (str6.length() > 0) {
                            pVar.D = str6;
                        }
                    }
                    java.lang.String str7 = tasksParams.f434536d;
                    if (str7 != null) {
                        if (str7.length() > 0) {
                            pVar.E = str7;
                        }
                    }
                    java.lang.String str8 = tasksParams.f434538f;
                    if (str8 != null) {
                        pVar.A = str8;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = pVar.f381610a;
                    if (c16601x7ed0e40c != null) {
                        pVar.j();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
                        java.lang.String str9 = pVar.F;
                        java.lang.String bizName = pVar.G;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
                        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bizName, "ask") ? 29 : 28;
                        r45.lr4 v07 = c16601x7ed0e40c.v0();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v07, "getShowData(...)");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).aj(str9, i17, v07, c16601x7ed0e40c.f66790x225a93cf);
                    }
                }
            });
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.w$$d
                @Override // java.lang.Runnable
                public final void run() {
                    pa3.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95.this.P1;
                    if (iVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "[updateTask] liteAppFloatBallHelper get null");
                        return;
                    }
                    java.lang.String str5 = sVar.f434538f;
                    if (str5 != null) {
                        iVar.f434520z = str5;
                    }
                    iVar.t0();
                    ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().V(iVar.f174665d);
                }
            });
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: getMulitExpt */
    public java.lang.String mo65559xa54be3d0(java.lang.String str, java.lang.String str2) {
        return j62.e.g().j(str, str2, true, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback
    /* renamed from: checkLiteAppAndGetPath */
    public void mo65537x438af18f(java.lang.String str, boolean z17, boolean z18, yz5.l lVar) {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str, null);
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943();
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 m65924x3e9425e = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.INSTANCE.m65924x3e9425e(str);
        c3707xe60c5943.I = m65924x3e9425e;
        f226050t.put(str, c3707xe60c5943);
        if (y17 != null && !z18) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().l(str, false, 1, 0L, m65924x3e9425e, null);
            }
            lVar.mo146xb9724478(y17.f14369x346425);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().l(str, z18, 1, 0L, m65924x3e9425e, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.t0(this, lVar));
    }
}
