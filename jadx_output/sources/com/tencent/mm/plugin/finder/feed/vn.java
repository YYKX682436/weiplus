package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class vn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f110916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.co f110917e;

    public vn(java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.feed.co coVar) {
        this.f110916d = arrayList;
        this.f110917e = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("extra_poi_list", this.f110916d);
        com.tencent.mm.plugin.finder.feed.co coVar = this.f110917e;
        coVar.f106174d.setResult(-1, intent);
        coVar.f106174d.finish();
    }
}
