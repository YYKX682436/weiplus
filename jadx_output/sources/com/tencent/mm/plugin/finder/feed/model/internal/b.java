package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class b implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f107959a;

    public b(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader) {
        this.f107959a = baseFeedLoader;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        this.f107959a.getDispatcher().c(i17, i18, obj);
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        this.f107959a.getDispatcher().d(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        this.f107959a.getDispatcher().e(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
    }
}
