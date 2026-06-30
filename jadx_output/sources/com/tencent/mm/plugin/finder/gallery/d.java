package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.gallery.b f111359b = new com.tencent.mm.plugin.finder.gallery.b(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.gallery.a f111360a;

    public d(com.tencent.mm.plugin.finder.gallery.a data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f111360a = data;
    }

    public abstract in5.s a(int i17);

    public abstract boolean b();

    public abstract void c(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, int i17, int i18);

    public abstract boolean d();

    public abstract androidx.recyclerview.widget.p2 e(int i17);

    public abstract androidx.recyclerview.widget.RecyclerView.LayoutManager f(android.content.Context context, int i17);

    public abstract int g();

    public abstract void h(com.tencent.mm.ui.MMActivity mMActivity, int i17, int i18, android.content.Intent intent, com.tencent.mm.plugin.finder.gallery.c cVar);

    public abstract void i(com.tencent.mm.ui.MMActivity mMActivity, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.util.List list, com.tencent.mm.protobuf.g gVar, boolean z17);

    public abstract void j();
}
