package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class r1 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f92043e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f92044f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f92045g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView f92046h;

    public r1(com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView, boolean z17) {
        this.f92046h = baseAppBrandRecentView;
        this.f92045g = true;
        this.f92045g = z17;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "MicroMsg.BaseAppBrandRecentView";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView;
        java.util.List<com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo> list;
        synchronized (this.f92046h.f91914l2) {
            baseAppBrandRecentView = this.f92046h;
            baseAppBrandRecentView.f91915m2 = true;
        }
        com.tencent.mm.plugin.appbrand.widget.recent.i0 i0Var = baseAppBrandRecentView.f91918p2;
        if (i0Var != null) {
            int loadCount = baseAppBrandRecentView.getLoadCount();
            ((com.tencent.mm.plugin.appbrand.widget.recent.k1) i0Var).getClass();
            list = ((com.tencent.mm.plugin.appbrand.appusage.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.b6.class)).t0(loadCount);
        } else {
            list = null;
        }
        ((java.util.ArrayList) this.f92043e).clear();
        ((java.util.ArrayList) this.f92044f).clear();
        if (list != null) {
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo scene = this.f92046h.getSceneFactory() != null ? this.f92046h.getSceneFactory().getScene() : null;
            for (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo : list) {
                if (scene == null || !localUsageInfo.f76361d.equals(scene.f76361d) || localUsageInfo.f76363f != scene.f76363f) {
                    if (((java.util.ArrayList) this.f92043e).size() < this.f92046h.getShowCount()) {
                        ((java.util.ArrayList) this.f92043e).add(new com.tencent.mm.plugin.appbrand.widget.recent.x(localUsageInfo));
                    }
                    if (this.f92046h.f91911i2) {
                        ((java.util.ArrayList) this.f92044f).add(new com.tencent.mm.plugin.appbrand.widget.recent.x(localUsageInfo));
                    }
                    java.lang.String str = localUsageInfo.f76361d;
                    com.tencent.mm.plugin.appbrand.widget.recent.l0 l0Var = this.f92046h.f91913k2;
                }
            }
        }
        this.f92046h.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandRecentView", "[UpdateAppBrandRecentDataTask] type:%s preview size:%s, data size: %d, mType: %s", this.f92046h.getType(), java.lang.Integer.valueOf(((java.util.ArrayList) this.f92046h.f91908f2).size()), java.lang.Integer.valueOf(((java.util.ArrayList) this.f92046h.f91912j2).size()), this.f92046h.f91913k2);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.widget.recent.q1(this));
    }
}
