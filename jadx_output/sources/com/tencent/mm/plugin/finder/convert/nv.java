package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class nv extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ew f104127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f104129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f104130g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f104131h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f104132i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(com.tencent.mm.plugin.finder.convert.ew ewVar, in5.s0 s0Var, int i17, int i18, boolean z17, java.util.List list) {
        super(1);
        this.f104127d = ewVar;
        this.f104128e = s0Var;
        this.f104129f = i17;
        this.f104130g = i18;
        this.f104131h = z17;
        this.f104132i = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.ys it = (com.tencent.mm.plugin.finder.feed.ys) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!it.f111194f.isEmpty()) {
            this.f104127d.h(this.f104128e, it, this.f104129f, this.f104130g, this.f104131h, this.f104132i);
        }
        return jz5.f0.f302826a;
    }
}
