package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public abstract class d implements com.tencent.mm.plugin.finder.convert.r0, com.tencent.mm.plugin.finder.convert.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final in5.s0 f103103d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed f103104e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f103105f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f103106g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.BaseFinderColumnCardLayoutHelper$FeedChangeListener f103107h;

    public d(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed currentItem) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(currentItem, "currentItem");
        this.f103103d = holder;
        this.f103104e = currentItem;
        this.f103105f = jz5.h.b(com.tencent.mm.plugin.finder.convert.b.f102913d);
        this.f103106g = jz5.h.b(com.tencent.mm.plugin.finder.convert.c.f103009d);
        this.f103107h = new com.tencent.mm.plugin.finder.convert.BaseFinderColumnCardLayoutHelper$FeedChangeListener(new java.lang.ref.WeakReference(this));
    }

    @Override // com.tencent.mm.plugin.finder.convert.r0
    public void a() {
        com.tencent.mm.plugin.finder.convert.BaseFinderColumnCardLayoutHelper$FeedChangeListener baseFinderColumnCardLayoutHelper$FeedChangeListener = this.f103107h;
        if (!(baseFinderColumnCardLayoutHelper$FeedChangeListener instanceof com.tencent.mm.plugin.finder.convert.BaseFinderColumnCardLayoutHelper$FeedChangeListener)) {
            baseFinderColumnCardLayoutHelper$FeedChangeListener = null;
        }
        if (baseFinderColumnCardLayoutHelper$FeedChangeListener != null) {
            baseFinderColumnCardLayoutHelper$FeedChangeListener.dead();
            baseFinderColumnCardLayoutHelper$FeedChangeListener.f102821d.clear();
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.s0
    public abstract void b();
}
