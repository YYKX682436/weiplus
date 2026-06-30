package mx0;

/* loaded from: classes5.dex */
public final class o1 implements android.view.View.OnClickListener, yt3.r2, t23.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f413715d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f413716e;

    /* renamed from: f, reason: collision with root package name */
    public mx0.z f413717f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Bundle f413718g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f413719h;

    /* renamed from: i, reason: collision with root package name */
    public int f413720i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f413721m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f413722n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f413723o;

    public o1(android.view.View materialImportBtn, android.widget.ImageView materialImageView, mx0.z zVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialImportBtn, "materialImportBtn");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialImageView, "materialImageView");
        this.f413715d = materialImportBtn;
        this.f413716e = materialImageView;
        this.f413717f = zVar;
        this.f413718g = new android.os.Bundle();
        this.f413719h = materialImageView.getContext();
        this.f413720i = 3;
        materialImportBtn.setOnClickListener(this);
    }

    public final void a() {
        android.view.View view = this.f413715d;
        view.setEnabled(false);
        if (view.getVisibility() != 0) {
            return;
        }
        view.animate().cancel();
        view.animate().alpha(0.7f).setDuration(300L).start();
    }

    public final void b() {
        android.view.View view = this.f413715d;
        view.setEnabled(true);
        if (view.getVisibility() != 0) {
            return;
        }
        view.animate().cancel();
        view.animate().alpha(1.0f).setDuration(300L).start();
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 mediaItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaItem, "mediaItem");
        mediaItem.o();
        android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.CENTER_CROP;
        android.widget.ImageView imageView = this.f413716e;
        imageView.setScaleType(scaleType);
        imageView.setForeground(j65.q.a(imageView.getContext()).getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bbj, null));
        e33.m6.d(this.f413716e, mediaItem.mo63659xfb85f7b0(), mediaItem.o(), mediaItem.f219963e, mediaItem.f219967i, new mx0.n1(), mediaItem.f219968m);
        this.f413723o = mediaItem;
        yz5.l lVar = this.f413722n;
        if (lVar != null) {
            lVar.mo146xb9724478(mediaItem);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        mx0.z zVar;
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportUIPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        a();
        if (view != null) {
            by0.c cVar = by0.c.f117856a;
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (cVar.a(context) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaterialImportPlugin", "openAlbum: ");
                mx0.z zVar2 = this.f413717f;
                boolean z18 = false;
                if (zVar2 != null) {
                    com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar2;
                    if (c10977x8e40eced.p0(c10977x8e40eced.mo47329x7a30592b())) {
                        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).Ri(java.lang.System.currentTimeMillis() - c10977x8e40eced.f151090v.D1);
                        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                        m7Var.Bj(1);
                        m7Var.sj(true);
                        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.p5(m7Var, null), 3, null);
                        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                        java.util.Map Ai = m7Var.Ai();
                        Ai.put("view_id", "sc_asset_generate_enter_album");
                        ((cy1.a) rVar).yj("sc_asset_generate_enter_album", null, Ai, 6, false);
                        c10977x8e40eced.f151090v.D1 = 0L;
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        z18 = true;
                    }
                }
                if (z18 && (zVar = this.f413717f) != null) {
                    ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar).O0(ma1.n.f72807x366c91de);
                }
                b();
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportUIPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaterialImportPlugin", "openAlbum: activity is null ");
        b();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportUIPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        t23.p0.k().f(this);
        t23.n1 n1Var = t23.p0.k().f496829e;
        if (n1Var != null) {
            ((t23.f) n1Var).f496677g = true;
        }
        this.f413717f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    @Override // yt3.r2
    /* renamed from: setVisibility */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9067x901b6914(int r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.o1.mo9067x901b6914(int):void");
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.h(this.f413719h, "android.permission.READ_EXTERNAL_STORAGE")) {
            t23.p0.k().g(3);
            t23.p0.k().f496830f = 39;
            t23.p0.k().b(this);
            t23.p0.k().e(null, 3, java.lang.System.currentTimeMillis());
        }
        byte[] byteArray = configProvider.M.getByteArray("KEY_POST_ASYNC_ASSET_INFO");
        if (byteArray != null) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(byteArray.length);
            allocateDirect.put(byteArray);
            allocateDirect.flip();
            vt3.l lVar = vt3.l.f521538a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AssetInfoStatistics", "loadBinaryBuffer");
            lVar.c(new vt3.e(allocateDirect));
        }
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        if (linkedList != null) {
            linkedList.size();
        }
        if (linkedList == null || (abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) kz5.n0.a0(linkedList, 0)) == null) {
            return;
        }
        t23.p0.k().f(this);
        t23.p0.n().c(new mx0.m1(this, abstractC15633xee433078));
    }
}
