package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class vm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ym f110914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f110915e;

    public vm(com.tencent.mm.plugin.finder.feed.ym ymVar, boolean z17) {
        this.f110914d = ymVar;
        this.f110915e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110914d.f106180m.L(this.f110915e);
    }
}
