package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 */
/* loaded from: classes8.dex */
public class C16009xd65d32cb extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f222718p;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f222719d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 f222720e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f222721f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f222722g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f222723h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem f222724i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f222725m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f222726n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f222727o;

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$3, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6004x2d921b79> {
        public AnonymousClass3(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = 1046892393;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6004x2d921b79 c6004x2d921b79) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(c6004x2d921b79.f136298g.f90139a);
                if (jSONObject.has("isShowTab")) {
                    int optInt = jSONObject.optInt("isShowTab", -1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWidget2", "isShowTab:%d", java.lang.Integer.valueOf(optInt));
                    ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.u0(this, optInt));
                }
                if (jSONObject.has("isSwitchEnable")) {
                    int optInt2 = jSONObject.optInt("isSwitchEnable", -1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWidget2", "isSwitchEnable:%d", java.lang.Integer.valueOf(optInt2));
                    if (optInt2 == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.this.m64791xf176594a(false);
                    } else if (optInt2 == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.this.m64791xf176594a(true);
                    }
                }
                if (jSONObject.has("setRedDot")) {
                    org.json.JSONArray jSONArray = jSONObject.getJSONArray("setRedDot");
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                        java.lang.String optString = optJSONObject.optString("tabKey");
                        int optInt3 = optJSONObject.optInt("redDotNum");
                        if (optJSONObject.optBoolean("isShow")) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 d1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.this.f222720e;
                            if (d1Var != null) {
                                d1Var.j(optString, optInt3, true);
                            }
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 d1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.this.f222720e;
                            if (d1Var2 != null) {
                                d1Var2.j(optString, 0, false);
                            }
                        }
                    }
                }
                if (jSONObject.has("setTabConfigure")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.this.m64789x69c40eb0(jSONObject.optString("setTabConfigure"));
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameTabWidget2", e17.getMessage());
            }
            return false;
        }
    }

    @mk0.a
    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$a */
    /* loaded from: classes8.dex */
    public static class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        private a() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
            if (c10756x2a5d7b2d != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().K1(c10756x2a5d7b2d.f149939d);
            }
        }
    }

    @mk0.a
    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$b */
    /* loaded from: classes4.dex */
    public static class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
            d43.b.f307944d.a(c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : "");
        }
    }

    @mk0.a
    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$c */
    /* loaded from: classes4.dex */
    public static class c implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        private c() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            d43.b.f307944d.b();
        }
    }

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.f220952a;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.f220952a + "PERMANENT/");
        sb6.append("tabnav/");
        f222718p = sb6.toString();
    }

    public C16009xd65d32cb(android.content.Context context) {
        super(context);
        this.f222721f = true;
        this.f222722g = false;
        this.f222723h = true;
        this.f222725m = false;
        this.f222726n = new java.util.ArrayList();
        this.f222727o = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.AnonymousClass3(com.p314xaae8f345.mm.app.a0.f134821d);
        c(context);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb c16009xd65d32cb) {
        c16009xd65d32cb.removeAllViews();
        java.util.ArrayList arrayList = (java.util.ArrayList) c16009xd65d32cb.f222726n;
        arrayList.clear();
        int count = c16009xd65d32cb.f222720e.getCount();
        if (count == 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.B(c16009xd65d32cb.f222719d) / count, -1);
        for (int i17 = 0; i17 < count; i17++) {
            android.view.View view = c16009xd65d32cb.f222720e.getView(i17, null, c16009xd65d32cb);
            arrayList.add(view);
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.y0(c16009xd65d32cb));
            view.setLayoutParams(layoutParams);
            c16009xd65d32cb.addView(view);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWidget2", "bindLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 d1Var = c16009xd65d32cb.f222720e;
        d1Var.h(d1Var.f222792i, d1Var.f222793m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.app.Activity r23, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 r24, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem r25, m53.e1 r26, java.util.HashMap r27, android.content.Intent r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.d(android.app.Activity, com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2, com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItem, m53.e1, java.util.HashMap, android.content.Intent, boolean):void");
    }

    /* renamed from: getTopChatRoomName */
    private java.lang.String m64786x1d0b393d() {
        java.lang.String stringExtra = this.f222719d.getIntent().getStringExtra("game_msg_top_chatroom_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return stringExtra == null ? "" : stringExtra;
    }

    /* renamed from: setAdapter */
    private void m64787x6cab2c8d(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 d1Var) {
        this.f222720e = d1Var;
        d1Var.registerDataSetObserver(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.v0(this));
        d1Var.notifyDataSetChanged();
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65, java.lang.String str) {
        int i17;
        boolean z17;
        if (c16008xdb77bd65 == null) {
            return;
        }
        java.util.Iterator it = c16008xdb77bd65.f222684d.values().iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) it.next();
            if (tabItem.f222699q == 1 && tabItem.E) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(m64786x1d0b393d()), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.b.class, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1(this, getContext());
        m64787x6cab2c8d(d1Var);
        java.lang.String stringExtra = this.f222719d.getIntent().getStringExtra("game_red_dot_tab_key");
        d1Var.f222788e = c16008xdb77bd65;
        d1Var.f222789f = str;
        d1Var.f222790g = stringExtra;
        d1Var.notifyDataSetChanged();
        int z18 = r53.f.z(c16008xdb77bd65.f222686f);
        int z19 = r53.f.z(c16008xdb77bd65.f222687g);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            if (z19 != 0) {
                setBackgroundColor(z19);
            }
        } else if (z18 != 0) {
            setBackgroundColor(z18);
        }
        if (this.f222719d.getIntent().getBooleanExtra("game_tab_exposure", true)) {
            this.f222719d.getIntent().putExtra("game_tab_exposure", false);
            java.lang.String defaultTab = this.f222719d.getIntent().getStringExtra("game_tab_key");
            long intExtra = this.f222719d.getIntent().getIntExtra("game_report_from_scene", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultTab, "defaultTab");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d c6633xea2e527d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d();
            c6633xea2e527d.f139873d = 1L;
            c6633xea2e527d.f139874e = 101L;
            c6633xea2e527d.f139875f = 0L;
            c6633xea2e527d.f139876g = 1L;
            c6633xea2e527d.f139877h = intExtra;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("default_tab", defaultTab);
            c6633xea2e527d.p(java.net.URLEncoder.encode(jSONObject.toString()));
            c6633xea2e527d.k();
            java.util.Iterator it6 = c16008xdb77bd65.f222684d.entrySet().iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) ((java.util.Map.Entry) it6.next()).getValue();
                if (tabItem2 != null) {
                    i17++;
                    if (tabItem2.f222689d.equals(c16008xdb77bd65.b())) {
                        this.f222724i = tabItem2;
                        this.f222725m = true;
                    } else {
                        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.e.f149727a.h(i17, 0, tabItem2.f222689d, 0, intExtra);
                    }
                }
            }
        }
    }

    public final void c(android.content.Context context) {
        this.f222719d = (android.app.Activity) context;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560721sc);
        setOrientation(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 d1Var = this.f222720e;
        if (d1Var != null) {
            d1Var.f222790g = str2;
            for (java.util.Map.Entry entry : ((java.util.HashMap) d1Var.f222791h).entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1) entry.getValue();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) d1Var.f222788e.f222684d.get(str3);
                if (c1Var != null && tabItem != null) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    d1Var.k(c1Var, tabItem, (str == null ? "" : str).equalsIgnoreCase(str3), d1Var.f222790g);
                }
            }
        }
    }

    public void f(int i17, boolean z17) {
        if (this.f222725m && this.f222724i != null) {
            this.f222725m = false;
            int intExtra = this.f222719d.getIntent().getIntExtra("game_report_from_scene", 0);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.d dVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.e.f149727a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = this.f222724i;
            dVar.h(tabItem.A, i17, tabItem.f222689d, 6, intExtra);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 d1Var = this.f222720e;
        if (d1Var != null) {
            d1Var.g(z17);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = this.f222724i;
        if (tabItem != null && tabItem.E) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(m64786x1d0b393d()), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.b.class, null);
        }
        this.f222727o.mo48813x58998cd();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, null, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.c.class, null);
        this.f222727o.mo48814x2efc64();
    }

    /* renamed from: setChatMsgUnreadRedDot */
    public void m64788xad4b476e(boolean z17) {
        this.f222720e.g(z17);
    }

    /* renamed from: setGameTabStyle */
    public void m64789x69c40eb0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 d1Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("TabList");
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                if (optJSONObject != null && (d1Var = this.f222720e) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1.a(d1Var, optJSONObject);
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameTabWidget2", e17.getMessage());
        }
    }

    /* renamed from: setPageChanging */
    public void m64790x8163599e(boolean z17) {
        this.f222722g = z17;
    }

    /* renamed from: setTabSwitchEnable */
    public void m64791xf176594a(boolean z17) {
        this.f222721f = z17;
    }

    public C16009xd65d32cb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222721f = true;
        this.f222722g = false;
        this.f222723h = true;
        this.f222725m = false;
        this.f222726n = new java.util.ArrayList();
        this.f222727o = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.AnonymousClass3(com.p314xaae8f345.mm.app.a0.f134821d);
        c(context);
    }

    public C16009xd65d32cb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f222721f = true;
        this.f222722g = false;
        this.f222723h = true;
        this.f222725m = false;
        this.f222726n = new java.util.ArrayList();
        this.f222727o = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.AnonymousClass3(com.p314xaae8f345.mm.app.a0.f134821d);
        c(context);
    }
}
