package com.tencent.mm.plugin.fav.ui;

@db5.a(com.tencent.mm.plugin.appbrand.jsapi.m9.CTRL_INDEX)
@ul5.d(0)
/* loaded from: classes12.dex */
public class FavImgGalleryUI extends com.tencent.mm.ui.MMActivity implements android.widget.AdapterView.OnItemSelectedListener, o72.x3, g04.h, o72.e5, com.tencent.mm.plugin.fav.ui.l1 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f100356v = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f100358e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.x3 f100359f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f100360g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f100361h;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.m1 f100363m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f100365o;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.nc f100367q;

    /* renamed from: r, reason: collision with root package name */
    public kd0.p2 f100368r;

    /* renamed from: t, reason: collision with root package name */
    public long f100370t;

    /* renamed from: d, reason: collision with root package name */
    public int f100357d = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f100362i = true;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f100364n = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final boolean f100366p = com.tencent.mm.plugin.scanner.k1.f158750b;

    /* renamed from: s, reason: collision with root package name */
    public final db5.t4 f100369s = new com.tencent.mm.plugin.fav.ui.t3(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f100371u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI.13
        {
            this.__eventId = 812146647;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
            java.lang.String str = recogQBarOfImageFileResultEvent2.f54661g.f6368a;
            com.tencent.mm.plugin.fav.ui.y3 y3Var = new com.tencent.mm.plugin.fav.ui.y3(null);
            y3Var.f101616a = recogQBarOfImageFileResultEvent2;
            com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI = com.tencent.mm.plugin.fav.ui.FavImgGalleryUI.this;
            ((java.util.HashMap) favImgGalleryUI.f100364n).put(str, y3Var);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = favImgGalleryUI.f100361h;
            if (k0Var == null || !k0Var.i()) {
                return true;
            }
            favImgGalleryUI.U6(false);
            return true;
        }
    };

    @Override // o72.e5
    public void L0() {
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        if (e2Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavImgGalleryUI", "on cdn status changed, status:%d", java.lang.Integer.valueOf(e2Var.field_status));
            com.tencent.mm.plugin.fav.ui.gallery.r item = this.f100359f.getItem(this.f100357d);
            if (item != null) {
                java.lang.String str = e2Var.field_dataId;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                if (str.equals(item.i())) {
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.l3(this, e2Var));
                }
            }
        }
    }

    public final java.util.List T6(r45.bq0 bq0Var, java.lang.String str) {
        java.util.LinkedList linkedList;
        java.util.List T6;
        if (bq0Var == null || (linkedList = bq0Var.f370964f) == null) {
            return null;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (gp0Var.T.equals(str)) {
                return bq0Var.f370964f;
            }
            if (o72.x1.h0(gp0Var.I) && (T6 = T6(gp0Var.f375451y2, str)) != null) {
                return T6;
            }
        }
        return null;
    }

    public final void U6(boolean z17) {
        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.mm.plugin.fav.ui.gallery.r item = this.f100359f.getItem(this.f100357d);
        if (item != null && item.l() == 0) {
            if (item.b()) {
                arrayList.add(0);
                arrayList2.add(getString(com.tencent.mm.R.string.ccw));
            }
            if (item.c()) {
                arrayList.add(1);
                arrayList2.add(getString(com.tencent.mm.R.string.cbx));
            }
            arrayList.add(2);
            arrayList2.add(getString(com.tencent.mm.R.string.i89));
            java.lang.String j17 = item.j();
            boolean z18 = this.f100366p;
            if ((z18 || this.f100365o) && !com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                arrayList.add(4);
                arrayList2.add(getString(com.tencent.mm.R.string.b2e));
            }
            arrayList.add(5);
            arrayList2.add(getString(com.tencent.mm.R.string.b2d));
            com.tencent.mm.plugin.fav.ui.y3 y3Var = (com.tencent.mm.plugin.fav.ui.y3) ((java.util.HashMap) this.f100364n).get(j17);
            if (y3Var == null || (recogQBarOfImageFileResultEvent = y3Var.f101616a) == null) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
                aqVar.f6174a = currentTimeMillis;
                aqVar.f6175b = j17;
                recogQBarOfImageFileEvent.e();
            } else {
                com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
                java.lang.String e17 = s6Var.e(recogQBarOfImageFileResultEvent);
                int c17 = s6Var.c(recogQBarOfImageFileResultEvent);
                arrayList.add(3);
                arrayList2.add(((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) this.f100368r).l(c17, e17));
            }
            if (this.f100361h == null) {
                this.f100361h = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), 1, false);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f100361h;
            k0Var.f211872n = new com.tencent.mm.plugin.fav.ui.r3(this, arrayList, y3Var, arrayList2);
            k0Var.f211881s = this.f100369s;
            k0Var.p(new com.tencent.mm.plugin.fav.ui.s3(this));
            if (!getContext().isFinishing()) {
                this.f100361h.v();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                return;
            }
            gm0.j1.i();
            if (gm0.j1.n().f273288b.n() == 0 || !z17 || z18) {
                return;
            }
            this.f100367q.d(j17);
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.l1
    public com.tencent.mm.ui.base.MultiTouchImageView W() {
        int selectedItemPosition = this.f100358e.getSelectedItemPosition();
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = this.f100358e;
        android.view.View childAt = mMGestureGallery.getChildAt(selectedItemPosition - mMGestureGallery.getFirstVisiblePosition());
        if (childAt != null) {
            return childAt instanceof com.tencent.mm.ui.base.MultiTouchImageView ? (com.tencent.mm.ui.base.MultiTouchImageView) childAt : (com.tencent.mm.ui.base.MultiTouchImageView) childAt.findViewById(com.tencent.mm.R.id.h88);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavImgGalleryUI", "getCurView() pos:%s firstPos:%s", java.lang.Integer.valueOf(selectedItemPosition), java.lang.Integer.valueOf(this.f100358e.getFirstVisiblePosition()));
        return null;
    }

    @Override // com.tencent.mm.plugin.fav.ui.l1
    public java.lang.String Y5() {
        return this.f100359f.getItem(this.f100358e.getSelectedItemPosition()).i();
    }

    @Override // o72.e5
    public java.lang.String getAesKey() {
        com.tencent.mm.plugin.fav.ui.gallery.r item = this.f100359f.getItem(this.f100357d);
        if (item == null) {
            return null;
        }
        return item.e();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ab9;
    }

    @Override // g04.h
    public void k5(java.lang.Object obj, java.lang.Object obj2) {
        g04.l lVar = (g04.l) obj2;
        java.lang.String x27 = x2();
        int b17 = com.tencent.mm.plugin.scanner.k1.b(lVar.f267469a);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavImgGalleryUI", "local translate, img %s, result %s, ratio %d", x27, lVar.f267469a, java.lang.Integer.valueOf(b17));
        if (((java.lang.String) obj).equals(x27) && com.tencent.mm.plugin.scanner.k1.f(b17)) {
            this.f100365o = true;
            U6(false);
        }
    }

    @Override // o72.e5
    public void l5() {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (1 == i17) {
            if (-1 != i18) {
                return;
            }
            com.tencent.mm.plugin.fav.ui.gallery.r item = this.f100359f.getItem(this.f100357d);
            if (item == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavImgGalleryUI", "dataItem is null.");
                return;
            } else if (item.a(new o72.b3())) {
                db5.e1.T(getContext(), getString(com.tencent.mm.R.string.f489705e));
                return;
            } else {
                com.tencent.mm.plugin.fav.ui.x5.g(getContext(), intent.getStringExtra("Select_Conv_User"), item.p(), item.n(), new com.tencent.mm.plugin.fav.ui.m3(this, db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null)));
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        char c17;
        super.onCreate(bundle);
        hideTitleView();
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f100367q = new com.tencent.mm.plugin.fav.ui.nc(this, this, this);
        this.f100362i = getIntent().getBooleanExtra("show_share", true);
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById(com.tencent.mm.R.id.ghs);
        this.f100358e = mMGestureGallery;
        this.f100363m = new com.tencent.mm.plugin.fav.ui.m1(mMGestureGallery, this, this);
        int i17 = 0;
        this.f100358e.setVerticalFadingEdgeEnabled(false);
        this.f100358e.setHorizontalFadingEdgeEnabled(false);
        this.f100358e.setOnItemSelectedListener(this);
        this.f100358e.setSingleClickOverListener(new com.tencent.mm.plugin.fav.ui.n3(this));
        if (this.f100362i) {
            this.f100358e.setLongClickOverListener(new com.tencent.mm.plugin.fav.ui.o3(this));
        }
        fullScreenNoTitleBar(true);
        this.f100360g = new java.util.ArrayList();
        com.tencent.mm.plugin.fav.ui.x3 x3Var = new com.tencent.mm.plugin.fav.ui.x3(this, null);
        this.f100359f = x3Var;
        this.f100358e.setAdapter((android.widget.SpinnerAdapter) x3Var);
        this.f100370t = getIntent().getLongExtra("key_detail_info_id", -1L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        boolean booleanExtra = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
        java.lang.String stringExtra2 = getIntent().getStringExtra("fav_note_xml");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f100370t);
        char c18 = 2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Long.valueOf(this.f100370t);
        objArr[1] = java.lang.Boolean.valueOf(F != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavImgGalleryUI", "show one fav info, local id is %d, get from db ok ? %B", objArr);
        if (booleanExtra && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            F = o72.x1.B(stringExtra2, 18);
        }
        if (F != null) {
            arrayList.add(F);
        }
        this.f100360g.clear();
        java.util.List T6 = arrayList.size() == 1 ? T6(((o72.r2) arrayList.get(0)).field_favProto, stringExtra) : null;
        int size = arrayList.size();
        int i18 = -1;
        int i19 = 0;
        while (i19 < size) {
            o72.r2 r2Var = (o72.r2) arrayList.get(i19);
            if (T6 == null) {
                T6 = r2Var.field_favProto.f370964f;
            }
            int size2 = T6.size();
            int i27 = i17;
            while (i27 < size2) {
                r45.gp0 gp0Var = (r45.gp0) T6.get(i27);
                int i28 = gp0Var.I;
                if ((i28 == 8 || i28 == 10130) && !com.tencent.mm.sdk.platformtools.y1.c(o72.x1.x(gp0Var))) {
                    c17 = 2;
                } else {
                    int i29 = gp0Var.I;
                    c17 = 2;
                    if (i29 == 2 || i29 == 8 || i29 == 10130) {
                        this.f100360g.add(new com.tencent.mm.plugin.fav.ui.gallery.p(r2Var, gp0Var));
                        if (stringExtra != null && stringExtra.equals(gp0Var.T)) {
                            i18 = this.f100360g.size() - 1;
                        }
                    }
                }
                i27++;
                c18 = c17;
            }
            char c19 = c18;
            if (stringExtra == null && r2Var.field_localId == this.f100370t) {
                z17 = true;
                i18 = this.f100360g.size() - 1;
            } else {
                z17 = true;
            }
            i19++;
            i17 = 0;
            c18 = c19;
        }
        getIntent().removeExtra("key_detail_info_id");
        getIntent().removeExtra("key_detail_data_id");
        this.f100359f.notifyDataSetChanged();
        this.f100358e.post(new com.tencent.mm.plugin.fav.ui.k3(this, i18));
        setBackBtn(new com.tencent.mm.plugin.fav.ui.p3(this));
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        com.tencent.mm.plugin.fav.ui.q3 q3Var = new com.tencent.mm.plugin.fav.ui.q3(this);
        ((jd0.q2) x2Var).getClass();
        this.f100368r = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(this, q3Var);
        this.f100371u.alive();
        setResult(0, getIntent());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs());
        this.f100371u.dead();
        com.tencent.mm.plugin.fav.ui.m1 m1Var = this.f100363m;
        if (m1Var != null) {
            m1Var.f101254b = null;
            m1Var.f101253a = null;
            m1Var.f101257e = null;
        }
        com.tencent.mm.plugin.fav.ui.nc ncVar = this.f100367q;
        if (ncVar != null) {
            ncVar.c();
        }
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavImgGalleryUI", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f100357d = i17;
        if (view instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
            ((com.tencent.mm.ui.base.MultiTouchImageView) view).i();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f100363m.a(true);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(this);
        qp1.h0.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(this);
        qp1.h0.a(true, true, true);
    }

    @Override // o72.e5
    public java.lang.String x2() {
        com.tencent.mm.plugin.fav.ui.gallery.r item = this.f100359f.getItem(this.f100357d);
        return item == null ? "" : item.j();
    }

    @Override // o72.e5
    public java.lang.String y3() {
        com.tencent.mm.plugin.fav.ui.gallery.r item = this.f100359f.getItem(this.f100357d);
        if (item == null) {
            return null;
        }
        return item.f();
    }
}
