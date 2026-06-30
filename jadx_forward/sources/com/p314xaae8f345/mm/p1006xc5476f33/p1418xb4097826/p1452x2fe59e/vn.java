package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class vn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f192449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co f192450e;

    public vn(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co coVar) {
        this.f192449d = arrayList;
        this.f192450e = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("extra_poi_list", this.f192449d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co coVar = this.f192450e;
        coVar.f187707d.setResult(-1, intent);
        coVar.f187707d.finish();
    }
}
