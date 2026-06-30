package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f108284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f108285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(java.util.List list, kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f108284d = list;
        this.f108285e = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f108284d.indexOf(it) > this.f108285e.f310116d);
    }
}
