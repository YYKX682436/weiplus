package at2;

/* loaded from: classes3.dex */
public final class y1 extends com.tencent.mm.plugin.finder.live.plugin.l implements android.view.View.OnClickListener {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f13780p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar f13781q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f13782r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f13783s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f13784t;

    /* renamed from: u, reason: collision with root package name */
    public int f13785u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f13780p = "ReplayerSeekbarPlugin";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.lym);
        ((com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar) findViewById).setContentDescription(root.getContext().getString(com.tencent.mm.R.string.eax));
        kotlin.jvm.internal.o.f(findViewById, "also(...)");
        com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar = (com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar) findViewById;
        this.f13781q = finderLiveReplaySeekbar;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.lyn);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2).setContentDescription(root.getContext().getString(com.tencent.mm.R.string.eaz));
        kotlin.jvm.internal.o.f(findViewById2, "also(...)");
        this.f13782r = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.lyo);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f13783s = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.lyp);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f13784t = (android.widget.TextView) findViewById4;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            finderLiveReplaySeekbar.setMaxHeight(x0() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480419xe));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        ((java.util.ArrayList) this.f13781q.f124928p).clear();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        at2.u1 u1Var;
        dt2.d0 uiClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/plugin/ReplayerSeekbarPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.lyn && (u1Var = (at2.u1) X0(at2.u1.class)) != null) {
            com.tencent.mm.plugin.finder.live.view.k0 R0 = R0();
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = R0 instanceof com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout ? (com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout) R0 : null;
            if (finderLiveReplayPluginLayout != null && (uiClickListener = finderLiveReplayPluginLayout.getUiClickListener()) != null) {
                uiClickListener.a(!u1Var.u1());
            }
            boolean u17 = u1Var.u1();
            android.view.ViewGroup viewGroup = this.f365323d;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f13782r;
            if (u17) {
                android.graphics.drawable.Drawable drawable = viewGroup.getContext().getDrawable(com.tencent.mm.R.raw.icons_filled_play);
                com.tencent.mm.ui.uk.f(drawable, -1);
                weImageView.setImageDrawable(drawable);
                dt2.a0 a0Var = u1Var.f13762q;
                if (a0Var != null) {
                    a0Var.d();
                }
                weImageView.setContentDescription(viewGroup.getContext().getString(com.tencent.mm.R.string.eau));
            } else {
                android.graphics.drawable.Drawable drawable2 = viewGroup.getContext().getDrawable(com.tencent.mm.R.raw.icons_filled_pause);
                com.tencent.mm.ui.uk.f(drawable2, -1);
                weImageView.setImageDrawable(drawable2);
                u1Var.v1(null, false);
                weImageView.setContentDescription(viewGroup.getContext().getString(com.tencent.mm.R.string.eaz));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayerSeekbarPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final java.lang.String t1(java.lang.String str) {
        java.util.List x07 = kz5.n0.x0(r26.n0.f0(str, new java.lang.String[]{":"}, false, 0, 6, null));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.List i17 = kz5.c0.i("秒", "分钟", "小时");
        int size = x07.size();
        for (int i18 = 0; i18 < size; i18++) {
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) x07.get(i18), 0);
            if (P > 0) {
                sb6.insert(0, P + ((java.lang.String) i17.get(i18)));
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final void u1(float f17) {
        float S6 = ((ct2.j) P0(ct2.j.class)).S6();
        int a17 = (int) h3.a.a(f17 * S6, 0.0f, S6 - 1.0f);
        no0.l lVar = no0.m.f338730a;
        this.f13783s.setText(a17 >= 3600 ? no0.l.a(lVar, a17, ":", true, false, false, 24, null) : no0.l.a(lVar, a17, ":", false, false, false, 24, null));
    }

    public final void v1() {
        android.graphics.drawable.Drawable drawable = this.f365323d.getContext().getDrawable(com.tencent.mm.R.raw.icons_filled_play);
        com.tencent.mm.ui.uk.f(drawable, -1);
        this.f13782r.setImageDrawable(drawable);
        x1();
    }

    public final void w1() {
        android.graphics.drawable.Drawable drawable = this.f365323d.getContext().getDrawable(com.tencent.mm.R.raw.icons_filled_pause);
        com.tencent.mm.ui.uk.f(drawable, -1);
        this.f13782r.setImageDrawable(drawable);
    }

    public final void x1() {
        if (((ct2.j) P0(ct2.j.class)).D) {
            return;
        }
        K0(0);
    }

    public final void y1(int i17) {
        if (((ct2.j) P0(ct2.j.class)).S6() > 0) {
            x1();
            com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar = this.f13781q;
            finderLiveReplaySeekbar.setProgress((int) ((i17 / ((ct2.j) P0(ct2.j.class)).S6()) * finderLiveReplaySeekbar.getMax()));
            ws2.n1 n1Var = ws2.n1.f449105a;
            java.lang.String b17 = n1Var.b(i17);
            android.widget.TextView textView = this.f13783s;
            textView.setText(b17);
            android.view.ViewGroup viewGroup = this.f365323d;
            textView.setContentDescription(viewGroup.getContext().getString(com.tencent.mm.R.string.eav, t1(b17)));
            ct2.j jVar = (ct2.j) P0(ct2.j.class);
            int i18 = jVar.f222276t;
            if (i18 <= 0) {
                i18 = jVar.f222274r;
            }
            java.lang.String b18 = n1Var.b(i18);
            android.widget.TextView textView2 = this.f13784t;
            textView2.setText(b18);
            textView2.setContentDescription(viewGroup.getContext().getString(com.tencent.mm.R.string.f491809eb0, t1(b18)));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        at2.v1 v1Var = new at2.v1(this);
        com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar = this.f13781q;
        finderLiveReplaySeekbar.getClass();
        ((java.util.ArrayList) finderLiveReplaySeekbar.f124928p).add(v1Var);
        r45.i72 i72Var = (r45.i72) ((mm2.e1) P0(mm2.e1.class)).f328988r.getCustom(44);
        java.util.List<? extends r45.w94> list = i72Var != null ? i72Var.getList(7) : null;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        for (r45.w94 w94Var : list) {
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f327773d;
            java.lang.String jSONObject = ml2.z0.b(ml2.z0.f328330a, null, 1, null).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            ((ml2.j0) zbVar).Wj("watch_live_point_exp", jSONObject);
        }
        this.f13782r.setOnClickListener(this);
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        finderLiveReplaySeekbar.setFragmentPreview(new dt2.h(context));
        finderLiveReplaySeekbar.setFragmentItems(list);
        finderLiveReplaySeekbar.setBreakpointClickCallback(new at2.w1(this));
        finderLiveReplaySeekbar.setBreakPointDoubleClickCallback(new at2.x1(this));
        zl2.r4 r4Var = zl2.r4.f473950a;
        this.f113324f.post(new zl2.u0(this, true, true));
    }
}
