package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f108797e;

    public q4(com.tencent.mm.plugin.finder.feed.a7 a7Var, android.view.View view) {
        this.f108796d = a7Var;
        this.f108797e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.a7.A(this.f108796d, this.f108797e);
    }
}
