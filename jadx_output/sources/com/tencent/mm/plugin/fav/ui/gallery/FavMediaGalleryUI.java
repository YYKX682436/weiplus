package com.tencent.mm.plugin.fav.ui.gallery;

@db5.a(3)
/* loaded from: classes12.dex */
public class FavMediaGalleryUI extends com.tencent.mm.ui.MMActivity implements android.widget.AdapterView.OnItemSelectedListener, o72.x3, g04.h, o72.e5, com.tencent.mm.plugin.fav.ui.l1 {
    public static final /* synthetic */ int C = 0;
    public long A;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f100872f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.f0 f100873g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f100874h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f100875i;

    /* renamed from: s, reason: collision with root package name */
    public boolean f100882s;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.nc f100884u;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.m1 f100886w;

    /* renamed from: d, reason: collision with root package name */
    public int f100870d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.widget.FavVideoView f100871e = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f100876m = true;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f100877n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f100878o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public boolean f100879p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f100880q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final r45.dq0 f100881r = new r45.dq0();

    /* renamed from: t, reason: collision with root package name */
    public final boolean f100883t = com.tencent.mm.plugin.scanner.k1.f158750b;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f100885v = new java.util.HashMap();

    /* renamed from: x, reason: collision with root package name */
    public boolean f100887x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f100888y = 0;

