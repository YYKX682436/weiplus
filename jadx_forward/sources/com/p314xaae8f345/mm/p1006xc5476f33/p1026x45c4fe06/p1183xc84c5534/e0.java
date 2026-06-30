package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class e0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f169367b;

    public e0(java.lang.String str, java.util.LinkedList linkedList) {
        this.f169366a = str;
        this.f169367b = linkedList;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportNow, reason=");
        sb6.append(this.f169366a);
        sb6.append(", reportList.size=");
        sb6.append(this.f169367b.size());
        sb6.append(", cgi error ");
        sb6.append(obj != null ? obj.toString() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandIDKeyBatchReportNew", sb6.toString());
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g0.f169380c;
        java.util.LinkedList linkedList2 = this.f169367b;
        synchronized (linkedList) {
            linkedList.addAll(linkedList2);
        }
        this.f169367b.clear();
    }
}
