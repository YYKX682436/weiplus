package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class kv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f107254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f107255e;

    public kv(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, boolean z17) {
        this.f107254d = refreshLoadMoreLayout;
        this.f107255e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f107254d.L(this.f107255e);
    }
}
