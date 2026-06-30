package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class d00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.g00 f106525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn5.a f106526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.e f106527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f106528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f106529h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f106530i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList f106531m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d00(com.tencent.mm.plugin.finder.feed.g00 g00Var, rn5.a aVar, com.tencent.mm.plugin.finder.feed.model.e eVar, boolean z17, boolean z18, java.util.List list, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList) {
        super(0);
        this.f106525d = g00Var;
        this.f106526e = aVar;
        this.f106527f = eVar;
        this.f106528g = z17;
        this.f106529h = z18;
        this.f106530i = list;
        this.f106531m = copyOnWriteArrayList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean d17 = com.tencent.mm.plugin.finder.assist.n3.f102399a.d();
        com.tencent.mm.plugin.finder.feed.g00 g00Var = this.f106525d;
        g00Var.f106803h = false;
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.c00(d17, this.f106525d, g00Var.d().P6(), this.f106526e, this.f106527f, this.f106528g, this.f106529h, this.f106530i, this.f106531m));
        return jz5.f0.f302826a;
    }
}
