package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102188e;

    public g3(java.lang.String str, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f102187d = str;
        this.f102188e = baseFinderFeed;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        ya2.g gVar = ya2.h.f460484a;
        if (gVar.b(this.f102187d) != null || (contact = this.f102188e.getFeedObject().getFeedObject().getContact()) == null) {
            return;
        }
        ya2.g.m(gVar, contact, false, 2, null);
    }
}
