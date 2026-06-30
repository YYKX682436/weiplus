package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes2.dex */
public final class y extends com.tencent.mm.ui.component.UIComponent implements zy2.d9 {

    /* renamed from: d, reason: collision with root package name */
    public long f105186d;

    /* renamed from: e, reason: collision with root package name */
    public long f105187e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.vas.VASCommonFragment f105188f;

    /* renamed from: g, reason: collision with root package name */
    public gx2.q f105189g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f105190h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f105191i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.vas.VASCommonFragment f105192m;

    /* renamed from: n, reason: collision with root package name */
    public gx2.q f105193n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.FrameLayout f105194o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f105195p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f105196q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f105191i = getActivity().getIntent().getBooleanExtra("native_drama_open_drawer", false);
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f105195p = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127756id).getValue()).r()).booleanValue();
        this.f105196q = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public final void O6() {
        if (this.f105189g == null) {
            android.view.View decorView = getActivity().getWindow().getDecorView();
            kotlin.jvm.internal.i iVar = null;
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup == null) {
                return;
            }
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(com.tencent.mm.R.id.tfd);
            frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
            this.f105190h = frameLayout;
            int k17 = i65.a.k(getContext()) + com.tencent.mm.ui.bk.p(getContext());
            float a17 = kx2.a.f313278a.a(getContext());
            float dimension = getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479726di);
            float f17 = k17 * a17;
            if (dimension < f17) {
                dimension = f17;
            }
            gx2.a aVar = new gx2.a();
            aVar.f277337c = dimension;
            aVar.f277338d = new hx2.g(getContext(), 0, 0, 0, false, false, 62, null);
            android.widget.FrameLayout frameLayout2 = this.f105190h;
            kotlin.jvm.internal.o.d(frameLayout2);
            aVar.f277339e = new hx2.c(frameLayout2);
            aVar.f277340f = new hx2.b(getContext(), false, 2, iVar);
            aVar.a(new com.tencent.mm.plugin.finder.drama.detail.q(this));
            this.f105189g = aVar.b(viewGroup);
        }
    }

    public final void P6() {
        gx2.q qVar = this.f105193n;
        if (qVar != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, false, null, false, null, 15, null);
        }
        gx2.q qVar2 = this.f105189g;
        if (qVar2 != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar2, false, null, false, null, 15, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        gx2.q qVar = this.f105193n;
        boolean z17 = false;
        if (qVar != null && qVar.isDrawerOpen) {
            if (qVar != null) {
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, false, null, false, null, 15, null);
            }
            return true;
        }
        gx2.q qVar2 = this.f105189g;
        if (qVar2 != null && qVar2.isDrawerOpen) {
            z17 = true;
        }
        if (!z17) {
            return super.onBackPressed();
        }
        if (qVar2 != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar2, false, null, false, null, 15, null);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f105189g = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f105191i = getActivity().getIntent().getBooleanExtra("native_drama_open_drawer", false);
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f105195p = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127756id).getValue()).r()).booleanValue();
        this.f105196q = new java.util.concurrent.CopyOnWriteArrayList();
    }
}
