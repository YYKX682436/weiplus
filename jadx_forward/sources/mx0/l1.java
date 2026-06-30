package mx0;

/* loaded from: classes5.dex */
public final class l1 implements yt3.r2, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f413653d;

    /* renamed from: e, reason: collision with root package name */
    public final mx0.z f413654e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f413655f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f413656g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f413657h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f413658i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f413659m;

    public l1(android.view.ViewGroup bottomContainer, mx0.z controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomContainer, "bottomContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f413653d = bottomContainer;
        this.f413654e = controller;
        jz5.i iVar = jz5.i.f384364f;
        this.f413655f = jz5.h.a(iVar, new mx0.j1(this));
        this.f413656g = jz5.h.a(iVar, new mx0.i1(this));
        this.f413657h = jz5.h.a(iVar, new mx0.k1(this));
        this.f413658i = jz5.h.a(iVar, new mx0.f1(this));
    }

    public final void a() {
        android.view.View view = (android.view.View) this.f413655f.mo141623x754a37bb();
        if (view != null) {
            view.setEnabled(false);
        }
        android.view.View view2 = (android.view.View) this.f413656g.mo141623x754a37bb();
        if (view2 != null) {
            view2.setEnabled(false);
        }
        android.view.View view3 = (android.view.View) this.f413657h.mo141623x754a37bb();
        if (view3 != null) {
            view3.setEnabled(false);
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94 c17 = c();
        if (c17 != null) {
            c17.setEnabled(false);
        }
        android.view.ViewGroup viewGroup = this.f413653d;
        viewGroup.animate().cancel();
        viewGroup.animate().alpha(0.8f).setDuration(300L).start();
    }

    public final void b() {
        android.view.View view = (android.view.View) this.f413655f.mo141623x754a37bb();
        if (view != null) {
            view.setEnabled(true);
        }
        android.view.View view2 = (android.view.View) this.f413656g.mo141623x754a37bb();
        if (view2 != null) {
            view2.setEnabled(true);
        }
        android.view.View view3 = (android.view.View) this.f413657h.mo141623x754a37bb();
        if (view3 != null) {
            view3.setEnabled(true);
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94 c17 = c();
        if (c17 != null) {
            c17.setEnabled(true);
        }
        android.view.ViewGroup viewGroup = this.f413653d;
        viewGroup.animate().cancel();
        viewGroup.animate().alpha(1.0f).setDuration(300L).start();
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94 c() {
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94) this.f413658i.mo141623x754a37bb();
    }

    public final void d(boolean z17) {
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.j5(m7Var, !z17, null), 3, null);
        int i17 = z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.cws : com.p314xaae8f345.mm.R.C30861xcebc809e.da7;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94 c17 = c();
        if (c17 != null) {
            c17.m47408x8d516947(i17);
        }
        this.f413659m = z17;
    }

    public final void e() {
        android.view.View view = (android.view.View) this.f413655f.mo141623x754a37bb();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "showButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "showButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = (android.view.View) this.f413656g.mo141623x754a37bb();
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "showButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "showButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = (android.view.View) this.f413657h.mo141623x754a37bb();
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "showButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "showButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94 c17 = c();
        if (c17 == null) {
            return;
        }
        c17.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int id6 = view.getId();
        if (id6 == com.p314xaae8f345.mm.R.id.slz) {
            android.view.ViewGroup viewGroup = this.f413653d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(viewGroup.getContext(), 1, true);
            k0Var.q(i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.oio), 17);
            k0Var.f293405n = mx0.g1.f413520d;
            k0Var.f293414s = new mx0.h1(k0Var, this);
            k0Var.v();
        } else if (id6 == com.p314xaae8f345.mm.R.id.sly) {
            a();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) this.f413654e;
            c10977x8e40eced.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", "reportJump2VideoCropPageForMaterialImportPreview");
            ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.q5(m7Var, null), 3, null);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map Ai = m7Var.Ai();
            Ai.put("view_id", "sc_asset_generate_crop");
            ((cy1.a) rVar).yj("sc_asset_generate_crop", null, Ai, 6, false);
            yx0.b8 b8Var = c10977x8e40eced.f151090v;
            mx0.y5 y5Var = new mx0.y5(c10977x8e40eced);
            b8Var.getClass();
            mx0.e1 e1Var = b8Var.X1;
            if (e1Var != null) {
                if (e1Var.d()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaterialImportHelper", "enterImportCrop: importPreviewState " + e1Var.f413468b);
                    e1Var.f(mx0.d0.f413432m);
                    p3325xe03a0797.p3326xc267989b.l.d(e1Var.f413471e, null, null, new mx0.k0(e1Var, y5Var, null), 3, null);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaterialImportHelper", "enterImportCrop: importPreviewState " + e1Var.f413468b);
                    y5Var.mo146xb9724478(null);
                }
            }
        } else if (id6 == com.p314xaae8f345.mm.R.id.hqz) {
            a();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced2 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) this.f413654e;
            c10977x8e40eced2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", "reportJump2VideoPostPageForMaterialImportPreview");
            i95.m c17 = i95.n0.c(w40.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            w40.e.eh((w40.e) c17, "SCAssetGenerateToPost", "MJShootComposing", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ni(), 0, 8, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = c10977x8e40eced2.f151075J;
            if (c16993xacc19624 != null) {
                c10977x8e40eced2.v0(true, new mx0.b6(c16993xacc19624, c10977x8e40eced2, null));
            }
        } else if (id6 == com.p314xaae8f345.mm.R.id.slx) {
            ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
            yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            p3325xe03a0797.p3326xc267989b.l.d(m7Var2.Di(), null, null, new yy0.s5(m7Var2, null), 3, null);
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map Ai2 = m7Var2.Ai();
            Ai2.put("view_id", "sc_asset_generate_beauty_makeup");
            ((cy1.a) rVar2).yj("sc_asset_generate_beauty_makeup", null, Ai2, 6, false);
            a();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94 c18 = c();
            if (c18 != null) {
                c18.performHapticFeedback(6);
            }
            this.f413654e.mo47335xfcc16fb1(!this.f413659m);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f413653d.setVisibility(i17);
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        android.view.ViewGroup viewGroup = this.f413653d;
        viewGroup.addView(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571001eo5, viewGroup, false));
        android.view.View view = (android.view.View) this.f413655f.mo141623x754a37bb();
        if (view != null) {
            view.setOnClickListener(this);
        }
        android.view.View view2 = (android.view.View) this.f413656g.mo141623x754a37bb();
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        android.view.View view3 = (android.view.View) this.f413657h.mo141623x754a37bb();
        if (view3 != null) {
            view3.setOnClickListener(this);
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94 c17 = c();
        if (c17 != null) {
            c17.setOnClickListener(this);
        }
        d(this.f413659m);
        viewGroup.setVisibility(8);
    }
}
