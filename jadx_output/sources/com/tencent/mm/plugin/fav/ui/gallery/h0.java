package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class h0 implements com.tencent.mm.plugin.fav.ui.gallery.z1, com.tencent.mm.plugin.fav.ui.gallery.l1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.y1 f100941a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f100942b;

    /* renamed from: c, reason: collision with root package name */
    public w82.k f100943c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f100944d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f100945e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f100946f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageButton f100947g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f100948h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f100949i;

    /* renamed from: k, reason: collision with root package name */
    public int f100951k;

    /* renamed from: l, reason: collision with root package name */
    public final android.app.Activity f100952l;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f100953m;

    /* renamed from: n, reason: collision with root package name */
    public r45.dq0 f100954n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.y0 f100955o;

    /* renamed from: p, reason: collision with root package name */
    public long f100956p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.o f100957q;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.q2 f100959s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.a1 f100960t;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.z0 f100963w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f100964x;

    /* renamed from: j, reason: collision with root package name */
    public int f100950j = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f100958r = false;

    /* renamed from: u, reason: collision with root package name */
    public long f100961u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f100962v = 0;

    public h0(android.app.Activity activity, android.view.View view, com.tencent.mm.plugin.fav.ui.ra raVar) {
        this.f100949i = false;
        com.tencent.mm.plugin.fav.ui.gallery.v0 v0Var = new com.tencent.mm.plugin.fav.ui.gallery.v0(this);
        com.tencent.mm.plugin.fav.ui.gallery.w0 w0Var = new com.tencent.mm.plugin.fav.ui.gallery.w0(this);
        this.f100964x = new java.util.ArrayList();
        this.f100952l = activity;
        this.f100953m = view;
        this.f100949i = true;
        com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = new com.tencent.mm.plugin.fav.ui.gallery.l2(activity);
        l2Var.f100993a = this;
        this.f100941a = l2Var;
        l2Var.f100998f = this;
        java.util.ArrayList arrayList = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100920c;
        arrayList.remove(l2Var);
        arrayList.add(l2Var);
        r45.dq0 dq0Var = new r45.dq0();
        this.f100954n = dq0Var;
        dq0Var.f372653d = 2;
        dq0Var.f372654e = 2;
        dq0Var.f372655f = 0;
        dq0Var.f372656g = "";
        dq0Var.f372657h = "";
        dq0Var.f372658i = "";
        this.f100960t = new com.tencent.mm.plugin.fav.ui.gallery.a1();
        this.f100944d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482917rq);
        this.f100945e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mf6);
        this.f100942b = (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.h0u);
        this.f100946f = (android.widget.ImageButton) view.findViewById(com.tencent.mm.R.id.h0l);
        this.f100947g = (android.widget.ImageButton) view.findViewById(com.tencent.mm.R.id.h0k);
        this.f100942b.setLayoutManager(((com.tencent.mm.plugin.fav.ui.gallery.l2) this.f100941a).c(activity));
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f100942b;
        com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var2 = (com.tencent.mm.plugin.fav.ui.gallery.l2) this.f100941a;
        l2Var2.getClass();
        recyclerView.N(new com.tencent.mm.plugin.fav.ui.gallery.c2(l2Var2, activity));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f100942b;
        com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var3 = (com.tencent.mm.plugin.fav.ui.gallery.l2) this.f100941a;
        com.tencent.mm.plugin.fav.ui.gallery.x1 x1Var = new com.tencent.mm.plugin.fav.ui.gallery.x1(l2Var3.f100995c, l2Var3.f100994b, 4, l2Var3.f100993a, raVar, new com.tencent.mm.plugin.fav.ui.gallery.d2(l2Var3));
        l2Var3.f100996d = x1Var;
        x1Var.f101107m = new com.tencent.mm.plugin.fav.ui.gallery.e2(l2Var3);
        x1Var.f101108n = l2Var3.f100998f;
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(l2Var3.f100996d.f101112r);
        recyclerView2.setAdapter(l2Var3.f100996d);
        ((com.tencent.mm.plugin.fav.ui.gallery.l2) this.f100941a).f100996d.f101109o = this.f100954n;
        this.f100942b.setHasFixedSize(true);
        this.f100942b.setOnScrollListener(new com.tencent.mm.plugin.fav.ui.gallery.l0(this));
        this.f100942b.i(new com.tencent.mm.plugin.fav.ui.gallery.n0(this));
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.select_btn)).setOnClickListener(v0Var);
        this.f100946f.setTag(0);
        this.f100946f.setOnClickListener(w0Var);
        this.f100947g.setTag(1);
        this.f100947g.setOnClickListener(w0Var);
        w82.k kVar = new w82.k();
        this.f100943c = kVar;
        kVar.a(view.findViewById(com.tencent.mm.R.id.dva));
        this.f100943c.f443903k = new com.tencent.mm.plugin.fav.ui.gallery.t0(this);
        com.tencent.mm.plugin.fav.ui.gallery.x1 x1Var2 = ((com.tencent.mm.plugin.fav.ui.gallery.l2) this.f100941a).f100996d;
        x1Var2.f101114t = new com.tencent.mm.plugin.fav.ui.gallery.o0(this);
        com.tencent.mm.plugin.fav.ui.gallery.q2 q2Var = new com.tencent.mm.plugin.fav.ui.gallery.q2(activity, x1Var2, new yz5.a() { // from class: com.tencent.mm.plugin.fav.ui.gallery.h0$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.tencent.mm.plugin.fav.ui.gallery.h0.this.a());
            }
        });
        this.f100959s = q2Var;
        androidx.recyclerview.widget.RecyclerView rv6 = this.f100942b;
        kotlin.jvm.internal.o.g(rv6, "rv");
        q2Var.f101067v = rv6;
        rv6.P(q2Var);
        com.tencent.mars.xlog.Log.i("SwipeMultiSelectTouchListener", "Attached to RecyclerView");
    }

    public boolean a() {
        com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var = this.f100941a;
        if (y1Var == null) {
            return false;
        }
        ((com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var).getClass();
        return com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100919b;
    }

    public void b(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryUI", "[onDataLoaded] isFirst:%s addCount:%s mIntentPos:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f100950j));
        if (this.f100955o != null) {
            this.f100955o.D5((int) (java.lang.System.currentTimeMillis() - this.f100956p), i17);
        }
        if (!z17) {
            if (i17 > 0) {
                this.f100942b.getAdapter().notifyDataSetChanged();
                return;
            } else {
                this.f100942b.getAdapter().notifyItemChanged(0);
                return;
            }
        }
        f(false, null);
        this.f100942b.getAdapter().notifyDataSetChanged();
        int i18 = this.f100950j;
        if (i18 <= 0) {
            this.f100942b.getAdapter().getItemCount();
        } else if (i18 % 4 == 0) {
            this.f100950j = i18 + 1;
        }
        if (i17 > 0) {
            this.f100945e.setVisibility(8);
            this.f100942b.setVisibility(0);
        } else {
            this.f100945e.setVisibility(0);
            this.f100942b.setVisibility(8);
            this.f100945e.setText(this.f100952l.getString(com.tencent.mm.R.string.cbo));
        }
    }

    public void c() {
        com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var = this.f100941a;
        if (y1Var != null) {
            com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = (com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var;
            com.tencent.mm.plugin.fav.ui.gallery.z1 z1Var = l2Var.f100993a;
            if (z1Var != null) {
                ((com.tencent.mm.plugin.fav.ui.gallery.h0) z1Var).f100941a = null;
                l2Var.f100993a = null;
            }
            com.tencent.mm.plugin.fav.ui.gallery.f1 f1Var = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a;
            f1Var.f100920c.clear();
            f1Var.b();
            f1Var.f100919b = false;
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(l2Var.f100996d.f101112r);
        }
        com.tencent.mm.plugin.fav.ui.gallery.o oVar = this.f100957q;
        if (oVar != null) {
            if (oVar.f101027n) {
                oVar.f101028o = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Cancel requested, current progress: " + oVar.f101025i.get() + '/' + oVar.f101026m);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Cancel called but not processing");
            }
            oVar.b();
            oVar.h();
            oVar.f101031r.post(new com.tencent.mm.plugin.fav.ui.gallery.b(oVar));
            this.f100957q = null;
        }
        com.tencent.mm.plugin.fav.ui.gallery.q2 q2Var = this.f100959s;
        if (q2Var != null) {
            if (q2Var.f101069x) {
                q2Var.f101069x = false;
                q2Var.f101068w.removeCallbacks(q2Var.B);
            }
            q2Var.e();
            androidx.recyclerview.widget.RecyclerView recyclerView = q2Var.f101067v;
            if (recyclerView != null) {
                recyclerView.U0(q2Var);
            }
            q2Var.f101067v = null;
            q2Var.f101061p = kz5.r0.f314002d;
            q2Var.f101059n = -1;
            q2Var.f101060o = -1;
            q2Var.f101066u = -1;
            this.f100959s = null;
        }
    }

    public void d() {
        kj.m mVar;
        com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollEnable(), this.f100951k);
        this.f100951k = 0;
        if (ih.d.c() && ih.d.d().a(dj.b.class) != null && (mVar = ((dj.b) ih.d.d().a(dj.b.class)).f232817n) != null) {
            this.f100961u = java.lang.Math.max(0L, ((int) mVar.f308243e) - this.f100961u);
        }
        this.f100962v = com.tencent.mm.sdk.platformtools.t8.i1() > this.f100962v ? com.tencent.mm.sdk.platformtools.t8.i1() - this.f100962v : 1L;
        com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().reportFPS(703, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollAction(), 1, this.f100961u, this.f100962v);
        this.f100961u = 0L;
        this.f100962v = 0L;
    }

    public void e() {
        kj.m mVar;
        this.f100962v = com.tencent.mm.sdk.platformtools.t8.i1();
        if (ih.d.c() && ih.d.d().a(dj.b.class) != null && (mVar = ((dj.b) ih.d.d().a(dj.b.class)).f232817n) != null) {
            this.f100961u = (int) mVar.f308243e;
        }
        com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var = this.f100941a;
        if (y1Var != null) {
            com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = (com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var;
            if (l2Var.f100999g) {
                com.tencent.mm.plugin.fav.ui.gallery.f1 f1Var = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a;
                if (f1Var.f100919b) {
                    ((com.tencent.mm.plugin.fav.ui.gallery.h0) l2Var.f100993a).k(f1Var.f100918a.size());
                    l2Var.f100996d.notifyDataSetChanged();
                }
            }
        }
        if (this.f100949i) {
            if (this.f100941a == null || !com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100919b) {
                i();
            } else {
                j();
            }
        }
        this.f100949i = false;
    }

    public final void f(boolean z17, java.lang.String str) {
        if (z17) {
            android.app.Activity activity = this.f100952l;
            if (str == null) {
                str = activity.getString(com.tencent.mm.R.string.ggc);
            }
            this.f100948h = com.tencent.mm.ui.widget.dialog.u3.f(activity, str, true, 0, null);
            return;
        }
        android.app.ProgressDialog progressDialog = this.f100948h;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f100948h.dismiss();
    }

    public void g(int i17) {
        android.view.View view = this.f100953m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void h() {
        boolean z17;
        java.util.ArrayList arrayList = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100918a;
        if (arrayList == null || arrayList.size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MediaHistoryGalleryUI", "[startBatchSave] No items selected");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = (com.tencent.mm.plugin.fav.ui.gallery.b1) it.next();
            if (b1Var.d() || b1Var.c() || b1Var.f100898b.I == 2) {
                arrayList2.add(b1Var);
            }
        }
        if (arrayList2.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MediaHistoryGalleryUI", "[startBatchSave] No image or video items to save");
            return;
        }
        if (this.f100957q == null) {
            this.f100957q = new com.tencent.mm.plugin.fav.ui.gallery.o(this.f100952l, new com.tencent.mm.plugin.fav.ui.gallery.u0(this));
        }
        com.tencent.mm.plugin.fav.ui.gallery.o oVar = this.f100957q;
        oVar.getClass();
        boolean z18 = oVar.f101027n;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = oVar.f101025i;
        if (z18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavDataBatchSaveLogic", "[saveMultipleFavDataItems] Already processing, current progress: " + atomicInteger.get() + '/' + oVar.f101026m);
            return;
        }
        if (arrayList2.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavDataBatchSaveLogic", "[saveMultipleFavDataItems] No fav data items to save");
            return;
        }
        java.util.Iterator it6 = arrayList2.iterator();
        double d17 = 0.0d;
        while (it6.hasNext()) {
            d17 += ((((com.tencent.mm.plugin.fav.ui.gallery.b1) it6.next()).f100898b != null ? r8.R : 0L) / 1024.0d) / 1024.0d;
        }
        try {
            double usableSpace = (android.os.Environment.getExternalStorageDirectory().getUsableSpace() / 1024.0d) / 1024.0d;
            z17 = usableSpace >= d17;
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDataBatchSaveLogic", "[checkAvailableStorageSpace] freeSpace=" + usableSpace + "MB, required=" + d17 + "MB, isEnough=" + z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavDataBatchSaveLogic", "[checkAvailableStorageSpace] Failed to check storage space", e17);
            z17 = true;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = oVar.f101031r;
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavDataBatchSaveLogic", "[saveMultipleFavDataItems] Insufficient storage space, required=" + d17 + "MB");
            n3Var.post(new com.tencent.mm.plugin.fav.ui.gallery.l(oVar));
            return;
        }
        oVar.f101027n = true;
        oVar.f101028o = false;
        atomicInteger.set(0);
        oVar.f101026m = arrayList2.size();
        ((java.util.ArrayList) oVar.f101024h).clear();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) oVar.f101022f;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        if (!oVar.f101033t) {
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(oVar);
            oVar.f101033t = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDataBatchSaveLogic", "[saveMultipleFavDataItems] CDN listener registered");
        }
        java.util.Iterator it7 = arrayList2.iterator();
        int i17 = 0;
        int i18 = 0;
        while (it7.hasNext()) {
            com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var2 = (com.tencent.mm.plugin.fav.ui.gallery.b1) it7.next();
            r45.gp0 gp0Var = b1Var2.f100898b;
            if (gp0Var != null && gp0Var.I == 2) {
                i17++;
            } else if (oVar.d(b1Var2)) {
                i18++;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Start batch save: total=" + oVar.f101026m + ", images=" + i17 + ", videos=" + i18 + ", requiredSpace=" + d17 + "MB");
        n3Var.post(new com.tencent.mm.plugin.fav.ui.gallery.j(oVar));
        oVar.g();
    }

    public void i() {
        com.tencent.mars.xlog.Log.i("FavMediaHistoryGallery", "toNormalMode: exiting multi-select mode");
        com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var = this.f100941a;
        if (y1Var != null) {
            com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = (com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var;
            l2Var.f100996d.f101113s = false;
            com.tencent.mm.plugin.fav.ui.gallery.f1 f1Var = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a;
            f1Var.b();
            f1Var.f100919b = false;
            l2Var.f100996d.notifyDataSetChanged();
        }
        this.f100943c.c();
        if (this.f100963w == null) {
            com.tencent.mars.xlog.Log.w("FavMediaHistoryGallery", "toNormalMode: titleAndSelectionListener is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("FavMediaHistoryGallery", "toNormalMode: notifying onSelectedModeChanged(false) and onTitleChanged(null)");
        ((com.tencent.mm.plugin.fav.ui.t9) this.f100963w).b(false);
        ((com.tencent.mm.plugin.fav.ui.t9) this.f100963w).a(false);
        ((com.tencent.mm.plugin.fav.ui.t9) this.f100963w).c(null);
    }

    public void j() {
        com.tencent.mm.plugin.fav.ui.gallery.a1 a1Var;
        com.tencent.mars.xlog.Log.i("FavMediaHistoryGallery", "toSelectedMode: entering multi-select mode");
        com.tencent.mm.plugin.fav.ui.gallery.a1 a1Var2 = this.f100960t;
        if (a1Var2 != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_mc_btn", "view_clk", a1Var2.b(), 32903);
        }
        com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var = this.f100941a;
        if (y1Var != null) {
            com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = (com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var;
            l2Var.f100996d.f101113s = true;
            com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100919b = true;
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = (androidx.recyclerview.widget.GridLayoutManager) l2Var.c(l2Var.f100995c);
            int w17 = gridLayoutManager.w();
            l2Var.f100996d.notifyItemRangeChanged(w17, (gridLayoutManager.y() - w17) + 1, 0);
        }
        boolean z17 = this.f100958r && o72.c2.f343317a.b();
        this.f100943c.d(false, false, false, !z17);
        this.f100943c.b(false);
        if (z17 && (a1Var = this.f100960t) != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_download_btn", "view_exp", a1Var.b(), 32903);
        }
        if (this.f100963w == null) {
            com.tencent.mars.xlog.Log.w("FavMediaHistoryGallery", "toSelectedMode: titleAndSelectionListener is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("FavMediaHistoryGallery", "toSelectedMode: notifying onSelectedModeChanged(true)");
        ((com.tencent.mm.plugin.fav.ui.t9) this.f100963w).b(true);
        com.tencent.mm.plugin.fav.ui.gallery.a1 a1Var3 = this.f100960t;
        if (a1Var3 != null) {
            a1Var3.f100893b = 0;
            com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var2 = this.f100941a;
            if (y1Var2 != null) {
                this.f100960t.a(((com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var2).d());
            }
        }
    }

    public void k(int i17) {
        if (a()) {
            this.f100943c.b(i17 > 0);
            if (i17 > 0) {
                java.lang.String format = java.lang.String.format(this.f100952l.getString(com.tencent.mm.R.string.nxi), java.lang.Integer.valueOf(i17));
                com.tencent.mm.plugin.fav.ui.gallery.z0 z0Var = this.f100963w;
                if (z0Var != null) {
                    ((com.tencent.mm.plugin.fav.ui.t9) z0Var).c(format);
                }
            } else {
                com.tencent.mm.plugin.fav.ui.gallery.z0 z0Var2 = this.f100963w;
                if (z0Var2 != null) {
                    ((com.tencent.mm.plugin.fav.ui.t9) z0Var2).c(null);
                }
            }
            if (this.f100963w == null) {
                com.tencent.mars.xlog.Log.w("FavMediaHistoryGallery", "titleAndSelectionListener is null");
                return;
            }
            com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var = this.f100941a;
            if (y1Var != null) {
                boolean d17 = ((com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var).d();
                com.tencent.mm.plugin.fav.ui.gallery.a1 a1Var = this.f100960t;
                if (a1Var != null) {
                    a1Var.a(d17);
                }
                ((com.tencent.mm.plugin.fav.ui.t9) this.f100963w).a(d17);
            }
        }
    }
}
