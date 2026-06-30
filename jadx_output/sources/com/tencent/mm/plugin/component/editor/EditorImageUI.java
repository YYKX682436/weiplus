package com.tencent.mm.plugin.component.editor;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes12.dex */
public class EditorImageUI extends com.tencent.mm.ui.MMActivity implements g04.h, o72.e5, com.tencent.mm.plugin.fav.ui.l1 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f96477x = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f96478d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.m1 f96479e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f96480f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.component.editor.m0 f96481g;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f96485n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f96487p;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.nc f96489r;

    /* renamed from: s, reason: collision with root package name */
    public kd0.p2 f96490s;

    /* renamed from: h, reason: collision with root package name */
    public int f96482h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final long f96483i = -1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f96484m = null;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f96486o = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final boolean f96488q = com.tencent.mm.plugin.scanner.k1.f158750b;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.component.editor.e f96491t = new com.tencent.mm.plugin.component.editor.i0(this);

    /* renamed from: u, reason: collision with root package name */
    public final db5.t4 f96492u = new com.tencent.mm.plugin.component.editor.y(this);

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f96493v = new com.tencent.mm.plugin.component.editor.c0(this);

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f96494w = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.component.editor.EditorImageUI.14
        {
            this.__eventId = 812146647;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
            java.lang.String str = recogQBarOfImageFileResultEvent2.f54661g.f6368a;
            com.tencent.mm.plugin.component.editor.n0 n0Var = new com.tencent.mm.plugin.component.editor.n0(null);
            n0Var.f96613a = recogQBarOfImageFileResultEvent2;
            com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI = com.tencent.mm.plugin.component.editor.EditorImageUI.this;
            ((java.util.HashMap) editorImageUI.f96486o).put(str, n0Var);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = editorImageUI.f96485n;
            if (k0Var == null || !k0Var.i()) {
                return true;
            }
            editorImageUI.U6(false);
            return true;
        }
    };

    @Override // o72.e5
    public void L0() {
    }

    public final java.lang.String T6() {
        int selectedItemPosition = this.f96480f.getSelectedItemPosition();
        if (-1 != selectedItemPosition) {
            return ((ix1.c) this.f96481g.getItem(selectedItemPosition)).f295322s;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Editor.EditorImageUI", "error position");
        return null;
    }

    public final void U6(boolean z17) {
        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList.add(0);
        arrayList2.add(getString(com.tencent.mm.R.string.i29));
        arrayList.add(2);
        arrayList2.add(getString(com.tencent.mm.R.string.i89));
        java.lang.String T6 = T6();
        boolean z18 = this.f96488q;
        if ((z18 || this.f96487p) && !com.tencent.mm.sdk.platformtools.t8.K0(T6)) {
            arrayList.add(4);
            arrayList2.add(getString(com.tencent.mm.R.string.b2e));
        }
        arrayList.add(5);
        arrayList2.add(getString(com.tencent.mm.R.string.b2d));
        com.tencent.mm.plugin.component.editor.n0 n0Var = (com.tencent.mm.plugin.component.editor.n0) ((java.util.HashMap) this.f96486o).get(T6);
        if (n0Var == null || (recogQBarOfImageFileResultEvent = n0Var.f96613a) == null) {
            com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
            aqVar.f6174a = currentTimeMillis;
            aqVar.f6175b = T6;
            recogQBarOfImageFileEvent.e();
        } else if (!com.tencent.mm.sdk.platformtools.t8.L0(recogQBarOfImageFileResultEvent.f54661g.f6369b)) {
            arrayList.add(3);
            arrayList2.add("");
        }
        if (!isFinishing()) {
            if (this.f96485n == null) {
                this.f96485n = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), 1, false);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f96485n;
            k0Var.f211872n = new com.tencent.mm.plugin.component.editor.j0(this, arrayList, n0Var, arrayList2);
            k0Var.f211881s = this.f96492u;
            k0Var.p(new com.tencent.mm.plugin.component.editor.k0(this));
            if (!getContext().isFinishing()) {
                this.f96485n.v();
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(T6)) {
            return;
        }
        gm0.j1.i();
        if (gm0.j1.n().f273288b.n() == 0 || !z17 || z18) {
            return;
        }
        this.f96489r.d(T6);
    }

    @Override // com.tencent.mm.plugin.fav.ui.l1
    public com.tencent.mm.ui.base.MultiTouchImageView W() {
        int selectedItemPosition = this.f96480f.getSelectedItemPosition();
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = this.f96480f;
        android.view.View childAt = mMGestureGallery.getChildAt(selectedItemPosition - mMGestureGallery.getFirstVisiblePosition());
        if (childAt != null) {
            return childAt instanceof com.tencent.mm.ui.base.MultiTouchImageView ? (com.tencent.mm.ui.base.MultiTouchImageView) childAt : (com.tencent.mm.ui.base.MultiTouchImageView) childAt.findViewById(com.tencent.mm.R.id.h9o);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorImageUI", "getCurView() pos:%s firstPos:%s", java.lang.Integer.valueOf(selectedItemPosition), java.lang.Integer.valueOf(this.f96480f.getFirstVisiblePosition()));
        return null;
    }

    @Override // com.tencent.mm.plugin.fav.ui.l1
    public java.lang.String Y5() {
        return this.f96481g.getItem(this.f96480f.getSelectedItemPosition()).f295311a;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void dealContentView(android.view.View view) {
        com.tencent.mm.ui.bk.l0(com.tencent.mm.ui.bk.b(getWindow(), null), getBodyView());
        ((android.view.ViewGroup) getBodyView().getParent()).removeView(getBodyView());
        ((android.view.ViewGroup) getWindow().getDecorView()).addView(getBodyView(), 0);
    }

    @Override // o72.e5
    public java.lang.String getAesKey() {
        r45.gp0 gp0Var;
        ix1.c cVar = (ix1.c) this.f96480f.getSelectedItem();
        if (cVar == null || (gp0Var = cVar.f295324m) == null) {
            return null;
        }
        return gp0Var.f375438u;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a5h;
    }

    @Override // g04.h
    public void k5(java.lang.Object obj, java.lang.Object obj2) {
        g04.l lVar = (g04.l) obj2;
        java.lang.String T6 = T6();
        int b17 = com.tencent.mm.plugin.scanner.k1.b(lVar.f267469a);
        com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorImageUI", "local translate, img %s, result %s, ratio %d", T6, lVar.f267469a, java.lang.Integer.valueOf(b17));
        if (((java.lang.String) obj).equals(T6) && com.tencent.mm.plugin.scanner.k1.f(b17)) {
            this.f96487p = true;
            com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f58317e = 2L;
            galleryTranslateReportStruct.f58318f = 5L;
            int selectedItemPosition = this.f96480f.getSelectedItemPosition();
            if (-1 != selectedItemPosition) {
                ix1.c cVar = (ix1.c) this.f96481g.getItem(selectedItemPosition);
                galleryTranslateReportStruct.q(cVar.f295324m.f375434s);
                galleryTranslateReportStruct.p(cVar.f295324m.f375438u);
            }
            galleryTranslateReportStruct.k();
            U6(false);
        }
    }

    @Override // o72.e5
    public void l5() {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (1001 != i17 || -1 != i18) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
        if (com.tencent.mm.sdk.platformtools.t8.L0(P1)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Editor.EditorImageUI", "want to send record msg, but toUser is null");
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.component.editor.b0(this, P1, stringExtra2, new com.tencent.mm.plugin.component.editor.z(this, db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null))));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f96489r = new com.tencent.mm.plugin.fav.ui.nc(this, this, this);
        java.lang.String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        nx1.d q17 = nx1.d.q();
        q17.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = q17.f341282a.iterator();
        while (it.hasNext()) {
            ix1.a aVar = (ix1.a) it.next();
            if (aVar.b() == 2) {
                arrayList.add(aVar);
            }
        }
        this.f96478d = arrayList;
        for (int i17 = 0; i17 < this.f96478d.size(); i17++) {
            if (((ix1.a) this.f96478d.get(i17)).f295311a.equals(stringExtra)) {
                this.f96482h = i17;
            }
        }
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById(com.tencent.mm.R.id.ghs);
        this.f96480f = mMGestureGallery;
        this.f96479e = new com.tencent.mm.plugin.fav.ui.m1(mMGestureGallery, this, this);
        this.f96480f.setVerticalFadingEdgeEnabled(false);
        this.f96480f.setHorizontalFadingEdgeEnabled(false);
        com.tencent.mm.plugin.component.editor.m0 m0Var = new com.tencent.mm.plugin.component.editor.m0(null);
        this.f96481g = m0Var;
        m0Var.f96595d = this.f96478d;
        this.f96480f.setAdapter((android.widget.SpinnerAdapter) m0Var);
        this.f96480f.setSelection(this.f96482h);
        this.f96480f.setOnItemSelectedListener(new com.tencent.mm.plugin.component.editor.d0(this));
        this.f96480f.setSingleClickOverListener(new com.tencent.mm.plugin.component.editor.e0(this));
        this.f96480f.setLongClickOverListener(new com.tencent.mm.plugin.component.editor.f0(this));
        fullScreenNoTitleBar(true);
        setBackBtn(new com.tencent.mm.plugin.component.editor.g0(this));
        this.f96494w.alive();
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        com.tencent.mm.plugin.component.editor.h0 h0Var = new com.tencent.mm.plugin.component.editor.h0(this);
        ((jd0.q2) x2Var).getClass();
        this.f96490s = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(this, h0Var);
        com.tencent.mm.plugin.component.editor.f.f96553d.b(this.f96491t);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.component.editor.f fVar = com.tencent.mm.plugin.component.editor.f.f96553d;
        ((java.util.ArrayList) fVar.f96554a).remove(this.f96491t);
        com.tencent.mm.plugin.fav.ui.nc ncVar = this.f96489r;
        if (ncVar != null) {
            ncVar.c();
        }
        com.tencent.mm.plugin.fav.ui.m1 m1Var = this.f96479e;
        if (m1Var != null) {
            m1Var.f101254b = null;
            m1Var.f101253a = null;
            m1Var.f101257e = null;
        }
        this.f96494w.dead();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f96479e.a(false);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        qp1.h0.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        qp1.h0.a(true, true, true);
    }

    @Override // o72.e5
    public java.lang.String x2() {
        return T6();
    }

    @Override // o72.e5
    public java.lang.String y3() {
        r45.gp0 gp0Var;
        ix1.c cVar = (ix1.c) this.f96480f.getSelectedItem();
        if (cVar == null || (gp0Var = cVar.f295324m) == null) {
            return null;
        }
        return gp0Var.f375434s;
    }
}
