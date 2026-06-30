package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b;

/* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI */
/* loaded from: classes11.dex */
public abstract class AbstractActivityC18396x51e3f06c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int D = 0;
    public zd4.m A;
    public java.util.ArrayList B;
    public int C;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a f252207e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f252208f;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk f252216q;

    /* renamed from: r, reason: collision with root package name */
    public zd4.o f252217r;

    /* renamed from: s, reason: collision with root package name */
    public int f252218s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f252219t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f252220u;

    /* renamed from: v, reason: collision with root package name */
    public int f252221v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f252222w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f252223x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f252224y;

    /* renamed from: z, reason: collision with root package name */
    public zd4.p f252225z;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f252206d = ",";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f252209g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f252210h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f252211i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f252212m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f252213n = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f252214o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f252215p = false;

    public AbstractActivityC18396x51e3f06c() {
        b7();
        this.f252218s = 0;
        this.f252219t = false;
        this.f252220u = false;
    }

    public static /* synthetic */ int T6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c abstractActivityC18396x51e3f06c) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        int i17 = abstractActivityC18396x51e3f06c.f252221v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return i17;
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c abstractActivityC18396x51e3f06c) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        abstractActivityC18396x51e3f06c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleTransformError", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11455, "", "", 0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(335874, 0)).intValue() + 1;
        gm0.j1.i();
        gm0.j1.u().c().w(335874, java.lang.Integer.valueOf(intValue));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        abstractActivityC18396x51e3f06c.B = null;
        abstractActivityC18396x51e3f06c.f252220u = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = abstractActivityC18396x51e3f06c.f252222w;
        if (u3Var != null && u3Var.isShowing()) {
            abstractActivityC18396x51e3f06c.f252222w.dismiss();
        }
        db5.e1.m(abstractActivityC18396x51e3f06c, abstractActivityC18396x51e3f06c.d7() > 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f574750jc2 : com.p314xaae8f345.mm.R.C30867xcad56011.f574751jc3, com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1, new zd4.b(abstractActivityC18396x51e3f06c));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleTransformError", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c abstractActivityC18396x51e3f06c, int i17, java.util.ArrayList arrayList, java.lang.String str, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        abstractActivityC18396x51e3f06c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertOrRemove", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar = abstractActivityC18396x51e3f06c.f252216q;
        if (xkVar == null || xkVar.f253072j != 1) {
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertOrRemove", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public static /* synthetic */ java.util.ArrayList W6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c abstractActivityC18396x51e3f06c) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        java.util.ArrayList arrayList = abstractActivityC18396x51e3f06c.f252208f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return arrayList;
    }

    public static void X6(java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLabelListValid", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (arrayList == null || arrayList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLabelListValid", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.List j17 = ((b93.b) c93.a.a()).j(str);
            if (j17 == null || j17.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseSelectVisibleRangeUI", "remove invalid lable:%s", str);
                it.remove();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLabelListValid", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x6 Y6(android.content.Context context, zd4.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createListAdapter", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x6 x6Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x6(context, oVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createListAdapter", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return x6Var;
    }

    public abstract zd4.o Z6();

    public void a7(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("exit", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        setResult(-1, intent);
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("exit", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public int b7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDefaultVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDefaultVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return 0;
    }

    public android.content.Intent c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectLabelIntent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        android.content.Intent intent = new android.content.Intent();
        if (this.f252217r.o(this.f252221v, 2)) {
            intent.putStringArrayListExtra("label_id", this.f252216q.f253076n);
        } else if (this.f252217r.o(this.f252221v, 3)) {
            intent.putStringArrayListExtra("label_id", this.f252216q.f253077o);
        }
        intent.setClassName(this, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectLabelIntent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return intent;
    }

    public final int d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(335874, 0)).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return intValue;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            e7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return dispatchKeyEvent;
    }

    public void e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goBack", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSelectChange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        int i17 = this.f252217r.i(this.f252216q.f253073k);
        boolean z17 = true;
        if (this.f252216q.f253073k == this.f252218s ? (!this.f252217r.b(i17, 2) || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253076n, ",").equals(this.f252210h) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253078p, ",").equals(this.f252212m) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253080r, ",").equals(this.f252213n))) && (!this.f252217r.b(i17, 3) || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253077o, ",").equals(this.f252210h) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253079q, ",").equals(this.f252212m) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253081s, ",").equals(this.f252213n))) : (!this.f252217r.b(i17, 2) || (this.f252216q.f253076n.size() == 0 && this.f252216q.f253078p.size() == 0)) && ((!this.f252217r.b(i17, 3) || (this.f252216q.f253077o.size() == 0 && this.f252216q.f253079q.size() == 0)) && !this.f252217r.b(i17, 1) && !this.f252217r.b(i17, 0) && !this.f252217r.b(i17, 6) && !this.f252217r.b(i17, 4))) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSelectChange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (z17) {
            db5.e1.K(this, true, getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbg), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbe), new zd4.k(this), new zd4.l(this));
        } else {
            f7();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goBack", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public final void f7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goBackWithStates", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ktag_range_index", this.f252218s);
        if (this.f252217r.o(this.f252218s, 2) || this.f252217r.o(this.f252218s, 3)) {
            intent.putExtra("Klabel_name_list", this.f252209g);
            intent.putExtra("Kother_user_name_list", this.f252212m);
            intent.putExtra("Kchat_room_name_list", this.f252213n);
            intent.putExtra("Kexclude_all_friends", this.f252215p);
        }
        boolean o17 = this.f252217r.o(this.f252218s, 2);
        java.util.ArrayList arrayList = this.f252211i;
        if (o17) {
            intent.putExtra("label_id", arrayList);
        } else if (this.f252217r.o(this.f252218s, 3)) {
            intent.putExtra("label_id", arrayList);
        }
        a7(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goBackWithStates", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public void g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "gotoSelectContact: ");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbt));
        intent.putExtra("snsPostWhoCanSee", true);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288323k));
        if (this.f252217r.o(this.f252221v, 2)) {
            if (this.f252216q.f253078p.size() > 0) {
                intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253078p, ","));
            }
        } else if (this.f252217r.o(this.f252221v, 3) && this.f252216q.f253079q.size() > 0) {
            intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253079q, ","));
        }
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("without_openim", true);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", this.C);
        intent.putExtra("max_limit_num", Integer.MAX_VALUE);
        intent.putExtra("menu_label", i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f571885sk));
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7529x7d0fa359);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cs8;
    }

    public void h7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoSelectLabel", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "goto select group");
        startActivityForResult(c7(), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7528x16eb0541);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoSelectLabel", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public boolean i7(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.a() && getIntent().getBooleanExtra("Kis_with_together", false) && this.f252217r.b(i17, 1)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
            u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhr));
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
            u1Var.q(false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return false;
        }
        int i18 = this.f252217r.i(this.f252216q.f253073k);
        int n17 = this.f252217r.n(i17);
        if (!this.f252217r.p(this.f252216q.f253073k, n17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "onGroupClick: newState:%d failed, oldState:%d", java.lang.Integer.valueOf(this.f252216q.f253073k), java.lang.Integer.valueOf(n17));
            if (this.f252217r.o(n17, 2) || this.f252217r.o(n17, 3)) {
                this.f252207e.c(i17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.U(n17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "user click [previousGroup: %d    onGroupClick:%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (!this.f252217r.b(i17, 2) && !this.f252217r.b(i17, 3)) {
            if (!this.f252217r.b(i17, 0) && !this.f252217r.b(i17, 1) && !this.f252217r.b(i17, 6)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                return false;
            }
            m78501x43e00957(true);
            if (this.f252217r.b(i18, 2) || this.f252217r.b(i18, 3)) {
                this.f252207e.c(i18);
            }
            this.f252216q.f253073k = n17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return false;
        }
        java.util.ArrayList arrayList = this.B;
        if (arrayList != null && arrayList.size() != 0 && d7() == 0) {
            this.f252221v = n17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showTransformDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            db5.e1.y(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574753jc5), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574752jc4), new zd4.i(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTransformDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz[previousGroup: need transform]");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return true;
        }
        if (i18 != i17) {
            if (this.f252217r.b(i18, 2)) {
                this.f252207e.collapseGroup(this.f252217r.i(2));
                m78501x43e00957(j7());
                if (android.text.TextUtils.isEmpty(this.f252212m)) {
                    this.f252212m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253078p, ",");
                }
            } else if (this.f252217r.b(i18, 3)) {
                this.f252207e.collapseGroup(this.f252217r.i(3));
                m78501x43e00957(k7());
                if (android.text.TextUtils.isEmpty(this.f252212m)) {
                    this.f252212m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253079q, ",");
                }
            } else if (this.f252217r.b(i18, 1) || this.f252217r.b(i18, 0) || this.f252217r.b(i18, 6) || this.f252217r.b(i18, 4)) {
                m78501x43e00957(j7() || k7());
            }
            this.f252207e.post(new zd4.c(this, i17));
        } else if (this.f252207e.isGroupExpanded(i17)) {
            this.f252207e.c(i17);
        } else {
            this.f252207e.d(i17);
        }
        this.f252216q.f253073k = n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean booleanExtra = getIntent().getBooleanExtra("KLabel_is_filter_private", false);
        this.f252207e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a) findViewById(com.p314xaae8f345.mm.R.id.n9k);
        java.util.ArrayList arrayList = (java.util.ArrayList) ((b93.b) c93.a.a()).d();
        this.f252208f = arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar = this.f252216q;
        xkVar.f253075m = booleanExtra;
        xkVar.l(arrayList);
        android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, -2);
        layoutParams.height = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561402hi);
        android.view.View view = new android.view.View(this);
        view.setLayoutParams(layoutParams);
        this.f252207e.addHeaderView(view);
        this.f252207e.setAdapter(this.f252216q);
        if (this.f252217r.o(this.f252216q.f253073k, 2)) {
            this.f252207e.expandGroup(this.f252217r.i(2));
        } else if (this.f252217r.o(this.f252216q.f253073k, 3)) {
            this.f252207e.expandGroup(this.f252217r.i(3));
        }
        this.f252207e.setOnGroupClickListener(new zd4.e(this));
        this.f252207e.setOnChildClickListener(new zd4.f(this));
        mo54448x9c8c0d33(new zd4.g(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbc), new zd4.h(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public boolean j7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasSelectExcludeData", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean z17 = (this.f252216q.f253077o.isEmpty() && this.f252216q.f253079q.isEmpty() && !this.f252216q.f253067e) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasSelectExcludeData", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return z17;
    }

    public boolean k7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasSelectIncludeData", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean z17 = (this.f252216q.f253076n.isEmpty() && this.f252216q.f253078p.isEmpty()) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasSelectIncludeData", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return z17;
    }

    public void l7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f252222w;
        if (u3Var != null && u3Var.isShowing()) {
            this.f252222w.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public void m7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveAndExit", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        zd4.p pVar = this.f252225z;
        if (pVar == null || !pVar.C6()) {
            android.content.Intent intent = new android.content.Intent();
            if (this.f252217r.o(this.f252216q.f253073k, 2)) {
                this.f252212m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253078p, ",");
                this.f252213n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253080r, ",");
                X6(this.f252216q.f253076n);
                intent.putStringArrayListExtra("label_id", this.f252216q.f253076n);
                intent.putExtra("Klabel_name_list", ((android.text.SpannableStringBuilder) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.k(this.f252216q.f253076n, false, -1)).toString());
                intent.putExtra("Kother_user_name_list", this.f252212m);
                intent.putExtra("Kchat_room_name_list", this.f252213n);
            } else if (this.f252217r.o(this.f252216q.f253073k, 3)) {
                this.f252212m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253079q, ",");
                this.f252213n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253081s, ",");
                X6(this.f252216q.f253077o);
                intent.putStringArrayListExtra("label_id", this.f252216q.f253077o);
                intent.putExtra("Klabel_name_list", ((android.text.SpannableStringBuilder) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.k(this.f252216q.f253077o, false, -1)).toString());
                intent.putExtra("Kother_user_name_list", this.f252212m);
                intent.putExtra("Kchat_room_name_list", this.f252213n);
                intent.putExtra("Kexclude_all_friends", this.f252216q.f253067e);
            }
            intent.putExtra("Ktag_range_index", this.f252216q.f253073k);
            a7(intent);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "[saveAndExit] dynamicChangeVisibleRange result=%b", java.lang.Boolean.valueOf(this.f252225z.I3()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveAndExit", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public void n7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        this.f252222w = db5.e1.Q(this, null, i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574745jb3), false, true, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "requestCode:%d resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1 && i17 == 4005) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("label_id");
            X6(stringArrayListExtra2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "onActivityResult select label back, mTempSelectGroup:%d, labels:%s", java.lang.Integer.valueOf(this.f252221v), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(stringArrayListExtra2, ","));
            if (stringArrayListExtra2 != null) {
                if (this.f252217r.o(this.f252221v, 2)) {
                    this.f252216q.f253076n.clear();
                    this.f252216q.f253076n.addAll(stringArrayListExtra2);
                    m78501x43e00957(k7());
                } else if (this.f252217r.o(this.f252221v, 3)) {
                    this.f252216q.f253077o.clear();
                    this.f252216q.f253077o.addAll(stringArrayListExtra2);
                    this.f252216q.f253067e = false;
                    m78501x43e00957(j7());
                } else {
                    z17 = false;
                    this.f252216q.notifyDataSetChanged();
                }
                z17 = true;
                this.f252216q.notifyDataSetChanged();
            } else {
                z17 = false;
            }
            if (z17 && (stringArrayListExtra = intent.getStringArrayListExtra("contact_select_label_id_list_from_search")) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                int i19 = this.f252221v;
                s0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                java.util.Set w17 = s0Var.w(i19);
                if (w17 != null) {
                    w17.addAll(stringArrayListExtra);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            }
        }
        if (i18 == -1 && i17 == 4003) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "the Activity completed");
            java.lang.String stringExtra = intent.getStringExtra("Select_Contacts_To_Create_New_Label");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar = this.f252216q;
                xkVar.f253067e = false;
                xkVar.notifyDataSetChanged();
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Contact", stringExtra);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactEditLabel ");
                    j45.l.n(mo55332x76847179(), "label", ".ui.ContactEditLabel", intent2, 4002);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactLabelEditUI ");
                    j45.l.n(mo55332x76847179(), "label", ".ui.ContactLabelEditUI", intent2, 4002);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz[onActivityResult] %s", stringExtra2 + "");
            if (this.f252217r.o(this.f252221v, 2)) {
                this.f252216q.e();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    this.f252216q.f253078p.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(",")));
                    this.f252216q.f253073k = this.f252221v;
                }
                m78501x43e00957(k7());
            } else if (this.f252217r.o(this.f252221v, 3)) {
                this.f252216q.d();
                this.f252216q.f253067e = false;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    this.f252216q.f253079q.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(",")));
                    this.f252216q.f253073k = this.f252221v;
                }
                m78501x43e00957(j7());
            }
            this.f252216q.notifyDataSetChanged();
            this.f252207e.expandGroup(this.f252217r.i(this.f252221v));
            str2 = "onActivityResult";
            str3 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI";
        } else {
            str = "";
            if (i18 == -1 && i17 == 4001) {
                java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz[onActivityResult] %s", stringExtra3 + str);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("Select_Contact", stringExtra3);
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactEditLabel ");
                        j45.l.n(mo55332x76847179(), "label", ".ui.ContactEditLabel", intent3, 4002);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactLabelEditUI ");
                        j45.l.n(mo55332x76847179(), "label", ".ui.ContactLabelEditUI", intent3, 4002);
                    }
                }
            } else if (i18 == 0 && i17 == 4002 && intent != null) {
                java.lang.String stringExtra4 = intent.getStringExtra("k_sns_label_add_label");
                this.f252223x = intent.getStringExtra("k_sns_label_add_label");
                java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("k_sns_label_add_label_usernames");
                this.f252224y = stringArrayListExtra3;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = stringExtra4 == null ? str : stringExtra4;
                java.lang.String str4 = this.f252223x;
                objArr[1] = str4 != null ? str4 : "";
                objArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(stringArrayListExtra3, ",");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "onActivityResult add label edit name,addedLabel:%s, addLabel:%s, addLabelUserNames:%s", objArr);
                this.f252207e.postDelayed(new zd4.j(this, stringExtra4), 600L);
            } else if (i18 == -1 && i17 == 4004) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "the Activity completed");
                java.lang.String stringExtra5 = intent.getStringExtra("select_chatrooms");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz[onActivityResult] %s", stringExtra5 + str);
                if (this.f252217r.o(this.f252221v, 2)) {
                    this.f252216q.f253080r.clear();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra5)) {
                        this.f252216q.f253080r.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra5.split(",")));
                        this.f252216q.f253073k = this.f252221v;
                    }
                } else if (this.f252217r.o(this.f252221v, 3)) {
                    this.f252216q.f253081s.clear();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra5)) {
                        this.f252216q.f253081s.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra5.split(",")));
                        this.f252216q.f253073k = this.f252221v;
                    }
                }
                this.f252216q.notifyDataSetChanged();
                this.f252207e.expandGroup(this.f252217r.i(this.f252221v));
            }
            str2 = "onActivityResult";
            str3 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str3);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "[%d]onCreate", java.lang.Integer.valueOf(hashCode()));
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574782jg0);
        this.A = new zd4.m(new java.lang.ref.WeakReference(this));
        gm0.j1.i();
        gm0.j1.n().f354821b.a(kd1.c.f72435x366c91de, this.A);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(638, this.A);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de, this.A);
        zd4.o Z6 = Z6();
        this.f252217r = Z6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x6 Y6 = Y6(this, Z6);
        this.f252216q = Y6;
        zd4.d dVar = new zd4.d(this);
        Y6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        Y6.f253082t = dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        android.content.Intent intent = getIntent();
        if (intent == null) {
            b7();
            this.f252218s = 0;
            this.f252216q.f253072j = 0;
            this.f252209g = null;
            this.f252212m = null;
            this.f252213n = null;
        } else {
            this.C = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
            zd4.p pVar = this.f252225z;
            if (pVar == null || !pVar.C6()) {
                this.f252219t = intent.getBooleanExtra("Kis_from_finder", false);
                b7();
                this.f252218s = intent.getIntExtra("KLabel_range_index", 0);
                this.f252209g = intent.getStringExtra("Klabel_name_list");
                this.f252212m = intent.getStringExtra("Kother_user_name_list");
                this.f252213n = intent.getStringExtra("Kchat_room_name_list");
                boolean booleanExtra = intent.getBooleanExtra("Kexclude_all_friends", false);
                this.f252215p = booleanExtra;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar = this.f252216q;
                xkVar.f253066d = this.f252214o;
                xkVar.f253067e = booleanExtra;
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(stringArrayListExtra)) {
                    stringArrayListExtra = new java.util.ArrayList<>();
                }
                X6(stringArrayListExtra);
                boolean o17 = this.f252217r.o(this.f252218s, 2);
                java.util.ArrayList arrayList = this.f252211i;
                if (o17) {
                    if (intent.hasExtra("label_id")) {
                        arrayList.addAll(stringArrayListExtra);
                        this.f252216q.f253076n.clear();
                        this.f252216q.f253076n.addAll(stringArrayListExtra);
                        this.f252210h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253076n, ",");
                    }
                    if (!android.text.TextUtils.isEmpty(this.f252212m)) {
                        this.f252216q.f253078p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f252212m.split(","));
                    }
                    java.lang.String str = this.f252213n;
                    if (str != null && !str.isEmpty()) {
                        this.f252216q.f253080r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f252213n.split(","));
                    }
                } else if (this.f252217r.o(this.f252218s, 3)) {
                    if (intent.hasExtra("label_id")) {
                        arrayList.addAll(stringArrayListExtra);
                        this.f252216q.f253077o.clear();
                        this.f252216q.f253077o.addAll(stringArrayListExtra);
                        this.f252210h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253077o, ",");
                    }
                    if (!android.text.TextUtils.isEmpty(this.f252212m)) {
                        this.f252216q.f253079q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f252212m.split(","));
                    }
                    java.lang.String str2 = this.f252213n;
                    if (str2 != null && !str2.isEmpty()) {
                        this.f252216q.f253081s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f252213n.split(","));
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "FromPostedFeed init result=%b", java.lang.Boolean.valueOf(this.f252225z.A6()));
            }
        }
        if (!android.text.TextUtils.isEmpty(intent.getStringExtra("k_sns_label_ui_title"))) {
            mo54450xbf7c1df6(intent.getStringExtra("k_sns_label_ui_title"));
        }
        this.f252216q.f253072j = intent.getIntExtra("k_sns_label_ui_style", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar2 = this.f252216q;
        xkVar2.f253073k = this.f252218s;
        xkVar2.f253074l = this.f252219t;
        if (xkVar2.f253072j == 1) {
            findViewById(com.p314xaae8f345.mm.R.id.n9l).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3);
        }
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        gm0.j1.i();
        gm0.j1.n().f354821b.q(kd1.c.f72435x366c91de, this.A);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(638, this.A);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de, this.A);
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a c22700x2b5d269a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "onResume");
        if (this.f252216q != null && this.f252223x == null && (c22700x2b5d269a = this.f252207e) != null) {
            c22700x2b5d269a.postDelayed(new zd4.a(this), 600L);
        }
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }
}
