package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class d0 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f169362b;

    public d0(java.lang.String str, java.util.LinkedList linkedList) {
        this.f169361a = str;
        this.f169362b = linkedList;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportNow, reason=");
        sb6.append(this.f169361a);
        sb6.append(", reportList.size=");
        java.util.LinkedList linkedList = this.f169362b;
        sb6.append(linkedList.size());
        sb6.append(", cgi back ok");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandIDKeyBatchReportNew", sb6.toString());
        linkedList.clear();
    }
}
