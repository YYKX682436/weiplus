package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class AppBrandRecentTaskView extends com.tencent.mm.plugin.appbrand.widget.recent.AppBrandBaseTaskView {

    /* renamed from: o, reason: collision with root package name */
    public static final l01.r f91876o = new l01.n0();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f91877g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskRecyclerView f91878h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.e0 f91879i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskRecyclerView f91880m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.b0 f91881n;

    public AppBrandRecentTaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91877g = new java.util.ArrayList();
        a();
    }

    public void a() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488102dz2, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, -2));
        this.f91878h = (com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskRecyclerView) inflate.findViewById(com.tencent.mm.R.id.f483206se4);
        this.f91880m = (com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskRecyclerView) inflate.findViewById(com.tencent.mm.R.id.f483205se3);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandRecentTaskView", "isAppBrandTaskViewExpt6:%b", java.lang.Boolean.valueOf(com.tencent.mm.plugin.appbrand.widget.recent.y0.b()));
        this.f91878h.setLayoutManager(new com.tencent.mm.plugin.appbrand.widget.recent.z(this, getContext(), com.tencent.mm.plugin.appbrand.widget.recent.y0.b() ? 2 : 3, 1, false));
        com.tencent.mm.plugin.appbrand.widget.recent.e0 e0Var = new com.tencent.mm.plugin.appbrand.widget.recent.e0(this);
        this.f91879i = e0Var;
        this.f91878h.setAdapter(e0Var);
        this.f91878h.g1(getContext(), i65.a.B(getContext()));
        this.f91878h.setLineGap(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479688cn));
        this.f91881n = new com.tencent.mm.plugin.appbrand.widget.recent.b0(this);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_recent_use_new, 0) == 5) {
            this.f91878h.setVisibility(8);
            this.f91880m.setVisibility(0);
            this.f91880m.setLayoutManager(new com.tencent.mm.plugin.appbrand.widget.recent.a0(this, getContext(), 4, 1, false));
            this.f91880m.setAdapter(this.f91881n);
            this.f91880m.g1(getContext(), i65.a.B(getContext()));
            this.f91880m.setLineGap(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv));
        }
    }

    public int getCount() {
        return this.f91877g.size();
    }

    public void setData(java.util.List<com.tencent.mm.plugin.appbrand.widget.recent.z0> list) {
        java.util.ArrayList arrayList = this.f91877g;
        arrayList.clear();
        if (list == null || list.isEmpty()) {
            setVisibility(8);
        } else {
            arrayList.addAll(list);
            setVisibility(0);
        }
        this.f91879i.notifyDataSetChanged();
        this.f91881n.notifyDataSetChanged();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandRecentTaskView", "setData size:%d", objArr);
    }

    public AppBrandRecentTaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91877g = new java.util.ArrayList();
        a();
    }
}
