package com.tencent.mm.plugin.appbrand.ui.privacy.use_record;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/use_record/AppBrandPrivacyUseRecordPage;", "Lcom/tencent/mm/ui/MMFragment;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AppBrandPrivacyUseRecordPage extends com.tencent.mm.ui.MMFragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f89935e = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f89936d;

    public AppBrandPrivacyUseRecordPage() {
        super(true);
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.f488074g5;
    }

    public final java.lang.Integer l0(r45.lc7 lc7Var) {
        if (!(1 == lc7Var.f379315e)) {
            return null;
        }
        java.util.LinkedList record_list = lc7Var.f379314d;
        kotlin.jvm.internal.o.f(record_list, "record_list");
        r45.wf7 wf7Var = (r45.wf7) kz5.n0.k0(record_list);
        if (wf7Var != null) {
            return java.lang.Integer.valueOf(wf7Var.f389142f);
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getStringExtra(dm.i4.COL_USERNAME);
        this.f89936d = stringExtra;
        if (stringExtra == null || stringExtra.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPrivacyUseRecordPage", "checkContextOnCreateEarly, username is empty");
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        setBackBtn(new dk1.a(this));
        setMMTitle(com.tencent.mm.R.string.a4_);
        ak1.f.b(this);
        ak1.f.e(this, b3.l.getColor(ak1.f.d(this), com.tencent.mm.R.color.f478491c));
        ak1.f.f(this, b3.l.getColor(ak1.f.d(this), com.tencent.mm.R.color.f478491c));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cgs);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = findViewById instanceof com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView ? (com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView) findViewById : null;
        if (loadMoreRecyclerView == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPrivacyUseRecordPage", "initContentArea, useRecordContentArea is null");
            finish();
            return;
        }
        loadMoreRecyclerView.setPadding(0, i65.a.f(ak1.f.d(this), com.tencent.mm.R.dimen.f479688cn), 0, 0);
        ak1.a aVar = new ak1.a(loadMoreRecyclerView, com.tencent.mm.R.string.a48);
        loadMoreRecyclerView.setLoadingView(aVar.f5563d);
        loadMoreRecyclerView.m1(false);
        zk1.m.f473414l.a(loadMoreRecyclerView, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : true, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        dk1.k kVar = new dk1.k();
        loadMoreRecyclerView.setAdapter(kVar);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        loadMoreRecyclerView.setOnLoadingStateChangedListener(new dk1.c(aVar, this, h0Var, kVar));
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(ak1.f.d(this), null, null, true, false, null);
        com.tencent.mm.ui.MMActivity a17 = ak1.f.a(this);
        if (a17 != null) {
            a17.keep(new dk1.d(Q));
        }
        kotlinx.coroutines.l.d(androidx.lifecycle.z.a(this), null, null, new dk1.e(this, Q, aVar, h0Var, kVar, loadMoreRecyclerView, null), 3, null);
    }
}
