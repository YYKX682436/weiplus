package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class e1 implements fs2.a, im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f106612d;

    /* renamed from: e, reason: collision with root package name */
    public final ir2.a1 f106613e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.s1 f106614f;

    /* renamed from: g, reason: collision with root package name */
    public ir2.z1 f106615g;

    /* renamed from: h, reason: collision with root package name */
    public final cs2.i f106616h;

    public e1(com.tencent.mm.ui.MMActivity context, int i17, int i18, ir2.a1 feedLoader) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        this.f106612d = context;
        this.f106613e = feedLoader;
        this.f106616h = new cs2.i(context, i18);
    }

    @Override // im5.b
    public void keep(im5.a aVar) {
    }
}
