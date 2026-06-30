package com.tencent.mm.plugin.appbrand.ui.privacy.revoke;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage;", "Lcom/tencent/mm/ui/MMFragment;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AppBrandUserInfoRevokePage extends com.tencent.mm.ui.MMFragment {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f89931g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f89932d;

    /* renamed from: e, reason: collision with root package name */
    public ck1.a f89933e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f89934f;

    public AppBrandUserInfoRevokePage() {
        super(true);
        this.f89932d = jz5.h.a(jz5.i.f302831f, new ck1.h(this));
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.f488108hd;
    }

    public final ck1.s0 l0() {
        return (ck1.s0) this.f89932d.getValue();
    }

    public final void m0(ck1.a aVar) {
        if (this.f89933e == aVar) {
            return;
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "showActionbarDefault");
            setMMTitle("");
            ak1.f.b(this);
            ak1.f.e(this, b3.l.getColor(ak1.f.d(this), com.tencent.mm.R.color.f478491c));
        } else if (ordinal == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "showActionbarWithTitle");
            setMMTitle(com.tencent.mm.R.string.a09);
            com.tencent.mm.ui.MMActivity a17 = ak1.f.a(this);
            if (a17 != null) {
                a17.showActionbarLine();
            }
            ak1.f.e(this, b3.l.getColor(ak1.f.d(this), com.tencent.mm.R.color.f478489a));
        }
        this.f89933e = aVar;
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getStringExtra("appId");
        if (stringExtra == null || stringExtra.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "checkContextOnCreateEarly, appId is empty");
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        setBackBtn(new ck1.c(this));
        m0(ck1.a.f42301d);
        ak1.f.f(this, b3.l.getColor(ak1.f.d(this), com.tencent.mm.R.color.f478491c));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485851jb3);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.Button");
        this.f89934f = (android.widget.Button) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.oum);
        androidx.recyclerview.widget.RecyclerView recyclerView = findViewById2 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) findViewById2 : null;
        if (recyclerView == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "initContentArea, findViewById return null");
            finish();
            return;
        }
        recyclerView.setFadingEdgeLength(getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ajf));
        recyclerView.setVerticalFadingEdgeEnabled(true);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext());
        ck1.k0 k0Var = new ck1.k0(this, new ck1.g(recyclerView, this));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(k0Var);
        zk1.m.f473414l.a(recyclerView, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : true, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        l0().f42375f.observe(getViewLifecycleOwner(), new ck1.e(recyclerView, this, k0Var, linearLayoutManager));
    }
}
