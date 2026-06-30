package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class sf implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.uf f108985d;

    public sf(com.tencent.mm.plugin.finder.feed.uf ufVar) {
        this.f108985d = ufVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        this.f108985d.c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        this.f108985d.e();
    }
}
