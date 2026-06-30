package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class x3 {
    public static final java.util.Map M = new java.util.LinkedHashMap();
    public final java.lang.String A;
    public final java.lang.String B;
    public final java.lang.String C;
    public final java.lang.String D;
    public final java.lang.String E;
    public final java.lang.String F;
    public final java.lang.String G;
    public final java.lang.String H;
    public final java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f269173J;
    public final java.lang.String K;
    public java.lang.String L;

    /* renamed from: a, reason: collision with root package name */
    public db5.t4 f269174a;

    /* renamed from: b, reason: collision with root package name */
    public int f269175b;

    /* renamed from: c, reason: collision with root package name */
    public int f269176c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f269177d;

    /* renamed from: e, reason: collision with root package name */
    public long f269178e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f269179f;

    /* renamed from: g, reason: collision with root package name */
    public rv.n2 f269180g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f269181h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f269182i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f269183j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.ref.WeakReference f269184k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f269185l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f269186m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f269187n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f269188o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f269189p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f269190q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f269191r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f269192s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f269193t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f269194u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f269195v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f269196w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f269197x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f269198y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f269199z;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 menuHelperParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuHelperParam, "menuHelperParam");
        this.f269177d = "MicroMsg.WebViewBizCustomBottomSheetHelper";
        this.f269179f = true;
        this.f269181h = new java.util.ArrayList();
        this.f269184k = new java.lang.ref.WeakReference(menuHelperParam);
        this.f269185l = new java.util.LinkedList();
        this.f269186m = new java.util.LinkedList();
        this.f269187n = new java.util.LinkedList();
        this.f269188o = "client:SendAppMessage";
        this.f269189p = "client:ShareTimeline";
        this.f269190q = "client:ToggleStar";
        this.f269191r = "client:AddFav";
        this.f269192s = "client:WebSearch";
        this.f269193t = "client:OpenOnPC";
        this.f269194u = "client:OpenInWeRead";
        this.f269195v = "client:OpenInWeBrowser";
        this.f269196w = "client:SendByMail";
        this.f269197x = "client:UseOtherAppAndWeApp";
        this.f269198y = "client:OpenInWeApp";
        this.f269199z = "client:AddFloatWindow";
        this.A = "client:ListenArticle";
        this.B = "client:ListenLater";
        this.C = "client:SaveAsImage";
        this.D = "client:CopyLink";
        this.E = "client:Refresh";
        this.F = "client:SearchInPage";
        this.G = "client:AdjustFont";
        this.H = "client:ShareQQ";
        this.I = "client:ShareQZone";
        this.f269173J = "client:Complain";
        this.K = "client:Translate";
    }

    public final boolean a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f17 = f();
        return f17 != null && f17.m(i17);
    }

    public final boolean b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f17 = f();
        return f17 != null && f17.n(i17);
    }

    public final void c(java.lang.String eventType, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventType, "eventType");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d g17 = g();
        if (g17 == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", eventType);
        java.lang.String str = "";
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            java.lang.String str2 = (java.lang.String) ((java.util.LinkedHashMap) M).get(java.lang.Integer.valueOf(itemId));
            if (str2 != null) {
                str = str2;
            }
        }
        hashMap.put(dm.i4.f66865x76d1ec5a, str);
        hashMap.put("shareScene", java.lang.Integer.valueOf(this.f269176c));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eventType, "click") && menuItem != null && (menuItem instanceof db5.h4)) {
            hashMap.put("isDisabled", java.lang.Boolean.valueOf(((db5.h4) menuItem).f309908s));
        }
        hashMap.toString();
        g17.f265377p0.o("onBizCustomSharePanelEvent", hashMap);
    }

    public final void d() {
        java.util.List list = this.f269181h;
        ((java.util.ArrayList) list).clear();
        java.util.Map map = M;
        ((java.util.LinkedHashMap) map).clear();
        java.util.List list2 = this.f269183j;
        java.lang.String str = this.f269177d;
        if (list2 != null) {
            if (list2 != null) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    rv.b j17 = j((java.util.Map) it.next());
                    if (j17 != null) {
                        ((java.util.ArrayList) list).add(j17);
                    }
                }
            }
            this.f269182i = !list.isEmpty();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "generate panel action groups from parsed data: " + ((java.util.ArrayList) list).size() + " groups");
            return;
        }
        java.lang.String str2 = this.L;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "actionsString is empty, skip parsing");
            this.f269182i = false;
            return;
        }
        java.util.List k17 = k(this.L);
        if (k17 != null) {
            java.util.Iterator it6 = k17.iterator();
            while (it6.hasNext()) {
                rv.b j18 = j((java.util.Map) it6.next());
                if (j18 != null) {
                    ((java.util.ArrayList) list).add(j18);
                }
            }
        }
        this.f269182i = !list.isEmpty();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "update panel info complete with " + ((java.util.ArrayList) list).size() + " action groups, dynamic mappings: " + map.size());
    }

    public final android.graphics.drawable.Drawable e(java.lang.String base64String, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d g17 = g();
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f269177d, "getDrawableWithSVGLibrary activity is null");
            return null;
        }
        rv.o2 o2Var = (rv.o2) i95.n0.c(rv.o2.class);
        if (o2Var == null) {
            return null;
        }
        java.lang.String str = ((yq1.a) o2Var).f545953d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(base64String, "base64String");
        try {
            byte[] decode = android.util.Base64.decode(base64String, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode);
            s7.t2 g18 = new s7.r3().g(new java.io.ByteArrayInputStream(new java.lang.String(decode, r26.c.f450398a).getBytes()), true);
            if (g18 == null) {
                return null;
            }
            int i18 = (int) (i17 * g17.getResources().getDisplayMetrics().density);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/BizCustomBottomSheetService", "getDrawableWithSVGLibrary", "(Ljava/lang/String;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/brandservice/BizCustomBottomSheetService", "getDrawableWithSVGLibrary", "(Ljava/lang/String;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
            float f17 = i18;
            g18.j(f17);
            g18.i(f17);
            g18.f(canvas);
            return new android.graphics.drawable.BitmapDrawable(g17.getResources(), createBitmap);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "Invalid Base64 string", e17);
            return null;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "Error processing SVG", e18);
            return null;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6) this.f269184k.get();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f17 = f();
        if (f17 != null) {
            return f17.c();
        }
        return null;
    }

    public final boolean h(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f17 = f();
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 C7 = (f17 == null || (c17 = f17.c()) == null) ? null : c17.C7();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f18 = f();
        return f18 != null && f18.z(C7, i17);
    }

    public final boolean i() {
        rv.n2 n2Var = this.f269180g;
        return n2Var != null && ((ss1.d) ((jz5.n) ((qs1.m) n2Var).f447766f).mo141623x754a37bb()).d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x0235, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r0, ((yg0.q2) ((zg0.t2) i95.n0.c(zg0.t2.class))).wi(r13, r4.v7())) == false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0c99  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0cb0 A[Catch: IllegalArgumentException -> 0x0cb9, TRY_LEAVE, TryCatch #3 {IllegalArgumentException -> 0x0cb9, blocks: (B:138:0x0ca2, B:106:0x0cb0), top: B:137:0x0ca2 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0cd5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0ce1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0cf5 A[Catch: IllegalArgumentException -> 0x0d04, TryCatch #0 {IllegalArgumentException -> 0x0d04, blocks: (B:128:0x0ce7, B:115:0x0cf5, B:116:0x0cfe, B:126:0x0cfa), top: B:127:0x0ce7 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0d28  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0d36  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0d2c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0cfa A[Catch: IllegalArgumentException -> 0x0d04, TryCatch #0 {IllegalArgumentException -> 0x0d04, blocks: (B:128:0x0ce7, B:115:0x0cf5, B:116:0x0cfe, B:126:0x0cfa), top: B:127:0x0ce7 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0ce7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0ce4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0ca2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0c9d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0d8d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0bb8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0bd1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rv.b j(java.util.Map r50) {
        /*
            Method dump skipped, instructions count: 3510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3.j(java.util.Map):rv.b");
    }

    public final java.util.List k(java.lang.String str) {
        int i17;
        if (str == null || str.length() == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            int length = jSONArray.length();
            int i18 = 0;
            while (i18 < length) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.Object obj = jSONObject.get(next);
                    if ((obj instanceof org.json.JSONArray) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next, "items")) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int length2 = ((org.json.JSONArray) obj).length();
                        int i19 = 0;
                        while (i19 < length2) {
                            org.json.JSONObject jSONObject2 = ((org.json.JSONArray) obj).getJSONObject(i19);
                            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                            java.util.Iterator<java.lang.String> keys2 = jSONObject2.keys();
                            while (keys2.hasNext()) {
                                java.lang.String next2 = keys2.next();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next2);
                                java.lang.Object obj2 = jSONObject2.get(next2);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                                linkedHashMap2.put(next2, obj2);
                                length = length;
                            }
                            arrayList2.add(linkedHashMap2);
                            i19++;
                            length = length;
                        }
                        i17 = length;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                        linkedHashMap.put(next, arrayList2);
                    } else {
                        i17 = length;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                        linkedHashMap.put(next, obj);
                    }
                    length = i17;
                }
                int i27 = length;
                arrayList.add(linkedHashMap);
                i18++;
                length = i27;
            }
            return arrayList;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f269177d, "Failed to parse actions JSON string: " + e17.getMessage());
            return null;
        }
    }

    public final boolean l(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f17 = f();
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 C7 = (f17 == null || (c17 = f17.c()) == null) ? null : c17.C7();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f18 = f();
        return f18 != null && f18.f0(C7, i17);
    }

    public final void m(long j17, int i17, int i18) {
        android.app.Dialog dialog;
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.Window window;
        android.view.Window window2;
        android.view.Window window3;
        android.view.Window window4;
        android.view.Window window5;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d g17 = g();
        java.lang.String str = this.f269177d;
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showBizCustomBottomSheet: activity is null");
            return;
        }
        this.f269178e = j17;
        this.f269175b = i17;
        this.f269176c = i18;
        java.util.List list = this.f269185l;
        ((java.util.LinkedList) list).clear();
        java.util.List list2 = this.f269186m;
        ((java.util.LinkedList) list2).clear();
        java.util.List list3 = this.f269187n;
        ((java.util.LinkedList) list3).clear();
        this.f269179f = true;
        this.f269174a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t3(this);
        if (this.f269180g == null) {
            ((yq1.a) ((rv.o2) i95.n0.c(rv.o2.class))).getClass();
            this.f269180g = new qs1.m(g17);
        }
        d();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f269181h;
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showBizAuthorMenu: panelActionGroups is null or empty");
            return;
        }
        rv.n2 n2Var = this.f269180g;
        if (n2Var != null) {
            qs1.m mVar = (qs1.m) n2Var;
            android.widget.TextView textView = mVar.f447778r;
            textView.setText("");
            textView.setVisibility(8);
            mVar.f447772l.setVisibility(8);
            android.widget.TextView textView2 = mVar.f447779s;
            textView2.setText("");
            textView2.setVisibility(8);
            mVar.f447773m.setVisibility(8);
            android.widget.TextView textView3 = mVar.f447780t;
            textView3.setText("");
            textView3.setVisibility(8);
            mVar.f447774n.setVisibility(8);
        }
        if (arrayList.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s3 s3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s3(this, 0, arrayList, list);
            rv.n2 n2Var2 = this.f269180g;
            if (n2Var2 != null) {
                java.lang.String title = ((rv.b) arrayList.get(0)).f481358a;
                qs1.m mVar2 = (qs1.m) n2Var2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
                mVar2.f447784x = s3Var;
                android.widget.TextView textView4 = mVar2.f447778r;
                textView4.setText(title);
                textView4.setVisibility(0);
                mVar2.f447772l.setVisibility(0);
            }
        }
        if (arrayList.size() > 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s3 s3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s3(this, 1, arrayList, list2);
            rv.n2 n2Var3 = this.f269180g;
            if (n2Var3 != null) {
                java.lang.String title2 = ((rv.b) arrayList.get(1)).f481358a;
                qs1.m mVar3 = (qs1.m) n2Var3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title2, "title");
                mVar3.f447785y = s3Var2;
                android.widget.TextView textView5 = mVar3.f447779s;
                textView5.setText(title2);
                textView5.setVisibility(0);
                mVar3.f447773m.setVisibility(0);
            }
        }
        if (arrayList.size() > 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s3 s3Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s3(this, 2, arrayList, list3);
            rv.n2 n2Var4 = this.f269180g;
            if (n2Var4 != null) {
                java.lang.String title3 = ((rv.b) arrayList.get(2)).f481358a;
                qs1.m mVar4 = (qs1.m) n2Var4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title3, "title");
                mVar4.f447786z = s3Var3;
                android.widget.TextView textView6 = mVar4.f447780t;
                textView6.setText(title3);
                textView6.setVisibility(0);
                mVar4.f447774n.setVisibility(0);
            }
        }
        if (!i()) {
            db5.t4 t4Var = this.f269174a;
            if (t4Var != null) {
                rv.n2 n2Var5 = this.f269180g;
                if (n2Var5 != null) {
                    ((qs1.m) n2Var5).f447775o.f447746e = t4Var;
                }
                if (n2Var5 != null) {
                    ((qs1.m) n2Var5).f447776p.f447746e = t4Var;
                }
                if (n2Var5 != null) {
                    ((qs1.m) n2Var5).f447777q.f447746e = t4Var;
                }
            }
            rv.n2 n2Var6 = this.f269180g;
            if (n2Var6 != null) {
                ((ss1.d) ((jz5.n) ((qs1.m) n2Var6).f447766f).mo141623x754a37bb()).f493427p = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.w3(this);
            }
        }
        rv.n2 n2Var7 = this.f269180g;
        if (n2Var7 != null) {
            qs1.m mVar5 = (qs1.m) n2Var7;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = mVar5.f447772l;
            java.util.List list4 = c1163xf1deaba4.H1;
            if (list4 != null) {
                ((java.util.ArrayList) list4).clear();
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = mVar5.f447773m;
            java.util.List list5 = c1163xf1deaba42.H1;
            if (list5 != null) {
                ((java.util.ArrayList) list5).clear();
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = mVar5.f447774n;
            java.util.List list6 = c1163xf1deaba43.H1;
            if (list6 != null) {
                ((java.util.ArrayList) list6).clear();
            }
            c1163xf1deaba4.i(mVar5.f447781u);
            c1163xf1deaba42.i(mVar5.f447782v);
            c1163xf1deaba43.i(mVar5.f447783w);
            mVar5.f447771k.m7233x945a8432(new qs1.i(mVar5));
            db5.o4 o4Var = mVar5.f447784x;
            jz5.g gVar = mVar5.f447767g;
            if (o4Var != null) {
                o4Var.mo887xc459429a((db5.g4) ((jz5.n) gVar).mo141623x754a37bb());
            }
            db5.g4 g4Var = (db5.g4) ((jz5.n) gVar).mo141623x754a37bb();
            qs1.c cVar = mVar5.f447775o;
            cVar.f447745d = g4Var;
            if (g4Var != null) {
                g4Var.size();
                ((java.lang.Number) ((jz5.n) cVar.f447747f.f447765e).mo141623x754a37bb()).intValue();
            }
            cVar.m8146xced61ae5();
            db5.o4 o4Var2 = mVar5.f447785y;
            jz5.g gVar2 = mVar5.f447768h;
            if (o4Var2 != null) {
                o4Var2.mo887xc459429a((db5.g4) ((jz5.n) gVar2).mo141623x754a37bb());
            }
            db5.g4 g4Var2 = (db5.g4) ((jz5.n) gVar2).mo141623x754a37bb();
            qs1.c cVar2 = mVar5.f447776p;
            cVar2.f447745d = g4Var2;
            if (g4Var2 != null) {
                g4Var2.size();
                ((java.lang.Number) ((jz5.n) cVar2.f447747f.f447765e).mo141623x754a37bb()).intValue();
            }
            cVar2.m8146xced61ae5();
            db5.o4 o4Var3 = mVar5.f447786z;
            jz5.g gVar3 = mVar5.f447769i;
            if (o4Var3 != null) {
                o4Var3.mo887xc459429a((db5.g4) ((jz5.n) gVar3).mo141623x754a37bb());
            }
            db5.g4 g4Var3 = (db5.g4) ((jz5.n) gVar3).mo141623x754a37bb();
            qs1.c cVar3 = mVar5.f447777q;
            cVar3.f447745d = g4Var3;
            if (g4Var3 != null) {
                g4Var3.size();
                ((java.lang.Number) ((jz5.n) cVar3.f447747f.f447765e).mo141623x754a37bb()).intValue();
            }
            cVar3.m8146xced61ae5();
            mVar5.f447770j.post(new qs1.k(mVar5));
            jz5.g gVar4 = mVar5.f447766f;
            if (((ss1.d) ((jz5.n) gVar4).mo141623x754a37bb()).d()) {
                return;
            }
            ss1.d dVar = (ss1.d) ((jz5.n) gVar4).mo141623x754a37bb();
            dVar.a();
            dVar.f493421g = dVar.c();
            dVar.f493422h = dVar.b();
            dVar.a().setTranslationY(0.0f);
            if (dVar.f493419e != null) {
                android.view.ViewParent parent = dVar.a().getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).setVisibility(0);
                dVar.a();
                android.view.ViewGroup.LayoutParams layoutParams = dVar.a().getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                boolean z17 = dVar.f493421g;
                android.view.View view = null;
                android.view.View view2 = dVar.f493423i;
                if (z17 && view2 != null) {
                    view2.getWindowVisibleDisplayFrame(new android.graphics.Rect());
                    layoutParams2.width = (int) java.lang.Math.min(r11.right, r11.bottom);
                    layoutParams2.gravity = 1;
                    java.lang.Object parent2 = dVar.a().getParent();
                    if (parent2 instanceof android.view.View) {
                        ((android.view.View) parent2).setOnTouchListener(null);
                    }
                    if ((parent2 instanceof android.view.ViewGroup) && (((android.view.ViewGroup) parent2).getLayoutParams() instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c)) {
                        dVar.e();
                    }
                }
                dVar.a().setLayoutParams(layoutParams2);
                android.app.Dialog dialog2 = dVar.f493419e;
                if (dialog2 != null && (window5 = dialog2.getWindow()) != null) {
                    window5.addFlags(Integer.MIN_VALUE);
                }
                android.app.Dialog dialog3 = dVar.f493419e;
                if (dialog3 != null && (window4 = dialog3.getWindow()) != null) {
                    window4.clearFlags(8);
                }
                android.app.Dialog dialog4 = dVar.f493419e;
                if (dialog4 != null && (window3 = dialog4.getWindow()) != null) {
                    window3.clearFlags(131072);
                }
                android.app.Dialog dialog5 = dVar.f493419e;
                if (dialog5 != null && (window2 = dialog5.getWindow()) != null) {
                    window2.clearFlags(128);
                }
                android.app.Dialog dialog6 = dVar.f493419e;
                if (dialog6 != null && (window = dialog6.getWindow()) != null) {
                    view = window.getDecorView();
                }
                if (view != null) {
                    view.setSystemUiVisibility(0);
                }
                if (view2 != null) {
                    boolean z18 = dVar.f493424m == null;
                    android.view.ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                    dVar.f493424m = viewTreeObserver2;
                    if (z18 && viewTreeObserver2 != null) {
                        viewTreeObserver2.addOnGlobalLayoutListener(dVar);
                    }
                }
                android.view.ViewGroup viewGroup = dVar.f493430s;
                if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnPreDrawListener(new ss1.c(dVar));
                }
                android.content.Context context = dVar.f493418d;
                if (context instanceof android.app.Activity) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    if (!((android.app.Activity) context).isFinishing() && (dialog = dVar.f493419e) != null) {
                        dialog.show();
                    }
                }
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = dVar.f493426o;
                if (c2690x46972046 != null) {
                    c2690x46972046.f125976p = dVar.f493429r;
                }
            }
        }
    }
}
