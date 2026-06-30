package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI */
/* loaded from: classes15.dex */
public class ActivityC18072xf2d2bc10 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int C = 0;
    public java.util.ArrayList A;
    public java.util.ArrayList B;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a f248752d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f248753e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f248754f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f248755g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f248756h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f248757i;

    /* renamed from: m, reason: collision with root package name */
    public ae4.a f248758m;

    /* renamed from: n, reason: collision with root package name */
    public int f248759n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f248760o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f248761p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f248762q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f248763r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f248764s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f248765t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f248766u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.ArrayList f248767v;

    /* renamed from: w, reason: collision with root package name */
    public int f248768w;

    /* renamed from: x, reason: collision with root package name */
    public int f248769x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f248770y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f248771z;

    public static /* synthetic */ ae4.a T6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        ae4.a aVar = activityC18072xf2d2bc10.f248758m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return aVar;
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10, int i17, java.util.ArrayList arrayList, java.lang.String str, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        activityC18072xf2d2bc10.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertOrRemove", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        ae4.a aVar = activityC18072xf2d2bc10.f248758m;
        if (aVar == null || aVar.f85892g != 1) {
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertOrRemove", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public static /* synthetic */ java.util.ArrayList V6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        java.util.ArrayList arrayList = activityC18072xf2d2bc10.f248753e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return arrayList;
    }

    public static /* synthetic */ java.util.ArrayList W6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10, java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1502", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        activityC18072xf2d2bc10.f248753e = arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1502", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return arrayList;
    }

    public static /* synthetic */ java.util.ArrayList X6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        java.util.ArrayList arrayList = activityC18072xf2d2bc10.f248771z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return arrayList;
    }

    public static /* synthetic */ int Y6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        int i17 = activityC18072xf2d2bc10.f248764s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return i17;
    }

    public static /* synthetic */ int Z6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$402", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        activityC18072xf2d2bc10.f248764s = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$402", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return i17;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a a7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a c22700x2b5d269a = activityC18072xf2d2bc10.f248752d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return c22700x2b5d269a;
    }

    public final void b7() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        java.util.ArrayList arrayList2 = this.f248753e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            java.util.ArrayList arrayList3 = this.f248758m.f85896k;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            java.util.ArrayList arrayList4 = this.f248758m.f85897l;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        int i17 = this.f248759n;
        if (i17 == 2 && (arrayList = this.f248758m.f85896k) != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!this.f248753e.contains(str)) {
                    arrayList5.add(str);
                }
            }
            this.f248758m.f85896k.removeAll(arrayList5);
        } else if (i17 == 3) {
            java.util.Iterator it6 = this.f248758m.f85897l.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!this.f248753e.contains(str2)) {
                    arrayList5.add(str2);
                }
            }
            this.f248758m.f85897l.removeAll(arrayList5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public final void c7() {
        java.util.ArrayList P1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        java.util.ArrayList arrayList = this.f248753e;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f248754f = "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String str = this.f248754f;
        if (str != null && (P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(","))) != null) {
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (!this.f248753e.contains(str2)) {
                    arrayList2.add(str2);
                }
            }
            P1.removeAll(arrayList2);
            this.f248754f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(P1, ",");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public final int d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(335874, 0)).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return intValue;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            e7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return dispatchKeyEvent;
    }

    public final void e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goBack", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSelectChange", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        ae4.a aVar = this.f248758m;
        int i17 = aVar.f85893h;
        boolean z17 = true;
        if (i17 == this.f248759n ? (i17 != 2 || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(aVar.f85896k, ",").equals(this.f248754f) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248758m.f85898m, ",").equals(this.f248755g) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248758m.f85900o, ",").equals(this.f248756h))) && (i17 != 3 || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248758m.f85897l, ",").equals(this.f248754f) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248758m.f85899n, ",").equals(this.f248755g) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248758m.f85901p, ",").equals(this.f248756h))) : (i17 != 2 || (aVar.f85896k.size() == 0 && this.f248758m.f85898m.size() == 0)) && ((i17 != 3 || (this.f248758m.f85897l.size() == 0 && this.f248758m.f85899n.size() == 0)) && i17 != 1 && i17 != 0)) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSelectChange", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        if (z17) {
            db5.e1.K(this, true, getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbg), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbe), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vk(this), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wk(this));
        } else {
            f7();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goBack", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public final void f7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goBackWithStates", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ktag_range_index", this.f248759n);
        int i17 = this.f248759n;
        if (i17 == 2 || i17 == 3) {
            c7();
            intent.putExtra("Klabel_name_list", this.f248754f);
            intent.putExtra("Kother_user_name_list", this.f248755g);
            intent.putExtra("Kchat_room_name_list", this.f248756h);
        }
        setResult(-1, intent);
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goBackWithStates", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public final void g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleTransformError", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11455, "", "", java.lang.Integer.valueOf(this.f248768w), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(335874, 0)).intValue() + 1;
        gm0.j1.i();
        gm0.j1.u().c().w(335874, java.lang.Integer.valueOf(intValue));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        this.f248771z = null;
        this.f248763r = false;
        this.f248762q = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f248765t;
        if (u3Var != null && u3Var.isShowing()) {
            this.f248765t.dismiss();
        }
        if (this.f248761p) {
            this.f248761p = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleTransformError", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        } else {
            db5.e1.m(this, d7() > 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f574750jc2 : com.p314xaae8f345.mm.R.C30867xcad56011.f574751jc3, com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.mk(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleTransformError", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cs8;
    }

    public final void h7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveAndExit", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        android.content.Intent intent = new android.content.Intent();
        ae4.a aVar = this.f248758m;
        int i17 = aVar.f85893h;
        if (i17 == 2) {
            this.f248754f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(aVar.f85896k, ",");
            this.f248755g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248758m.f85898m, ",");
            this.f248756h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248758m.f85900o, ",");
            this.f248757i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248758m.f85902q, ",");
            c7();
            intent.putExtra("Klabel_name_list", this.f248754f);
            intent.putExtra("Kother_user_name_list", this.f248755g);
            intent.putExtra("Kchat_room_name_list", this.f248756h);
            intent.putExtra("KNew_label_name_list", this.f248757i);
        } else if (i17 == 3) {
            this.f248754f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(aVar.f85897l, ",");
            this.f248755g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248758m.f85899n, ",");
            this.f248756h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248758m.f85901p, ",");
            this.f248757i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248758m.f85903r, ",");
            c7();
            intent.putExtra("Klabel_name_list", this.f248754f);
            intent.putExtra("Kother_user_name_list", this.f248755g);
            intent.putExtra("Kchat_room_name_list", this.f248756h);
            intent.putExtra("KNew_label_name_list", this.f248757i);
        }
        intent.putExtra("Ktag_range_index", this.f248758m.f85893h);
        setResult(-1, intent);
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveAndExit", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        boolean booleanExtra = getIntent().getBooleanExtra("KLabel_is_filter_private", false);
        this.f248752d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a) findViewById(com.p314xaae8f345.mm.R.id.n9k);
        java.util.ArrayList arrayList = (java.util.ArrayList) ((b93.b) c93.a.a()).d();
        this.f248753e = arrayList;
        ae4.a aVar = this.f248758m;
        aVar.f85895j = booleanExtra;
        aVar.h(arrayList);
        b7();
        android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, -2);
        layoutParams.height = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561402hi);
        android.view.View view = new android.view.View(this);
        view.setLayoutParams(layoutParams);
        this.f248752d.addHeaderView(view);
        this.f248752d.setAdapter(this.f248758m);
        int i17 = this.f248758m.f85893h;
        if (i17 == 2) {
            this.f248752d.expandGroup(2);
        } else if (i17 == 3) {
            this.f248752d.expandGroup(3);
        }
        this.f248752d.setOnGroupClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pk(this));
        this.f248752d.setOnChildClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qk(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.rk(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbc), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sk(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "requestCode:%d resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1 && i17 == 4003) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "the Activity completed");
            java.lang.String stringExtra = intent.getStringExtra("Select_Contacts_To_Create_New_Label");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Contact", stringExtra);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "startActivity ContactEditLabel ");
                    j45.l.n(mo55332x76847179(), "label", ".ui.ContactEditLabel", intent2, 4002);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "startActivity ContactLabelEditUI ");
                    j45.l.n(mo55332x76847179(), "label", ".ui.ContactLabelEditUI", intent2, 4002);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", stringExtra2 + "");
            int i19 = this.f248764s;
            if (i19 == 2) {
                this.f248758m.f85898m.clear();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    this.f248758m.f85898m.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(",")));
                    this.f248758m.f85893h = this.f248764s;
                }
            } else if (i19 == 3) {
                this.f248758m.f85899n.clear();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    this.f248758m.f85899n.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(",")));
                    this.f248758m.f85893h = this.f248764s;
                }
            }
            this.f248758m.notifyDataSetChanged();
            this.f248752d.expandGroup(this.f248764s);
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsLabelUI";
        } else {
            if (i18 == -1 && i17 == 4001) {
                java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", stringExtra3 + "");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("Select_Contact", stringExtra3);
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "startActivity ContactEditLabel ");
                        j45.l.n(mo55332x76847179(), "label", ".ui.ContactEditLabel", intent3, 4002);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "startActivity ContactLabelEditUI ");
                        j45.l.n(mo55332x76847179(), "label", ".ui.ContactLabelEditUI", intent3, 4002);
                    }
                }
            } else if (i18 == 0 && i17 == 4002 && intent != null) {
                java.lang.String stringExtra4 = intent.getStringExtra("k_sns_label_add_label");
                this.f248766u = intent.getStringExtra("k_sns_label_add_label");
                this.f248767v = intent.getStringArrayListExtra("k_sns_label_add_label_usernames");
                this.f248752d.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uk(this, stringExtra4), 600L);
            } else if (i18 == -1 && i17 == 4004) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "the Activity completed");
                java.lang.String stringExtra5 = intent.getStringExtra("select_chatrooms");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", stringExtra5 + "");
                int i27 = this.f248764s;
                if (i27 == 2) {
                    this.f248758m.f85900o.clear();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra5)) {
                        this.f248758m.f85900o.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra5.split(",")));
                        this.f248758m.f85893h = this.f248764s;
                    }
                } else if (i27 == 3) {
                    this.f248758m.f85901p.clear();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra5)) {
                        this.f248758m.f85901p.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra5.split(",")));
                        this.f248758m.f85893h = this.f248764s;
                    }
                }
                this.f248758m.notifyDataSetChanged();
                this.f248752d.expandGroup(this.f248764s);
            }
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsLabelUI";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "onCreate");
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
        ae4.a aVar = new ae4.a(this);
        this.f248758m = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nk nkVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nk(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        aVar.f85904s = nkVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        android.content.Intent intent = getIntent();
        if (intent == null) {
            this.f248759n = 0;
            this.f248758m.f85892g = 0;
            this.f248754f = null;
            this.f248755g = null;
            this.f248756h = null;
        } else {
            this.f248760o = intent.getBooleanExtra("Kis_from_text_status", false);
            this.f248759n = intent.getIntExtra("KLabel_range_index", 0);
            this.f248758m.f85892g = intent.getIntExtra("k_sns_label_ui_style", 0);
            this.f248754f = intent.getStringExtra("Klabel_name_list");
            this.f248755g = intent.getStringExtra("Kother_user_name_list");
            this.f248756h = intent.getStringExtra("Kchat_room_name_list");
            this.f248769x = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
            if (!android.text.TextUtils.isEmpty(intent.getStringExtra("k_sns_label_ui_title"))) {
                mo54450xbf7c1df6(intent.getStringExtra("k_sns_label_ui_title"));
            }
        }
        ae4.a aVar2 = this.f248758m;
        aVar2.f85893h = this.f248759n;
        aVar2.f85894i = this.f248760o;
        if (aVar2.f85892g == 1) {
            findViewById(com.p314xaae8f345.mm.R.id.n9l).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3);
        }
        int i17 = this.f248759n;
        if (i17 == 2) {
            if (!android.text.TextUtils.isEmpty(this.f248754f)) {
                this.f248758m.f85896k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f248754f.split(","));
            }
            if (!android.text.TextUtils.isEmpty(this.f248755g)) {
                this.f248758m.f85898m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f248755g.split(","));
            }
            java.lang.String str = this.f248756h;
            if (str != null && !str.isEmpty()) {
                this.f248758m.f85900o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f248756h.split(","));
            }
        } else if (i17 == 3) {
            if (!android.text.TextUtils.isEmpty(this.f248754f)) {
                this.f248758m.f85897l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f248754f.split(","));
            }
            if (!android.text.TextUtils.isEmpty(this.f248755g)) {
                this.f248758m.f85899n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f248755g.split(","));
            }
            java.lang.String str2 = this.f248756h;
            if (str2 != null && !str2.isEmpty()) {
                this.f248758m.f85901p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f248756h.split(","));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        gm0.j1.i();
        if (((java.lang.Boolean) gm0.j1.u().c().l(335873, java.lang.Boolean.TRUE)).booleanValue()) {
            this.f248762q = true;
            this.f248763r = true;
            if (d7() >= 1) {
                this.f248761p = true;
            }
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3(1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        gm0.j1.i();
        gm0.j1.n().f354821b.q(292, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(kd1.c.f72435x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(638, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de, this);
        super.onDestroy();
        dx1.g.f326022a.j("SnsPublishProcess", "privacyPageStaytime_", java.lang.Long.valueOf(mo78509x4b0ac5a2()), bx1.u.f117843e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a c22700x2b5d269a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "onResume");
        if (this.f248758m != null && this.f248766u == null && (c22700x2b5d269a = this.f248752d) != null) {
            c22700x2b5d269a.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kk(this), 600L);
        }
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0246, code lost:
    
        if (r13 != false) goto L80;
     */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r12, int r13, java.lang.String r14, com.p314xaae8f345.mm.p944x882e457a.m1 r15) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
