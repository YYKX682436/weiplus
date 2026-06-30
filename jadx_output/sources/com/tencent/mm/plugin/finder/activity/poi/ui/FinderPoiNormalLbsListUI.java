package com.tencent.mm.plugin.finder.activity.poi.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "ka2/c", "ka2/d", "ka2/e", "ka2/f", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public class FinderPoiNormalLbsListUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    public static final /* synthetic */ int P = 0;
    public final i11.e A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public r45.gd1 G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public ka2.e f101792J;
    public ka2.f K;
    public final ka2.d L;
    public boolean M;
    public final i11.c N;

    /* renamed from: t, reason: collision with root package name */
    public boolean f101793t;

    /* renamed from: u, reason: collision with root package name */
    public ha2.a f101794u;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout f101796w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f101797x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f101798y;

    /* renamed from: v, reason: collision with root package name */
    public int f101795v = -1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f101799z = "";

    public FinderPoiNormalLbsListUI() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.A = i11.h.e();
        this.H = jz5.h.b(new ka2.h(this));
        this.I = jz5.h.b(ka2.z.f306053d);
        this.f101792J = ka2.e.f306025d;
        this.K = ka2.f.f306030f;
        this.L = new ka2.d();
        this.N = new ka2.y(this);
    }

    public static final java.lang.String c7(com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI) {
        finderPoiNormalLbsListUI.getClass();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        java.lang.String sessionId = finderFeedReportObject != null ? finderFeedReportObject.getSessionId() : null;
        return sessionId == null ? "" : sessionId;
    }

    public static void n7(com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI, java.lang.String str, boolean z17, boolean z18, boolean z19, ka2.f fVar, int i17, int i18, java.lang.Object obj) {
        r45.gd1 gd1Var;
        com.tencent.mm.protobuf.g byteString;
        r45.gd1 gd1Var2;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        java.lang.String keyword = (i18 & 1) != 0 ? "" : str;
        boolean z27 = (i18 & 2) != 0 ? false : z17;
        boolean z28 = (i18 & 4) != 0 ? false : z18;
        boolean z29 = (i18 & 8) != 0 ? false : z19;
        ka2.f streamType = (i18 & 16) != 0 ? ka2.f.f306030f : fVar;
        int i19 = (i18 & 32) != 0 ? 0 : i17;
        finderPoiNormalLbsListUI.getClass();
        kotlin.jvm.internal.o.g(keyword, "keyword");
        kotlin.jvm.internal.o.g(streamType, "streamType");
        finderPoiNormalLbsListUI.B = true;
        finderPoiNormalLbsListUI.o7(streamType);
        ka2.d dVar = finderPoiNormalLbsListUI.L;
        ka2.c cVar = z27 ? dVar.f306019d : dVar.f306018c;
        com.tencent.mm.protobuf.g gVar = null;
        if (streamType == ka2.f.f306028d || streamType == ka2.f.f306030f) {
            gd1Var = finderPoiNormalLbsListUI.G;
            if (gd1Var == null) {
                jz5.l P6 = ((ey2.k0) ((jz5.n) finderPoiNormalLbsListUI.I).getValue()).P6();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[lastLocation] isSearchIng:");
                sb6.append(finderPoiNormalLbsListUI.f101793t);
                sb6.append(" longitude:");
                java.lang.Number number = (java.lang.Number) P6.f302833d;
                sb6.append(number.floatValue());
                sb6.append(" latitude:");
                java.lang.Number number2 = (java.lang.Number) P6.f302834e;
                sb6.append(number2.floatValue());
                com.tencent.mars.xlog.Log.i("FinderPoiNormalLbsListUI", sb6.toString());
                r45.gd1 gd1Var3 = new r45.gd1();
                gd1Var3.set(0, java.lang.Float.valueOf(number.floatValue()));
                gd1Var3.set(1, java.lang.Float.valueOf(number2.floatValue()));
                gd1Var = gd1Var3;
            }
            r45.dd1 dd1Var = cVar.f306014a;
            byteString = dd1Var != null ? dd1Var.getByteString(1) : null;
        } else {
            byteString = null;
            gd1Var = null;
        }
        if (streamType == ka2.f.f306029e || streamType == ka2.f.f306030f) {
            gd1Var2 = dVar.f306022g;
            r45.dd1 dd1Var2 = cVar.f306015b;
            if (dd1Var2 != null) {
                gVar = dd1Var2.getByteString(1);
            }
        } else {
            gd1Var2 = null;
        }
        boolean z37 = z29;
        db2.i1.f228015t.a(keyword, gd1Var, byteString, gd1Var2, gVar, z37, i19, new db2.f1(finderPoiNormalLbsListUI, new ka2.a0(finderPoiNormalLbsListUI, z27, cVar, z28, z37, streamType)));
    }

    public final java.util.ArrayList d7(java.util.List list, java.lang.String str) {
        java.util.List<r45.hd1> arrayList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (f7()) {
            arrayList = list;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((r45.hd1) obj).getInteger(5) == 0) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (r45.hd1 hd1Var : arrayList) {
            int i17 = 3;
            if (((r45.ad1) hd1Var.getCustom(6)) != null) {
                r45.ad1 ad1Var = (r45.ad1) hd1Var.getCustom(6);
                i17 = ad1Var != null && ad1Var.getInteger(1) == 3 ? 8 : 4;
            } else {
                java.lang.String string = hd1Var.getString(0);
                if (!(string == null || string.length() == 0)) {
                    i17 = 1;
                }
            }
            arrayList3.add(new ha2.a(hd1Var, i17, false, str, this.f101799z, null, false, 100, null));
        }
        arrayList2.addAll(arrayList3);
        return arrayList2;
    }

    /* renamed from: e7, reason: from getter */
    public ka2.f getS() {
        return this.K;
    }

    public final boolean f7() {
        return ((java.lang.Boolean) ((jz5.n) this.H).getValue()).booleanValue();
    }

    public ka2.f g7() {
        return ka2.f.f306028d;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dln;
    }

    public ha2.a h7() {
        r45.hd1 hd1Var = new r45.hd1();
        hd1Var.set(1, getContext().getResources().getString(com.tencent.mm.R.string.dbe));
        return new ha2.a(hd1Var, 0, false, null, null, null, false, 124, null);
    }

    public java.lang.String i7() {
        if (f7()) {
            java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.f491984m14);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.cyk);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }

    public ka2.f j7() {
        return ka2.f.f306030f;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k7() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.k7():void");
    }

    public void l7() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qvz);
        if (textView != null) {
            dq4.c.f242369a.f(textView);
            textView.setOnClickListener(new ka2.r(this));
            hc2.v0.e(textView, "poi_store_choose_cancel", 8, 0, false, false, null, new ka2.s(this), 60, null);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486346qw1);
        if (textView2 != null) {
            dq4.c.f242369a.f(textView2);
            com.tencent.mm.ui.fk.a(textView2);
            textView2.setText(i7());
        }
        com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) findViewById(com.tencent.mm.R.id.f486345qw0);
        if (weButton != null) {
            this.f101798y = weButton;
            weButton.setEnabled(this.f101794u != null);
            weButton.setOnClickListener(new ka2.t(this));
            hc2.v0.e(weButton, "poi_store_choose_finish", 8, 0, false, false, null, new ka2.u(this), 60, null);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.qvx);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.tencent.mm.R.id.qvu);
        android.view.View findViewById = linearLayout != null ? linearLayout.findViewById(com.tencent.mm.R.id.qvy) : null;
        if (editText != null) {
            editText.setOnClickListener(ka2.o.f306041d);
        }
        if (findViewById != null) {
            findViewById.setOnClickListener(new ka2.p(editText));
        }
        if (editText != null) {
            editText.addTextChangedListener(new ka2.q(findViewById, this));
        }
        android.view.View findViewById2 = linearLayout != null ? linearLayout.findViewById(com.tencent.mm.R.id.qvr) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI", "initSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI", "initSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ka2.v vVar = new ka2.v(this);
        ka2.d dVar = this.L;
        dVar.getClass();
        dVar.f306020e = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) vVar.invoke(dVar.f306016a);
        dVar.f306021f = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) vVar.invoke(dVar.f306017b);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.qvs);
        this.f101797x = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.N(new ka2.i());
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
            linearLayoutManager.Q(1);
            wxRecyclerView.setLayoutManager(linearLayoutManager);
            wxRecyclerView.setAdapter(dVar.f306020e);
        }
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) getContext().findViewById(com.tencent.mm.R.id.m6e);
        this.f101796w = wxRefreshLayout;
        if (wxRefreshLayout == null) {
            return;
        }
        wxRefreshLayout.setOnSimpleAction(new ka2.w(this));
    }

    public final void m7(ha2.a aVar, java.lang.String str, boolean z17) {
        r45.gd1 gd1Var;
        android.content.Intent intent = new android.content.Intent();
        if (aVar.f279792e != 0) {
            r45.hd1 hd1Var = aVar.f279791d;
            intent.putExtra("get_poi_classify_type", hd1Var.getInteger(5));
            intent.putExtra("get_poi_address", hd1Var.getString(3));
            intent.putExtra("get_poi_classify_id", hd1Var.getString(0));
            intent.putExtra("get_poi_name", hd1Var.getString(1));
            intent.putExtra("get_city", aVar.f279793f);
            intent.putExtra("get_poi_is_search", false);
            intent.putExtra("key_product_id", str);
            intent.putExtra("key_is_multi_store_promotion", z17);
            java.lang.String string = hd1Var.getString(0);
            if ((string == null || string.length() == 0) && (gd1Var = this.G) != null) {
                intent.putExtra("get_lat", gd1Var.getFloat(1));
                intent.putExtra("get_lng", gd1Var.getFloat(0));
            }
        }
        setResult(-1, intent);
        finish();
    }

    public void o7(ka2.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<set-?>");
        this.K = fVar;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList parcelableArrayListExtra;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        java.lang.String str;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 10001) {
            if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_select_mix_media_list")) == null || (galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) kz5.n0.Z(parcelableArrayListExtra)) == null || (str = galleryItem$MediaItem.f138430e) == null) {
                return;
            }
            boolean z17 = galleryItem$MediaItem.getType() == 2;
            android.content.Intent intent2 = new android.content.Intent();
            ka2.e eVar = ka2.e.f306025d;
            intent2.putExtra("key_page_type_ordinal", 1);
            intent2.putExtra("key_media_path", str);
            intent2.putExtra("key_is_video", z17);
            intent2.putExtra("key_media_item", galleryItem$MediaItem);
            bh5.c cVar = new bh5.c();
            cVar.f20922a.f20924a = this;
            cVar.d(intent2);
            cVar.a("com.tencent.mm.plugin.finder.activity.poi.ui.FInderPoiMediaLbsListUI");
            cVar.h(10002);
            return;
        }
        if (i17 == 10002 && i18 == -1) {
            android.content.Intent intent3 = new android.content.Intent();
            pm0.v.g(intent3, intent, "get_poi_classify_type", 0);
            pm0.v.k(intent3, intent, "get_poi_address");
            pm0.v.k(intent3, intent, "get_poi_classify_id");
            pm0.v.k(intent3, intent, "get_poi_name");
            pm0.v.k(intent3, intent, "get_city");
            pm0.v.k(intent3, intent, "key_product_id");
            pm0.v.d(intent3, intent, "get_poi_is_search", false);
            pm0.v.d(intent3, intent, "key_is_multi_store_promotion", false);
            pm0.v.f(intent3, intent, "get_lat", 0.0f, 4, null);
            pm0.v.f(intent3, intent, "get_lng", 0.0f, 4, null);
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("get_poi_name") : null;
            intent3.putExtra("key_is_from_media", !(stringExtra == null || stringExtra.length() == 0));
            setResult(-1, intent3);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        hideVKB();
        super.onBackPressed();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        i11.e eVar;
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        _hideActionBar();
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderPoiLbsListUI);
        aVar.Rj(this, iy1.a.Finder);
        aVar.Tj(this, 12, 1, false);
        aVar.dk(this, getClass().getSimpleName());
        aVar.Ai(this, new ka2.n(this));
        k7();
        l7();
        if (!(this instanceof com.tencent.mm.plugin.finder.activity.poi.ui.FInderPoiMediaLbsListUI)) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.LOCAION, new ka2.g(this)) || (eVar = this.A) == null) {
                return;
            }
            ((i11.h) eVar).l(this.N, true, false, false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        java.util.List list;
        super.onDestroy();
        this.C = true;
        this.f101794u = null;
        i11.e eVar = this.A;
        if (eVar != null) {
            ((i11.h) eVar).m(this.N);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f101797x;
        if (wxRecyclerView != null && (list = wxRecyclerView.H1) != null) {
            ((java.util.ArrayList) list).clear();
        }
        this.f101797x = null;
        ka2.d dVar = this.L;
        dVar.f306020e = null;
        dVar.f306021f = null;
        dVar.f306016a.clear();
        dVar.f306017b.clear();
    }
}
