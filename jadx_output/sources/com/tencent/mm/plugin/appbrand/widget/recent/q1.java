package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.r1 f92040d;

    public q1(com.tencent.mm.plugin.appbrand.widget.recent.r1 r1Var) {
        this.f92040d = r1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView;
        com.tencent.mm.plugin.appbrand.widget.recent.r1 r1Var;
        ((java.util.ArrayList) this.f92040d.f92046h.f91908f2).clear();
        ((java.util.ArrayList) this.f92040d.f92046h.f91912j2).clear();
        com.tencent.mm.plugin.appbrand.widget.recent.r1 r1Var2 = this.f92040d;
        ((java.util.ArrayList) r1Var2.f92046h.f91908f2).addAll(r1Var2.f92043e);
        com.tencent.mm.plugin.appbrand.widget.recent.r1 r1Var3 = this.f92040d;
        ((java.util.ArrayList) r1Var3.f92046h.f91912j2).addAll(r1Var3.f92044f);
        ((java.util.ArrayList) this.f92040d.f92043e).clear();
        ((java.util.ArrayList) this.f92040d.f92044f).clear();
        if (this.f92040d.f92046h.getRefreshListener() != null) {
            com.tencent.mm.plugin.appbrand.widget.recent.r1 r1Var4 = this.f92040d;
            if (r1Var4.f92045g) {
                r1Var4.f92046h.getRefreshListener().b(((java.util.ArrayList) this.f92040d.f92046h.f91908f2).size());
            }
        }
        com.tencent.mm.plugin.appbrand.widget.recent.r1 r1Var5 = this.f92040d;
        if (r1Var5.f92045g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandRecentView", "refresh done dispatch diffResult, mType: %s", r1Var5.f92046h.f91913k2);
            com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView2 = this.f92040d.f92046h;
            if (baseAppBrandRecentView2.f91913k2 == com.tencent.mm.plugin.appbrand.widget.recent.l0.RECENT_APP_BRAND) {
                baseAppBrandRecentView2.getAdapter().notifyDataSetChanged();
            } else {
                baseAppBrandRecentView2.getAdapter().notifyDataSetChanged();
            }
        }
        synchronized (this.f92040d.f92046h.f91914l2) {
            baseAppBrandRecentView = this.f92040d.f92046h;
            baseAppBrandRecentView.f91915m2 = false;
        }
        synchronized (baseAppBrandRecentView.f91914l2) {
            if (baseAppBrandRecentView.f91917o2.size() > 0 && (r1Var = (com.tencent.mm.plugin.appbrand.widget.recent.r1) baseAppBrandRecentView.f91917o2.poll()) != null) {
                baseAppBrandRecentView.f91916n2.postToWorker(r1Var);
            }
        }
    }
}
