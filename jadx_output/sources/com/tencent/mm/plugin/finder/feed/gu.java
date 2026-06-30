package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class gu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f106863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f106864e;

    public gu(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, boolean z17) {
        this.f106863d = refreshLoadMoreLayout;
        this.f106864e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f106863d.L(this.f106864e);
    }
}
