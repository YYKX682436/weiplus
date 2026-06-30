package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class d0 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f87829b;

    public d0(java.lang.String str, java.util.LinkedList linkedList) {
        this.f87828a = str;
        this.f87829b = linkedList;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportNow, reason=");
        sb6.append(this.f87828a);
        sb6.append(", reportList.size=");
        java.util.LinkedList linkedList = this.f87829b;
        sb6.append(linkedList.size());
        sb6.append(", cgi back ok");
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandIDKeyBatchReportNew", sb6.toString());
        linkedList.clear();
    }
}