    /* renamed from: z, reason: collision with root package name */
    public final db5.t4 f100889z = new com.tencent.mm.plugin.fav.ui.gallery.a0(this);
    public final com.tencent.mm.sdk.event.IListener B = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI.13
        {
            this.__eventId = 812146647;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
            java.lang.String str = recogQBarOfImageFileResultEvent2.f54661g.f6368a;
            com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI.this;
            ((java.util.HashMap) favMediaGalleryUI.f100885v).put(str, recogQBarOfImageFileResultEvent2);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = favMediaGalleryUI.f100875i;
            if (k0Var == null || !k0Var.i()) {
                return true;
            }
            favMediaGalleryUI.V6(false);
            return true;
        }
    };

    @Override // o72.e5
    public void L0() {
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        com.tencent.mm.plugin.fav.ui.gallery.r item;
        if (e2Var == null || (item = this.f100873g.getItem(this.f100870d)) == null) {
            return;
        }
        java.lang.String str = e2Var.field_dataId;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (str.equals(item.i()) && item.k() == 2) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.gallery.s(this, e2Var));
        }
    }

    public final void T6() {
        if (this.f100886w == null || !U6()) {
            finish();
        } else {
            this.f100886w.a(true);
        }
    }

    public final boolean U6() {
        com.tencent.mm.plugin.fav.ui.gallery.r item = this.f100873g.getItem(this.f100870d);
        return item != null && item.k() == 2;
    }

    public final void V6(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.mm.plugin.fav.ui.gallery.r item = this.f100873g.getItem(this.f100870d);
        if (item == null) {
            return;
        }
        if (item.l() != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "showMenu, illegalType");
        } else if (item.k() == 2) {
            if (item.b()) {
                arrayList.add(0);
                arrayList2.add(getString(com.tencent.mm.R.string.ccw));
            }
            if (item.c()) {
                arrayList.add(1);
                arrayList2.add(getString(com.tencent.mm.R.string.cbx));
            }
            arrayList.add(2);
            arrayList2.add(getString(com.tencent.mm.R.string.ccr));
            java.lang.String j17 = item.j();
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent) ((java.util.HashMap) this.f100885v).get(j17);
            if (recogQBarOfImageFileResultEvent != null) {
                com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
                java.lang.String e17 = s6Var.e(recogQBarOfImageFileResultEvent);
                arrayList.add(3);
                int c17 = s6Var.c(recogQBarOfImageFileResultEvent);
                ((jd0.z1) ((kd0.l2) i95.n0.c(kd0.l2.class))).getClass();
                if (com.tencent.mm.plugin.scanner.z0.o(c17, e17)) {
                    arrayList2.add(getString(com.tencent.mm.R.string.f491207cc4));
                } else {
                    ((jd0.z1) ((kd0.l2) i95.n0.c(kd0.l2.class))).getClass();
                    if (com.tencent.mm.plugin.scanner.z0.d(c17, e17)) {
                        arrayList2.add(getString(com.tencent.mm.R.string.f491205cc2));
                    } else {
                        arrayList2.add(getString(com.tencent.mm.R.string.f491206cc3));
                    }
                }
            } else {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
                aqVar.f6174a = currentTimeMillis;
                aqVar.f6175b = j17;
                recogQBarOfImageFileEvent.e();
            }
            boolean z18 = this.f100883t;
            if ((z18 || this.f100882s) && !com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                arrayList.add(5);
                arrayList2.add(getString(com.tencent.mm.R.string.b2e));
            }
            arrayList.add(6);
            arrayList2.add(getString(com.tencent.mm.R.string.b2d));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                gm0.j1.i();
                if (gm0.j1.n().f273288b.n() != 0 && z17 && !z18) {
                    this.f100884u.d(j17);
                }
            }
        } else if (com.tencent.mm.vfs.w6.j(item.j())) {
            if (item.b()) {
                arrayList.add(0);
                arrayList2.add(getString(com.tencent.mm.R.string.ccw));
            }
            arrayList.add(2);
            arrayList2.add(getString(com.tencent.mm.R.string.i8d));
        }
        if (!this.f100887x) {
            arrayList.add(4);
            arrayList2.add(getString(com.tencent.mm.R.string.caz));
        }
        if (this.f100875i == null) {
            this.f100875i = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), 1, false);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f100875i;
        k0Var.f211872n = new com.tencent.mm.plugin.fav.ui.gallery.y(this, arrayList, arrayList2);
        k0Var.f211881s = this.f100889z;
        k0Var.p(new com.tencent.mm.plugin.fav.ui.gallery.z(this));
        this.f100875i.v();
    }

    @Override // com.tencent.mm.plugin.fav.ui.l1
    public com.tencent.mm.ui.base.MultiTouchImageView W() {
        int selectedItemPosition = this.f100872f.getSelectedItemPosition();
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = this.f100872f;
        android.view.View childAt = mMGestureGallery.getChildAt(selectedItemPosition - mMGestureGallery.getFirstVisiblePosition());
        if (childAt == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "getCurView() pos:%s firstPos:%s", java.lang.Integer.valueOf(selectedItemPosition), java.lang.Integer.valueOf(this.f100872f.getFirstVisiblePosition()));
            return null;
        }
        if (childAt instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
            return (com.tencent.mm.ui.base.MultiTouchImageView) childAt;
        }
        android.view.View findViewById = childAt.findViewById(com.tencent.mm.R.id.h88);
        if (findViewById instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
            return (com.tencent.mm.ui.base.MultiTouchImageView) findViewById;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.fav.ui.l1
    public java.lang.String Y5() {
        return this.f100873g.getItem(this.f100872f.getSelectedItemPosition()).i();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        setResult(0, getIntent().putExtra("KEY_VIEW_PIC_CNT", this.f100888y));
        super.finish();
    }

    @Override // o72.e5
    public java.lang.String getAesKey() {
        com.tencent.mm.plugin.fav.ui.gallery.r item = this.f100873g.getItem(this.f100870d);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "local translate, img %s, result %s, ratio %d", x27, lVar.f267469a, java.lang.Integer.valueOf(b17));
        if (((java.lang.String) obj).equals(x27) && com.tencent.mm.plugin.scanner.k1.f(b17)) {
            this.f100882s = true;
            V6(false);
        }
    }

    @Override // o72.e5
    public void l5() {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        if (1 == i17) {
            if (-1 != i18) {
                return;
            }
            com.tencent.mm.plugin.fav.ui.gallery.r item = this.f100873g.getItem(this.f100870d);
            if (item == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "dataItem is null.");
                return;
            }
            java.lang.String j17 = item.j();
            if (item.a(new o72.b3())) {
                db5.e1.T(getContext(), getString(com.tencent.mm.R.string.f489705e));
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null);
            if (com.tencent.mm.sdk.platformtools.y1.c(j17)) {
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.fav.ui.x5.g(getContext(), (java.lang.String) it.next(), item.p(), item.n(), new com.tencent.mm.plugin.fav.ui.gallery.t(this, Q));
                }
            } else {
                com.tencent.mm.plugin.fav.ui.gallery.u uVar = new com.tencent.mm.plugin.fav.ui.gallery.u(this, Q);
                java.util.Iterator it6 = P1.iterator();
                while (it6.hasNext()) {
                    java.lang.String str = (java.lang.String) it6.next();
                    com.tencent.mm.plugin.fav.ui.x5.k(this, str, item.n(), uVar);
                    if (stringExtra2 != null) {
                        int length = stringExtra2.length();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= length) {
                                z17 = true;
                                break;
                            }
                            int codePointAt = stringExtra2.codePointAt(i19);
                            if (!java.lang.Character.isWhitespace(codePointAt)) {
                                z17 = false;
                                break;
                            }
                            i19 += java.lang.Character.charCount(codePointAt);
                        }
                        if (!z17) {
                            ((dk5.s5) tg3.t1.a()).fj(str, stringExtra2, c01.e2.C(str), 0);
                        }
                    }
                }
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        int i18;
        int i19;
        int size;
        super.onCreate(bundle);
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f100884u = new com.tencent.mm.plugin.fav.ui.nc(this, this, this);
        this.f100876m = getIntent().getBooleanExtra("show_share", true);
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById(com.tencent.mm.R.id.ghs);
        this.f100872f = mMGestureGallery;
        mMGestureGallery.setVerticalFadingEdgeEnabled(false);
        this.f100872f.setHorizontalFadingEdgeEnabled(false);
        this.f100872f.setOnItemSelectedListener(this);
        this.f100872f.setSingleClickOverListener(new com.tencent.mm.plugin.fav.ui.gallery.v(this));
        if (this.f100876m) {
            this.f100872f.setLongClickOverListener(new com.tencent.mm.plugin.fav.ui.gallery.w(this));
        }
        fullScreenNoTitleBar(true);
        this.f100874h = new java.util.ArrayList();
        com.tencent.mm.plugin.fav.ui.gallery.f0 f0Var = new com.tencent.mm.plugin.fav.ui.gallery.f0(this, null);
        this.f100873g = f0Var;
        this.f100872f.setAdapter((android.widget.SpinnerAdapter) f0Var);
        long[] longArrayExtra = getIntent().getLongArrayExtra("KEY_MEDIA_FAVID_LIST");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        this.A = getIntent().getLongExtra("key_detail_info_id", -1L);
        boolean booleanExtra = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
        java.lang.String stringExtra2 = getIntent().getStringExtra("fav_note_xml");
        if (longArrayExtra == null) {
            o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.A);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Long.valueOf(this.A);
            objArr[1] = java.lang.Boolean.valueOf(F != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "show one fav info, local id is %d, get from db ok ? %B", objArr);
            if (booleanExtra && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                F = o72.x1.B(stringExtra2, 18);
            }
            if (F != null) {
                arrayList.add(F);
            }
        } else {
            for (long j17 : longArrayExtra) {
                o72.r2 F2 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
                if (F2 != null && !arrayList.contains(F2)) {
                    arrayList.add(F2);
                }
            }
            if (arrayList.size() == 0 && booleanExtra && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                arrayList.add(o72.x1.B(stringExtra2, 18));
            }
        }
        this.f100874h.clear();
        int size2 = arrayList.size();
        int i27 = -1;
        int i28 = 0;
        while (i28 < size2) {
            o72.r2 r2Var = (o72.r2) arrayList.get(i28);
            int size3 = r2Var.field_favProto.f370964f.size();
            int i29 = 0;
            while (i29 < size3) {
                r45.gp0 gp0Var = (r45.gp0) r2Var.field_favProto.f370964f.get(i29);
                int i37 = gp0Var.I;
                if (((i37 != 8 && i37 != 10130) || com.tencent.mm.sdk.platformtools.y1.c(o72.x1.x(gp0Var))) && ((i19 = gp0Var.I) == 2 || i19 == 4 || i19 == 15 || i19 == 8)) {
                    this.f100874h.add(new com.tencent.mm.plugin.fav.ui.gallery.p(r2Var, gp0Var));
                    if (stringExtra != null && stringExtra.equals(gp0Var.T)) {
                        long j18 = r2Var.field_localId;
                        if (j18 != -1) {
                            i17 = size2;
                            i18 = i27;
                            if (j18 == this.A) {
                                size = this.f100874h.size();
                            } else {
                                i27 = i18;
                                i29++;
                                size2 = i17;
                            }
                        } else {
                            i17 = size2;
                            size = this.f100874h.size();
                        }
                        i27 = size - 1;
                        i29++;
                        size2 = i17;
                    }
                }
                i17 = size2;
                i18 = i27;
                i27 = i18;
                i29++;
                size2 = i17;
            }
            int i38 = size2;
            i27 = (stringExtra == null && r2Var.field_localId == this.A) ? this.f100874h.size() - 1 : i27;
            i28++;
            size2 = i38;
        }
        getIntent().removeExtra("key_detail_info_id");
        getIntent().removeExtra("key_detail_data_id");
        this.f100873g.notifyDataSetChanged();
        if (i27 >= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "pre match selection %d", java.lang.Integer.valueOf(i27));
            this.f100872f.setSelection(i27);
            this.f100870d = i27;
        }
        this.f100880q = i27;
        this.f100872f.post(new com.tencent.mm.plugin.fav.ui.gallery.d0(this, i27));
        setBackBtn(new com.tencent.mm.plugin.fav.ui.gallery.x(this));
        this.B.alive();
        setResult(0, getIntent().putExtra("KEY_VIEW_PIC_CNT", this.f100888y));
        int intExtra = getIntent().getIntExtra("key_detail_fav_scene", 0);
        r45.dq0 dq0Var = this.f100881r;
        dq0Var.f372653d = intExtra;
        dq0Var.f372654e = getIntent().getIntExtra("key_detail_fav_sub_scene", 0);
        dq0Var.f372655f = getIntent().getIntExtra("key_detail_fav_index", 0);
        dq0Var.f372657h = getIntent().getStringExtra("key_detail_fav_query");
        dq0Var.f372656g = getIntent().getStringExtra("key_detail_fav_sessionid");
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_detail_fav_tags");
        dq0Var.f372658i = stringExtra3;
        java.lang.String str = dq0Var.f372657h;
        if (str == null) {
            str = "";
        }
        dq0Var.f372657h = str;
        java.lang.String str2 = dq0Var.f372656g;
        if (str2 == null) {
            str2 = "";
        }
        dq0Var.f372656g = str2;
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        dq0Var.f372658i = stringExtra3;
        if (getIntent().getBooleanExtra("KEY_MEDIA_SUPPORT_DRAG", false)) {
            this.f100886w = new com.tencent.mm.plugin.fav.ui.m1(this.f100872f, this, this);
        }
        this.f100887x = getIntent().getBooleanExtra("KEY_MEDIA_HIDE_GO_DETAIL", false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs());
        this.B.dead();
        com.tencent.mm.plugin.fav.ui.m1 m1Var = this.f100886w;
        if (m1Var != null) {
            m1Var.f101254b = null;
            m1Var.f101253a = null;
            m1Var.f101257e = null;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f100877n).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = (com.tencent.mm.plugin.fav.ui.widget.FavVideoView) it.next();
            if (favVideoView != null) {
                favVideoView.e();
            }
        }
        com.tencent.mm.plugin.fav.ui.nc ncVar = this.f100884u;
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
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f100888y++;
        this.f100870d = i17;
        if (view instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
            ((com.tencent.mm.ui.base.MultiTouchImageView) view).i();
        }
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f100871e;
        if (favVideoView != null) {
            favVideoView.e();
        }
        if (view instanceof com.tencent.mm.plugin.fav.ui.widget.FavVideoView) {
            com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView2 = (com.tencent.mm.plugin.fav.ui.widget.FavVideoView) view;
            if ((this.f100873g.getItemViewType(i17) == 15 || this.f100873g.getItemViewType(i17) == 4) && !favVideoView2.d()) {
                if (i17 != this.f100880q || this.f100879p) {
                    favVideoView2.setStartAfterPrepared(false);
                } else {
                    favVideoView2.setStartAfterPrepared(true);
                    this.f100879p = true;
                }
                favVideoView2.f();
                this.f100871e = favVideoView2;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || this.f100886w == null) {
            return super.onKeyDown(i17, keyEvent);
        }
        T6();
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
        com.tencent.mm.plugin.fav.ui.gallery.r item = this.f100873g.getItem(this.f100870d);
        return (item != null && item.k() == 2) ? item.j() : "";
    }

    @Override // o72.e5
    public java.lang.String y3() {
        com.tencent.mm.plugin.fav.ui.gallery.r item = this.f100873g.getItem(this.f100870d);
        if (item == null) {
            return null;
        }
        return item.f();
    }
}
