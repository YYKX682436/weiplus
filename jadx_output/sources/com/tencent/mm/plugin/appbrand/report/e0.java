package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class e0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f87834b;

    public e0(java.lang.String str, java.util.LinkedList linkedList) {
        this.f87833a = str;
        this.f87834b = linkedList;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportNow, reason=");
        sb6.append(this.f87833a);
        sb6.append(", reportList.size=");
        sb6.append(this.f87834b.size());
        sb6.append(", cgi error ");
        sb6.append(obj != null ? obj.toString() : null);
        com.tencent.mars.xlog.Log.e("Luggage.AppBrandIDKeyBatchReportNew", sb6.toString());
        java.util.LinkedList linkedList = com.tencent.mm.plugin.appbrand.report.g0.f87847c;
        java.util.LinkedList linkedList2 = this.f87834b;
        synchronized (linkedList) {
            linkedList.addAll(linkedList2);
        }
        this.f87834b.clear();
    }
}
