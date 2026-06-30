package com.tencent.mm.mj_publisher.finder.shoot_composing.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/fragment/MaterialImportPreviewFragment;", "Lcom/tencent/mm/mj_publisher/finder/shoot_composing/fragment/BaseRecordFragment;", "<init>", "()V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MaterialImportPreviewFragment extends com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.BaseRecordFragment {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f69642z = 0;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f69643d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.r0 f69644e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f69645f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f69646g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f69647h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f69648i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f69649m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f69650n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f69651o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f69652p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f69653q;

    /* renamed from: r, reason: collision with root package name */
    public long f69654r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f69655s;

    /* renamed from: t, reason: collision with root package name */
    public int f69656t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f69657u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f69658v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f69659w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f69660x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f69661y;

    public MaterialImportPreviewFragment() {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f69643d = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        int i17 = kotlinx.coroutines.r0.N0;
        this.f69644e = new px0.b0(kotlinx.coroutines.q0.f310567d);
        this.f69645f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigAsyncAIGCGeneratePlaceHolderEnable()) == 1;
        jz5.i iVar = jz5.i.f302831f;
        this.f69647h = jz5.h.a(iVar, new px0.a(this));
        this.f69648i = jz5.h.a(iVar, new px0.b(this));
        this.f69649m = jz5.h.a(iVar, new px0.z(this));
        this.f69650n = jz5.h.a(iVar, new px0.f0(this));
        this.f69651o = jz5.h.a(iVar, new px0.e0(this));
        this.f69652p = jz5.h.a(iVar, new px0.w(this));
        this.f69655s = "";
        this.f69659w = jz5.h.b(new px0.y(this));
        this.f69660x = jz5.h.b(new px0.d0(this));
        this.f69661y = jz5.h.b(new px0.x(this));
    }

    public static final void j0(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        android.content.Context context = materialImportPreviewFragment.getContext();
        if (context != null) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var.f211776c = context.getString(com.tencent.mm.R.string.oiq);
            e4Var.c();
        }
    }

    public final void l0() {
        yx0.b8 f69557v;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f69653q;
        if (shootComposingPluginLayout == null || (f69557v = shootComposingPluginLayout.getF69557v()) == null) {
            return;
        }
        ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(this.f69643d, this.f69644e, null, new px0.q(this, f69557v, new kotlin.jvm.internal.h0(), null), 2, null)).p(new px0.r(this));
    }

    public final void m0(java.lang.String str, boolean z17, java.lang.String str2, int i17) {
        java.lang.String str3;
        java.lang.CharSequence text;
        jz5.l[] lVarArr = new jz5.l[3];
        android.widget.TextView textView = (android.widget.TextView) this.f69652p.getValue();
        if (textView == null || (text = textView.getText()) == null || (str3 = text.toString()) == null) {
            str3 = "";
        }
        lVarArr[0] = new jz5.l("aigc_wait_text", str3);
        lVarArr[1] = new jz5.l("aigc_wait_time", java.lang.Integer.valueOf(this.f69656t * 1000));
        lVarArr[2] = new jz5.l("aigc_already_wait_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f69654r));
        java.util.Map l17 = kz5.c1.l(lVarArr);
        if (z17) {
            l17.put(str2, java.lang.Integer.valueOf(i17));
        }
        java.lang.String str4 = z17 ? "view_clk" : "view_exp";
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((cy1.a) ((dy1.r) c17)).Bj(str, str4, kz5.c1.m(l17, (java.util.Map) ((jz5.n) this.f69661y).getValue()), 1, false);
    }

    public final void n0(java.lang.String str, java.lang.String str2, boolean z17) {
        if (getContext() != null) {
            android.widget.TextView textView = (android.widget.TextView) this.f69650n.getValue();
            if (textView != null) {
                textView.setText(str);
            }
            android.widget.TextView textView2 = (android.widget.TextView) this.f69651o.getValue();
            if (textView2 != null) {
                textView2.setText(str2);
            }
            android.widget.TextView textView3 = (android.widget.TextView) this.f69652p.getValue();
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(z17 ? 0 : 8);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.BaseRecordFragment
    public boolean onBackPressed() {
        androidx.fragment.app.i2 beginTransaction = getParentFragmentManager().beginTransaction();
        beginTransaction.j(this);
        beginTransaction.g();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(inflater, "inflater");
        this.f69655s = "";
        this.f69646g = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489466eo3, (android.view.ViewGroup) null, false);
        jz5.g gVar = this.f69648i;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) gVar.getValue();
        if (weImageView != null) {
            weImageView.setEnableColorFilter(false);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) gVar.getValue();
        if (weImageView2 != null) {
            weImageView2.setOnClickListener(new px0.s(this));
        }
        android.widget.TextView textView = (android.widget.TextView) this.f69652p.getValue();
        if (textView != null) {
            textView.setOnClickListener(new px0.t(this));
        }
        android.view.View view = this.f69646g;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = view instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) view : null;
        if (constraintLayout != null) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.d(constraintLayout);
            cVar.c(com.tencent.mm.R.id.sc9, 4);
            cVar.f(com.tencent.mm.R.id.sc9, 4, 0, 4, 0);
            cVar.b(constraintLayout);
            constraintLayout.setConstraintSet(null);
            int dimensionPixelSize = j65.q.a(getContext()).getDimensionPixelSize(com.tencent.mm.R.dimen.afo);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.g3 a17 = n3.b1.a(constraintLayout);
            e3.d a18 = a17 != null ? a17.a(2) : null;
            int c17 = a18 != null ? a18.f247047d - a18.f247045b : com.tencent.mm.ui.bl.c(constraintLayout.getContext());
            android.view.View view2 = (android.view.View) this.f69647h.getValue();
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                layoutParams.height = dimensionPixelSize + c17;
            }
        }
        return this.f69646g;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f69657u;
        if (k0Var != null) {
            k0Var.u();
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f69658v;
        if (k0Var2 != null) {
            k0Var2.u();
        }
        kotlinx.coroutines.z0.d(this.f69643d, "Fragment view destroyed", null, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        yx0.b8 f69557v;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        android.widget.TextView textView = (android.widget.TextView) this.f69651o.getValue();
        if (textView != null) {
            textView.addOnLayoutChangeListener(new px0.u(this));
        }
        jz5.g gVar = this.f69649m;
        com.tencent.mm.view.RingProgressView ringProgressView = (com.tencent.mm.view.RingProgressView) gVar.getValue();
        if (ringProgressView != null) {
            ringProgressView.setEnableAnimation(true);
        }
        com.tencent.mm.view.RingProgressView ringProgressView2 = (com.tencent.mm.view.RingProgressView) gVar.getValue();
        if (ringProgressView2 != null) {
            ringProgressView2.a(1);
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f493133oi3);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.p_q);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        n0(string, string2, false);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f69653q;
        if (shootComposingPluginLayout != null && (f69557v = shootComposingPluginLayout.getF69557v()) != null) {
            f69557v.f467200y.observe(getViewLifecycleOwner(), new px0.v(this));
        }
        this.f69654r = java.lang.System.currentTimeMillis();
        android.widget.TextView textView2 = (android.widget.TextView) this.f69652p.getValue();
        if (textView2 == null) {
            return;
        }
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cy1.a aVar = (cy1.a) ((dy1.r) c17);
        aVar.pk(textView2, "aigc_reminder_complete");
        aVar.Tj(textView2, 40, 1, false);
        aVar.Ai(textView2, new px0.m(textView2, this));
    }

    public MaterialImportPreviewFragment(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingViewModel) {
        kotlin.jvm.internal.o.g(shootComposingViewModel, "shootComposingViewModel");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f69643d = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        int i17 = kotlinx.coroutines.r0.N0;
        this.f69644e = new px0.c0(kotlinx.coroutines.q0.f310567d);
        this.f69645f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigAsyncAIGCGeneratePlaceHolderEnable()) == 1;
        jz5.i iVar = jz5.i.f302831f;
        this.f69647h = jz5.h.a(iVar, new px0.a(this));
        this.f69648i = jz5.h.a(iVar, new px0.b(this));
        this.f69649m = jz5.h.a(iVar, new px0.z(this));
        this.f69650n = jz5.h.a(iVar, new px0.f0(this));
        this.f69651o = jz5.h.a(iVar, new px0.e0(this));
        this.f69652p = jz5.h.a(iVar, new px0.w(this));
        this.f69655s = "";
        this.f69659w = jz5.h.b(new px0.y(this));
        this.f69660x = jz5.h.b(new px0.d0(this));
        this.f69661y = jz5.h.b(new px0.x(this));
        this.f69653q = shootComposingViewModel;
    }
}
