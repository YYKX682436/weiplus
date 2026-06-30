package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31;

/* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI */
/* loaded from: classes15.dex */
public class ActivityC18357x320c26e1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int D = 0;
    public java.util.ArrayList A;
    public java.util.ArrayList B;
    public java.util.ArrayList C;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a f251078i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f251079m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f251080n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f251081o;

    /* renamed from: p, reason: collision with root package name */
    public qd4.r f251082p;

    /* renamed from: u, reason: collision with root package name */
    public int f251087u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f251088v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f251089w;

    /* renamed from: x, reason: collision with root package name */
    public int f251090x;

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f251092z;

    /* renamed from: d, reason: collision with root package name */
    public int f251073d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f251074e = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f251075f = 2;

    /* renamed from: g, reason: collision with root package name */
    public int f251076g = 3;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f251077h = java.util.Arrays.asList("public,private,visible,invisible".split(","));

    /* renamed from: q, reason: collision with root package name */
    public int f251083q = this.f251073d;

    /* renamed from: r, reason: collision with root package name */
    public boolean f251084r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f251085s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f251086t = false;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f251091y = new java.util.ArrayList();

    public static /* synthetic */ qd4.r T6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        qd4.r rVar = activityC18357x320c26e1.f251082p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return rVar;
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        activityC18357x320c26e1.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", activityC18357x320c26e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
        intent.putExtra("snsPostWhoCanSee", true);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b, 1024));
        int i17 = activityC18357x320c26e1.f251087u;
        if (i17 == activityC18357x320c26e1.f251075f) {
            if (activityC18357x320c26e1.f251082p.f443432t.size() > 0) {
                intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18357x320c26e1.f251082p.f443432t, ","));
            }
        } else if (i17 == activityC18357x320c26e1.f251076g && activityC18357x320c26e1.f251082p.f443433u.size() > 0) {
            intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18357x320c26e1.f251082p.f443433u, ","));
        }
        intent.putExtra("KBlockOpenImFav", true);
        j45.l.v(activityC18357x320c26e1, ".ui.contact.SelectContactUI", intent, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7529x7d0fa359);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a V6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a c22700x2b5d269a = activityC18357x320c26e1.f251078i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return c22700x2b5d269a;
    }

    public static void W6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1, int i17, java.util.ArrayList arrayList, java.lang.String str, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        activityC18357x320c26e1.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertOrRemove", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        qd4.r rVar = activityC18357x320c26e1.f251082p;
        if (rVar == null || rVar.f443427o != 1) {
            if (arrayList.contains(str)) {
                arrayList.remove(str);
                ((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n9h)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
            } else {
                arrayList.add(str);
                if (i17 == 1) {
                    ((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n9h)).setImageResource(com.p314xaae8f345.mm.R.raw.f78834xa20f9397);
                } else {
                    ((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n9h)).setImageResource(com.p314xaae8f345.mm.R.raw.f78848x228ad7e9);
                }
            }
        } else if (arrayList.contains(str)) {
            arrayList.remove(str);
            if (i17 == 1) {
                ((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n9h)).setImageResource(com.p314xaae8f345.mm.R.raw.f81058x89594171);
            } else {
                ((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n9h)).setImageResource(com.p314xaae8f345.mm.R.raw.f81059xcf3608c3);
            }
        } else {
            arrayList.add(str);
            if (i17 == 1) {
                ((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n9h)).setImageResource(com.p314xaae8f345.mm.R.raw.f81056x99940718);
            } else {
                ((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n9h)).setImageResource(com.p314xaae8f345.mm.R.raw.f81057x13b7a2ea);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertOrRemove", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public static /* synthetic */ java.util.ArrayList X6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.ArrayList arrayList = activityC18357x320c26e1.f251079m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return arrayList;
    }

    public static /* synthetic */ java.util.ArrayList Y6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1, java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1502", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        activityC18357x320c26e1.f251079m = arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1502", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return arrayList;
    }

    public static /* synthetic */ java.lang.String Z6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.lang.String m76 = activityC18357x320c26e1.m7(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return m76;
    }

    public static /* synthetic */ java.util.ArrayList a7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.ArrayList arrayList = activityC18357x320c26e1.A;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return arrayList;
    }

    public static /* synthetic */ int b7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        int i17 = activityC18357x320c26e1.f251087u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return i17;
    }

    public static /* synthetic */ int c7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$502", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        activityC18357x320c26e1.f251087u = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$502", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return i17;
    }

    public final void d7() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.ArrayList arrayList2 = this.f251079m;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            java.util.ArrayList arrayList3 = this.f251082p.f443430r;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            java.util.ArrayList arrayList4 = this.f251082p.f443431s;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.List list = this.f251091y;
        if (((java.util.ArrayList) list).size() > 0 && "visible".equals(m7(this.f251083q)) && (arrayList = this.f251082p.f443430r) != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!this.f251079m.contains(str)) {
                    arrayList5.add(str);
                }
            }
            this.f251082p.f443430r.removeAll(arrayList5);
        } else if (((java.util.ArrayList) list).size() > 0 && "invisible".equals(m7(this.f251083q))) {
            java.util.Iterator it6 = this.f251082p.f443431s.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!this.f251079m.contains(str2)) {
                    arrayList5.add(str2);
                }
            }
            this.f251082p.f443431s.removeAll(arrayList5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            i7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return dispatchKeyEvent;
    }

    public final int[] e7(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convert", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        int[] iArr = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr[i17] = ((java.lang.Integer) list.get(i17)).intValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return iArr;
    }

    public final void f7(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        c93.b bVar;
        java.util.ArrayList P1;
        java.lang.String str3 = "fillArgs";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillArgs", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.ArrayList arrayList = this.f251079m;
        java.lang.String str4 = ",";
        if (arrayList == null || arrayList.isEmpty()) {
            this.f251080n = "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String str5 = this.f251080n;
            if (str5 != null && (P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str5.split(","))) != null) {
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str6 = (java.lang.String) it.next();
                    if (!this.f251079m.contains(str6)) {
                        arrayList2.add(str6);
                    }
                }
                P1.removeAll(arrayList2);
                this.f251080n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(P1, ",");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        }
        java.lang.String str7 = this.f251080n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.List O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(str7, ",");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        c93.b a17 = c93.a.a();
        java.util.Iterator it6 = O1.iterator();
        while (true) {
            str = str3;
            if (!it6.hasNext()) {
                break;
            }
            java.lang.String str8 = (java.lang.String) it6.next();
            java.util.Iterator it7 = it6;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            try {
                jSONObject.put(str8, jSONArray);
                str2 = str4;
                try {
                    b93.b bVar2 = (b93.b) a17;
                    java.util.List j17 = bVar2.j(bVar2.e(str8));
                    if (j17 != null) {
                        java.util.Iterator it8 = j17.iterator();
                        while (it8.hasNext()) {
                            java.lang.String str9 = (java.lang.String) it8.next();
                            java.util.Iterator it9 = it8;
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put(dm.i4.f66875xa013b0d5, str9);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                            bVar = a17;
                            try {
                                java.lang.String e17 = c01.a2.e(str9);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                                jSONObject2.put("displayName", e17);
                                jSONObject2.put("avatar", g7(str9));
                                jSONArray.put(jSONObject2);
                                it8 = it9;
                                a17 = bVar;
                            } catch (org.json.JSONException e18) {
                                e = e18;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsLabelUI", e, "", new java.lang.Object[0]);
                                str3 = str;
                                it6 = it7;
                                str4 = str2;
                                a17 = bVar;
                            }
                        }
                    }
                    bVar = a17;
                } catch (org.json.JSONException e19) {
                    e = e19;
                    bVar = a17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsLabelUI", e, "", new java.lang.Object[0]);
                    str3 = str;
                    it6 = it7;
                    str4 = str2;
                    a17 = bVar;
                }
            } catch (org.json.JSONException e27) {
                e = e27;
                str2 = str4;
            }
            str3 = str;
            it6 = it7;
            str4 = str2;
            a17 = bVar;
        }
        java.lang.String jSONObject3 = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        intent.putExtra("Klabel_name_list", jSONObject3);
        java.lang.String str10 = this.f251081o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseUserNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.List<java.lang.String> O12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(str10, str4);
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        if (O12 != null) {
            for (java.lang.String str11 : O12) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put(dm.i4.f66875xa013b0d5, str11);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    java.lang.String e28 = c01.a2.e(str11);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    jSONObject4.put("displayName", e28);
                    jSONObject4.put("avatar", g7(str11));
                    jSONArray2.put(jSONObject4);
                } catch (org.json.JSONException e29) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsLabelUI", e29, "", new java.lang.Object[0]);
                }
            }
        }
        java.lang.String jSONArray3 = jSONArray2.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseUserNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        intent.putExtra("Kother_user_name_list", jSONArray3);
        intent.putExtra("k_select_group", m7(this.f251082p.f443428p));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public final java.lang.String g7(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatar", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str);
        java.lang.String d17 = n07 != null ? n07.d() : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatar", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return d17;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cs8;
    }

    public final int h7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(335874, 0)).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return intValue;
    }

    public final void i7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goBack", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSelectChange", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        qd4.r rVar = this.f251082p;
        int i17 = rVar.f443428p;
        boolean z17 = i17 == this.f251083q ? !((i17 != this.f251075f || rVar.f443430r.size() == 0 || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f251082p.f443430r, ",").equals(this.f251080n) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f251082p.f443432t, ",").equals(this.f251081o))) && (i17 != this.f251076g || this.f251082p.f443431s.size() == 0 || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f251082p.f443431s, ",").equals(this.f251080n) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f251082p.f443433u, ",").equals(this.f251081o)))) : !((i17 != this.f251075f || (rVar.f443430r.size() == 0 && this.f251082p.f443432t.size() == 0)) && !((i17 == this.f251076g && (this.f251082p.f443431s.size() != 0 || this.f251082p.f443433u.size() != 0)) || i17 == this.f251074e || i17 == this.f251073d));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSelectChange", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (z17) {
            db5.e1.K(this, true, getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbg), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbe), new qd4.l(this), new qd4.m(this));
        } else {
            j7();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goBack", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        boolean booleanExtra = getIntent().getBooleanExtra("KLabel_is_filter_private", false);
        this.f251078i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a) findViewById(com.p314xaae8f345.mm.R.id.n9k);
        java.util.ArrayList arrayList = (java.util.ArrayList) ((b93.b) c93.a.a()).d();
        this.f251079m = arrayList;
        qd4.r rVar = this.f251082p;
        rVar.f443429q = booleanExtra;
        rVar.h(arrayList);
        d7();
        android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, -2);
        layoutParams.height = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561402hi);
        android.view.View view = new android.view.View(this);
        view.setLayoutParams(layoutParams);
        this.f251078i.addHeaderView(view);
        this.f251078i.setAdapter(this.f251082p);
        this.f251078i.setOnGroupClickListener(new qd4.f(this));
        this.f251078i.setOnChildClickListener(new qd4.g(this));
        mo54448x9c8c0d33(new qd4.h(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbc), new qd4.i(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public final void j7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goBackWithStates", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ktag_range_index", this.f251083q);
        f7(intent);
        setResult(-1, intent);
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goBackWithStates", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public final void k7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleTransformError", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11455, "", "", java.lang.Integer.valueOf(this.f251090x), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(335874, 0)).intValue() + 1;
        gm0.j1.i();
        gm0.j1.u().c().w(335874, java.lang.Integer.valueOf(intValue));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        this.A = null;
        this.f251086t = false;
        this.f251085s = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f251088v;
        if (u3Var != null && u3Var.isShowing()) {
            this.f251088v.dismiss();
        }
        if (this.f251084r) {
            this.f251084r = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleTransformError", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        } else {
            db5.e1.m(this, h7() > 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f574750jc2 : com.p314xaae8f345.mm.R.C30867xcad56011.f574751jc3, com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1, new qd4.c(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleTransformError", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        }
    }

    public final void l7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveAndExit", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        android.content.Intent intent = new android.content.Intent();
        qd4.r rVar = this.f251082p;
        int i17 = rVar.f443428p;
        if (i17 == this.f251075f) {
            this.f251080n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(rVar.f443430r, ",");
            this.f251081o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f251082p.f443432t, ",");
            f7(intent);
        } else if (i17 == this.f251076g) {
            this.f251080n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(rVar.f443431s, ",");
            this.f251081o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f251082p.f443433u, ",");
            f7(intent);
        }
        intent.putExtra("k_select_group", m7(this.f251082p.f443428p));
        intent.putExtra("k_select_index", this.f251082p.f443428p);
        intent.putExtra("Ktag_range_index", this.f251082p.f443428p);
        setResult(-1, intent);
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveAndExit", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public final java.lang.String m7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveGetGroupItem", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.List list = this.f251091y;
        if (i17 >= ((java.util.ArrayList) list).size() || i17 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveGetGroupItem", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            return "";
        }
        java.lang.String str = (java.lang.String) ((java.util.ArrayList) list).get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveGetGroupItem", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return str;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 4003) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "the Activity completed");
            java.lang.String stringExtra = intent.getStringExtra("Select_Contacts_To_Create_New_Label");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Contact", stringExtra);
                j45.l.n(mo55332x76847179(), "label", ".ui.ContactLabelEditUI", intent2, 4002);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
            this.f251081o = new java.lang.String(stringExtra2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", stringExtra2 + "");
            int i19 = this.f251087u;
            if (i19 == this.f251075f) {
                this.f251082p.f443432t.clear();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    this.f251082p.f443432t.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(",")));
                    this.f251082p.f443428p = this.f251087u;
                }
            } else if (i19 == this.f251076g) {
                this.f251082p.f443433u.clear();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    this.f251082p.f443433u.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(",")));
                    this.f251082p.f443428p = this.f251087u;
                }
            }
            this.f251082p.notifyDataSetChanged();
            this.f251078i.expandGroup(this.f251087u);
        } else if (i18 == -1 && i17 == 4001) {
            java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", stringExtra3 + "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("Select_Contact", stringExtra3);
                j45.l.n(this, "label", ".ui.ContactLabelEditUI", intent3, 4002);
            }
        } else if (i18 == 0 && i17 == 4002 && intent != null) {
            java.lang.String stringExtra4 = intent.getStringExtra("k_sns_label_add_label");
            this.f251089w = intent.getStringExtra("k_sns_label_add_label");
            this.f251078i.postDelayed(new qd4.k(this, stringExtra4), 600L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574782jg0);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(292, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(kd1.c.f72435x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(638, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de, this);
        this.f251082p = new qd4.r(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowLabelMoreIcon", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowLabelMoreIcon", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        qd4.r rVar = this.f251082p;
        qd4.d dVar = new qd4.d(this);
        rVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        rVar.f443434v = dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        android.content.Intent intent = getIntent();
        if (intent == null) {
            this.f251083q = this.f251073d;
            this.f251082p.f443427o = 0;
            this.f251080n = null;
            this.f251081o = null;
        } else {
            if (intent.hasExtra("k_title")) {
                mo54450xbf7c1df6(intent.getStringExtra("k_title"));
            }
            this.f251083q = intent.getIntExtra("KLabel_range_index", this.f251073d);
            this.f251082p.f443427o = intent.getIntExtra("k_sns_label_ui_style", 0);
            this.f251080n = intent.getStringExtra("Klabel_name_list");
            this.f251081o = intent.getStringExtra("Kother_user_name_list");
            if (!android.text.TextUtils.isEmpty(intent.getStringExtra("k_sns_label_ui_title"))) {
                mo54450xbf7c1df6(intent.getStringExtra("k_sns_label_ui_title"));
            }
        }
        qd4.r rVar2 = this.f251082p;
        rVar2.f443428p = this.f251083q;
        if (rVar2.f443427o == 1) {
            findViewById(com.p314xaae8f345.mm.R.id.n9l).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3);
        }
        int i17 = this.f251083q;
        if (i17 == this.f251075f) {
            if (!android.text.TextUtils.isEmpty(this.f251080n)) {
                this.f251082p.f443430r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f251080n.split(","));
            }
            if (!android.text.TextUtils.isEmpty(this.f251081o)) {
                this.f251082p.f443432t = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f251081o.split(","));
            }
        } else if (i17 == this.f251076g) {
            if (!android.text.TextUtils.isEmpty(this.f251080n)) {
                this.f251082p.f443431s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f251080n.split(","));
            }
            if (!android.text.TextUtils.isEmpty(this.f251081o)) {
                this.f251082p.f443433u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f251081o.split(","));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        gm0.j1.i();
        if (((java.lang.Boolean) gm0.j1.u().c().l(335873, java.lang.Boolean.TRUE)).booleanValue()) {
            this.f251085s = true;
            this.f251086t = true;
            if (h7() >= 1) {
                this.f251084r = true;
            }
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3(1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseArgs", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        android.content.Intent intent2 = getIntent();
        if (intent2 != null) {
            java.lang.String stringExtra = intent2.getStringExtra("k_select_group");
            boolean booleanExtra = intent2.getBooleanExtra("k_show_public", true);
            boolean booleanExtra2 = intent2.getBooleanExtra("k_show_private", true);
            boolean booleanExtra3 = intent2.getBooleanExtra("k_show_include", true);
            boolean booleanExtra4 = intent2.getBooleanExtra("k_show_exclude", true);
            int[] iArr = {com.p314xaae8f345.mm.R.C30867xcad56011.jbq, com.p314xaae8f345.mm.R.C30867xcad56011.jbo, com.p314xaae8f345.mm.R.C30867xcad56011.jbj, com.p314xaae8f345.mm.R.C30867xcad56011.jba};
            java.util.List list = this.f251091y;
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            arrayList.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            str = "onCreate";
            java.util.List list2 = this.f251077h;
            if (booleanExtra) {
                str2 = ",";
                arrayList2.add(java.lang.Integer.valueOf(iArr[0]));
                arrayList3.add(java.lang.Integer.valueOf(iArr[0]));
                arrayList.add((java.lang.String) list2.get(0));
            } else {
                str2 = ",";
            }
            if (booleanExtra2) {
                arrayList2.add(java.lang.Integer.valueOf(iArr[1]));
                arrayList3.add(java.lang.Integer.valueOf(iArr[1]));
                arrayList.add((java.lang.String) list2.get(1));
            }
            if (booleanExtra3) {
                arrayList2.add(java.lang.Integer.valueOf(iArr[2]));
                arrayList3.add(java.lang.Integer.valueOf(iArr[2]));
                arrayList.add((java.lang.String) list2.get(2));
            }
            if (booleanExtra4) {
                arrayList2.add(java.lang.Integer.valueOf(iArr[3]));
                arrayList3.add(java.lang.Integer.valueOf(iArr[3]));
                arrayList.add((java.lang.String) list2.get(3));
            }
            if (arrayList.size() == 0) {
                finish();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseArgs", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            }
            this.f251073d = arrayList.indexOf("public");
            this.f251074e = arrayList.indexOf("private");
            this.f251075f = arrayList.indexOf("visible");
            this.f251076g = arrayList.indexOf("invisible");
            qd4.r rVar3 = this.f251082p;
            if (rVar3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRealHeaders", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                rVar3.f443423k = list;
                rVar3.f443417e = arrayList.indexOf("public");
                rVar3.f443418f = arrayList.indexOf("private");
                rVar3.f443419g = arrayList.indexOf("visible");
                rVar3.f443420h = arrayList.indexOf("invisible");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRealHeaders", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                qd4.r rVar4 = this.f251082p;
                int size = arrayList2.size();
                rVar4.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGROUP_COUNT", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                rVar4.f443416d = size;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGROUP_COUNT", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                qd4.r rVar5 = this.f251082p;
                int[] e76 = e7(arrayList2);
                rVar5.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHeaderNameIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                rVar5.f443421i = e76;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHeaderNameIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                qd4.r rVar6 = this.f251082p;
                int[] e77 = e7(arrayList3);
                rVar6.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHeaderSubIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                rVar6.f443422j = e77;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHeaderSubIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                if (!android.text.TextUtils.isEmpty(stringExtra)) {
                    this.f251082p.f443428p = arrayList.indexOf(stringExtra);
                    if (stringExtra.equals("visible")) {
                        if (android.text.TextUtils.isEmpty(this.f251080n)) {
                            str3 = str2;
                        } else {
                            str3 = str2;
                            this.f251082p.f443430r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f251080n.split(str3));
                        }
                        if (!android.text.TextUtils.isEmpty(this.f251081o)) {
                            this.f251082p.f443432t = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f251081o.split(str3));
                        }
                        this.f251078i.expandGroup(arrayList.indexOf(stringExtra));
                    } else {
                        java.lang.String str4 = str2;
                        if (stringExtra.equals("invisible")) {
                            if (!android.text.TextUtils.isEmpty(this.f251080n)) {
                                this.f251082p.f443431s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f251080n.split(str4));
                            }
                            if (!android.text.TextUtils.isEmpty(this.f251081o)) {
                                this.f251082p.f443433u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f251081o.split(str4));
                            }
                            this.f251078i.expandGroup(arrayList.indexOf(stringExtra));
                        }
                    }
                }
            }
        } else {
            str = "onCreate";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseArgs", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        gm0.j1.i();
        gm0.j1.n().f354821b.q(292, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(kd1.c.f72435x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(638, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de, this);
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a c22700x2b5d269a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (this.f251082p != null && this.f251089w == null && (c22700x2b5d269a = this.f251078i) != null) {
            c22700x2b5d269a.postDelayed(new qd4.a(this), 600L);
        }
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0246, code lost:
    
        if (r13 != false) goto L75;
     */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r12, int r13, java.lang.String r14, com.p314xaae8f345.mm.p944x882e457a.m1 r15) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
